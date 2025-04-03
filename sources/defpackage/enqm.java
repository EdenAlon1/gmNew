package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enqm extends enqn implements ennd {
    private static final long serialVersionUID = 0;
    transient Collection a;
    transient Map b;

    public enqm(ennd enndVar) {
        super(enndVar, null);
    }

    @Override // defpackage.ennd
    public final boolean A() {
        throw null;
    }

    @Override // defpackage.ennd
    public final boolean B(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.ennd
    public final void C(ennd enndVar) {
        throw null;
    }

    final ennd a() {
        return (ennd) this.f;
    }

    @Override // defpackage.ennd
    public final Collection c(Object obj) {
        Collection a;
        synchronized (this.g) {
            a = enqr.a(a().c(obj), this.g);
        }
        return a;
    }

    @Override // defpackage.ennd
    public final Collection d(Object obj) {
        Collection d;
        synchronized (this.g) {
            d = a().d(obj);
        }
        return d;
    }

    @Override // defpackage.ennd
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            equals = a().equals(obj);
        }
        return equals;
    }

    @Override // defpackage.ennd
    public final int hashCode() {
        int hashCode;
        synchronized (this.g) {
            hashCode = a().hashCode();
        }
        return hashCode;
    }

    @Override // defpackage.ennd
    public final int i() {
        throw null;
    }

    @Override // defpackage.ennd
    public final void q() {
        throw null;
    }

    @Override // defpackage.ennd
    public final boolean s(Object obj) {
        throw null;
    }

    @Override // defpackage.ennd
    public final boolean t(Object obj, Object obj2) {
        boolean t;
        synchronized (this.g) {
            t = a().t(obj, obj2);
        }
        return t;
    }

    @Override // defpackage.ennd
    public final Collection u() {
        Collection collection;
        synchronized (this.g) {
            if (this.a == null) {
                this.a = enqr.a(a().u(), this.g);
            }
            collection = this.a;
        }
        return collection;
    }

    @Override // defpackage.ennd
    public final Collection v() {
        throw null;
    }

    @Override // defpackage.ennd
    public final Map w() {
        Map map;
        synchronized (this.g) {
            if (this.b == null) {
                this.b = new enqd(a().w(), this.g);
            }
            map = this.b;
        }
        return map;
    }

    @Override // defpackage.ennd
    public final Set x() {
        throw null;
    }

    @Override // defpackage.ennd
    public final boolean y(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.ennd
    public final boolean z(Object obj) {
        throw null;
    }
}
