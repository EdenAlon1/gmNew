package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cnq {
    public final cpw a;
    public final cpv b;
    private final int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public cnq(int i) {
        this.c = i;
        if (i <= 0) {
            cpx.a("maxSize <= 0");
        }
        this.a = new cpw(0);
        this.b = new cpv();
    }

    private static final void a(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
    }

    protected static final void g(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
    }

    protected Object b(Object obj) {
        return null;
    }

    public final Object c(Object obj) {
        Object a;
        obj.getClass();
        synchronized (this.b) {
            Object obj2 = this.a.a.get(obj);
            if (obj2 != null) {
                this.h++;
                return obj2;
            }
            this.i++;
            Object b = b(obj);
            if (b == null) {
                return null;
            }
            synchronized (this.b) {
                this.f++;
                a = this.a.a(obj, b);
                if (a != null) {
                    this.a.a(obj, a);
                } else {
                    int i = this.d;
                    a(obj, b);
                    this.d = i + 1;
                }
            }
            if (a != null) {
                g(obj, b);
                return a;
            }
            f(this.c);
            return b;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object a;
        obj.getClass();
        obj2.getClass();
        synchronized (this.b) {
            this.e++;
            int i = this.d;
            a(obj, obj2);
            this.d = i + 1;
            a = this.a.a(obj, obj2);
            if (a != null) {
                int i2 = this.d;
                a(obj, a);
                this.d = i2 - 1;
            }
        }
        if (a != null) {
            g(obj, a);
        }
        f(this.c);
        return a;
    }

    public final Object e(Object obj) {
        Object b;
        synchronized (this.b) {
            b = this.a.b(obj);
            if (b != null) {
                int i = this.d;
                a(obj, b);
                this.d = i - 1;
            }
        }
        if (b != null) {
            g(obj, b);
        }
        return b;
    }

    public final void f(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.b) {
                if (this.d < 0 || (this.a.d() && this.d != 0)) {
                    cpx.b("LruCache.sizeOf() is reporting inconsistent results!");
                }
                if (this.d <= i || this.a.d()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) ffdx.L(this.a.c());
                if (entry == null) {
                    return;
                }
                key = entry.getKey();
                value = entry.getValue();
                this.a.b(key);
                int i2 = this.d;
                a(key, value);
                this.d = i2 - 1;
                this.g++;
            }
            g(key, value);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.b) {
            int i = this.h;
            int i2 = this.i + i;
            str = "LruCache[maxSize=" + this.c + ",hits=" + this.h + ",misses=" + this.i + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }
}
