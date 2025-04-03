package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dpm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpo b;
    final /* synthetic */ long c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpm(dpo dpoVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpoVar;
        this.c = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            ffjn ffjnVar = dpoVar.d;
            iak iakVar = new iak(j);
            this.a = 1;
            if (ffjnVar.a(ffskVar, iakVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dpm dpmVar = new dpm(this.b, this.c, ffguVar);
        dpmVar.d = obj;
        return dpmVar;
    }
}
