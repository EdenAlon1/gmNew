package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gap extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eey b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gap(eey eeyVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eeyVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gap) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0 && !this.b.i()) {
            eey eeyVar = this.b;
            int i2 = this.c;
            if (eeyVar.b() != i2) {
                eey eeyVar2 = this.b;
                this.a = 1;
                if (eey.n(eeyVar2, i2, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new gap(this.b, this.c, ffguVar);
    }
}
