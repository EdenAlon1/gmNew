package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emw implements emx {
    private final float a;

    public emw(float f) {
        this.a = f;
    }

    @Override // defpackage.emx
    public final int a(jzn jznVar, int i, int i2) {
        return jznVar.eo(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof emw) {
            return jzq.b(this.a, ((emw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }
}
