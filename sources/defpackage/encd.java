package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class encd extends encm implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;

    protected encd(Map map) {
        emxf.a(map.isEmpty());
        this.a = map;
    }

    public abstract Collection a();

    public Collection b() {
        throw null;
    }

    @Override // defpackage.ennd
    public Collection c(Object obj) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection == null) {
            collection = a();
        }
        return f(obj, collection);
    }

    @Override // defpackage.ennd
    public Collection d(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return b();
        }
        Collection a = a();
        a.addAll(collection);
        this.b -= collection.size();
        collection.clear();
        return e(a);
    }

    public Collection e(Collection collection) {
        throw null;
    }

    public Collection f(Object obj, Collection collection) {
        throw null;
    }

    @Override // defpackage.ennd
    public final int i() {
        return this.b;
    }

    @Override // defpackage.encm
    public final Collection j() {
        return this instanceof enpj ? new enck(this) : new encj(this);
    }

    @Override // defpackage.encm
    public final Collection k() {
        return new encl(this);
    }

    @Override // defpackage.encm
    public final Iterator l() {
        return new enbm(this);
    }

    @Override // defpackage.encm
    public final Iterator m() {
        return new enbl(this);
    }

    final List n(Object obj, List list, enbz enbzVar) {
        return list instanceof RandomAccess ? new enbv(this, obj, list, enbzVar) : new encb(this, obj, list, enbzVar);
    }

    @Override // defpackage.encm
    public Map o() {
        return new enbp(this, this.a);
    }

    @Override // defpackage.encm
    public Set p() {
        return new enbs(this, this.a);
    }

    @Override // defpackage.ennd
    public final void q() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.a.clear();
        this.b = 0;
    }

    final void r(Map map) {
        this.a = map;
        this.b = 0;
        for (Collection collection : map.values()) {
            emxf.a(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    @Override // defpackage.ennd
    public final boolean s(Object obj) {
        throw null;
    }

    @Override // defpackage.encm, defpackage.ennd
    public final boolean t(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.b++;
            return true;
        }
        Collection a = a();
        if (!a.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.b++;
        this.a.put(obj, a);
        return true;
    }
}
