package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsv implements Map, htm, fflk {
    public hto a;
    public final Set b;
    public final Set c;
    private final Collection d;

    public hsv() {
        hoh hohVar = hoh.a;
        hrw b = hsj.b();
        hsu hsuVar = new hsu(b.v(), hohVar);
        if (!(b instanceof hrp)) {
            hsuVar.h = new hsu(1L, hohVar);
        }
        this.a = hsuVar;
        this.b = new hsk(this);
        this.c = new hsl(this);
        this.d = new hsn(this);
    }

    public static final boolean f(hsu hsuVar, int i, hnp hnpVar) {
        boolean z;
        synchronized (hsw.a) {
            int i2 = hsuVar.b;
            if (i2 == i) {
                hsuVar.a = hnpVar;
                z = true;
                hsuVar.b = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final int a() {
        return c().b;
    }

    public final int b() {
        return c().a.size();
    }

    public final hsu c() {
        hto htoVar = this.a;
        htoVar.getClass();
        return (hsu) hsj.j(htoVar, this);
    }

    @Override // java.util.Map
    public final void clear() {
        hrw b;
        hto htoVar = this.a;
        htoVar.getClass();
        hnp hnpVar = ((hsu) hsj.e(htoVar)).a;
        hoh hohVar = hoh.a;
        if (hohVar != hnpVar) {
            hto htoVar2 = this.a;
            htoVar2.getClass();
            synchronized (hsj.c) {
                b = hsj.b();
                hsu hsuVar = (hsu) hsj.l(htoVar2, this, b);
                synchronized (hsw.a) {
                    hsuVar.a = hohVar;
                    hsuVar.b++;
                }
            }
            hsj.t(b, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return c().a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return c().a.containsValue(obj);
    }

    @Override // defpackage.htm
    public final hto d() {
        return this.a;
    }

    @Override // defpackage.htm
    public final void e(hto htoVar) {
        htoVar.getClass();
        this.a = (hsu) htoVar;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.b;
    }

    @Override // defpackage.htm
    public final /* synthetic */ hto g(hto htoVar, hto htoVar2, hto htoVar3) {
        return null;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return c().a.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return c().a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        hnp hnpVar;
        int i;
        Object put;
        hrw b;
        boolean f;
        do {
            synchronized (hsw.a) {
                hto htoVar = this.a;
                htoVar.getClass();
                hsu hsuVar = (hsu) hsj.e(htoVar);
                hnpVar = hsuVar.a;
                i = hsuVar.b;
            }
            hnpVar.getClass();
            hno b2 = hnpVar.b();
            put = b2.put(obj, obj2);
            hnp a = b2.a();
            if (ffkj.e(a, hnpVar)) {
                break;
            }
            hto htoVar2 = this.a;
            htoVar2.getClass();
            synchronized (hsj.c) {
                b = hsj.b();
                f = f((hsu) hsj.l(htoVar2, this, b), i, a);
            }
            hsj.t(b, this);
        } while (!f);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        hnp hnpVar;
        int i;
        hrw b;
        boolean f;
        do {
            synchronized (hsw.a) {
                hto htoVar = this.a;
                htoVar.getClass();
                hsu hsuVar = (hsu) hsj.e(htoVar);
                hnpVar = hsuVar.a;
                i = hsuVar.b;
            }
            hnpVar.getClass();
            hno b2 = hnpVar.b();
            b2.putAll(map);
            hnp a = b2.a();
            if (ffkj.e(a, hnpVar)) {
                return;
            }
            hto htoVar2 = this.a;
            htoVar2.getClass();
            synchronized (hsj.c) {
                b = hsj.b();
                f = f((hsu) hsj.l(htoVar2, this, b), i, a);
            }
            hsj.t(b, this);
        } while (!f);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        hnp hnpVar;
        int i;
        Object remove;
        hrw b;
        boolean f;
        do {
            synchronized (hsw.a) {
                hto htoVar = this.a;
                htoVar.getClass();
                hsu hsuVar = (hsu) hsj.e(htoVar);
                hnpVar = hsuVar.a;
                i = hsuVar.b;
            }
            hnpVar.getClass();
            hno b2 = hnpVar.b();
            remove = b2.remove(obj);
            hnp a = b2.a();
            if (ffkj.e(a, hnpVar)) {
                break;
            }
            hto htoVar2 = this.a;
            htoVar2.getClass();
            synchronized (hsj.c) {
                b = hsj.b();
                f = f((hsu) hsj.l(htoVar2, this, b), i, a);
            }
            hsj.t(b, this);
        } while (!f);
        return remove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return b();
    }

    public final String toString() {
        hto htoVar = this.a;
        htoVar.getClass();
        return "SnapshotStateMap(value=" + ((hsu) hsj.e(htoVar)).a + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.d;
    }
}
