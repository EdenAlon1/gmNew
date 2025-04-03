package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ablk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abll b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ablk(abll abllVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abllVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ablk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [cbmv, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.b.c.isPresent();
            abll abllVar = this.b;
            ablj abljVar = new ablj(abllVar, abllVar.c.get(), null);
            this.a = 1;
            if (ffyk.b(((abos) abllVar.d).n, abljVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ablk(this.b, ffguVar);
    }
}
