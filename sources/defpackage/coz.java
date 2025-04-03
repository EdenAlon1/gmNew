package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coz {
    public static final Object[] a = new Object[0];
    public static final coy b = new cok(0);

    public static final cok a(Object obj, Object obj2) {
        cok cokVar = new cok(2);
        cokVar.h(obj);
        cokVar.h(obj2);
        return cokVar;
    }

    public static final void b(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            cpx.c(a.x(size, i, "Index ", " is out of bounds. The list has ", " elements."));
        }
    }

    public static final void c(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            cpx.a(a.x(i2, i, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
        }
        if (i < 0) {
            cpx.c(a.f(i, "fromIndex (", ") is less than 0."));
        }
        if (i2 > size) {
            cpx.c("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        }
    }
}
