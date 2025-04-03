package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnhx implements ffjm {
    final /* synthetic */ dnia a;

    public dnhx(dnia dniaVar) {
        this.a = dniaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else if (this.a.c != null) {
            hfdVar.v(-2134505849);
            dwho.a(dnaa.a(this.a.c, hfdVar), null, null, 0L, hfdVar, 0, 12);
            hfdVar.o();
        } else {
            hfdVar.v(-2134410772);
            dnia dniaVar = this.a;
            dwil.a(dniaVar.d, dniaVar.e, null, false, null, null, hfdVar, 0, 60);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
