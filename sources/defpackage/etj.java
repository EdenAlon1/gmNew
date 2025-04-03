package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ jvu b;
    final /* synthetic */ eva c;
    final /* synthetic */ exq d;
    final /* synthetic */ jvj e;
    final /* synthetic */ epe f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etj(epe epeVar, jvu jvuVar, eva evaVar, exq exqVar, jvj jvjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.f = epeVar;
        this.b = jvuVar;
        this.c = evaVar;
        this.d = exqVar;
        this.e = jvjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((etj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        long a;
        iam iamVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            epe epeVar = this.f;
            jvu jvuVar = this.b;
            eva evaVar = this.c;
            exq exqVar = this.d;
            jvj jvjVar = this.e;
            evw evwVar = evaVar.a;
            this.a = 1;
            int a2 = jvjVar.a(jpm.c(jvuVar.c));
            jpg jpgVar = exqVar.a;
            if (a2 < jpgVar.a.a.a()) {
                iamVar = jpgVar.m(a2);
            } else if (a2 != 0) {
                iamVar = jpgVar.m(a2 - 1);
            } else {
                a = ewf.a(evwVar.b, evwVar.e, evwVar.f, ewf.a, 1);
                iamVar = new iam(0.0f, 0.0f, 1.0f, (int) (a & 4294967295L));
            }
            Object a3 = epeVar.a(iamVar, this);
            if (a3 != ffhh.a) {
                a3 = ffcu.a;
            }
            if (a3 == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new etj(this.f, this.b, this.c, this.d, this.e, ffguVar);
    }
}
