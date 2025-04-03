package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dru extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ dsp c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dru(ffjm ffjmVar, dsp dspVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjmVar;
        this.c = dspVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dru) c((dsl) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dsl dslVar = (dsl) this.d;
            ffjm ffjmVar = this.b;
            drt drtVar = new drt(dslVar, this.c);
            this.a = 1;
            if (ffjmVar.a(drtVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dru druVar = new dru(this.b, this.c, ffguVar);
        druVar.d = obj;
        return druVar;
    }
}
