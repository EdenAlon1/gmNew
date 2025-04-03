package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kai implements kap {
    private final float a;

    public kai(float f) {
        this.a = f;
    }

    @Override // defpackage.kap
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.kap
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kai) && Float.compare(this.a, ((kai) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ')';
    }
}
