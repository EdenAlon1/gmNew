package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ennv extends enfl implements Serializable {
    private static final long serialVersionUID = 0;
    final ennd a;
    transient Collection b;
    transient Set c;
    transient Map d;

    public ennv(ennd enndVar) {
        this.a = enndVar;
    }

    @Override // defpackage.enfl, defpackage.ennd
    public final boolean B(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.enfl, defpackage.ennd
    public final void C(ennd enndVar) {
        throw null;
    }

    @Override // defpackage.enfl, defpackage.ennd
    public Collection c(Object obj) {
        return ennw.a(((enfi) this.a).c(obj));
    }

    @Override // defpackage.enfl, defpackage.ennd
    public Collection d(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.enfl, defpackage.enfm
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ennd hC() {
        return this.a;
    }

    @Override // defpackage.enfl, defpackage.ennd
    public final void q() {
        throw null;
    }

    @Override // defpackage.enfl, defpackage.ennd
    public final boolean t(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.enfl, defpackage.ennd
    public final Collection u() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        enmz enmzVar = new enmz(DesugarCollections.unmodifiableCollection(this.a.u()));
        this.b = enmzVar;
        return enmzVar;
    }

    @Override // defpackage.enfl, defpackage.ennd
    public final Collection v() {
        throw null;
    }

    @Override // defpackage.enfl, defpackage.ennd
    public final Map w() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(ennc.l(this.a.w(), new emwl() { // from class: ennu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ennw.a((Collection) obj);
            }
        }));
        this.d = unmodifiableMap;
        return unmodifiableMap;
    }

    @Override // defpackage.enfl, defpackage.ennd
    public final Set x() {
        Set set = this.c;
        if (set != null) {
            return set;
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(this.a.x());
        this.c = unmodifiableSet;
        return unmodifiableSet;
    }
}
