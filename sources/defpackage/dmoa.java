package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmoa implements ffjn {
    final /* synthetic */ dmnh a;
    final /* synthetic */ dmms b;
    final /* synthetic */ hho c;

    public dmoa(dmnh dmnhVar, dmms dmmsVar, hho hhoVar) {
        this.a = dmnhVar;
        this.b = dmmsVar;
        this.c = hhoVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dyh dyhVar = (dyh) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dyhVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dyhVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else if (this.a.f) {
            hfdVar.v(-350904152);
            dmob.e(this.b.d, hfdVar, 0);
            hfdVar.o();
        } else {
            hfdVar.v(-350844818);
            dmms dmmsVar = this.b;
            dmnh dmnhVar = this.a;
            hho hhoVar = this.c;
            boolean z = false;
            dmof dmofVar = dmmsVar.d;
            if (!dmofVar.g.a || dmmsVar.a()) {
                z = true;
            }
            dmob.a(dyhVar, dmofVar, dmnhVar, hhoVar, z, hfdVar, intValue & 14);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
