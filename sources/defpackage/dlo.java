package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlo extends ffhv implements ffjn {
    int a;
    final /* synthetic */ dlq b;
    final /* synthetic */ ffky c;
    final /* synthetic */ float d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlo(dlq dlqVar, ffky ffkyVar, float f, ffgu ffguVar) {
        super(3, ffguVar);
        this.b = dlqVar;
        this.c = ffkyVar;
        this.d = f;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dlo dloVar = new dlo(this.b, this.c, this.d, (ffgu) obj3);
        dloVar.e = (dlu) obj;
        return dloVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffky ffkyVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffkyVar = (ffky) this.e;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            dlu dluVar = (dlu) this.e;
            dlq dlqVar = this.b;
            dln dlnVar = new dln(dlqVar, dluVar);
            dpq dpqVar = dlqVar.d;
            if (dpqVar == null) {
                ffkj.c("resolvedFlingBehavior");
                dpqVar = null;
            }
            ffky ffkyVar2 = this.c;
            float f = this.d;
            this.e = ffkyVar2;
            this.a = 1;
            obj = dpqVar.a(dlnVar, f, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            ffkyVar = ffkyVar2;
        }
        ffkyVar.a = ((Number) obj).floatValue();
        return ffcu.a;
    }
}
