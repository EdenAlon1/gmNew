package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aiak extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ahzr b;
    final /* synthetic */ eey c;
    final /* synthetic */ olu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiak(ahzr ahzrVar, eey eeyVar, olu oluVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ahzrVar;
        this.c = eeyVar;
        this.d = oluVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aiak) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final eey eeyVar = this.c;
            aiag aiagVar = new aiag(ffyy.a(new aiaj(hkt.a(new ffix() { // from class: aiad
                @Override // defpackage.ffix
                public final Object invoke() {
                    return eey.this.d().i();
                }
            }), this.d)));
            this.a = 1;
            if (fgbj.a(aiagVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.b.e.invoke();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aiak(this.b, this.c, this.d, ffguVar);
    }
}
