package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehab extends Drawable implements ehiu {
    public final WeakReference a;
    public final ehae b;
    public final int c;
    private final ehop d;
    private final ehiv e;
    private final Rect f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private WeakReference l;
    private WeakReference m;

    public ehab(Context context, ehad ehadVar) {
        ehmu ehmuVar;
        WeakReference weakReference = new WeakReference(context);
        this.a = weakReference;
        ehiz.d(context);
        this.f = new Rect();
        ehiv ehivVar = new ehiv(this);
        this.e = ehivVar;
        ehivVar.a.setTextAlign(Paint.Align.CENTER);
        ehae ehaeVar = new ehae(context, ehadVar);
        this.b = ehaeVar;
        ehop ehopVar = new ehop(new ehow(ehow.b(context, o() ? ehaeVar.e() : ehaeVar.c(), o() ? ehaeVar.d() : ehaeVar.b())));
        this.d = ehopVar;
        m();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && ehivVar.f != (ehmuVar = new ehmu(context2, ehaeVar.b.d.intValue()))) {
            ehivVar.c(ehmuVar, context2);
            n();
            g();
            invalidateSelf();
        }
        if (a() != -2) {
            this.c = ((int) Math.pow(10.0d, a() - 1.0d)) - 1;
        } else {
            this.c = ehaeVar.b.m;
        }
        ehivVar.e();
        g();
        invalidateSelf();
        ehivVar.e();
        m();
        g();
        invalidateSelf();
        l();
        ColorStateList valueOf = ColorStateList.valueOf(ehaeVar.b.b.intValue());
        if (ehopVar.C() != valueOf) {
            ehopVar.O(valueOf);
            invalidateSelf();
        }
        n();
        WeakReference weakReference2 = this.l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.l.get();
            WeakReference weakReference3 = this.m;
            f(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        g();
        setVisible(ehaeVar.b.t.booleanValue(), false);
    }

    private final String j() {
        if (!i()) {
            if (!h()) {
                return null;
            }
            if (this.c == -2 || b() <= this.c) {
                return NumberFormat.getInstance(this.b.h()).format(b());
            }
            Context context = (Context) this.a.get();
            return context == null ? "" : String.format(this.b.h(), context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.c), "+");
        }
        String d = d();
        int a = a();
        if (a == -2 || d == null || d.length() <= a) {
            return d;
        }
        Context context2 = (Context) this.a.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), d.substring(0, a - 1), "…");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.ViewParent] */
    private final void k(View view, View view2) {
        float f;
        float f2;
        View view3;
        FrameLayout c = c();
        if (c == null) {
            float y = view.getY();
            f2 = view.getX();
            view3 = view.getParent();
            f = y;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            view3 = c;
        }
        while (view3 instanceof View) {
            if (view3 != view2) {
                ViewParent parent = view3.getParent();
                if ((parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren()) {
                    View view4 = view3;
                    f += view4.getY();
                    f2 += view4.getX();
                    view3 = view3.getParent();
                }
            }
            float f3 = (this.h - this.k) + f;
            float f4 = (this.g - this.j) + f2;
            View view5 = view3;
            float height = ((this.h + this.k) - view5.getHeight()) + f;
            float width = ((this.g + this.j) - view5.getWidth()) + f2;
            if (f3 < 0.0f) {
                this.h += Math.abs(f3);
            }
            if (f4 < 0.0f) {
                this.g += Math.abs(f4);
            }
            if (height > 0.0f) {
                this.h -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.g -= Math.abs(width);
                return;
            }
            return;
        }
    }

    private final void l() {
        this.e.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    private final void m() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        this.d.fy(new ehow(ehow.b(context, o() ? this.b.e() : this.b.c(), o() ? this.b.d() : this.b.b())));
        invalidateSelf();
    }

    private final void n() {
        this.e.a.setColor(this.b.b.c.intValue());
        invalidateSelf();
    }

    private final boolean o() {
        return i() || h();
    }

    public final int a() {
        return this.b.b.l;
    }

    public final int b() {
        if (this.b.i()) {
            return this.b.b.k;
        }
        return 0;
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final String d() {
        return this.b.b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String j;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.d.draw(canvas);
        if (!o() || (j = j()) == null) {
            return;
        }
        Rect rect = new Rect();
        this.e.a.getTextBounds(j, 0, j.length(), rect);
        float exactCenterY = this.h - rect.exactCenterY();
        canvas.drawText(j, this.g, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), this.e.a);
    }

    @Override // defpackage.ehiu
    public final void e() {
        invalidateSelf();
    }

    public final void f(View view, FrameLayout frameLayout) {
        this.l = new WeakReference(view);
        this.m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        g();
        invalidateSelf();
    }

    public final void g() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        Context context = (Context) this.a.get();
        WeakReference weakReference = this.l;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.m;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        float f11 = o() ? this.b.d : this.b.c;
        this.i = f11;
        if (f11 != -1.0f) {
            this.j = f11;
            this.k = f11;
        } else {
            this.j = Math.round((o() ? this.b.g : this.b.e) / 2.0f);
            this.k = Math.round((o() ? this.b.h : this.b.f) / 2.0f);
        }
        if (o()) {
            String j = j();
            this.j = Math.max(this.j, (this.e.a(j) / 2.0f) + this.b.b.u.intValue());
            float f12 = this.k;
            ehiv ehivVar = this.e;
            if (ehivVar.d) {
                ehivVar.b(j);
                f10 = ehivVar.c;
            } else {
                f10 = ehivVar.c;
            }
            float max = Math.max(f12, (f10 / 2.0f) + this.b.b.v.intValue());
            this.k = max;
            this.j = Math.max(this.j, max);
        }
        int intValue = this.b.b.x.intValue();
        if (o()) {
            intValue = this.b.b.z.intValue();
            Context context2 = (Context) this.a.get();
            if (context2 != null) {
                intValue = egyv.b(intValue, intValue - this.b.b.C.intValue(), egyv.a(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f));
            }
        }
        if (this.b.k == 0) {
            intValue -= Math.round(this.k);
        }
        int intValue2 = intValue + this.b.b.B.intValue();
        int a = this.b.a();
        if (a == 8388691 || a == 8388693) {
            this.h = rect2.bottom - intValue2;
        } else {
            this.h = rect2.top + intValue2;
        }
        int intValue3 = o() ? this.b.b.y.intValue() : this.b.g();
        if (this.b.k == 1) {
            intValue3 += o() ? this.b.j : this.b.i;
        }
        float intValue4 = intValue3 + this.b.b.A.intValue();
        int a2 = this.b.a();
        if (a2 == 8388659 || a2 == 8388691) {
            if (this.b.l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f7 = rect2.left + this.j;
                    f8 = this.k;
                    f9 = f7 - ((f8 + f8) - intValue4);
                } else {
                    f5 = rect2.right - this.j;
                    f6 = this.k;
                    f9 = f5 + ((f6 + f6) - intValue4);
                }
            } else if (view.getLayoutDirection() == 0) {
                f3 = rect2.left;
                f4 = this.j;
                f9 = (f3 - f4) + intValue4;
            } else {
                f = rect2.right;
                f2 = this.j;
                f9 = (f + f2) - intValue4;
            }
        } else if (this.b.l == 0) {
            if (view.getLayoutDirection() == 0) {
                f = rect2.right;
                f2 = this.j;
                f9 = (f + f2) - intValue4;
            } else {
                f3 = rect2.left;
                f4 = this.j;
                f9 = (f3 - f4) + intValue4;
            }
        } else if (view.getLayoutDirection() == 0) {
            f5 = rect2.right - this.j;
            f6 = this.k;
            f9 = f5 + ((f6 + f6) - intValue4);
        } else {
            f7 = rect2.left + this.j;
            f8 = this.k;
            f9 = f7 - ((f8 + f8) - intValue4);
        }
        this.g = f9;
        if (this.b.b.D.booleanValue()) {
            ViewParent c = c();
            if (c == null) {
                c = view.getParent();
            }
            if ((c instanceof View) && (c.getParent() instanceof View)) {
                k(view, (View) c.getParent());
            }
        } else {
            k(view, null);
        }
        Rect rect3 = this.f;
        float f13 = this.g;
        float f14 = this.h;
        float f15 = this.j;
        float f16 = this.k;
        rect3.set((int) (f13 - f15), (int) (f14 - f16), (int) (f13 + f15), (int) (f14 + f16));
        float f17 = this.i;
        if (f17 != -1.0f) {
            this.d.L(f17);
        }
        if (rect.equals(this.f)) {
            return;
        }
        this.d.setBounds(this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final boolean h() {
        return !this.b.j() && this.b.i();
    }

    public final boolean i() {
        return this.b.j();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, defpackage.ehiu
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        ehae ehaeVar = this.b;
        ehaeVar.a.i = i;
        ehaeVar.b.i = i;
        l();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
