package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enfl extends enfm implements ennd {
    protected enfl() {
    }

    @Override // defpackage.ennd
    public final boolean A() {
        throw null;
    }

    @Override // defpackage.ennd
    public boolean B(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.ennd
    public void C(ennd enndVar) {
        throw null;
    }

    public Collection c(Object obj) {
        throw null;
    }

    public Collection d(Object obj) {
        throw null;
    }

    protected abstract ennd e();

    @Override // defpackage.ennd
    public final boolean equals(Object obj) {
        return obj == this || e().equals(obj);
    }

    @Override // defpackage.enfm
    protected /* bridge */ /* synthetic */ Object hC() {
        throw null;
    }

    @Override // defpackage.ennd
    public final int hashCode() {
        return e().hashCode();
    }

    @Override // defpackage.ennd
    public final int i() {
        throw null;
    }

    @Override // defpackage.ennd
    public void q() {
        throw null;
    }

    @Override // defpackage.ennd
    public final boolean s(Object obj) {
        throw null;
    }

    @Override // defpackage.ennd
    public boolean t(Object obj, Object obj2) {
        return e().t(obj, obj2);
    }

    @Override // defpackage.ennd
    public Collection u() {
        return e().u();
    }

    @Override // defpackage.ennd
    public Collection v() {
        throw null;
    }

    @Override // defpackage.ennd
    public Map w() {
        return e().w();
    }

    @Override // defpackage.ennd
    public Set x() {
        return e().x();
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
