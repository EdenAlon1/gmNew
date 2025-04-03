package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gld extends ffkk implements ffjm {
    final /* synthetic */ ffjn a;
    final /* synthetic */ glk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gld(ffjn ffjnVar, glk glkVar) {
        super(2);
        this.a = ffjnVar;
        this.b = glkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            ffjn ffjnVar = this.a;
            glk glkVar = this.b;
            hve hveVar = hvi.e;
            int i = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, hveVar);
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
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            ffjnVar.a(glkVar, hfdVar, 6);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
