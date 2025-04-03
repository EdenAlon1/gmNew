package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ild b;
    final /* synthetic */ evy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evf(ild ildVar, evy evyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ildVar;
        this.c = evyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((evf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ild ildVar = this.b;
            evy evyVar = this.c;
            this.a = 1;
            Object b = dpu.b(ildVar, new evm(evyVar, null), this);
            if (b != ffhh.a) {
                b = ffcu.a;
            }
            if (b == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new evf(this.b, this.c, ffguVar);
    }
}
