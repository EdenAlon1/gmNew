package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oim extends ffhv implements ffjm {
    int a;
    final /* synthetic */ okl b;
    final /* synthetic */ okd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oim(okl oklVar, okd okdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = oklVar;
        this.c = okdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oim) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            okl oklVar = this.b;
            okd okdVar = this.c;
            this.a = 1;
            obj = oklVar.c(okdVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        okj okjVar = (okj) obj;
        if (okjVar instanceof oki) {
            return (oki) okjVar;
        }
        if (okjVar instanceof okf) {
            throw ((okf) okjVar).a;
        }
        if (okjVar instanceof okg) {
            throw new IllegalStateException("Failed to create PagedList. The provided PagingSource returned LoadResult.Invalid, but a LoadResult.Page was expected. To use a PagingSource which supports invalidation, use a PagedList builder that accepts a factory method for PagingSource or DataSource.Factory, such as LivePagedList.");
        }
        throw new ffcd();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new oim(this.b, this.c, ffguVar);
    }
}
