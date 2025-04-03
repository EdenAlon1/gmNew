package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ezy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evz(ezy ezyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ezyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((evz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ezy ezyVar = this.b;
            this.a = 1;
            Object a = ffsl.a(new ezx(ezyVar, null), this);
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
        return new evz(this.b, ffguVar);
    }
}
