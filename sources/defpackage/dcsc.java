package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.messaging.ui.mediapicker.camera.carousel.CarouselRecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcsc extends wn {
    private static final enru n = enru.c("com/google/android/apps/messaging/ui/mediapicker/camera/carousel/CarouselSmoothScroller");
    public dcsb a;
    protected PointF d;
    private final float o;
    protected final LinearInterpolator b = new LinearInterpolator();
    protected final DecelerateInterpolator c = new DecelerateInterpolator();
    protected int e = 0;
    protected int f = 0;

    public dcsc(Context context, float f) {
        this.o = f / context.getResources().getDisplayMetrics().densityDpi;
    }

    public static final int b(int i, int i2, int i3, int i4, int i5) {
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

    private static int c(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    protected final int a(int i) {
        return (int) Math.ceil(Math.abs(i) * this.o);
    }

    @Override // defpackage.wn
    protected final void g() {
        this.f = 0;
        this.e = 0;
        this.d = null;
        Object obj = this.a;
        if (obj != null) {
            CarouselRecyclerView carouselRecyclerView = (CarouselRecyclerView) obj;
            int i = carouselRecyclerView.ad;
            if (i != -1 && carouselRecyclerView.aP(i) != -1) {
                ((RecyclerView) obj).au(carouselRecyclerView.ad);
            }
            int i2 = carouselRecyclerView.ae;
            if (i2 == -1 || carouselRecyclerView.aP(i2) == -1) {
                return;
            }
            ((RecyclerView) obj).ak(carouselRecyclerView.ae);
        }
    }

    @Override // defpackage.wn
    protected final void i(int i, int i2, wl wlVar) {
        if (k() == 0) {
            o();
            return;
        }
        int c = c(this.e, i);
        this.e = c;
        int c2 = c(this.f, i2);
        this.f = c2;
        if (c == 0 && c2 == 0) {
            PointF m = m(this.g);
            if (m == null || (m.x == 0.0f && m.y == 0.0f)) {
                wlVar.a = this.g;
                o();
                return;
            }
            p(m);
            this.d = m;
            this.e = (int) (m.x * 10000.0f);
            this.f = (int) (m.y * 10000.0f);
            int a = a(10000);
            wlVar.b((int) (this.e * 1.2f), (int) (this.f * 1.2f), (int) (a * 1.2f), this.b);
        }
    }

    @Override // defpackage.wn
    protected final void j(View view, wl wlVar) {
        int i;
        PointF pointF = this.d;
        int i2 = 1;
        int i3 = 0;
        int i4 = (pointF == null || pointF.x == 0.0f) ? 0 : this.d.x > 0.0f ? 1 : -1;
        vx vxVar = this.i;
        if (vxVar == null || !vxVar.af()) {
            i = 0;
        } else {
            vy vyVar = (vy) view.getLayoutParams();
            i = b(vx.bI(view) - vyVar.leftMargin, vx.bJ(view) + vyVar.rightMargin, vxVar.aB(), vxVar.H - vxVar.aC(), i4);
        }
        PointF pointF2 = this.d;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i2 = 0;
        } else if (this.d.y <= 0.0f) {
            i2 = -1;
        }
        vx vxVar2 = this.i;
        if (vxVar2 != null && vxVar2.ag()) {
            vy vyVar2 = (vy) view.getLayoutParams();
            i3 = b(vx.bK(view) - vyVar2.topMargin, vx.bH(view) + vyVar2.bottomMargin, vxVar2.aE(), vxVar2.I - vxVar2.az(), i2);
        }
        int ceil = (int) Math.ceil(a((int) Math.hypot(i, i3)) / 0.3356d);
        if (ceil > 0) {
            wlVar.b(-i, -i3, ceil, this.c);
        }
    }

    @Override // defpackage.wn
    public final PointF m(int i) {
        Object obj = this.i;
        if (obj instanceof wm) {
            return ((wm) obj).Q(i);
        }
        ensk j = n.j();
        j.Y(ente.a, "LinearSmoothScroller");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/ui/mediapicker/camera/carousel/CarouselSmoothScroller", "computeScrollVectorForPosition", 353, "CarouselSmoothScroller.java")).t("You should override computeScrollVectorForPosition when the LayoutManager does not implement %s", wm.class.getCanonicalName());
        return null;
    }
}
