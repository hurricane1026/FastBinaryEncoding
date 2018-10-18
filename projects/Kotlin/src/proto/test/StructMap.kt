// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

@file:Suppress("UnusedImport", "unused")

package test

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import proto.*

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
open class StructMap : Comparable<Any?>
{
    var f1: TreeMap<Int, Byte> = TreeMap()
    var f2: TreeMap<Int, Byte?> = TreeMap()
    var f3: TreeMap<Int, ByteArray> = TreeMap()
    var f4: TreeMap<Int, ByteArray?> = TreeMap()
    var f5: TreeMap<Int, EnumSimple> = TreeMap()
    var f6: TreeMap<Int, EnumSimple?> = TreeMap()
    var f7: TreeMap<Int, FlagsSimple> = TreeMap()
    var f8: TreeMap<Int, FlagsSimple?> = TreeMap()
    var f9: TreeMap<Int, StructSimple> = TreeMap()
    var f10: TreeMap<Int, StructSimple?> = TreeMap()

    constructor()

    constructor(f1: TreeMap<Int, Byte>, f2: TreeMap<Int, Byte?>, f3: TreeMap<Int, ByteArray>, f4: TreeMap<Int, ByteArray?>, f5: TreeMap<Int, EnumSimple>, f6: TreeMap<Int, EnumSimple?>, f7: TreeMap<Int, FlagsSimple>, f8: TreeMap<Int, FlagsSimple?>, f9: TreeMap<Int, StructSimple>, f10: TreeMap<Int, StructSimple?>)
    {
        this.f1 = f1
        this.f2 = f2
        this.f3 = f3
        this.f4 = f4
        this.f5 = f5
        this.f6 = f6
        this.f7 = f7
        this.f8 = f8
        this.f9 = f9
        this.f10 = f10
    }

    constructor(other: StructMap)
    {
        this.f1 = other.f1
        this.f2 = other.f2
        this.f3 = other.f3
        this.f4 = other.f4
        this.f5 = other.f5
        this.f6 = other.f6
        this.f7 = other.f7
        this.f8 = other.f8
        this.f9 = other.f9
        this.f10 = other.f10
    }

    open fun clone(): StructMap
    {
        // Serialize the struct to the FBE stream
        val writer = test.fbe.StructMapModel()
        writer.serialize(this)

        // Deserialize the struct from the FBE stream
        val reader = test.fbe.StructMapModel()
        reader.attach(writer.buffer)
        return reader.deserialize()
    }

    override fun compareTo(other: Any?): Int
    {
        if (other == null)
            return -1

        if (!StructMap::class.java.isAssignableFrom(other.javaClass))
            return -1

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructMap? ?: return -1

        @Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER", "CanBeVal", "UnnecessaryVariable")
        var result = 0
        return result
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!StructMap::class.java.isAssignableFrom(other.javaClass))
            return false

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructMap? ?: return false

        return true
    }

    override fun hashCode(): Int
    {
        @Suppress("CanBeVal", "UnnecessaryVariable")
        var hash = 17
        return hash
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        sb.append("StructMap(")
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append("f1=[").append(f1.size).append("]<{")
            for (item in f1.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                sb.append(item.value)
                first = false
            }
            sb.append("}>")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f2=[").append(f2.size).append("]<{")
            for (item in f2.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                if (item.value != null) sb.append(item.value!!); else sb.append("null")
                first = false
            }
            sb.append("}>")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f3=[").append(f3.size).append("]<{")
            for (item in f3.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                sb.append("bytes[").append(item.value.size).append("]")
                first = false
            }
            sb.append("}>")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f4=[").append(f4.size).append("]<{")
            for (item in f4.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                if (item.value != null) sb.append("bytes[").append(item.value!!.size).append("]"); else sb.append("null")
                first = false
            }
            sb.append("}>")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f5=[").append(f5.size).append("]<{")
            for (item in f5.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                sb.append(item.value)
                first = false
            }
            sb.append("}>")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f6=[").append(f6.size).append("]<{")
            for (item in f6.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                if (item.value != null) sb.append(item.value!!); else sb.append("null")
                first = false
            }
            sb.append("}>")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f7=[").append(f7.size).append("]<{")
            for (item in f7.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                sb.append(item.value)
                first = false
            }
            sb.append("}>")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f8=[").append(f8.size).append("]<{")
            for (item in f8.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                if (item.value != null) sb.append(item.value!!); else sb.append("null")
                first = false
            }
            sb.append("}>")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f9=[").append(f9.size).append("]<{")
            for (item in f9.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                sb.append(item.value)
                first = false
            }
            sb.append("}>")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f10=[").append(f10.size).append("]<{")
            for (item in f10.entries)
            {
                sb.append(if (first) "" else ",").append(item.key)
                sb.append("->")
                if (item.value != null) sb.append(item.value!!); else sb.append("null")
                first = false
            }
            sb.append("}>")
        }
        sb.append(")")
        return sb.toString()
    }

    open fun toJson(): String = test.fbe.Json.engine.toJson(this)
    companion object
    {
        fun fromJson(json: String): StructMap = test.fbe.Json.engine.fromJson(json, StructMap::class.java)
    }
}
