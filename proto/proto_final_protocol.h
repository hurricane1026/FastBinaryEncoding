//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.10.0.0
//------------------------------------------------------------------------------

#pragma once

#if defined(__clang__)
#pragma clang system_header
#elif defined(__GNUC__)
#pragma GCC system_header
#elif defined(_MSC_VER)
#pragma system_header
#endif

#include "fbe_protocol.h"

#include "proto_final_models.h"

namespace FBE {

namespace proto {

// Fast Binary Encoding proto protocol version
struct ProtocolVersion
{
    // Protocol major version
    static const int major = 1;
    // Protocol minor version
    static const int minor = 0;
};

// Fast Binary Encoding proto final sender
class FinalSender : public virtual FBE::Sender
{
public:
    FinalSender()
        : OrderMessageModel(this->_buffer)
        , BalanceMessageModel(this->_buffer)
        , AccountMessageModel(this->_buffer)
    { this->final(true); }
    FinalSender(const FinalSender&) = delete;
    FinalSender(FinalSender&&) noexcept = delete;
    virtual ~FinalSender() = default;

    FinalSender& operator=(const FinalSender&) = delete;
    FinalSender& operator=(FinalSender&&) noexcept = delete;

    size_t send(const ::proto::OrderMessage& value);
    size_t send(const ::proto::BalanceMessage& value);
    size_t send(const ::proto::AccountMessage& value);

public:
    // Sender models accessors
    FBE::proto::OrderMessageFinalModel OrderMessageModel;
    FBE::proto::BalanceMessageFinalModel BalanceMessageModel;
    FBE::proto::AccountMessageFinalModel AccountMessageModel;
};

// Fast Binary Encoding proto final receiver
class FinalReceiver : public virtual FBE::Receiver
{
public:
    FinalReceiver() { this->final(true); }
    FinalReceiver(const FinalReceiver&) = delete;
    FinalReceiver(FinalReceiver&&) = delete;
    virtual ~FinalReceiver() = default;

    FinalReceiver& operator=(const FinalReceiver&) = delete;
    FinalReceiver& operator=(FinalReceiver&&) = delete;

protected:
    // Receive handlers
    virtual void onReceive(const ::proto::OrderMessage& value) {}
    virtual void onReceive(const ::proto::BalanceMessage& value) {}
    virtual void onReceive(const ::proto::AccountMessage& value) {}

    // Receive message handler
    bool onReceive(size_t type, const void* data, size_t size) override;

private:
    // Receiver values accessors
    ::proto::OrderMessage OrderMessageValue;
    ::proto::BalanceMessage BalanceMessageValue;
    ::proto::AccountMessage AccountMessageValue;

    // Receiver models accessors
    FBE::proto::OrderMessageFinalModel OrderMessageModel;
    FBE::proto::BalanceMessageFinalModel BalanceMessageModel;
    FBE::proto::AccountMessageFinalModel AccountMessageModel;
};

// Fast Binary Encoding proto final client
class FinalClient : public virtual FinalSender, protected virtual FinalReceiver
{
public:
    FinalClient() = default;
    FinalClient(const FinalClient&) = delete;
    FinalClient(FinalClient&&) = delete;
    virtual ~FinalClient() = default;

    FinalClient& operator=(const FinalClient&) = delete;
    FinalClient& operator=(FinalClient&&) = delete;

    // Reset client buffers
    void reset() { std::scoped_lock locker(this->_lock); reset_requests(); }

    // Watchdog for timeouts
    void watchdog(uint64_t utc) { std::scoped_lock locker(this->_lock); watchdog_requests(utc); }


protected:
    std::mutex _lock;
    uint64_t _timestamp{0};

    virtual bool onReceiveResponse(const ::proto::OrderMessage& response) { return false; }
    virtual bool onReceiveResponse(const ::proto::BalanceMessage& response) { return false; }
    virtual bool onReceiveResponse(const ::proto::AccountMessage& response) { return false; }

    virtual bool onReceiveReject(const ::proto::OrderMessage& reject) { return false; }
    virtual bool onReceiveReject(const ::proto::BalanceMessage& reject) { return false; }
    virtual bool onReceiveReject(const ::proto::AccountMessage& reject) { return false; }

    virtual void onReceiveNotify(const ::proto::OrderMessage& notify) {}
    virtual void onReceiveNotify(const ::proto::BalanceMessage& notify) {}
    virtual void onReceiveNotify(const ::proto::AccountMessage& notify) {}

    virtual void onReceive(const ::proto::OrderMessage& value) override { if (!onReceiveResponse(value) && !onReceiveReject(value)) onReceiveNotify(value); }
    virtual void onReceive(const ::proto::BalanceMessage& value) override { if (!onReceiveResponse(value) && !onReceiveReject(value)) onReceiveNotify(value); }
    virtual void onReceive(const ::proto::AccountMessage& value) override { if (!onReceiveResponse(value) && !onReceiveReject(value)) onReceiveNotify(value); }

    // Reset client requests
    virtual void reset_requests();

    // Watchdog client requests for timeouts
    virtual void watchdog_requests(uint64_t utc);
};

} // namespace proto

} // namespace FBE
