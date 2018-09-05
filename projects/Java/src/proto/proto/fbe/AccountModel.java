// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package proto.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;
import javafx.util.*;

import fbe.*;
import proto.*;

// Fast Binary Encoding Account model class
public final class AccountModel extends Model
{
    public final FieldModelAccount model;

    public AccountModel() { model = new FieldModelAccount(getBuffer(), 4); }
    public AccountModel(Buffer buffer) { super(buffer); model = new FieldModelAccount(getBuffer(), 4); }

    // Get the model size
    public long FBESize() { return model.FBESize() + model.FBEExtra(); }
    // Get the model type
    public static final long FBETypeConst = FieldModelAccount.FBETypeConst;
    public long FBEType() { return FBETypeConst; }

    // Check if the struct value is valid
    public boolean verify()
    {
        if ((getBuffer().getOffset() + model.FBEOffset() - 4) > getBuffer().getSize())
            return false;

        int fbeFullSize = readInt32(model.FBEOffset() - 4);
        if (fbeFullSize < model.FBESize())
            return false;

        return model.verify();
    }

    // Create a new model (begin phase)
    public long createBegin()
    {
        long fbeBegin = getBuffer().allocate(4 + model.FBESize());
        return fbeBegin;
    }

    // Create a new model (end phase)
    public long createEnd(long fbeBegin)
    {
        long fbeEnd = getBuffer().getSize();
        int fbeFullSize = (int)(fbeEnd - fbeBegin);
        write(model.FBEOffset() - 4, fbeFullSize);
        return fbeFullSize;
    }

    // Serialize the struct value
    public long serialize(Account value)
    {
        long fbeBegin = createBegin();
        model.set(value);
        long fbeFullSize = createEnd(fbeBegin);
        return fbeFullSize;
    }

    // Deserialize the struct value
    public Account deserialize() { var value = new Account(); deserialize(value); return value; }
    public long deserialize(Account value)
    {
        if ((getBuffer().getOffset() + model.FBEOffset() - 4) > getBuffer().getSize())
        {
            value = new Account();
            return 0;
        }

        int fbeFullSize = readInt32(model.FBEOffset() - 4);
        assert (fbeFullSize >= model.FBESize()) : "Model is broken!";
        if (fbeFullSize < model.FBESize())
        {
            value = new Account();
            return 0;
        }

        value = model.get(value);
        return fbeFullSize;
    }

    // Move to the next struct value
    public void next(long prev)
    {
        model.FBEShift(prev);
    }
}
