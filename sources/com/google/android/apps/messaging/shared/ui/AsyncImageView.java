package com.google.android.apps.messaging.shared.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequenceDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import com.google.android.apps.messaging.R;
import defpackage.bcpt;
import defpackage.cbat;
import defpackage.cbbb;
import defpackage.cbbg;
import defpackage.cbbi;
import defpackage.cbbj;
import defpackage.cbbk;
import defpackage.cbbo;
import defpackage.cbbu;
import defpackage.cbce;
import defpackage.crhj;
import defpackage.crhk;
import defpackage.crht;
import defpackage.crhw;
import defpackage.crib;
import defpackage.crjy;
import defpackage.cslq;
import defpackage.csmj;
import defpackage.ekyo;
import defpackage.elav;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public class AsyncImageView extends crht {
    private static final enru h = enru.c("com/google/android/apps/messaging/shared/ui/AsyncImageView");
    public final bcpt a;
    public cbbk b;
    public cbbi c;
    public crhk d;
    public csmj e;
    public cbbu f;
    public ekyo g;
    private final boolean i;
    private final boolean j;
    private final Drawable k;
    private final Runnable l;
    private boolean m;
    private final int n;
    private int o;
    private boolean p;

    public AsyncImageView(Context context) {
        super(context);
        this.l = new crhj(this);
        this.m = false;
        this.a = new bcpt();
        this.k = null;
        this.i = true;
        this.j = false;
        this.n = 0;
        this.o = 0;
    }

    private final void h() {
        this.m = false;
        invalidate();
    }

    @Override // com.google.android.apps.messaging.shared.ui.RoundedImageView
    protected final void a() {
        Throwable th;
        if (this.m || !this.a.g() || getDrawable() == null) {
            return;
        }
        this.m = true;
        cbbo d = ((cbat) this.a.a()).d();
        if (d instanceof cbce) {
            cbbk cbbkVar = this.b;
            if ((cbbkVar instanceof cbbg) || (cbbkVar instanceof cbbb) || (th = ((cbce) d).m) == null) {
                return;
            }
            int dimension = (int) getResources().getDimension(R.dimen.async_image_view_slop);
            boolean z = getMeasuredWidth() > 0 && getDrawable().getIntrinsicWidth() > getMeasuredWidth() + dimension;
            if ((getMeasuredHeight() <= 0 || getDrawable().getIntrinsicHeight() <= getMeasuredHeight() + dimension) && !z) {
                return;
            }
            ensk e = h.e();
            e.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) ((enrr) e).g(th)).h("com/google/android/apps/messaging/shared/ui/AsyncImageView", "logIfTooLarge", 388, "AsyncImageView.java")).K("loaded image at %dx%d instead of %dx%d", Integer.valueOf(getDrawable().getIntrinsicWidth()), Integer.valueOf(getDrawable().getIntrinsicHeight()), Integer.valueOf(getMeasuredWidth()), Integer.valueOf(getMeasuredHeight()));
        }
    }

    public final void b() {
        Drawable drawable = getDrawable();
        if (drawable instanceof FrameSequenceDrawable) {
            FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) drawable;
            frameSequenceDrawable.stop();
            frameSequenceDrawable.destroy();
        }
        cbbk cbbkVar = this.b;
        if (cbbkVar != null) {
            cbbkVar.q();
            this.b = null;
        }
        setImageDrawable(null);
        setBackground(null);
    }

    public final void c(cbbk cbbkVar, boolean z) {
        b();
        cslq.a.removeCallbacks(this.l);
        if (cbbkVar == null) {
            h();
            return;
        }
        try {
            Drawable f = cbbkVar.f(getResources());
            this.b = cbbkVar;
            cbbkVar.p();
            setImageDrawable(f);
            if (f instanceof FrameSequenceDrawable) {
                ((FrameSequenceDrawable) f).start();
            }
            if (getVisibility() == 0 && !z && !this.p) {
                if (this.j) {
                    setVisibility(4);
                    Interpolator interpolator = csmj.b;
                    if (csmj.o(this, 0, null)) {
                        csmj.l(this, 0, 100L, interpolator, null, new crib(getContext()));
                    }
                } else if (this.i) {
                    setAlpha(0.0f);
                    animate().alpha(1.0f).start();
                }
                h();
            }
            h();
        } catch (cbbj e) {
            ensk i = h.i();
            i.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/ui/AsyncImageView", "setImage", (char) 257, "AsyncImageView.java")).q("Set image attempted with unsupported image type.");
            h();
        }
    }

    public final void d(cbbi cbbiVar) {
        if (cbbiVar != null && this.a.g() && TextUtils.equals(((cbat) this.a.a()).f(), cbbiVar.g())) {
            return;
        }
        if (this.a.g()) {
            e();
        }
        crhk crhkVar = this.d;
        if (crhkVar != null) {
            crhkVar.c();
        }
        crhk crhkVar2 = new crhk(this);
        f();
        clearAnimation();
        setAlpha(1.0f);
        if (cbbiVar != null && !TextUtils.isEmpty(cbbiVar.g())) {
            if (!TextUtils.isEmpty(cbbiVar.g()) && this.k != null) {
                if (cbbiVar.e != -1 && cbbiVar.f != -1) {
                    int i = 0;
                    ColorDrawable colorDrawable = new ColorDrawable(0);
                    int i2 = cbbiVar.e;
                    int i3 = cbbiVar.f;
                    int i4 = crjy.a;
                    int intrinsicWidth = colorDrawable.getIntrinsicWidth();
                    int intrinsicHeight = colorDrawable.getIntrinsicHeight();
                    int i5 = (intrinsicWidth < 0 || intrinsicWidth > i2) ? 0 : (i2 - intrinsicWidth) / 2;
                    if (intrinsicHeight >= 0 && intrinsicHeight <= i3) {
                        i = (i3 - intrinsicHeight) / 2;
                    }
                    int i6 = i;
                    setImageDrawable(new crjy(colorDrawable, i5, i6, i5, i6, i2, i3));
                }
                setBackground(this.k);
            }
            cbat e = cbbiVar.e(getContext(), crhkVar2);
            this.a.c(e);
            this.f.d(e);
        }
        this.d = crhkVar2;
    }

    public final void e() {
        if (this.a.g()) {
            this.a.f();
        }
    }

    public final void f() {
        c(null, false);
    }

    public final void g() {
        this.p = true;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        cbbi cbbiVar;
        elav a = this.g.a("AsyncImageView#onAttachedToWindow");
        try {
            super.onAttachedToWindow();
            cslq.a.removeCallbacks(this.l);
            if (this.i) {
                setAlpha(1.0f);
            }
            if (!this.a.g() && (cbbiVar = this.c) != null) {
                d(cbbiVar);
            }
            this.c = null;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cslq.a.postDelayed(this.l, 100L);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.z = i;
        super.setBackgroundColor(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void setSelected(boolean z) {
        if (z != isSelected()) {
            float f = 1.0f;
            if (z && this.o == 0) {
                int i = this.n;
                if (i != 0) {
                    if (getWidth() <= 0) {
                        f = 0.86f;
                    } else {
                        float f2 = i;
                        f = (getWidth() - (f2 + f2)) / getWidth();
                    }
                }
                this.e.m(this, f);
                this.o = 1;
            } else if (!z) {
                this.e.m(this, 1.0f);
                this.o = 0;
            }
        }
        super.setSelected(z);
    }

    public AsyncImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = new crhj(this);
        this.m = false;
        this.a = new bcpt();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, crhw.a, 0, 0);
        this.i = obtainStyledAttributes.getBoolean(0, true);
        this.j = obtainStyledAttributes.getBoolean(2, false);
        this.k = obtainStyledAttributes.getDrawable(1);
        this.n = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.o = 0;
        obtainStyledAttributes.recycle();
    }
}
