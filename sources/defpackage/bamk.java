package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bamk implements Comparator {
    final /* synthetic */ Comparator a;

    public bamk(Comparator comparator) {
        this.a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare = this.a.compare(obj, obj2);
        return compare != 0 ? compare : ffgh.a(Long.valueOf(((bseh) obj).x()), Long.valueOf(((bseh) obj2).x()));
    }
}
