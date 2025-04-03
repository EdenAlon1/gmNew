package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgfg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cgfj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgfg(cgfj cgfjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cgfjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgfg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cgfj cgfjVar = this.b;
            this.a = 1;
            Object a = ffra.a(ekxi.a(cgfjVar.a), new cgff(null, cgfjVar), this);
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
        return new cgfg(this.b, ffguVar);
    }
}
