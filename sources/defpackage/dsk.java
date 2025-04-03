package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsk extends ffhv implements ffjm {
    Object a;
    Object b;
    long c;
    int d;
    final /* synthetic */ dsp e;
    final /* synthetic */ ffla f;
    final /* synthetic */ long g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsk(dsp dspVar, ffla fflaVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = dspVar;
        this.f = fflaVar;
        this.g = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsk) c((dsl) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dsp dspVar;
        long j;
        Object obj2;
        Object obj3;
        ffhh ffhhVar = ffhh.a;
        if (this.d != 0) {
            j = this.c;
            Object obj4 = this.b;
            Object obj5 = this.a;
            dspVar = (dsp) this.h;
            ffci.b(obj);
            obj3 = obj4;
            obj2 = obj5;
        } else {
            ffci.b(obj);
            dsl dslVar = (dsl) this.h;
            dsp dspVar2 = this.e;
            dsj dsjVar = new dsj(dspVar2, dslVar);
            ffla fflaVar = this.f;
            long j2 = this.g;
            dpq dpqVar = dspVar2.c;
            long j3 = fflaVar.a;
            float a = dspVar2.a(dspVar2.d == dqs.b ? kan.a(j2) : kan.b(j2));
            this.h = dspVar2;
            this.a = dspVar2;
            this.b = fflaVar;
            this.c = j3;
            this.d = 1;
            obj = dpqVar.a(dsjVar, a, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            dspVar = dspVar2;
            j = j3;
            obj3 = fflaVar;
            obj2 = dspVar2;
        }
        float a2 = dspVar.a(((Number) obj).floatValue());
        ((ffla) obj3).a = ((dsp) obj2).d == dqs.b ? kan.g(j, a2, 0.0f, 2) : kan.g(j, 0.0f, a2, 1);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dsk dskVar = new dsk(this.e, this.f, this.g, ffguVar);
        dskVar.h = obj;
        return dskVar;
    }
}
