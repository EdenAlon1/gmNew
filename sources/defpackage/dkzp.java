package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkzp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dkzs b;
    final /* synthetic */ dlfy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkzp(dkzs dkzsVar, dlfy dlfyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dkzsVar;
        this.c = dlfyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dkzp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dkzs dkzsVar = this.b;
        dlfy dlfyVar = this.c;
        this.a = 1;
        Object c = dkzsVar.c(dlfyVar, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dkzp(this.b, this.c, ffguVar);
    }
}
