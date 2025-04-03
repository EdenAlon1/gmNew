package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ampd implements Comparator {
    final /* synthetic */ Comparator a;

    public ampd(Comparator comparator) {
        this.a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare = this.a.compare(obj, obj2);
        return compare != 0 ? compare : ffgh.a(((aqux) obj).g().b(), ((aqux) obj2).g().b());
    }
}
