// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.3.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

// Fast Binary Encoding com.chronoxor.test sender
@Suppress("MemberVisibilityCanBePrivate", "PropertyName")
open class Sender : com.chronoxor.fbe.Sender
{
    // Imported senders
    val protoSender: com.chronoxor.proto.fbe.Sender

    // Sender models accessors

    constructor() : super(false)
    {
        protoSender = com.chronoxor.proto.fbe.Sender(buffer)
    }

    constructor(buffer: com.chronoxor.fbe.Buffer) : super(buffer, false)
    {
        protoSender = com.chronoxor.proto.fbe.Sender(buffer)
    }

    @Suppress("JoinDeclarationAndAssignment", "UNUSED_PARAMETER")
    fun send(obj: Any): Long
    {

        // Try to send using imported senders
        @Suppress("CanBeVal")
        var result: Long
        result = protoSender.send(obj)
        if (result > 0)
            return result

        return 0
    }


    // Send message handler
    override fun onSend(buffer: ByteArray, offset: Long, size: Long): Long { throw UnsupportedOperationException("com.chronoxor.test.fbe.Sender.onSend() not implemented!") }
}