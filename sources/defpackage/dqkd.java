package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqkd {
    public final double a;
    public final double b;
    public final Duration c;
    private final double d;
    private final double e;

    public dqkd() {
        this(31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqkd)) {
            return false;
        }
        dqkd dqkdVar = (dqkd) obj;
        if (Double.compare(this.a, dqkdVar.a) != 0 || Double.compare(this.b, dqkdVar.b) != 0) {
            return false;
        }
        double d = dqkdVar.d;
        if (Double.compare(5.0d, 5.0d) != 0 || !ffkj.e(this.c, dqkdVar.c)) {
            return false;
        }
        double d2 = dqkdVar.e;
        return Double.compare(0.95d, 0.95d) == 0;
    }

    public final int hashCode() {
        return (((((((dqkc.a(this.a) * 31) + dqkc.a(this.b)) * 31) + dqkc.a(5.0d)) * 31) + this.c.hashCode()) * 31) + dqkc.a(0.95d);
    }

    public final String toString() {
        return "UsageFrecencyFactors(inContextScore=" + this.a + ", offContextScore=" + this.b + ", recencyScore=5.0, recencyDecreaseDuration=" + this.c + ", recencyDecrease=0.95)";
    }

    public /* synthetic */ dqkd(int i) {
        Duration ofDays = Duration.ofDays(1L);
        ofDays.getClass();
        int i2 = i & 1;
        double d = eobe.a;
        this.a = 1 != i2 ? 0.0d : 10.0d;
        this.b = (i & 2) != 0 ? 1.0d : d;
        this.d = 5.0d;
        this.c = ofDays;
        this.e = 0.95d;
    }
}
