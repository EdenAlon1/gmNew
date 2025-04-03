package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kat {
    public static final float a(float f, float f2, float f3, float f4, float f5) {
        return f + ((f2 - f) * Math.max(0.0f, Math.min(1.0f, f3 == f4 ? 0.0f : (f5 - f3) / (f4 - f3))));
    }
}
