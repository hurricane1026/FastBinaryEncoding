// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

@file:Suppress("UnusedImport", "unused")

package enums

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*

@Suppress("EnumEntryName", "MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
enum class EnumUInt8Enum
{
    ENUM_VALUE_0(0u + 0u)
    , ENUM_VALUE_1(0u + 0u)
    , ENUM_VALUE_2(0u + 1u)
    , ENUM_VALUE_3(254u + 0u)
    , ENUM_VALUE_4(254u + 1u)
    , ENUM_VALUE_5(ENUM_VALUE_3.raw)
    ;

    var raw: UByte = 0u
        private set

    constructor(value: UByte) { this.raw = value.toUByte() }
    constructor(value: UShort) { this.raw = value.toUByte() }
    constructor(value: UInt) { this.raw = value.toUByte() }
    constructor(value: ULong) { this.raw = value.toUByte() }
    constructor(value: EnumUInt8Enum) { this.raw = value.raw }

    override fun toString(): String
    {
        if (this == ENUM_VALUE_0) return "ENUM_VALUE_0"
        if (this == ENUM_VALUE_1) return "ENUM_VALUE_1"
        if (this == ENUM_VALUE_2) return "ENUM_VALUE_2"
        if (this == ENUM_VALUE_3) return "ENUM_VALUE_3"
        if (this == ENUM_VALUE_4) return "ENUM_VALUE_4"
        if (this == ENUM_VALUE_5) return "ENUM_VALUE_5"
        return "<unknown>"
    }

    companion object
    {
        private val mapping = HashMap<UByte, EnumUInt8Enum>()

        init
        {
            for (value in EnumUInt8Enum.values())
                mapping[value.raw] = value
        }

        fun mapValue(value: UByte): EnumUInt8Enum? { return mapping[value] }
    }
}
