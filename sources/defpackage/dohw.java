package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dohw implements ffjn {
    final /* synthetic */ doia a;

    public dohw(doia doiaVar) {
        this.a = doiaVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dohz.b(hfdVar, 0);
            doib doibVar = this.a.a;
            dohz.d(doibVar.a, doibVar.c, doibVar.b, hfdVar, 0);
        }
        return ffcu.a;
    }
}
