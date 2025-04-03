package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dohd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eey b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dohd(eey eeyVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eeyVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dohd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            eey eeyVar = this.b;
            int i2 = this.c;
            this.a = 1;
            if (eey.n(eeyVar, i2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dohd(this.b, this.c, ffguVar);
    }
}
