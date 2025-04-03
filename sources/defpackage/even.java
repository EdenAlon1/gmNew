package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class even extends fdxo {
    public fdxn c;
    private final ListenableFuture e;
    private final Executor f = new ersb(erpp.a);
    public final Queue a = new ArrayDeque();
    public fdxo b = null;
    public boolean d = false;

    public even(ListenableFuture listenableFuture) {
        this.e = listenableFuture;
    }

    private final void b(final Runnable runnable) {
        this.f.execute(eldl.l(new Runnable() { // from class: evei
            @Override // java.lang.Runnable
            public final void run() {
                even evenVar = even.this;
                if (evenVar.d) {
                    return;
                }
                Runnable runnable2 = runnable;
                if (evenVar.b == null) {
                    evenVar.a.add(runnable2);
                    return;
                }
                try {
                    runnable2.run();
                } catch (Throwable th) {
                    evenVar.c.a(Status.c(th), new febo());
                }
            }
        }));
    }

    @Override // defpackage.fdxo
    public final void a(final fdxn fdxnVar, final febo feboVar) {
        this.c = fdxnVar;
        elfr.l(this.e, new evem(this, fdxnVar), this.f);
        b(new Runnable() { // from class: eveh
            @Override // java.lang.Runnable
            public final void run() {
                even.this.b.a(fdxnVar, feboVar);
            }
        });
    }

    @Override // defpackage.fdxo
    public final void c(final String str, final Throwable th) {
        b(new Runnable() { // from class: eveg
            @Override // java.lang.Runnable
            public final void run() {
                even.this.b.c(str, th);
            }
        });
    }

    @Override // defpackage.fdxo
    public final void d() {
        b(new Runnable() { // from class: evel
            @Override // java.lang.Runnable
            public final void run() {
                even.this.b.d();
            }
        });
    }

    @Override // defpackage.fdxo
    public final void e(final int i) {
        b(new Runnable() { // from class: evek
            @Override // java.lang.Runnable
            public final void run() {
                even.this.b.e(i);
            }
        });
    }

    @Override // defpackage.fdxo
    public final void f(final Object obj) {
        b(new Runnable() { // from class: evej
            @Override // java.lang.Runnable
            public final void run() {
                even.this.b.f(obj);
            }
        });
    }

    public final String toString() {
        return super.toString() + "delegate=[" + String.valueOf(this.b) + "]";
    }
}
