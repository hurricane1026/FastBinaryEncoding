//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.10.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.protoex.fbe

// Fast Binary Encoding com.chronoxor.protoex receiver listener interface
interface IReceiverListener : com.chronoxor.proto.fbe.IReceiverListener
{
    fun onReceive(value: com.chronoxor.protoex.OrderMessage) {}
    fun onReceive(value: com.chronoxor.protoex.BalanceMessage) {}
    fun onReceive(value: com.chronoxor.protoex.AccountMessage) {}
}
