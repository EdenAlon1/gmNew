package defpackage;

import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ane extends anb {
    public final Object m;
    public List n;
    ListenableFuture o;
    public final ars p;
    public final aru q;
    private final ScheduledExecutorService r;
    private final ari s;
    private final arh t;
    private final AtomicBoolean u;

    public ane(bfx bfxVar, bfx bfxVar2, aky akyVar, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(akyVar, executor, scheduledExecutorService, handler);
        this.m = new Object();
        this.u = new AtomicBoolean(false);
        this.s = new ari(bfxVar, bfxVar2);
        this.p = new ars(bfxVar.d(CaptureSessionStuckQuirk.class) || bfxVar.d(IncorrectCaptureStateQuirk.class));
        this.t = new arh(bfxVar2);
        this.q = new aru(bfxVar2);
        this.r = scheduledExecutorService;
    }

    @Override // defpackage.anb, defpackage.ams
    public final void b(amt amtVar) {
        amt amtVar2;
        amt amtVar3;
        u("Session onConfigured()");
        arh arhVar = this.t;
        aky akyVar = this.b;
        List b = akyVar.b();
        List a = akyVar.a();
        if (arhVar.a()) {
            LinkedHashSet<amt> linkedHashSet = new LinkedHashSet();
            Iterator it = b.iterator();
            while (it.hasNext() && (amtVar3 = (amt) it.next()) != amtVar) {
                linkedHashSet.add(amtVar3);
            }
            for (amt amtVar4 : linkedHashSet) {
                amtVar4.k().a(amtVar4);
            }
        }
        super.b(amtVar);
        if (arhVar.a()) {
            LinkedHashSet<amt> linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = a.iterator();
            while (it2.hasNext() && (amtVar2 = (amt) it2.next()) != amtVar) {
                linkedHashSet2.add(amtVar2);
            }
            for (amt amtVar5 : linkedHashSet2) {
                amtVar5.k().h(amtVar5);
            }
        }
    }

    @Override // defpackage.anb, defpackage.amq
    public final boolean e() {
        boolean z;
        synchronized (this.m) {
            if (t()) {
                this.s.a(this.n);
            } else {
                ListenableFuture listenableFuture = this.o;
                if (listenableFuture != null) {
                    listenableFuture.cancel(true);
                }
            }
            ListenableFuture listenableFuture2 = null;
            try {
                synchronized (this.a) {
                    try {
                        if (!this.l) {
                            ListenableFuture listenableFuture3 = this.j;
                            if (listenableFuture3 != null) {
                                listenableFuture2 = listenableFuture3;
                            }
                            this.l = true;
                        }
                        z = !t();
                    } finally {
                    }
                }
            } finally {
                if (listenableFuture2 != null) {
                    listenableFuture2.cancel(true);
                }
            }
        }
        return z;
    }

    @Override // defpackage.anb, defpackage.ams
    public final void h(amt amtVar) {
        synchronized (this.m) {
            this.s.a(this.n);
        }
        u("onClosed()");
        super.h(amtVar);
    }

    @Override // defpackage.anb, defpackage.amt
    public final ListenableFuture m() {
        return bkj.c(1500L, this.r, this.p.b());
    }

    @Override // defpackage.anb, defpackage.amt
    public final void n() {
        if (!this.u.compareAndSet(false, true)) {
            u("close() has been called. Skip this invocation.");
            return;
        }
        if (this.q.a) {
            try {
                u("Call abortCaptures() before closing session.");
                ksw.i(this.g, "Need to call openCaptureSession before using this API.");
                this.g.a().abortCaptures();
            } catch (Exception e) {
                e.toString();
                u("Exception when calling abortCaptures()".concat(e.toString()));
            }
        }
        u("Session call close()");
        this.p.b().b(new Runnable() { // from class: anc
            @Override // java.lang.Runnable
            public final void run() {
                ane.this.v();
            }
        }, this.d);
    }

    @Override // defpackage.anb, defpackage.amt
    public final void o() {
        s();
        this.p.c();
    }

    @Override // defpackage.anb, defpackage.amt
    public final void p(int i) {
        if (i == 5) {
            synchronized (this.m) {
                if (t() && this.n != null) {
                    u("Close DeferrableSurfaces for CameraDevice error.");
                    Iterator it = this.n.iterator();
                    while (it.hasNext()) {
                        ((bdy) it.next()).d();
                    }
                }
            }
        }
    }

    final void u(String str) {
        avw.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    final /* synthetic */ void v() {
        u("Session call super.close()");
        super.n();
    }
}
