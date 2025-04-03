package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmm implements dmk {
    @Override // defpackage.dmk
    public final float a(float f, float f2, float f3) {
        float abs = Math.abs((f2 + f) - f);
        float f4 = (0.3f * f3) - (0.0f * abs);
        if (abs <= f3 && f3 - f4 < abs) {
            f4 = f3 - abs;
        }
        return f - f4;
    }
}
