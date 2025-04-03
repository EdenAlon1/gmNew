package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pvt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ pvu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvt(pvu pvuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = pvuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pvt) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxe ffxeVar = (ffxe) this.c;
            pvs pvsVar = new pvs(this.b, ffxeVar);
            pwl pwlVar = this.b.a;
            synchronized (pwlVar.b) {
                if (pwlVar.c.add(pvsVar)) {
                    if (pwlVar.c.size() == 1) {
                        pwlVar.d = pwlVar.b();
                        ppt.c().a(pwm.a, pwlVar.getClass().getSimpleName() + ": initial state = " + pwlVar.d);
                        pwlVar.d();
                    }
                    pvsVar.a(pwlVar.d);
                }
            }
            pvr pvrVar = new pvr(this.b, pvsVar);
            this.a = 1;
            if (ffxd.b(ffxeVar, pvrVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        pvt pvtVar = new pvt(this.b, ffguVar);
        pvtVar.c = obj;
        return pvtVar;
    }
}
