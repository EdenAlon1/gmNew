package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyeq extends eyen {
    private final OutputStream g;

    public eyeq(OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.g = outputStream;
    }

    private final void au() {
        this.g.write(this.a, 0, this.c);
        this.c = 0;
    }

    private final void av(int i) {
        if (this.b - this.c < i) {
            au();
        }
    }

    public final void A(byte[] bArr, int i, int i2) {
        int i3 = this.b;
        int i4 = this.c;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.a, i4, i2);
            this.c += i2;
            this.d += i2;
            return;
        }
        System.arraycopy(bArr, i, this.a, i4, i5);
        int i6 = i + i5;
        this.c = this.b;
        this.d += i5;
        au();
        int i7 = i2 - i5;
        if (i7 <= this.b) {
            System.arraycopy(bArr, i6, this.a, 0, i7);
            this.c = i7;
        } else {
            this.g.write(bArr, i6, i7);
        }
        this.d += i7;
    }

    @Override // defpackage.eyer, defpackage.eydv
    public final void a(byte[] bArr, int i, int i2) {
        A(bArr, i, i2);
    }

    @Override // defpackage.eyer
    public final void aA(eyee eyeeVar) {
        w(eyeeVar.d());
        eyeeVar.p(this);
    }

    @Override // defpackage.eyer
    public final void aw() {
        if (this.c > 0) {
            au();
        }
    }

    @Override // defpackage.eyer
    public final void ax(byte b) {
        if (this.c == this.b) {
            au();
        }
        c(b);
    }

    @Override // defpackage.eyer
    public final void ay(int i, boolean z) {
        av(11);
        f(i, 0);
        c(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.eyer
    public final void az(int i, eyee eyeeVar) {
        u(i, 2);
        aA(eyeeVar);
    }

    @Override // defpackage.eyer
    public final void i(int i, int i2) {
        av(14);
        f(i, 5);
        d(i2);
    }

    @Override // defpackage.eyer
    public final void j(int i) {
        av(4);
        d(i);
    }

    @Override // defpackage.eyer
    public final void k(int i, long j) {
        av(18);
        f(i, 1);
        e(j);
    }

    @Override // defpackage.eyer
    public final void l(long j) {
        av(8);
        e(j);
    }

    @Override // defpackage.eyer
    public final void m(int i, int i2) {
        av(20);
        f(i, 0);
        if (i2 >= 0) {
            g(i2);
        } else {
            h(i2);
        }
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
        int b;
        try {
            int length = str.length() * 3;
            int W = W(length);
            int i = W + length;
            int i2 = this.b;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int a = eyjo.a(str, bArr, 0, length);
                w(a);
                A(bArr, 0, a);
                return;
            }
            if (i > i2 - this.c) {
                au();
            }
            int W2 = W(str.length());
            int i3 = this.c;
            try {
                if (W2 == W) {
                    int i4 = i3 + W2;
                    this.c = i4;
                    int a2 = eyjo.a(str, this.a, i4, this.b - i4);
                    this.c = i3;
                    b = (a2 - i3) - W2;
                    g(b);
                    this.c = a2;
                } else {
                    b = eyjo.b(str);
                    g(b);
                    this.c = eyjo.a(str, this.a, this.c, b);
                }
                this.d += b;
            } catch (eyjn e) {
                this.d -= this.c - i3;
                this.c = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new eyep(e2);
            }
        } catch (eyjn e3) {
            ad(str, e3);
        }
    }

    @Override // defpackage.eyer
    public final void u(int i, int i2) {
        w(eyjt.c(i, i2));
    }

    @Override // defpackage.eyer
    public final void v(int i, int i2) {
        av(20);
        f(i, 0);
        g(i2);
    }

    @Override // defpackage.eyer
    public final void w(int i) {
        av(5);
        g(i);
    }

    @Override // defpackage.eyer
    public final void x(int i, long j) {
        av(20);
        f(i, 0);
        h(j);
    }

    @Override // defpackage.eyer
    public final void y(long j) {
        av(10);
        h(j);
    }

    @Override // defpackage.eyer
    public final void z(byte[] bArr, int i) {
        w(i);
        A(bArr, 0, i);
    }
}
