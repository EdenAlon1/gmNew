package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doar implements doae {
    public final cyz a;
    private final long b;
    private final float c = 0.6f;

    public doar(long j, cyz cyzVar) {
        this.b = j;
        this.a = cyzVar;
    }

    @Override // defpackage.doae
    public final float a(float f) {
        return f <= 0.6f ? kav.b(0.0f, 1.0f, f / 0.6f) : kav.b(1.0f, 0.0f, (f - 0.6f) / 0.39999998f);
    }

    @Override // defpackage.doae
    public final cyz b() {
        return this.a;
    }

    @Override // defpackage.doae
    public final ibq c(float f, long j) {
        long f2;
        long f3;
        f2 = iby.f(ibw.d(r0), ibw.c(r0), ibw.b(r0), 0.0f, ibw.f(this.b));
        long j2 = this.b;
        f3 = iby.f(ibw.d(j2), ibw.c(j2), ibw.b(j2), 0.0f, ibw.f(j2));
        List g = ffdx.g(new ibw(f2), new ibw(j2), new ibw(f3));
        long floatToRawIntBits = Float.floatToRawIntBits(0.0f);
        long floatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
        float max = Math.max(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))) * f;
        return ibp.c(g, (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), ffmk.c(max + max, 0.01f), 8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doar)) {
            return false;
        }
        doar doarVar = (doar) obj;
        long j = this.b;
        long j2 = doarVar.b;
        long j3 = ibw.a;
        if (!ffcp.a(j, j2) || !ffkj.e(this.a, doarVar.a)) {
            return false;
        }
        float f = doarVar.c;
        return Float.compare(0.6f, 0.6f) == 0;
    }

    public final int hashCode() {
        long j = ibw.a;
        return (((ffco.a(this.b) * 31) + this.a.hashCode()) * 31) + Float.floatToIntBits(0.6f);
    }

    public final String toString() {
        return "Shimmer(highlightColor=" + ibw.g(this.b) + ", animationSpec=" + this.a + ", progressForMaxAlpha=0.6)";
    }
}
