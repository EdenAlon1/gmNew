package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cus extends ffkk implements ffji {
    final /* synthetic */ cuy a;
    final /* synthetic */ iqk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cus(cuy cuyVar, iqk iqkVar) {
        super(1);
        this.a = cuyVar;
        this.b = iqkVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long c;
        ioc b;
        iqj iqjVar = (iqj) obj;
        if (this.a.m().b() != null) {
            cuy cuyVar = this.a;
            csb l = cuyVar.l();
            iam a = cuyVar.m().a();
            a.getClass();
            iam b2 = this.a.m().b();
            b2.getClass();
            l.d(a, b2);
        }
        iam c2 = this.a.l().c();
        ioc b3 = iqjVar.b();
        iak iakVar = b3 != null ? new iak(this.a.n().h(b3, 0L)) : null;
        if (c2 != null) {
            if (this.a.l().f()) {
                this.a.m().d(c2);
            }
            c = c2.c();
        } else {
            if (this.a.l().f() && (b = iqjVar.b()) != null) {
                this.a.v(b);
            }
            iam a2 = this.a.m().a();
            a2.getClass();
            c = a2.c();
        }
        long e = iakVar != null ? iak.e(c, iakVar.a) : 0L;
        iqjVar.e(this.b, Math.round(Float.intBitsToFloat((int) (e >> 32))), Math.round(Float.intBitsToFloat((int) (4294967295L & e))), 0.0f);
        return ffcu.a;
    }
}
