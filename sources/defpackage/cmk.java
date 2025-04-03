package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmk {
    public static final int a(cmj cmjVar, int i) {
        try {
            return cpu.a(cmjVar.a, cmjVar.c, i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int b(cmj cmjVar, Object obj, int i) {
        int i2 = cmjVar.c;
        if (i2 == 0) {
            return -1;
        }
        int a = a(cmjVar, i);
        if (a < 0 || ffkj.e(obj, cmjVar.b[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && cmjVar.a[i3] == i) {
            if (ffkj.e(obj, cmjVar.b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a - 1; i4 >= 0 && cmjVar.a[i4] == i; i4--) {
            if (ffkj.e(obj, cmjVar.b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public static final int c(cmj cmjVar) {
        return b(cmjVar, null, 0);
    }

    public static final void d(cmj cmjVar, int i) {
        cmjVar.a = new int[i];
        cmjVar.b = new Object[i];
    }
}
