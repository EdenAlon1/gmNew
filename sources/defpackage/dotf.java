package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dotf implements ffjn {
    final /* synthetic */ dotb a;

    public dotf(dotb dotbVar) {
        this.a = dotbVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dose.j(this.a.c, hfdVar, 0);
        }
        return ffcu.a;
    }
}
