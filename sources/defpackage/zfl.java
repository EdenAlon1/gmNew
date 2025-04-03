package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zfl implements ffjn {
    final /* synthetic */ boolean a;
    final /* synthetic */ zjv b;
    final /* synthetic */ dspd c;

    public zfl(boolean z, dspd dspdVar, zjv zjvVar) {
        this.a = z;
        this.c = dspdVar;
        this.b = zjvVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dyn dynVar = (dyn) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dynVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dynVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else if (this.a) {
            zjc.l(dynVar, dspi.a(this.c, hvi.e, hfdVar), this.b, hfdVar, intValue & 14);
        }
        return ffcu.a;
    }
}
