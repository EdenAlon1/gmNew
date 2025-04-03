package defpackage;

import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exmh {
    public static final FloatBuffer a = exmk.b(0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    public static final FloatBuffer b;
    private static final exmg h;
    private static final exmg i;
    private static final exmg j;
    private static final exmg k;
    private static final exmg[] l;
    public int d;
    public int e;
    public int c = 0;
    public final float[] f = new float[16];
    public final boolean g = true;

    static {
        exmk.b(0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        exmg exmgVar = new exmg(-1.0f, -1.0f);
        h = exmgVar;
        exmg exmgVar2 = new exmg(1.0f, -1.0f);
        i = exmgVar2;
        exmg exmgVar3 = new exmg(-1.0f, 1.0f);
        j = exmgVar3;
        exmg exmgVar4 = new exmg(1.0f, 1.0f);
        k = exmgVar4;
        exmg[] exmgVarArr = {exmgVar, exmgVar2, exmgVar3, exmgVar4};
        l = exmgVarArr;
        b = a(exmgVarArr, 0, 1, 2, 3);
        a(exmgVarArr, 2, 0, 3, 1);
        a(exmgVarArr, 3, 2, 1, 0);
        a(exmgVarArr, 1, 3, 0, 2);
    }

    private static FloatBuffer a(exmg[] exmgVarArr, int i2, int i3, int i4, int i5) {
        exmg exmgVar = exmgVarArr[i2];
        float f = exmgVar.a;
        float f2 = exmgVar.b;
        exmg exmgVar2 = exmgVarArr[i3];
        float f3 = exmgVar2.a;
        float f4 = exmgVar2.b;
        exmg exmgVar3 = exmgVarArr[i4];
        float f5 = exmgVar3.a;
        float f6 = exmgVar3.b;
        exmg exmgVar4 = exmgVarArr[i5];
        return exmk.b(f, f2, f3, f4, f5, f6, exmgVar4.a, exmgVar4.b);
    }
}
