// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: simple.fbe
// Version: 1.7.0.0

#include "simple_ptr.h"

namespace simple {

Simple::Simple()
    : info()
    , simple(nullptr)
    , depth((int32_t)0ll)
    , spv()
    , sv()
    , spm()
    , sm()
{}

Simple::Simple(const std::string& arg_info, std::unique_ptr<::simple::Simple> arg_simple, int32_t arg_depth, std::vector<std::unique_ptr<::simple::Simple>> arg_spv, std::vector<::simple::Simple> arg_sv, std::map<int32_t, std::unique_ptr<::simple::Simple>> arg_spm, std::map<int32_t, ::simple::Simple> arg_sm)
    : info(arg_info)
    , simple(arg_simple.release())
    , depth(arg_depth)
    , spv()
    , sv(std::move(arg_sv))
    , spm()
    , sm(std::move(arg_sm))
{
    for (auto& it : arg_spv)
        spv.emplace_back(it.release());
    for (auto& it: arg_spm)
        spm.emplace(it.first, it.second.release());
}

Simple::Simple(Simple&& other)
    : info(std::move(other.info))
    , simple(std::exchange(other.simple, nullptr))
    , depth(std::exchange(other.depth, (int32_t)0ll))
    , spv(std::move(other.spv))
    , sv(std::move(other.sv))
    , spm(std::move(other.spm))
    , sm(std::move(other.sm))
{}

Simple::~Simple()
{
    if (simple) delete simple;
    for (auto& it : spv)
        delete it;
    for (auto& it: spm)
        delete it.second;
}

bool Simple::operator==([[maybe_unused]] const Simple& other) const noexcept
{
    return (
        true
        );
}

bool Simple::operator<([[maybe_unused]] const Simple& other) const noexcept
{
    return false;
}

Simple& Simple::operator=(Simple&& other)
{
    if (this != &other)
    {
        info = std::move(other.info);
        simple = std::exchange(other.simple, nullptr);
        depth = std::exchange(other.depth, (int32_t)0ll);
        spv = std::move(other.spv);
        sv = std::move(other.sv);
        spm = std::move(other.spm);
        sm = std::move(other.sm);
    }
    return *this;
}

void Simple::swap(Simple& other) noexcept
{
    using std::swap;
    swap(info, other.info);
    swap(simple, other.simple);
    swap(depth, other.depth);
    swap(spv, other.spv);
    swap(sv, other.sv);
    swap(spm, other.spm);
    swap(sm, other.sm);
}

std::ostream& operator<<(std::ostream& stream, const Simple& value)
{
    stream << "Simple(";
    stream << "info="; stream << "\"" << value.info << "\"";
    stream << ",simple="; stream << " ptr of other struct" << (value.simple == nullptr ? "true" : "false");
    stream << ",depth="; stream << value.depth;
    {
        bool first = true;
        stream << ",spv=[" << value.spv.size() << "][";
        for (const auto& it : value.spv)
        {
            stream << std::string(first ? "" : ",") << " ptr of other struct" << (it == nullptr ? "true" : "false");
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",sv=[" << value.sv.size() << "][";
        for (const auto& it : value.sv)
        {
            stream << std::string(first ? "" : ",") << it;
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",spm=[" << value.spm.size()<< "]<{";
        for (const auto& it : value.spm)
        {
            stream << std::string(first ? "" : ",") << it.first;
            stream << "->";
            stream << " ptr of other struct" << (it.second == nullptr ? "true" : "false");
            first = false;
        }
        stream << "}>";
    }
    {
        bool first = true;
        stream << ",sm=[" << value.sm.size()<< "]<{";
        for (const auto& it : value.sm)
        {
            stream << std::string(first ? "" : ",") << it.first;
            stream << "->";
            stream << it.second;
            first = false;
        }
        stream << "}>";
    }
    stream << ")";
    return stream;
}

} // namespace simple
