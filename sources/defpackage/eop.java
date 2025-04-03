package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eop extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eot b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eop(eot eotVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eotVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eop) c((drd) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            eot eotVar = this.b;
            this.a = 1;
            if (eotVar.q(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        eot eotVar2 = this.b;
        eotVar2.u(eotVar2.f(this.c), 0.0f, true);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eop(this.b, this.c, ffguVar);
    }
}
