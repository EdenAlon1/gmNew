package defpackage;

import androidx.car.app.model.Alert;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyek extends eyel {
    public static final /* synthetic */ int a = 0;
    private final ByteBuffer h;
    private final long i;
    private long j;
    private long k;
    private final long l;
    private int m;
    private int n;
    private int o = Alert.DURATION_SHOW_INDEFINITELY;

    public eyek(ByteBuffer byteBuffer) {
        this.h = byteBuffer.duplicate();
        long e = eyjj.e(byteBuffer);
        this.i = e;
        this.j = byteBuffer.limit() + e;
        long position = e + byteBuffer.position();
        this.k = position;
        this.l = position;
    }

    private final int G(long j) {
        return (int) (j - this.i);
    }

    private final int S() {
        return (int) (this.j - this.k);
    }

    private final void T() {
        long j = this.j + this.m;
        this.j = j;
        int i = (int) (j - this.l);
        int i2 = this.o;
        if (i <= i2) {
            this.m = 0;
            return;
        }
        int i3 = i - i2;
        this.m = i3;
        this.j = j - i3;
    }

    @Override // defpackage.eyel
    public final void A(int i) {
        this.o = i;
        T();
    }

    public final void B(int i) {
        if (i >= 0 && i <= S()) {
            this.k += i;
        } else {
            if (i >= 0) {
                throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // defpackage.eyel
    public final boolean C() {
        return this.k == this.j;
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
            if (S() < 10) {
                while (i2 < 10) {
                    if (a() < 0) {
                        i2++;
                    }
                }
                throw new eygu("CodedInputStream encountered a malformed varint.");
            }
            while (i2 < 10) {
                long j = this.k;
                this.k = 1 + j;
                if (eyjj.a(j) < 0) {
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
        if (j < 0 || j > S()) {
            if (j > 0) {
                throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (j == 0) {
                return eygs.b;
            }
            throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArr = new byte[j];
        long j2 = this.k;
        long j3 = j;
        long j4 = j2 + j3;
        ByteBuffer byteBuffer = this.h;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        try {
            try {
                byteBuffer.position(G(j2));
                byteBuffer.limit(G(j4));
                ByteBuffer slice = this.h.slice();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
                slice.get(bArr);
                this.k += j3;
                return bArr;
            } catch (IllegalArgumentException e) {
                eygu eyguVar = new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                eyguVar.initCause(e);
                throw eyguVar;
            }
        } catch (Throwable th) {
            byteBuffer.position(position);
            byteBuffer.limit(limit);
            throw th;
        }
    }

    public final byte a() {
        long j = this.k;
        if (j == this.j) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.k = 1 + j;
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
        return (int) (this.k - this.l);
    }

    @Override // defpackage.eyel
    public final int e(int i) {
        if (i < 0) {
            throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int d = i + d();
        int i2 = this.o;
        if (d > i2) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.o = d;
        T();
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
        long j = this.k;
        if (this.j - j < 4) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.k = 4 + j;
        int a2 = eyjj.a(j) & 255;
        int a3 = eyjj.a(1 + j) & 255;
        int a4 = eyjj.a(2 + j) & 255;
        return ((eyjj.a(j + 3) & 255) << 24) | (a3 << 8) | a2 | (a4 << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (defpackage.eyjj.a(r3) >= 0) goto L33;
     */
    @Override // defpackage.eyel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j() {
        /*
            r9 = this;
            long r0 = r9.k
            long r2 = r9.j
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L92
        La:
            r2 = 1
            long r2 = r2 + r0
            byte r4 = defpackage.eyjj.a(r0)
            if (r4 < 0) goto L16
            r9.k = r2
            return r4
        L16:
            long r5 = r9.j
            long r5 = r5 - r2
            r7 = 9
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L92
            r5 = 2
            long r5 = r5 + r0
            byte r2 = defpackage.eyjj.a(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r4
            if (r2 >= 0) goto L2e
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8f
        L2e:
            r3 = 3
            long r3 = r3 + r0
            byte r5 = defpackage.eyjj.a(r5)
            int r5 = r5 << 14
            r2 = r2 ^ r5
            if (r2 < 0) goto L3e
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L3c:
            r5 = r3
            goto L8f
        L3e:
            r5 = 4
            long r5 = r5 + r0
            byte r3 = defpackage.eyjj.a(r3)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L4f
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L8f
        L4f:
            r3 = 5
            long r3 = r3 + r0
            byte r5 = defpackage.eyjj.a(r5)
            int r6 = r5 << 28
            r2 = r2 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r6
            if (r5 >= 0) goto L8d
            r5 = 6
            long r5 = r5 + r0
            byte r3 = defpackage.eyjj.a(r3)
            if (r3 >= 0) goto L8b
            r3 = 7
            long r3 = r3 + r0
            byte r5 = defpackage.eyjj.a(r5)
            if (r5 >= 0) goto L8d
            r5 = 8
            long r5 = r5 + r0
            byte r3 = defpackage.eyjj.a(r3)
            if (r3 >= 0) goto L8b
            long r3 = r0 + r7
            byte r5 = defpackage.eyjj.a(r5)
            if (r5 >= 0) goto L8d
            r5 = 10
            long r5 = r5 + r0
            byte r0 = defpackage.eyjj.a(r3)
            if (r0 < 0) goto L92
        L8b:
            r0 = r2
            goto L8f
        L8d:
            r0 = r2
            goto L3c
        L8f:
            r9.k = r5
            return r0
        L92:
            long r0 = r9.s()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyek.j():int");
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
            this.n = 0;
            return 0;
        }
        int j = j();
        this.n = j;
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
        long j = this.k;
        if (this.j - j < 8) {
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.k = 8 + j;
        long a2 = eyjj.a(j);
        long a3 = eyjj.a(1 + j);
        long a4 = eyjj.a(2 + j);
        long a5 = eyjj.a(3 + j);
        long a6 = eyjj.a(4 + j);
        return ((eyjj.a(j + 7) & 255) << 56) | (a2 & 255) | ((a3 & 255) << 8) | ((a4 & 255) << 16) | ((a5 & 255) << 24) | ((a6 & 255) << 32) | ((eyjj.a(5 + j) & 255) << 40) | ((eyjj.a(6 + j) & 255) << 48);
    }

    @Override // defpackage.eyel
    public final long r() {
        long j;
        long j2;
        int i;
        long j3 = this.k;
        if (this.j != j3) {
            long j4 = 1 + j3;
            byte a2 = eyjj.a(j3);
            if (a2 >= 0) {
                this.k = j4;
                return a2;
            }
            if (this.j - j4 >= 9) {
                long j5 = 2 + j3;
                int a3 = (eyjj.a(j4) << 7) ^ a2;
                if (a3 >= 0) {
                    long j6 = 3 + j3;
                    int a4 = a3 ^ (eyjj.a(j5) << 14);
                    if (a4 >= 0) {
                        j = a4 ^ 16256;
                    } else {
                        j5 = 4 + j3;
                        int a5 = a4 ^ (eyjj.a(j6) << 21);
                        if (a5 < 0) {
                            i = (-2080896) ^ a5;
                        } else {
                            j6 = 5 + j3;
                            long a6 = (eyjj.a(j5) << 28) ^ a5;
                            if (a6 < 0) {
                                long j7 = 6 + j3;
                                long a7 = (eyjj.a(j6) << 35) ^ a6;
                                if (a7 >= 0) {
                                    long j8 = 7 + j3;
                                    long a8 = a7 ^ (eyjj.a(j7) << 42);
                                    if (a8 >= 0) {
                                        j = 4363953127296L ^ a8;
                                        j5 = j8;
                                    } else {
                                        j7 = 8 + j3;
                                        a7 = a8 ^ (eyjj.a(j8) << 49);
                                        if (a7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j5 = j3 + 9;
                                            long a9 = (a7 ^ (eyjj.a(j7) << 56)) ^ 71499008037633920L;
                                            if (a9 < 0) {
                                                long j9 = j3 + 10;
                                                if (eyjj.a(j5) >= 0) {
                                                    j5 = j9;
                                                }
                                            }
                                            j = a9;
                                        }
                                    }
                                    this.k = j5;
                                    return j;
                                }
                                j2 = -34093383808L;
                                j = j2 ^ a7;
                                j5 = j7;
                                this.k = j5;
                                return j;
                            }
                            j = 266354560 ^ a6;
                        }
                    }
                    j5 = j6;
                    this.k = j5;
                    return j;
                }
                i = a3 ^ (-128);
                j = i;
                this.k = j5;
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
        if (j <= 0 || j > S()) {
            if (j == 0) {
                return eyee.b;
            }
            if (j < 0) {
                throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[j];
        long j2 = j;
        eyjj.k(this.k, bArr, 0L, j2);
        this.k += j2;
        eyee eyeeVar = eyee.b;
        return new eyec(bArr);
    }

    @Override // defpackage.eyel
    public final String x() {
        int j = j();
        if (j <= 0 || j > S()) {
            if (j == 0) {
                return "";
            }
            if (j < 0) {
                throw new eygu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[j];
        long j2 = j;
        eyjj.k(this.k, bArr, 0L, j2);
        String str = new String(bArr, eygs.a);
        this.k += j2;
        return str;
    }

    @Override // defpackage.eyel
    public final String y() {
        int j = j();
        if (j > 0 && j <= S()) {
            String f = eyjo.f(this.h, G(this.k), j);
            this.k += j;
            return f;
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
        if (this.n != i) {
            throw new eygu("Protocol message end-group tag did not match expected tag.");
        }
    }
}
