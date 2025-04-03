package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class encm<K, V> implements ennd<K, V> {
    private transient Collection a;
    private transient Set b;
    private transient Collection c;
    private transient Map d;

    @Override // defpackage.ennd
    public boolean A() {
        return i() == 0;
    }

    @Override // defpackage.ennd
    public boolean B(Object obj, Object obj2) {
        Collection collection = (Collection) w().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // defpackage.ennd
    public void C(ennd enndVar) {
        for (Map.Entry entry : enndVar.u()) {
            t(entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.ennd
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ennd) {
            return w().equals(((ennd) obj).w());
        }
        return false;
    }

    @Override // defpackage.ennd
    public final int hashCode() {
        return w().hashCode();
    }

    public abstract Collection j();

    public abstract Collection k();

    public abstract Iterator l();

    public Iterator m() {
        throw null;
    }

    public abstract Map o();

    public abstract Set p();

    @Override // defpackage.ennd
    public boolean t(Object obj, Object obj2) {
        throw null;
    }

    public final String toString() {
        return w().toString();
    }

    @Override // defpackage.ennd
    public Collection u() {
        Collection collection = this.a;
        if (collection != null) {
            return collection;
        }
        Collection j = j();
        this.a = j;
        return j;
    }

    @Override // defpackage.ennd
    public Collection v() {
        Collection collection = this.c;
        if (collection != null) {
            return collection;
        }
        Collection k = k();
        this.c = k;
        return k;
    }

    @Override // defpackage.ennd
    public Map w() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map o = o();
        this.d = o;
        return o;
    }

    @Override // defpackage.ennd
    public Set x() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set p = p();
        this.b = p;
        return p;
    }

    @Override // defpackage.ennd
    public final boolean y(Object obj, Object obj2) {
        Collection collection = (Collection) w().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // defpackage.ennd
    public boolean z(Object obj) {
        Iterator<V> it = w().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
