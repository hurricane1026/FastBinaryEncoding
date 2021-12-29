// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.7.0.0

#pragma once

#ifdef isset
#undef isset
#endif

#if defined(__clang__)
#pragma clang system_header
#elif defined(__GNUC__)
#pragma GCC system_header
#elif defined(_MSC_VER)
#pragma system_header
#endif

#include "fbe_json.h"

#include "proto.h"

namespace FBE {

namespace JSON {

template <class TWriter>
struct ValueWriter<TWriter, ::proto::OrderSide>
{
    static bool to_json(TWriter& writer, const ::proto::OrderSide& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (uint8_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::proto::OrderSide>
{
    static bool from_json(const TJson& json, ::proto::OrderSide& value)
    {
        uint8_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::proto::OrderSide)raw;
        return true;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::proto::OrderType>
{
    static bool to_json(TWriter& writer, const ::proto::OrderType& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (uint8_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::proto::OrderType>
{
    static bool from_json(const TJson& json, ::proto::OrderType& value)
    {
        uint8_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::proto::OrderType)raw;
        return true;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::proto::State>
{
    static bool to_json(TWriter& writer, const ::proto::State& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (uint8_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::proto::State>
{
    static bool from_json(const TJson& json, ::proto::State& value)
    {
        uint8_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::proto::State)raw;
        return true;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::proto::Order>
{
    static bool to_json(TWriter& writer, const ::proto::Order& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json_key(writer, "id") || !FBE::JSON::to_json(writer, value.id, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "symbol") || !FBE::JSON::to_json(writer, value.symbol, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "side") || !FBE::JSON::to_json(writer, value.side, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "type") || !FBE::JSON::to_json(writer, value.type, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "price") || !FBE::JSON::to_json(writer, value.price, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "volume") || !FBE::JSON::to_json(writer, value.volume, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::proto::Order>
{
    static bool from_json(const TJson& json, ::proto::Order& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, value.id, "id");
        result &= FBE::JSON::from_json(json, value.symbol, "symbol");
        result &= FBE::JSON::from_json(json, value.side, "side");
        result &= FBE::JSON::from_json(json, value.type, "type");
        result &= FBE::JSON::from_json(json, value.price, "price");
        result &= FBE::JSON::from_json(json, value.volume, "volume");
        return result;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::proto::Balance>
{
    static bool to_json(TWriter& writer, const ::proto::Balance& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json_key(writer, "currency") || !FBE::JSON::to_json(writer, value.currency, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "amount") || !FBE::JSON::to_json(writer, value.amount, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::proto::Balance>
{
    static bool from_json(const TJson& json, ::proto::Balance& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, value.currency, "currency");
        result &= FBE::JSON::from_json(json, value.amount, "amount");
        return result;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::proto::Account>
{
    static bool to_json(TWriter& writer, const ::proto::Account& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json_key(writer, "id") || !FBE::JSON::to_json(writer, value.id, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "name") || !FBE::JSON::to_json(writer, value.name, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "state") || !FBE::JSON::to_json(writer, value.state, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "wallet") || !FBE::JSON::to_json(writer, value.wallet, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "asset") || !FBE::JSON::to_json(writer, value.asset, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "orders") || !FBE::JSON::to_json(writer, value.orders, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::proto::Account>
{
    static bool from_json(const TJson& json, ::proto::Account& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, value.id, "id");
        result &= FBE::JSON::from_json(json, value.name, "name");
        result &= FBE::JSON::from_json(json, value.state, "state");
        result &= FBE::JSON::from_json(json, value.wallet, "wallet");
        result &= FBE::JSON::from_json(json, value.asset, "asset");
        result &= FBE::JSON::from_json(json, value.orders, "orders");
        return result;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::proto::OrderMessage>
{
    static bool to_json(TWriter& writer, const ::proto::OrderMessage& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json_key(writer, "body") || !FBE::JSON::to_json(writer, value.body, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::proto::OrderMessage>
{
    static bool from_json(const TJson& json, ::proto::OrderMessage& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, value.body, "body");
        return result;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::proto::BalanceMessage>
{
    static bool to_json(TWriter& writer, const ::proto::BalanceMessage& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json_key(writer, "body") || !FBE::JSON::to_json(writer, value.body, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::proto::BalanceMessage>
{
    static bool from_json(const TJson& json, ::proto::BalanceMessage& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, value.body, "body");
        return result;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::proto::AccountMessage>
{
    static bool to_json(TWriter& writer, const ::proto::AccountMessage& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json_key(writer, "body") || !FBE::JSON::to_json(writer, value.body, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::proto::AccountMessage>
{
    static bool from_json(const TJson& json, ::proto::AccountMessage& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, value.body, "body");
        return result;
    }
};

} // namespace JSON

} // namespace FBE
