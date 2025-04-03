package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qwi implements Iterable {
    public final List a;

    public qwi(List list) {
        this.a = list;
    }

    final int a() {
        return this.a.size();
    }

    final qwi b() {
        return new qwi(new ArrayList(this.a));
    }

    final boolean c(rih rihVar) {
        return this.a.contains(new qwh(rihVar, rjx.b));
    }

    final boolean d() {
        return this.a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<qwh> iterator() {
        return this.a.iterator();
    }

    public qwi() {
        this(new ArrayList(2));
    }
}
