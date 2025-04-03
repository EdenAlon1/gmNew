package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhmt implements Cloneable, ByteChannel, fhmv, fhmu {
    public fhnq a;
    public long b;

    public final void A() {
        C(this.b);
    }

    @Override // defpackage.fhmv
    public final void B(long j) {
        throw null;
    }

    @Override // defpackage.fhmv
    public final void C(long j) {
        while (j > 0) {
            fhnq fhnqVar = this.a;
            if (fhnqVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, fhnqVar.c - fhnqVar.b);
            long j2 = min;
            this.b -= j2;
            j -= j2;
            int i = fhnqVar.b + min;
            fhnqVar.b = i;
            if (i == fhnqVar.c) {
                this.a = fhnqVar.a();
                fhnr.b(fhnqVar);
            }
        }
    }

    @Override // defpackage.fhmv
    public final boolean D() {
        return this.b == 0;
    }

    @Override // defpackage.fhmv
    public final boolean E(long j) {
        throw null;
    }

    @Override // defpackage.fhmv
    public final byte[] F() {
        return G(this.b);
    }

    @Override // defpackage.fhmv
    public final byte[] G(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.s(j, "byteCount: "));
        }
        if (this.b < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int e = e(bArr, i2, i - i2);
            if (e == -1) {
                throw new EOFException();
            }
            i2 += e;
        }
        return bArr;
    }

    public final void H(fhmt fhmtVar, long j, long j2) {
        long j3 = j;
        fhmm.b(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        fhmtVar.b += j2;
        fhnq fhnqVar = this.a;
        while (true) {
            fhnqVar.getClass();
            long j4 = fhnqVar.c - fhnqVar.b;
            if (j3 < j4) {
                break;
            }
            fhnqVar = fhnqVar.f;
            j3 -= j4;
        }
        fhnq fhnqVar2 = fhnqVar;
        long j5 = j2;
        while (j5 > 0) {
            fhnqVar2.getClass();
            fhnq b = fhnqVar2.b();
            int i = b.b + ((int) j3);
            b.b = i;
            b.c = Math.min(i + ((int) j5), b.c);
            fhnq fhnqVar3 = fhmtVar.a;
            if (fhnqVar3 == null) {
                b.g = b;
                b.f = b.g;
                fhmtVar.a = b.f;
            } else {
                fhnq fhnqVar4 = fhnqVar3.g;
                fhnqVar4.getClass();
                fhnqVar4.d(b);
            }
            j5 -= b.c - b.b;
            fhnqVar2 = fhnqVar2.f;
            j3 = 0;
        }
    }

    @Override // defpackage.fhmv
    public final void I(fhnt fhntVar) {
        long j = this.b;
        if (j > 0) {
            fhntVar.id(this, j);
        }
    }

    @Override // defpackage.fhmu
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void K(fhmx fhmxVar) {
        fhmxVar.m(this, fhmxVar.b());
    }

    @Override // defpackage.fhmu
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void M(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        fhmm.b(bArr.length, i, j);
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                this.b += j;
                return;
            }
            fhnq x = x(1);
            int i5 = 8192 - x.c;
            byte[] bArr2 = x.a;
            int min = Math.min(i4 - i3, i5);
            int i6 = i3 + min;
            ffdo.i(bArr, bArr2, x.c, i3, i6);
            x.c += min;
            i3 = i6;
        }
    }

    public final void N(fhnv fhnvVar) {
        while (fhnvVar.b(this, 8192L) != -1) {
        }
    }

    public final void O(int i) {
        fhnq x = x(1);
        byte[] bArr = x.a;
        int i2 = x.c;
        x.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    @Override // defpackage.fhmu
    public final /* bridge */ /* synthetic */ void P(int i) {
        throw null;
    }

    public final void Q(int i) {
        fhnq x = x(4);
        byte[] bArr = x.a;
        int i2 = x.c;
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) ((i >>> 16) & PrivateKeyType.INVALID);
        bArr[i2 + 2] = (byte) ((i >>> 8) & PrivateKeyType.INVALID);
        bArr[i2 + 3] = (byte) (i & PrivateKeyType.INVALID);
        x.c = i2 + 4;
        this.b += 4;
    }

    @Override // defpackage.fhmu
    public final /* bridge */ /* synthetic */ void R(int i) {
        throw null;
    }

    @Override // defpackage.fhmu
    public final /* bridge */ /* synthetic */ void S(int i) {
        throw null;
    }

    public final void T(String str, int i, int i2) {
        str.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.h(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a.r(i, i2, "endIndex < beginIndex: ", " < "));
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            int i3 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < 128) {
                fhnq x = x(1);
                byte[] bArr = x.a;
                int i4 = x.c - i;
                int min = Math.min(i2, 8192 - i4);
                bArr[i + i4] = (byte) charAt;
                i = i3;
                while (i < min) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i + i4] = (byte) charAt2;
                    i++;
                }
                int i5 = x.c;
                int i6 = (i4 + i) - i5;
                x.c = i5 + i6;
                this.b += i6;
            } else {
                if (charAt < 2048) {
                    fhnq x2 = x(2);
                    byte[] bArr2 = x2.a;
                    int i7 = x2.c;
                    bArr2[i7] = (byte) ((charAt >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt & '?') | 128);
                    x2.c = i7 + 2;
                    this.b += 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    fhnq x3 = x(3);
                    byte[] bArr3 = x3.a;
                    int i8 = x3.c;
                    bArr3[i8] = (byte) ((charAt >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt & '?') | 128);
                    x3.c = i8 + 3;
                    this.b += 3;
                } else {
                    char charAt3 = i3 < i2 ? str.charAt(i3) : (char) 0;
                    if (charAt > 56319 || charAt3 < 56320 || charAt3 >= 57344) {
                        O(63);
                    } else {
                        fhnq x4 = x(4);
                        byte[] bArr4 = x4.a;
                        int i9 = x4.c;
                        int i10 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        bArr4[i9] = (byte) ((i10 >> 18) | 240);
                        bArr4[i9 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i9 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i9 + 3] = (byte) ((i10 & 63) | 128);
                        x4.c = i9 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i = i3;
            }
        }
    }

    public final void U(int i) {
        if (i < 128) {
            O(i);
            return;
        }
        if (i < 2048) {
            fhnq x = x(2);
            byte[] bArr = x.a;
            int i2 = x.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            x.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (i >= 55296 && i < 57344) {
            O(63);
            return;
        }
        if (i < 65536) {
            fhnq x2 = x(3);
            byte[] bArr2 = x2.a;
            int i3 = x2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            x2.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(fhmm.a(i)));
        }
        fhnq x3 = x(4);
        byte[] bArr3 = x3.a;
        int i4 = x3.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        x3.c = i4 + 4;
        this.b += 4;
    }

    @Override // defpackage.fhmu
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void Y(byte[] bArr) {
        bArr.getClass();
        M(bArr, 0, bArr.length);
    }

    public final void W(long j) {
        if (j == 0) {
            O(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) >> 2);
        fhnq x = x(i);
        byte[] bArr = x.a;
        int i2 = x.c;
        int i3 = i2 + i;
        while (true) {
            i3--;
            if (i3 < i2) {
                x.c += i;
                this.b += i;
                return;
            } else {
                bArr[i3] = fhnz.a[(int) (15 & j)];
                j >>>= 4;
            }
        }
    }

    @Override // defpackage.fhmu
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final void aa(String str) {
        str.getClass();
        T(str, 0, str.length());
    }

    public final void Z(long j) {
        boolean z;
        if (j == 0) {
            O(48);
            return;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                aa("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        fhnq x = x(i);
        byte[] bArr = x.a;
        int i2 = x.c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = fhnz.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        x.c += i;
        this.b += i;
    }

    @Override // defpackage.fhnv
    public final fhnx a() {
        return fhnx.j;
    }

    @Override // defpackage.fhnv
    public final long b(fhmt fhmtVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(a.s(j, "byteCount < 0: "));
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        fhmtVar.id(this, j);
        return j;
    }

    public final byte c(long j) {
        fhmm.b(this.b, j, 1L);
        fhnq fhnqVar = this.a;
        fhnqVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                fhnqVar = fhnqVar.g;
                fhnqVar.getClass();
                j2 -= fhnqVar.c - fhnqVar.b;
            }
            fhnqVar.getClass();
            return fhnqVar.a[(int) ((fhnqVar.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = fhnqVar.c;
            int i2 = fhnqVar.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                fhnqVar.getClass();
                return fhnqVar.a[(int) ((i2 + j) - j3)];
            }
            fhnqVar = fhnqVar.f;
            fhnqVar.getClass();
            j3 = j4;
        }
    }

    public final /* synthetic */ Object clone() {
        fhmt fhmtVar = new fhmt();
        if (this.b == 0) {
            return fhmtVar;
        }
        fhnq fhnqVar = this.a;
        fhnqVar.getClass();
        fhnq b = fhnqVar.b();
        fhmtVar.a = b;
        b.g = b;
        b.f = b.g;
        for (fhnq fhnqVar2 = fhnqVar.f; fhnqVar2 != fhnqVar; fhnqVar2 = fhnqVar2.f) {
            fhnq fhnqVar3 = b.g;
            fhnqVar3.getClass();
            fhnqVar2.getClass();
            fhnqVar3.d(fhnqVar2.b());
        }
        fhmtVar.b = this.b;
        return fhmtVar;
    }

    @Override // defpackage.fhmv
    public final byte d() {
        long j = this.b;
        if (j == 0) {
            throw new EOFException();
        }
        fhnq fhnqVar = this.a;
        fhnqVar.getClass();
        int i = fhnqVar.b;
        int i2 = i + 1;
        byte[] bArr = fhnqVar.a;
        int i3 = fhnqVar.c;
        byte b = bArr[i];
        this.b = j - 1;
        if (i2 != i3) {
            fhnqVar.b = i2;
            return b;
        }
        this.a = fhnqVar.a();
        fhnr.b(fhnqVar);
        return b;
    }

    public final int e(byte[] bArr, int i, int i2) {
        bArr.getClass();
        fhmm.b(bArr.length, i, i2);
        fhnq fhnqVar = this.a;
        if (fhnqVar == null) {
            return -1;
        }
        int min = Math.min(i2, fhnqVar.c - fhnqVar.b);
        int i3 = fhnqVar.b;
        ffdo.i(fhnqVar.a, bArr, i, i3, i3 + min);
        int i4 = fhnqVar.b + min;
        fhnqVar.b = i4;
        this.b -= min;
        if (i4 != fhnqVar.c) {
            return min;
        }
        this.a = fhnqVar.a();
        fhnr.b(fhnqVar);
        return min;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhmt)) {
            return false;
        }
        long j = this.b;
        fhmt fhmtVar = (fhmt) obj;
        if (j != fhmtVar.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        fhnq fhnqVar = this.a;
        fhnqVar.getClass();
        fhnq fhnqVar2 = fhmtVar.a;
        fhnqVar2.getClass();
        int i = fhnqVar.b;
        int i2 = fhnqVar2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long min = Math.min(fhnqVar.c - i, fhnqVar2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (fhnqVar.a[i] != fhnqVar2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == fhnqVar.c) {
                fhnqVar = fhnqVar.f;
                fhnqVar.getClass();
                i = fhnqVar.b;
            }
            if (i2 == fhnqVar2.c) {
                fhnqVar2 = fhnqVar2.f;
                fhnqVar2.getClass();
                i2 = fhnqVar2.b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // defpackage.fhmv
    public final int f() {
        long j = this.b;
        if (j < 4) {
            throw new EOFException();
        }
        fhnq fhnqVar = this.a;
        fhnqVar.getClass();
        int i = fhnqVar.b;
        int i2 = fhnqVar.c;
        if (i2 - i < 4) {
            return ((d() & 255) << 24) | ((d() & 255) << 16) | ((d() & 255) << 8) | (d() & 255);
        }
        byte[] bArr = fhnqVar.a;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = (bArr[i + 1] & 255) << 16;
        int i5 = (bArr[i + 2] & 255) << 8;
        int i6 = bArr[i + 3] & 255;
        this.b = j - 4;
        int i7 = i3 | i4 | i5 | i6;
        int i8 = i + 4;
        if (i8 != i2) {
            fhnqVar.b = i8;
            return i7;
        }
        this.a = fhnqVar.a();
        fhnr.b(fhnqVar);
        return i7;
    }

    @Override // defpackage.fhmv
    public final int g(fhnh fhnhVar) {
        fhnhVar.getClass();
        int a = fhnz.a(this, fhnhVar, false);
        if (a == -1) {
            return -1;
        }
        C(fhnhVar.b[a].b());
        return a;
    }

    public final long h() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        fhnq fhnqVar = this.a;
        fhnqVar.getClass();
        fhnq fhnqVar2 = fhnqVar.g;
        fhnqVar2.getClass();
        return (fhnqVar2.c >= 8192 || !fhnqVar2.e) ? j : j - (r3 - fhnqVar2.b);
    }

    public final int hashCode() {
        fhnq fhnqVar = this.a;
        if (fhnqVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = fhnqVar.c;
            for (int i3 = fhnqVar.b; i3 < i2; i3++) {
                i = (i * 31) + fhnqVar.a[i3];
            }
            fhnqVar = fhnqVar.f;
            fhnqVar.getClass();
        } while (fhnqVar != this.a);
        return i;
    }

    public final long i(byte b, long j, long j2) {
        fhnq fhnqVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (j3 < 0 || j3 > j4) {
            throw new IllegalArgumentException("size=" + this.b + " fromIndex=" + j3 + " toIndex=" + j4);
        }
        long j6 = this.b;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (fhnqVar = this.a) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                fhnqVar = fhnqVar.g;
                fhnqVar.getClass();
                j6 -= fhnqVar.c - fhnqVar.b;
            }
            if (fhnqVar == null) {
                return -1L;
            }
            while (j6 < j4) {
                byte[] bArr = fhnqVar.a;
                long j8 = j7;
                int min = (int) Math.min(fhnqVar.c, (fhnqVar.b + j4) - j6);
                for (int i = (int) ((fhnqVar.b + j3) - j6); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - fhnqVar.b) + j6;
                    }
                }
                j6 += fhnqVar.c - fhnqVar.b;
                fhnqVar = fhnqVar.f;
                fhnqVar.getClass();
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = (fhnqVar.c - fhnqVar.b) + j5;
            if (j9 > j3) {
                break;
            }
            fhnqVar = fhnqVar.f;
            fhnqVar.getClass();
            j5 = j9;
        }
        if (fhnqVar == null) {
            return -1L;
        }
        while (j5 < j4) {
            byte[] bArr2 = fhnqVar.a;
            int min2 = (int) Math.min(fhnqVar.c, (fhnqVar.b + j4) - j5);
            for (int i2 = (int) ((fhnqVar.b + j3) - j5); i2 < min2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - fhnqVar.b) + j5;
                }
            }
            j5 += fhnqVar.c - fhnqVar.b;
            fhnqVar = fhnqVar.f;
            fhnqVar.getClass();
            j3 = j5;
        }
        return -1L;
    }

    @Override // defpackage.fhnt
    public final void id(fhmt fhmtVar, long j) {
        fhnq fhnqVar;
        fhmtVar.getClass();
        if (fhmtVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        fhmm.b(fhmtVar.b, 0L, j);
        while (j > 0) {
            fhnq fhnqVar2 = fhmtVar.a;
            fhnqVar2.getClass();
            int i = fhnqVar2.c;
            fhnqVar2.getClass();
            int i2 = i - fhnqVar2.b;
            int i3 = 0;
            if (j < i2) {
                fhnq fhnqVar3 = this.a;
                fhnq fhnqVar4 = fhnqVar3 != null ? fhnqVar3.g : null;
                int i4 = (int) j;
                if (fhnqVar4 != null && fhnqVar4.e) {
                    if ((fhnqVar4.c + j) - (fhnqVar4.d ? 0 : fhnqVar4.b) <= 8192) {
                        fhnqVar2.getClass();
                        fhnqVar2.c(fhnqVar4, i4);
                        fhmtVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                fhnqVar2.getClass();
                if (i4 > i2) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i4 >= 1024) {
                    fhnqVar = fhnqVar2.b();
                } else {
                    byte[] bArr = fhnqVar2.a;
                    fhnq a = fhnr.a();
                    byte[] bArr2 = a.a;
                    int i5 = fhnqVar2.b;
                    ffdo.i(bArr, bArr2, 0, i5, i5 + i4);
                    fhnqVar = a;
                }
                fhnqVar.c = fhnqVar.b + i4;
                fhnqVar2.b += i4;
                fhnq fhnqVar5 = fhnqVar2.g;
                fhnqVar5.getClass();
                fhnqVar5.d(fhnqVar);
                fhmtVar.a = fhnqVar;
            }
            fhnq fhnqVar6 = fhmtVar.a;
            fhnqVar6.getClass();
            int i6 = fhnqVar6.c - fhnqVar6.b;
            fhmtVar.a = fhnqVar6.a();
            fhnq fhnqVar7 = this.a;
            if (fhnqVar7 == null) {
                this.a = fhnqVar6;
                fhnqVar6.g = fhnqVar6;
                fhnqVar6.f = fhnqVar6.g;
            } else {
                fhnq fhnqVar8 = fhnqVar7.g;
                fhnqVar8.getClass();
                fhnqVar8.d(fhnqVar6);
                fhnq fhnqVar9 = fhnqVar6.g;
                if (fhnqVar9 == fhnqVar6) {
                    throw new IllegalStateException("cannot compact");
                }
                fhnqVar9.getClass();
                if (fhnqVar9.e) {
                    int i7 = fhnqVar6.c - fhnqVar6.b;
                    fhnqVar9.getClass();
                    int i8 = 8192 - fhnqVar9.c;
                    fhnqVar9.getClass();
                    if (!fhnqVar9.d) {
                        fhnqVar9.getClass();
                        i3 = fhnqVar9.b;
                    }
                    if (i7 <= i8 + i3) {
                        fhnqVar9.getClass();
                        fhnqVar6.c(fhnqVar9, i7);
                        fhnqVar6.a();
                        fhnr.b(fhnqVar6);
                    }
                }
            }
            long j2 = i6;
            fhmtVar.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.fhmv
    public final long j(fhmx fhmxVar) {
        throw null;
    }

    @Override // defpackage.fhmv
    public final InputStream k() {
        return new fhmr(this);
    }

    public final String l(long j, Charset charset) {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.s(j, "byteCount: "));
        }
        long j2 = this.b;
        if (j2 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        fhnq fhnqVar = this.a;
        fhnqVar.getClass();
        int i = fhnqVar.b;
        int i2 = fhnqVar.c;
        if (i + j > i2) {
            return new String(G(j), charset);
        }
        int i3 = (int) j;
        String str = new String(fhnqVar.a, i, i3, charset);
        int i4 = i + i3;
        fhnqVar.b = i4;
        this.b = j2 - j;
        if (i4 == i2) {
            this.a = fhnqVar.a();
            fhnr.b(fhnqVar);
        }
        return str;
    }

    public final String m() {
        return l(this.b, ffoo.a);
    }

    public final String n(long j) {
        return l(j, ffoo.a);
    }

    @Override // defpackage.fhmv
    public final String o() {
        throw null;
    }

    @Override // defpackage.fhmv
    public final String p(long j) {
        throw null;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        fhnq fhnqVar = this.a;
        if (fhnqVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), fhnqVar.c - fhnqVar.b);
        byteBuffer.put(fhnqVar.a, fhnqVar.b, min);
        int i = fhnqVar.b + min;
        fhnqVar.b = i;
        this.b -= min;
        if (i == fhnqVar.c) {
            this.a = fhnqVar.a();
            fhnr.b(fhnqVar);
        }
        return min;
    }

    @Override // defpackage.fhmu
    public final /* bridge */ /* synthetic */ fhmu s(long j) {
        Z(j);
        return this;
    }

    public final fhmx t() {
        return u(this.b);
    }

    public final String toString() {
        return v().toString();
    }

    @Override // defpackage.fhmv
    public final fhmx u(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.s(j, "byteCount: "));
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new fhmx(G(j));
        }
        fhmx w = w((int) j);
        C(j);
        return w;
    }

    public final fhmx v() {
        long j = this.b;
        if (j <= 2147483647L) {
            return w((int) j);
        }
        throw new IllegalStateException(a.s(j, "size > Int.MAX_VALUE: "));
    }

    public final fhmx w(int i) {
        if (i == 0) {
            return fhmx.a;
        }
        fhmm.b(this.b, 0L, i);
        fhnq fhnqVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            fhnqVar.getClass();
            int i5 = fhnqVar.c;
            int i6 = fhnqVar.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            fhnqVar = fhnqVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 + i4];
        fhnq fhnqVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            fhnqVar2.getClass();
            bArr[i7] = fhnqVar2.a;
            i2 += fhnqVar2.c - fhnqVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = fhnqVar2.b;
            fhnqVar2.d = true;
            i7++;
            fhnqVar2 = fhnqVar2.f;
        }
        return new fhns(bArr, iArr);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            fhnq x = x(1);
            int i2 = 8192 - x.c;
            byte[] bArr = x.a;
            int min = Math.min(i, i2);
            byteBuffer.get(bArr, x.c, min);
            i -= min;
            x.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    public final fhnq x(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        fhnq fhnqVar = this.a;
        if (fhnqVar == null) {
            fhnq a = fhnr.a();
            this.a = a;
            a.g = a;
            a.f = a;
            return a;
        }
        fhnq fhnqVar2 = fhnqVar.g;
        fhnqVar2.getClass();
        if (fhnqVar2.c + i <= 8192 && fhnqVar2.e) {
            return fhnqVar2;
        }
        fhnq a2 = fhnr.a();
        fhnqVar2.d(a2);
        return a2;
    }

    @Override // defpackage.fhmv
    public final short y() {
        int i;
        long j = this.b;
        if (j < 2) {
            throw new EOFException();
        }
        fhnq fhnqVar = this.a;
        fhnqVar.getClass();
        int i2 = fhnqVar.b;
        int i3 = fhnqVar.c;
        if (i3 - i2 < 2) {
            i = ((d() & 255) << 8) | (d() & 255);
        } else {
            byte[] bArr = fhnqVar.a;
            int i4 = (bArr[i2] & 255) << 8;
            int i5 = bArr[i2 + 1] & 255;
            this.b = j - 2;
            int i6 = i2 + 2;
            if (i6 == i3) {
                this.a = fhnqVar.a();
                fhnr.b(fhnqVar);
            } else {
                fhnqVar.b = i6;
            }
            i = i4 | i5;
        }
        return (short) i;
    }

    public final short z() {
        short y = y();
        int i = y >>> 8;
        return (short) (((y & 255) << 8) | (i & PrivateKeyType.INVALID));
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.fhnv
    public final void close() {
    }

    @Override // defpackage.fhmu, defpackage.fhnt, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.fhmu
    public final fhmt q() {
        return this;
    }

    @Override // defpackage.fhmu
    public final fhmt r() {
        return this;
    }
}
