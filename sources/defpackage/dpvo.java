package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Size;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import j$.util.Objects;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpvo implements dpvm {
    private final cbo a;
    private ixm b;
    private btd c;

    public dpvo(cbo cboVar) {
        cboVar.getClass();
        this.a = cboVar;
    }

    @Override // defpackage.dpvm
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.dpvm
    public final Bitmap b() {
        PreviewView previewView;
        Bitmap a;
        ixm ixmVar = this.b;
        if (ixmVar == null || (previewView = (PreviewView) ixmVar.a) == null) {
            return null;
        }
        biw.b();
        cci cciVar = previewView.a;
        if (cciVar == null || (a = cciVar.a()) == null) {
            return null;
        }
        cbx cbxVar = cciVar.c;
        FrameLayout frameLayout = cciVar.b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = cciVar.b.getLayoutDirection();
        if (!cbxVar.f()) {
            return a;
        }
        Matrix d = cbxVar.d();
        RectF e = cbxVar.e(size, layoutDirection);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), a.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(d);
        matrix.postScale(e.width() / cbxVar.a.getWidth(), e.height() / cbxVar.a.getHeight());
        matrix.postTranslate(e.left, e.top);
        canvas.drawBitmap(a, matrix, new Paint(7));
        return createBitmap;
    }

    @Override // defpackage.dpvm
    public final atl c() {
        biw.b();
        return this.a.a;
    }

    @Override // defpackage.dpvm
    public final lld d() {
        return this.a.f();
    }

    @Override // defpackage.dpvm
    public final void e(lkr lkrVar) {
        lkrVar.getClass();
        biw.b();
        cbo cboVar = this.a;
        cboVar.C = lkrVar;
        cboVar.l();
    }

    @Override // defpackage.dpvm
    public final void f() {
        biw.b();
        cbo cboVar = this.a;
        cck cckVar = cboVar.n;
        if (cckVar != null) {
            cckVar.d();
        }
        cboVar.x.clear();
        cboVar.l();
    }

    @Override // defpackage.dpvm
    public final void g(atl atlVar) {
        biw.b();
        final cbo cboVar = this.a;
        if (cboVar.a == atlVar) {
            return;
        }
        Integer b = atlVar.b();
        if (cboVar.d.b() == 3 && b != null && b.intValue() != 0) {
            throw new IllegalStateException("Not a front camera despite setting FLASH_MODE_SCREEN");
        }
        final atl atlVar2 = cboVar.a;
        cboVar.a = atlVar;
        cck cckVar = cboVar.n;
        if (cckVar == null) {
            return;
        }
        cckVar.c(cboVar.c, cboVar.d, cboVar.g, cboVar.h);
        cboVar.m(new Runnable() { // from class: cbg
            @Override // java.lang.Runnable
            public final void run() {
                cbl.this.a = atlVar2;
            }
        });
    }

    @Override // defpackage.dpvm
    public final void h(Set set) {
        biw.b();
        cbo cboVar = this.a;
        if (Objects.equals(cboVar.x, set)) {
            return;
        }
        cck cckVar = cboVar.n;
        if (cckVar != null) {
            cckVar.d();
        }
        cboVar.x.clear();
        cboVar.x.addAll(set);
        cboVar.l();
    }

    @Override // defpackage.dpvm
    public final void i(final int i) {
        biw.b();
        final cbo cboVar = this.a;
        final int i2 = cboVar.b;
        if (i == i2) {
            return;
        }
        cboVar.b = i;
        if (!cboVar.w() && cboVar.u()) {
            biw.b();
            btd btdVar = cboVar.i;
            if (btdVar != null) {
                btdVar.close();
                cboVar.i(cboVar.i);
            }
        }
        cboVar.m(new Runnable() { // from class: cbf
            @Override // java.lang.Runnable
            public final void run() {
                cbl cblVar = cbl.this;
                int i3 = i2;
                cblVar.b = i3;
                avw.f("CameraController", "setEnabledUseCases: failed to enable use cases properly for enabledUseCases = " + Integer.toBinaryString(i) + ", restoring back previous values " + Integer.toBinaryString(i3));
            }
        });
    }

    @Override // defpackage.dpvm
    public final void j(int i) {
        this.a.k(i);
    }

    @Override // defpackage.dpvm
    public final void k(Executor executor) {
        biw.b();
        cbo cboVar = this.a;
        if (cboVar.f == executor) {
            return;
        }
        cboVar.f = executor;
        cboVar.o(Integer.valueOf(cboVar.b()));
        cboVar.l();
    }

    @Override // defpackage.dpvm
    public final void l(boy boyVar) {
        biw.b();
        cbo cboVar = this.a;
        if (cboVar.e == boyVar) {
            return;
        }
        cboVar.e = boyVar;
        cboVar.o(Integer.valueOf(cboVar.b()));
        cboVar.l();
    }

    @Override // defpackage.dpvm
    public final void m(ixm ixmVar) {
        ixmVar.getClass();
        Object obj = ixmVar.a;
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        cbo cboVar = this.a;
        PreviewView previewView = (PreviewView) obj;
        biw.b();
        cbl cblVar = previewView.g;
        if (cblVar != null && cblVar != cboVar) {
            cblVar.h();
            previewView.g();
        }
        previewView.g = cboVar;
        previewView.b(false);
        avi aviVar = previewView.b.a;
        previewView.g();
        this.b = ixmVar;
    }

    @Override // defpackage.dpvm
    public final void n(bro broVar) {
        broVar.getClass();
        biw.b();
        cbo cboVar = this.a;
        cboVar.k = broVar;
        cboVar.p();
        cboVar.l();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dpvm
    public final void o(brb brbVar, cdr cdrVar, Executor executor, final ffji ffjiVar) {
        long j;
        boolean z;
        bsv g;
        Context context;
        bsv bsvVar;
        bsv bsvVar2;
        btd btdVar;
        cdrVar.getClass();
        ksp kspVar = new ksp() { // from class: dpvn
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                dpvu dpvuVar;
                bur burVar = (bur) obj;
                burVar.getClass();
                if (burVar instanceof bup) {
                    dpvuVar = dpvs.a;
                } else if (burVar instanceof bun) {
                    dpvuVar = dpvq.a;
                } else if (burVar instanceof buo) {
                    dpvuVar = dpvr.a;
                } else if (burVar instanceof buq) {
                    dpvuVar = dpvt.a;
                } else {
                    if (burVar instanceof bum) {
                        bum bumVar = (bum) burVar;
                        Integer valueOf = Integer.valueOf(bumVar.a);
                        valueOf.intValue();
                        dpvuVar = new dpvp(true == bumVar.a() ? valueOf : null, bumVar.b);
                    } else {
                        dpvuVar = null;
                    }
                }
                if (dpvuVar != null) {
                    ffji.this.invoke(dpvuVar);
                }
            }
        };
        biw.b();
        cbo cboVar = this.a;
        ksw.d(cboVar.s(), "Camera not initialized.");
        ksw.d(cboVar.w(), "VideoCapture disabled.");
        ksw.d(!cboVar.u(), "Recording video. Only one recording can be active at a time.");
        cbj cbjVar = new cbj(cboVar, koa.e(cboVar.y), kspVar);
        bri briVar = new bri(cboVar.y, (btb) cboVar.h.a(), brbVar);
        if (kor.b(cboVar.y, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to start recording with audio, but application does not have RECORD_AUDIO permission granted.");
        }
        if (kor.b(briVar.c, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
        }
        ksw.d(briVar.a.z(), "The Recorder this recording is associated to doesn't support audio.");
        briVar.f = true;
        briVar.e = executor;
        briVar.d = cbjVar;
        final btb btbVar = briVar.a;
        synchronized (btbVar.i) {
            j = btbVar.p + 1;
            btbVar.p = j;
            switch (btbVar.l) {
                case CONFIGURING:
                case IDLING:
                case STOPPING:
                case RESETTING:
                case ERROR:
                    if (btbVar.l == bta.IDLING) {
                        ksw.d(btbVar.n == null && btbVar.o == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                    }
                    try {
                        g = bsv.g(briVar, j);
                        context = briVar.c;
                    } catch (IOException e) {
                        e = e;
                        z = 5;
                    }
                    if (!g.e.getAndSet(true)) {
                        brg brgVar = ((bqr) g).a;
                        boolean z2 = brgVar instanceof brb;
                        final ParcelFileDescriptor dup = z2 ? ((bql) ((brb) brgVar).a).b.dup() : null;
                        g.d.c("finalizeRecording");
                        g.f.set(new bso(brgVar, dup));
                        if (((bqr) g).b) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                g.g.set(new bss(g, context));
                            } else {
                                g.g.set(new bst(g));
                            }
                        }
                        ksp kspVar2 = z2 ? new ksp() { // from class: bsp
                            @Override // defpackage.ksp
                            public final void accept(Object obj) {
                                try {
                                    dup.close();
                                } catch (IOException e2) {
                                    avw.d("Recorder", "Failed to close dup'd ParcelFileDescriptor", e2);
                                }
                            }
                        } : null;
                        if (kspVar2 != null) {
                            g.h.set(kspVar2);
                        }
                        btbVar.o = g;
                        bta btaVar = btbVar.l;
                        if (btaVar == bta.IDLING) {
                            btbVar.p(bta.PENDING_RECORDING);
                            btbVar.h.execute(new Runnable() { // from class: brx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z3;
                                    bsv bsvVar3;
                                    int i;
                                    bsv bsvVar4;
                                    Throwable th;
                                    btb btbVar2 = btb.this;
                                    synchronized (btbVar2.i) {
                                        avw.a("Recorder", "tryServicePendingRecording on state: " + btbVar2.l);
                                        int ordinal = btbVar2.l.ordinal();
                                        boolean z4 = true;
                                        z3 = false;
                                        bsvVar3 = null;
                                        if (ordinal == 1) {
                                            z4 = false;
                                        } else if (ordinal != 2) {
                                            i = 0;
                                            bsvVar4 = null;
                                            th = bsvVar4;
                                        }
                                        if (btbVar2.ac == 3) {
                                            bsv bsvVar5 = btbVar2.o;
                                            btbVar2.o = null;
                                            btbVar2.m();
                                            bsvVar4 = bsvVar5;
                                            i = 4;
                                            z3 = z4;
                                            th = btb.c;
                                        } else {
                                            if (btbVar2.n == null && !btbVar2.U) {
                                                if (btbVar2.D != null) {
                                                    bsvVar4 = null;
                                                    bsvVar3 = btbVar2.d(btbVar2.l);
                                                    i = 0;
                                                    z3 = z4;
                                                    th = bsvVar4;
                                                }
                                                i = 0;
                                                bsvVar4 = null;
                                                z3 = z4;
                                                th = bsvVar4;
                                            }
                                            avw.f("Recorder", "PendingRecording is not handled, active recording = " + btbVar2.n + ", need reset flag = " + btbVar2.U);
                                            i = 0;
                                            bsvVar4 = null;
                                            z3 = z4;
                                            th = bsvVar4;
                                        }
                                    }
                                    if (bsvVar3 != null) {
                                        btbVar2.s(bsvVar3, z3);
                                    } else if (bsvVar4 != null) {
                                        btbVar2.j(bsvVar4, i, th);
                                    }
                                }
                            });
                        } else if (btaVar == bta.ERROR) {
                            btbVar.p(bta.PENDING_RECORDING);
                            btbVar.h.execute(new Runnable() { // from class: bry
                                @Override // java.lang.Runnable
                                public final void run() {
                                    btb btbVar2 = btb.this;
                                    axt axtVar = btbVar2.x;
                                    if (axtVar == null) {
                                        throw new AssertionError("surface request is required to retry initialization.");
                                    }
                                    btbVar2.B(axtVar, btbVar2.aa, false);
                                }
                            });
                        } else {
                            btbVar.p(bta.PENDING_RECORDING);
                        }
                        e = null;
                        z = false;
                        bsvVar2 = null;
                        break;
                    } else {
                        throw new AssertionError(a.i(g, "Recording ", " has already been initialized"));
                    }
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                    bsvVar = btbVar.o;
                    ksw.h(bsvVar);
                    bsvVar2 = bsvVar;
                    e = null;
                    z = false;
                    break;
                case RECORDING:
                case PAUSED:
                    bsvVar = btbVar.n;
                    bsvVar2 = bsvVar;
                    e = null;
                    z = false;
                    break;
                default:
                    e = null;
                    z = false;
                    bsvVar2 = null;
                    break;
            }
        }
        if (bsvVar2 != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (z) {
            java.util.Objects.toString(e);
            avw.c("Recorder", "Recording was started when the Recorder had encountered error ".concat(String.valueOf(e)));
            btbVar.j(bsv.g(briVar, j), 5, e);
            btdVar = new btd(briVar.a, j, briVar.b, true);
        } else {
            btdVar = new btd(briVar.a, j, briVar.b, false);
        }
        cboVar.j.put(cbjVar, btdVar);
        cboVar.i = btdVar;
        this.c = btdVar;
    }

    @Override // defpackage.dpvm
    public final void p() {
        btd btdVar = this.c;
        if (btdVar != null) {
            btdVar.close();
        }
        this.c = null;
    }

    @Override // defpackage.dpvm
    public final void q(avg avgVar, Executor executor, avf avfVar) {
        biw.b();
        cbo cboVar = this.a;
        ksw.d(cboVar.s(), "Camera not initialized.");
        ksw.d(cboVar.t(), "ImageCapture disabled.");
        if (cboVar.a() == 3) {
            if (cboVar.e() != null) {
                avi aviVar = cboVar.e().b;
            }
            throw new IllegalStateException("No window set in PreviewView despite setting FLASH_MODE_SCREEN");
        }
        if (cboVar.a.b() != null) {
            ave aveVar = avgVar.b;
            if (!aveVar.b) {
                aveVar.a(cboVar.a.b().intValue() == 0);
            }
        }
        cboVar.d.s(avgVar, executor, avfVar);
    }

    @Override // defpackage.dpvm
    public final void r() {
        biw.b();
        cbo cboVar = this.a;
        cboVar.C = null;
        cboVar.m = null;
        cck cckVar = cboVar.n;
        if (cckVar != null) {
            cckVar.d();
        }
    }

    @Override // defpackage.dpvm
    public final boolean s(atl atlVar) {
        biw.b();
        cck cckVar = this.a.n;
        if (cckVar == null) {
            throw new IllegalStateException("Camera not initialized. Please wait for the initialization future to finish. See #getInitializationFuture().");
        }
        try {
            return cckVar.e(atlVar);
        } catch (atj e) {
            avw.g("CameraController", "Failed to check camera availability", e);
            return false;
        }
    }

    @Override // defpackage.dpvm
    public final boolean t() {
        return this.a.u();
    }

    @Override // defpackage.dpvm
    public final void u() {
        biw.b();
        cbo cboVar = this.a;
        if (cboVar.d.a == 1) {
            return;
        }
        cboVar.o(1);
        cboVar.l();
    }

    @Override // defpackage.dpvm
    public final void v() {
        biw.b();
        this.a.r = true;
    }

    @Override // defpackage.dpvm
    public final void w() {
        biw.b();
        cbo cboVar = this.a;
        cboVar.l = 2;
        cboVar.p();
        cboVar.l();
    }

    @Override // defpackage.dpvm
    public final void x(float f) {
        this.a.g(f).getClass();
    }
}
