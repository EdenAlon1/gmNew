package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyy extends ffhv implements ffji {
    int a;
    final /* synthetic */ gzl b;
    final /* synthetic */ ffjn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyy(gzl gzlVar, ffjn ffjnVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = gzlVar;
        this.c = ffjnVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            gzl gzlVar = this.b;
            gyw gywVar = new gyw(gzlVar);
            gyx gyxVar = new gyx(this.c, gzlVar, null);
            this.a = 1;
            if (gyu.c(gywVar, gyxVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new gyy(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
