package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.animation.Animation;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcrr extends dcrj implements dcrf {
    private final Paint A;
    private final int B;
    private final int C;
    private final int D;
    private final RectF E;
    private final RectF F;
    private final Point G;
    private final Point H;
    private final int I;
    private final int J;
    private final int K;
    private final Point L;
    public volatile int g;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public dcrp p;
    public volatile boolean q;
    private final Point t;
    private final int u;
    private final int v;
    private final int w;
    private final List x;
    private final Paint y;
    private final Paint z;
    private final dcrq r = new dcrq(this);
    public final Runnable h = new dcrn(this);
    private final Animation.AnimationListener s = new dcro(this);
    private final Handler M = new dcrl();

    public dcrr(Context context) {
        g(false);
        this.x = new ArrayList();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.pie_radius_start);
        this.u = dimensionPixelSize;
        this.D = dimensionPixelSize - resources.getDimensionPixelSize(R.dimen.focus_radius_offset);
        this.v = resources.getDimensionPixelSize(R.dimen.pie_radius_increment);
        this.w = resources.getDimensionPixelSize(R.dimen.pie_touch_offset);
        this.t = new Point(0, 0);
        Paint paint = new Paint();
        this.y = paint;
        paint.setColor(Color.argb(PrivateKeyType.INVALID, 51, 181, 229));
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.z = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(Color.argb(BasePaymentResult.ERROR_REQUEST_FAILED, 250, 230, 128));
        Paint paint3 = new Paint();
        this.A = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-1);
        paint3.setStyle(Paint.Style.STROKE);
        this.B = -16711936;
        this.C = -65536;
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Point();
        this.H = new Point();
        this.I = resources.getDimensionPixelSize(R.dimen.focus_inner_offset);
        this.J = resources.getDimensionPixelSize(R.dimen.focus_outer_stroke);
        this.K = resources.getDimensionPixelSize(R.dimen.focus_inner_stroke);
        this.g = 0;
        ViewConfiguration.get(context).getScaledTouchSlop();
        this.L = new Point();
    }

    private static float n(double d) {
        return (float) (360.0d - ((d * 180.0d) / 3.141592653589793d));
    }

    private final void o() {
        this.q = true;
        this.a.removeCallbacks(this.h);
        dcrq dcrqVar = this.r;
        if (dcrqVar != null) {
            dcrqVar.cancel();
        }
        this.q = false;
        this.o = false;
        this.g = 0;
    }

    private static void p(int i, int i2, Point point) {
        double d = ((i % 360) * 6.283185307179586d) / 360.0d;
        double d2 = i2;
        point.x = (int) ((Math.cos(d) * d2) + 0.5d);
        point.y = (int) ((d2 * Math.sin(d)) + 0.5d);
    }

    private final void q(Canvas canvas, int i, Paint paint) {
        p(i, this.D - this.I, this.G);
        int i2 = this.D;
        int i3 = this.I;
        p(i, (i2 - i3) + (i3 / 3), this.H);
        canvas.drawLine(this.G.x + this.i, this.G.y + this.j, this.H.x + this.i, this.H.y + this.j, paint);
    }

    private final void r() {
        List list = this.x;
        float size = list.size();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw null;
        }
        int i = this.v;
        int i2 = this.u;
        float f = 1.8325958f / size;
        Point point = this.t;
        int i3 = (i + i2) - 2;
        RectF rectF = new RectF(point.x - i3, point.y - i3, point.x + i3, point.y + i3);
        int i4 = i2 + 2;
        RectF rectF2 = new RectF(point.x - i4, point.y - i4, point.x + i4, point.y + i4);
        Path path = new Path();
        float n = n(eobe.a) - 1.0f;
        float n2 = n(f) + 1.0f;
        path.arcTo(rectF, n, n2 - n, true);
        path.arcTo(rectF2, n2, n - n2);
        path.close();
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw null;
        }
    }

    private final void s(int i, int i2) {
        this.t.x = i;
        this.t.y = i2;
        this.a.removeCallbacks(this.h);
        this.r.cancel();
        this.r.reset();
        this.i = i;
        this.j = i2;
        this.m = 157;
        k(i, i2);
        this.o = false;
    }

    private final void t(long j, boolean z, float f, float f2) {
        g(true);
        this.r.reset();
        this.r.setDuration(j);
        dcrq dcrqVar = this.r;
        dcrqVar.a = f;
        dcrqVar.b = f2;
        dcrqVar.setAnimationListener(z ? this.s : null);
        this.a.startAnimation(this.r);
        h();
    }

    @Override // defpackage.dcrf
    public final void a() {
        if (this.g == 8) {
            return;
        }
        o();
        this.a.post(this.h);
    }

    @Override // defpackage.dcrf
    public final void b() {
        if (this.g == 8) {
            return;
        }
        o();
        this.n = 67;
        double random = Math.random() * 120.0d;
        t(600L, false, this.n, r2 + ((int) (random - 60.0d)));
        this.g = 1;
    }

    @Override // defpackage.dcrf
    public final void c(boolean z) {
        if (this.g == 1) {
            m(z, this.n);
            this.g = 2;
            this.o = true;
        }
    }

    @Override // defpackage.dcrj, defpackage.dcrt
    public final void e(int i, int i2, int i3, int i4) {
        this.b = i;
        this.d = i3;
        this.c = i2;
        this.e = i4;
        int i5 = (i3 - i) / 2;
        this.k = i5;
        int i6 = (i4 - i2) / 2;
        this.l = i6;
        this.i = i5;
        this.j = i6;
        k(i5, i6);
        if (this.f && this.g == 8) {
            s(this.k, this.l);
            r();
        }
    }

    @Override // defpackage.dcrj
    public final void f(Canvas canvas) {
        dcrp dcrpVar = this.p;
        float f = dcrpVar != null ? dcrpVar.a : 1.0f;
        int save = canvas.save();
        if (this.p != null) {
            float f2 = (f * 0.1f) + 0.9f;
            canvas.scale(f2, f2, this.t.x, this.t.y);
        }
        this.A.setStrokeWidth(this.J);
        canvas.drawCircle(this.i, this.j, this.D, this.A);
        if (this.g != 8) {
            int color = this.A.getColor();
            if (this.g == 2) {
                this.A.setColor(this.o ? this.B : this.C);
            }
            this.A.setStrokeWidth(this.K);
            q(canvas, this.m, this.A);
            q(canvas, this.m + 45, this.A);
            q(canvas, this.m + 180, this.A);
            q(canvas, this.m + 225, this.A);
            canvas.save();
            canvas.rotate(this.m, this.i, this.j);
            canvas.drawArc(this.F, 0.0f, 45.0f, false, this.A);
            canvas.drawArc(this.F, 180.0f, 45.0f, false, this.A);
            canvas.restore();
            this.A.setColor(color);
        }
        if (this.g == 2) {
            canvas.restoreToCount(save);
            return;
        }
        for (dcrk dcrkVar : this.x) {
            if (this.g == 8) {
                throw null;
            }
        }
        canvas.restoreToCount(save);
    }

    @Override // defpackage.dcrj, defpackage.dcrt
    public final boolean i(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        PointF pointF = new PointF();
        pointF.x = 1.5707964f;
        float f = x - this.t.x;
        double d = f;
        double d2 = this.t.y - y;
        pointF.y = (float) Math.hypot(d, d2);
        if (f != 0.0f) {
            pointF.x = (float) Math.atan2(d2, d);
            if (pointF.x < 0.0f) {
                pointF.x = (float) (pointF.x + 6.283185307179586d);
            }
        }
        pointF.y += this.w;
        if (actionMasked == 0) {
            this.L.x = (int) motionEvent.getX();
            this.L.y = (int) motionEvent.getY();
            s((int) x, (int) y);
            l(true);
            return true;
        }
        if (actionMasked == 1) {
            if (this.f) {
                l(false);
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.f) {
                l(false);
            }
        } else if (actionMasked == 2 && pointF.y >= this.u) {
            Iterator it = this.x.iterator();
            if (it.hasNext()) {
                throw null;
            }
            motionEvent.getX();
            int i = this.L.x;
            motionEvent.getX();
            int i2 = this.L.x;
            motionEvent.getY();
            int i3 = this.L.y;
            motionEvent.getY();
            int i4 = this.L.y;
        }
        return false;
    }

    public final int j() {
        int i = this.D;
        return i + i;
    }

    public final void k(int i, int i2) {
        int i3 = this.D;
        int i4 = i2 - i3;
        this.E.set(i - i3, i4, i + i3, i2 + i3);
        int i5 = this.D;
        int i6 = this.I;
        int i7 = (i2 + i5) - i6;
        this.F.set((i - i5) + i6, (i2 - i5) + i6, (i + i5) - i6, i7);
    }

    public final void l(boolean z) {
        if (z) {
            this.g = 8;
            Iterator it = this.x.iterator();
            if (it.hasNext()) {
                throw null;
            }
            r();
            dcrp dcrpVar = new dcrp();
            this.p = dcrpVar;
            dcrpVar.setDuration(200L);
            this.p.setAnimationListener(new dcrm(this));
            this.p.startNow();
            this.a.startAnimation(this.p);
        } else {
            this.g = 0;
        }
        g(z);
        this.M.sendEmptyMessage(!z ? 1 : 0);
    }

    public final void m(boolean z, float f) {
        t(100L, z, this.m, f);
    }
}
