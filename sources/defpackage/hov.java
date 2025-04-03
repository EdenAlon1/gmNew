package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hov<K, V> extends ffcy<V> implements Collection<V>, j$.util.Collection<V>, fflg {
    private final hoh a;

    public hov(hoh hohVar) {
        this.a = hohVar;
    }

    @Override // defpackage.ffcy
    public final int a() {
        return this.a.c();
    }

    @Override // defpackage.ffcy, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new how(this.a.b);
    }
}
