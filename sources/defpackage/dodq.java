package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dodq {
    public static final dods a(docz doczVar, int i, int i2) {
        int i3;
        int i4 = doczVar.a;
        int i5 = doczVar.b;
        int i6 = doczVar.i;
        int i7 = (((i4 - i5) - i) - i2) - i6;
        if (i7 < (-i6) / 2) {
            return null;
        }
        List list = doczVar.g;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i3 = -1;
                break;
            }
            if (((Number) listIterator.previous()).intValue() <= i7) {
                i3 = listIterator.nextIndex();
                break;
            }
        }
        return new dods(i5, i, i2, i3 + 1, doczVar.i + ffmk.g(i7, 0));
    }
}
