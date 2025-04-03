package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class endy extends AbstractSet {
    final /* synthetic */ ened a;

    public endy(ened enedVar) {
        this.a = enedVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map n = this.a.n();
        if (n != null) {
            return n.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int f = this.a.f(entry.getKey());
            if (f != -1 && emxb.a(this.a.j(f), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return this.a.k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map n = this.a.n();
        if (n != null) {
            return n.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        ened enedVar = this.a;
        if (enedVar.u()) {
            return false;
        }
        int e = enedVar.e();
        Object key = entry.getKey();
        Object value = entry.getValue();
        ened enedVar2 = this.a;
        int d = eneg.d(key, value, e, enedVar2.i(), enedVar2.v(), enedVar2.w(), enedVar2.x());
        if (d == -1) {
            return false;
        }
        this.a.r(d, e);
        r10.f--;
        this.a.o();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
