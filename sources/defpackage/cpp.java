package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpp {
    public static final Object a = new Object();

    public static final Object a(cpo cpoVar, int i) {
        Object obj;
        int a2 = cpu.a(cpoVar.b, cpoVar.d, i);
        if (a2 < 0 || (obj = cpoVar.c[a2]) == a) {
            return null;
        }
        return obj;
    }

    public static final void b(cpo cpoVar) {
        int i = cpoVar.d;
        int[] iArr = cpoVar.b;
        Object[] objArr = cpoVar.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        cpoVar.a = false;
        cpoVar.d = i2;
    }
}
