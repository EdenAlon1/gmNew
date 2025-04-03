package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yex implements yei {
    public final ffjm a;
    public final ffji b;
    private final ffhd c;
    private final ffji d;
    private final ffjm e;
    private final ffjm f;

    public yex(ffhd ffhdVar, ffji ffjiVar, ffjm ffjmVar, ffji ffjiVar2, ffjm ffjmVar2, ffjm ffjmVar3) {
        this.c = ffhdVar;
        this.d = ffjiVar;
        this.a = ffjmVar;
        this.b = ffjiVar2;
        this.e = ffjmVar2;
        this.f = ffjmVar3;
    }

    @Override // defpackage.yei
    public final Object a(xhs xhsVar, bswn bswnVar, ffgu ffguVar) {
        Object a = ffra.a(ekxi.a(this.c), new yew(null, this, xhsVar, bswnVar), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    @Override // defpackage.yei
    public final void c(bswp bswpVar, xhu xhuVar) {
        xhuVar.getClass();
        this.e.a(bswpVar, this.d.invoke(xhuVar));
    }

    @Override // defpackage.yei
    public final void d(bsxy bsxyVar, xhu xhuVar) {
        this.f.a(bsxyVar, this.d.invoke(xhuVar));
    }

    @Override // defpackage.yei
    public final boolean e(ydx ydxVar) {
        return ydxVar.a(this.d);
    }
}
