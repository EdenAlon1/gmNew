package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgrz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fgsa b;
    final /* synthetic */ ffix c;
    final /* synthetic */ dris d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgrz(fgsa fgsaVar, ffix ffixVar, dris drisVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fgsaVar;
        this.c = ffixVar;
        this.d = drisVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgrz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fgsa fgsaVar = this.b;
            dris drisVar = this.d;
            ffhd a = ekxi.a(fgsaVar.b);
            fgrw fgrwVar = new fgrw(null, drisVar);
            this.a = 1;
            obj = ffra.a(a, fgrwVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((drhu) obj) != null) {
            this.c.invoke();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fgrz(this.b, this.c, this.d, ffguVar);
    }
}
