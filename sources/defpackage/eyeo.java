package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyeo extends eyer {
    private final byte[] a;
    private final int b;
    private int c;

    public eyeo(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i3 = i + i2;
        int length = bArr.length;
        if ((i | i2 | (length - i3)) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        this.a = bArr;
        this.c = i;
        this.b = i3;
    }

    @Override // defpackage.eyer, defpackage.eydv
    public final void a(byte[] bArr, int i, int i2) {
        e(bArr, i, i2);
    }

    @Override // defpackage.eyer
    public final void aA(eyee eyeeVar) {
        w(eyeeVar.d());
        eyeeVar.p(this);
    }

    @Override // defpackage.eyer
    public final void ax(byte b) {
        int i = this.c;
        try {
            int i2 = i + 1;
            try {
                this.a[i] = b;
                this.c = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new eyep(i, this.b, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // defpackage.eyer
    public final void ay(int i, boolean z) {
        u(i, 0);
        ax(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.eyer
    public final void az(int i, eyee eyeeVar) {
        u(i, 2);
        aA(eyeeVar);
    }

    @Override // defpackage.eyer
    public final int b() {
        return this.b - this.c;
    }

    public final void e(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.a, this.c, i2);
            this.c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new eyep(this.c, this.b, i2, e);
        }
    }

    @Override // defpackage.eyer
    public final void i(int i, int i2) {
        u(i, 5);
        j(i2);
    }

    @Override // defpackage.eyer
    public final void j(int i) {
        int i2 = this.c;
        try {
            byte[] bArr = this.a;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.c = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new eyep(i2, this.b, 4, e);
        }
    }

    @Override // defpackage.eyer
    public final void k(int i, long j) {
        u(i, 1);
        l(j);
    }

    @Override // defpackage.eyer
    public final void l(long j) {
        int i = this.c;
        try {
            byte[] bArr = this.a;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.c = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new eyep(i, this.b, 8, e);
        }
    }

    @Override // defpackage.eyer
    public final void m(int i, int i2) {
        u(i, 0);
        n(i2);
    }

    @Override // defpackage.eyer
    public final void n(int i) {
        if (i >= 0) {
            w(i);
        } else {
            y(i);
        }
    }

    @Override // defpackage.eyer
    public final void o(int i, eyhs eyhsVar, eyik eyikVar) {
        u(i, 2);
        w(((eydl) eyhsVar).getSerializedSize(eyikVar));
        eyikVar.m(eyhsVar, this.f);
    }

    @Override // defpackage.eyer
    public final void p(eyhs eyhsVar) {
        w(eyhsVar.getSerializedSize());
        eyhsVar.writeTo(this);
    }

    @Override // defpackage.eyer
    public final void q(int i, eyhs eyhsVar) {
        u(1, 3);
        v(2, i);
        u(3, 2);
        p(eyhsVar);
        u(1, 4);
    }

    @Override // defpackage.eyer
    public final void r(int i, eyee eyeeVar) {
        u(1, 3);
        v(2, i);
        az(3, eyeeVar);
        u(1, 4);
    }

    @Override // defpackage.eyer
    public final void s(int i, String str) {
        u(i, 2);
        t(str);
    }

    @Override // defpackage.eyer
    public final void t(String str) {
        int i = this.c;
        try {
            int W = W(str.length() * 3);
            int W2 = W(str.length());
            if (W2 != W) {
                w(eyjo.b(str));
                this.c = eyjo.a(str, this.a, this.c, b());
                return;
            }
            int i2 = i + W2;
            this.c = i2;
            int a = eyjo.a(str, this.a, i2, b());
            this.c = i;
            w((a - i) - W2);
            this.c = a;
        } catch (eyjn e) {
            this.c = i;
            ad(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new eyep(e2);
        }
    }

    @Override // defpackage.eyer
    public final void u(int i, int i2) {
        w(eyjt.c(i, i2));
    }

    @Override // defpackage.eyer
    public final void v(int i, int i2) {
        u(i, 0);
        w(i2);
    }

    @Override // defpackage.eyer
    public final void w(int i) {
        int i2;
        int i3 = this.c;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                throw new eyep(i3, this.b, 1, e);
            }
            try {
                this.a[i3] = (byte) (i | 128);
                i >>>= 7;
                i3 = i2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                i3 = i2;
                throw new eyep(i3, this.b, 1, e);
            }
        }
        i2 = i3 + 1;
        this.a[i3] = (byte) i;
        this.c = i2;
    }

    @Override // defpackage.eyer
    public final void x(int i, long j) {
        u(i, 0);
        y(j);
    }

    @Override // defpackage.eyer
    public final void y(long j) {
        int i;
        int i2 = this.c;
        if (!eyer.e || b() < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i3 = i2 + 1;
                    try {
                        this.a[i2] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i2 = i3;
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                        i2 = i3;
                        throw new eyep(i2, this.b, 1, e);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                }
            }
            i = i2 + 1;
            try {
                this.a[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                i2 = i;
                throw new eyep(i2, this.b, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                eyjj.n(this.a, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            eyjj.n(this.a, i2, (byte) j);
        }
        this.c = i;
    }

    @Override // defpackage.eyer
    public final void z(byte[] bArr, int i) {
        w(i);
        e(bArr, 0, i);
    }

    @Override // defpackage.eyer
    public final void aw() {
    }
}
