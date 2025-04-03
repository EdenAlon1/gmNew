package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zke implements ffjm {
    final /* synthetic */ zkk a;
    final /* synthetic */ hvi b;
    final /* synthetic */ hzi c;

    public zke(zkk zkkVar, hvi hviVar, hzi hziVar) {
        this.a = zkkVar;
        this.b = hviVar;
        this.c = hziVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(-494974115);
            zkh.a(this.b, this.a, this.c, hfdVar, 0);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
