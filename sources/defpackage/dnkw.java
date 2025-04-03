package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnkw implements ffjm {
    final /* synthetic */ dnlc a;

    public dnkw(dnlc dnlcVar) {
        this.a = dnlcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnla.g(this.a.a, hfdVar, 0);
        }
        return ffcu.a;
    }
}
