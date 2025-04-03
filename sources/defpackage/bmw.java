package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmw implements SurfaceTexture.OnFrameAvailableListener, bnv {
    public static final /* synthetic */ int i = 0;
    public final bnc a;
    final HandlerThread b;
    public final Executor c;
    final Handler d;
    final Map e;
    public int f;
    public boolean g;
    public final List h;
    private final AtomicBoolean j;
    private final float[] k;
    private final float[] l;

    public bmw(final aua auaVar) {
        final Map map = Collections.EMPTY_MAP;
        this.j = new AtomicBoolean(false);
        this.k = new float[16];
        this.l = new float[16];
        this.e = new LinkedHashMap();
        this.f = 0;
        this.g = false;
        this.h = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new bjh(handler);
        this.a = new bnc();
        try {
            try {
                kfg.a(new kfd() { // from class: bmo
                    @Override // defpackage.kfd
                    public final Object a(final kfb kfbVar) {
                        final bmw bmwVar = bmw.this;
                        final aua auaVar2 = auaVar;
                        final Map map2 = map;
                        bmwVar.e(new Runnable() { // from class: bmp
                            @Override // java.lang.Runnable
                            public final void run() {
                                aua auaVar3 = auaVar2;
                                bmw bmwVar2 = bmw.this;
                                Map map3 = map2;
                                kfb kfbVar2 = kfbVar;
                                try {
                                    bmwVar2.a.j(auaVar3, map3);
                                    kfbVar2.b(null);
                                } catch (RuntimeException e) {
                                    kfbVar2.c(e);
                                }
                            }
                        });
                        return "Init GlRenderer";
                    }
                }).get();
            } catch (InterruptedException | ExecutionException e) {
                Throwable cause = e instanceof ExecutionException ? e.getCause() : e;
                if (!(cause instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", cause);
                }
                throw ((RuntimeException) cause);
            }
        } catch (RuntimeException e2) {
            g();
            throw e2;
        }
    }

    private final void h(Throwable th) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((bmv) it.next()).c().c(th);
        }
        this.h.clear();
    }

    @Override // defpackage.awz
    public final void a(final axt axtVar) {
        if (this.j.get()) {
            axtVar.f();
        } else {
            f(new Runnable() { // from class: bmf
                @Override // java.lang.Runnable
                public final void run() {
                    final bmw bmwVar = bmw.this;
                    bmwVar.f++;
                    bnc bncVar = bmwVar.a;
                    bos.h(bncVar.a, true);
                    bos.g(bncVar.c);
                    final SurfaceTexture surfaceTexture = new SurfaceTexture(bncVar.m);
                    final axt axtVar2 = axtVar;
                    Size size = axtVar2.c;
                    surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                    final Surface surface = new Surface(surfaceTexture);
                    axtVar2.c(bmwVar.c, new axs() { // from class: bmm
                        @Override // defpackage.axs
                        public final void a(axr axrVar) {
                            aua auaVar = axtVar2.d;
                            bop bopVar = bop.DEFAULT;
                            if (auaVar.a() && ((asz) axrVar).d) {
                                bopVar = bop.YUV;
                            }
                            bnc bncVar2 = bmw.this.a;
                            bos.h(bncVar2.a, true);
                            bos.g(bncVar2.c);
                            if (bncVar2.l != bopVar) {
                                bncVar2.l = bopVar;
                                bncVar2.h(bncVar2.m);
                            }
                        }
                    });
                    axtVar2.b(surface, bmwVar.c, new ksp() { // from class: bmn
                        @Override // defpackage.ksp
                        public final void accept(Object obj) {
                            axt axtVar3 = axtVar2;
                            synchronized (axtVar3.b) {
                                axtVar3.k = null;
                                axtVar3.l = null;
                            }
                            Surface surface2 = surface;
                            SurfaceTexture surfaceTexture2 = surfaceTexture;
                            bmw bmwVar2 = bmw.this;
                            surfaceTexture2.setOnFrameAvailableListener(null);
                            surfaceTexture2.release();
                            surface2.release();
                            bmwVar2.f--;
                            bmwVar2.d();
                        }
                    });
                    surfaceTexture.setOnFrameAvailableListener(bmwVar, bmwVar.d);
                }
            }, new Runnable() { // from class: bmg
                @Override // java.lang.Runnable
                public final void run() {
                    axt.this.f();
                }
            });
        }
    }

    @Override // defpackage.awz
    public final void b(final awy awyVar) {
        if (this.j.get()) {
            awyVar.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: bmq
            @Override // java.lang.Runnable
            public final void run() {
                final bmw bmwVar = bmw.this;
                final awy awyVar2 = awyVar;
                Surface c = awyVar2.c(bmwVar.c, new ksp() { // from class: bml
                    @Override // defpackage.ksp
                    public final void accept(Object obj) {
                        awy awyVar3 = awyVar2;
                        awyVar3.close();
                        bmw bmwVar2 = bmw.this;
                        Surface surface = (Surface) bmwVar2.e.remove(awyVar3);
                        if (surface != null) {
                            bmwVar2.a.g(surface);
                        }
                    }
                });
                bmwVar.a.d(c);
                bmwVar.e.put(awyVar2, c);
            }
        };
        awyVar.getClass();
        f(runnable, new Runnable() { // from class: bmr
            @Override // java.lang.Runnable
            public final void run() {
                awy.this.close();
            }
        });
    }

    @Override // defpackage.bnv
    public final ListenableFuture c(final int i2, final int i3) {
        return bkj.d(kfg.a(new kfd() { // from class: bmj
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final bmb bmbVar = new bmb(i2, i3, kfbVar);
                final bmw bmwVar = bmw.this;
                bmwVar.f(new Runnable() { // from class: bme
                    @Override // java.lang.Runnable
                    public final void run() {
                        bmw.this.h.add(bmbVar);
                    }
                }, new Runnable() { // from class: bmk
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = bmw.i;
                        kfb.this.c(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                    }
                });
                return "DefaultSurfaceProcessor#snapshot";
            }
        }));
    }

    public final void d() {
        if (this.g && this.f == 0) {
            Iterator it = this.e.keySet().iterator();
            while (it.hasNext()) {
                ((awy) it.next()).close();
            }
            Iterator it2 = this.h.iterator();
            while (it2.hasNext()) {
                ((bmv) it2.next()).c().c(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.e.clear();
            this.a.e();
            this.b.quit();
        }
    }

    public final void e(Runnable runnable) {
        f(runnable, new Runnable() { // from class: bms
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = bmw.i;
            }
        });
    }

    public final void f(final Runnable runnable, final Runnable runnable2) {
        try {
            this.c.execute(new Runnable() { // from class: bmh
                @Override // java.lang.Runnable
                public final void run() {
                    if (bmw.this.g) {
                        runnable2.run();
                    } else {
                        runnable.run();
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            avw.g("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    @Override // defpackage.bnv
    public final void g() {
        if (this.j.getAndSet(true)) {
            return;
        }
        e(new Runnable() { // from class: bmi
            @Override // java.lang.Runnable
            public final void run() {
                bmw bmwVar = bmw.this;
                bmwVar.g = true;
                bmwVar.d();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02dc A[Catch: all -> 0x031b, TryCatch #2 {all -> 0x031b, blocks: (B:55:0x0140, B:56:0x014a, B:58:0x0150, B:63:0x02d6, B:65:0x02dc, B:66:0x02ed, B:68:0x02ff, B:69:0x0306, B:71:0x0168, B:73:0x016e, B:74:0x0171, B:77:0x01b3, B:79:0x026e, B:80:0x0273), top: B:54:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02ff A[Catch: all -> 0x031b, TryCatch #2 {all -> 0x031b, blocks: (B:55:0x0140, B:56:0x014a, B:58:0x0150, B:63:0x02d6, B:65:0x02dc, B:66:0x02ed, B:68:0x02ff, B:69:0x0306, B:71:0x0168, B:73:0x016e, B:74:0x0171, B:77:0x01b3, B:79:0x026e, B:80:0x0273), top: B:54:0x0140 }] */
    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFrameAvailable(android.graphics.SurfaceTexture r35) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmw.onFrameAvailable(android.graphics.SurfaceTexture):void");
    }
}
