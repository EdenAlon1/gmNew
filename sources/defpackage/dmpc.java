package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmpc implements ffjm {
    final /* synthetic */ dmpf a;

    public dmpc(dmpf dmpfVar) {
        this.a = dmpfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmpe.d(this.a, hfdVar, 0);
        }
        return ffcu.a;
    }
}
