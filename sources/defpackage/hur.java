package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hur implements hun {
    private final float a;

    public hur(float f) {
        this.a = f;
    }

    @Override // defpackage.hun
    public final int a(int i, int i2, kah kahVar) {
        return Math.round(((i2 - i) / 2.0f) * ((kahVar == kah.a ? this.a : -this.a) + 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hur) && Float.compare(this.a, ((hur) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ')';
    }
}
