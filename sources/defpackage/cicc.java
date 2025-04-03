package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cicc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cicd b;
    final /* synthetic */ erxk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cicc(cicd cicdVar, erxk erxkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cicdVar;
        this.c = erxkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cicc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cicd cicdVar = this.b;
        erxk erxkVar = this.c;
        this.a = 1;
        Object e = cicdVar.e(erxkVar, this);
        return e == ffhhVar ? ffhhVar : e;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cicc(this.b, this.c, ffguVar);
    }
}
