package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mbc {
    public static boolean a(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        return f == f2 && f2 == fArr[2];
    }

    public static float[] b(float[] fArr) {
        return new float[]{(float) Math.log(fArr[0]), (float) Math.log(fArr[1]), (float) Math.log(fArr[2])};
    }
}
