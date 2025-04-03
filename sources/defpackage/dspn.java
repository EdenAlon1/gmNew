package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dspn {
    public final long a;
    private final long b;

    public dspn(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dspn)) {
            return false;
        }
        dspn dspnVar = (dspn) obj;
        return kaf.e(this.a, dspnVar.a) && kaa.f(this.b, dspnVar.b);
    }

    public final int hashCode() {
        return (kae.a(this.a) * 31) + jzz.a(this.b);
    }

    public final String toString() {
        long j = this.b;
        return "LayerCoordinates(size=" + kaf.c(this.a) + ", offset=" + kaa.e(j) + ")";
    }
}
