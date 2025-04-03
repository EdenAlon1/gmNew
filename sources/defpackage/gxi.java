package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gxi {
    public float b;
    public int a = -1;
    public final List c = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List c(int r27, float r28, int r29, int r30, float r31, float r32, float r33, java.util.List r34) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxi.c(int, float, int, int, float, float, float, java.util.List):java.util.List");
    }

    private static final boolean d(float f, float f2) {
        float f3 = f / 2.0f;
        return f2 - f3 < 0.0f && f2 + f3 > 0.0f;
    }

    private static final boolean e(float f, float f2, float f3) {
        float f4 = f / 2.0f;
        return f2 - f4 < f3 && f2 + f4 > f3;
    }

    public final int a() {
        int i = this.a;
        while (i < ffdx.e(this.c)) {
            int i2 = i + 1;
            if (((gxh) this.c.get(i2)).a != this.b) {
                break;
            }
            i = i2;
        }
        return i;
    }

    public final void b(float f, boolean z) {
        this.c.add(new gxh(f, z));
        if (f > this.b) {
            this.a = ffdx.e(this.c);
            this.b = f;
        }
    }
}
