package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkzq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dkzs b;
    final /* synthetic */ dlfy c;
    final /* synthetic */ rum d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkzq(dkzs dkzsVar, dlfy dlfyVar, rum rumVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dkzsVar;
        this.c = dlfyVar;
        this.d = rumVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dkzq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        dkzs dkzsVar = this.b;
        dlfy dlfyVar = this.c;
        rum rumVar = this.d;
        this.a = 1;
        if (dkzsVar.g(dlfyVar, rumVar, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dkzq(this.b, this.c, this.d, ffguVar);
    }
}
