package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmjn implements ffjm {
    final /* synthetic */ dmjr a;

    public dmjn(dmjr dmjrVar) {
        this.a = dmjrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmjp.a(this.a.d, hfdVar, 0);
        }
        return ffcu.a;
    }
}
