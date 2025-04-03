package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eocc extends enqu {
    final /* synthetic */ Iterator a;
    final /* synthetic */ eocd b;

    public eocc(eocd eocdVar, Iterator it) {
        this.a = it;
        this.b = eocdVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        this.b.a.b = entry;
        return entry.getKey();
    }
}
