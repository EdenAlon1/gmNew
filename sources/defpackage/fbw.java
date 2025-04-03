package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbw extends hvh implements itu, itg, ixn {
    public String a;
    public jpo b;
    public jse c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public ibz h;
    public ffji i;
    public fbq j;
    private Map k;
    private faz l;

    public fbw(String str, jpo jpoVar, jse jseVar, int i, boolean z, int i2, int i3, ibz ibzVar) {
        this.a = str;
        this.b = jpoVar;
        this.c = jseVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = ibzVar;
    }

    private final faz k(iny inyVar) {
        faz l = l();
        l.d(inyVar);
        return l;
    }

    private final faz l() {
        faz fazVar;
        fbq fbqVar = this.j;
        if (fbqVar != null) {
            if (true != fbqVar.b) {
                fbqVar = null;
            }
            if (fbqVar != null && (fazVar = fbqVar.c) != null) {
                return fazVar;
            }
        }
        return a();
    }

    public final faz a() {
        if (this.l == null) {
            this.l = new faz(this.a, this.b, this.c, this.d, this.e, this.f);
        }
        faz fazVar = this.l;
        fazVar.getClass();
        return fazVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010e  */
    @Override // defpackage.itu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ipo b(defpackage.ipq r18, defpackage.ipl r19, long r20) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbw.b(ipq, ipl, long):ipo");
    }

    @Override // defpackage.hvh
    public final boolean dM() {
        return false;
    }

    @Override // defpackage.ixn
    public final void dO(jkv jkvVar) {
        ffji ffjiVar = this.i;
        if (ffjiVar == null) {
            ffjiVar = new fbr(this);
            this.i = ffjiVar;
        }
        jkr.v(jkvVar, new jlm(this.a));
        fbq fbqVar = this.j;
        if (fbqVar != null) {
            jkr.s(jkvVar, fbqVar.b);
            jkr.x(jkvVar, new jlm(fbqVar.a));
        }
        jkr.K(jkvVar, new fbs(this));
        jkr.M(jkvVar, new fbt(this));
        jkr.B(jkvVar, new fbu(this));
        jkr.D(jkvVar, ffjiVar);
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean dZ() {
        return false;
    }

    @Override // defpackage.itu
    public final int e(iny inyVar, inx inxVar, int i) {
        return k(inyVar).a(i, inyVar.q());
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean ea() {
        return false;
    }

    @Override // defpackage.itu
    public final int f(iny inyVar, inx inxVar, int i) {
        return evx.a(k(inyVar).c(inyVar.q()).a());
    }

    @Override // defpackage.itu
    public final int g(iny inyVar, inx inxVar, int i) {
        return k(inyVar).a(i, inyVar.q());
    }

    @Override // defpackage.itu
    public final int h(iny inyVar, inx inxVar, int i) {
        return evx.a(k(inyVar).c(inyVar.q()).b());
    }

    public final void i() {
        this.j = null;
    }

    public final void j() {
        ixo.a(this);
        itz.b(this);
        ith.a(this);
    }

    @Override // defpackage.itg
    public final void s(ifo ifoVar) {
        if (this.z) {
            faz l = l();
            jmf jmfVar = l.g;
            if (jmfVar == null) {
                dwv.a("no paragraph (layoutCache=" + this.l + ", textSubstitution=" + this.j + ')');
                throw new ffbx();
            }
            ibt b = ifoVar.t().b();
            boolean z = l.h;
            if (z) {
                long j = l.i;
                b.l();
                b.a(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                jyk t = this.b.t();
                if (t == null) {
                    t = jyk.a;
                }
                jyk jykVar = t;
                idg k = this.b.k();
                if (k == null) {
                    k = idg.a;
                }
                idg idgVar = k;
                ifs l2 = this.b.l();
                if (l2 == null) {
                    l2 = ifu.a;
                }
                ifs ifsVar = l2;
                ibq j2 = this.b.j();
                if (j2 != null) {
                    jmfVar.n(b, j2, this.b.a(), idgVar, jykVar, ifsVar);
                } else {
                    ibz ibzVar = this.h;
                    long a = ibzVar != null ? ibzVar.a() : ibw.h;
                    if (a == 16) {
                        a = this.b.f() != 16 ? this.b.f() : ibw.a;
                    }
                    jmfVar.m(b, a, idgVar, jykVar, ifsVar);
                }
                if (z) {
                    b.j();
                }
            } catch (Throwable th) {
                if (z) {
                    b.j();
                }
                throw th;
            }
        }
    }

    @Override // defpackage.itg
    public final /* synthetic */ void u() {
    }
}
