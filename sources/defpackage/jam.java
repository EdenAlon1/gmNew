package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jam implements Comparator {
    final /* synthetic */ Comparator a;

    public jam(Comparator comparator) {
        this.a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare = this.a.compare(obj, obj2);
        return compare != 0 ? compare : ffgh.a(Integer.valueOf(((jjw) obj).e), Integer.valueOf(((jjw) obj2).e));
    }
}
