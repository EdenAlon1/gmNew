package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hup implements hun {
    public final float a;

    public hup(float f) {
        this.a = f;
    }

    @Override // defpackage.hun
    public final int a(int i, int i2, kah kahVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hup) && Float.compare(this.a, ((hup) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ')';
    }
}
