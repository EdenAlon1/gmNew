package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enmr extends ennb {
    public final Set a;
    final emwl b;

    public enmr(Set set, emwl emwlVar) {
        this.a = set;
        this.b = emwlVar;
    }

    @Override // defpackage.ennb
    public final Set b() {
        return new enmq(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.ennb
    public final Set g() {
        return new enmm(this.a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (endu.b(this.a, obj)) {
            return this.b.apply(obj);
        }
        return null;
    }

    @Override // defpackage.ennb
    public final Collection hD() {
        return new endt(this.a, this.b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (this.a.remove(obj)) {
            return this.b.apply(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }
}
