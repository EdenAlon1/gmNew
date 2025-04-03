package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmng extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmnk b;
    final /* synthetic */ int c;
    final /* synthetic */ eyxa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmng(cmnk cmnkVar, int i, eyxa eyxaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cmnkVar;
        this.c = i;
        this.d = eyxaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmng) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cmnk cmnkVar = this.b;
            int i2 = this.c;
            eyxa eyxaVar = this.d;
            this.a = 1;
            if (cmnkVar.f(i2, eyxaVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmng(this.b, this.c, this.d, ffguVar);
    }
}
