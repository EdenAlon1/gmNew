package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ennn extends ennb {
    public final ennd a;

    public ennn(ennd enndVar) {
        this.a = enndVar;
    }

    @Override // defpackage.ennb
    public final Set b() {
        return new ennm(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.q();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.s(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (containsKey(obj)) {
            return new enjv((enkf) this.a, obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.a.A();
    }

    @Override // defpackage.ennb, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.x();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        if (containsKey(obj)) {
            return ((enkf) this.a).d(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.x().size();
    }
}
