package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgm extends View implements iwu {
    public static Method a;
    public static Field b;
    public static boolean c;
    public static boolean d;
    private static final ffjm g = jgk.a;
    private static final ViewOutlineProvider h = new jgj();
    public final jfe e;
    public boolean f;
    private final AndroidComposeView i;
    private final jea j;
    private ffjm k;
    private ffix l;
    private boolean m;
    private Rect n;
    private ict o;
    private boolean p;
    private final ibu q;
    private final jex r;
    private long s;
    private boolean t;
    private int u;

    public jgm(AndroidComposeView androidComposeView, jea jeaVar, ffjm ffjmVar, ffix ffixVar) {
        super(androidComposeView.getContext());
        this.i = androidComposeView;
        this.j = jeaVar;
        this.k = ffjmVar;
        this.l = ffixVar;
        this.e = new jfe();
        this.q = new ibu();
        this.r = new jex(g);
        this.s = idr.a;
        this.t = true;
        setWillNotDraw(false);
        jeaVar.addView(this);
        View.generateViewId();
    }

    private final icv n() {
        if (!getClipToOutline() || this.e.d()) {
            return null;
        }
        return this.e.b();
    }

    private final void o() {
        Rect rect;
        if (this.m) {
            Rect rect2 = this.n;
            if (rect2 == null) {
                this.n = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.n;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void p(boolean z) {
        if (z != this.f) {
            this.f = z;
            this.i.H(this, z);
        }
    }

    private final void q() {
        setOutlineProvider(this.e.a() != null ? h : null);
    }

    @Override // defpackage.iwu
    public final long a(long j, boolean z) {
        return z ? this.r.b(this, j) : this.r.a(this, j);
    }

    @Override // defpackage.iwu
    public final void b() {
        p(false);
        this.i.K();
        this.k = null;
        this.l = null;
        this.i.R(this);
        this.j.removeViewInLayout(this);
    }

    @Override // defpackage.iwu
    public final void c(ibt ibtVar, iga igaVar) {
        boolean z = getElevation() > 0.0f;
        this.p = z;
        if (z) {
            ibtVar.i();
        }
        this.j.a(ibtVar, this, getDrawingTime());
        if (this.p) {
            ibtVar.c();
        }
    }

    @Override // defpackage.iwu
    public final void d(float[] fArr) {
        float[] g2 = this.r.g(this);
        if (g2 != null) {
            icm.d(fArr, g2);
        }
    }

    @Override // android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        boolean z;
        ibu ibuVar = this.q;
        iau iauVar = ibuVar.a;
        Canvas canvas2 = iauVar.a;
        iauVar.a = canvas;
        if (n() == null && canvas.isHardwareAccelerated()) {
            z = false;
        } else {
            iauVar.l();
            this.e.c(iauVar);
            z = true;
        }
        ffjm ffjmVar = this.k;
        if (ffjmVar != null) {
            ffjmVar.a(iauVar, null);
        }
        if (z) {
            iauVar.j();
        }
        ibuVar.a.a = canvas2;
        p(false);
    }

    @Override // defpackage.iwu
    public final void e(iah iahVar, boolean z) {
        if (z) {
            this.r.e(this, iahVar);
        } else {
            this.r.d(this, iahVar);
        }
    }

    @Override // defpackage.iwu
    public final void f(long j) {
        int a2 = kaa.a(j);
        if (a2 != getLeft()) {
            offsetLeftAndRight(a2 - getLeft());
            this.r.c();
        }
        int b2 = kaa.b(j);
        if (b2 != getTop()) {
            offsetTopAndBottom(b2 - getTop());
            this.r.c();
        }
    }

    @Override // defpackage.iwu
    public final void g(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (i2 == getWidth() && i == getHeight()) {
            return;
        }
        setPivotX(idr.a(this.s) * i2);
        setPivotY(idr.b(this.s) * i);
        q();
        layout(getLeft(), getTop(), getLeft() + i2, getTop() + i);
        o();
        this.r.c();
    }

    @Override // defpackage.iwu
    public final void h(ffjm ffjmVar, ffix ffixVar) {
        this.j.addView(this);
        this.r.f();
        this.m = false;
        this.p = false;
        this.s = idr.a;
        this.k = ffjmVar;
        this.l = ffixVar;
        p(false);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.t;
    }

    @Override // defpackage.iwu
    public final void i(float[] fArr) {
        icm.d(fArr, this.r.h(this));
    }

    @Override // android.view.View, defpackage.iwu
    public final void invalidate() {
        if (this.f) {
            return;
        }
        p(true);
        super.invalidate();
        this.i.invalidate();
    }

    @Override // defpackage.iwu
    public final void j() {
        if (!this.f || d) {
            return;
        }
        jgl.a(this);
        p(false);
    }

    @Override // defpackage.iwu
    public final void k(idd iddVar) {
        ffix ffixVar;
        int i = iddVar.a | this.u;
        if ((i & 4096) != 0) {
            long j = iddVar.n;
            this.s = j;
            setPivotX(idr.a(j) * getWidth());
            setPivotY(idr.b(this.s) * getHeight());
        }
        if ((i & 1) != 0) {
            setScaleX(iddVar.b);
        }
        if ((i & 2) != 0) {
            setScaleY(iddVar.c);
        }
        if ((i & 4) != 0) {
            setAlpha(iddVar.d);
        }
        if ((i & 8) != 0) {
            setTranslationX(iddVar.e);
        }
        if ((i & 16) != 0) {
            setTranslationY(iddVar.f);
        }
        if ((i & 32) != 0) {
            setElevation(iddVar.g);
        }
        if ((i & 1024) != 0) {
            setRotation(iddVar.l);
        }
        if ((i & 256) != 0) {
            setRotationX(iddVar.j);
        }
        if ((i & 512) != 0) {
            setRotationY(iddVar.k);
        }
        if ((i & 2048) != 0) {
            setCameraDistance(iddVar.m * getResources().getDisplayMetrics().densityDpi);
        }
        boolean z = false;
        boolean z2 = n() != null;
        boolean z3 = iddVar.p;
        boolean z4 = z3 && iddVar.o != idb.a;
        if ((i & 24576) != 0) {
            this.m = z3 && iddVar.o == idb.a;
            o();
            setClipToOutline(z4);
        }
        boolean f = this.e.f(iddVar.x, iddVar.d, z4, iddVar.g, iddVar.r);
        if (this.e.a) {
            q();
        }
        icv n = n();
        if (z2 != (n != null) || (n != null && f)) {
            invalidate();
        }
        if (!this.p && getElevation() > 0.0f && (ffixVar = this.l) != null) {
            ffixVar.invoke();
        }
        if ((i & 7963) != 0) {
            this.r.c();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            if ((i & 64) != 0) {
                setOutlineAmbientShadowColor(iby.b(iddVar.h));
            }
            if ((i & 128) != 0) {
                setOutlineSpotShadowColor(iby.b(iddVar.i));
            }
        }
        Paint paint = null;
        if (Build.VERSION.SDK_INT >= 31 && (131072 & i) != 0) {
            idc idcVar = iddVar.u;
            setRenderEffect(idcVar != null ? idcVar.b() : null);
        }
        boolean z5 = ((262144 & i) == 0 && (524288 & i) == 0) ? false : true;
        if ((i & 32768) == 0) {
            if (z5) {
                z5 = true;
            }
            this.u = iddVar.a;
        }
        int i2 = z5 ? 1 : iddVar.q;
        if (icc.b(i2, 1)) {
            if (z5) {
                ict ictVar = this.o;
                if (ictVar == null) {
                    ictVar = new iba();
                    this.o = ictVar;
                }
                ibx ibxVar = iddVar.v;
                ictVar.l(null);
                ictVar.j(iddVar.w);
                paint = ((iba) ictVar).a;
            }
            setLayerType(2, paint);
        } else {
            if (icc.b(i2, 2)) {
                setLayerType(0, null);
                this.t = z;
                this.u = iddVar.a;
            }
            setLayerType(0, null);
        }
        z = true;
        this.t = z;
        this.u = iddVar.a;
    }

    @Override // defpackage.iwu
    public final boolean l(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (this.m) {
            return intBitsToFloat >= 0.0f && intBitsToFloat < ((float) getWidth()) && intBitsToFloat2 >= 0.0f && intBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.e.e(j);
        }
        return true;
    }

    @Override // defpackage.iwu
    public final float[] m() {
        return this.r.h(this);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
