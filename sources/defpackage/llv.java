package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class llv {
    public final Map a;
    public final lnt b;

    public llv() {
        this.a = new LinkedHashMap();
        this.b = new lnt((byte[]) null);
    }

    public final owu a() {
        return this.b.d;
    }

    public final Object b(String str) {
        Object c;
        str.getClass();
        lnt lntVar = this.b;
        try {
            fgcm fgcmVar = (fgcm) lntVar.c.get(str);
            if (fgcmVar != null && (c = fgcmVar.c()) != null) {
                return c;
            }
            return lntVar.a.get(str);
        } catch (ClassCastException unused) {
            lntVar.a(str);
            return null;
        }
    }

    public final Object c(String str) {
        str.getClass();
        Object a = this.b.a(str);
        if (((llu) this.a.remove(str)) == null) {
            return a;
        }
        throw null;
    }

    public final void d(String str, Object obj) {
        str.getClass();
        List list = lnu.a;
        if (obj != null) {
            List list2 = lnu.a;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((Class) it.next()).isInstance(obj)) {
                    }
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        Object obj2 = this.a.get(str);
        llg llgVar = obj2 instanceof llg ? (llg) obj2 : null;
        if (llgVar != null) {
            llgVar.m(obj);
        }
        this.b.b(str, obj);
    }

    public final void e(String str, owu owuVar) {
        this.b.b.put(str, owuVar);
    }

    public final boolean f() {
        return this.b.a.containsKey("FutureListenerState");
    }

    public llv(Map map) {
        this.a = new LinkedHashMap();
        this.b = new lnt(map);
    }
}
