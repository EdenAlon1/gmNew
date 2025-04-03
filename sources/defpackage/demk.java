package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class demk implements ffjm {
    final /* synthetic */ ffbr a;
    final /* synthetic */ deml b;

    public demk(ffbr ffbrVar, deml demlVar) {
        this.a = ffbrVar;
        this.b = demlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            cwoi.a(null, null, false, null, false, hpx.d(693832398, new demj(this.a, this.b), hfdVar), hfdVar, 196608, 31);
        }
        return ffcu.a;
    }
}
