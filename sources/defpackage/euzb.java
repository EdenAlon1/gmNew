package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class euzb {
    public int a;
    public ByteBuffer b;
    private int c;
    private int d;

    public euzb() {
        euzd.a();
    }

    public final int c(int i) {
        return i + this.b.getInt(i);
    }

    public final int d(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }

    public final int e(int i) {
        int i2 = i + this.a;
        return i2 + this.b.getInt(i2) + 4;
    }

    public final int f(int i) {
        int i2 = i + this.a;
        return this.b.getInt(i2 + this.b.getInt(i2));
    }

    public final String g(int i) {
        char[] cArr;
        int i2;
        int i3;
        int i4;
        ByteBuffer byteBuffer = this.b;
        int i5 = i + byteBuffer.getInt(i);
        int i6 = byteBuffer.getInt(i5);
        int i7 = i5 + 4;
        if (byteBuffer.hasArray()) {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + i7;
            int length = array.length;
            if ((arrayOffset | i6 | ((length - arrayOffset) - i6)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(arrayOffset), Integer.valueOf(i6)));
            }
            int i8 = arrayOffset + i6;
            cArr = new char[i6];
            int i9 = 0;
            while (arrayOffset < i8) {
                byte b = array[arrayOffset];
                if (!euzc.e(b)) {
                    break;
                }
                arrayOffset++;
                euzc.b(b, cArr, i9);
                i9++;
            }
            i2 = i9;
            while (arrayOffset < i8) {
                int i10 = arrayOffset + 1;
                byte b2 = array[arrayOffset];
                if (euzc.e(b2)) {
                    euzc.b(b2, cArr, i2);
                    i2++;
                    arrayOffset = i10;
                    while (arrayOffset < i8) {
                        byte b3 = array[arrayOffset];
                        if (euzc.e(b3)) {
                            arrayOffset++;
                            euzc.b(b3, cArr, i2);
                            i2++;
                        }
                    }
                } else {
                    if (euzc.g(b2)) {
                        if (i10 >= i8) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i4 = i2 + 1;
                        arrayOffset += 2;
                        euzc.d(b2, array[i10], cArr, i2);
                    } else if (euzc.f(b2)) {
                        if (i10 >= i8 - 1) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i4 = i2 + 1;
                        int i11 = arrayOffset + 2;
                        arrayOffset += 3;
                        euzc.c(b2, array[i10], array[i11], cArr, i2);
                    } else {
                        if (i10 >= i8 - 2) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        byte b4 = array[i10];
                        int i12 = arrayOffset + 3;
                        byte b5 = array[arrayOffset + 2];
                        arrayOffset += 4;
                        euzc.a(b2, b4, b5, array[i12], cArr, i2);
                        i2 += 2;
                    }
                    i2 = i4;
                }
            }
        } else {
            if ((i7 | i6 | ((byteBuffer.limit() - i7) - i6)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i6)));
            }
            int i13 = i7 + i6;
            cArr = new char[i6];
            int i14 = 0;
            while (i7 < i13) {
                byte b6 = byteBuffer.get(i7);
                if (!euzc.e(b6)) {
                    break;
                }
                i7++;
                euzc.b(b6, cArr, i14);
                i14++;
            }
            i2 = i14;
            while (i7 < i13) {
                int i15 = i7 + 1;
                byte b7 = byteBuffer.get(i7);
                if (euzc.e(b7)) {
                    euzc.b(b7, cArr, i2);
                    i2++;
                    i7 = i15;
                    while (i7 < i13) {
                        byte b8 = byteBuffer.get(i7);
                        if (euzc.e(b8)) {
                            i7++;
                            euzc.b(b8, cArr, i2);
                            i2++;
                        }
                    }
                } else {
                    if (euzc.g(b7)) {
                        if (i15 >= i13) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i3 = i2 + 1;
                        i7 += 2;
                        euzc.d(b7, byteBuffer.get(i15), cArr, i2);
                    } else if (euzc.f(b7)) {
                        if (i15 >= i13 - 1) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i3 = i2 + 1;
                        int i16 = i7 + 2;
                        i7 += 3;
                        euzc.c(b7, byteBuffer.get(i15), byteBuffer.get(i16), cArr, i2);
                    } else {
                        if (i15 >= i13 - 2) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        byte b9 = byteBuffer.get(i15);
                        int i17 = i7 + 3;
                        byte b10 = byteBuffer.get(i7 + 2);
                        i7 += 4;
                        euzc.a(b7, b9, b10, byteBuffer.get(i17), cArr, i2);
                        i2 += 2;
                    }
                    i2 = i3;
                }
            }
        }
        return new String(cArr, 0, i2);
    }

    public final void h(int i, ByteBuffer byteBuffer) {
        short s;
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.c = i2;
            s = this.b.getShort(i2);
        } else {
            s = 0;
            this.a = 0;
            this.c = 0;
        }
        this.d = s;
    }
}
