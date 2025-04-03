package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enhz<K, V> extends encv<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient enhk<K, ? extends engi<V>> map;
    final transient int size;

    public enhz(enhk enhkVar, int i) {
        this.map = enhkVar;
        this.size = i;
    }

    @Override // defpackage.encm, defpackage.ennd
    @Deprecated
    public final boolean B(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.encm, defpackage.ennd
    @Deprecated
    public final void C(ennd enndVar) {
        throw null;
    }

    @Override // defpackage.encm, defpackage.ennd
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final enip x() {
        return this.map.keySet();
    }

    public final boolean E() {
        return this.map.hH();
    }

    /* renamed from: a */
    public abstract engi c(Object obj);

    @Override // defpackage.ennd
    public /* bridge */ /* synthetic */ Collection c(Object obj) {
        throw null;
    }

    @Override // defpackage.ennd
    @Deprecated
    public /* bridge */ /* synthetic */ Collection d(Object obj) {
        throw null;
    }

    @Override // defpackage.ennd
    public final int i() {
        return this.size;
    }

    @Override // defpackage.encm
    public final /* synthetic */ Collection j() {
        return new enhw(this);
    }

    @Override // defpackage.encm
    public final /* synthetic */ Collection k() {
        return new enhy(this);
    }

    @Override // defpackage.encm
    public final /* synthetic */ Iterator l() {
        return new enht(this);
    }

    @Override // defpackage.encm
    public final Map o() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.encm
    public final Set p() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.ennd
    @Deprecated
    public final void q() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.encm, defpackage.ennd
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public engi u() {
        return (engi) super.u();
    }

    @Override // defpackage.ennd
    public final boolean s(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // defpackage.encm, defpackage.ennd
    @Deprecated
    public final boolean t(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.encm, defpackage.ennd
    public final /* bridge */ /* synthetic */ Collection v() {
        return (engi) super.v();
    }

    @Override // defpackage.encm, defpackage.ennd
    public /* synthetic */ Map w() {
        return this.map;
    }

    @Override // defpackage.encm, defpackage.ennd
    public final boolean z(Object obj) {
        return obj != null && super.z(obj);
    }
}
