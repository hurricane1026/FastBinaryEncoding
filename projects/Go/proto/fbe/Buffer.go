//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.10.0.0
//------------------------------------------------------------------------------

package fbe

import "math"

// Fast Binary Encoding buffer based on dynamic byte array
type Buffer struct {
    // Bytes memory buffer
    data []byte
    // Bytes memory buffer size
    size int
    // Bytes memory buffer offset
    offset int
}

// Create an empty buffer
func NewEmptyBuffer() *Buffer {
    return &Buffer{data: make([]byte, 0)}
}

// Create an empty buffer with the given capacity
func NewCapacityBuffer(capacity int) *Buffer {
    return &Buffer{data: make([]byte, capacity)}
}

// Create a buffer with attached bytes memory buffer
func NewAttached(buffer []byte) *Buffer {
    result := NewEmptyBuffer()
    result.Attach(buffer)
    return result
}

// Create a buffer with attached bytes memory buffer with offset and size
func NewAttachedBytes(buffer []byte, offset int, size int) *Buffer {
    result := NewEmptyBuffer()
    result.AttachBytes(buffer, offset, size)
    return result
}

// Create a buffer with another attached buffer
func NewAttachedBuffer(buffer *Buffer) *Buffer {
    result := NewEmptyBuffer()
    result.AttachBuffer(buffer)
    return result
}

// Is the buffer empty?
func (b *Buffer) Empty() bool { return (len(b.data) == 0) || (b.size <= 0) }
// Get bytes memory buffer
func (b *Buffer) Data() []byte { return b.data }
// Get bytes memory buffer capacity
func (b *Buffer) Capacity() int { return len(b.data) }
// Get bytes memory buffer size
func (b *Buffer) Size() int { return b.size }
// Get bytes memory buffer offset
func (b *Buffer) Offset() int { return b.offset }

// Attach an empty memory buffer
func (b *Buffer) AttachNew() {
    b.data = make([]byte, 0)
    b.size = 0
    b.offset = 0
}

// Attach an empty memory buffer with the given capacity
func (b *Buffer) AttachCapacity(capacity int) {
    b.data = make([]byte, capacity)
    b.size = 0
    b.offset = 0
}

// Attach the given bytes memory buffer
func (b *Buffer) Attach(buffer []byte) {
    b.AttachBytes(buffer, 0, len(buffer))
}

// Attach the given bytes memory buffer with offset and size
func (b *Buffer) AttachBytes(buffer []byte, offset int, size int) {
    if len(buffer) < size {
        panic("invalid buffer")
    }
    if size <= 0 {
        panic("invalid size")
    }
    if offset > size {
        panic("invalid offset")
    }

    b.data = buffer
    b.size = size
    b.offset = offset
}

// Attach another buffer
func (b *Buffer) AttachBuffer(buffer *Buffer) {
    b.AttachBytes(buffer.data, 0, buffer.size)
}

// Allocate memory in the current write buffer and return offset to the allocated memory block
func (b *Buffer) Allocate(size int) int {
    if size < 0 {
        panic("invalid allocation size")
    }

    offset := b.size

    // Calculate a new buffer size
    total := b.size + size

    if total <= len(b.data) {
        b.size = total
        return offset
    }

    length := 2 * len(b.data)
    if length < total {
        length = total
    }

    data := make([]byte, length)
    copy(data, b.data[:b.size])
    b.data = data
    b.size = total
    return offset
}

// Remove some memory of the given size from the current write buffer
func (b *Buffer) Remove(offset int, size int) {
    if (offset + size) > len(b.data) {
        panic("invalid offset & size")
    }

    copy(b.data[offset:], b.data[offset+size:])
    b.size -= size
    if b.offset >= (offset + size) {
        b.offset -= size
    } else if b.offset >= offset {
        b.offset -= b.offset - offset
        if b.offset > b.size {
            b.offset = b.size
        }
    }
}

// Reserve memory of the given capacity in the current write bufferb
func (b *Buffer) Reserve(capacity int) {
    if capacity < 0 {
        panic("invalid reserve capacity")
    }

    if capacity > len(b.data) {
        length := 2 * len(b.data)
        if length < capacity {
            length = capacity
        }

        data := make([]byte, length)
        copy(data, b.data[:b.size])
        b.data = data
    }
}

// Resize the current write buffer
func (b *Buffer) Resize(size int) {
    b.Reserve(size)
    b.size = size
    if b.offset > b.size {
        b.offset = b.size
    }
}

// Reset the current write buffer and its offset
func (b *Buffer) Reset() {
    b.size = 0
    b.offset = 0
}

// Shift the current write buffer offset
func (b *Buffer) Shift(offset int) {
    b.offset += offset
}

// Unshift the current write buffer offset
func (b *Buffer) Unshift(offset int) {
    b.offset -= offset
}

// Buffer I/O methods

// Read bool from the buffer
func ReadBool(buffer []byte, offset int) bool {
    return buffer[offset] != 0
}

// Read byte from the buffer
func ReadByte(buffer []byte, offset int) byte {
    return buffer[offset]
}

// Read single byte character from the buffer
func ReadChar(buffer []byte, offset int) rune {
    return rune(ReadUInt8(buffer, offset))
}

// Read four bytes character from the buffer
func ReadWChar(buffer []byte, offset int) rune {
    return rune(ReadUInt32(buffer, offset))
}

// Read signed 8-bits integer from the buffer
func ReadInt8(buffer []byte, offset int) int8 {
    return int8(buffer[offset])
}

// Read unsigned 8-bits integer from the buffer
func ReadUInt8(buffer []byte, offset int) uint8 {
    return uint8(buffer[offset])
}

// Read signed 16-bits integer from the buffer
func ReadInt16(buffer []byte, offset int) int16 {
    return (int16(buffer[offset + 0]) << 0) | (int16(buffer[offset + 1]) << 8)
}

// Read unsigned 16-bits integer from the buffer
func ReadUInt16(buffer []byte, offset int) uint16 {
    return (uint16(buffer[offset + 0]) << 0) | (uint16(buffer[offset + 1]) << 8)
}

// Read signed 32-bits integer from the buffer
func ReadInt32(buffer []byte, offset int) int32 {
    return (int32(buffer[offset + 0]) <<  0) |
           (int32(buffer[offset + 1]) <<  8) |
           (int32(buffer[offset + 2]) << 16) |
           (int32(buffer[offset + 3]) << 24)
}

// Read unsigned 32-bits integer from the buffer
func ReadUInt32(buffer []byte, offset int) uint32 {
    return (uint32(buffer[offset + 0]) <<  0) |
           (uint32(buffer[offset + 1]) <<  8) |
           (uint32(buffer[offset + 2]) << 16) |
           (uint32(buffer[offset + 3]) << 24)
}

// Read signed 64-bits integer from the buffer
func ReadInt64(buffer []byte, offset int) int64 {
    return (int64(buffer[offset + 0]) <<  0) |
           (int64(buffer[offset + 1]) <<  8) |
           (int64(buffer[offset + 2]) << 16) |
           (int64(buffer[offset + 3]) << 24) |
           (int64(buffer[offset + 4]) << 32) |
           (int64(buffer[offset + 5]) << 40) |
           (int64(buffer[offset + 6]) << 48) |
           (int64(buffer[offset + 7]) << 56)
}

// Read unsigned 64-bits integer from the buffer
func ReadUInt64(buffer []byte, offset int) uint64 {
    return (uint64(buffer[offset + 0]) <<  0) |
           (uint64(buffer[offset + 1]) <<  8) |
           (uint64(buffer[offset + 2]) << 16) |
           (uint64(buffer[offset + 3]) << 24) |
           (uint64(buffer[offset + 4]) << 32) |
           (uint64(buffer[offset + 5]) << 40) |
           (uint64(buffer[offset + 6]) << 48) |
           (uint64(buffer[offset + 7]) << 56)
}

// Read float from the buffer
func ReadFloat(buffer []byte, offset int) float32 {
    bits := ReadUInt32(buffer, offset)
    return math.Float32frombits(bits)
}

// Read double from the buffer
func ReadDouble(buffer []byte, offset int) float64 {
    bits := ReadUInt64(buffer, offset)
    return math.Float64frombits(bits)
}

// Read bytes from the buffer
func ReadBytes(buffer []byte, offset int, size int) []byte {
    return buffer[offset:offset + size]
}

// Read string from the buffer
func ReadString(buffer []byte, offset int, size int) string {
    return string(buffer[offset:offset + size])
}

// Read timestamp from the buffer
func ReadTimestamp(buffer []byte, offset int) Timestamp {
    nanoseconds := ReadUInt64(buffer, offset)
    return TimestampFromNanoseconds(nanoseconds)
}

// Read UUID from the buffer
func ReadUUID(buffer []byte, offset int) UUID {
    bytes := ReadBytes(buffer, offset, 16)
    return UUIDFromBytes(bytes)
}

// Write bool into the buffer
func WriteBool(buffer []byte, offset int, value bool) {
    if value {
        buffer[offset] = 1
    } else {
        buffer[offset] = 0
    }
}

// Write byte into the buffer
func WriteByte(buffer []byte, offset int, value byte) {
    buffer[offset] = value
}

// Write single byte character into the buffer
func WriteChar(buffer []byte, offset int, value rune) {
    WriteUInt8(buffer, offset, uint8(value))
}

// Write four bytes character into the buffer
func WriteWChar(buffer []byte, offset int, value rune) {
    WriteUInt32(buffer, offset, uint32(value))
}

// Write signed 8-bits integer into the buffer
func WriteInt8(buffer []byte, offset int, value int8) {
    buffer[offset] = byte(value)
}

// Write unsigned 8-bits integer into the buffer
func WriteUInt8(buffer []byte, offset int, value uint8) {
    buffer[offset] = byte(value)
}

// Write signed 16-bits integer into the buffer
func WriteInt16(buffer []byte, offset int, value int16) {
    buffer[offset + 0] = byte(value >> 0)
    buffer[offset + 1] = byte(value >> 8)
}

// Write unsigned 16-bits integer into the buffer
func WriteUInt16(buffer []byte, offset int, value uint16) {
    buffer[offset + 0] = byte(value >> 0)
    buffer[offset + 1] = byte(value >> 8)
}

// Write signed 32-bits integer into the buffer
func WriteInt32(buffer []byte, offset int, value int32) {
    buffer[offset + 0] = byte(value >>  0)
    buffer[offset + 1] = byte(value >>  8)
    buffer[offset + 2] = byte(value >> 16)
    buffer[offset + 3] = byte(value >> 24)
}

// Write unsigned 32-bits integer into the buffer
func WriteUInt32(buffer []byte, offset int, value uint32) {
    buffer[offset + 0] = byte(value >>  0)
    buffer[offset + 1] = byte(value >>  8)
    buffer[offset + 2] = byte(value >> 16)
    buffer[offset + 3] = byte(value >> 24)
}

// Write signed 64-bits integer into the buffer
func WriteInt64(buffer []byte, offset int, value int64) {
    buffer[offset + 0] = byte(value >>  0)
    buffer[offset + 1] = byte(value >>  8)
    buffer[offset + 2] = byte(value >> 16)
    buffer[offset + 3] = byte(value >> 24)
    buffer[offset + 4] = byte(value >> 32)
    buffer[offset + 5] = byte(value >> 40)
    buffer[offset + 6] = byte(value >> 48)
    buffer[offset + 7] = byte(value >> 56)
}

// Write unsigned 64-bits integer into the buffer
func WriteUInt64(buffer []byte, offset int, value uint64) {
    buffer[offset + 0] = byte(value >>  0)
    buffer[offset + 1] = byte(value >>  8)
    buffer[offset + 2] = byte(value >> 16)
    buffer[offset + 3] = byte(value >> 24)
    buffer[offset + 4] = byte(value >> 32)
    buffer[offset + 5] = byte(value >> 40)
    buffer[offset + 6] = byte(value >> 48)
    buffer[offset + 7] = byte(value >> 56)
}

// Write float into the buffer
func WriteFloat(buffer []byte, offset int, value float32) {
    WriteUInt32(buffer, offset, math.Float32bits(value))
}

// Write double into the buffer
func WriteDouble(buffer []byte, offset int, value float64) {
    WriteUInt64(buffer, offset, math.Float64bits(value))
}

// Write bytes into the buffer
func WriteBytes(buffer []byte, offset int, value []byte) {
    copy(buffer[offset:offset + len(value)], value)
}

// Write slice into the buffer
func WriteSlice(buffer []byte, offset int, value []byte, valueOffset int, valueSize int) {
    copy(buffer[offset:offset + len(value)], value[valueOffset:valueOffset + valueSize])
}

// Write count of single byte into the buffer
func WriteCount(buffer []byte, offset int, value byte, valueCount int) {
    for i := 0; i < valueCount; i++ {
        buffer[offset + i] = value
    }
}

// Write string into the buffer
func WriteString(buffer []byte, offset int, value string) {
    WriteBytes(buffer, offset, []byte(value))
}

// Write timestamp into the buffer
func WriteTimestamp(buffer []byte, offset int, value Timestamp) {
    nanoseconds := uint64(value.UnixNano())
    WriteUInt64(buffer, offset, nanoseconds)
}

// Write UUID into the buffer
func WriteUUID(buffer []byte, offset int, value UUID) {
    bytes, _ := value.MarshalBinary()
    WriteBytes(buffer, offset, bytes)
}
