package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahsl implements ffjm {
    final /* synthetic */ hkx a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ffxx c;

    public ahsl(hkx hkxVar, boolean z, ffxx ffxxVar) {
        this.a = hkxVar;
        this.b = z;
        this.c = ffxxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hkx hkxVar = this.a;
            cwoi.a(null, hkxVar != null ? (ffjm) hkxVar.a() : null, this.b, null, false, hpx.d(-693138264, new ahsk(this.c), hfdVar), hfdVar, 196608, 25);
        }
        return ffcu.a;
    }
}
