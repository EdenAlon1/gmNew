package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmxq implements ffjm {
    final /* synthetic */ dyh a;
    final /* synthetic */ dmxv b;
    final /* synthetic */ kak c;

    public dmxq(dyh dyhVar, dmxv dmxvVar, kak kakVar) {
        this.a = dyhVar;
        this.b = dmxvVar;
        this.c = kakVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dyh dyhVar = this.a;
            dmxv dmxvVar = this.b;
            dmxr.d(dyhVar, dmxvVar, this.c, dmxvVar.k, hfdVar, 0);
        }
        return ffcu.a;
    }
}
