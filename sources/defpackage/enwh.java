package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enwh implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        enwn a = enwn.a(obj);
        enwn a2 = enwn.a(obj2);
        if (a != a2) {
            return a.compareTo(a2);
        }
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        if (ordinal == 1) {
            return ((String) obj).compareTo((String) obj2);
        }
        if (ordinal == 2) {
            return ((Long) obj).compareTo((Long) obj2);
        }
        if (ordinal == 3) {
            return ((Double) obj).compareTo((Double) obj2);
        }
        throw null;
    }
}
