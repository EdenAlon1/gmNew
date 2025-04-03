package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dngi implements ffjm {
    final /* synthetic */ dngv a;

    public dngi(dngv dngvVar) {
        this.a = dngvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dngv dngvVar = this.a;
            dngm.g(dngvVar.c, dngvVar.e, hfdVar, 0);
        }
        return ffcu.a;
    }
}
