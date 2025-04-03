package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqen {
    public final int a;
    public final int b;
    public final int c;
    private final int d;
    private final int e;

    public cqen(int i) {
        this.d = i;
        Object e = cpze.e.e();
        e.getClass();
        this.a = ((Number) e).intValue();
        Object e2 = cpze.g.e();
        e2.getClass();
        int intValue = ((Number) e2).intValue();
        this.e = intValue;
        Object e3 = cpze.f.e();
        e3.getClass();
        int intValue2 = ((Number) e3).intValue();
        this.b = intValue2;
        this.c = ffmk.i(i, intValue, intValue2);
        emyw.d(intValue <= intValue2, intValue, intValue2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqen) && this.d == ((cqen) obj).d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return "BatchLimits(targetMessagesToUpdate=" + this.d + ")";
    }
}
