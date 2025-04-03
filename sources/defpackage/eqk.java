package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqk implements eqe {
    private final float a;

    public eqk(float f) {
        this.a = f;
    }

    @Override // defpackage.eqe
    public final float a(long j, jzn jznVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqk) && Float.compare(this.a, ((eqk) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".px)";
    }
}
