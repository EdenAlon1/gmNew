package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmie extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eey b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmie(eey eeyVar, int i, int i2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eeyVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmie) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            int i2 = 0;
            for (eei eeiVar : this.b.d().i()) {
                if (ffkj.e(eeiVar.d, new Integer(this.c))) {
                    i2 = eeiVar.h;
                }
            }
            eey eeyVar = this.b;
            int i3 = this.c;
            this.a = 1;
            if (eeyVar.j(i3, ((-this.d) / 2) + (i2 / 2), this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmie(this.b, this.c, this.d, ffguVar);
    }
}
