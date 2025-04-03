package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dngb implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ dngp b;

    public dngb(String str, dngp dngpVar) {
        this.a = str;
        this.b = dngpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dngm.g(this.a, this.b.d, hfdVar, 0);
        }
        return ffcu.a;
    }
}
