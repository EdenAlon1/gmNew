package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bgp implements bfl {
    private final AtomicReference c;
    public final Object a = new Object();
    private int d = 0;
    private boolean e = false;
    public final Map b = new HashMap();
    private final CopyOnWriteArraySet f = new CopyOnWriteArraySet();

    public bgp(Object obj) {
        this.c = new AtomicReference(obj);
    }

    public final void a(bfk bfkVar) {
        bgo bgoVar = (bgo) this.b.remove(bfkVar);
        if (bgoVar != null) {
            bgoVar.a.set(false);
            this.f.remove(bgoVar);
        }
    }

    @Override // defpackage.bfl
    public final ListenableFuture b() {
        Object obj = this.c.get();
        return obj instanceof bgn ? new bkk(((bgn) obj).a()) : bkj.b(obj);
    }

    @Override // defpackage.bfl
    public final void c(Executor executor, bfk bfkVar) {
        bgo bgoVar;
        synchronized (this.a) {
            a(bfkVar);
            bgoVar = new bgo(this.c, executor, bfkVar);
            this.b.put(bfkVar, bgoVar);
            this.f.add(bgoVar);
        }
        bgoVar.a(0);
    }

    @Override // defpackage.bfl
    public final void d(bfk bfkVar) {
        synchronized (this.a) {
            a(bfkVar);
        }
    }

    public final void e(Object obj) {
        Iterator it;
        int i;
        synchronized (this.a) {
            if (Objects.equals(this.c.getAndSet(obj), obj)) {
                return;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (this.e) {
                return;
            }
            this.e = true;
            Iterator it2 = this.f.iterator();
            while (true) {
                if (it2.hasNext()) {
                    ((bgo) it2.next()).a(i2);
                } else {
                    synchronized (this.a) {
                        if (this.d == i2) {
                            this.e = false;
                            return;
                        } else {
                            it = this.f.iterator();
                            i = this.d;
                        }
                    }
                    it2 = it;
                    i2 = i;
                }
            }
        }
    }
}
