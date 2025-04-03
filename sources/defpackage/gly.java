package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gly implements ijf {
    final /* synthetic */ gmk a;
    final /* synthetic */ ffji b;
    final /* synthetic */ dqs c;

    public gly(gmk gmkVar, ffji ffjiVar, dqs dqsVar) {
        this.a = gmkVar;
        this.b = ffjiVar;
        this.c = dqsVar;
    }

    private final float e(long j) {
        return this.c == dqs.b ? iak.b(j) : iak.c(j);
    }

    private final float f(long j) {
        return this.c == dqs.b ? kan.a(j) : kan.b(j);
    }

    private final long g(float f) {
        dqs dqsVar = this.c;
        dqs dqsVar2 = dqs.b;
        dqs dqsVar3 = dqs.a;
        float f2 = dqsVar == dqsVar2 ? f : 0.0f;
        if (dqsVar != dqsVar3) {
            f = 0.0f;
        }
        return ial.a(f2, f);
    }

    @Override // defpackage.ijf
    public final long a(long j, long j2, int i) {
        if (ijq.a(i, 1)) {
            return g(this.a.d.a(e(j2)));
        }
        return 0L;
    }

    @Override // defpackage.ijf
    public final long b(long j, int i) {
        float e = e(j);
        if (e >= 0.0f || !ijq.a(i, 1)) {
            return 0L;
        }
        return g(this.a.d.a(e));
    }

    @Override // defpackage.ijf
    public final Object c(long j, long j2, ffgu ffguVar) {
        this.b.invoke(new Float(f(j2)));
        return new kan(j2);
    }

    @Override // defpackage.ijf
    public final Object d(long j, ffgu ffguVar) {
        float f = f(j);
        gmk gmkVar = this.a;
        float b = gmkVar.b();
        float a = gmkVar.d.p().a();
        if (f >= 0.0f || b <= a) {
            j = 0;
        } else {
            this.b.invoke(new Float(f));
        }
        return new kan(j);
    }
}
