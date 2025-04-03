package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dtb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffjn b;
    final /* synthetic */ dqx c;
    final /* synthetic */ iku d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtb(ffjn ffjnVar, dqx dqxVar, iku ikuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjnVar;
        this.c = dqxVar;
        this.d = ikuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffjn ffjnVar = this.b;
            dqx dqxVar = this.c;
            iak iakVar = new iak(this.d.c);
            this.a = 1;
            if (ffjnVar.a(dqxVar, iakVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtb(this.b, this.c, this.d, ffguVar);
    }
}
