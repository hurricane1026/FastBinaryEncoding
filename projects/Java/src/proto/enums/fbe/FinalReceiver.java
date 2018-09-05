// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package enums.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;
import javafx.util.*;

import fbe.*;
import enums.*;

// Fast Binary Encoding enums final receiver class
public class FinalReceiver extends fbe.Receiver
{
    // Receiver values accessors
    private final enums.Enums EnumsValue;

    // Receiver models accessors
    private final EnumsFinalModel EnumsModel;

    public FinalReceiver()
    {
        setFinal(true);
        EnumsValue = new enums.Enums();
        EnumsModel = new EnumsFinalModel();
    }
    public FinalReceiver(Buffer buffer)
    {
        super(buffer);
        setFinal(true);
        EnumsValue = new enums.Enums();
        EnumsModel = new EnumsFinalModel();
    }

    // Receive handlers
    protected void onReceive(enums.Enums value) {}

    @Override
    public boolean onReceive(long type, byte[] buffer, long offset, long size)
    {
        switch ((int)type)
        {
            case (int)enums.fbe.EnumsFinalModel.FBETypeConst:
            {
                // Deserialize the value from the FBE stream
                EnumsModel.attach(buffer, offset);
                assert EnumsModel.verify() : "enums.Enums validation failed!";
                long deserialized = EnumsModel.deserialize(EnumsValue);
                assert (deserialized > 0) : "enums.Enums deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = EnumsValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(EnumsValue);
                return true;
            }
        }

        return false;
    }
}
