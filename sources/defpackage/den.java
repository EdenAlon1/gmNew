package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class den extends ffkk implements ffji {
    final /* synthetic */ boolean a;
    final /* synthetic */ ibq b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ long f;
    final /* synthetic */ long g;
    final /* synthetic */ ifv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public den(boolean z, ibq ibqVar, long j, float f, float f2, long j2, long j3, ifv ifvVar) {
        super(1);
        this.a = z;
        this.b = ibqVar;
        this.c = j;
        this.d = f;
        this.e = f2;
        this.f = j2;
        this.g = j3;
        this.h = ifvVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        ifo ifoVar = (ifo) obj;
        ifoVar.p();
        if (this.a) {
            ifq.j(ifoVar, this.b, 0L, 0L, this.c, null, 246);
        } else {
            long j = this.c;
            float f = this.d;
            if (Float.intBitsToFloat((int) (j >> 32)) < f) {
                float f2 = this.e;
                long b = ifoVar.b() >> 32;
                float intBitsToFloat = Float.intBitsToFloat((int) b) - this.e;
                long b2 = ifoVar.b() & 4294967295L;
                float intBitsToFloat2 = Float.intBitsToFloat((int) b2) - this.e;
                ibq ibqVar = this.b;
                long j2 = this.c;
                ifl t = ifoVar.t();
                long a = t.a();
                t.b().l();
                try {
                    t.c.b(f2, f2, intBitsToFloat, intBitsToFloat2, 0);
                    ifq.j(ifoVar, ibqVar, 0L, 0L, j2, null, 246);
                } finally {
                    t.b().j();
                    t.h(a);
                }
            } else {
                ifq.j(ifoVar, this.b, this.f, this.g, dek.a(this.c, f), this.h, 208);
            }
        }
        return ffcu.a;
    }
}
