package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enia extends enqu {
    int a;
    Object b;
    final /* synthetic */ Iterator c;

    public enia(Iterator it) {
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i <= 0) {
            ennx ennxVar = (ennx) this.c.next();
            this.b = ennxVar.b();
            i = ennxVar.a();
        }
        this.a = i - 1;
        Object obj = this.b;
        obj.getClass();
        return obj;
    }
}
