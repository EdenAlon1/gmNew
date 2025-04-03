package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axpu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffix b;
    final /* synthetic */ fflb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axpu(ffix ffixVar, fflb fflbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffixVar;
        this.c = fflbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axpu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.b.invoke();
            this.a = 1;
            if (ffsw.c(1000L, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.c.a = null;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axpu(this.b, this.c, ffguVar);
    }
}
