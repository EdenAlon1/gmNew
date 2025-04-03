package defpackage;

import androidx.car.app.model.Alert;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyei extends eyel {
    private final Iterable a;
    private final Iterator h;
    private ByteBuffer i;
    private int j;
    private int k;
    private int m;
    private long o;
    private long p;
    private long q;
    private int l = Alert.DURATION_SHOW_INDEFINITELY;
    private int n = 0;

    public eyei(Iterable iterable, int i) {
        this.j = i;
        this.a = iterable;
        this.h = iterable.iterator();
        if (i != 0) {
            V();
            return;
        }
        this.i = eygs.c;
        this.o = 0L;
        this.p = 0L;
        this.q = 0L;
    }

    private final int G() {
        return (int) (((this.j - this.n) - this.o) + this.p);
    }

    private final long S() {
        return this.q - this.o;
    }

    private final void T() {
        if (!this.h.hasNext()) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        V();
    }

    private final void U() {
        int i = this.j + this.k;
        this.j = i;
        int i2 = this.l;
        if (i <= i2) {
            this.k = 0;
            return;
        }
        int i3 = i - i2;
        this.k = i3;
        this.j = i - i3;
    }

    private final void V() {
        ByteBuffer byteBuffer = (ByteBuffer) this.h.next();
        this.i = byteBuffer;
        this.n += (int) (this.o - this.p);
        long position = byteBuffer.position();
        this.o = position;
        this.p = position;
        this.q = this.i.limit();
        long e = eyjj.e(this.i);
        this.o += e;
        this.p += e;
        this.q += e;
    }

    private final void W(byte[] bArr, int i) {
        if (i > G()) {
            if (i > 0) {
                throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i2 = i;
        while (i2 > 0) {
            if (S() == 0) {
                T();
            }
            int min = Math.min(i2, (int) S());
            long j = min;
            eyjj.k(this.o, bArr, i - i2, j);
            i2 -= min;
            this.o += j;
        }
    }

    @Override // defpackage.eyel
    public final void A(int i) {
        this.l = i;
        U();
    }

    public final void B(int i) {
        if (i >= 0) {
            if (i <= ((this.j - this.n) - this.o) + this.p) {
                while (i > 0) {
                    if (S() == 0) {
                        T();
                    }
                    int min = Math.min(i, (int) S());
                    i -= min;
                    this.o += min;
                }
                return;
            }
        }
        if (i >= 0) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // defpackage.eyel
    public final boolean C() {
        return (((long) this.n) + this.o) - this.p == ((long) this.j);
    }

    @Override // defpackage.eyel
    public final boolean D() {
        return r() != 0;
    }

    @Override // defpackage.eyel
    public final boolean E(int i) {
        int b = eyjt.b(i);
        if (b == 0) {
            for (int i2 = 0; i2 < 10; i2++) {
                if (a() >= 0) {
                    return true;
                }
            }
            throw new eygu("CodedInputStream encountered a malformed varint.");
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
        if (j >= 0) {
            long j2 = j;
            if (j2 <= S()) {
                byte[] bArr = new byte[j];
                eyjj.k(this.o, bArr, 0L, j2);
                this.o += j2;
                return bArr;
            }
        }
        if (j >= 0 && j <= G()) {
            byte[] bArr2 = new byte[j];
            W(bArr2, j);
            return bArr2;
        }
        if (j > 0) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (j == 0) {
            return eygs.b;
        }
        throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final byte a() {
        if (S() == 0) {
            T();
        }
        long j = this.o;
        this.o = 1 + j;
        return eyjj.a(j);
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
        return (int) ((this.n + this.o) - this.p);
    }

    @Override // defpackage.eyel
    public final int e(int i) {
        if (i < 0) {
            throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int d = i + d();
        int i2 = this.l;
        if (d > i2) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.l = d;
        U();
        return i2;
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
        if (S() < 4) {
            int a = a() & 255;
            int a2 = (a() & 255) << 8;
            return a | a2 | ((a() & 255) << 16) | ((a() & 255) << 24);
        }
        long j = this.o;
        this.o = 4 + j;
        int a3 = eyjj.a(j) & 255;
        int a4 = (eyjj.a(1 + j) & 255) << 8;
        return ((eyjj.a(j + 3) & 255) << 24) | a3 | a4 | ((eyjj.a(2 + j) & 255) << 16);
    }

    @Override // defpackage.eyel
    public final int j() {
        int i;
        long j = this.o;
        if (this.q != j) {
            long j2 = j + 1;
            byte a = eyjj.a(j);
            if (a >= 0) {
                this.o++;
                return a;
            }
            if (this.q - this.o >= 10) {
                long j3 = 2 + j;
                int a2 = (eyjj.a(j2) << 7) ^ a;
                if (a2 < 0) {
                    i = a2 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int a3 = (eyjj.a(j3) << 14) ^ a2;
                    if (a3 >= 0) {
                        i = a3 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int a4 = a3 ^ (eyjj.a(j4) << 21);
                        if (a4 < 0) {
                            i = (-2080896) ^ a4;
                        } else {
                            j4 = 5 + j;
                            byte a5 = eyjj.a(j5);
                            int i2 = (a4 ^ (a5 << 28)) ^ 266354560;
                            if (a5 < 0) {
                                j5 = 6 + j;
                                if (eyjj.a(j4) < 0) {
                                    j4 = 7 + j;
                                    if (eyjj.a(j5) < 0) {
                                        j5 = 8 + j;
                                        if (eyjj.a(j4) < 0) {
                                            j4 = 9 + j;
                                            if (eyjj.a(j5) < 0) {
                                                long j6 = j + 10;
                                                if (eyjj.a(j4) >= 0) {
                                                    i = i2;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.o = j3;
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
            this.m = 0;
            return 0;
        }
        int j = j();
        this.m = j;
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
        if (S() < 8) {
            return ((a() & 255) << 56) | (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24) | ((a() & 255) << 32) | ((a() & 255) << 40) | ((a() & 255) << 48);
        }
        this.o = 8 + this.o;
        return ((eyjj.a(r13 + 6) & 255) << 48) | ((eyjj.a(2 + r13) & 255) << 16) | (eyjj.a(r13) & 255) | ((eyjj.a(1 + r13) & 255) << 8) | ((eyjj.a(3 + r13) & 255) << 24) | ((eyjj.a(r13 + 4) & 255) << 32) | ((eyjj.a(r13 + 5) & 255) << 40) | ((eyjj.a(r13 + 7) & 255) << 56);
    }

    @Override // defpackage.eyel
    public final long r() {
        long j;
        long j2;
        long j3 = this.o;
        if (this.q != j3) {
            long j4 = j3 + 1;
            byte a = eyjj.a(j3);
            if (a >= 0) {
                this.o++;
                return a;
            }
            if (this.q - this.o >= 10) {
                long j5 = 2 + j3;
                int a2 = (eyjj.a(j4) << 7) ^ a;
                if (a2 < 0) {
                    j = a2 ^ (-128);
                } else {
                    long j6 = 3 + j3;
                    int a3 = (eyjj.a(j5) << 14) ^ a2;
                    if (a3 >= 0) {
                        j = a3 ^ 16256;
                    } else {
                        long j7 = 4 + j3;
                        int a4 = a3 ^ (eyjj.a(j6) << 21);
                        if (a4 < 0) {
                            j = (-2080896) ^ a4;
                            j5 = j7;
                        } else {
                            j6 = 5 + j3;
                            long a5 = (eyjj.a(j7) << 28) ^ a4;
                            if (a5 >= 0) {
                                j = 266354560 ^ a5;
                            } else {
                                long j8 = 6 + j3;
                                long a6 = a5 ^ (eyjj.a(j6) << 35);
                                if (a6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    long j9 = 7 + j3;
                                    long a7 = a6 ^ (eyjj.a(j8) << 42);
                                    if (a7 >= 0) {
                                        j = 4363953127296L ^ a7;
                                    } else {
                                        j8 = 8 + j3;
                                        a6 = a7 ^ (eyjj.a(j9) << 49);
                                        if (a6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j3;
                                            long a8 = (a6 ^ (eyjj.a(j8) << 56)) ^ 71499008037633920L;
                                            if (a8 < 0) {
                                                long j10 = j3 + 10;
                                                if (eyjj.a(j9) >= 0) {
                                                    j5 = j10;
                                                    j = a8;
                                                }
                                            } else {
                                                j = a8;
                                            }
                                        }
                                    }
                                    j5 = j9;
                                }
                                j = j2 ^ a6;
                                j5 = j8;
                            }
                        }
                    }
                    j5 = j6;
                }
                this.o = j5;
                return j;
            }
        }
        return s();
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
        if (j > 0) {
            long j2 = this.q;
            long j3 = this.o;
            long j4 = j;
            if (j4 <= j2 - j3) {
                byte[] bArr = new byte[j];
                eyjj.k(j3, bArr, 0L, j4);
                this.o += j4;
                eyee eyeeVar = eyee.b;
                return new eyec(bArr);
            }
        }
        if (j > 0 && j <= G()) {
            byte[] bArr2 = new byte[j];
            W(bArr2, j);
            eyee eyeeVar2 = eyee.b;
            return new eyec(bArr2);
        }
        if (j == 0) {
            return eyee.b;
        }
        if (j < 0) {
            throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.eyel
    public final String x() {
        int j = j();
        if (j > 0) {
            long j2 = this.q;
            long j3 = this.o;
            long j4 = j;
            if (j4 <= j2 - j3) {
                byte[] bArr = new byte[j];
                eyjj.k(j3, bArr, 0L, j4);
                String str = new String(bArr, eygs.a);
                this.o += j4;
                return str;
            }
        }
        if (j > 0 && j <= G()) {
            byte[] bArr2 = new byte[j];
            W(bArr2, j);
            return new String(bArr2, eygs.a);
        }
        if (j == 0) {
            return "";
        }
        if (j < 0) {
            throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.eyel
    public final String y() {
        int j = j();
        if (j > 0) {
            long j2 = this.q;
            long j3 = this.o;
            long j4 = j;
            if (j4 <= j2 - j3) {
                String f = eyjo.f(this.i, (int) (j3 - this.p), j);
                this.o += j4;
                return f;
            }
        }
        if (j >= 0 && j <= G()) {
            byte[] bArr = new byte[j];
            W(bArr, j);
            return eyjo.g(bArr, 0, j);
        }
        if (j == 0) {
            return "";
        }
        if (j <= 0) {
            throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.eyel
    public final void z(int i) {
        if (this.m != i) {
            throw new eygu("Protocol message end-group tag did not match expected tag.");
        }
    }
}
