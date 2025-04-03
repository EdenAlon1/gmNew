package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enpz {
    public static boolean a(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = enoe.a;
            }
        } else {
            if (!(iterable instanceof enpy)) {
                return false;
            }
            comparator2 = ((enpy) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
