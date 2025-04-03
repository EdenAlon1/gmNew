package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enbd<K, V> extends AbstractQueue<enbg<K, V>> {
    final enbg a = new enbb();

    @Override // java.util.Queue
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final enbg peek() {
        enbg enbgVar = this.a;
        enbg enbgVar2 = ((enbb) enbgVar).a;
        if (enbgVar2 == enbgVar) {
            return null;
        }
        return enbgVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        enbg enbgVar = ((enbb) this.a).a;
        while (true) {
            enbg enbgVar2 = this.a;
            if (enbgVar == enbgVar2) {
                enbb enbbVar = (enbb) enbgVar2;
                enbbVar.a = enbgVar2;
                enbbVar.b = enbgVar2;
                return;
            } else {
                enbg g = enbgVar.g();
                enbf.f(enbgVar);
                enbgVar = g;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((enbg) obj).g() != enak.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        enbg enbgVar = this.a;
        return ((enbb) enbgVar).a == enbgVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<enbg<K, V>> iterator() {
        return new enbc(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        enbg enbgVar = (enbg) obj;
        enbf.d(enbgVar.i(), enbgVar.g());
        enbf.d(((enbb) this.a).b, enbgVar);
        enbf.d(enbgVar, this.a);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        enbg enbgVar = this.a;
        enbg enbgVar2 = ((enbb) enbgVar).a;
        if (enbgVar2 == enbgVar) {
            return null;
        }
        remove(enbgVar2);
        return enbgVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        enbg enbgVar = (enbg) obj;
        enbg i = enbgVar.i();
        enbg g = enbgVar.g();
        enbf.d(i, g);
        enbf.f(enbgVar);
        return g != enak.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (enbg enbgVar = ((enbb) this.a).a; enbgVar != this.a; enbgVar = enbgVar.g()) {
            i++;
        }
        return i;
    }
}
