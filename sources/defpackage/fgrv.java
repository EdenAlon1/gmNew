package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgrv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fgsa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgrv(fgsa fgsaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fgsaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgrv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fgsa fgsaVar = this.b;
            ffhd a = ekxi.a(fgsaVar.b);
            fgru fgruVar = new fgru(null, fgsaVar);
            this.a = 1;
            if (ffra.a(a, fgruVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fgrv(this.b, ffguVar);
    }
}
