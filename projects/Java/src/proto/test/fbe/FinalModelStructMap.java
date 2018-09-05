// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package test.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;
import javafx.util.*;

import fbe.*;
import test.*;

// Fast Binary Encoding StructMap final model class
public final class FinalModelStructMap extends FinalModel
{
    public final FinalModelMapInt32Byte f1;
    public final FinalModelMapInt32OptionalByte f2;
    public final FinalModelMapInt32Bytes f3;
    public final FinalModelMapInt32OptionalBytes f4;
    public final FinalModelMapInt32EnumSimple f5;
    public final FinalModelMapInt32OptionalEnumSimple f6;
    public final FinalModelMapInt32FlagsSimple f7;
    public final FinalModelMapInt32OptionalFlagsSimple f8;
    public final FinalModelMapInt32StructSimple f9;
    public final FinalModelMapInt32OptionalStructSimple f10;

    public FinalModelStructMap(Buffer buffer, long offset)
    {
        super(buffer, offset);
        f1 = new FinalModelMapInt32Byte(buffer, 0);
        f2 = new FinalModelMapInt32OptionalByte(buffer, 0);
        f3 = new FinalModelMapInt32Bytes(buffer, 0);
        f4 = new FinalModelMapInt32OptionalBytes(buffer, 0);
        f5 = new FinalModelMapInt32EnumSimple(buffer, 0);
        f6 = new FinalModelMapInt32OptionalEnumSimple(buffer, 0);
        f7 = new FinalModelMapInt32FlagsSimple(buffer, 0);
        f8 = new FinalModelMapInt32OptionalFlagsSimple(buffer, 0);
        f9 = new FinalModelMapInt32StructSimple(buffer, 0);
        f10 = new FinalModelMapInt32OptionalStructSimple(buffer, 0);
    }

    // Get the allocation size
    public long FBEAllocationSize(StructMap fbeValue)
    {
        long fbeResult = 0
            + f1.FBEAllocationSize(fbeValue.f1)
            + f2.FBEAllocationSize(fbeValue.f2)
            + f3.FBEAllocationSize(fbeValue.f3)
            + f4.FBEAllocationSize(fbeValue.f4)
            + f5.FBEAllocationSize(fbeValue.f5)
            + f6.FBEAllocationSize(fbeValue.f6)
            + f7.FBEAllocationSize(fbeValue.f7)
            + f8.FBEAllocationSize(fbeValue.f8)
            + f9.FBEAllocationSize(fbeValue.f9)
            + f10.FBEAllocationSize(fbeValue.f10)
            ;
        return fbeResult;
    }

    // Get the field type
    public static final long FBETypeConst = 140;
    public long FBEType() { return FBETypeConst; }

    // Check if the struct value is valid
    @Override
    public long verify()
    {
        _buffer.shift(FBEOffset());
        long fbeResult = verifyFields();
        _buffer.unshift(FBEOffset());
        return fbeResult;
    }

    // Check if the struct fields are valid
    public long verifyFields()
    {
        long fbeCurrentOffset = 0;
        long fbeFieldSize = 0;

        f1.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f1.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f2.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f2.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f3.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f3.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f4.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f4.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f5.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f5.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f6.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f6.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f7.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f7.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f8.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f8.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f9.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f9.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f10.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f10.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        return fbeCurrentOffset;
    }

    // Get the struct value
    public StructMap get(Size fbeSize) { return get(fbeSize, new StructMap()); }
    public StructMap get(Size fbeSize, StructMap fbeValue)
    {
        _buffer.shift(FBEOffset());
        fbeSize.value = getFields(fbeValue);
        _buffer.unshift(FBEOffset());
        return fbeValue;
    }

    // Get the struct fields values
    public long getFields(StructMap fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new Size(0);

        f1.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1.get(fbeValue.f1);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f2.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f2.get(fbeValue.f2);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f3.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f3.get(fbeValue.f3);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f4.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f4.get(fbeValue.f4);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f5.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f5.get(fbeValue.f5);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f6.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f6.get(fbeValue.f6);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f7.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f7.get(fbeValue.f7);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f8.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f8.get(fbeValue.f8);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f9.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f9.get(fbeValue.f9);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f10.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f10.get(fbeValue.f10);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }

    // Set the struct value
    public long set(StructMap fbeValue)
    {
        _buffer.shift(FBEOffset());
        long fbeSize = setFields(fbeValue);
        _buffer.unshift(FBEOffset());
        return fbeSize;
    }

    // Set the struct fields values
    public long setFields(StructMap fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new Size(0);

        f1.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1.set(fbeValue.f1);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f2.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f2.set(fbeValue.f2);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f3.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f3.set(fbeValue.f3);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f4.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f4.set(fbeValue.f4);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f5.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f5.set(fbeValue.f5);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f6.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f6.set(fbeValue.f6);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f7.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f7.set(fbeValue.f7);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f8.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f8.set(fbeValue.f8);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f9.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f9.set(fbeValue.f9);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f10.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f10.set(fbeValue.f10);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }
}
