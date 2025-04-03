package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dfp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfn(dfp dfpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dfpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dfn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            long f = ((jgi) isv.a(this.b, jdr.n)).f();
            this.a = 1;
            if (ffsw.c(f, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        ffix ffixVar = this.b.i;
        if (ffixVar != null) {
            ffixVar.invoke();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dfn(this.b, ffguVar);
    }
}
