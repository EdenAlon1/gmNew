package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emft implements ffjm {
    final /* synthetic */ hkx a;
    final /* synthetic */ emge b;

    public emft(hkx hkxVar, emge emgeVar) {
        this.a = hkxVar;
        this.b = emgeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            emfg.a(this.a, this.b.p.size(), hfdVar, 0);
        }
        return ffcu.a;
    }
}
