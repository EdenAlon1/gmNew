package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dejc implements ffjm {
    final /* synthetic */ deji a;
    final /* synthetic */ deoa b;

    public dejc(deji dejiVar, deoa deoaVar) {
        this.a = dejiVar;
        this.b = deoaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            deji dejiVar = this.a;
            hik hikVar = dnae.a;
            Object b = dejiVar.c.b();
            b.getClass();
            hfz.a(hikVar.c(b), hpx.d(1659287450, new dejb(this.b), hfdVar), hfdVar, 56);
        }
        return ffcu.a;
    }
}
