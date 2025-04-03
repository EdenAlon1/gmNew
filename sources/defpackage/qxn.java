package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qxn implements qxd {
    private final qxj a;
    private final qxm b;
    private final Map c;
    private final Map d;
    private final int e;
    private int f;

    public qxn() {
        this.a = new qxj();
        this.b = new qxm();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }

    private final qxc f(Class cls) {
        qxc qxhVar;
        qxc qxcVar = (qxc) this.d.get(cls);
        if (qxcVar != null) {
            return qxcVar;
        }
        if (cls.equals(int[].class)) {
            qxhVar = new qxk();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(String.valueOf(cls.getSimpleName())));
            }
            qxhVar = new qxh();
        }
        this.d.put(cls, qxhVar);
        return qxhVar;
    }

    private final Object g(qxl qxlVar, Class cls) {
        qxj qxjVar = this.a;
        qxc f = f(cls);
        Object a = qxjVar.a(qxlVar);
        if (a != null) {
            this.f -= f.a(a) * f.b();
            i(f.a(a), cls);
        }
        if (a != null) {
            return a;
        }
        if (Log.isLoggable(f.d(), 2)) {
            Log.v(f.d(), "Allocated " + qxlVar.a + " bytes");
        }
        return f.c(qxlVar.a);
    }

    private final NavigableMap h(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(cls, treeMap);
        return treeMap;
    }

    private final void i(int i, Class cls) {
        NavigableMap h = h(cls);
        Integer valueOf = Integer.valueOf(i);
        Integer num = (Integer) h.get(valueOf);
        if (num != null) {
            if (num.intValue() == 1) {
                h.remove(valueOf);
                return;
            } else {
                h.put(valueOf, Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + toString());
    }

    private final void j(int i) {
        while (this.f > i) {
            Object b = this.a.b();
            rkf.f(b);
            qxc f = f(b.getClass());
            this.f -= f.a(b) * f.b();
            i(f.a(b), b.getClass());
            if (Log.isLoggable(f.d(), 2)) {
                Log.v(f.d(), "evicted: " + f.a(b));
            }
        }
    }

    @Override // defpackage.qxd
    public final synchronized Object a(int i, Class cls) {
        qxl d;
        Integer num = (Integer) h(cls).ceilingKey(Integer.valueOf(i));
        if (num != null) {
            int i2 = this.f;
            if (i2 != 0 && this.e / i2 < 2 && num.intValue() > i * 8) {
            }
            d = this.b.d(num.intValue(), cls);
        }
        d = this.b.d(i, cls);
        return g(d, cls);
    }

    @Override // defpackage.qxd
    public final synchronized void b() {
        j(0);
    }

    @Override // defpackage.qxd
    public final synchronized void c(Object obj) {
        Class<?> cls = obj.getClass();
        qxc f = f(cls);
        int a = f.a(obj);
        int b = f.b() * a;
        int i = 1;
        if (b <= (this.e >> 1)) {
            qxl d = this.b.d(a, cls);
            this.a.c(d, obj);
            NavigableMap h = h(cls);
            Integer num = (Integer) h.get(Integer.valueOf(d.a));
            Integer valueOf = Integer.valueOf(d.a);
            if (num != null) {
                i = 1 + num.intValue();
            }
            h.put(valueOf, Integer.valueOf(i));
            this.f += b;
            j(this.e);
        }
    }

    @Override // defpackage.qxd
    public final synchronized void d(int i) {
        if (i >= 40) {
            b();
        } else if (i >= 20 || i == 15) {
            j(this.e >> 1);
        }
    }

    @Override // defpackage.qxd
    public final synchronized Object e(Class cls) {
        return g(this.b.d(8, cls), cls);
    }

    public qxn(int i) {
        this.a = new qxj();
        this.b = new qxm();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = i;
    }
}
