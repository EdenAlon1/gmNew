package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fxv b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxp(fxv fxvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fxvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fxp) c((ild) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ild ildVar = (ild) this.c;
            fxv fxvVar = this.b;
            fxm fxmVar = new fxm(fxvVar);
            fxo fxoVar = new fxo(fxvVar);
            this.a = 1;
            if (doo.h(ildVar, dnx.a, fxmVar, dny.a, fxoVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fxp fxpVar = new fxp(this.b, ffguVar);
        fxpVar.c = obj;
        return fxpVar;
    }
}
