package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import android.util.Rational;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class als {
    public static final MeteringRectangle[] a = new MeteringRectangle[0];
    public final agj b;
    final Executor c;
    public final ScheduledExecutorService d;
    public ScheduledFuture i;
    public ScheduledFuture j;
    public MeteringRectangle[] p;
    public MeteringRectangle[] q;
    public MeteringRectangle[] r;
    kfb s;
    public boolean t;
    public agi u;
    private final ark v;
    public volatile boolean e = false;
    public volatile Rational f = null;
    public boolean g = false;
    Integer h = 0;
    long k = 0;
    boolean l = false;
    boolean m = false;
    public int n = 1;
    public agi o = null;

    public als(agj agjVar, ScheduledExecutorService scheduledExecutorService, Executor executor, bfx bfxVar) {
        MeteringRectangle[] meteringRectangleArr = a;
        this.p = meteringRectangleArr;
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr;
        this.s = null;
        this.t = false;
        this.u = null;
        this.b = agjVar;
        this.c = executor;
        this.d = scheduledExecutorService;
        this.v = new ark(bfxVar);
    }

    private static int n(int i, int i2, int i3) {
        return Math.min(Math.max(i, i3), i2);
    }

    final ListenableFuture a(final boolean z) {
        if (Build.VERSION.SDK_INT < 28) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API " + Build.VERSION.SDK_INT);
            return bkj.b(null);
        }
        if (this.b.a(5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return bkj.b(null);
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return kfg.a(new kfd() { // from class: alf
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final als alsVar = als.this;
                final boolean z2 = z;
                alsVar.c.execute(new Runnable() { // from class: alg
                    @Override // java.lang.Runnable
                    public final void run() {
                        final als alsVar2 = als.this;
                        alsVar2.b.z(alsVar2.u);
                        alsVar2.t = z2;
                        final kfb kfbVar2 = kfbVar;
                        if (!alsVar2.e) {
                            kfbVar2.c(new atb("Camera is not active."));
                            return;
                        }
                        final long d = alsVar2.b.d();
                        alsVar2.u = new agi() { // from class: alh
                            @Override // defpackage.agi
                            public final boolean a(TotalCaptureResult totalCaptureResult) {
                                int intValue = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue();
                                StringBuilder sb = new StringBuilder("enableExternalFlashAeMode: isAeModeExternalFlash = ");
                                boolean z3 = intValue == 5;
                                sb.append(z3);
                                avw.a("FocusMeteringControl", sb.toString());
                                if (z3 != als.this.t || !agj.I(totalCaptureResult, d)) {
                                    return false;
                                }
                                kfb kfbVar3 = kfbVar2;
                                avw.a("FocusMeteringControl", a.q(z3, "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = "));
                                kfbVar3.b(null);
                                return true;
                            }
                        };
                        alsVar2.b.o(alsVar2.u);
                    }
                });
                return "enableExternalFlashAeMode";
            }
        });
    }

    final ListenableFuture b() {
        return kfg.a(new kfd() { // from class: alm
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final als alsVar = als.this;
                alsVar.c.execute(new Runnable() { // from class: all
                    @Override // java.lang.Runnable
                    public final void run() {
                        als.this.j(kfbVar);
                    }
                });
                return "triggerAePrecapture";
            }
        });
    }

    public final List c(List list, int i, Rational rational, Rect rect, int i2) {
        if (list.isEmpty() || i == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            awb awbVar = (awb) it.next();
            if (arrayList.size() == i) {
                break;
            }
            float f = awbVar.a;
            if (f >= 0.0f && f <= 1.0f) {
                float f2 = awbVar.b;
                if (f2 >= 0.0f && f2 <= 1.0f) {
                    ark arkVar = this.v;
                    Rational rational3 = awbVar.d;
                    if (rational3 == null) {
                        rational3 = rational;
                    }
                    PointF pointF = (i2 == 1 && arkVar.a.d(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - awbVar.a, awbVar.b) : new PointF(awbVar.a, awbVar.b);
                    if (!rational3.equals(rational2)) {
                        if (rational3.compareTo(rational2) > 0) {
                            float doubleValue = (float) (rational3.doubleValue() / rational2.doubleValue());
                            pointF.y = (((float) ((doubleValue - 1.0d) / 2.0d)) + pointF.y) * (1.0f / doubleValue);
                        } else {
                            float doubleValue2 = (float) (rational2.doubleValue() / rational3.doubleValue());
                            pointF.x = (((float) ((doubleValue2 - 1.0d) / 2.0d)) + pointF.x) * (1.0f / doubleValue2);
                        }
                    }
                    float f3 = rect.left;
                    float width = pointF.x * rect.width();
                    float f4 = rect.top;
                    float height = pointF.y * rect.height();
                    float width2 = awbVar.c * rect.width();
                    int i3 = (int) (f4 + height);
                    int height2 = ((int) (awbVar.c * rect.height())) / 2;
                    int i4 = (int) (f3 + width);
                    int i5 = ((int) width2) / 2;
                    Rect rect2 = new Rect(i4 - i5, i3 - height2, i4 + i5, i3 + height2);
                    rect2.left = n(rect2.left, rect.right, rect.left);
                    rect2.right = n(rect2.right, rect.right, rect.left);
                    rect2.top = n(rect2.top, rect.bottom, rect.top);
                    rect2.bottom = n(rect2.bottom, rect.bottom, rect.top);
                    MeteringRectangle meteringRectangle = new MeteringRectangle(rect2, 1000);
                    if (meteringRectangle.getWidth() != 0 && meteringRectangle.getHeight() != 0) {
                        arrayList.add(meteringRectangle);
                    }
                }
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    final void d(boolean z, boolean z2) {
        if (this.e) {
            bdi bdiVar = new bdi();
            bdiVar.n();
            bdiVar.b = this.n;
            afl aflVar = new afl();
            if (z) {
                aflVar.d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z2) {
                aflVar.d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            bdiVar.f(aflVar.a());
            this.b.H(Collections.singletonList(bdiVar.b()));
        }
    }

    final void e() {
        l();
        i("Cancelled by cancelFocusAndMetering()");
        h();
        f();
        if (k()) {
            d(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = a;
        this.p = meteringRectangleArr;
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr;
        this.g = false;
        this.b.d();
    }

    public final void f() {
        ScheduledFuture scheduledFuture = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.j = null;
        }
    }

    final void g(boolean z) {
        f();
        kfb kfbVar = this.s;
        if (kfbVar != null) {
            kfbVar.b(new aue(z));
            this.s = null;
        }
    }

    public final void h() {
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.i = null;
        }
    }

    public final void i(String str) {
        this.b.z(this.o);
        kfb kfbVar = this.s;
        if (kfbVar != null) {
            kfbVar.c(new atb(str));
            this.s = null;
        }
    }

    final void j(kfb kfbVar) {
        avw.a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.e) {
            kfbVar.c(new atb("Camera is not active."));
            return;
        }
        bdi bdiVar = new bdi();
        bdiVar.b = this.n;
        bdiVar.n();
        afl aflVar = new afl();
        aflVar.d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        bdiVar.f(aflVar.a());
        bdiVar.d(new alr(kfbVar));
        this.b.H(Collections.singletonList(bdiVar.b()));
    }

    public final boolean k() {
        return this.p.length > 0;
    }

    public final void l() {
        this.b.z(null);
    }

    final void m(boolean z) {
        if (this.e) {
            bdi bdiVar = new bdi();
            bdiVar.b = this.n;
            bdiVar.n();
            afl aflVar = new afl();
            aflVar.d(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            if (z) {
                aflVar.e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.b.a(1)), bdo.HIGH_PRIORITY_REQUIRED);
            }
            bdiVar.f(aflVar.a());
            bdiVar.d(new alq());
            this.b.H(Collections.singletonList(bdiVar.b()));
        }
    }
}
