package defpackage;

import j$.util.Set;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpg<E> extends ffdl<E> implements Set<E>, Collection, hnl, fflg {
    public static final hpg a;
    public final Object b;
    public final Object c;
    public final hoh d;

    static {
        hpj hpjVar = hpj.a;
        a = new hpg(hpjVar, hpjVar, hoh.a);
    }

    public hpg(Object obj, Object obj2, hoh hohVar) {
        this.b = obj;
        this.c = obj2;
        this.d = hohVar;
    }

    @Override // defpackage.ffcy
    public final int a() {
        return this.d.c();
    }

    @Override // defpackage.ffcy, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.ffdl, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new hph(this.b, this.d);
    }
}
