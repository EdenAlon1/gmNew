package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enhu extends enqu {
    final Iterator a;
    Iterator b = enjp.a;
    final /* synthetic */ enhz c;

    public enhu(enhz enhzVar) {
        this.c = enhzVar;
        this.a = enhzVar.map.values().listIterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = ((engi) this.a.next()).listIterator();
        }
        return this.b.next();
    }
}
