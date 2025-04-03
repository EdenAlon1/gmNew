package defpackage;

import j$.util.Collection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enie extends enif implements Collection, enny {
    private static final long serialVersionUID = 912559;
    private transient engw a;
    private transient enip b;

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.enny
    @Deprecated
    public final int a(Object obj, int i) {
        throw null;
    }

    @Override // defpackage.engi
    public final int c(Object[] objArr, int i) {
        enqu listIterator = j().listIterator();
        while (listIterator.hasNext()) {
            ennx ennxVar = (ennx) listIterator.next();
            Arrays.fill(objArr, i, ennxVar.a() + i, ennxVar.b());
            i += ennxVar.a();
        }
        return i;
    }

    @Override // defpackage.engi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return b(obj) > 0;
    }

    @Override // defpackage.enny
    @Deprecated
    public final int d(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return enod.a(this, obj);
    }

    @Override // defpackage.engi
    public final engw g() {
        engw engwVar = this.a;
        if (engwVar != null) {
            return engwVar;
        }
        engw g = super.g();
        this.a = g;
        return g;
    }

    @Override // defpackage.enny
    @Deprecated
    public final boolean h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return enpw.a(j());
    }

    @Override // defpackage.enny
    public /* bridge */ /* synthetic */ Set i() {
        throw null;
    }

    @Override // defpackage.engi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final enqu listIterator() {
        return new enia(j().listIterator());
    }

    public abstract enip n();

    @Override // defpackage.enny
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final enip j() {
        enip enipVar = this.b;
        if (enipVar == null) {
            enipVar = isEmpty() ? enpd.a : new enic(this);
            this.b = enipVar;
        }
        return enipVar;
    }

    public abstract ennx p(int i);

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j().toString();
    }

    @Override // defpackage.engi
    public abstract Object writeReplace();
}
