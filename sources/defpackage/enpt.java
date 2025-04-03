package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enpt extends enps implements SortedSet {
    public enpt(SortedSet sortedSet, emxg emxgVar) {
        super(sortedSet, emxgVar);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return enju.e(this.a.iterator(), this.b);
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new enpt(((SortedSet) this.a).headSet(obj), this.b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.a;
        while (true) {
            emxg emxgVar = this.b;
            Object last = sortedSet.last();
            if (emxgVar.a(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new enpt(((SortedSet) this.a).subSet(obj, obj2), this.b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new enpt(((SortedSet) this.a).tailSet(obj), this.b);
    }
}
