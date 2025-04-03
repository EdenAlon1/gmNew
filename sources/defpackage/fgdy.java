package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgdy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxy b;
    final /* synthetic */ fgea c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgdy(ffxy ffxyVar, fgea fgeaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxyVar;
        this.c = fgeaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgdy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.d;
            ffxy ffxyVar = this.b;
            ffxg e = this.c.e(ffskVar);
            this.a = 1;
            Object a = ffyi.a(ffxyVar, e, true, this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fgdy fgdyVar = new fgdy(this.b, this.c, ffguVar);
        fgdyVar.d = obj;
        return fgdyVar;
    }
}
