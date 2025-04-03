package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eirm {
    public final int a;
    public final float[] b;
    public final int[] c;

    public eirm() {
        this.a = 6;
        this.b = a(6);
        this.c = b(6);
    }

    private static float[] a(int i) {
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = 1.0f;
        }
        return fArr;
    }

    private static int[] b(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = 0;
        }
        return iArr;
    }

    public eirm(int i, float[] fArr, int[] iArr) {
        this.a = i;
        this.b = fArr == null ? a(i) : fArr;
        this.c = iArr == null ? b(i) : iArr;
    }
}
