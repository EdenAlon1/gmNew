package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbo extends hvh implements itu, itg, ixn {
    private fay A;
    private ffji B;
    public jlm a;
    public jpo b;
    public jse c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public ibz h;
    public ffji i;
    public fbi j;
    private ffji k;
    private List l;
    private ffji m;
    private fbe n;
    private Map o;

    public /* synthetic */ fbo(jlm jlmVar, jpo jpoVar, jse jseVar, ffji ffjiVar, int i, boolean z, int i2, int i3, List list, ffji ffjiVar2, fbe fbeVar, ibz ibzVar, ffji ffjiVar3) {
        this.a = jlmVar;
        this.b = jpoVar;
        this.c = jseVar;
        this.k = ffjiVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.l = list;
        this.m = ffjiVar2;
        this.n = fbeVar;
        this.h = ibzVar;
        this.i = ffjiVar3;
    }

    private final fay w(jzn jznVar) {
        fay fayVar;
        fbi fbiVar = this.j;
        if (fbiVar != null && fbiVar.c && (fayVar = fbiVar.d) != null) {
            fayVar.e(jznVar);
            return fayVar;
        }
        fay a = a();
        a.e(jznVar);
        return a;
    }

    public final fay a() {
        if (this.A == null) {
            this.A = new fay(this.a, this.b, this.c, this.d, this.e, this.f, this.l);
        }
        fay fayVar = this.A;
        fayVar.getClass();
        return fayVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r2.c == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    @Override // defpackage.itu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ipo b(defpackage.ipq r8, defpackage.ipl r9, long r10) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbo.b(ipq, ipl, long):ipo");
    }

    @Override // defpackage.hvh
    public final boolean dM() {
        return false;
    }

    @Override // defpackage.ixn
    public final void dO(jkv jkvVar) {
        ffji ffjiVar = this.B;
        if (ffjiVar == null) {
            ffjiVar = new fbj(this);
            this.B = ffjiVar;
        }
        jkr.v(jkvVar, this.a);
        fbi fbiVar = this.j;
        if (fbiVar != null) {
            jkr.x(jkvVar, fbiVar.b);
            jkr.s(jkvVar, fbiVar.c);
        }
        jkr.K(jkvVar, new fbk(this));
        jkr.M(jkvVar, new fbl(this));
        jkr.B(jkvVar, new fbm(this));
        jkr.D(jkvVar, ffjiVar);
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean dZ() {
        return false;
    }

    @Override // defpackage.itu
    public final int e(iny inyVar, inx inxVar, int i) {
        return w(inyVar).a(i, inyVar.q());
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean ea() {
        return false;
    }

    @Override // defpackage.itu
    public final int f(iny inyVar, inx inxVar, int i) {
        return evx.a(w(inyVar).b(inyVar.q()).a());
    }

    @Override // defpackage.itu
    public final int g(iny inyVar, inx inxVar, int i) {
        return w(inyVar).a(i, inyVar.q());
    }

    @Override // defpackage.itu
    public final int h(iny inyVar, inx inxVar, int i) {
        return evx.a(((Number) w(inyVar).b(inyVar.q()).c.a()).floatValue());
    }

    public final void i() {
        this.j = null;
    }

    public final void j(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            a().g(this.a, this.b, this.c, this.d, this.e, this.f, this.l);
        }
        if (this.z) {
            if (z2 || (z && this.B != null)) {
                ixo.a(this);
            }
            if (z2 || z3 || z4) {
                itz.b(this);
                ith.a(this);
            }
            if (z) {
                ith.a(this);
            }
        }
    }

    public final void k() {
        ixo.a(this);
        itz.b(this);
        ith.a(this);
    }

    public final boolean l(ffji ffjiVar, ffji ffjiVar2, fbe fbeVar, ffji ffjiVar3) {
        boolean z;
        if (this.k != ffjiVar) {
            this.k = ffjiVar;
            z = true;
        } else {
            z = false;
        }
        if (this.m != ffjiVar2) {
            this.m = ffjiVar2;
            z = true;
        }
        if (!ffkj.e(this.n, fbeVar)) {
            this.n = fbeVar;
            z = true;
        }
        if (this.i == ffjiVar3) {
            return z;
        }
        this.i = ffjiVar3;
        return true;
    }

    public final boolean n(ibz ibzVar, jpo jpoVar) {
        boolean e = ffkj.e(ibzVar, this.h);
        this.h = ibzVar;
        return (e && jpoVar.w(this.b)) ? false : true;
    }

    public final boolean o(jlm jlmVar) {
        boolean e = ffkj.e(this.a.b, jlmVar.b);
        boolean e2 = ffkj.e(this.a.a, jlmVar.a);
        boolean z = true;
        if (e && e2) {
            z = false;
        }
        if (z) {
            this.a = jlmVar;
        }
        if (!e) {
            i();
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012e A[Catch: all -> 0x01a9, TryCatch #2 {all -> 0x01a9, blocks: (B:42:0x0126, B:44:0x012e, B:45:0x0130, B:47:0x0139, B:48:0x013b, B:50:0x0144, B:51:0x0146, B:53:0x014f, B:71:0x0159, B:73:0x015d, B:77:0x0180, B:78:0x016c, B:80:0x0176, B:81:0x017d, B:82:0x0162), top: B:41:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139 A[Catch: all -> 0x01a9, TryCatch #2 {all -> 0x01a9, blocks: (B:42:0x0126, B:44:0x012e, B:45:0x0130, B:47:0x0139, B:48:0x013b, B:50:0x0144, B:51:0x0146, B:53:0x014f, B:71:0x0159, B:73:0x015d, B:77:0x0180, B:78:0x016c, B:80:0x0176, B:81:0x017d, B:82:0x0162), top: B:41:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144 A[Catch: all -> 0x01a9, TryCatch #2 {all -> 0x01a9, blocks: (B:42:0x0126, B:44:0x012e, B:45:0x0130, B:47:0x0139, B:48:0x013b, B:50:0x0144, B:51:0x0146, B:53:0x014f, B:71:0x0159, B:73:0x015d, B:77:0x0180, B:78:0x016c, B:80:0x0176, B:81:0x017d, B:82:0x0162), top: B:41:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014f A[Catch: all -> 0x01a9, TryCatch #2 {all -> 0x01a9, blocks: (B:42:0x0126, B:44:0x012e, B:45:0x0130, B:47:0x0139, B:48:0x013b, B:50:0x0144, B:51:0x0146, B:53:0x014f, B:71:0x0159, B:73:0x015d, B:77:0x0180, B:78:0x016c, B:80:0x0176, B:81:0x017d, B:82:0x0162), top: B:41:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0185 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0159 A[Catch: all -> 0x01a9, TryCatch #2 {all -> 0x01a9, blocks: (B:42:0x0126, B:44:0x012e, B:45:0x0130, B:47:0x0139, B:48:0x013b, B:50:0x0144, B:51:0x0146, B:53:0x014f, B:71:0x0159, B:73:0x015d, B:77:0x0180, B:78:0x016c, B:80:0x0176, B:81:0x017d, B:82:0x0162), top: B:41:0x0126 }] */
    @Override // defpackage.itg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(defpackage.ifo r21) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbo.s(ifo):void");
    }

    public final boolean v(jpo jpoVar, List list, int i, int i2, boolean z, jse jseVar, int i3) {
        boolean z2 = !this.b.x(jpoVar);
        this.b = jpoVar;
        if (!ffkj.e(this.l, list)) {
            this.l = list;
            z2 = true;
        }
        if (this.g != i) {
            this.g = i;
            z2 = true;
        }
        if (this.f != i2) {
            this.f = i2;
            z2 = true;
        }
        if (this.e != z) {
            this.e = z;
            z2 = true;
        }
        if (!ffkj.e(this.c, jseVar)) {
            this.c = jseVar;
            z2 = true;
        }
        if (!jyw.a(this.d, i3)) {
            this.d = i3;
            z2 = true;
        }
        if (ffkj.e(null, null)) {
            return z2;
        }
        return true;
    }

    @Override // defpackage.itg
    public final /* synthetic */ void u() {
    }
}
