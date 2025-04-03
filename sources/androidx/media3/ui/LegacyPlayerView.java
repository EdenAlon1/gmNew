package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.lro;
import defpackage.lsl;
import defpackage.lti;
import defpackage.nuf;
import defpackage.nug;
import defpackage.nuh;
import java.util.Iterator;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class LegacyPlayerView extends FrameLayout {
    public final AspectRatioFrameLayout a;
    public final View b;
    public final SubtitleView c;
    public final nug d;
    public final FrameLayout e;
    public lro f;
    public boolean g;
    public nuf h;
    public boolean i;
    private final nuh j;
    private final View k;
    private final boolean l;
    private final ImageView m;
    private final View n;
    private final TextView o;
    private boolean p;
    private Drawable q;
    private int r;
    private boolean s;
    private int t;
    private boolean u;
    private boolean v;

    public LegacyPlayerView(Context context) {
        this(context, null);
    }

    protected static final void m(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.a(f);
        }
    }

    private final void n() {
        View view = this.b;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private final void o() {
        ImageView imageView = this.m;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.m.setVisibility(4);
        }
    }

    private final void p(boolean z) {
        if (!(k() && this.i) && l()) {
            boolean z2 = true;
            boolean z3 = false;
            if (this.d.o() && this.d.p <= 0) {
                z3 = true;
            }
            boolean s = s();
            if (z || z3) {
                z2 = s;
            } else if (!s) {
                return;
            }
            q(z2);
        }
    }

    private final void q(boolean z) {
        if (l()) {
            nug nugVar = this.d;
            nugVar.p = z ? 0 : this.t;
            if (nugVar.o()) {
                nugVar.c();
            }
            nug nugVar2 = this.d;
            if (!nugVar2.o()) {
                nugVar2.setVisibility(0);
                Iterator it = nugVar2.a.iterator();
                while (it.hasNext()) {
                    ((nuf) it.next()).E(nugVar2.getVisibility());
                }
                nugVar2.g();
                nugVar2.e();
                nugVar2.d();
            }
            nugVar2.c();
        }
    }

    private final boolean r(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                m(this.a, intrinsicWidth / intrinsicHeight);
                this.m.setImageDrawable(drawable);
                this.m.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private final boolean s() {
        lro lroVar = this.f;
        if (lroVar == null) {
            return true;
        }
        int u = lroVar.u();
        if (this.u) {
            return u == 1 || u == 4 || !this.f.Y();
        }
        return false;
    }

    public final void a() {
        nug nugVar = this.d;
        if (nugVar != null) {
            nugVar.b();
        }
    }

    public final void b(int i) {
        lti.g(this.d);
        this.t = i;
        if (this.d.o()) {
            q(s());
        }
    }

    public final void c(lro lroVar) {
        lti.c(Looper.myLooper() == Looper.getMainLooper());
        lti.a(lroVar.E() == Looper.getMainLooper());
        lro lroVar2 = this.f;
        if (lroVar2 == lroVar) {
            return;
        }
        if (lroVar2 != null) {
            lroVar2.R(this.j);
            if (lroVar2.n(27)) {
                View view = this.k;
                if (view instanceof TextureView) {
                    lroVar2.P((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    lroVar2.O((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.c;
        if (subtitleView != null) {
            subtitleView.a(null);
        }
        this.f = lroVar;
        if (l()) {
            this.d.f(lroVar);
        }
        f();
        i();
        j(true);
        if (lroVar.n(27)) {
            View view2 = this.k;
            if (view2 instanceof TextureView) {
                lroVar.X((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                lroVar.W((SurfaceView) view2);
            }
            e();
        }
        if (this.c != null && lroVar.n(28)) {
            this.c.a(lroVar.M().b);
        }
        lroVar.N(this.j);
        p(false);
    }

    public final void d() {
        if (!l() || this.f == null) {
            return;
        }
        if (!this.d.o()) {
            p(true);
        } else if (this.v) {
            this.d.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        lro lroVar = this.f;
        if (lroVar != null && lroVar.aa()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        if (z && l() && !this.d.o()) {
            p(true);
            return true;
        }
        if ((l() && this.d.n(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            p(true);
            return true;
        }
        if (!z || !l()) {
            return false;
        }
        p(true);
        return false;
    }

    public final void e() {
        lro lroVar = this.f;
        lsl L = lroVar != null ? lroVar.L() : lsl.a;
        int i = L.b;
        int i2 = L.c;
        m(this.a, true != this.l ? (i2 == 0 || i == 0) ? 0.0f : (i * L.d) / i2 : 0.0f);
    }

    public final void f() {
        int i;
        if (this.n != null) {
            lro lroVar = this.f;
            this.n.setVisibility(true != (lroVar != null && lroVar.u() == 2 && ((i = this.r) == 2 || (i == 1 && this.f.Y()))) ? 8 : 0);
        }
    }

    public final void g() {
        nug nugVar = this.d;
        if (nugVar == null || !this.g) {
            setContentDescription(null);
        } else if (nugVar.getVisibility() == 0) {
            setContentDescription(this.v ? getResources().getString(com.google.android.apps.messaging.R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(com.google.android.apps.messaging.R.string.exo_controls_show));
        }
    }

    public final void h() {
        if (k() && this.i) {
            a();
        } else {
            p(false);
        }
    }

    public final void i() {
        if (this.o != null) {
            lro lroVar = this.f;
            if (lroVar != null) {
                lroVar.ab();
            }
            this.o.setVisibility(8);
        }
    }

    public final void j(boolean z) {
        lro lroVar = this.f;
        if (lroVar == null || !lroVar.n(30) || lroVar.K().a()) {
            if (this.s) {
                return;
            }
            o();
            n();
            return;
        }
        if (z && !this.s) {
            n();
        }
        if (lroVar.K().b(2)) {
            o();
            return;
        }
        n();
        if (this.p) {
            lti.g(this.m);
            byte[] bArr = lroVar.F().g;
            if (bArr != null) {
                if (r(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)))) {
                    return;
                }
            }
            if (r(this.q)) {
                return;
            }
        }
        o();
    }

    public final boolean k() {
        lro lroVar = this.f;
        return lroVar != null && lroVar.aa() && this.f.Y();
    }

    public final boolean l() {
        if (!this.g) {
            return false;
        }
        lti.g(this.d);
        return true;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!l() || this.f == null) {
            return false;
        }
        p(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        d();
        return super.performClick();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.k;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public LegacyPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LegacyPlayerView(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.LegacyPlayerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
