package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzjp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bzjx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzjp(bzjx bzjxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bzjxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzjp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            bzjx bzjxVar = this.b;
            this.a = 1;
            obj = bzjxVar.f.d(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return bzhz.a(((bzgr) obj).c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzjp(this.b, ffguVar);
    }
}
