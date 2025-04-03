package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbkm implements ffjo {
    final /* synthetic */ olu a;
    final /* synthetic */ dbku b;
    final /* synthetic */ hkx c;

    public dbkm(olu oluVar, dbku dbkuVar, hkx hkxVar) {
        this.a = oluVar;
        this.b = dbkuVar;
        this.c = hkxVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        hfd hfdVar = (hfd) obj3;
        int intValue2 = ((Number) obj4).intValue();
        ((edi) obj).getClass();
        if ((intValue2 & 48) == 0) {
            intValue2 |= true != hfdVar.B(intValue) ? 16 : 32;
        }
        if ((intValue2 & 145) == 144 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dbjd dbjdVar = (dbjd) this.a.f(intValue);
            if (dbjdVar != null) {
                this.b.e(null, !dbku.d(this.c), dbjdVar.b, dbjdVar.c, dbjdVar.d, hfdVar, 0);
            }
        }
        return ffcu.a;
    }
}
