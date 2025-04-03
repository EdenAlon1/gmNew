package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dro extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsp b;
    final /* synthetic */ long c;
    final /* synthetic */ ffky d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dro(dsp dspVar, long j, ffky ffkyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dspVar;
        this.c = j;
        this.d = ffkyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dro) c((dsl) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dsl dslVar = (dsl) this.e;
            dsp dspVar = this.b;
            long j = this.c;
            ffky ffkyVar = this.d;
            float b = dspVar.b(j);
            drn drnVar = new drn(ffkyVar, dspVar, dslVar);
            this.a = 1;
            if (dap.h(0.0f, b, null, drnVar, this, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dro droVar = new dro(this.b, this.c, this.d, ffguVar);
        droVar.e = obj;
        return droVar;
    }
}
