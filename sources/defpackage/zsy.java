package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsy implements ffjm {
    final /* synthetic */ dnoq a;
    final /* synthetic */ eqd b;
    final /* synthetic */ eykv c;
    final /* synthetic */ dnor d;
    final /* synthetic */ Object e;
    final /* synthetic */ aaan f;

    public zsy(dnoq dnoqVar, eqd eqdVar, eykv eykvVar, dnor dnorVar, Object obj, aaan aaanVar) {
        this.a = dnoqVar;
        this.b = eqdVar;
        this.c = eykvVar;
        this.d = dnorVar;
        this.e = obj;
        this.f = aaanVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnoq dnoqVar = this.a;
            if (dnoqVar instanceof doml) {
                dnoqVar = doml.l((doml) dnoqVar, null, null, null, null, null, false, false, 4194239);
            } else if (dnoqVar instanceof dmxv) {
                dnoqVar = dmxv.l((dmxv) dnoqVar, null, false, false, 524255);
            } else if (dnoqVar instanceof dnbw) {
                dnoqVar = dnbw.r((dnbw) dnoqVar, null, null, null, null, false, null, null, null, 260095);
            } else if (dnoqVar instanceof aapj) {
                dnoqVar = aapj.i((aapj) dnoqVar, null, null, null, null, null, null, 260095);
            } else if (dnoqVar instanceof dlzf) {
                dnoqVar = dlzf.e((dlzf) dnoqVar, null, null, false, 55);
            } else if (dnoqVar instanceof zyd) {
                dnoqVar = zyd.e((zyd) dnoqVar, null, 16375);
            }
            zta.a(dnoqVar, this.b, this.c, this.d, this.e, hfdVar, 0, 0);
            aaan aaanVar = this.f;
            dmft.a(aaanVar.a, null, this.b, hfdVar, 0);
        }
        return ffcu.a;
    }
}
