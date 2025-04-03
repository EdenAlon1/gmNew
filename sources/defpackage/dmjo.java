package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmjo implements ffjm {
    final /* synthetic */ dmjr a;

    public dmjo(dmjr dmjrVar) {
        this.a = dmjrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmjp.b(this.a.a, hfdVar, 0);
        }
        return ffcu.a;
    }
}
