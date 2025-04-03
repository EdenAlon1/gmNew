package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euza {
    public ByteBuffer a;
    public int b;
    public int c;
    int[] d;
    int e;
    boolean f;
    int g;
    int[] h;
    int i;
    int j;
    euyy k;

    public euza() {
        this(1024);
    }

    public final int a(CharSequence charSequence) {
        char c;
        boolean z;
        int i;
        int i2;
        boolean z2;
        int i3;
        char charAt;
        int length = charSequence.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length && charSequence.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            c = 2048;
            z = true;
            if (i5 >= length) {
                break;
            }
            char charAt2 = charSequence.charAt(i5);
            if (charAt2 < 2048) {
                i6 += (127 - charAt2) >>> 31;
                i5++;
            } else {
                int length2 = charSequence.length();
                int i7 = 0;
                while (i5 < length2) {
                    char charAt3 = charSequence.charAt(i5);
                    if (charAt3 < 2048) {
                        i7 += (127 - charAt3) >>> 31;
                    } else {
                        i7 += 2;
                        if (charAt3 >= 55296 && charAt3 <= 57343) {
                            if (Character.codePointAt(charSequence, i5) < 65536) {
                                throw new euze(i5, length2);
                            }
                            i5++;
                        }
                    }
                    i5++;
                }
                i6 += i7;
            }
        }
        if (i6 < length) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i6 + 4294967296L));
        }
        e((byte) 0);
        p(1, i6, 1);
        ByteBuffer byteBuffer = this.a;
        int i8 = this.b - i6;
        this.b = i8;
        byteBuffer.position(i8);
        ByteBuffer byteBuffer2 = this.a;
        if (byteBuffer2.hasArray()) {
            int arrayOffset = byteBuffer2.arrayOffset();
            byte[] array = byteBuffer2.array();
            int position = byteBuffer2.position() + arrayOffset;
            int remaining = byteBuffer2.remaining();
            int length3 = charSequence.length();
            int i9 = remaining + position;
            while (i4 < length3) {
                int i10 = i4 + position;
                if (i10 >= i9 || (charAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                array[i10] = (byte) charAt;
                i4++;
            }
            if (i4 == length3) {
                i = position + length3;
            } else {
                i = position + i4;
                while (i4 < length3) {
                    char charAt4 = charSequence.charAt(i4);
                    if (charAt4 >= 128 || i >= i9) {
                        if (charAt4 < c && i <= i9 - 2) {
                            i2 = i + 2;
                            array[i] = (byte) ((charAt4 >>> 6) | 960);
                            array[i + 1] = (byte) ((charAt4 & '?') | 128);
                            z2 = z;
                        } else {
                            if ((charAt4 >= 55296 && charAt4 <= 57343) || i > i9 - 3) {
                                z2 = z;
                                if (i > i9 - 4) {
                                    if (charAt4 >= 55296 && charAt4 <= 57343 && ((i3 = i4 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt4, charSequence.charAt(i3)))) {
                                        throw new euze(i4, length3);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt4 + " at index " + i);
                                }
                                int i11 = i4 + 1;
                                if (i11 != charSequence.length()) {
                                    char charAt5 = charSequence.charAt(i11);
                                    if (Character.isSurrogatePair(charAt4, charAt5)) {
                                        int i12 = i + 3;
                                        int codePoint = Character.toCodePoint(charAt4, charAt5);
                                        array[i] = (byte) ((codePoint >>> 18) | 240);
                                        array[i + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        array[i + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i += 4;
                                        array[i12] = (byte) ((codePoint & 63) | 128);
                                        i4 = i11;
                                    } else {
                                        i4 = i11;
                                    }
                                }
                                throw new euze(i4 - 1, length3);
                            }
                            i2 = i + 3;
                            z2 = z;
                            array[i] = (byte) ((charAt4 >>> '\f') | 480);
                            array[i + 1] = (byte) (((charAt4 >>> 6) & 63) | 128);
                            array[i + 2] = (byte) ((charAt4 & '?') | 128);
                        }
                        i = i2;
                    } else {
                        array[i] = (byte) charAt4;
                        z2 = z;
                        i++;
                    }
                    i4++;
                    z = z2;
                    c = 2048;
                }
            }
            byteBuffer2.position(i - arrayOffset);
        } else {
            euzf.b(charSequence, byteBuffer2);
        }
        return c();
    }

    public final int b() {
        int i;
        if (this.d == null || !this.f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        h(0);
        int d = d();
        int i2 = this.e;
        do {
            i2--;
            if (i2 < 0) {
                break;
            }
        } while (this.d[i2] == 0);
        for (int i3 = i2; i3 >= 0; i3--) {
            int i4 = this.d[i3];
            j((short) (i4 != 0 ? d - i4 : 0));
        }
        j((short) (d - this.g));
        int i5 = i2 + 3;
        j((short) (i5 + i5));
        int i6 = 0;
        loop2: while (true) {
            if (i6 >= this.i) {
                i = 0;
                break;
            }
            int capacity = this.a.capacity() - this.h[i6];
            int i7 = this.b;
            short s = this.a.getShort(capacity);
            if (s == this.a.getShort(i7)) {
                for (int i8 = 2; i8 < s; i8 += 2) {
                    if (this.a.getShort(capacity + i8) != this.a.getShort(i7 + i8)) {
                        break;
                    }
                }
                i = this.h[i6];
                break loop2;
            }
            i6++;
        }
        if (i != 0) {
            int capacity2 = this.a.capacity() - d;
            this.b = capacity2;
            this.a.putInt(capacity2, i - d);
        } else {
            int i9 = this.i;
            int[] iArr = this.h;
            if (i9 == iArr.length) {
                this.h = Arrays.copyOf(iArr, i9 + i9);
            }
            int[] iArr2 = this.h;
            int i10 = this.i;
            this.i = i10 + 1;
            iArr2[i10] = d();
            ByteBuffer byteBuffer = this.a;
            byteBuffer.putInt(byteBuffer.capacity() - d, d() - d);
        }
        this.f = false;
        return d;
    }

    public final int c() {
        if (!this.f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f = false;
        m(this.j);
        return d();
    }

    public final int d() {
        return this.a.capacity() - this.b;
    }

    public final void e(byte b) {
        l(1, 0);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 1;
        this.b = i;
        byteBuffer.put(i, b);
    }

    public final void f(double d) {
        l(8, 0);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 8;
        this.b = i;
        byteBuffer.putDouble(i, d);
    }

    public final void g(float f) {
        l(4, 0);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 4;
        this.b = i;
        byteBuffer.putFloat(i, f);
    }

    public final void h(int i) {
        l(4, 0);
        m(i);
    }

    public final void i(int i) {
        l(4, 0);
        m((d() - i) + 4);
    }

    public final void j(short s) {
        l(2, 0);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 2;
        this.b = i;
        byteBuffer.putShort(i, s);
    }

    public final void k() {
        if (this.f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public final void l(int i, int i2) {
        int i3;
        if (i > this.c) {
            this.c = i;
        }
        int i4 = i - 1;
        int i5 = ~((this.a.capacity() - this.b) + i2);
        while (true) {
            int i6 = (i5 + 1) & i4;
            if (this.b >= i6 + i + i2) {
                for (int i7 = 0; i7 < i6; i7++) {
                    ByteBuffer byteBuffer = this.a;
                    int i8 = this.b - 1;
                    this.b = i8;
                    byteBuffer.put(i8, (byte) 0);
                }
                return;
            }
            int capacity = this.a.capacity();
            ByteBuffer byteBuffer2 = this.a;
            euyy euyyVar = this.k;
            int capacity2 = byteBuffer2.capacity();
            if (capacity2 == 0) {
                i3 = 1024;
            } else {
                i3 = 2147483639;
                if (capacity2 == 2147483639) {
                    throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                }
                if (((-1073741824) & capacity2) == 0) {
                    i3 = capacity2 + capacity2;
                }
            }
            byteBuffer2.position(0);
            ByteBuffer a = euyyVar.a(i3);
            a.position(a.clear().capacity() - capacity2);
            a.put(byteBuffer2);
            this.a = a;
            this.b += a.capacity() - capacity;
        }
    }

    public final void m(int i) {
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - 4;
        this.b = i2;
        byteBuffer.putInt(i2, i);
    }

    public final void n(int i) {
        this.d[i] = d();
    }

    public final void o(int i) {
        k();
        int[] iArr = this.d;
        if (iArr == null || iArr.length < i) {
            this.d = new int[i];
        }
        this.e = i;
        Arrays.fill(this.d, 0, i, 0);
        this.f = true;
        this.g = d();
    }

    public final void p(int i, int i2, int i3) {
        k();
        this.j = i2;
        int i4 = i * i2;
        l(4, i4);
        l(i3, i4);
        this.f = true;
    }

    public final void q(int i, boolean z) {
        if (z) {
            l(1, 0);
            ByteBuffer byteBuffer = this.a;
            int i2 = this.b - 1;
            this.b = i2;
            byteBuffer.put(i2, (byte) 1);
            n(i);
        }
    }

    public final void r(int i, byte b) {
        if (b != 0) {
            e(b);
            n(i);
        }
    }

    public final void s(int i, int i2) {
        if (i2 != 0) {
            h(i2);
            n(i);
        }
    }

    public final void t(int i, int i2) {
        if (i2 != 0) {
            i(i2);
            n(i);
        }
    }

    public euza(int i) {
        euyz euyzVar = euyz.a;
        euzd.a();
        this.c = 1;
        this.d = null;
        this.e = 0;
        this.f = false;
        this.h = new int[16];
        this.i = 0;
        this.j = 0;
        this.k = euyzVar;
        ByteBuffer a = euyzVar.a(i);
        this.a = a;
        this.b = a.capacity();
    }
}
