package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dpl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ dpo c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpl(ffjm ffjmVar, dpo dpoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjmVar;
        this.c = dpoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpl) c((dpc) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dpc dpcVar = (dpc) this.d;
            ffjm ffjmVar = this.b;
            dpk dpkVar = new dpk(dpcVar, this.c);
            this.a = 1;
            if (ffjmVar.a(dpkVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dpl dplVar = new dpl(this.b, this.c, ffguVar);
        dplVar.d = obj;
        return dplVar;
    }
}
