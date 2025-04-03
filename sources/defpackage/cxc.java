package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxc implements cyt {
    private final cuk a;

    public cxc(jzn jznVar) {
        this.a = new cuk(cxd.a, jznVar);
    }

    @Override // defpackage.cyt
    public final float a() {
        return 0.0f;
    }

    @Override // defpackage.cyt
    public final float b(float f, float f2) {
        return f + (((float) (r0.a * r0.b * Math.exp((cul.a / (cul.a - 1.0d)) * this.a.a(f2)))) * Math.signum(f2));
    }

    @Override // defpackage.cyt
    public final float c(long j, float f, float f2) {
        cuj b = this.a.b(f2);
        long j2 = b.c;
        float f3 = j2 > 0 ? (j / 1000000) / j2 : 1.0f;
        float signum = b.b * Math.signum(b.a);
        int i = cpz.a;
        return f + (signum * cpz.a(f3).a);
    }

    @Override // defpackage.cyt
    public final long d(float f) {
        return ((long) (Math.exp(this.a.a(f) / (cul.a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.cyt
    public final float e(long j, float f) {
        cuj b = this.a.b(f);
        long j2 = b.c;
        float f2 = j2 > 0 ? (j / 1000000) / j2 : 1.0f;
        int i = cpz.a;
        return (((cpz.a(f2).b * Math.signum(b.a)) * b.b) / b.c) * 1000.0f;
    }
}
