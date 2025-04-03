package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsqp implements ffjm {
    final /* synthetic */ dsqq a;
    final /* synthetic */ dspo b;
    final /* synthetic */ long c;
    final /* synthetic */ dsqr d;

    public dsqp(dsqq dsqqVar, dspo dspoVar, long j, dsqr dsqrVar) {
        this.a = dsqqVar;
        this.b = dspoVar;
        this.c = j;
        this.d = dsqrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            this.a.i(this.b, this.c, this.d, hfdVar);
        }
        return ffcu.a;
    }
}
