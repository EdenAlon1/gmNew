package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cppp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cppr b;
    final /* synthetic */ fbzt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cppp(cppr cpprVar, fbzt fbztVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cpprVar;
        this.c = fbztVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cppp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cppr cpprVar = this.b;
        fbzt fbztVar = this.c;
        this.a = 1;
        Object b = cpprVar.b(fbztVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cppp(this.b, this.c, ffguVar);
    }
}
