package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doql implements ffjn {
    final /* synthetic */ doqo a;

    public doql(doqo doqoVar) {
        this.a = doqoVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ebq ebqVar = (ebq) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ebqVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(ebqVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            doqo doqoVar = this.a;
            hfdVar.v(-488170943);
            dmzz dmzzVar = doqoVar.b;
            if (dmzzVar != null) {
                doqn.b(dmzzVar, hfdVar, 0);
            }
            hfdVar.o();
            doqo doqoVar2 = this.a;
            boolean z = doqoVar2.d != null;
            doqn.d(ebqVar, doqoVar2.a, doqoVar2.c, z, hfdVar, intValue & 14);
        }
        return ffcu.a;
    }
}
