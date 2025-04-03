package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsp b;
    final /* synthetic */ ffjm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqp(dsp dspVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dspVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dsp dspVar = this.b;
            ffjm ffjmVar = this.c;
            dhy dhyVar = dhy.b;
            this.a = 1;
            if (dspVar.i(dhyVar, ffjmVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqp(this.b, this.c, ffguVar);
    }
}
