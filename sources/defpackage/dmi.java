package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmi implements dmk {
    @Override // defpackage.dmk
    public final /* synthetic */ float a(float f, float f2, float f3) {
        int i = dmh.a;
        float f4 = f2 + f;
        if (f >= 0.0f && f4 <= f3) {
            return 0.0f;
        }
        if (f < 0.0f && f4 > f3) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return Math.abs(f) >= Math.abs(f5) ? f5 : f;
    }
}
