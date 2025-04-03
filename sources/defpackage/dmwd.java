package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmwd implements ffjm {
    final /* synthetic */ dmvk a;

    public dmwd(dmvk dmvkVar) {
        this.a = dmvkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmvk dmvkVar = this.a;
            dmuy.h(dmvkVar.b, dmvkVar.c, null, hfdVar, 0, 12);
        }
        return ffcu.a;
    }
}
