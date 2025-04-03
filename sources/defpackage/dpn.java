package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dpn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpo b;
    final /* synthetic */ long c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpn(dpo dpoVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpoVar;
        this.c = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.d;
            dpo dpoVar = this.b;
            long j = this.c;
            ffjn ffjnVar = dpoVar.j;
            long e = kan.e(j, dpoVar.k ? -1.0f : 1.0f);
            dqs dqsVar = this.b.b;
            ffjn ffjnVar2 = dpj.a;
            Float f = new Float(dqsVar == dqs.a ? kan.b(e) : kan.a(e));
            this.a = 1;
            if (ffjnVar.a(ffskVar, f, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dpn dpnVar = new dpn(this.b, this.c, ffguVar);
        dpnVar.d = obj;
        return dpnVar;
    }
}
