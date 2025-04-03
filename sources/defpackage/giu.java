package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class giu extends ffkk implements ffjm {
    final /* synthetic */ hkx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public giu(hkx hkxVar) {
        super(2);
        this.a = hkxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            c = jjs.c(hvi.e, false, git.a);
            hkx hkxVar = this.a;
            int i = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(hfdVar);
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
            hlc.b(hfdVar, a, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            ((ffjm) hkxVar.a()).a(hfdVar, 0);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
