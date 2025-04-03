package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hsk<K, V> extends hsm<K, V, Map.Entry<K, V>> {
    public hsk(hsv hsvVar) {
        super(hsvVar);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        hsw.a();
        throw new ffbx();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        hsw.a();
        throw new ffbx();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!fflf.c(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ffkj.e(this.a.get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [hnl, java.util.Set] */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new hti(this.a, this.a.c().a.entrySet().iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        return fflf.c(obj) && this.a.remove(((Map.Entry) obj).getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (this.a.remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        hnp hnpVar;
        int i;
        hrw b;
        boolean f;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(collection, 10)), 16));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ffcf ffcfVar = new ffcf(entry.getKey(), entry.getValue());
            linkedHashMap.put(ffcfVar.a, ffcfVar.b);
        }
        hsv hsvVar = this.a;
        boolean z = false;
        do {
            synchronized (hsw.a) {
                hto htoVar = hsvVar.a;
                htoVar.getClass();
                hsu hsuVar = (hsu) hsj.e(htoVar);
                hnpVar = hsuVar.a;
                i = hsuVar.b;
            }
            hnpVar.getClass();
            Set<Map.Entry> set = hsvVar.b;
            hno b2 = hnpVar.b();
            for (Map.Entry entry2 : set) {
                if (!linkedHashMap.containsKey(entry2.getKey()) || !ffkj.e(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    b2.remove(entry2.getKey());
                    z = true;
                }
            }
            hnp a = b2.a();
            if (ffkj.e(a, hnpVar)) {
                break;
            }
            hto htoVar2 = hsvVar.a;
            htoVar2.getClass();
            synchronized (hsj.c) {
                b = hsj.b();
                f = hsv.f((hsu) hsj.l(htoVar2, hsvVar, b), i, a);
            }
            hsj.t(b, hsvVar);
        } while (!f);
        return z;
    }
}
