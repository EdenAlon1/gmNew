package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zkg implements ffjm {
    final /* synthetic */ zkk a;
    final /* synthetic */ hvi b;
    final /* synthetic */ hzi c;

    public zkg(zkk zkkVar, hvi hviVar, hzi hziVar) {
        this.a = zkkVar;
        this.b = hviVar;
        this.c = hziVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmms dmmsVar = this.a.a;
            dmof dmofVar = dmmsVar.d;
            dmof a = dmof.a(dmofVar, null, null, null, null, null, false, dmoe.a(dmofVar.g, true, 1), 63);
            dmms dmmsVar2 = new dmms(dmmsVar.a, dmmsVar.b, dmmsVar.c, a, dmmsVar.e, dmmsVar.f);
            zkk zkkVar = this.a;
            dmnj.a(new dmpj(dmmsVar2, zkkVar.c, null, dmpg.c, 0.15f, false, zkkVar.d, 32), this.b, this.c, hfdVar, 0, 0);
        }
        return ffcu.a;
    }
}
