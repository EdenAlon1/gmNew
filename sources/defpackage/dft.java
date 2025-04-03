package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dft extends hvh implements itg {
    public boolean a;
    public boolean b;
    public boolean c;
    public final dwn d;

    public dft(dwn dwnVar) {
        this.d = dwnVar;
    }

    @Override // defpackage.hvh
    public final void dT() {
        ffqy.d(D(), null, null, new dfs(this, null), 3);
    }

    @Override // defpackage.itg
    public final void s(ifo ifoVar) {
        long f;
        long f2;
        ifoVar.p();
        if (this.a) {
            f2 = iby.f(ibw.d(r1), ibw.c(r1), ibw.b(r1), 0.3f, ibw.f(ibw.a));
            ifoVar.r(f2, 0L, (r20 & 4) != 0 ? ifq.c(ifoVar.b(), 0L) : ifoVar.b(), (r20 & 8) != 0 ? 1.0f : 0.0f, (r20 & 16) != 0 ? ifu.a : null, (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? 3 : 0);
        } else if (this.b || this.c) {
            f = iby.f(ibw.d(r1), ibw.c(r1), ibw.b(r1), 0.1f, ibw.f(ibw.a));
            ifoVar.r(f, 0L, (r20 & 4) != 0 ? ifq.c(ifoVar.b(), 0L) : ifoVar.b(), (r20 & 8) != 0 ? 1.0f : 0.0f, (r20 & 16) != 0 ? ifu.a : null, (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? 3 : 0);
        }
    }

    @Override // defpackage.itg
    public final /* synthetic */ void u() {
    }
}
