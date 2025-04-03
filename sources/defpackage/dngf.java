package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dngf implements ffjm {
    final /* synthetic */ dngt a;

    public dngf(dngt dngtVar) {
        this.a = dngtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dngt dngtVar = this.a;
            dngm.g(dngtVar.c, dngtVar.d, hfdVar, 0);
        }
        return ffcu.a;
    }
}
