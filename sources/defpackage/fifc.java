package defpackage;

import android.util.Pair;
import internal.J.N;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fifc implements fiez {
    public static final ReferenceQueue a = new ReferenceQueue();
    private static final Set g = new HashSet();
    public final String b;
    public volatile long c;
    protected final Runnable d;
    public final Object e;
    public Queue f;
    private final int h;
    private final int i;
    private boolean j;
    private List k;

    protected fifc(int i, String str, int i2) {
        this.d = new Runnable() { // from class: fifa
            @Override // java.lang.Runnable
            public final void run() {
                fifc fifcVar = fifc.this;
                TraceEvent a2 = TraceEvent.a(fifcVar.b);
                try {
                    synchronized (fifcVar.e) {
                        Queue queue = fifcVar.f;
                        if (queue != null) {
                            ((Runnable) queue.poll()).run();
                        }
                    }
                    if (a2 != null) {
                        a2.close();
                    }
                } catch (Throwable th) {
                    if (a2 != null) {
                        try {
                            a2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        };
        this.e = new Object();
        this.h = i;
        this.b = str.concat(".PreNativeTask.run");
        this.i = i2;
    }

    private static void d() {
        while (true) {
            fifb fifbVar = (fifb) a.poll();
            if (fifbVar == null) {
                return;
            }
            N.MERCiIV8(fifbVar.a);
            Set set = g;
            synchronized (set) {
                set.remove(fifbVar);
            }
        }
    }

    @Override // defpackage.fiez
    public final void a(Runnable runnable) {
        Object obj = PostTask.a;
        if (this.c != 0) {
            N.MGnQU$47(this.c, runnable, 0L, runnable.getClass().getName());
            return;
        }
        synchronized (this.e) {
            if (!this.j) {
                this.j = true;
                synchronized (PostTask.a) {
                    List list = PostTask.b;
                    if (list == null) {
                        b();
                    } else {
                        list.add(this);
                        this.f = new ArrayDeque();
                        this.k = new ArrayList();
                    }
                }
            }
            if (this.c != 0) {
                N.MGnQU$47(this.c, runnable, 0L, runnable.getClass().getName());
            } else {
                this.f.add(runnable);
                c();
            }
        }
    }

    public final void b() {
        long M5_IQXaH = N.M5_IQXaH(this.i, this.h);
        synchronized (this.e) {
            Queue<Runnable> queue = this.f;
            if (queue != null) {
                for (Runnable runnable : queue) {
                    N.MGnQU$47(M5_IQXaH, runnable, 0L, runnable.getClass().getName());
                }
                this.f = null;
            }
            List<Pair> list = this.k;
            if (list != null) {
                for (Pair pair : list) {
                    N.MGnQU$47(M5_IQXaH, (Runnable) pair.first, ((Long) pair.second).longValue(), pair.getClass().getName());
                }
                this.k = null;
            }
            this.c = M5_IQXaH;
        }
        Set set = g;
        synchronized (set) {
            set.add(new fifb(this));
        }
        d();
    }

    protected void c() {
        Executor executor = PostTask.d;
        PostTask.c.execute(this.d);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(runnable);
    }

    public fifc(int i) {
        this(i, "TaskRunnerImpl", 0);
        d();
    }
}
