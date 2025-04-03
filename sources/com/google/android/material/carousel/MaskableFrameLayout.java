package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import defpackage.egyv;
import defpackage.ehct;
import defpackage.ehov;
import defpackage.ehow;
import defpackage.ehph;
import defpackage.ehpi;
import defpackage.ehpk;
import defpackage.ehpm;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class MaskableFrameLayout extends FrameLayout implements ehct, ehph {
    private float a;
    private final RectF b;
    private final Rect c;
    private ehow d;
    private final ehpi e;
    private Boolean f;
    private View.OnHoverListener g;
    private boolean h;

    public MaskableFrameLayout(Context context) {
        this(context, null);
    }

    @Override // defpackage.ehct
    public final void a(RectF rectF) {
        this.b.set(rectF);
        ehpi ehpiVar = this.e;
        ehpiVar.c = this.b;
        ehpiVar.c();
        ehpiVar.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        ehpi ehpiVar = this.e;
        if (!ehpiVar.d() || ehpiVar.d.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(ehpiVar.d);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // defpackage.ehph
    public final void fy(ehow ehowVar) {
        ehow e = ehowVar.e(new ehov() { // from class: ehcu
            @Override // defpackage.ehov
            public final ehoh a(ehoh ehohVar) {
                return ehohVar instanceof ehoe ? new ehog(((ehoe) ehohVar).a) : ehohVar;
            }
        });
        this.d = e;
        ehpi ehpiVar = this.e;
        ehpiVar.b = e;
        ehpiVar.c();
        ehpiVar.a(this);
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        rect.set((int) this.b.left, (int) this.b.top, (int) this.b.right, (int) this.b.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f;
        if (bool != null) {
            this.e.b(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.f = Boolean.valueOf(this.e.a);
        this.e.b(this, true);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (!this.b.isEmpty()) {
            if (action != 9 && action != 10) {
                if (action == 7) {
                    action = 7;
                }
            }
            if (!this.b.contains(motionEvent.getX(), motionEvent.getY())) {
                if (this.h && this.g != null) {
                    motionEvent.setAction(10);
                    this.g.onHover(this, motionEvent);
                }
                this.h = false;
                return false;
            }
        }
        if (this.g != null) {
            if (!this.h && action == 7) {
                motionEvent.setAction(9);
                this.h = true;
                action = 7;
            }
            if (action == 7 || action == 9) {
                this.h = true;
            }
            this.g.onHover(this, motionEvent);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.getBoundsInScreen(this.c);
        if (getX() > 0.0f) {
            this.c.left = (int) (r0.left + this.b.left);
        }
        if (getY() > 0.0f) {
            this.c.top = (int) (r0.top + this.b.top);
        }
        Rect rect = this.c;
        rect.right = rect.left + Math.round(this.b.width());
        Rect rect2 = this.c;
        rect2.bottom = rect2.top + Math.round(this.b.height());
        accessibilityNodeInfo.setBoundsInScreen(this.c);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.b.isEmpty()) {
            if (!this.b.contains(motionEvent.getX(), motionEvent.getY())) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.a;
        if (f == -1.0f || f == -1.0f) {
            return;
        }
        float a = egyv.a(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.a);
        a(new RectF(a, 0.0f, getWidth() - a, getHeight()));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.b.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setOnHoverListener(View.OnHoverListener onHoverListener) {
        this.g = onHoverListener;
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ehpi ehpkVar;
        this.a = -1.0f;
        this.b = new RectF();
        this.c = new Rect();
        if (Build.VERSION.SDK_INT >= 33) {
            ehpkVar = new ehpm(this);
        } else {
            ehpkVar = new ehpk(this);
        }
        this.e = ehpkVar;
        this.f = null;
        this.h = false;
        fy(new ehow(ehow.h(context, attributeSet, i, 0)));
    }
}
