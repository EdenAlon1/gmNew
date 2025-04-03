package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hsn extends hsm {
    public hsn(hsv hsvVar) {
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
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [hnl, java.util.Set] */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new htl(this.a, this.a.c().a.entrySet().iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        hsv hsvVar = this.a;
        Iterator it = hsvVar.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (ffkj.e(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null) {
            return false;
        }
        hsvVar.remove(entry.getKey());
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        hnp hnpVar;
        int i;
        hrw b;
        boolean f;
        hsv hsvVar = this.a;
        Set ar = ffdx.ar(collection);
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
            for (Map.Entry entry : set) {
                if (ar.contains(entry.getValue())) {
                    b2.remove(entry.getKey());
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

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        hnp hnpVar;
        int i;
        hrw b;
        boolean f;
        hsv hsvVar = this.a;
        Set ar = ffdx.ar(collection);
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
            for (Map.Entry entry : set) {
                if (!ar.contains(entry.getValue())) {
                    b2.remove(entry.getKey());
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
