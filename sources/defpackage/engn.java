package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class engn extends enip {
    private final transient EnumSet a;
    private transient int b;

    public engn(EnumSet enumSet) {
        this.a = enumSet;
    }

    public static enip a(EnumSet enumSet) {
        int size = enumSet.size();
        return size != 0 ? size != 1 ? new engn(enumSet) : new enpx((Enum) enjk.l(enumSet)) : enpd.a;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.enip
    public final boolean b() {
        return true;
    }

    @Override // defpackage.engi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof engn) {
            collection = ((engn) collection).a;
        }
        return this.a.containsAll(collection);
    }

    @Override // defpackage.enip, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof engn) {
            obj = ((engn) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.enip, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.a.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // defpackage.enip, defpackage.engi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final enqu listIterator() {
        return enju.d(this.a.iterator());
    }

    @Override // defpackage.engi
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.enip, defpackage.engi
    public Object writeReplace() {
        return new engm(this.a);
    }
}
