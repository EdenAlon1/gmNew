package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlt extends ffhv implements ffji {
    int a;
    final /* synthetic */ dly b;
    final /* synthetic */ ffjn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlt(dly dlyVar, ffjn ffjnVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dlyVar;
        this.c = ffjnVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dly dlyVar = this.b;
            dlr dlrVar = new dlr(dlyVar);
            dls dlsVar = new dls(this.c, dlyVar, null);
            this.a = 1;
            if (dlj.b(dlrVar, dlsVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        dly dlyVar2 = this.b;
        Object b = dlyVar2.k().b(dlyVar2.a());
        if (b != null) {
            if (Math.abs(this.b.a() - this.b.k().a(b)) < 0.5f) {
                ((Boolean) this.b.a.invoke(b)).booleanValue();
                this.b.j(b);
                this.b.h(b);
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dlt(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
