package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehjy extends ehjk {
    private final float f;
    private final float g;
    private final float h;

    public ehjy(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void e() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.a, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.a;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.d);
        animatorSet.start();
    }

    public final void f(aak aakVar, int i) {
        if (super.d(aakVar) != null) {
            g(aakVar.b, aakVar.c == 0, i);
        }
    }

    public final void g(float f, boolean z, int i) {
        float a = a(f);
        boolean h = h(i);
        float width = this.a.getWidth();
        int height = this.a.getHeight();
        if (width > 0.0f) {
            float f2 = height;
            if (f2 <= 0.0f) {
                return;
            }
            float f3 = this.f / width;
            float f4 = this.g / width;
            float f5 = this.h / f2;
            View view = this.a;
            if (h) {
                width = 0.0f;
            }
            boolean z2 = z == h;
            view.setPivotX(width);
            if (!z2) {
                f4 = -f3;
            }
            TimeInterpolator timeInterpolator = egyv.a;
            float f6 = ((f4 + 0.0f) * a) + 0.0f;
            float f7 = (a * (f5 + 0.0f)) + 0.0f;
            float f8 = f6 + 1.0f;
            if (Float.isNaN(f8)) {
                return;
            }
            float f9 = 1.0f - f7;
            if (Float.isNaN(f9)) {
                return;
            }
            this.a.setScaleX(f8);
            this.a.setScaleY(f9);
            View view2 = this.a;
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotX(h ? (r0 - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f10 = z2 ? 1.0f - f6 : 1.0f;
                    float f11 = f9 != 0.0f ? (f8 / f9) * f10 : 1.0f;
                    if (!Float.isNaN(f10) && !Float.isNaN(f11)) {
                        childAt.setScaleX(f10);
                        childAt.setScaleY(f11);
                    }
                }
            }
        }
    }

    public final boolean h(int i) {
        return (Gravity.getAbsoluteGravity(i, this.a.getLayoutDirection()) & 3) == 3;
    }
}
