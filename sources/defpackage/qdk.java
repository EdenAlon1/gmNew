package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qdk {
    public static Executor a = Executors.newCachedThreadPool();
    public volatile qdh b;
    private final Set c;
    private final Set d;
    private final Handler e;

    public qdk(Callable callable) {
        this(callable, false);
    }

    public final synchronized void a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.d);
        if (arrayList.isEmpty()) {
            qlp.b("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qdd) arrayList.get(i)).a(th);
        }
    }

    public final synchronized void b(Object obj) {
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qdd) arrayList.get(i)).a(obj);
        }
    }

    public final void c(qdh qdhVar) {
        if (this.b != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.b = qdhVar;
        this.e.post(new Runnable() { // from class: qdi
            @Override // java.lang.Runnable
            public final void run() {
                qdk qdkVar = qdk.this;
                qdh qdhVar2 = qdkVar.b;
                if (qdhVar2 == null) {
                    return;
                }
                Object obj = qdhVar2.a;
                if (obj != null) {
                    qdkVar.b(obj);
                } else {
                    qdkVar.a(qdhVar2.b);
                }
            }
        });
    }

    public final synchronized void d(qdd qddVar) {
        Throwable th;
        qdh qdhVar = this.b;
        if (qdhVar != null && (th = qdhVar.b) != null) {
            qddVar.a(th);
        }
        this.d.add(qddVar);
    }

    public final synchronized void e(qdd qddVar) {
        Object obj;
        qdh qdhVar = this.b;
        if (qdhVar != null && (obj = qdhVar.a) != null) {
            qddVar.a(obj);
        }
        this.c.add(qddVar);
    }

    public final synchronized void f(qdd qddVar) {
        this.d.remove(qddVar);
    }

    public final synchronized void g(qdd qddVar) {
        this.c.remove(qddVar);
    }

    public qdk(Callable callable, boolean z) {
        this.c = new LinkedHashSet(1);
        this.d = new LinkedHashSet(1);
        this.e = new Handler(Looper.getMainLooper());
        this.b = null;
        if (!z) {
            a.execute(new qdj(this, callable));
            return;
        }
        try {
            c((qdh) callable.call());
        } catch (Throwable th) {
            c(new qdh(th));
        }
    }
}
