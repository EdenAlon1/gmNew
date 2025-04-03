package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nkm implements ndu {
    public final ndu a;
    public lqc c;
    public boolean d;
    private final nkh e;
    private nkj i;
    private int f = 0;
    private int g = 0;
    private byte[] h = lvf.c;
    public final luv b = new luv();

    public nkm(ndu nduVar, nkh nkhVar) {
        this.a = nduVar;
        this.e = nkhVar;
    }

    private final void a(int i) {
        int length = this.h.length;
        int i2 = this.g;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.f;
        int max = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.h;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.f, bArr2, 0, i3);
        this.f = 0;
        this.g = i3;
        this.h = bArr2;
    }

    @Override // defpackage.ndu
    public final /* synthetic */ int e(lpp lppVar, int i, boolean z) {
        return nds.a(this, lppVar, i, z);
    }

    @Override // defpackage.ndu
    public final void i(lqc lqcVar) {
        lti.f(lqcVar.o);
        lti.a(lre.b(lqcVar.o) == 3);
        if (!lqcVar.equals(this.c)) {
            this.c = lqcVar;
            this.i = this.e.c(lqcVar) ? this.e.b(lqcVar) : null;
        }
        if (this.i == null) {
            this.a.i(lqcVar);
            return;
        }
        ndu nduVar = this.a;
        lqb lqbVar = new lqb(lqcVar);
        lqbVar.c("application/x-media3-cues");
        lqbVar.j = lqcVar.o;
        lqbVar.r = Long.MAX_VALUE;
        lqbVar.I = this.e.a(lqcVar);
        nduVar.i(new lqc(lqbVar));
    }

    @Override // defpackage.ndu
    public final /* synthetic */ void m(luv luvVar, int i) {
        nds.b(this, luvVar, i);
    }

    @Override // defpackage.ndu
    public final void n(luv luvVar, int i, int i2) {
        if (this.i == null) {
            this.a.n(luvVar, i, i2);
            return;
        }
        a(i);
        luvVar.F(this.h, this.g, i);
        this.g += i;
    }

    @Override // defpackage.ndu
    public final void o(final long j, final int i, int i2, int i3, ndt ndtVar) {
        if (this.i == null) {
            this.a.o(j, i, i2, i3, ndtVar);
            return;
        }
        lti.b(ndtVar == null, "DRM on subtitles is not supported");
        int i4 = (this.g - i3) - i2;
        try {
            this.i.b(this.h, i4, i2, nki.a, new lts() { // from class: nkl
                @Override // defpackage.lts
                public final void a(Object obj) {
                    nkm nkmVar = nkm.this;
                    njp njpVar = (njp) obj;
                    lti.g(nkmVar.c);
                    byte[] a = njo.a(njpVar.a, njpVar.c);
                    nkmVar.b.H(a);
                    int length = a.length;
                    nkmVar.a.m(nkmVar.b, length);
                    long j2 = njpVar.b;
                    long j3 = j;
                    if (j2 == -9223372036854775807L) {
                        lti.c(nkmVar.c.t == Long.MAX_VALUE);
                    } else {
                        long j4 = nkmVar.c.t;
                        j3 = j4 == Long.MAX_VALUE ? j3 + j2 : j2 + j4;
                    }
                    nkmVar.a.o(j3, i | 1, length, 0, null);
                }
            });
        } catch (RuntimeException e) {
            if (!this.d) {
                throw e;
            }
            luj.g("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.f = i5;
        if (i5 == this.g) {
            this.f = 0;
            this.g = 0;
        }
    }

    @Override // defpackage.ndu
    public final int w(lpp lppVar, int i, boolean z) {
        if (this.i == null) {
            return this.a.w(lppVar, i, z);
        }
        a(i);
        int a = lppVar.a(this.h, this.g, i);
        if (a != -1) {
            this.g += a;
            return a;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.ndu
    public final /* synthetic */ void v() {
    }
}
