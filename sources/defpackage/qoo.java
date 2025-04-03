package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qoo {
    public final Set a;
    public final PriorityBlockingQueue b;
    public final PriorityBlockingQueue c;
    public final qnw d;
    public final qof[] e;
    public qny f;
    public final List g;
    public final qod h;
    public final qpa i;
    private final AtomicInteger j;
    private final List k;

    public qoo(qnw qnwVar, qpa qpaVar) {
        qod qodVar = new qod(new Handler(Looper.getMainLooper()));
        this.j = new AtomicInteger();
        this.a = new HashSet();
        this.b = new PriorityBlockingQueue();
        this.c = new PriorityBlockingQueue();
        this.g = new ArrayList();
        this.k = new ArrayList();
        this.d = qnwVar;
        this.i = qpaVar;
        this.e = new qof[4];
        this.h = qodVar;
    }

    public final void a(qol qolVar) {
        qolVar.g = this;
        synchronized (this.a) {
            this.a.add(qolVar);
        }
        qolVar.f = Integer.valueOf(this.j.incrementAndGet());
        qolVar.d("add-to-queue");
        b();
        this.b.add(qolVar);
    }

    final void b() {
        synchronized (this.k) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ((qom) it.next()).a();
            }
        }
    }
}
