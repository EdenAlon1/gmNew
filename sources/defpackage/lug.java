package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lug {
    public final lua a;
    public final lue b;
    public final CopyOnWriteArraySet c;
    private final ltn d;
    private final ArrayDeque e;
    private final ArrayDeque f;
    private final Object g;
    private boolean h;
    private boolean i;

    public lug(Looper looper, ltn ltnVar, lue lueVar) {
        this(new CopyOnWriteArraySet(), looper, ltnVar, lueVar, true);
    }

    public final lug a(Looper looper, lue lueVar) {
        return new lug(this.c, looper, this.d, lueVar, this.i);
    }

    public final void b(Object obj) {
        synchronized (this.g) {
            if (this.h) {
                return;
            }
            this.c.add(new luf(obj));
        }
    }

    public final void c() {
        g();
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.a.f()) {
            lua luaVar = this.a;
            luaVar.j(luaVar.c(1));
        }
        boolean isEmpty = this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (isEmpty) {
            while (!this.e.isEmpty()) {
                ((Runnable) this.e.peekFirst()).run();
                this.e.removeFirst();
            }
        }
    }

    public final void d(final int i, final lud ludVar) {
        g();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.c);
        this.f.add(new Runnable() { // from class: luc
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    luf lufVar = (luf) it.next();
                    if (!lufVar.d) {
                        int i2 = i;
                        if (i2 != -1) {
                            lufVar.b.b(i2);
                        }
                        lud ludVar2 = ludVar;
                        lufVar.c = true;
                        ludVar2.a(lufVar.a);
                    }
                }
            }
        });
    }

    public final void e() {
        g();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((luf) it.next()).a(this.b);
        }
        this.c.clear();
    }

    public final void f(int i, lud ludVar) {
        d(i, ludVar);
        c();
    }

    public final void g() {
        if (this.i) {
            lti.c(Thread.currentThread() == ((lva) this.a).b.getLooper().getThread());
        }
    }

    private lug(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, ltn ltnVar, lue lueVar, boolean z) {
        this.d = ltnVar;
        this.c = copyOnWriteArraySet;
        this.b = lueVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.a = ltnVar.b(looper, new Handler.Callback() { // from class: lub
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                lug lugVar = lug.this;
                Iterator it = lugVar.c.iterator();
                while (it.hasNext()) {
                    luf lufVar = (luf) it.next();
                    lue lueVar2 = lugVar.b;
                    if (!lufVar.d && lufVar.c) {
                        lpz a = lufVar.b.a();
                        lufVar.b = new lpy();
                        lufVar.c = false;
                        lueVar2.a(lufVar.a, a);
                    }
                    if (lugVar.a.f()) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.i = z;
    }
}
