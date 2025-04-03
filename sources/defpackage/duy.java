package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class duy extends ffkk implements ffji {
    final /* synthetic */ dva a;
    final /* synthetic */ float b;
    final /* synthetic */ ffji c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duy(dva dvaVar, float f, ffji ffjiVar) {
        super(1);
        this.a = dvaVar;
        this.b = f;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        dva dvaVar = this.a;
        long j = dvaVar.c;
        if (j == Long.MIN_VALUE) {
            dvaVar.c = longValue;
            j = longValue;
        }
        float f = dvaVar.e;
        cxx cxxVar = new cxx(f);
        float f2 = this.b;
        long a = f2 == 0.0f ? dvaVar.b.a(new cxx(f), dva.a, dvaVar.d) : ffln.d((longValue - j) / f2);
        dva dvaVar2 = this.a;
        float f3 = ((cxx) dvaVar2.b.c(a, cxxVar, dva.a, dvaVar2.d)).a;
        dva dvaVar3 = this.a;
        dvaVar3.d = (cxx) dvaVar3.b.d(a, cxxVar, dva.a, dvaVar3.d);
        dva dvaVar4 = this.a;
        dvaVar4.c = longValue;
        float f4 = dvaVar4.e - f3;
        dvaVar4.e = f3;
        this.c.invoke(Float.valueOf(f4));
        return ffcu.a;
    }
}
