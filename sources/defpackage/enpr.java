package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enpr extends enpv {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public enpr(Set set, Set set2) {
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
        Set set = this.a;
        Iterator it = set.iterator();
        Set set2 = this.b;
        return new enpq(it, set2, set2.iterator(), set);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set set = this.b;
        return set.contains(obj) ^ this.a.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.equals(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!this.b.contains(it.next())) {
                i++;
            }
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            if (!this.a.contains(it2.next())) {
                i++;
            }
        }
        return i;
    }
}
