package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axlr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axlx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axlr(axlx axlxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = axlxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axlr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            axlx axlxVar = this.b;
            this.a = 1;
            if (axlxVar.f(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axlr(this.b, ffguVar);
    }
}
