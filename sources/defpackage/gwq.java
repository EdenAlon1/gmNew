package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gwq extends ffkk implements ffjn {
    final /* synthetic */ ffix a;
    final /* synthetic */ gxa b;
    final /* synthetic */ int c;
    final /* synthetic */ gwb d;
    final /* synthetic */ idh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwq(ffix ffixVar, gxa gxaVar, int i, gwb gwbVar, idh idhVar) {
        super(3);
        this.a = ffixVar;
        this.b = gxaVar;
        this.c = i;
        this.d = gwbVar;
        this.e = idhVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ipo ei;
        ipo ei2;
        ipq ipqVar = (ipq) obj;
        ipl iplVar = (ipl) obj2;
        long j = ((jzk) obj3).a;
        gxo gxoVar = (gxo) this.a.invoke();
        if (!gxoVar.g) {
            ei2 = ipqVar.ei(0, 0, ffem.a, gwn.a);
            return ei2;
        }
        boolean z = this.b.b.x().e == dqs.a;
        boolean z2 = ipqVar.q() == kah.b;
        float a = gxoVar.a();
        iqk e = iplVar.e(z ? jzk.l(jzk.d(j), jzk.b(j), ffln.b(a), ffln.b(a)) : jzk.l(ffln.b(a), ffln.b(a), jzk.c(j), jzk.a(j)));
        float f = 1.0f;
        if (this.c != this.b.b.j()) {
            int i = this.c;
            f = i == 0 ? 0.0f : 1.0f / i;
        }
        ei = ipqVar.ei(e.a, e.b, ffem.a, new gwp(e, f, this.b, gxoVar, this.c, z, this.d, this.e, z2));
        return ei;
    }
}
