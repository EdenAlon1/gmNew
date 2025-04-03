package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class demj implements ffjm {
    final /* synthetic */ ffbr a;
    final /* synthetic */ deml b;

    public demj(ffbr ffbrVar, deml demlVar) {
        this.a = ffbrVar;
        this.b = demlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            ffbr ffbrVar = this.a;
            hik hikVar = dnae.a;
            Object b = ffbrVar.b();
            b.getClass();
            hfz.a(hikVar.c(b), hpx.d(-541049330, new demi(this.b), hfdVar), hfdVar, 56);
        }
        return ffcu.a;
    }
}
