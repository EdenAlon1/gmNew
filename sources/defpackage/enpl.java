package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enpl extends enpv {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public enpl(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.enpv
    public final int a() {
        return c(this.a) + c(this.b);
    }

    @Override // defpackage.enpv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: b */
    public final enqu iterator() {
        return new enpk(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj) || this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set set = this.b;
        int size = this.a.size();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!this.a.contains(it.next())) {
                size++;
            }
        }
        return size;
    }
}
