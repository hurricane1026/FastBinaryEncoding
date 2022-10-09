//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: osa.fbe
// FBE version: 1.10.0.0
//------------------------------------------------------------------------------

import Foundation

public struct Sex: Comparable, Hashable, Codable {
    typealias RawValue = Int32
    public static let male = Sex(value: SexEnum.male)
    public static let female = Sex(value: SexEnum.female)

    var value: SexEnum?

    public var raw: Int32 { return value!.rawValue }

    public init() { setDefault() }
    public init(value: Int32) { setEnum(value: value) }
    public init(value: SexEnum) { setEnum(value: value) }
    public init(value: Sex) { setEnum(value: value) }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        setEnum(value: try container.decode(RawValue.self))
    }
    public mutating func setDefault() { setEnum(value: NSNumber(value: 0).int32Value) }

    public mutating func setEnum(value: Int32) { self.value = SexEnum.mapValue(value: value) }
    public mutating func setEnum(value: SexEnum) { self.value = value }
    public mutating func setEnum(value: Sex) { self.value = value.value }

    public static func < (lhs: Sex, rhs: Sex) -> Bool {
        guard let lhsValue = lhs.value, let rhsValue = rhs.value else {
            return false
            }
        return lhsValue.rawValue < rhsValue.rawValue
    }

    public static func == (lhs: Sex, rhs: Sex) -> Bool {
        guard let lhsValue = lhs.value, let rhsValue = rhs.value else {
            return false
            }
        return lhsValue.rawValue == rhsValue.rawValue
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(value?.rawValue ?? 0)
    }

    public var description: String {
        return value?.description ?? "<unknown>"
    }
    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        try container.encode(raw)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> Sex {
        return try JSONDecoder().decode(Sex.self, from: json.data(using: .utf8)!)
    }
}