package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oki<Key, Value> extends okj<Key, Value> implements Iterable<Value>, fflg {
    public static final oki a = new oki(ffel.a, null, null, 0, 0);
    public final List b;
    public final Object c;
    public final Object d;
    public final int e;
    public final int f;

    public oki(List list, Object obj, Object obj2) {
        this(list, obj, obj2, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oki)) {
            return false;
        }
        oki okiVar = (oki) obj;
        return ffkj.e(this.b, okiVar.b) && ffkj.e(this.c, okiVar.c) && ffkj.e(this.d, okiVar.d) && this.e == okiVar.e && this.f == okiVar.f;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Object obj = this.c;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.d;
        return ((((hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.e) * 31) + this.f;
    }

    @Override // java.lang.Iterable
    public final Iterator<Value> iterator() {
        return this.b.listIterator();
    }

    public final String toString() {
        String c;
        c = ffpc.c("LoadResult.Page(\n                    |   data size: " + this.b.size() + "\n                    |   first Item: " + ffdx.M(this.b) + "\n                    |   last Item: " + ffdx.Q(this.b) + "\n                    |   nextKey: " + this.d + "\n                    |   prevKey: " + this.c + "\n                    |   itemsBefore: " + this.e + "\n                    |   itemsAfter: " + this.f + "\n                    |) ", "|");
        return c;
    }

    public oki(List list, Object obj, Object obj2, int i, int i2) {
        this.b = list;
        this.c = obj;
        this.d = obj2;
        this.e = i;
        this.f = i2;
        if (i != Integer.MIN_VALUE && i < 0) {
            throw new IllegalArgumentException("itemsBefore cannot be negative");
        }
        if (i2 != Integer.MIN_VALUE && i2 < 0) {
            throw new IllegalArgumentException("itemsAfter cannot be negative");
        }
    }
}
