package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eme implements ijf {
    private final eot a;
    private final dqs b;

    public eme(eot eotVar, dqs dqsVar) {
        this.a = eotVar;
        this.b = dqsVar;
    }

    @Override // defpackage.ijf
    public final long a(long j, long j2, int i) {
        if (!ijq.a(i, 2)) {
            return 0L;
        }
        if (Float.intBitsToFloat((int) (this.b == dqs.b ? j2 >> 32 : 4294967295L & j2)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // defpackage.ijf
    public final long b(long j, int i) {
        if (!ijq.a(i, 1) || Math.abs(this.a.c()) <= 1.0E-6d) {
            return 0L;
        }
        float c = this.a.c() * r11.k();
        int i2 = this.a.x().b + this.a.x().c;
        float f = -Math.signum(this.a.c());
        eot eotVar = this.a;
        dqs dqsVar = this.b;
        float c2 = eotVar.c();
        float intBitsToFloat = Float.intBitsToFloat((int) (dqsVar == dqs.b ? j >> 32 : j & 4294967295L));
        float f2 = (i2 * f) + c;
        float f3 = c2 > 0.0f ? f2 : c;
        if (c2 <= 0.0f) {
            c = f2;
        }
        float f4 = -this.a.a(-ffmk.e(intBitsToFloat, f3, c));
        float intBitsToFloat2 = this.b == dqs.b ? f4 : Float.intBitsToFloat((int) (j >> 32));
        if (this.b != dqs.a) {
            f4 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return iak.j(intBitsToFloat2, f4);
    }

    @Override // defpackage.ijf
    public final Object c(long j, long j2, ffgu ffguVar) {
        return new kan(this.b == dqs.a ? kan.g(j2, 0.0f, 0.0f, 2) : kan.g(j2, 0.0f, 0.0f, 1));
    }

    @Override // defpackage.ijf
    public final /* synthetic */ Object d(long j, ffgu ffguVar) {
        return new kan(0L);
    }
}
