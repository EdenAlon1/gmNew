package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class omk {
    public static final omk a;
    public static final omk b;
    public static final omk c;
    public static final omk d;
    public static final omk e;
    public static final omk f;
    final float[] g;
    final float[] h;
    final float[] i = {0.24f, 0.52f, 0.24f};
    final boolean j = true;

    static {
        omk omkVar = new omk();
        a = omkVar;
        e(omkVar);
        h(omkVar);
        omk omkVar2 = new omk();
        b = omkVar2;
        g(omkVar2);
        h(omkVar2);
        omk omkVar3 = new omk();
        c = omkVar3;
        d(omkVar3);
        h(omkVar3);
        omk omkVar4 = new omk();
        d = omkVar4;
        e(omkVar4);
        f(omkVar4);
        omk omkVar5 = new omk();
        e = omkVar5;
        g(omkVar5);
        f(omkVar5);
        omk omkVar6 = new omk();
        f = omkVar6;
        d(omkVar6);
        f(omkVar6);
    }

    public omk() {
        float[] fArr = new float[3];
        this.g = fArr;
        float[] fArr2 = new float[3];
        this.h = fArr2;
        i(fArr);
        i(fArr2);
    }

    private static void d(omk omkVar) {
        float[] fArr = omkVar.h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void e(omk omkVar) {
        float[] fArr = omkVar.h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void f(omk omkVar) {
        float[] fArr = omkVar.g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void g(omk omkVar) {
        float[] fArr = omkVar.h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void h(omk omkVar) {
        float[] fArr = omkVar.g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private static void i(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public final float a() {
        return this.i[1];
    }

    public final float b() {
        return this.i[2];
    }

    public final float c() {
        return this.i[0];
    }
}
