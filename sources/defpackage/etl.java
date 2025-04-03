package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etl extends ffkk implements ffji {
    final /* synthetic */ eva a;
    final /* synthetic */ boolean b;
    final /* synthetic */ jgp c;
    final /* synthetic */ fhi d;
    final /* synthetic */ jvu e;
    final /* synthetic */ jvj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etl(eva evaVar, boolean z, jgp jgpVar, fhi fhiVar, jvu jvuVar, jvj jvjVar) {
        super(1);
        this.a = evaVar;
        this.b = z;
        this.c = jgpVar;
        this.d = fhiVar;
        this.e = jvuVar;
        this.f = jvjVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ioc iocVar;
        ioc iocVar2;
        eva evaVar = this.a;
        ioc iocVar3 = (ioc) obj;
        evaVar.f = iocVar3;
        exq d = evaVar.d();
        if (d != null) {
            d.b = iocVar3;
        }
        if (this.b) {
            if (this.a.c() == eug.b) {
                if (this.a.r() && this.c.b()) {
                    this.d.A();
                } else {
                    this.d.k();
                }
                this.a.o(fhm.b(this.d, true));
                this.a.n(fhm.b(this.d, false));
                this.a.l(jpm.i(this.e.c));
            } else if (this.a.c() == eug.c) {
                this.a.l(fhm.b(this.d, true));
            }
            eub.e(this.a, this.e, this.f);
            exq d2 = this.a.d();
            if (d2 != null) {
                eva evaVar2 = this.a;
                jvu jvuVar = this.e;
                jvj jvjVar = this.f;
                jwj jwjVar = evaVar2.c;
                if (jwjVar != null && evaVar2.p() && (iocVar = d2.b) != null && iocVar.t() && (iocVar2 = d2.c) != null) {
                    jpg jpgVar = d2.a;
                    ewd ewdVar = new ewd(iocVar);
                    iam b = ffu.b(iocVar);
                    iam n = iocVar.n(iocVar2, false);
                    if (jwjVar.a()) {
                        jwjVar.b.h(jvuVar, jvjVar, jpgVar, ewdVar, b, n);
                    }
                }
            }
        }
        return ffcu.a;
    }
}
