package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cur extends ffkk implements ffji {
    final /* synthetic */ cuy a;
    final /* synthetic */ iqk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cur(cuy cuyVar, iqk iqkVar) {
        super(1);
        this.a = cuyVar;
        this.b = iqkVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        if (this.a.l().f() || !this.a.m().i()) {
            ioc b = iqjVar.b();
            if (b != null) {
                this.a.v(b);
            }
            iqjVar.e(this.b, 0, 0, 0.0f);
        } else {
            iam a = this.a.m().a();
            a.getClass();
            ioc b2 = iqjVar.b();
            iak iakVar = b2 != null ? new iak(this.a.n().h(b2, 0L)) : null;
            long c = iakVar != null ? kab.c(iak.e(a.c(), iakVar.a)) : 0L;
            iqjVar.e(this.b, kaa.a(c), kaa.b(c), 0.0f);
        }
        return ffcu.a;
    }
}
