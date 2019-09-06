// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.3.0.0

import Foundation
import ChronoxorFbe

open class BalanceMessage: Comparable, Hashable, Codable {
    public var body: Balance = ChronoxorProto.Balance()

    public init() {}
    public init(body: Balance) {

        self.body = body
    }

    public init(other: BalanceMessage) {
        self.body = other.body
    }

    public required init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        body = try container.decode(ChronoxorProto.Balance.self, forKey: .body)
    }

    open func clone() throws -> BalanceMessage {
        // Serialize the struct to the FBE stream
        let writer = BalanceMessageModel()
        try _ = writer.serialize(value: self)

        // Deserialize the struct from the FBE stream
        let reader = BalanceMessageModel()
        reader.attach(buffer: writer.buffer)
        return reader.deserialize()
    }

    public static func < (lhs: BalanceMessage, rhs: BalanceMessage) -> Bool {
        return true
    }

    public static func == (lhs: BalanceMessage, rhs: BalanceMessage) -> Bool {
        return true
    }

    open func hash(into hasher: inout Hasher) {
    }

    open var description: String {
        var sb = String()
        sb.append("BalanceMessage(")
        sb.append("body="); sb.append(body.description)
        sb.append(")")
        return sb
    }
    private enum CodingKeys: String, CodingKey {
        case body
    }

    open func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(body, forKey: .body)
    }

    open func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    open class func fromJson(_ json: String) -> BalanceMessage {
        return try! JSONDecoder().decode(BalanceMessage.self, from: json.data(using: .utf8)!)
    }
}