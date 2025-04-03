package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etsp implements Iterable {
    final /* synthetic */ List a;
    final /* synthetic */ List b;

    public etsp(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new etsr(this.a.iterator(), this.b.iterator());
    }
}
