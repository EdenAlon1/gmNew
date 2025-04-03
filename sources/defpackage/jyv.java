package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyv {
    public static final jyv a = new jyv(2, false);
    private static final jyv d = new jyv(1, true);
    public final int b;
    public final boolean c;

    public jyv(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyv)) {
            return false;
        }
        jyv jyvVar = (jyv) obj;
        return jyu.a(this.b, jyvVar.b) && this.c == jyvVar.c;
    }

    public final int hashCode() {
        return (this.b * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return ffkj.e(this, a) ? "TextMotion.Static" : ffkj.e(this, d) ? "TextMotion.Animated" : "Invalid";
    }
}
