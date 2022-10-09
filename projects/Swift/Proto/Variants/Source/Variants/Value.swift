//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: variants.fbe
// FBE version: 1.10.0.0
//------------------------------------------------------------------------------

import Foundation
import Fbe

public protocol ValueBase {
    var v: V { get set }
}

public protocol ValueInheritance {
    var parent: Value { get set }
}

extension ValueInheritance {
    public var v: V {
        get { return parent.v }
        set { parent.v = newValue }
    }
}

public struct Value: ValueBase, Comparable, Hashable, Codable {
    public var v: V = Variants.V()

    public init() { }
    public init(v: V) {

        self.v = v
    }

    public init(other: Value) {
        self.v = other.v
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        v = try container.decode(Variants.V.self, forKey: .v)
    }

    public func clone() throws -> Value {
        // Serialize the struct to the FBE stream
        let writer = ValueModel()
        try _ = writer.serialize(value: self)

        // Deserialize the struct from the FBE stream
        let reader = ValueModel()
        reader.attach(buffer: writer.buffer)
        return reader.deserialize()
    }

    public static func < (lhs: Value, rhs: Value) -> Bool {
        return true
    }

    public static func == (lhs: Value, rhs: Value) -> Bool {
        return true
    }

    public func hash(into hasher: inout Hasher) {
    }

    public var description: String {
        var sb = String()
        sb.append("Value(")
        sb.append("v="); sb.append(v.description)
        sb.append(")")
        return sb
    }
    private enum CodingKeys: String, CodingKey {
        case v
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(v, forKey: .v)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> Value {
        return try JSONDecoder().decode(Value.self, from: json.data(using: .utf8)!)
    }
}