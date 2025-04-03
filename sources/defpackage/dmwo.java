package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmwo implements ffjm {
    final /* synthetic */ dmvq a;

    public dmwo(dmvq dmvqVar) {
        this.a = dmvqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmwr.b(this.a.g, hfdVar, 0);
        }
        return ffcu.a;
    }
}
