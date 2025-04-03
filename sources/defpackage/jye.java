package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jye {
    public static final float a;
    public static final float b;
    private static final float d;
    public final float c;

    static {
        b(0.0f);
        b(0.5f);
        a = 0.5f;
        b(-1.0f);
        b = -1.0f;
        b(1.0f);
        d = 1.0f;
    }

    public static String a(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == a) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == b) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    public static void b(float f) {
        if ((f < 0.0f || f > 1.0f) && f != -1.0f) {
            jwo.c("topRatio should be in [0..1] range or -1");
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jye) && Float.compare(this.c, ((jye) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return a(this.c);
    }
}
