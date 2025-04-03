package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqh implements eqe {
    private final float a;

    public eqh(float f) {
        this.a = f;
    }

    @Override // defpackage.eqe
    public final float a(long j, jzn jznVar) {
        return jznVar.em(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqh) && jzq.b(this.a, ((eqh) obj).a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
