package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hch extends ffkk implements ffjm {
    final /* synthetic */ hho a;
    final /* synthetic */ gqz b;
    final /* synthetic */ ebe c;
    final /* synthetic */ ffjm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hch(hho hhoVar, gqz gqzVar, ebe ebeVar, ffjm ffjmVar) {
        super(2);
        this.a = hhoVar;
        this.b = gqzVar;
        this.c = ebeVar;
        this.d = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi a = ioe.a(hvi.e, "Container");
            final hho hhoVar = this.a;
            hvi c = hxs.c(a, new gjs(new ffkm(hhoVar) { // from class: hcg
                @Override // defpackage.ffkm, defpackage.ffmu
                public final Object a() {
                    return ((hho) this.g).a();
                }
            }, this.c, ((gqy) this.b).a));
            ffjm ffjmVar = this.d;
            int i = huo.a;
            ipn a2 = dyc.a(hum.a, true);
            int a3 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, c);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a2, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar2);
            }
            hlc.b(hfdVar, b, iss.c);
            ffjmVar.a(hfdVar, 0);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
