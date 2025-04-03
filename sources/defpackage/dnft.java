package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnft implements ffjm {
    final /* synthetic */ dngn a;

    public dnft(dngn dngnVar) {
        this.a = dngnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dngn dngnVar = this.a;
            dngm.i(dngnVar.b, dngnVar.e, hfdVar, 0);
        }
        return ffcu.a;
    }
}
