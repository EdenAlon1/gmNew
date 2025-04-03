package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agj implements bcm {
    private long A;
    private final ahj B;
    final agh a;
    final Executor b;
    public final apd c;
    public final als d;
    public final anw e;
    public final anm f;
    final any g;
    public final ajr h;
    public final anp i;
    public avi j;
    public volatile boolean k;
    public final agf l;
    private final Object n = new Object();
    private final bgc o;
    private final alz p;
    private final alc q;
    private final asi r;
    private int s;
    private volatile int t;
    private volatile int u;
    private volatile int v;
    private final arb w;
    private final AtomicLong x;
    private volatile ListenableFuture y;
    private int z;

    public agj(apd apdVar, ScheduledExecutorService scheduledExecutorService, Executor executor, ahj ahjVar, bfx bfxVar) {
        bgc bgcVar = new bgc();
        this.o = bgcVar;
        this.s = 0;
        this.t = 0;
        this.k = false;
        this.v = 2;
        this.x = new AtomicLong(0L);
        this.y = bkj.b(null);
        this.z = 1;
        this.A = 0L;
        agf agfVar = new agf();
        this.l = agfVar;
        this.c = apdVar;
        this.B = ahjVar;
        this.b = executor;
        this.i = new anp(executor);
        agh aghVar = new agh(executor);
        this.a = aghVar;
        bgcVar.t(this.z);
        bgcVar.k(new akj(aghVar));
        bgcVar.k(agfVar);
        this.q = new alc();
        this.d = new als(this, scheduledExecutorService, executor, bfxVar);
        this.e = new anw(this, apdVar, executor);
        this.f = new anm(this, apdVar, executor);
        this.u = apdVar.a();
        this.p = new alz(this, apdVar);
        this.g = new aof(apdVar, executor);
        this.w = new arb(bfxVar);
        this.r = new asi(this, executor);
        this.h = new ajr(this, apdVar, bfxVar, executor, scheduledExecutorService);
    }

    static boolean I(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof bgw) && (l = (Long) ((bgw) tag).c("CameraControlSessionUpdateId")) != null && l.longValue() >= j;
    }

    private final boolean L() {
        int i;
        synchronized (this.n) {
            i = this.s;
        }
        return i > 0;
    }

    private static boolean M(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public static int b(apd apdVar, int i) {
        int[] iArr = (int[]) apdVar.c(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return M(i, iArr) ? i : M(1, iArr) ? 1 : 0;
    }

    final void A(final boolean z) {
        axz e;
        avw.a("Camera2CameraControlImp", a.q(z, "setActive: isActive = "));
        als alsVar = this.d;
        if (z != alsVar.e) {
            alsVar.e = z;
            if (!alsVar.e) {
                alsVar.e();
            }
        }
        anw anwVar = this.e;
        if (anwVar.f != z) {
            anwVar.f = z;
            if (!z) {
                synchronized (anwVar.c) {
                    anwVar.c.d(1.0f);
                    e = blb.e(anwVar.c);
                }
                anwVar.c(e);
                anwVar.e.f();
                anwVar.a.d();
            }
        }
        alz alzVar = this.p;
        if (alzVar.c != z) {
            alzVar.c = z;
        }
        anm anmVar = this.f;
        if (anmVar.f != z) {
            anmVar.f = z;
            if (!z) {
                if (anmVar.i) {
                    anmVar.i = false;
                    anmVar.a.w(0);
                    anmVar.b(0);
                    anm.c(anmVar.c, Integer.valueOf(anmVar.g));
                }
                kfb kfbVar = anmVar.h;
                if (kfbVar != null) {
                    kfbVar.c(new atb("Camera is not active."));
                    anmVar.h = null;
                }
            }
        }
        alc alcVar = this.q;
        if (z != alcVar.b) {
            alcVar.b = z;
            if (!z) {
                synchronized (alcVar.a.a) {
                }
            }
        }
        final asi asiVar = this.r;
        asiVar.c.execute(new Runnable() { // from class: asf
            @Override // java.lang.Runnable
            public final void run() {
                asi asiVar2 = asi.this;
                boolean z2 = asiVar2.a;
                boolean z3 = z;
                if (z2 == z3) {
                    return;
                }
                asiVar2.a = z3;
                if (!z3) {
                    asiVar2.a(new atb("The camera control has became inactive."));
                } else if (asiVar2.b) {
                    asiVar2.c();
                }
            }
        });
        if (z) {
            return;
        }
        this.j = null;
        this.i.b.set(0);
        avw.a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }

    @Override // defpackage.bcm
    public final void B(int i) {
        if (!L()) {
            avw.f("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.v = i;
        avw.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.v);
        any anyVar = this.g;
        boolean z = true;
        if (this.v != 1 && this.v != 0) {
            z = false;
        }
        ((aof) anyVar).e = z;
        this.y = n();
    }

    public final void C(boolean z) {
        alz alzVar = this.p;
        synchronized (alzVar.a) {
            alzVar.b = z;
            if (z) {
            }
        }
    }

    public final void D(Rational rational) {
        this.d.f = rational;
    }

    @Override // defpackage.bcm
    public final void E(avi aviVar) {
        this.j = aviVar;
    }

    final void F(int i) {
        this.z = i;
        this.d.n = i;
        this.h.b = this.z;
    }

    public final void G(boolean z) {
        aof aofVar = (aof) this.g;
        if (aofVar.d != z && z) {
            aofVar.c();
        }
        aofVar.d = z;
    }

    final void H(List list) {
        bcd bcdVar;
        ksw.h(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            ahj ahjVar = this.B;
            boolean hasNext = it.hasNext();
            ahu ahuVar = ahjVar.a;
            if (!hasNext) {
                ahuVar.q("Issue capture request");
                ahuVar.j.h(arrayList);
                return;
            }
            bdk bdkVar = (bdk) it.next();
            bdi bdiVar = new bdi(bdkVar);
            if (bdkVar.f == 5 && (bcdVar = bdkVar.k) != null) {
                bdiVar.f = bcdVar;
            }
            if (bdkVar.e().isEmpty() && bdkVar.i) {
                if (bdiVar.a.isEmpty()) {
                    Iterator it2 = DesugarCollections.unmodifiableCollection(ahuVar.a.e(new bhb() { // from class: bha
                        @Override // defpackage.bhb
                        public final boolean a(bhc bhcVar) {
                            return bhcVar.f && bhcVar.e;
                        }
                    })).iterator();
                    while (it2.hasNext()) {
                        bdk bdkVar2 = ((bgk) it2.next()).g;
                        List e = bdkVar2.e();
                        if (!e.isEmpty()) {
                            if (bdkVar2.b() != 0) {
                                bdiVar.l(bdkVar2.b());
                            }
                            if (bdkVar2.c() != 0) {
                                bdiVar.m(bdkVar2.c());
                            }
                            Iterator it3 = e.iterator();
                            while (it3.hasNext()) {
                                bdiVar.g((bdy) it3.next());
                            }
                        }
                    }
                    if (bdiVar.a.isEmpty()) {
                        avw.f("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                    }
                } else {
                    avw.f("Camera2CameraImpl", "The capture config builder already has surface inside.");
                }
            }
            arrayList.add(bdiVar.b());
        }
    }

    final boolean J() {
        return this.t != 0;
    }

    @Override // defpackage.bcm
    public final ListenableFuture K(final int i) {
        if (L()) {
            final int i2 = this.v;
            return bkj.g(bjv.a(bkj.d(this.y)), new bjq() { // from class: afy
                @Override // defpackage.bjq
                public final ListenableFuture a(Object obj) {
                    ajr ajrVar = agj.this.h;
                    int i3 = i;
                    Executor executor = ajrVar.a;
                    int i4 = i2;
                    return bkj.b(new aih(ajrVar.a(i3, i4, 1), executor, i4));
                }
            }, this.b);
        }
        avw.f("Camera2CameraControlImp", "Camera is not active.");
        return new bkk(new atb("Camera is not active."));
    }

    final int a(int i) {
        return b(this.c, i);
    }

    final int c(int i) {
        int[] iArr = (int[]) this.c.c(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (M(i, iArr)) {
            return i;
        }
        if (M(4, iArr)) {
            return 4;
        }
        return M(1, iArr) ? 1 : 0;
    }

    final long d() {
        this.A = this.x.getAndIncrement();
        this.B.a.E();
        return this.A;
    }

    final Rect e() {
        return this.e.e.c();
    }

    @Override // defpackage.bcm
    public final Rect f() {
        Rect rect = (Rect) this.c.c(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        ksw.h(rect);
        return rect;
    }

    @Override // defpackage.bcm
    public final bdp g() {
        afm a;
        asi asiVar = this.r;
        synchronized (asiVar.d) {
            a = asiVar.e.a();
        }
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bd, code lost:
    
        if (r3 != 2) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bgk h() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agj.h():bgk");
    }

    @Override // defpackage.atc
    public final ListenableFuture i(final boolean z) {
        ListenableFuture a;
        if (!L()) {
            return new bkk(new atb("Camera is not active."));
        }
        final anm anmVar = this.f;
        if (anmVar.d) {
            anmVar.b(z ? 1 : 0);
            final int i = z ? 1 : 0;
            a = kfg.a(new kfd() { // from class: ani
                @Override // defpackage.kfd
                public final Object a(final kfb kfbVar) {
                    final anm anmVar2 = anm.this;
                    final int i2 = i;
                    anmVar2.e.execute(new Runnable() { // from class: anj
                        @Override // java.lang.Runnable
                        public final void run() {
                            anm.this.a(kfbVar, i2);
                        }
                    });
                    return "enableTorch: " + z;
                }
            });
        } else {
            avw.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            a = new bkk(new IllegalStateException("No flash unit"));
        }
        return bkj.d(a);
    }

    @Override // defpackage.atc
    public final ListenableFuture j(float f) {
        ListenableFuture bkkVar;
        final axz e;
        if (!L()) {
            return new bkk(new atb("Camera is not active."));
        }
        final anw anwVar = this.e;
        synchronized (anwVar.c) {
            try {
                anx anxVar = anwVar.c;
                if (f > 1.0f || f < 0.0f) {
                    throw new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0..1]");
                }
                anxVar.d = f;
                anxVar.a = bba.t(f, anxVar.c, anxVar.b);
                e = blb.e(anxVar);
            } catch (IllegalArgumentException e2) {
                bkkVar = new bkk(e2);
            }
        }
        anwVar.c(e);
        bkkVar = kfg.a(new kfd() { // from class: ant
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final anw anwVar2 = anw.this;
                final axz axzVar = e;
                anwVar2.b.execute(new Runnable() { // from class: ans
                    @Override // java.lang.Runnable
                    public final void run() {
                        anw.this.b(kfbVar, axzVar);
                    }
                });
                return "setLinearZoom";
            }
        });
        return bkj.d(bkkVar);
    }

    @Override // defpackage.atc
    public final ListenableFuture k(float f) {
        ListenableFuture bkkVar;
        final axz e;
        if (!L()) {
            return new bkk(new atb("Camera is not active."));
        }
        final anw anwVar = this.e;
        synchronized (anwVar.c) {
            try {
                anwVar.c.d(f);
                e = blb.e(anwVar.c);
            } catch (IllegalArgumentException e2) {
                bkkVar = new bkk(e2);
            }
        }
        anwVar.c(e);
        bkkVar = kfg.a(new kfd() { // from class: anq
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final anw anwVar2 = anw.this;
                final axz axzVar = e;
                anwVar2.b.execute(new Runnable() { // from class: anr
                    @Override // java.lang.Runnable
                    public final void run() {
                        anw.this.b(kfbVar, axzVar);
                    }
                });
                return "setZoomRatio";
            }
        });
        return bkj.d(bkkVar);
    }

    @Override // defpackage.atc
    public final ListenableFuture l(final aud audVar) {
        if (!L()) {
            return new bkk(new atb("Camera is not active."));
        }
        final als alsVar = this.d;
        return bkj.d(kfg.a(new kfd() { // from class: alk
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final als alsVar2 = als.this;
                final aud audVar2 = audVar;
                alsVar2.c.execute(new Runnable() { // from class: alj
                    @Override // java.lang.Runnable
                    public final void run() {
                        Rational rational;
                        final long d;
                        final als alsVar3 = als.this;
                        kfb kfbVar2 = kfbVar;
                        if (!alsVar3.e) {
                            kfbVar2.c(new atb("Camera is not active."));
                            return;
                        }
                        Rect e = alsVar3.b.e();
                        if (alsVar3.f != null) {
                            rational = alsVar3.f;
                        } else {
                            Rect e2 = alsVar3.b.e();
                            rational = new Rational(e2.width(), e2.height());
                        }
                        aud audVar3 = audVar2;
                        Integer num = (Integer) alsVar3.b.c.c(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                        List c = alsVar3.c(audVar3.a, num == null ? 0 : num.intValue(), rational, e, 1);
                        List list = audVar3.b;
                        Integer num2 = (Integer) alsVar3.b.c.c(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                        List c2 = alsVar3.c(list, num2 == null ? 0 : num2.intValue(), rational, e, 2);
                        List list2 = audVar3.c;
                        Integer num3 = (Integer) alsVar3.b.c.c(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
                        List c3 = alsVar3.c(list2, num3 == null ? 0 : num3.intValue(), rational, e, 4);
                        if (c.isEmpty() && c2.isEmpty() && c3.isEmpty()) {
                            kfbVar2.c(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                            return;
                        }
                        alsVar3.i("Cancelled by another startFocusAndMetering()");
                        alsVar3.l();
                        alsVar3.h();
                        alsVar3.s = kfbVar2;
                        MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) c.toArray(als.a);
                        MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) c2.toArray(als.a);
                        MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) c3.toArray(als.a);
                        alsVar3.b.z(alsVar3.o);
                        alsVar3.h();
                        alsVar3.f();
                        alsVar3.p = meteringRectangleArr;
                        alsVar3.q = meteringRectangleArr2;
                        alsVar3.r = meteringRectangleArr3;
                        if (alsVar3.k()) {
                            alsVar3.g = true;
                            alsVar3.l = false;
                            alsVar3.m = false;
                            d = alsVar3.b.d();
                            alsVar3.m(true);
                        } else {
                            alsVar3.g = false;
                            alsVar3.l = true;
                            alsVar3.m = false;
                            d = alsVar3.b.d();
                        }
                        alsVar3.h = 0;
                        final boolean z = alsVar3.b.c(1) == 1;
                        alsVar3.o = new agi() { // from class: aln
                            @Override // defpackage.agi
                            public final boolean a(TotalCaptureResult totalCaptureResult) {
                                Integer num4 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                                als alsVar4 = als.this;
                                if (alsVar4.k()) {
                                    if (!z || num4 == null) {
                                        alsVar4.m = true;
                                        alsVar4.l = true;
                                    } else if (alsVar4.h.intValue() == 3) {
                                        if (num4.intValue() == 4) {
                                            alsVar4.m = true;
                                            alsVar4.l = true;
                                        } else if (num4.intValue() == 5) {
                                            alsVar4.m = false;
                                            alsVar4.l = true;
                                        }
                                    }
                                }
                                if (alsVar4.l && agj.I(totalCaptureResult, d)) {
                                    alsVar4.g(alsVar4.m);
                                    return true;
                                }
                                if (alsVar4.h.equals(num4) || num4 == null) {
                                    return false;
                                }
                                alsVar4.h = num4;
                                return false;
                            }
                        };
                        alsVar3.b.o(alsVar3.o);
                        final long j = alsVar3.k + 1;
                        alsVar3.k = j;
                        alsVar3.j = alsVar3.d.schedule(new Runnable() { // from class: alo
                            @Override // java.lang.Runnable
                            public final void run() {
                                final als alsVar4 = als.this;
                                final long j2 = j;
                                alsVar4.c.execute(new Runnable() { // from class: ali
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        long j3 = j2;
                                        als alsVar5 = als.this;
                                        if (j3 == alsVar5.k) {
                                            alsVar5.m = false;
                                            alsVar5.g(false);
                                        }
                                    }
                                });
                            }
                        }, 5000L, TimeUnit.MILLISECONDS);
                        long j2 = audVar3.d;
                        if (j2 > 0) {
                            alsVar3.i = alsVar3.d.schedule(new Runnable() { // from class: alp
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final als alsVar4 = als.this;
                                    final long j3 = j;
                                    alsVar4.c.execute(new Runnable() { // from class: ale
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            long j4 = j3;
                                            als alsVar5 = als.this;
                                            if (j4 == alsVar5.k) {
                                                alsVar5.e();
                                            }
                                        }
                                    });
                                }
                            }, j2, TimeUnit.MILLISECONDS);
                        }
                    }
                });
                return "startFocusAndMetering";
            }
        }));
    }

    @Override // defpackage.bcm
    public final ListenableFuture m(final List list, final int i, final int i2) {
        if (L()) {
            final int i3 = this.v;
            return bkj.g(bjv.a(bkj.d(this.y)), new bjq() { // from class: afv
                @Override // defpackage.bjq
                public final ListenableFuture a(Object obj) {
                    ajr ajrVar = agj.this.h;
                    int i4 = i;
                    final int i5 = i3;
                    final air a = ajrVar.a(i4, i5, i2);
                    bjv a2 = bjv.a(a.a(i5));
                    final List list2 = list;
                    ListenableFuture g = bkj.g(a2, new bjq() { // from class: aij
                        /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
                        @Override // defpackage.bjq
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r14) {
                            /*
                                Method dump skipped, instructions count: 261
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.aij.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                        }
                    }, a.c);
                    g.b(new Runnable() { // from class: aik
                        @Override // java.lang.Runnable
                        public final void run() {
                            air.this.c();
                        }
                    }, a.c);
                    return bkj.d(g);
                }
            }, this.b);
        }
        avw.f("Camera2CameraControlImp", "Camera is not active.");
        return new bkk(new atb("Camera is not active."));
    }

    public final ListenableFuture n() {
        return bkj.d(kfg.a(new kfd() { // from class: agb
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final agj agjVar = agj.this;
                agjVar.b.execute(new Runnable() { // from class: afu
                    @Override // java.lang.Runnable
                    public final void run() {
                        final agj agjVar2 = agj.this;
                        final long d = agjVar2.d();
                        bkj.j(kfg.a(new kfd() { // from class: afz
                            @Override // defpackage.kfd
                            public final Object a(final kfb kfbVar2) {
                                final long j = d;
                                agj.this.o(new agi() { // from class: afs
                                    @Override // defpackage.agi
                                    public final boolean a(TotalCaptureResult totalCaptureResult) {
                                        if (!agj.I(totalCaptureResult, j)) {
                                            return false;
                                        }
                                        kfbVar2.b(null);
                                        return true;
                                    }
                                });
                                return "waitForSessionUpdateId:" + j;
                            }
                        }), kfbVar);
                    }
                });
                return "updateSessionConfigAsync";
            }
        }));
    }

    final void o(agi agiVar) {
        this.a.a.add(agiVar);
    }

    @Override // defpackage.bcm
    public final void p(bdp bdpVar) {
        asm b = asl.a(bdpVar).b();
        final asi asiVar = this.r;
        synchronized (asiVar.d) {
            asiVar.e.b(b);
        }
        bkj.d(kfg.a(new kfd() { // from class: asd
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final asi asiVar2 = asi.this;
                asiVar2.c.execute(new Runnable() { // from class: ash
                    @Override // java.lang.Runnable
                    public final void run() {
                        asi.this.b(kfbVar);
                    }
                });
                return "addCaptureRequestOptions";
            }
        })).b(new Runnable() { // from class: afx
            @Override // java.lang.Runnable
            public final void run() {
            }
        }, bjb.a());
    }

    final void q(final Executor executor, final bbt bbtVar) {
        this.b.execute(new Runnable() { // from class: afw
            @Override // java.lang.Runnable
            public final void run() {
                agf agfVar = agj.this.l;
                Set set = agfVar.a;
                bbt bbtVar2 = bbtVar;
                set.add(bbtVar2);
                agfVar.b.put(bbtVar2, executor);
            }
        });
    }

    @Override // defpackage.bcm
    public final void r(bgc bgcVar) {
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        final aof aofVar = (aof) this.g;
        aofVar.b();
        if (aofVar.d) {
            bgcVar.t(1);
            return;
        }
        if (aofVar.g) {
            bgcVar.t(1);
            return;
        }
        Map d = aof.d(aofVar.a);
        if (aofVar.f && !d.isEmpty() && d.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) aofVar.a.c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
            for (int i : validOutputFormatsForInput) {
                if (i == 256) {
                    Size size = (Size) d.get(34);
                    awa awaVar = new awa(size.getWidth(), size.getHeight(), 34, 9);
                    final awt awtVar = new awt(awaVar);
                    Surface e = awtVar.e();
                    e.getClass();
                    bew bewVar = new bew(e, new Size(awtVar.d(), awtVar.a()), 34);
                    final aoe aoeVar = new aoe(aofVar.b);
                    aofVar.h = awtVar;
                    aofVar.i = bewVar;
                    aofVar.j = aoeVar;
                    awtVar.j(new beu() { // from class: anz
                        @Override // defpackage.beu
                        public final void a(bev bevVar) {
                            aof aofVar2 = aof.this;
                            try {
                                avr f = bevVar.f();
                                if (f != null) {
                                    aofVar2.c.d(f);
                                }
                            } catch (IllegalStateException e2) {
                                avw.c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = ".concat(String.valueOf(e2.getMessage())));
                            }
                        }
                    }, bjl.a());
                    bewVar.c().b(new Runnable() { // from class: aoa
                        @Override // java.lang.Runnable
                        public final void run() {
                            awt.this.k();
                            aoe aoeVar2 = aoeVar;
                            aoeVar2.a();
                            ImageWriter imageWriter = aoeVar2.a;
                            if (imageWriter != null) {
                                imageWriter.close();
                            }
                        }
                    }, aofVar.b);
                    bgcVar.m(bewVar);
                    bgcVar.f(awaVar.b);
                    bgcVar.l(new aoc(aoeVar));
                    bgcVar.g = new InputConfiguration(awtVar.d(), awtVar.a(), awtVar.b());
                    return;
                }
            }
        }
        bgcVar.t(1);
    }

    @Override // defpackage.bcm
    public final void s() {
        final asi asiVar = this.r;
        synchronized (asiVar.d) {
            asiVar.e = new afl();
        }
        bkj.d(kfg.a(new kfd() { // from class: asg
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final asi asiVar2 = asi.this;
                asiVar2.c.execute(new Runnable() { // from class: asc
                    @Override // java.lang.Runnable
                    public final void run() {
                        asi.this.b(kfbVar);
                    }
                });
                return "clearCaptureRequestOptions";
            }
        })).b(new Runnable() { // from class: aft
            @Override // java.lang.Runnable
            public final void run() {
            }
        }, bjb.a());
    }

    @Override // defpackage.bcm
    public final void t() {
        ((aof) this.g).b();
    }

    final void u() {
        synchronized (this.n) {
            int i = this.s;
            if (i == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            this.s = i - 1;
        }
    }

    @Override // defpackage.bcm
    public final void v() {
        final anp anpVar = this.i;
        anpVar.a.execute(new Runnable() { // from class: ann
            @Override // java.lang.Runnable
            public final void run() {
                int decrementAndGet = anp.this.b.decrementAndGet();
                if (decrementAndGet < 0) {
                    avw.f("VideoUsageControl", a.f(decrementAndGet, "decrementUsage: mVideoUsage = ", ", which is less than 0!"));
                } else {
                    avw.a("VideoUsageControl", a.h(decrementAndGet, "decrementUsage: mVideoUsage = "));
                }
            }
        });
    }

    final void w(int i) {
        this.t = i;
        if (i == 0) {
            bdi bdiVar = new bdi();
            bdiVar.b = this.z;
            bdiVar.n();
            afl aflVar = new afl();
            aflVar.d(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(a(1)));
            aflVar.d(CaptureRequest.FLASH_MODE, 0);
            bdiVar.f(aflVar.a());
            H(Collections.singletonList(bdiVar.b()));
        }
        d();
    }

    final void x() {
        synchronized (this.n) {
            this.s++;
        }
    }

    @Override // defpackage.bcm
    public final void y() {
        final anp anpVar = this.i;
        anpVar.a.execute(new Runnable() { // from class: ano
            @Override // java.lang.Runnable
            public final void run() {
                avw.a("VideoUsageControl", "incrementUsage: mVideoUsage = " + anp.this.b.incrementAndGet());
            }
        });
    }

    final void z(agi agiVar) {
        this.a.a.remove(agiVar);
    }
}
