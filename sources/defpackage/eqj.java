package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqj implements eqe {
    private final float a;

    public eqj(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            dwv.c("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.eqe
    public final float a(long j, jzn jznVar) {
        return iar.b(j) * (this.a / 100.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqj) && Float.compare(this.a, ((eqj) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
