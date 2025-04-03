package defpackage;

import j$.util.Set;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hot<K, V> extends ffdl<K> implements Set<K>, hnl {
    private final hoh a;

    public hot(hoh hohVar) {
        this.a = hohVar;
    }

    @Override // defpackage.ffcy
    public final int a() {
        return this.a.c();
    }

    @Override // defpackage.ffcy, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.ffdl, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new hou(this.a.b);
    }
}
