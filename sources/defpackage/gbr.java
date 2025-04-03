package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gbr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eey b;
    final /* synthetic */ ffji c;
    final /* synthetic */ ham d;
    final /* synthetic */ ffmj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbr(eey eeyVar, ffji ffjiVar, ham hamVar, ffmj ffmjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eeyVar;
        this.c = ffjiVar;
        this.d = hamVar;
        this.e = ffmjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gbr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            eey eeyVar = this.b;
            ffji ffjiVar = this.c;
            ham hamVar = this.d;
            ffmj ffmjVar = this.e;
            this.a = 1;
            ebe ebeVar = gcy.a;
            Object a = hkt.a(new gcw(eeyVar)).a(new gcx(eeyVar, ffjiVar, hamVar, ffmjVar), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new gbr(this.b, this.c, this.d, this.e, ffguVar);
    }
}
