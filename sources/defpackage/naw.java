package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class naw {
    public final float[] a = new float[16];
    public final float[] b = new float[16];
    public final lvb c = new lvb();
    public boolean d;

    public static void a(float[] fArr, float[] fArr2) {
        ltz.w(fArr);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10];
        fArr[0] = f3 / sqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3 / sqrt;
    }
}
