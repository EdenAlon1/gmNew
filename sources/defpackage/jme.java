package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jme {
    public static final int a(List list, int i) {
        int i2;
        int i3 = ((jmg) ffdx.P(list)).c;
        if (i > ((jmg) ffdx.P(list)).c) {
            jwo.b(a.r(i3, i, "Index ", " should be less or equal than last line's end "));
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            jmg jmgVar = (jmg) list.get(i2);
            char c = jmgVar.b <= i ? jmgVar.c <= i ? (char) 65535 : (char) 0 : (char) 1;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        jwo.b("Found paragraph index " + i2 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i + ", paragraphs=[" + kau.d(list, null, jmd.a, 31) + ']');
        return i2;
    }

    public static final int b(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (true) {
            if (i2 > size) {
                return -(i2 + 1);
            }
            int i3 = (i2 + size) >>> 1;
            jmg jmgVar = (jmg) list.get(i3);
            char c = jmgVar.d <= i ? jmgVar.e <= i ? (char) 65535 : (char) 0 : (char) 1;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
    }

    public static final int c(List list, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((jmg) ffdx.P(list)).g) {
            return ffdx.e(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (true) {
            if (i > size) {
                return -(i + 1);
            }
            int i2 = (i + size) >>> 1;
            jmg jmgVar = (jmg) list.get(i2);
            char c = jmgVar.f <= f ? jmgVar.g <= f ? (char) 65535 : (char) 0 : (char) 1;
            if (c < 0) {
                i = i2 + 1;
            } else {
                if (c <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
    }

    public static final void d(List list, long j, ffji ffjiVar) {
        int size = list.size();
        for (int a = a(list, jpm.d(j)); a < size; a++) {
            jmg jmgVar = (jmg) list.get(a);
            if (jmgVar.b >= jpm.c(j)) {
                return;
            }
            if (jmgVar.b != jmgVar.c) {
                ffjiVar.invoke(jmgVar);
            }
        }
    }
}
