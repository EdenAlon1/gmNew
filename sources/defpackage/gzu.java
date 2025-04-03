package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzu extends ffkk implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ ffjm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzu(String str, ffjm ffjmVar) {
        super(2);
        this.a = str;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            String str = this.a;
            hve hveVar = hvi.e;
            boolean D = hfdVar.D(str);
            String str2 = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new gzt(str2);
                hfdVar.y(f);
            }
            c = jjs.c(hveVar, false, (ffji) f);
            ffjm ffjmVar = this.b;
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
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
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
