package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzc extends ffhv implements ffji {
    int a;
    final /* synthetic */ gzl b;
    final /* synthetic */ Object c;
    final /* synthetic */ ffjo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzc(gzl gzlVar, Object obj, ffjo ffjoVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = gzlVar;
        this.c = obj;
        this.d = ffjoVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.b.m(this.c);
            gzl gzlVar = this.b;
            gza gzaVar = new gza(gzlVar);
            gzb gzbVar = new gzb(this.d, gzlVar, null);
            this.a = 1;
            if (gyu.c(gzaVar, gzbVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new gzc(this.b, this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}
