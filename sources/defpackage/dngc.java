package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dngc implements ffjm {
    final /* synthetic */ dngp a;

    public dngc(dngp dngpVar) {
        this.a = dngpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dngp dngpVar = this.a;
            dngm.i(dngpVar.b, dngpVar.d, hfdVar, 0);
        }
        return ffcu.a;
    }
}
