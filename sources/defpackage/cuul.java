package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuul extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ eisx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuul(eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuul) c((cuue) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cuud cuudVar = (cuud) ((cuue) this.a).toBuilder();
        cuudVar.getClass();
        int a = this.b.a();
        cuudVar.copyOnWrite();
        cuue cuueVar = (cuue) cuudVar.instance;
        cuueVar.b |= 1;
        cuueVar.c = a;
        return cuuf.a(cuudVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuul cuulVar = new cuul(this.b, ffguVar);
        cuulVar.a = obj;
        return cuulVar;
    }
}
