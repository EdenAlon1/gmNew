package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffdz extends ffdy {
    public static final int e(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final ArrayList f(Object... objArr) {
        return new ArrayList(new ffdm(objArr, true));
    }

    public static final List g(Object... objArr) {
        objArr.getClass();
        return objArr.length > 0 ? ffdo.c(objArr) : ffel.a;
    }

    public static final List h(Object obj) {
        return obj != null ? ffdx.g(obj) : ffel.a;
    }

    public static final List i(Object... objArr) {
        return new ArrayList(new ffdm(objArr, true));
    }

    public static final List j(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : ffdx.g(list.get(0)) : ffel.a;
    }

    public static final void k() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void l() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static /* synthetic */ int m(List list, Comparable comparable) {
        int size = list.size();
        int size2 = list.size();
        if (size < 0) {
            throw new IllegalArgumentException(a.f(size, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException(a.x(size2, size, "toIndex (", ") is greater than size (", ")."));
        }
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int a = ffgh.a((Comparable) list.get(i3), comparable);
            if (a < 0) {
                i2 = i3 + 1;
            } else {
                if (a <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }
}
