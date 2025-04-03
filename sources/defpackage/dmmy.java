package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmmy implements ffjn {
    final /* synthetic */ ibw a;
    final /* synthetic */ dmnb b;
    final /* synthetic */ ibw c;
    final /* synthetic */ boolean d;

    public dmmy(ibw ibwVar, dmnb dmnbVar, ibw ibwVar2, boolean z) {
        this.a = ibwVar;
        this.b = dmnbVar;
        this.c = ibwVar2;
        this.d = z;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dyh) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            ibw ibwVar = this.a;
            dmnb dmnbVar = this.b;
            dmna.c(ibwVar, dmnbVar.c, hpx.d(786407611, new dmmx(dmnbVar, this.c, this.d), hfdVar), hfdVar, 384);
        }
        return ffcu.a;
    }
}
