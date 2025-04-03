package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aifi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aidv b;
    final /* synthetic */ eey c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aifi(aidv aidvVar, eey eeyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aidvVar;
        this.c = eeyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aifi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (ffkj.e(this.b.a, "")) {
                return ffcu.a;
            }
            final eey eeyVar = this.c;
            aife aifeVar = new aife(ffyy.a(new aifh(hkt.a(new ffix() { // from class: aifb
                @Override // defpackage.ffix
                public final Object invoke() {
                    return eey.this.d().i();
                }
            }), this.b)));
            this.a = 1;
            if (fgbj.a(aifeVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.b.c.invoke();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aifi(this.b, this.c, ffguVar);
    }
}
