package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fop extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ idh b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ boolean f;
    final /* synthetic */ ffix g;
    final /* synthetic */ ffjm h;
    final /* synthetic */ dwn i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fop(hvi hviVar, idh idhVar, long j, float f, float f2, dwn dwnVar, boolean z, ffix ffixVar, ffjm ffjmVar) {
        super(2);
        this.a = hviVar;
        this.b = idhVar;
        this.c = j;
        this.d = f;
        this.e = f2;
        this.i = dwnVar;
        this.f = z;
        this.g = ffixVar;
        this.h = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi a;
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            hvi hviVar = this.a;
            a = hxo.a(dee.a(hyc.a(fky.a(hviVar), this.e, r3, 0L, 0L, 24).a(hvi.e), C0001for.c(this.c, (fjc) hfdVar.e(fkd.a), this.d, hfdVar), r3), this.b);
            hvi c = dfb.c(a, this.i, fmn.a(false, 0.0f, 7), this.f, null, null, this.g, 24);
            ffjm ffjmVar = this.h;
            int i2 = huo.a;
            ipn a2 = dyc.a(hum.a, true);
            int a3 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, c);
            int i3 = ist.a;
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
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
