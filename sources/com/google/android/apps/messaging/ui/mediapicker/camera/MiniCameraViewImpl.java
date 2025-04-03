package com.google.android.apps.messaging.ui.mediapicker.camera;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupMenu;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AspectRatioLayout;
import com.google.android.apps.messaging.ui.mediapicker.camera.MiniCameraViewImpl;
import defpackage.akzt;
import defpackage.alci;
import defpackage.ctid;
import defpackage.ctud;
import defpackage.cxqk;
import defpackage.dcgt;
import defpackage.dcoz;
import defpackage.dcpv;
import defpackage.dcqf;
import defpackage.ddzb;
import defpackage.ehdr;
import defpackage.elay;
import defpackage.elbx;
import defpackage.entd;
import defpackage.errl;
import defpackage.ffbr;
import defpackage.ktw;
import defpackage.ljn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MiniCameraViewImpl extends dcpv implements dcqf {
    public static final entd b = entd.c("BugleCamera");
    public int A;
    public boolean B;
    public final boolean C;
    public dcgt D;
    private View E;
    private View F;
    private int G;
    private int H;
    private int I;
    private ValueAnimator J;
    public ctud c;
    public alci d;
    public dcoz e;
    public errl f;
    public cxqk g;
    public ddzb h;
    public elbx i;
    public ffbr j;
    public ffbr k;
    public final WindowManager l;
    public CameraTextureView m;
    public View n;
    public View o;
    public View p;
    public View q;
    public ImageView r;
    public View s;
    public GradientDrawable t;
    public int u;
    public int v;
    public int w;
    public float x;
    public boolean y;
    public int z;

    public MiniCameraViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = Alert.DURATION_SHOW_INDEFINITELY;
        this.l = (WindowManager) context.getSystemService("window");
        this.C = true;
    }

    public static int f(int i, int i2, float f) {
        return (int) (i + ((i2 - i) * f));
    }

    private final void j(boolean z) {
        this.E.setVisibility(true != z ? 0 : 8);
        this.F.setVisibility(true != z ? 8 : 0);
        final View view = z ? this.F : this.E;
        View findViewById = view.findViewById(R.id.switch_camera_button);
        this.n = findViewById;
        findViewById.setOnClickListener(new elay(this.i, "MiniCameraView switchCameraButton onClick", new View.OnClickListener() { // from class: dcqj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                final MiniCameraViewImpl miniCameraViewImpl = MiniCameraViewImpl.this;
                miniCameraViewImpl.e.q();
                if (!miniCameraViewImpl.y) {
                    miniCameraViewImpl.n.animate().rotationBy(-180.0f).setInterpolator(new ljm()).withStartAction(new Runnable() { // from class: dcqg
                        @Override // java.lang.Runnable
                        public final void run() {
                            MiniCameraViewImpl.this.y = true;
                        }
                    }).withEndAction(new Runnable() { // from class: dcqm
                        @Override // java.lang.Runnable
                        public final void run() {
                            MiniCameraViewImpl.this.y = false;
                        }
                    });
                }
                miniCameraViewImpl.n.setContentDescription(miniCameraViewImpl.getResources().getString(true != miniCameraViewImpl.e.v() ? R.string.camera_front_switch_button : R.string.camera_back_switch_button));
            }
        }));
        View findViewById2 = view.findViewById(R.id.fullscreen_camera_button);
        this.o = findViewById2;
        findViewById2.setOnClickListener(new elay(this.i, "MiniCameraView fullscreenCameraButton onClick", new View.OnClickListener() { // from class: dcqk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                boolean booleanValue = ((Boolean) dcqf.sF.e()).booleanValue();
                MiniCameraViewImpl miniCameraViewImpl = MiniCameraViewImpl.this;
                if (booleanValue) {
                    miniCameraViewImpl.g(miniCameraViewImpl.o);
                } else {
                    miniCameraViewImpl.D.b();
                }
            }
        }));
        View findViewById3 = view.findViewById(R.id.shutter_button);
        this.p = findViewById3;
        findViewById3.setOnClickListener(new elay(this.i, "MiniCameraView shutterButton onClick", new View.OnClickListener() { // from class: dcql
            /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
            
                if (r1 != false) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
            
                r2 = 1.0f / r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
            
                if (r4 != false) goto L28;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r8) {
                /*
                    r7 = this;
                    com.google.android.apps.messaging.ui.mediapicker.camera.MiniCameraViewImpl r8 = com.google.android.apps.messaging.ui.mediapicker.camera.MiniCameraViewImpl.this
                    android.view.View r0 = r8.p
                    r1 = 0
                    r0.setEnabled(r1)
                    android.view.View r0 = r2
                    int r2 = r0.getHeight()
                    com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView r3 = r8.m
                    int r3 = r3.getHeight()
                    if (r2 >= r3) goto L22
                    int r2 = r0.getHeight()
                    float r2 = (float) r2
                    com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView r3 = r8.m
                    int r3 = r3.getHeight()
                    goto L2d
                L22:
                    com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView r2 = r8.m
                    int r2 = r2.getWidth()
                    float r2 = (float) r2
                    int r3 = r0.getWidth()
                L2d:
                    float r3 = (float) r3
                    float r2 = r2 / r3
                    dcoz r3 = r8.e
                    int r3 = r3.n
                    int r3 = r3 % 180
                    r4 = 1
                    if (r3 == 0) goto L3a
                    r3 = r4
                    goto L3b
                L3a:
                    r3 = r1
                L3b:
                    android.view.WindowManager r5 = r8.l
                    if (r5 == 0) goto L4d
                    android.view.Display r5 = r5.getDefaultDisplay()
                    int r5 = r5.getRotation()
                    int r5 = r5 % 180
                    if (r5 == 0) goto L4d
                    r5 = r4
                    goto L4e
                L4d:
                    r5 = r1
                L4e:
                    int r6 = r0.getWidth()
                    int r0 = r0.getHeight()
                    if (r6 <= r0) goto L59
                    r1 = r4
                L59:
                    r0 = 1065353216(0x3f800000, float:1.0)
                    if (r3 != 0) goto L62
                    if (r5 == 0) goto L62
                    if (r1 == 0) goto L69
                    goto L63
                L62:
                    r4 = r1
                L63:
                    if (r3 == 0) goto L6b
                    if (r5 != 0) goto L6b
                    if (r4 == 0) goto L6b
                L69:
                    float r2 = r0 / r2
                L6b:
                    float r1 = r0 - r2
                    float r1 = java.lang.Math.abs(r1)
                    r3 = 1008981770(0x3c23d70a, float:0.01)
                    int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r1 >= 0) goto L79
                    goto L7a
                L79:
                    r0 = r2
                L7a:
                    dcoz r1 = r8.e
                    elfl r0 = r1.d(r0)
                    csvw r1 = new csvw
                    dcqp r2 = new dcqp
                    r2.<init>()
                    dcqq r3 = new dcqq
                    r3.<init>()
                    r1.<init>(r2, r3)
                    errl r8 = r8.f
                    defpackage.elfr.l(r0, r1, r8)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dcql.onClick(android.view.View):void");
            }
        }));
    }

    private final void k(int i) {
        ValueAnimator ofFloat;
        int i2 = this.z + this.G;
        this.a = i2 == i;
        float f = i2;
        this.J.setCurrentPlayTime((int) (Math.min(1.0f, (1.0f - (i / f)) / (1.0f - (this.u / f))) * this.J.getDuration()));
        int i3 = this.u;
        if (i >= i3 || this.I < i3) {
            if (i >= i3 && this.I < i3) {
                ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ((akzt) this.k.b()).c("Bugle.Ui.MediaPicker.Camera.MiniCamera.View.Expanded.Count");
            }
            this.I = i;
        }
        ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ((akzt) this.k.b()).c("Bugle.Ui.MediaPicker.Camera.MiniCamera.View.Collapsed.Count");
        ofFloat.setInterpolator(new ljn());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dcqi
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MiniCameraViewImpl miniCameraViewImpl = MiniCameraViewImpl.this;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) miniCameraViewImpl.getLayoutParams();
                layoutParams.height = floatValue == 0.0f ? -1 : MiniCameraViewImpl.f(miniCameraViewImpl.A, miniCameraViewImpl.u, floatValue);
                miniCameraViewImpl.setLayoutParams(layoutParams);
                miniCameraViewImpl.t.setCornerRadius(MiniCameraViewImpl.f(miniCameraViewImpl.v, miniCameraViewImpl.u / 2, floatValue));
                miniCameraViewImpl.r.setVisibility(floatValue == 0.0f ? 4 : 0);
                miniCameraViewImpl.r.setAlpha(floatValue);
                miniCameraViewImpl.setTranslationZ(miniCameraViewImpl.x * floatValue);
            }
        });
        ofFloat.setDuration(100L);
        ofFloat.start();
        this.I = i;
    }

    @Override // defpackage.dcqf
    public final void b() {
        this.e.m(false);
        this.m.e();
    }

    @Override // defpackage.dcqf
    public final void c(int i, int i2, int i3) {
        if (i3 == this.I) {
            return;
        }
        this.z = i;
        this.A = i2;
        k(i3);
    }

    @Override // defpackage.dcqf
    public final void d(Configuration configuration) {
        j(configuration.orientation == 2);
        h();
        k(this.I);
        this.e.i();
    }

    @Override // defpackage.dcqf
    public final void e(dcgt dcgtVar) {
        this.D = dcgtVar;
    }

    public final void g(View view) {
        PopupMenu popupMenu = new PopupMenu(getContext(), view);
        popupMenu.inflate(R.menu.device_camera_menu);
        popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() { // from class: dcqn
            @Override // android.widget.PopupMenu.OnDismissListener
            public final void onDismiss(PopupMenu popupMenu2) {
                ((alcw) MiniCameraViewImpl.this.j.b()).b(2);
            }
        });
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: dcqo
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                MiniCameraViewImpl miniCameraViewImpl = MiniCameraViewImpl.this;
                if (itemId == R.id.take_photo) {
                    ((alcw) miniCameraViewImpl.j.b()).b(3);
                    miniCameraViewImpl.D.a.f.o();
                    return true;
                }
                if (itemId != R.id.record_video) {
                    return false;
                }
                ((alcw) miniCameraViewImpl.j.b()).b(4);
                miniCameraViewImpl.D.a.f.p();
                return true;
            }
        });
        Menu menu = popupMenu.getMenu();
        ColorStateList valueOf = ColorStateList.valueOf(ehdr.b(this, R.attr.colorOnActionBar));
        if (valueOf != null) {
            for (int i = 0; i < menu.size(); i++) {
                ktw.b(menu.getItem(i), valueOf);
            }
            if (ctid.c) {
                popupMenu.setForceShowIcon(true);
            }
        }
        popupMenu.show();
    }

    public final void h() {
        boolean e = this.c.e();
        this.B = e;
        int i = 4;
        this.s.setVisibility(true != e ? 0 : 4);
        this.m.setVisibility(true != this.B ? 4 : 0);
        this.n.setVisibility((!this.B || i()) ? 4 : 0);
        this.o.setVisibility((this.B && !i() && this.C) ? 0 : 4);
        View view = this.p;
        if (this.B && !i()) {
            i = 0;
        }
        view.setVisibility(i);
        this.t.setColor(this.B ? this.H : 0);
        this.r.setColorFilter(this.B ? getContext().getColor(R.color.google_white) : ehdr.d(getContext(), R.attr.colorOnSurfaceVariant, "MiniCameraView"));
    }

    public final boolean i() {
        return this.r.getVisibility() == 0;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dcqs
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MiniCameraViewImpl miniCameraViewImpl = MiniCameraViewImpl.this;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) miniCameraViewImpl.getLayoutParams();
                int i = miniCameraViewImpl.z;
                int i2 = miniCameraViewImpl.w;
                layoutParams.width = MiniCameraViewImpl.f(i + i2 + i2, miniCameraViewImpl.u, floatValue);
                miniCameraViewImpl.setLayoutParams(layoutParams);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) miniCameraViewImpl.m.getLayoutParams();
                layoutParams2.width = floatValue == 0.0f ? -2 : miniCameraViewImpl.z;
                layoutParams2.height = floatValue != 0.0f ? (int) (miniCameraViewImpl.z * miniCameraViewImpl.gG()) : -2;
                miniCameraViewImpl.m.setLayoutParams(layoutParams2);
                float min = Math.min(1.0f, floatValue / 0.625f);
                float f = 1.0f - min;
                int i3 = min == 1.0f ? 4 : 0;
                if (!miniCameraViewImpl.B) {
                    miniCameraViewImpl.s.setAlpha(f);
                    miniCameraViewImpl.s.setVisibility(i3);
                    return;
                }
                miniCameraViewImpl.n.setAlpha(f);
                miniCameraViewImpl.n.setVisibility(i3);
                miniCameraViewImpl.o.setAlpha(f);
                miniCameraViewImpl.o.setVisibility((miniCameraViewImpl.C && i3 == 0) ? 0 : 4);
                miniCameraViewImpl.p.setAlpha(f);
                miniCameraViewImpl.p.setVisibility(i3);
                miniCameraViewImpl.q.setAlpha(0.8f * min);
                miniCameraViewImpl.q.setVisibility(min == 0.0f ? 4 : 0);
            }
        });
        this.J = ofFloat;
        this.E = findViewById(R.id.buttons_portrait);
        this.F = findViewById(R.id.buttons_landscape);
        ImageView imageView = (ImageView) findViewById(R.id.collapsed_fullscreen_camera_button);
        this.r = imageView;
        imageView.setOnClickListener(new elay(this.i, "MiniCameraView collapsedFullscreenCameraButton onClick", this.g.a(new View.OnClickListener() { // from class: dcqt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean booleanValue = ((Boolean) dcqf.sF.e()).booleanValue();
                final MiniCameraViewImpl miniCameraViewImpl = MiniCameraViewImpl.this;
                if (booleanValue) {
                    miniCameraViewImpl.g(miniCameraViewImpl.r);
                } else if (miniCameraViewImpl.c.e()) {
                    miniCameraViewImpl.D.b();
                } else {
                    miniCameraViewImpl.D.a(new Runnable() { // from class: dcqh
                        @Override // java.lang.Runnable
                        public final void run() {
                            MiniCameraViewImpl miniCameraViewImpl2 = MiniCameraViewImpl.this;
                            miniCameraViewImpl2.h();
                            miniCameraViewImpl2.D.b();
                        }
                    });
                }
            }
        })));
        this.q = findViewById(R.id.camera_scrim);
        View findViewById = findViewById(R.id.camera_texture_background);
        findViewById.setClipToOutline(true);
        this.t = (GradientDrawable) findViewById.getBackground().mutate();
        View findViewById2 = findViewById(R.id.camera_permission_view);
        this.s = findViewById2;
        findViewById2.setClipToOutline(true);
        this.s.setOnClickListener(new elay(this.i, "MiniCameraView cameraPermissionView onClick", new View.OnClickListener() { // from class: dcqu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final MiniCameraViewImpl miniCameraViewImpl = MiniCameraViewImpl.this;
                miniCameraViewImpl.D.a(new Runnable() { // from class: dcqr
                    @Override // java.lang.Runnable
                    public final void run() {
                        MiniCameraViewImpl.this.h();
                    }
                });
            }
        }));
        CameraTextureView cameraTextureView = (CameraTextureView) findViewById(R.id.camera_texture_view);
        this.m = cameraTextureView;
        cameraTextureView.a(4, 3);
        this.m.e();
        this.u = getResources().getDimensionPixelSize(R.dimen.camera_gallery_camera_item_collapsed_size);
        this.v = getResources().getDimensionPixelSize(R.dimen.c2o_content_item_corner_radius);
        this.G = getResources().getDimensionPixelSize(R.dimen.camera_gallery_placeholder_start_margin);
        this.w = getResources().getDimensionPixelSize(R.dimen.camera_gallery_camera_item_horizontal_margin);
        this.x = getResources().getDimension(R.dimen.category_toggle_elevation);
        this.H = getContext().getColor(R.color.google_black);
        j(getResources().getConfiguration().orientation == 2);
        h();
    }

    @Override // defpackage.dcqf
    public final AspectRatioLayout a() {
        return this;
    }
}
