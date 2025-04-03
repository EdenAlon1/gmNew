package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.card.MaterialCardView;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehca {
    public static final Drawable a;
    private static final double u = Math.cos(Math.toRadians(45.0d));
    public final MaterialCardView b;
    public final ehop d;
    public final ehop e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Drawable j;
    public Drawable k;
    public ColorStateList l;
    public ColorStateList m;
    public ehow n;
    public ColorStateList o;
    public Drawable p;
    public LayerDrawable q;
    public boolean s;
    private ehop v;
    private ValueAnimator w;
    private final TimeInterpolator x;
    private final int y;
    private final int z;
    public final Rect c = new Rect();
    public boolean r = false;
    public float t = 0.0f;

    static {
        a = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public ehca(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.b = materialCardView;
        ehop ehopVar = new ehop(materialCardView.getContext(), attributeSet, i, R.style.Widget_MaterialComponents_CardView);
        this.d = ehopVar;
        ehopVar.K(materialCardView.getContext());
        ehopVar.R(-12303292);
        ehou ehouVar = new ehou(ehopVar.G());
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, ehcb.a, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            ehouVar.i(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.e = new ehop();
        g(new ehow(ehouVar));
        this.x = ehjz.a(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, egyv.a);
        this.y = ehmp.a(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.z = ehmp.a(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    private final float q() {
        float max = Math.max(s(this.n.b, this.d.w()), s(this.n.c, this.d.x()));
        ehoi ehoiVar = this.n.d;
        ehop ehopVar = this.d;
        float[] fArr = ehopVar.z;
        float s = s(ehoiVar, fArr != null ? fArr[1] : ehopVar.q.a.h.a(ehopVar.D()));
        ehoi ehoiVar2 = this.n.e;
        ehop ehopVar2 = this.d;
        float[] fArr2 = ehopVar2.z;
        return Math.max(max, Math.max(s, s(ehoiVar2, fArr2 != null ? fArr2[2] : ehopVar2.q.a.i.a(ehopVar2.D()))));
    }

    private final boolean r() {
        return this.d.X();
    }

    private static final float s(ehoi ehoiVar, float f) {
        if (ehoiVar instanceof ehot) {
            return (float) ((1.0d - u) * f);
        }
        if (ehoiVar instanceof ehoj) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        return this.b.gx() + (o() ? q() : 0.0f);
    }

    public final float b() {
        return (this.b.gx() * 1.5f) + (o() ? q() : 0.0f);
    }

    public final Drawable c() {
        if (this.p == null) {
            this.v = new ehop(this.n);
            this.p = new RippleDrawable(this.l, null, this.v);
        }
        if (this.q == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.p, this.e, this.k});
            this.q = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.q;
    }

    public final Drawable d(Drawable drawable) {
        int i;
        int i2;
        if (this.b.a) {
            i2 = (int) Math.ceil(b());
            i = (int) Math.ceil(a());
        } else {
            i = 0;
            i2 = 0;
        }
        return new ehbz(drawable, i, i2, i, i2);
    }

    public final void e(ColorStateList colorStateList) {
        this.d.O(colorStateList);
    }

    public final void f(boolean z, boolean z2) {
        Drawable drawable = this.k;
        if (drawable != null) {
            float f = true != z ? 0.0f : 1.0f;
            if (!z2) {
                drawable.setAlpha(true == z ? PrivateKeyType.INVALID : 0);
                this.t = f;
                return;
            }
            float f2 = z ? 1.0f - this.t : this.t;
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.w = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t, f);
            this.w = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ehby
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    ehca ehcaVar = ehca.this;
                    ehcaVar.k.setAlpha((int) (255.0f * floatValue));
                    ehcaVar.t = floatValue;
                }
            });
            this.w.setInterpolator(this.x);
            this.w.setDuration((long) ((z ? this.y : this.z) * f2));
            this.w.start();
        }
    }

    public final void g(ehow ehowVar) {
        this.n = ehowVar;
        this.d.fy(ehowVar);
        this.d.x = !r0.X();
        this.e.fy(ehowVar);
        ehop ehopVar = this.v;
        if (ehopVar != null) {
            ehopVar.fy(ehowVar);
        }
    }

    public final void h() {
        Drawable drawable = this.j;
        Drawable c = p() ? c() : this.e;
        this.j = c;
        if (drawable != c) {
            if (this.b.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) this.b.getForeground()).setDrawable(c);
            } else {
                this.b.setForeground(d(c));
            }
        }
    }

    public final void i() {
        float gt;
        float f = 0.0f;
        float q = (n() || o()) ? q() : 0.0f;
        MaterialCardView materialCardView = this.b;
        if (materialCardView.b && materialCardView.a) {
            double d = 1.0d - u;
            gt = super/*androidx.cardview.widget.CardView*/.gt();
            f = (float) (d * gt);
        }
        float f2 = q - f;
        MaterialCardView materialCardView2 = this.b;
        int i = (int) f2;
        materialCardView2.c.set(this.c.left + i, this.c.top + i, this.c.right + i, this.c.bottom + i);
        cly.d(materialCardView2.f);
    }

    public final void j() {
        this.d.N(this.b.f.b.getElevation());
    }

    public final void k() {
        this.e.U(this.i, this.o);
    }

    public final boolean l() {
        return (this.h & 80) == 80;
    }

    public final boolean m() {
        return (this.h & 8388613) == 8388613;
    }

    public final boolean n() {
        return this.b.b && !r();
    }

    public final boolean o() {
        return this.b.b && r() && this.b.a;
    }

    public final boolean p() {
        if (this.b.isClickable()) {
            return true;
        }
        View view = this.b;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }
}
