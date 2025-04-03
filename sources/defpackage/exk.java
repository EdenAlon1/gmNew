package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exk {
    public static final hrh a = hqn.a(exi.a, exj.a);
    public long b;
    private iam c;
    private final hho d;
    private final hjx e;
    private final hjx f;
    private final hjz g;

    public exk() {
        this(dqs.a);
    }

    public final float a() {
        return this.f.c();
    }

    public final float b() {
        return this.e.c();
    }

    public final dqs c() {
        return (dqs) this.d.a();
    }

    public final void d(float f) {
        this.e.i(f);
    }

    public final void e(dqs dqsVar, iam iamVar, int i, int i2) {
        float f = i2 - i;
        this.f.i(f);
        iam iamVar2 = this.c;
        float f2 = iamVar2.b;
        float f3 = iamVar.b;
        if (f3 != f2 || iamVar.c != iamVar2.c) {
            boolean z = dqsVar == dqs.a;
            if (z) {
                f3 = iamVar.c;
            }
            float f4 = z ? iamVar.e : iamVar.d;
            float b = b();
            float f5 = i;
            float f6 = b + f5;
            d(b() + ((f4 <= f6 && (f3 >= b || f4 - f3 <= f5)) ? (f3 >= b || f4 - f3 > f5) ? 0.0f : f3 - b : f4 - f6));
            this.c = iamVar;
        }
        d(ffmk.e(b(), 0.0f, f));
        this.g.i(i);
    }

    public exk(dqs dqsVar, float f) {
        this.e = new hhw(f);
        this.f = new hhw(0.0f);
        this.g = new hhy(0);
        this.c = iam.a;
        this.b = jpm.a;
        this.d = new hic(dqsVar, hla.a);
    }

    public /* synthetic */ exk(dqs dqsVar) {
        this(dqsVar, 0.0f);
    }
}
