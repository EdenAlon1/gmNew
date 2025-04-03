package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emzs<K, V> extends AbstractQueue<enbg<K, V>> {
    final enbg a = new emzq();

    @Override // java.util.Queue
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final enbg peek() {
        enbg enbgVar = this.a;
        enbg enbgVar2 = ((emzq) enbgVar).a;
        if (enbgVar2 == enbgVar) {
            return null;
        }
        return enbgVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        enbg enbgVar = ((emzq) this.a).a;
        while (true) {
            enbg enbgVar2 = this.a;
            if (enbgVar == enbgVar2) {
                emzq emzqVar = (emzq) enbgVar2;
                emzqVar.a = enbgVar2;
                emzqVar.b = enbgVar2;
                return;
            } else {
                enbg f = enbgVar.f();
                enbf.e(enbgVar);
                enbgVar = f;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((enbg) obj).f() != enak.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        enbg enbgVar = this.a;
        return ((emzq) enbgVar).a == enbgVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<enbg<K, V>> iterator() {
        return new emzr(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        enbg enbgVar = (enbg) obj;
        enbf.c(enbgVar.h(), enbgVar.f());
        enbf.c(((emzq) this.a).b, enbgVar);
        enbf.c(enbgVar, this.a);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        enbg enbgVar = this.a;
        enbg enbgVar2 = ((emzq) enbgVar).a;
        if (enbgVar2 == enbgVar) {
            return null;
        }
        remove(enbgVar2);
        return enbgVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        enbg enbgVar = (enbg) obj;
        enbg h = enbgVar.h();
        enbg f = enbgVar.f();
        enbf.c(h, f);
        enbf.e(enbgVar);
        return f != enak.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (enbg enbgVar = ((emzq) this.a).a; enbgVar != this.a; enbgVar = enbgVar.f()) {
            i++;
        }
        return i;
    }
}
