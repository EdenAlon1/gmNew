package androidx.camera.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.PreviewView;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import defpackage.a;
import defpackage.auc;
import defpackage.aud;
import defpackage.avw;
import defpackage.awb;
import defpackage.awk;
import defpackage.axt;
import defpackage.axy;
import defpackage.bcq;
import defpackage.biw;
import defpackage.bjb;
import defpackage.bjm;
import defpackage.bkj;
import defpackage.cbd;
import defpackage.cbk;
import defpackage.cbl;
import defpackage.cbx;
import defpackage.cbz;
import defpackage.ccd;
import defpackage.cce;
import defpackage.ccf;
import defpackage.ccg;
import defpackage.cch;
import defpackage.cci;
import defpackage.ccj;
import defpackage.ccm;
import defpackage.ccp;
import defpackage.ccq;
import defpackage.ccr;
import defpackage.ccy;
import defpackage.cdm;
import defpackage.cdn;
import defpackage.cdo;
import defpackage.cdq;
import defpackage.ksw;
import defpackage.kvo;
import defpackage.llg;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreviewView extends FrameLayout {
    public cci a;
    public final ccr b;
    public final cbx c;
    public boolean d;
    public final llg e;
    public final AtomicReference f;
    public cbl g;
    public ccj h;
    public bcq i;
    public final awk j;
    public int k;
    private final cdm l;
    private MotionEvent m;
    private final cce n;
    private final View.OnLayoutChangeListener o;

    public PreviewView(Context context) {
        this(context, null);
    }

    public static boolean e(axt axtVar, int i) {
        boolean equals = axtVar.f.f().l().equals("androidx.camera.camera2.legacy");
        boolean z = (cdq.a(SurfaceViewStretchedQuirk.class) == null && cdq.a(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (equals || z) {
            return true;
        }
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return false;
        }
        if (i2 == 1) {
            return true;
        }
        Objects.toString(ccf.a(i));
        throw new IllegalArgumentException("Invalid implementation mode: ".concat(ccf.a(i)));
    }

    private final DisplayManager h() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    public final awk a() {
        biw.b();
        return this.j;
    }

    public final void b(boolean z) {
        int i;
        biw.b();
        biw.b();
        axy axyVar = null;
        if (getDisplay() != null) {
            int rotation = getDisplay().getRotation();
            biw.b();
            if (getWidth() != 0 && getHeight() != 0) {
                Rational rational = new Rational(getWidth(), getHeight());
                int f = f();
                int i2 = f - 1;
                if (f == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    i = 0;
                } else if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        i = 3;
                        if (i2 != 3 && i2 != 4 && i2 != 5) {
                            int f2 = f();
                            Objects.toString(ccg.a(f2));
                            throw new IllegalStateException("Unexpected scale type: ".concat(ccg.a(f2)));
                        }
                    }
                } else {
                    i = 1;
                }
                axyVar = new axy(i, rational, rotation, getLayoutDirection());
            }
        }
        if (this.g == null || axyVar == null || !isAttachedToWindow()) {
            return;
        }
        try {
            cbl cblVar = this.g;
            awk a = a();
            biw.b();
            if (cblVar.p != a) {
                cblVar.p = a;
                cblVar.c.a(a);
            }
            boolean z2 = cblVar.o == null || cblVar.d(axyVar) != cblVar.d(cblVar.o);
            cblVar.o = axyVar;
            ccq ccqVar = cblVar.q;
            ScheduledExecutorService a2 = bjm.a();
            cbd cbdVar = cblVar.B;
            synchronized (ccqVar.a) {
                if (ccqVar.b.canDetectOrientation()) {
                    ccqVar.c.put(cbdVar, new ccp(cbdVar, a2));
                    ccqVar.b.enable();
                }
            }
            if (z2) {
                cblVar.n();
            }
            cblVar.l();
        } catch (IllegalStateException e) {
            if (!z) {
                throw e;
            }
            avw.d("PreviewView", e.toString(), e);
        }
    }

    public final void c() {
        Rect rect;
        Display display;
        bcq bcqVar;
        biw.b();
        if (this.a != null) {
            if (this.d && (display = getDisplay()) != null && (bcqVar = this.i) != null) {
                cbx cbxVar = this.c;
                int c = bcqVar.c(display.getRotation());
                int rotation = display.getRotation();
                if (cbxVar.g) {
                    cbxVar.c = c;
                    cbxVar.e = rotation;
                }
            }
            this.a.g();
        }
        ccj ccjVar = this.h;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        biw.b();
        synchronized (ccjVar) {
            Matrix matrix = null;
            if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = ccjVar.d) != null) {
                cbx cbxVar2 = ccjVar.c;
                if (cbxVar2.f()) {
                    matrix = new Matrix();
                    cbxVar2.b(size, layoutDirection).invert(matrix);
                    Matrix matrix2 = new Matrix();
                    matrix2.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
                    matrix.postConcat(matrix2);
                }
                ccjVar.e = matrix;
            }
            ccjVar.e = null;
        }
        if (this.g != null) {
            biw.b();
            if (getWidth() != 0 && getHeight() != 0) {
                this.c.b(new Size(getWidth(), getHeight()), getLayoutDirection());
            }
            biw.b();
        }
    }

    public final void d(int i) {
        biw.b();
        this.k = i;
    }

    public final int f() {
        biw.b();
        return this.c.h;
    }

    public final void g() {
        cbl cblVar = this.g;
        if (cblVar == null) {
            avw.a("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
            return;
        }
        cdo cdoVar = new cdo(cdn.PREVIEW_VIEW);
        cdn cdnVar = cdoVar.a;
        Map map = cblVar.z;
        cdo e = cblVar.e();
        map.put(cdnVar, cdoVar);
        cdo e2 = cblVar.e();
        if (e2 == null || e2.equals(e)) {
            return;
        }
        cblVar.q();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager h = h();
        if (h != null) {
            h.registerDisplayListener(this.n, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.o);
        cci cciVar = this.a;
        if (cciVar != null) {
            cciVar.d();
        }
        b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.o);
        cci cciVar = this.a;
        if (cciVar != null) {
            cciVar.e();
        }
        cbl cblVar = this.g;
        if (cblVar != null) {
            cblVar.h();
        }
        DisplayManager h = h();
        if (h == null) {
            return;
        }
        h.unregisterDisplayListener(this.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00a2, code lost:
    
        if (r10 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
    
        if (java.lang.Math.abs(r9 - r2.l) > r2.a) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.PreviewView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.g != null) {
            MotionEvent motionEvent = this.m;
            float x = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.m;
            float y = motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f;
            cbl cblVar = this.g;
            ccj ccjVar = this.h;
            if (cblVar.r()) {
                boolean z = cblVar.s;
                PointF pointF = new PointF(x, y);
                awb b = ccjVar.b(pointF.x, pointF.y, 0.16666667f);
                awb b2 = ccjVar.b(pointF.x, pointF.y, 0.25f);
                auc aucVar = new auc(b);
                aucVar.a(b2, 2);
                long j = cblVar.A;
                if (j > 0) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    ksw.b(true, "autoCancelDuration must be at least 1");
                    aucVar.d = timeUnit.toMillis(j);
                } else {
                    aucVar.d = 0L;
                }
                aud audVar = new aud(aucVar);
                avw.a("CameraController", "Tap to focus started: " + x + ", " + y);
                cbk cbkVar = cblVar.t;
                if (cbkVar != null) {
                    cbkVar.c();
                }
                cblVar.u.j(new ccy(1));
                final cbk cbkVar2 = new cbk(cblVar.u);
                cblVar.t = cbkVar2;
                bkj.i(cblVar.m.b().l(audVar), cbkVar2, bjb.a());
                long millis = TimeUnit.NANOSECONDS.toMillis(cblVar.A);
                avw.a("CameraController", a.y(millis, "Tap to focus auto cancel duration: ", " ms"));
                if (millis > 0) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: cba
                        @Override // java.lang.Runnable
                        public final void run() {
                            cbk cbkVar3 = cbk.this;
                            synchronized (cbkVar3.c) {
                                if (cbkVar3.a) {
                                    return;
                                }
                                avw.a("CameraController", "Tap-to-focus reset.");
                                cbkVar3.b.j(new ccy(0));
                                cbkVar3.a = true;
                            }
                        }
                    }, millis);
                }
            } else {
                avw.f("CameraController", "Use cases not attached to camera.");
            }
        }
        this.m = null;
        return super.performClick();
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.k = 1;
        cbx cbxVar = new cbx();
        this.c = cbxVar;
        this.d = true;
        this.e = new llg(cch.IDLE);
        this.f = new AtomicReference();
        this.h = new ccj(cbxVar);
        this.n = new cce(this);
        this.o = new View.OnLayoutChangeListener() { // from class: cby
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                PreviewView previewView = PreviewView.this;
                previewView.c();
                previewView.b(true);
            }
        };
        this.j = new ccd(this);
        biw.b();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ccm.a, i, i2);
        kvo.o(this, context, ccm.a, attributeSet, obtainStyledAttributes, i, i2);
        try {
            int i3 = cbxVar.h;
            int i4 = i3 - 1;
            if (i3 != 0) {
                int integer = obtainStyledAttributes.getInteger(1, i4);
                int[] iArr = {1, 2, 3, 4, 5, 6};
                for (int i5 = 0; i5 < 6; i5++) {
                    int i6 = iArr[i5];
                    int i7 = i6 - 1;
                    if (i6 == 0) {
                        throw null;
                    }
                    if (i7 == integer) {
                        biw.b();
                        this.c.h = i6;
                        c();
                        b(false);
                        int integer2 = obtainStyledAttributes.getInteger(0, 0);
                        int[] iArr2 = {1, 2};
                        for (int i8 = 0; i8 < 2; i8++) {
                            int i9 = iArr2[i8];
                            int i10 = i9 - 1;
                            if (i9 == 0) {
                                throw null;
                            }
                            if (i10 == integer2) {
                                d(i9);
                                obtainStyledAttributes.recycle();
                                cbz cbzVar = new cbz(this);
                                context.getClass();
                                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                                this.l = new cdm(context, scaledTouchSlop + scaledTouchSlop, cbzVar);
                                if (getBackground() == null) {
                                    setBackgroundColor(getContext().getColor(R.color.black));
                                }
                                ccr ccrVar = new ccr(context);
                                this.b = ccrVar;
                                ccrVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                                return;
                            }
                        }
                        throw new IllegalArgumentException(a.h(integer2, "Unknown implementation mode id "));
                    }
                }
                throw new IllegalArgumentException(a.h(integer, "Unknown scale type id "));
            }
            throw null;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
