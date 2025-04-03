package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rle implements Cloneable {
    public float a;
    public float b;
    public float c;
    public float d;

    public rle(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static rle c(float f, float f2, float f3, float f4) {
        return new rle(f, f2, f3 - f, f4 - f2);
    }

    public final float a() {
        return this.a + this.c;
    }

    public final float b() {
        return this.b + this.d;
    }

    public final String toString() {
        return "[" + this.a + " " + this.b + " " + this.c + " " + this.d + "]";
    }
}
