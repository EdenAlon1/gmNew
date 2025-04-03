package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aian extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eey b;
    final /* synthetic */ ahzr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aian(eey eeyVar, ahzr ahzrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eeyVar;
        this.c = ahzrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aian) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final eey eeyVar = this.b;
            ffxx a = hkt.a(new ffix() { // from class: aial
                @Override // defpackage.ffix
                public final Object invoke() {
                    return Boolean.valueOf(eey.this.i());
                }
            });
            aiam aiamVar = new aiam(this.c);
            this.a = 1;
            if (a.a(aiamVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aian(this.b, this.c, ffguVar);
    }
}
