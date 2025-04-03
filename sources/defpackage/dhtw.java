package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class dhtw {
    public final Set a;
    private final Executor b;
    private final ecgi c;
    private Object d;

    protected dhtw(Executor executor, ecda ecdaVar) {
        executor.getClass();
        this.b = executor;
        this.a = new HashSet();
        this.c = new ecgk(ecdaVar);
    }

    protected abstract void a(Object obj, Object obj2);

    public final int b() {
        int size;
        synchronized (this) {
            size = this.a.size();
        }
        return size;
    }

    protected final Object c() {
        Object obj;
        synchronized (this) {
            obj = this.d;
        }
        return obj;
    }

    public final void d(final Object obj) {
        synchronized (this) {
            this.a.add(obj);
            final Object obj2 = this.d;
            if (obj2 != null) {
                this.b.execute(new Runnable() { // from class: dhtv
                    @Override // java.lang.Runnable
                    public final void run() {
                        dhtw.this.a(obj, obj2);
                    }
                });
            }
        }
    }

    public final void e() {
        synchronized (this) {
            this.d = null;
            this.a.clear();
        }
    }

    public final void f(final Object obj) {
        synchronized (this) {
            dhtk.a.n().J("[ListenersManager(%s)] Notifying %s registered listeners of new value=%s", this.c, Integer.valueOf(this.a.size()), obj);
            if (Objects.equals(this.d, obj)) {
                dhtk.a.n().D("[ListenersManager(%s)] Skipping notification for newValue=%s, it is the same as previously notified.", this.c, obj);
                return;
            }
            this.d = obj;
            ArrayList arrayList = new ArrayList(this.a);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                final Object obj2 = arrayList.get(i);
                this.b.execute(new Runnable() { // from class: dhtu
                    @Override // java.lang.Runnable
                    public final void run() {
                        dhtw.this.a(obj2, obj);
                    }
                });
            }
        }
    }

    public final String toString() {
        String str;
        synchronized (this) {
            str = "ListenersManager{@" + System.identityHashCode(this) + " logId=" + ((ecgk) this.c).a + ", listeners=" + this.a.toString() + "}";
        }
        return str;
    }
}
