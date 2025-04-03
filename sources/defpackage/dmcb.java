package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmcb implements ffjn {
    final /* synthetic */ dmaw a;

    public dmcb(dmaw dmawVar) {
        this.a = dmawVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dyh) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmcf.h(this.a.a, hfdVar, 0);
        }
        return ffcu.a;
    }
}
