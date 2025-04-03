package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgem extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fgen b;
    final /* synthetic */ ffxy c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgem(fgen fgenVar, ffxy ffxyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fgenVar;
        this.c = ffxyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgem) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.d;
            fflb fflbVar = new fflb();
            fgen fgenVar = this.b;
            fgel fgelVar = new fgel(fflbVar, ffskVar, fgenVar, this.c);
            this.a = 1;
            if (fgenVar.d.a(fgelVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fgem fgemVar = new fgem(this.b, this.c, ffguVar);
        fgemVar.d = obj;
        return fgemVar;
    }
}
