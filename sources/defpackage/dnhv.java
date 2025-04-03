package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnhv implements ffjm {
    final /* synthetic */ dnia a;

    public dnhv(dnia dniaVar) {
        this.a = dniaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnia dniaVar = this.a;
            dwil.a(dniaVar.d, dniaVar.e, null, false, null, null, hfdVar, 0, 60);
        }
        return ffcu.a;
    }
}
