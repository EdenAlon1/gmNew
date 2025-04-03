package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enht extends enqu {
    final Iterator a;
    Object b = null;
    Iterator c = enjp.a;
    final /* synthetic */ enhz d;

    public enht(enhz enhzVar) {
        this.d = enhzVar;
        this.a = enhzVar.map.entrySet().listIterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((engi) entry.getValue()).listIterator();
        }
        Object obj = this.b;
        obj.getClass();
        return new engj(obj, this.c.next());
    }
}
