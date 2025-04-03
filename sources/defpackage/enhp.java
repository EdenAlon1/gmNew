package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enhp extends enqu {
    final enqu a;
    final /* synthetic */ enhs b;

    public enhp(enhs enhsVar) {
        this.b = enhsVar;
        this.a = enhsVar.a.entrySet().listIterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.a.next()).getValue();
    }
}
