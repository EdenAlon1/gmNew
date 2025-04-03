package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
class ffgl extends ffgk {
    public static final Object d(Object obj, Object obj2, Comparator comparator) {
        return comparator.compare(obj, obj2) <= 0 ? obj : obj2;
    }
}
