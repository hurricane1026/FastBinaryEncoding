// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

@file:Suppress("UnusedImport", "unused")

package proto

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
open class Account : Comparable<Any?>
{
    var uid: Int = 0
    var name: String = ""
    var state: State = State.fromSet(EnumSet.of(State.initialized.value, State.bad.value))
    var wallet: Balance = Balance()
    var asset: Balance? = null
    var orders: ArrayList<Order> = ArrayList()

    constructor()

    constructor(uid: Int, name: String, state: State, wallet: Balance, asset: Balance?, orders: ArrayList<Order>)
    {
        this.uid = uid
        this.name = name
        this.state = state
        this.wallet = wallet
        this.asset = asset
        this.orders = orders
    }

    constructor(other: Account)
    {
        this.uid = other.uid
        this.name = other.name
        this.state = other.state
        this.wallet = other.wallet
        this.asset = other.asset
        this.orders = other.orders
    }

    open fun clone(): Account
    {
        // Serialize the struct to the FBE stream
        val writer = proto.fbe.AccountModel()
        writer.serialize(this)

        // Deserialize the struct from the FBE stream
        val reader = proto.fbe.AccountModel()
        reader.attach(writer.buffer)
        return reader.deserialize()
    }

    override fun compareTo(other: Any?): Int
    {
        if (other == null)
            return -1

        if (!Account::class.java.isAssignableFrom(other.javaClass))
            return -1

        @Suppress("UNUSED_VARIABLE")
        val obj = other as Account? ?: return -1

        @Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER", "CanBeVal", "UnnecessaryVariable")
        var result = 0
        result = uid.compareTo(obj.uid)
        if (result != 0)
            return result
        return result
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!Account::class.java.isAssignableFrom(other.javaClass))
            return false

        @Suppress("UNUSED_VARIABLE")
        val obj = other as Account? ?: return false

        if (uid != obj.uid)
            return false
        return true
    }

    override fun hashCode(): Int
    {
        @Suppress("CanBeVal", "UnnecessaryVariable")
        var hash = 17
        hash = hash * 31 + uid.hashCode()
        return hash
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        sb.append("Account(")
        sb.append("uid="); sb.append(uid)
        sb.append(",name="); sb.append("\"").append(name).append("\"")
        sb.append(",state="); sb.append(state)
        sb.append(",wallet="); sb.append(wallet)
        sb.append(",asset="); if (asset != null) sb.append(asset!!); else sb.append("null")
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",orders=[").append(orders.size).append("][")
            for (item in orders)
            {
                sb.append(if (first) "" else ",").append(item)
                first = false
            }
            sb.append("]")
        }
        sb.append(")")
        return sb.toString()
    }

    open fun toJson(): String = proto.fbe.Json.engine.toJson(this)
    companion object
    {
        fun fromJson(json: String): Account = proto.fbe.Json.engine.fromJson(json, Account::class.java)
    }
}
