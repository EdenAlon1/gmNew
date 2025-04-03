package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enjj extends enfc {
    final /* synthetic */ Iterable a;

    public enjj(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        emxf.b(true, "limit is negative");
        return new enjo(it);
    }
}
