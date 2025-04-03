package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnjm implements ffjm {
    final /* synthetic */ dnjs a;

    public dnjm(dnjs dnjsVar) {
        this.a = dnjsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnjs dnjsVar = this.a;
            dnjq.b(dnjsVar.a, dnjsVar.d, hfdVar, 0);
        }
        return ffcu.a;
    }
}
