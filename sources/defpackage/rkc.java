package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rkc {
    private final Map a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;
    private long d;

    public rkc(long j) {
        this.b = j;
        this.c = j;
    }

    private final void b() {
        k(this.c);
    }

    protected int a(Object obj) {
        return 1;
    }

    public final void e() {
        k(0L);
    }

    public final synchronized void f(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
        this.c = Math.round(this.b * f);
        b();
    }

    public final synchronized long g() {
        return this.c;
    }

    public final synchronized Object h(Object obj) {
        rkb rkbVar = (rkb) this.a.get(obj);
        if (rkbVar == null) {
            return null;
        }
        return rkbVar.a;
    }

    public final synchronized Object i(Object obj, Object obj2) {
        int a = a(obj2);
        long j = a;
        if (j >= this.c) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.d += j;
        }
        rkb rkbVar = (rkb) this.a.put(obj, obj2 == null ? null : new rkb(obj2, a));
        if (rkbVar != null) {
            this.d -= rkbVar.b;
            if (!rkbVar.a.equals(obj2)) {
                c(obj, rkbVar.a);
            }
        }
        b();
        if (rkbVar != null) {
            return rkbVar.a;
        }
        return null;
    }

    public final synchronized Object j(Object obj) {
        rkb rkbVar = (rkb) this.a.remove(obj);
        if (rkbVar == null) {
            return null;
        }
        this.d -= rkbVar.b;
        return rkbVar.a;
    }

    public final synchronized void k(long j) {
        while (this.d > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            rkb rkbVar = (rkb) entry.getValue();
            this.d -= rkbVar.b;
            Object key = entry.getKey();
            it.remove();
            c(key, rkbVar.a);
        }
    }

    protected void c(Object obj, Object obj2) {
    }
}
