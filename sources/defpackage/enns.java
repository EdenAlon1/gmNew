package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
class enns extends encm {
    final ennd a;
    final enmu b;

    public enns(ennd enndVar, enmu enmuVar) {
        enndVar.getClass();
        this.a = enndVar;
        this.b = enmuVar;
    }

    @Override // defpackage.encm, defpackage.ennd
    public final boolean A() {
        return this.a.A();
    }

    @Override // defpackage.encm, defpackage.ennd
    public final boolean B(Object obj, Object obj2) {
        return c(obj).remove(obj2);
    }

    @Override // defpackage.encm, defpackage.ennd
    public final void C(ennd enndVar) {
        throw null;
    }

    public Collection a(Object obj, Collection collection) {
        enmh enmhVar = new enmh(this.b, obj);
        return collection instanceof List ? enkr.g((List) collection, enmhVar) : new endt(collection, enmhVar);
    }

    @Override // defpackage.ennd
    public Collection c(Object obj) {
        return a(obj, this.a.c(obj));
    }

    @Override // defpackage.ennd
    public Collection d(Object obj) {
        return a(obj, this.a.d(obj));
    }

    @Override // defpackage.ennd
    public final int i() {
        return this.a.i();
    }

    @Override // defpackage.encm
    public final Collection j() {
        return new encj(this);
    }

    @Override // defpackage.encm
    public final Collection k() {
        Collection u = this.a.u();
        final enmu enmuVar = this.b;
        return new endt(u, new emwl() { // from class: enmi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return enmu.this.a(entry.getKey(), entry.getValue());
            }
        });
    }

    @Override // defpackage.encm
    public final Iterator l() {
        return enju.j(this.a.u().iterator(), ennc.b(this.b));
    }

    @Override // defpackage.encm
    public final Map o() {
        return new enmy(this.a.w(), new enmu() { // from class: ennr
            @Override // defpackage.enmu
            public final Object a(Object obj, Object obj2) {
                return enns.this.a(obj, (Collection) obj2);
            }
        });
    }

    @Override // defpackage.encm
    public final Set p() {
        return this.a.x();
    }

    @Override // defpackage.ennd
    public final void q() {
        this.a.q();
    }

    @Override // defpackage.ennd
    public final boolean s(Object obj) {
        throw null;
    }

    @Override // defpackage.encm, defpackage.ennd
    public final boolean t(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }
}
