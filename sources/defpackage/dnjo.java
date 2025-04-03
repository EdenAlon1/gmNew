package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnjo implements ffjm {
    final /* synthetic */ dnjs a;

    public dnjo(dnjs dnjsVar) {
        this.a = dnjsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnjs dnjsVar = this.a;
            dwil.a(dnjsVar.c, dnjsVar.e, null, false, null, null, hfdVar, 0, 60);
        }
        return ffcu.a;
    }
}
