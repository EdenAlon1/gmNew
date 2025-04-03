package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ug extends wn {
    protected PointF c;
    private final DisplayMetrics f;
    private float o;
    protected final LinearInterpolator a = new LinearInterpolator();
    protected final DecelerateInterpolator b = new DecelerateInterpolator();
    private boolean n = false;
    protected int d = 0;
    protected int e = 0;

    public ug(Context context) {
        this.f = context.getResources().getDisplayMetrics();
    }

    public static final int h(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            return i4 - i2;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    private static final int q(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    protected float a(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int b(View view, int i) {
        vx vxVar = this.i;
        if (vxVar == null || !vxVar.af()) {
            return 0;
        }
        vy vyVar = (vy) view.getLayoutParams();
        return h(vx.bI(view) - vyVar.leftMargin, vx.bJ(view) + vyVar.rightMargin, vxVar.aB(), vxVar.H - vxVar.aC(), i);
    }

    public int c(View view, int i) {
        vx vxVar = this.i;
        if (vxVar == null || !vxVar.ag()) {
            return 0;
        }
        vy vyVar = (vy) view.getLayoutParams();
        return h(vx.bK(view) - vyVar.topMargin, vx.bH(view) + vyVar.bottomMargin, vxVar.aE(), vxVar.I - vxVar.az(), i);
    }

    protected final int d(int i) {
        return (int) Math.ceil(e(i) / 0.3356d);
    }

    protected int e(int i) {
        float abs = Math.abs(i);
        if (!this.n) {
            this.o = a(this.f);
            this.n = true;
        }
        return (int) Math.ceil(abs * this.o);
    }

    protected int f() {
        PointF pointF = this.c;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.c.y <= 0.0f ? -1 : 1;
    }

    @Override // defpackage.wn
    protected final void g() {
        this.e = 0;
        this.d = 0;
        this.c = null;
    }

    @Override // defpackage.wn
    protected final void i(int i, int i2, wl wlVar) {
        if (k() == 0) {
            o();
            return;
        }
        int q = q(this.d, i);
        this.d = q;
        int q2 = q(this.e, i2);
        this.e = q2;
        if (q == 0 && q2 == 0) {
            PointF m = m(this.g);
            if (m == null || (m.x == 0.0f && m.y == 0.0f)) {
                wlVar.a = this.g;
                o();
                return;
            }
            p(m);
            this.c = m;
            this.d = (int) (m.x * 10000.0f);
            this.e = (int) (m.y * 10000.0f);
            int e = e(10000);
            wlVar.b((int) (this.d * 1.2f), (int) (this.e * 1.2f), (int) (e * 1.2f), this.a);
        }
    }

    @Override // defpackage.wn
    protected void j(View view, wl wlVar) {
        PointF pointF = this.c;
        int i = 0;
        if (pointF != null && pointF.x != 0.0f) {
            i = this.c.x > 0.0f ? 1 : -1;
        }
        int b = b(view, i);
        int c = c(view, f());
        int d = d((int) Math.sqrt((b * b) + (c * c)));
        if (d > 0) {
            wlVar.b(-b, -c, d, this.b);
        }
    }
}
