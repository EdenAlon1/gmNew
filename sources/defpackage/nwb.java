package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.SubtitleView;
import com.google.android.apps.messaging.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nwb extends FrameLayout {
    public final AspectRatioFrameLayout a;
    public final View b;
    public final ImageView c;
    public final SubtitleView d;
    public final nva e;
    public final Handler f;
    public lro g;
    public boolean h;
    public boolean i;
    private final nwa j;
    private final View k;
    private final ImageView l;
    private final View m;
    private final TextView n;
    private final Class o;
    private final Method p;
    private final Object q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;

    public nwb(Context context) {
        super(context, null, 0);
        Class<?> cls;
        Object obj;
        Method method;
        nwa nwaVar = new nwa(this);
        this.j = nwaVar;
        this.f = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.a = null;
            this.b = null;
            this.k = null;
            this.c = null;
            this.l = null;
            this.d = null;
            this.m = null;
            this.n = null;
            this.e = null;
            this.o = null;
            this.p = null;
            this.q = null;
            ImageView imageView = new ImageView(context);
            int i = lvf.a;
            Resources resources = getResources();
            imageView.setImageDrawable(lvf.A(context, resources, R.drawable.exo_edit_mode_logo));
            imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            addView(imageView);
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.exo_player_view, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.a = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.b(0);
        }
        this.b = findViewById(R.id.exo_shutter);
        if (aspectRatioFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            SurfaceView surfaceView = new SurfaceView(context);
            if (lvf.a >= 34) {
                surfaceView.setSurfaceLifecycle(2);
            }
            this.k = surfaceView;
            surfaceView.setLayoutParams(layoutParams);
            surfaceView.setOnClickListener(nwaVar);
            surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(surfaceView, 0);
        } else {
            this.k = null;
        }
        int i2 = lvf.a;
        this.c = (ImageView) findViewById(R.id.exo_image);
        try {
            cls = Class.forName("androidx.media3.exoplayer.ExoPlayer");
            Class<?> cls2 = Class.forName("androidx.media3.exoplayer.image.ImageOutput");
            method = cls.getMethod("setImageOutput", cls2);
            obj = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: nvy
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method2, Object[] objArr) {
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    final nwb nwbVar = nwb.this;
                    final Bitmap bitmap = (Bitmap) objArr[1];
                    nwbVar.f.post(new Runnable() { // from class: nvz
                        @Override // java.lang.Runnable
                        public final void run() {
                            nwb nwbVar2 = nwb.this;
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(nwbVar2.getResources(), bitmap);
                            ImageView imageView2 = nwbVar2.c;
                            if (imageView2 != null) {
                                imageView2.setImageDrawable(bitmapDrawable);
                                nwbVar2.n();
                            }
                            if (nwbVar2.p()) {
                                return;
                            }
                            nwbVar2.f();
                            nwbVar2.a();
                        }
                    });
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            obj = null;
            method = null;
        }
        this.o = cls;
        this.p = method;
        this.q = obj;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.l = imageView2;
        this.r = imageView2 != null ? 1 : 0;
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.d = subtitleView;
        if (subtitleView != null) {
            subtitleView.b();
            subtitleView.c();
        }
        View findViewById = findViewById(R.id.exo_buffering);
        this.m = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.n = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        nva nvaVar = (nva) findViewById(R.id.exo_controller);
        View findViewById2 = findViewById(R.id.exo_controller_placeholder);
        if (nvaVar != null) {
            this.e = nvaVar;
        } else if (findViewById2 != null) {
            nva nvaVar2 = new nva(context);
            this.e = nvaVar2;
            nvaVar2.setId(R.id.exo_controller);
            nvaVar2.setLayoutParams(findViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById2.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById2);
            viewGroup.removeView(findViewById2);
            viewGroup.addView(nvaVar2, indexOfChild);
        } else {
            this.e = null;
        }
        nva nvaVar3 = this.e;
        this.s = nvaVar3 != null ? 5000 : 0;
        this.u = true;
        this.t = true;
        this.i = true;
        this.h = nvaVar3 != null;
        if (nvaVar3 != null) {
            nvx nvxVar = nvaVar3.a;
            int i3 = nvxVar.s;
            if (i3 != 3 && i3 != 2) {
                nvxVar.h();
                nvxVar.e();
            }
            nva nvaVar4 = this.e;
            nwa nwaVar2 = this.j;
            lti.f(nwaVar2);
            nvaVar4.b.add(nwaVar2);
        }
        setClickable(true);
        j();
    }

    protected static final void s(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.a(f);
        }
    }

    private final void t() {
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.l.setVisibility(4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0055, code lost:
    
        if (r3.Y() == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.q()
            if (r0 == 0) goto La
            boolean r0 = r6.i
            if (r0 != 0) goto L9f
        La:
            boolean r0 = r6.r()
            if (r0 == 0) goto L9f
            nva r0 = r6.e
            boolean r0 = r0.p()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L22
            nva r0 = r6.e
            int r0 = r0.H
            if (r0 > 0) goto L22
            r0 = r1
            goto L23
        L22:
            r0 = r2
        L23:
            lro r3 = r6.g
            if (r3 != 0) goto L29
        L27:
            r3 = r1
            goto L59
        L29:
            int r3 = r3.u()
            boolean r4 = r6.t
            if (r4 == 0) goto L58
            lro r4 = r6.g
            r5 = 17
            boolean r4 = r4.n(r5)
            if (r4 == 0) goto L47
            lro r4 = r6.g
            lru r4 = r4.I()
            boolean r4 = r4.q()
            if (r4 != 0) goto L58
        L47:
            if (r3 == r1) goto L27
            r4 = 4
            if (r3 == r4) goto L27
            lro r3 = r6.g
            defpackage.lti.f(r3)
            boolean r3 = r3.Y()
            if (r3 != 0) goto L58
            goto L27
        L58:
            r3 = r2
        L59:
            if (r7 != 0) goto L60
            if (r0 != 0) goto L60
            if (r3 == 0) goto L9f
            goto L61
        L60:
            r1 = r3
        L61:
            boolean r7 = r6.r()
            if (r7 != 0) goto L68
            goto L9f
        L68:
            nva r7 = r6.e
            if (r1 == 0) goto L6e
            r0 = r2
            goto L70
        L6e:
            int r0 = r6.s
        L70:
            r7.H = r0
            boolean r0 = r7.p()
            if (r0 == 0) goto L7d
            nvx r7 = r7.a
            r7.i()
        L7d:
            nva r7 = r6.e
            nvx r7 = r7.a
            nva r0 = r7.a
            boolean r0 = r0.q()
            if (r0 != 0) goto L9c
            nva r0 = r7.a
            r0.setVisibility(r2)
            nva r0 = r7.a
            r0.d()
            nva r0 = r7.a
            android.widget.ImageView r0 = r0.k
            if (r0 == 0) goto L9c
            r0.requestFocus()
        L9c:
            r7.l()
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwb.u(boolean):void");
    }

    private final boolean v(Drawable drawable) {
        if (this.l != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                s(this.a, intrinsicWidth / intrinsicHeight);
                this.l.setScaleType(scaleType);
                this.l.setImageDrawable(drawable);
                this.l.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final void a() {
        View view = this.b;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void b() {
        d();
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    public final void c() {
        nva nvaVar = this.e;
        if (nvaVar != null) {
            nvaVar.b();
        }
    }

    public final void d() {
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i = lvf.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        lro lroVar = this.g;
        if (lroVar != null && lroVar.n(16) && this.g.aa()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        if (z && r() && !this.e.p()) {
            u(true);
            return true;
        }
        if ((r() && this.e.o(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            u(true);
            return true;
        }
        if (!z || !r()) {
            return false;
        }
        u(true);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(lro lroVar) {
        lti.c(Looper.myLooper() == Looper.getMainLooper());
        lti.a(lroVar == null || ((mgl) lroVar).k == Looper.getMainLooper());
        lro lroVar2 = this.g;
        if (lroVar2 == lroVar) {
            return;
        }
        if (lroVar2 != null) {
            lroVar2.R(this.j);
            if (lroVar2.n(27)) {
                View view = this.k;
                if (view instanceof SurfaceView) {
                    lroVar2.O((SurfaceView) view);
                }
            }
            Class cls = this.o;
            if (cls != null && cls.isAssignableFrom(lroVar2.getClass())) {
                try {
                    Method method = this.p;
                    lti.f(method);
                    method.invoke(lroVar2, null);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        SubtitleView subtitleView = this.d;
        if (subtitleView != null) {
            subtitleView.a(null);
        }
        this.g = lroVar;
        if (r()) {
            this.e.c(lroVar);
        }
        i();
        l();
        m(true);
        if (lroVar == null) {
            c();
            return;
        }
        if (lroVar.n(27)) {
            View view2 = this.k;
            if (view2 instanceof SurfaceView) {
                lroVar.W((SurfaceView) view2);
            }
            if (lroVar.n(30)) {
                lsb K = lroVar.K();
                loop0: for (int i = 0; i < K.b.size(); i++) {
                    if (((lsa) K.b.get(i)).a() == 2) {
                        lsa lsaVar = (lsa) K.b.get(i);
                        for (int i2 = 0; i2 < lsaVar.c.length; i2++) {
                            if (!lsaVar.d(i2)) {
                            }
                        }
                    }
                }
            }
            h();
            break loop0;
        }
        if (this.d != null && lroVar.n(28)) {
            this.d.a(lroVar.M().b);
        }
        lroVar.N(this.j);
        Class cls2 = this.o;
        if (cls2 != null && cls2.isAssignableFrom(lroVar.getClass())) {
            try {
                Method method2 = this.p;
                lti.f(method2);
                Object obj = this.q;
                lti.f(obj);
                method2.invoke(lroVar, obj);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        u(false);
    }

    public final void f() {
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setVisibility(0);
            n();
        }
    }

    public final void g() {
        if (!r() || this.g == null) {
            return;
        }
        if (!this.e.p()) {
            u(true);
        } else if (this.u) {
            this.e.b();
        }
    }

    public final void h() {
        lro lroVar = this.g;
        lsl L = lroVar != null ? lroVar.L() : lsl.a;
        int i = L.b;
        int i2 = L.c;
        float f = 0.0f;
        if (i2 != 0 && i != 0) {
            f = (i * L.d) / i2;
        }
        s(this.a, f);
    }

    public final void i() {
        if (this.m != null) {
            lro lroVar = this.g;
            if (lroVar != null) {
                lroVar.u();
            }
            this.m.setVisibility(8);
        }
    }

    public final void j() {
        nva nvaVar = this.e;
        if (nvaVar == null || !this.h) {
            setContentDescription(null);
        } else if (nvaVar.p()) {
            setContentDescription(this.u ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void k() {
        if (q() && this.i) {
            c();
        } else {
            u(false);
        }
    }

    public final void l() {
        if (this.n != null) {
            lro lroVar = this.g;
            if (lroVar != null) {
                ((mgl) lroVar).ab();
            }
            this.n.setVisibility(8);
        }
    }

    public final void m(boolean z) {
        byte[] bArr;
        ImageView imageView;
        Drawable drawable;
        lro lroVar = this.g;
        boolean z2 = (lroVar == null || !lroVar.n(30) || lroVar.K().a()) ? false : true;
        if (!z2 || z) {
            t();
            a();
            b();
            if (!z2) {
                return;
            }
        }
        boolean p = p();
        boolean o = o();
        if (!p && !o) {
            a();
            b();
        }
        View view = this.b;
        boolean z3 = (view == null || view.getVisibility() != 4 || (imageView = this.c) == null || (drawable = imageView.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
        if (o && !p && z3) {
            a();
            f();
        } else if (p && !o && z3) {
            b();
        }
        if (!p && !o && this.r != 0) {
            lti.g(this.l);
            if (lroVar != null && lroVar.n(18) && (bArr = lroVar.F().g) != null) {
                if (v(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)))) {
                    return;
                }
            }
            if (v(null)) {
                return;
            }
        }
        t();
    }

    public final void n() {
        Drawable drawable;
        ImageView imageView = this.c;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        ImageView imageView2 = this.c;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (imageView2.getVisibility() == 0) {
            s(this.a, intrinsicWidth / intrinsicHeight);
        }
        this.c.setScaleType(scaleType);
    }

    public final boolean o() {
        lro lroVar = this.g;
        return lroVar != null && this.q != null && lroVar.n(30) && lroVar.K().b(4);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!r() || this.g == null) {
            return false;
        }
        u(true);
        return true;
    }

    public final boolean p() {
        lro lroVar = this.g;
        return lroVar != null && lroVar.n(30) && lroVar.K().b(2);
    }

    @Override // android.view.View
    public final boolean performClick() {
        g();
        return super.performClick();
    }

    public final boolean q() {
        lro lroVar = this.g;
        return lroVar != null && lroVar.n(16) && this.g.aa() && this.g.Y();
    }

    public final boolean r() {
        if (!this.h) {
            return false;
        }
        lti.g(this.e);
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.k;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }
}
