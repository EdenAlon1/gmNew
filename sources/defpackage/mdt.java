package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdt {
    public final Object a = new Object();
    public final Queue b = new ArrayDeque();
    public boolean c;
    private final boolean d;
    private final ExecutorService e;
    private final Future f;
    private final mdr g;

    public mdt(ExecutorService executorService, boolean z, mdr mdrVar) {
        this.e = executorService;
        this.f = executorService.submit(new Callable() { // from class: mdp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Thread.currentThread();
            }
        });
        this.d = z;
        this.g = mdrVar;
    }

    private final boolean i() {
        try {
            return Thread.currentThread() == ((Thread) this.f.get(500L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            throw e;
        } catch (Exception e2) {
            a(e2);
            return false;
        }
    }

    public final void a(Exception exc) {
        synchronized (this.a) {
            if (this.c) {
                return;
            }
            this.c = true;
            this.g.a(lsf.a(exc));
        }
    }

    public final void b(final mds mdsVar) {
        if (i()) {
            try {
                mdsVar.a();
                return;
            } catch (Exception e) {
                a(e);
                return;
            }
        }
        try {
            this.e.submit(new Runnable() { // from class: mdo
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        mdsVar.a();
                    } catch (Exception e2) {
                        mdt.this.a(e2);
                    }
                }
            }).get(500L, TimeUnit.MILLISECONDS);
        } catch (RuntimeException | ExecutionException | TimeoutException e2) {
            a(e2);
        }
    }

    public final void c(mds mdsVar) {
        lti.c(!i());
        synchronized (this.a) {
            this.c = true;
            this.b.clear();
        }
        h(mdsVar, false);
        if (this.d) {
            this.e.shutdown();
            if (this.e.awaitTermination(500L, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.g.a(new lsf("Release timed out. OpenGL resources may not be cleaned up properly."));
        }
    }

    public final void d(mds mdsVar) {
        e(mdsVar, true);
    }

    public final void e(mds mdsVar, boolean z) {
        synchronized (this.a) {
            if (this.c && z) {
                return;
            }
            try {
                h(mdsVar, z);
                e = null;
            } catch (RejectedExecutionException e) {
                e = e;
            }
            if (e != null) {
                a(e);
            }
        }
    }

    public final void f(mds mdsVar) {
        synchronized (this.a) {
            if (this.c) {
                return;
            }
            this.b.add(mdsVar);
            d(new mds() { // from class: mdn
                @Override // defpackage.mds
                public final void a() {
                }
            });
        }
    }

    public final void g() {
        try {
            lti.c(i());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            a(e);
        }
    }

    public final void h(final mds mdsVar, final boolean z) {
        this.e.submit(new Runnable() { // from class: mdm
            @Override // java.lang.Runnable
            public final void run() {
                mds mdsVar2;
                mdt mdtVar = mdt.this;
                mds mdsVar3 = mdsVar;
                try {
                    synchronized (mdtVar.a) {
                        if (mdtVar.c && z) {
                            return;
                        }
                        while (true) {
                            synchronized (mdtVar.a) {
                                mdsVar2 = (mds) mdtVar.b.poll();
                            }
                            if (mdsVar2 == null) {
                                mdsVar3.a();
                                return;
                            }
                            mdsVar2.a();
                        }
                    }
                } catch (Exception e) {
                    mdtVar.a(e);
                }
            }
        });
    }
}
