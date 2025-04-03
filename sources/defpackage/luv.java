package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class luv {
    private static final char[] d = {'\r', '\n'};
    private static final char[] e = {'\n'};
    private static final enip f = enip.u(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public byte[] a;
    public int b;
    public int c;

    public luv(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    private final char M(Charset charset, char[] cArr) {
        int N = N(charset);
        if (N != 0) {
            int i = N >> 16;
            for (char c : cArr) {
                char c2 = (char) i;
                if (c == c2) {
                    this.b += (char) N;
                    return c2;
                }
            }
        }
        return (char) 0;
    }

    private final int N(Charset charset) {
        byte a;
        char b;
        int i = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && b() > 0) {
            a = (byte) ermf.a(ermu.b(this.a[this.b]));
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && b() >= 2) {
                byte[] bArr = this.a;
                int i2 = this.b;
                b = ermf.b(bArr[i2], bArr[i2 + 1]);
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || b() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.a;
                int i3 = this.b;
                b = ermf.b(bArr2[i3 + 1], bArr2[i3]);
            }
            a = (byte) b;
            i = 2;
        }
        return (ermf.a(a) << 16) + i;
    }

    public final Charset A() {
        if (b() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (b() < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        int i2 = this.b;
        byte b = bArr2[i2];
        if (b == -2) {
            if (bArr2[i2 + 1] != -1) {
                return null;
            }
            this.b = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.b = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final short B() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final short C() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | (i3 << 8));
    }

    public final void D(int i) {
        if (i > c()) {
            this.a = Arrays.copyOf(this.a, i);
        }
    }

    public final void E(luu luuVar, int i) {
        F(luuVar.a, 0, i);
        luuVar.l(0);
    }

    public final void F(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final void G(int i) {
        I(c() < i ? new byte[i] : this.a, i);
    }

    public final void H(byte[] bArr) {
        I(bArr, bArr.length);
    }

    public final void I(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void J(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        }
        lti.a(z);
        this.c = i;
    }

    public final void K(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.c) {
            z = true;
        }
        lti.a(z);
        this.b = i;
    }

    public final void L(int i) {
        K(this.b + i);
    }

    public final char a(Charset charset) {
        lti.b(f.contains(charset), "Unsupported charset: ".concat(String.valueOf(String.valueOf(charset))));
        return (char) (N(charset) >> 16);
    }

    public final int b() {
        return this.c - this.b;
    }

    public final int c() {
        return this.a.length;
    }

    public final int d() {
        return this.a[this.b] & 255;
    }

    public final int e() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.b = i6;
        int i7 = bArr[i4] & 255;
        this.b = i + 4;
        return (bArr[i6] & 255) | (i3 << 24) | (i5 << 16) | (i7 << 8);
    }

    public final int f() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.b = i6;
        int i7 = bArr[i4] & 255;
        this.b = i + 4;
        return ((bArr[i6] & 255) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    public final int g() {
        int f2 = f();
        if (f2 >= 0) {
            return f2;
        }
        throw new IllegalStateException(a.h(f2, "Top bit not zero: "));
    }

    public final int h() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final int i() {
        return (j() << 21) | (j() << 14) | (j() << 7) | j();
    }

    public final int j() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int k() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        int i4 = bArr[i2] & 255;
        this.b = i + 4;
        return i4 | (i3 << 8);
    }

    public final int l() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & 255;
        this.b = i + 3;
        return (bArr[i4] & 255) | (i3 << 16) | (i5 << 8);
    }

    public final int m() {
        int e2 = e();
        if (e2 >= 0) {
            return e2;
        }
        throw new IllegalStateException(a.h(e2, "Top bit not zero: "));
    }

    public final int n() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (bArr[i2] & 255) | (i3 << 8);
    }

    public final long o() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.b = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.b = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.b = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.b = i7;
        long j6 = bArr[i6];
        this.b = i + 7;
        long j7 = bArr[i7];
        this.b = i + 8;
        return ((bArr[r3] & 255) << 56) | (255 & j) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((j7 & 255) << 48);
    }

    public final long p() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        this.b = i + 3;
        long j3 = bArr[i3];
        this.b = i + 4;
        return ((bArr[r2] & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final long q() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.b = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.b = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.b = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.b = i7;
        long j6 = bArr[i6];
        this.b = i + 7;
        long j7 = bArr[i7];
        this.b = i + 8;
        return (bArr[r3] & 255) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    public final long r() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        this.b = i + 3;
        long j3 = bArr[i3];
        this.b = i + 4;
        return (bArr[r2] & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public final long s() {
        long q = q();
        if (q >= 0) {
            return q;
        }
        throw new IllegalStateException(a.s(q, "Top bit not zero: "));
    }

    public final long t() {
        int i;
        int i2;
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            i = 0;
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r7 - 1;
                i = 7 - i3;
            } else if (i3 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            throw new NumberFormatException(a.s(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i2 = 1; i2 < i; i2++) {
            if ((this.a[this.b + i2] & 192) != 128) {
                throw new NumberFormatException(a.s(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | (r2 & 63);
        }
        this.b += i;
        return j;
    }

    public final String u() {
        return v(StandardCharsets.UTF_8);
    }

    public final String v(Charset charset) {
        lti.b(f.contains(charset), "Unsupported charset: ".concat(String.valueOf(String.valueOf(charset))));
        if (b() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            A();
        }
        int i = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII)) {
            i = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(String.valueOf(charset))));
            }
        }
        int i2 = this.b;
        while (true) {
            int i3 = this.c;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && lvf.Z(this.a[i2])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.a;
                if (bArr[i2] == 0 && lvf.Z(bArr[i2 + 1])) {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.a;
                if (bArr2[i2 + 1] == 0 && lvf.Z(bArr2[i2])) {
                    break;
                }
            }
            i2 += i;
        }
        String z = z(i2 - this.b, charset);
        if (this.b != this.c && M(charset, d) == '\r') {
            M(charset, e);
        }
        return z;
    }

    public final String w() {
        if (b() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String I = lvf.I(bArr, i2, i - i2);
        this.b = i;
        if (i >= this.c) {
            return I;
        }
        this.b = i + 1;
        return I;
    }

    public final String x(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String I = lvf.I(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.b += i;
        return I;
    }

    public final String y(int i) {
        return z(i, StandardCharsets.UTF_8);
    }

    public final String z(int i, Charset charset) {
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = new String(bArr, i2, i, charset);
        this.b = i2 + i;
        return str;
    }

    public luv() {
        this.a = lvf.c;
    }

    public luv(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public luv(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }
}
