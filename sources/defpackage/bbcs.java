package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbcs {
    private static final cskc d = cskc.g("BugleThrottledAction", "ThrottledActionScheduler");
    protected final bbcf a;
    protected final cqoh b;
    private ThrottledAction e;
    private Class f;
    private long g = -1;
    private int h = 0;
    public bbdf c = null;

    public bbcs(cqoh cqohVar, bbcf bbcfVar) {
        this.b = cqohVar;
        this.a = bbcfVar;
    }

    private final synchronized ThrottledAction e(ThrottledAction throttledAction) {
        ThrottledAction throttledAction2 = this.e;
        if (throttledAction2 != null || this.g != -1) {
            throttledAction = throttledAction2;
        }
        if (throttledAction != null) {
            cskc cskcVar = d;
            if (cskcVar.t(3)) {
                csjb d2 = cskcVar.d();
                d2.I(throttledAction.h());
                d2.I("is starting.");
                d2.r();
            }
        }
        c(this.b.a());
        this.e = null;
        this.c = null;
        return throttledAction;
    }

    private final void f(ThrottledAction throttledAction) {
        Class<?> cls = this.f;
        Class<?> cls2 = throttledAction.getClass();
        if (cls == null) {
            this.f = cls2;
            return;
        }
        if (cls != cls2) {
            csix.o("Expected instance '" + String.valueOf(cls) + "' but got instance '" + String.valueOf(cls2) + "'");
        }
    }

    private final synchronized void g(Action action, int i, long j, boolean z) {
        try {
            try {
                bbdf bbdfVar = this.c;
                if (bbdfVar == null) {
                    this.a.f(this.e, this.h);
                    j(action, i, j, false);
                    return;
                }
                cfup cfupVar = bbdj.b;
                bbdfVar.a.removeCallbacks(bbdfVar.b);
                this.c = null;
                this.e.getClass();
                j(action, i, j, z);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private static void h(ThrottledAction throttledAction) {
        if (throttledAction != null) {
            cskc cskcVar = d;
            if (cskcVar.t(3)) {
                csjb d2 = cskcVar.d();
                d2.I(throttledAction.h());
                d2.I("is done.");
                d2.r();
            }
        }
    }

    private static void i(ThrottledAction throttledAction, int i, long j) {
        String h = throttledAction != null ? throttledAction.h() : "????";
        if (i == 0) {
            csjb d2 = d.d();
            d2.I(h);
            d2.I("already scheduled in");
            d2.H(j);
            d2.I("ms, not scheduling it again.");
            d2.r();
            return;
        }
        if (i == 1) {
            csjb d3 = d.d();
            d3.I(h);
            d3.I("scheduled in");
            d3.H(j);
            d3.I("ms, so not scheduled again.");
            d3.r();
            return;
        }
        if (i == 2) {
            csjb d4 = d.d();
            d4.I(h);
            d4.I("scheduled to run now.");
            d4.r();
            return;
        }
        csjb d5 = d.d();
        d5.I("Reduced delay of");
        d5.I(h);
        d5.I("to");
        d5.H(j);
        d5.I("ms.");
        d5.r();
    }

    private final synchronized void j(Action action, int i, long j, boolean z) {
        if (z) {
            this.c = this.a.i(action, j);
        } else {
            this.a.g(this.e, i, j);
        }
        this.h = i;
    }

    public final elfl a(ThrottledAction throttledAction) {
        f(throttledAction);
        ThrottledAction e = e(throttledAction);
        if (e == null) {
            h(null);
            return elfo.e(null);
        }
        try {
            return e.k();
        } finally {
            h(e);
        }
    }

    public final ListenableFuture b(ThrottledAction throttledAction, int i, cniz cnizVar) {
        int i2;
        ListenableFuture c;
        f(throttledAction);
        synchronized (this) {
            ThrottledAction throttledAction2 = this.e;
            if (throttledAction2 != null) {
                throttledAction2.j(throttledAction);
                this.a.f(this.e, this.h);
                i2 = 3;
            } else {
                this.e = throttledAction;
                i2 = 2;
            }
            c = this.a.c(this.e, cnizVar, i);
            this.h = i;
        }
        i(this.e, i2, 0L);
        return c;
    }

    final synchronized void c(long j) {
        this.g = j;
    }

    public final void d(ThrottledAction throttledAction, int i, long j, long j2, boolean z) {
        long j3;
        int i2;
        f(throttledAction);
        double d2 = j;
        double d3 = j2;
        if (d2 > d3) {
            csix.o("Expected at most " + d3 + " but got " + d2);
        }
        long a = this.b.a();
        long j4 = j + a;
        long j5 = a + j2;
        synchronized (this) {
            long a2 = this.b.a();
            long g = this.g + throttledAction.g();
            ThrottledAction throttledAction2 = this.e;
            if (throttledAction2 != null) {
                throttledAction2.j(throttledAction);
                if (j5 < g) {
                    long j6 = j5 - a2;
                    g(throttledAction, i, j6, z);
                    i2 = 3;
                    j3 = j6;
                } else {
                    j3 = g - a2;
                    i2 = 0;
                }
            } else {
                this.e = throttledAction;
                long j7 = g <= j4 ? j4 - a2 : j5 <= g ? j5 - a2 : g - a2;
                j(throttledAction, i, j7, z);
                j3 = j7;
                this.h = i;
                i2 = j3 <= 0 ? 2 : 1;
            }
        }
        i(this.e, i2, j3);
    }
}
