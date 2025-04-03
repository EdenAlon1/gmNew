package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltw {
    public final String a;
    public final int b;
    public final int c;
    public int f;
    public int g;
    public final float[] d = new float[16];
    public final int[] e = new int[4];
    public int h = 9729;

    public ltw(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final void a(float[] fArr) {
        System.arraycopy(fArr, 0, this.d, 0, fArr.length);
    }

    public final void b(int i, int i2) {
        this.f = i;
        this.g = i2;
    }
}
