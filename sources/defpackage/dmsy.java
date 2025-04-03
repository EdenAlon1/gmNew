package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmsy implements ffjn {
    final /* synthetic */ hkx a;
    final /* synthetic */ boolean b;

    public dmsy(hkx hkxVar, boolean z) {
        this.a = hkxVar;
        this.b = z;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ffjm ffjmVar = (ffjm) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ffjmVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.F(ffjmVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwjo dwjoVar = dwjo.a;
            ebe g = eba.g(0.0f, 12.0f, 1);
            hfdVar.v(47055276);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new dwn();
                hfdVar.y(f);
            }
            dwn dwnVar = (dwn) f;
            hfdVar.o();
            int i = jwn.d;
            dwjoVar.a((String) this.a.a(), ffjmVar, true, jwm.a, dwnVar, hpx.d(-428274746, new dmsx(this.b), hfdVar), null, null, g, dmsm.a, hfdVar, ((intValue << 3) & 112) | 100887936, 114819072);
        }
        return ffcu.a;
    }
}
