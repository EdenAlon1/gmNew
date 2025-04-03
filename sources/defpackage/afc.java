package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afc<K, V> implements Iterable<Map.Entry<K, V>> {
    public aey b;
    public aey c;
    public final WeakHashMap d = new WeakHashMap();
    public int e = 0;

    protected aey a(Object obj) {
        aey aeyVar = this.b;
        while (aeyVar != null && !aeyVar.a.equals(obj)) {
            aeyVar = aeyVar.c;
        }
        return aeyVar;
    }

    public Object b(Object obj) {
        aey a = a(obj);
        if (a == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            Iterator<K> it = this.d.keySet().iterator();
            while (it.hasNext()) {
                ((afb) it.next()).dH(a);
            }
        }
        aey aeyVar = a.d;
        aey aeyVar2 = a.c;
        if (aeyVar != null) {
            aeyVar.c = aeyVar2;
        } else {
            this.b = aeyVar2;
        }
        aey aeyVar3 = a.c;
        if (aeyVar3 != null) {
            aeyVar3.d = aeyVar;
        } else {
            this.c = aeyVar;
        }
        a.c = null;
        a.d = null;
        return a.b;
    }

    public final aey d(Object obj, Object obj2) {
        aey aeyVar = new aey(obj, obj2);
        this.e++;
        aey aeyVar2 = this.c;
        if (aeyVar2 == null) {
            this.b = aeyVar;
        } else {
            aeyVar2.c = aeyVar;
            aeyVar.d = aeyVar2;
        }
        this.c = aeyVar;
        return aeyVar;
    }

    public final aez e() {
        aez aezVar = new aez(this);
        this.d.put(aezVar, false);
        return aezVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof afc)) {
            return false;
        }
        afc afcVar = (afc) obj;
        if (this.e != afcVar.e) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = afcVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry next = ((afa) it).next();
            Map.Entry next2 = ((afa) it2).next();
            if (next == null) {
                if (next2 != null) {
                    return false;
                }
                next2 = null;
            }
            if (next != null && !next.equals(next2)) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public final Object f(Object obj, Object obj2) {
        aey a = a(obj);
        if (a != null) {
            return a.b;
        }
        d(obj, obj2);
        return null;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((afa) it).next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        aew aewVar = new aew(this.b, this.c);
        this.d.put(aewVar, false);
        return aewVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(((afa) it).next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
