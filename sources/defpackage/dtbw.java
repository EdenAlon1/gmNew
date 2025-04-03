package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtbw {
    public final float a;
    public final long b;

    public dtbw(float f, long j) {
        this.a = f;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtbw)) {
            return false;
        }
        dtbw dtbwVar = (dtbw) obj;
        if (!jzq.b(this.a, dtbwVar.a)) {
            return false;
        }
        long j = this.b;
        long j2 = dtbwVar.b;
        long j3 = ibw.a;
        return ffcp.a(j, j2);
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.a) * 31;
        long j = ibw.a;
        return floatToIntBits + ffco.a(this.b);
    }

    public final String toString() {
        long j = this.b;
        return "DotData(dotSize=" + jzq.a(this.a) + ", dotColor=" + ibw.g(j) + ")";
    }
}
