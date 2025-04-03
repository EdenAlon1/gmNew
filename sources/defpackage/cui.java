package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cui {
    public final float a;
    public final cyq b;

    public cui(float f, cyq cyqVar) {
        this.a = f;
        this.b = cyqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cui)) {
            return false;
        }
        cui cuiVar = (cui) obj;
        return Float.compare(this.a, cuiVar.a) == 0 && ffkj.e(this.b, cuiVar.b);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
