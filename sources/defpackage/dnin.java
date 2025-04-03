package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnin implements ffjm {
    final /* synthetic */ dnir a;

    public dnin(dnir dnirVar) {
        this.a = dnirVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dniq.g(this.a.b, hfdVar, 0);
        }
        return ffcu.a;
    }
}
