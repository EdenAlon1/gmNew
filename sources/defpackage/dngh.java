package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dngh implements ffjm {
    final /* synthetic */ dngv a;

    public dngh(dngv dngvVar) {
        this.a = dngvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dngv dngvVar = this.a;
            dngm.i(dngvVar.b, dngvVar.e, hfdVar, 0);
        }
        return ffcu.a;
    }
}
