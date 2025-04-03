package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enqr {
    public static Collection a(Collection collection, Object obj) {
        return collection instanceof SortedSet ? new enqq((SortedSet) collection, obj) : collection instanceof Set ? new enqp((Set) collection, obj) : collection instanceof List ? b((List) collection, obj) : new enqj(collection, obj);
    }

    public static List b(List list, Object obj) {
        return list instanceof RandomAccess ? new enqo(list, obj) : new enqk(list, obj);
    }
}
