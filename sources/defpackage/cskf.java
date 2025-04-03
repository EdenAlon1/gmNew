package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cskf {
    public static float a(float f, float f2, float f3) {
        emxf.a(f3 >= f2);
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public static float b(float f) {
        emxf.a(true);
        if (f > 1.0f) {
            return 1.0f;
        }
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    public static int c(int i, int i2, int i3) {
        emxf.a(i3 >= i2);
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public static int d(int i, int i2, int i3) {
        return c(i, Math.min(i2, i3), Math.max(i2, i3));
    }
}
