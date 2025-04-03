package defpackage;

import androidx.car.app.model.Alert;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyej extends eyel {
    private final InputStream a;
    private final byte[] h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n = Alert.DURATION_SHOW_INDEFINITELY;

    public eyej(InputStream inputStream, int i) {
        byte[] bArr = eygs.b;
        this.a = inputStream;
        this.h = new byte[i];
        this.i = 0;
        this.k = 0;
        this.m = 0;
    }

    private static int G(InputStream inputStream, byte[] bArr, int i, int i2) {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (eygu e) {
            e.a();
            throw e;
        }
    }

    private final List S(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.a.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.m += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void T() {
        int i = this.i + this.j;
        this.i = i;
        int i2 = this.m + i;
        int i3 = this.n;
        if (i2 <= i3) {
            this.j = 0;
            return;
        }
        int i4 = i2 - i3;
        this.j = i4;
        this.i = i - i4;
    }

    private final void U(int i) {
        if (V(i)) {
            return;
        }
        if (i <= (this.e - this.m) - this.k) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new eygu("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    private final boolean V(int i) {
        int i2 = this.k;
        int i3 = i2 + i;
        int i4 = this.i;
        if (i3 <= i4) {
            throw new IllegalStateException(a.f(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.e;
        int i6 = this.m;
        if (i > (i5 - i6) - i2 || i6 + i2 + i > this.n) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.h;
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i6 = this.m + i2;
            this.m = i6;
            i4 = this.i - i2;
            this.i = i4;
            this.k = 0;
        }
        InputStream inputStream = this.a;
        byte[] bArr2 = this.h;
        int G = G(inputStream, bArr2, i4, Math.min(bArr2.length - i4, (this.e - i6) - i4));
        if (G == 0 || G < -1 || G > this.h.length) {
            throw new IllegalStateException(String.valueOf(this.a.getClass()) + "#read(byte[]) returned invalid result: " + G + "\nThe InputStream implementation is buggy.");
        }
        if (G <= 0) {
            return false;
        }
        this.i += G;
        T();
        if (this.i >= i) {
            return true;
        }
        return V(i);
    }

    private final byte[] W(int i) {
        if (i == 0) {
            return eygs.b;
        }
        int i2 = this.m;
        int i3 = this.k;
        int i4 = i2 + i3 + i;
        if (i4 - this.e > 0) {
            throw new eygu("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.n;
        if (i4 > i5) {
            B((i5 - i2) - i3);
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.i - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.a.available()) {
                    return null;
                }
            } catch (eygu e) {
                e.a();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.h, this.k, bArr, 0, i6);
        this.m += this.i;
        this.k = 0;
        this.i = 0;
        while (i6 < i) {
            int G = G(this.a, bArr, i6, i - i6);
            if (G == -1) {
                throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.m += G;
            i6 += G;
        }
        return bArr;
    }

    private final byte[] X(int i) {
        byte[] W = W(i);
        if (W != null) {
            return W;
        }
        int i2 = this.k;
        int i3 = this.i;
        int i4 = i3 - i2;
        this.m += i3;
        this.k = 0;
        this.i = 0;
        List<byte[]> S = S(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.h, i2, bArr, 0, i4);
        for (byte[] bArr2 : S) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    @Override // defpackage.eyel
    public final void A(int i) {
        this.n = i;
        T();
    }

    public final void B(int i) {
        int i2 = this.i;
        int i3 = this.k;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.k = i3 + i;
            return;
        }
        if (i < 0) {
            throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.m;
        int i6 = i5 + i3;
        int i7 = this.n;
        if (i6 + i > i7) {
            B((i7 - i5) - i3);
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.m = i6;
        this.i = 0;
        this.k = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long skip = this.a.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(String.valueOf(this.a.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i4 += (int) skip;
                    }
                } catch (eygu e) {
                    e.a();
                    throw e;
                }
            } finally {
                this.m += i4;
                T();
            }
        }
        if (i4 >= i) {
            return;
        }
        int i8 = this.i;
        int i9 = i8 - this.k;
        this.k = i8;
        U(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.i;
            if (i10 <= i11) {
                this.k = i10;
                return;
            } else {
                i9 += i11;
                this.k = i11;
                U(1);
            }
        }
    }

    @Override // defpackage.eyel
    public final boolean C() {
        return this.k == this.i && !V(1);
    }

    @Override // defpackage.eyel
    public final boolean D() {
        return r() != 0;
    }

    @Override // defpackage.eyel
    public final boolean E(int i) {
        int b = eyjt.b(i);
        int i2 = 0;
        if (b == 0) {
            if (this.i - this.k < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw new eygu("CodedInputStream encountered a malformed varint.");
            }
            while (i2 < 10) {
                byte[] bArr = this.h;
                int i3 = this.k;
                this.k = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                }
            }
            throw new eygu("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (b == 1) {
            B(8);
            return true;
        }
        if (b == 2) {
            B(j());
            return true;
        }
        if (b == 3) {
            Q();
            z(eyjt.c(eyjt.a(i), 4));
            return true;
        }
        if (b == 4) {
            P();
            return false;
        }
        if (b != 5) {
            throw new eygt();
        }
        B(4);
        return true;
    }

    @Override // defpackage.eyel
    public final byte[] F() {
        int j = j();
        int i = this.i;
        int i2 = this.k;
        if (j > i - i2 || j <= 0) {
            if (j >= 0) {
                return X(j);
            }
            throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] copyOfRange = Arrays.copyOfRange(this.h, i2, i2 + j);
        this.k += j;
        return copyOfRange;
    }

    public final byte a() {
        if (this.k == this.i) {
            U(1);
        }
        byte[] bArr = this.h;
        int i = this.k;
        this.k = i + 1;
        return bArr[i];
    }

    @Override // defpackage.eyel
    public final double b() {
        return Double.longBitsToDouble(q());
    }

    @Override // defpackage.eyel
    public final float c() {
        return Float.intBitsToFloat(i());
    }

    @Override // defpackage.eyel
    public final int d() {
        return this.m + this.k;
    }

    @Override // defpackage.eyel
    public final int e(int i) {
        if (i < 0) {
            throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.m + this.k;
        if (i2 < 0) {
            throw new eygu("Failed to parse the message.");
        }
        int i3 = this.n;
        if (i2 > i3) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.n = i2;
        T();
        return i3;
    }

    @Override // defpackage.eyel
    public final int f() {
        return j();
    }

    @Override // defpackage.eyel
    public final int g() {
        return i();
    }

    @Override // defpackage.eyel
    public final int h() {
        return j();
    }

    public final int i() {
        int i = this.k;
        if (this.i - i < 4) {
            U(4);
            i = this.k;
        }
        byte[] bArr = this.h;
        this.k = i + 4;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // defpackage.eyel
    public final int j() {
        int i;
        int i2 = this.k;
        int i3 = this.i;
        if (i3 != i2) {
            byte[] bArr = this.h;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.k = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.k = i5;
                return i;
            }
        }
        return (int) s();
    }

    @Override // defpackage.eyel
    public final int k() {
        return i();
    }

    @Override // defpackage.eyel
    public final int l() {
        return H(j());
    }

    @Override // defpackage.eyel
    public final int m() {
        if (C()) {
            this.l = 0;
            return 0;
        }
        int j = j();
        this.l = j;
        if (eyjt.a(j) != 0) {
            return j;
        }
        throw new eygu("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.eyel
    public final int n() {
        return j();
    }

    @Override // defpackage.eyel
    public final long o() {
        return q();
    }

    @Override // defpackage.eyel
    public final long p() {
        return r();
    }

    public final long q() {
        int i = this.k;
        if (this.i - i < 8) {
            U(8);
            i = this.k;
        }
        byte[] bArr = this.h;
        this.k = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        if (r2[r5] >= 0) goto L28;
     */
    @Override // defpackage.eyel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long r() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyej.r():long");
    }

    final long s() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((a() & 128) == 0) {
                return j;
            }
        }
        throw new eygu("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.eyel
    public final long t() {
        return q();
    }

    @Override // defpackage.eyel
    public final long u() {
        return J(r());
    }

    @Override // defpackage.eyel
    public final long v() {
        return r();
    }

    @Override // defpackage.eyel
    public final eyee w() {
        int j = j();
        int i = this.i;
        int i2 = this.k;
        if (j <= i - i2 && j > 0) {
            eyee z = eyee.z(this.h, i2, j);
            this.k += j;
            return z;
        }
        if (j == 0) {
            return eyee.b;
        }
        if (j < 0) {
            throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] W = W(j);
        if (W != null) {
            return eyee.x(W);
        }
        int i3 = this.k;
        int i4 = this.i;
        int i5 = i4 - i3;
        this.m += i4;
        this.k = 0;
        this.i = 0;
        List<byte[]> S = S(j - i5);
        byte[] bArr = new byte[j];
        System.arraycopy(this.h, i3, bArr, 0, i5);
        for (byte[] bArr2 : S) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        eyee eyeeVar = eyee.b;
        return new eyec(bArr);
    }

    @Override // defpackage.eyel
    public final String x() {
        int j = j();
        if (j > 0) {
            int i = this.i;
            int i2 = this.k;
            if (j <= i - i2) {
                String str = new String(this.h, i2, j, eygs.a);
                this.k += j;
                return str;
            }
        }
        if (j == 0) {
            return "";
        }
        if (j < 0) {
            throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (j > this.i) {
            return new String(X(j), eygs.a);
        }
        U(j);
        String str2 = new String(this.h, this.k, j, eygs.a);
        this.k += j;
        return str2;
    }

    @Override // defpackage.eyel
    public final String y() {
        byte[] X;
        int j = j();
        int i = this.k;
        int i2 = this.i;
        if (j <= i2 - i && j > 0) {
            X = this.h;
            this.k = i + j;
        } else {
            if (j == 0) {
                return "";
            }
            if (j < 0) {
                throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (j <= i2) {
                U(j);
                X = this.h;
                this.k = j;
            } else {
                X = X(j);
            }
        }
        return eyjo.g(X, i, j);
    }

    @Override // defpackage.eyel
    public final void z(int i) {
        if (this.l != i) {
            throw new eygu("Protocol message end-group tag did not match expected tag.");
        }
    }
}
