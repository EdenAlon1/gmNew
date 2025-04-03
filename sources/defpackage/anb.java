package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
class anb extends ams implements amt, amq {
    final aky b;
    final Handler c;
    final Executor d;
    public final ScheduledExecutorService e;
    ams f;
    aox g;
    ListenableFuture h;
    kfb i;
    public ListenableFuture j;
    final Object a = new Object();
    public List k = null;
    private boolean m = false;
    public boolean l = false;
    private boolean n = false;

    public anb(aky akyVar, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.b = akyVar;
        this.c = handler;
        this.d = executor;
        this.e = scheduledExecutorService;
    }

    @Override // defpackage.ams
    public final void a(amt amtVar) {
        this.f.getClass();
        o();
        this.b.e(this);
        this.f.a(amtVar);
    }

    @Override // defpackage.ams
    public void b(amt amtVar) {
        this.f.getClass();
        aky akyVar = this.b;
        synchronized (akyVar.b) {
            akyVar.c.add(this);
            akyVar.e.remove(this);
        }
        akyVar.d(this);
        this.f.b(amtVar);
    }

    @Override // defpackage.ams
    public final void c(amt amtVar) {
        ams amsVar = this.f;
        amsVar.getClass();
        amsVar.c(amtVar);
    }

    @Override // defpackage.ams
    public final void d(final amt amtVar) {
        ListenableFuture listenableFuture;
        synchronized (this.a) {
            if (this.n) {
                listenableFuture = null;
            } else {
                this.n = true;
                ksw.i(this.h, "Need to call openCaptureSession before using this API.");
                listenableFuture = this.h;
            }
        }
        if (listenableFuture != null) {
            listenableFuture.b(new Runnable() { // from class: amu
                @Override // java.lang.Runnable
                public final void run() {
                    ams amsVar = anb.this.f;
                    amsVar.getClass();
                    amsVar.d(amtVar);
                }
            }, bjb.a());
        }
    }

    @Override // defpackage.amq
    public boolean e() {
        throw null;
    }

    @Override // defpackage.ams
    public final void f(amt amtVar) {
        ams amsVar = this.f;
        amsVar.getClass();
        amsVar.f(amtVar);
    }

    @Override // defpackage.ams
    public final void g(amt amtVar) {
        ams amsVar = this.f;
        amsVar.getClass();
        amsVar.g(amtVar);
    }

    @Override // defpackage.ams
    public void h(final amt amtVar) {
        ListenableFuture listenableFuture;
        synchronized (this.a) {
            if (this.m) {
                listenableFuture = null;
            } else {
                this.m = true;
                ksw.i(this.h, "Need to call openCaptureSession before using this API.");
                listenableFuture = this.h;
            }
        }
        o();
        if (listenableFuture != null) {
            listenableFuture.b(new Runnable() { // from class: amw
                @Override // java.lang.Runnable
                public final void run() {
                    anb anbVar = anb.this;
                    aky akyVar = anbVar.b;
                    synchronized (akyVar.b) {
                        akyVar.c.remove(anbVar);
                        akyVar.d.remove(anbVar);
                    }
                    amt amtVar2 = amtVar;
                    anbVar.d(amtVar2);
                    if (anbVar.g == null) {
                        avw.f("SyncCaptureSessionBase", a.i(anbVar, "[", "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured."));
                        return;
                    }
                    ams amsVar = anbVar.f;
                    amsVar.getClass();
                    amsVar.h(amtVar2);
                }
            }, bjb.a());
        }
    }

    @Override // defpackage.ams
    public final void i(amt amtVar, Surface surface) {
        ams amsVar = this.f;
        amsVar.getClass();
        amsVar.i(amtVar, surface);
    }

    @Override // defpackage.amt
    public final CameraDevice j() {
        ksw.h(this.g);
        return this.g.a().getDevice();
    }

    @Override // defpackage.amt
    public final aox l() {
        ksw.h(this.g);
        return this.g;
    }

    @Override // defpackage.amt
    public ListenableFuture m() {
        return bkj.b(null);
    }

    @Override // defpackage.amt
    public void n() {
        ksw.i(this.g, "Need to call openCaptureSession before using this API.");
        aky akyVar = this.b;
        synchronized (akyVar.b) {
            akyVar.d.add(this);
        }
        this.g.a().close();
        this.d.execute(new Runnable() { // from class: amv
            @Override // java.lang.Runnable
            public final void run() {
                anb anbVar = anb.this;
                anbVar.d(anbVar);
            }
        });
    }

    @Override // defpackage.amt
    public void o() {
        s();
    }

    @Override // defpackage.amt
    public final void q() {
        ksw.i(this.g, "Need to call openCaptureSession before using this API.");
        this.g.a().stopRepeating();
    }

    final void r(CameraCaptureSession cameraCaptureSession) {
        if (this.g == null) {
            this.g = new aox(cameraCaptureSession, this.c);
        }
    }

    final void s() {
        synchronized (this.a) {
            List list = this.k;
            if (list != null) {
                bec.a(list);
                this.k = null;
            }
        }
    }

    final boolean t() {
        boolean z;
        synchronized (this.a) {
            z = this.h != null;
        }
        return z;
    }

    @Override // defpackage.amt
    public final ams k() {
        return this;
    }

    @Override // defpackage.amt
    public void p(int i) {
    }
}
