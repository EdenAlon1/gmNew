package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsv {
    public final String a;
    public final float b;

    public jsv(String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jsv) {
            jsv jsvVar = (jsv) obj;
            if (ffkj.e(this.a, jsvVar.a) && this.b == jsvVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "FontVariation.Setting(axisName='" + this.a + "', value=" + this.b + ')';
    }
}
