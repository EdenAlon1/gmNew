package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dso extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsp b;
    final /* synthetic */ ffjm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dso(dsp dspVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dspVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dso) c((drd) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            drd drdVar = (drd) this.d;
            dsp dspVar = this.b;
            dspVar.j = drdVar;
            ffjm ffjmVar = this.c;
            this.a = 1;
            if (ffjmVar.a(dspVar.k, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dso dsoVar = new dso(this.b, this.c, ffguVar);
        dsoVar.d = obj;
        return dsoVar;
    }
}
