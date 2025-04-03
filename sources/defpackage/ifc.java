package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifc {
    public static final float a(float[] fArr) {
        int length = fArr.length;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static final boolean b(double d, iel ielVar, iel ielVar2) {
        return Math.abs(ielVar.a(d) - ielVar2.a(d)) <= 0.001d;
    }
}
