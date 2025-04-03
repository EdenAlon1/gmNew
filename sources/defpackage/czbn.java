package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czbn implements ffjo {
    final /* synthetic */ cvo a;
    final /* synthetic */ czbe b;
    final /* synthetic */ hkx c;

    public czbn(cvo cvoVar, czbe czbeVar, hkx hkxVar) {
        this.a = cvoVar;
        this.b = czbeVar;
        this.c = hkxVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        cqq cqqVar = (cqq) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        hfd hfdVar = (hfd) obj3;
        int intValue = ((Number) obj4).intValue() << 6;
        cqqVar.getClass();
        int i = intValue & 896;
        if (booleanValue) {
            hfdVar.v(-859628439);
            czah.f(this.a, this.b.i, cqqVar, hfdVar, i | 64);
            hfdVar.o();
        } else {
            hfdVar.v(-859781641);
            cvo cvoVar = this.a;
            czal a = czbr.a(this.c);
            a.getClass();
            czbr.c(cvoVar, a, cqqVar, hfdVar, i);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
