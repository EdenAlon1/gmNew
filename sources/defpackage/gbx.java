package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gbx extends ffkk implements ffjm {
    final /* synthetic */ ffix a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ffix c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbx(ffix ffixVar, boolean z, ffix ffixVar2, boolean z2) {
        super(2);
        this.a = ffixVar;
        this.b = z;
        this.c = ffixVar2;
        this.d = z2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            ffix ffixVar = this.a;
            boolean z = this.b;
            ffix ffixVar2 = this.c;
            boolean z2 = this.d;
            hve hveVar = hvi.e;
            dxi dxiVar = dxu.a;
            int i = huo.a;
            ipn a = ebm.a(dxiVar, hum.m, hfdVar, 0);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, hveVar);
            int i2 = ist.a;
            ffix ffixVar3 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar3);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            gem.b(ffixVar, null, z, null, null, fym.c, hfdVar, 1572864, 58);
            gem.b(ffixVar2, null, z2, null, null, fym.d, hfdVar, 1572864, 58);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
