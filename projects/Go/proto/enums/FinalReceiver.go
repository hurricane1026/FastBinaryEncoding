//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.10.0.0
//------------------------------------------------------------------------------

package enums

import "errors"
import "../fbe"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version

// Fast Binary Encoding enums final receiver
type FinalReceiver struct {
    *fbe.Receiver

}

// Create a new enums final receiver with an empty buffer
func NewFinalReceiver() *FinalReceiver {
    return NewFinalReceiverWithBuffer(fbe.NewEmptyBuffer())
}

// Create a new enums final receiver with the given buffer
func NewFinalReceiverWithBuffer(buffer *fbe.Buffer) *FinalReceiver {
    receiver := &FinalReceiver{
        fbe.NewReceiver(buffer, true),
    }
    receiver.SetupHandlerOnReceive(receiver)
    return receiver
}

// Setup handlers
func (r *FinalReceiver) SetupHandlers(handlers interface{}) {
    r.Receiver.SetupHandlers(handlers)
}


// Receive message handler
func (r *FinalReceiver) OnReceive(fbeType int, buffer []byte) (bool, error) {
    switch fbeType {
    default:
        _ = fbeType
        break
    }

    return false, nil
}
