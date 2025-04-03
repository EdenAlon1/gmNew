package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enqq extends enqp implements SortedSet {
    private static final long serialVersionUID = 0;

    public enqq(SortedSet sortedSet, Object obj) {
        super(sortedSet, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.enqp
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final SortedSet a() {
        return (SortedSet) super.a();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        Comparator comparator;
        synchronized (this.g) {
            comparator = a().comparator();
        }
        return comparator;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Object first;
        synchronized (this.g) {
            first = a().first();
        }
        return first;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        enqq enqqVar;
        synchronized (this.g) {
            enqqVar = new enqq(a().headSet(obj), this.g);
        }
        return enqqVar;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        Object last;
        synchronized (this.g) {
            last = a().last();
        }
        return last;
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        enqq enqqVar;
        synchronized (this.g) {
            enqqVar = new enqq(a().subSet(obj, obj2), this.g);
        }
        return enqqVar;
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        enqq enqqVar;
        synchronized (this.g) {
            enqqVar = new enqq(a().tailSet(obj), this.g);
        }
        return enqqVar;
    }
}
