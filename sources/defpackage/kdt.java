package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kdt extends ffkk implements ffjm {
    final /* synthetic */ kes a;
    final /* synthetic */ hkx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdt(kes kesVar, hkx hkxVar) {
        super(2);
        this.a = kesVar;
        this.b = hkxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            c = jjs.c(hvi.e, false, kdr.a);
            boolean F = hfdVar.F(this.a);
            kes kesVar = this.a;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new kds(kesVar);
                hfdVar.y(f);
            }
            hvi a = hxe.a(iqd.a(c, (ffji) f), true != ((Boolean) this.a.h.a()).booleanValue() ? 0.0f : 1.0f);
            hkx hkxVar = this.b;
            int i2 = kdy.a;
            ffjm ffjmVar = (ffjm) hkxVar.a();
            kdx kdxVar = kdx.a;
            int a2 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, a);
            int i3 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, kdxVar, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
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
