package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfgo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cfgt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfgo(cfgt cfgtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cfgtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfgo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        cfgb cfgbVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cfgt cfgtVar = this.b;
            if (csjc.d()) {
                cfgbVar = cfgb.b;
            } else {
                double a = (fflz.d(cfgtVar.d.f().toEpochMilli()).a(24) / 1.6777216E7f) % 1.0d;
                if (a != eobe.a && Math.signum(a) != Math.signum(1.0d)) {
                    a += 1.0d;
                }
                cfgbVar = a < ((double) ((Number) cfgt.b.e()).floatValue()) ? cfgb.b : cfgb.a;
            }
            this.a = 1;
            if (cfgtVar.d(cfgbVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cfgo(this.b, ffguVar);
    }
}
