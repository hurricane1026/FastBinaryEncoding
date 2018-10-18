// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package protoex;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import proto.*;

public class Balance extends proto.Balance
{
    public double locked = (double)0.0d;

    public Balance() {}

    public Balance(proto.Balance parent, double locked)
    {
        super(parent);
        this.locked = locked;
    }

    public Balance(Balance other)
    {
        super(other);
        this.locked = other.locked;
    }

    public Balance clone()
    {
        // Serialize the struct to the FBE stream
        var writer = new protoex.fbe.BalanceModel();
        writer.serialize(this);

        // Deserialize the struct from the FBE stream
        var reader = new protoex.fbe.BalanceModel();
        reader.attach(writer.getBuffer());
        return reader.deserialize();
    }

    @Override
    public int compareTo(Object other)
    {
        if (other == null)
            return -1;

        if (!Balance.class.isAssignableFrom(other.getClass()))
            return -1;

        final Balance obj = (Balance)other;

        int result = 0;
        result = super.compareTo(obj);
        if (result != 0)
            return result;
        return result;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!Balance.class.isAssignableFrom(other.getClass()))
            return false;

        final Balance obj = (Balance)other;

        if (!super.equals(obj))
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + super.hashCode();
        return hash;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        sb.append("Balance(");
        sb.append(super.toString());
        sb.append(",locked="); sb.append(locked);
        sb.append(")");
        return sb.toString();
    }

    public String toJson() { return protoex.fbe.Json.getEngine().toJson(this); }
    public static Balance fromJson(String json) { return protoex.fbe.Json.getEngine().fromJson(json, Balance.class); }
}
