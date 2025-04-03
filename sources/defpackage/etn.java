package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etn extends ffkk implements ffji {
    final /* synthetic */ eva a;
    final /* synthetic */ hzi b;
    final /* synthetic */ boolean c;
    final /* synthetic */ fhi d;
    final /* synthetic */ jvj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etn(eva evaVar, hzi hziVar, boolean z, fhi fhiVar, jvj jvjVar) {
        super(1);
        this.a = evaVar;
        this.b = hziVar;
        this.c = z;
        this.d = fhiVar;
        this.e = jvjVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        int a;
        long j = ((iak) obj).a;
        eub.i(this.a, this.b);
        if (this.a.p() && this.c) {
            if (this.a.c() != eug.b) {
                exq d = this.a.d();
                if (d != null) {
                    eva evaVar = this.a;
                    jvj jvjVar = this.e;
                    a = d.a(j, true);
                    int b = jvjVar.b(a);
                    jvu jvuVar = evaVar.b.a;
                    long a2 = jpn.a(b, b);
                    long j2 = jpm.a;
                    evaVar.p.invoke(jvu.b(jvuVar, null, a2, 5));
                    if (evaVar.a.a.a() > 0) {
                        evaVar.h(eug.c);
                    }
                }
            } else {
                this.d.h(new iak(j));
            }
        }
        return ffcu.a;
    }
}
