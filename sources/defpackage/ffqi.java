package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffqi {
    public final Object a;
    public final long b;

    public ffqi(Object obj, long j) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffqi)) {
            return false;
        }
        ffqi ffqiVar = (ffqi) obj;
        return ffkj.e(this.a, ffqiVar.a) && ffpw.n(this.b, ffqiVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        long j = this.b;
        long j2 = ffpw.a;
        return (hashCode * 31) + ffpv.a(j);
    }

    public final String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + ffpw.m(this.b) + ")";
    }
}
