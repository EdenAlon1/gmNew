package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.apps.messaging.R;
import com.google.android.material.internal.ClippableRoundedCornerLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehjw extends ehjk {
    public float f;
    public Rect g;
    public Rect h;
    public float[] i;
    private final float j;
    private final float k;

    public ehjw(View view) {
        super(view);
        Resources resources = view.getResources();
        this.j = resources.getDimension(R.dimen.m3_back_progress_main_container_min_edge_gap);
        this.k = resources.getDimension(R.dimen.m3_back_progress_main_container_max_translation_y);
    }

    private static final int j(WindowInsets windowInsets, int i) {
        RoundedCorner roundedCorner;
        int radius;
        roundedCorner = windowInsets.getRoundedCorner(i);
        if (roundedCorner == null) {
            return 0;
        }
        radius = roundedCorner.getRadius();
        return radius;
    }

    public final AnimatorSet e(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.a, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.a, (Property<View, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.a, (Property<View, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.a, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new ehjv(view));
        return animatorSet;
    }

    public final void f(View view) {
        if (super.b() == null) {
            return;
        }
        AnimatorSet e = e(view);
        View view2 = this.a;
        if (view2 instanceof ClippableRoundedCornerLayout) {
            final ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) view2;
            ValueAnimator ofObject = ValueAnimator.ofObject(new TypeEvaluator() { // from class: ehjt
                @Override // android.animation.TypeEvaluator
                public final Object evaluate(float f, Object obj, Object obj2) {
                    float[] fArr = (float[]) obj;
                    float[] fArr2 = (float[]) obj2;
                    float f2 = fArr[0];
                    float f3 = fArr2[0];
                    TimeInterpolator timeInterpolator = egyv.a;
                    float f4 = fArr[1];
                    float f5 = f4 + ((fArr2[1] - f4) * f);
                    float f6 = fArr[2];
                    float f7 = f6 + ((fArr2[2] - f6) * f);
                    float f8 = fArr[3];
                    float f9 = f8 + ((fArr2[3] - f8) * f);
                    float f10 = fArr[4];
                    float f11 = f10 + ((fArr2[4] - f10) * f);
                    float f12 = fArr[5];
                    float f13 = f12 + ((fArr2[5] - f12) * f);
                    float f14 = fArr[6];
                    float f15 = f14 + ((fArr2[6] - f14) * f);
                    float f16 = fArr[7];
                    return new float[]{f2 + ((f3 - f2) * f), f5, f7, f9, f11, f13, f15, f16 + ((fArr2[7] - f16) * f)};
                }
            }, clippableRoundedCornerLayout.b, i());
            ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ehju
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ClippableRoundedCornerLayout.this.b((float[]) valueAnimator.getAnimatedValue());
                }
            });
            e.playTogether(ofObject);
        }
        e.setDuration(this.d);
        e.start();
        g();
    }

    public final void g() {
        this.f = 0.0f;
        this.g = null;
        this.h = null;
    }

    public final void h(aak aakVar, View view, float f) {
        if (super.d(aakVar) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        int i = aakVar.c;
        float f2 = aakVar.b;
        float f3 = aakVar.a;
        float a = a(f2);
        float width = this.a.getWidth();
        float height = this.a.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        TimeInterpolator timeInterpolator = egyv.a;
        float f4 = (-0.100000024f) * a;
        float max = ((Math.max(0.0f, ((width - (0.9f * width)) / 2.0f) - this.j) + 0.0f) * a) + 0.0f;
        int i2 = i != 0 ? -1 : 1;
        float f5 = f4 + 1.0f;
        float min = Math.min(Math.max(0.0f, ((height - (f5 * height)) / 2.0f) - this.j), this.k);
        float f6 = f3 - this.f;
        float abs = (((Math.abs(f6) / height) * (min + 0.0f)) + 0.0f) * Math.signum(f6);
        if (Float.isNaN(f5)) {
            return;
        }
        float f7 = max * i2;
        if (Float.isNaN(f7) || Float.isNaN(abs)) {
            return;
        }
        this.a.setScaleX(f5);
        this.a.setScaleY(f5);
        this.a.setTranslationX(f7);
        this.a.setTranslationY(abs);
        View view2 = this.a;
        if (view2 instanceof ClippableRoundedCornerLayout) {
            float[] i3 = i();
            float f8 = i3[0];
            float f9 = i3[1];
            float f10 = i3[2];
            float f11 = i3[3];
            float f12 = i3[4];
            float f13 = i3[5];
            float f14 = i3[6];
            float f15 = i3[7];
            ((ClippableRoundedCornerLayout) view2).b(new float[]{f8 + ((f - f8) * a), f9 + ((f - f9) * a), f10 + ((f - f10) * a), f11 + ((f - f11) * a), f12 + ((f - f12) * a), f13 + ((f - f13) * a), f14 + ((f - f14) * a), f15 + (a * (f - f15))});
        }
    }

    public final float[] i() {
        float[] fArr;
        WindowInsets rootWindowInsets;
        int i;
        char c;
        int i2;
        int i3;
        char c2;
        if (this.i == null) {
            if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = this.a.getRootWindowInsets()) == null) {
                fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            } else {
                DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
                int i4 = displayMetrics.widthPixels;
                int i5 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                this.a.getLocationOnScreen(iArr);
                int i6 = iArr[0];
                int i7 = iArr[1];
                View view = this.a;
                int width = view.getWidth();
                int height = view.getHeight();
                if (i6 != 0) {
                    i = i6;
                    c = 7;
                    i2 = 0;
                } else if (i7 == 0) {
                    i = 0;
                    i2 = j(rootWindowInsets, 0);
                    c = 7;
                    i7 = 0;
                } else {
                    i2 = 0;
                    i = 0;
                    c = 7;
                }
                int i8 = i + width;
                if (i8 < i4 || i7 != 0) {
                    i3 = 0;
                    c2 = 6;
                } else {
                    i3 = j(rootWindowInsets, 1);
                    c2 = 6;
                    i7 = 0;
                }
                int j = (i8 < i4 || i7 + height < i5) ? 0 : j(rootWindowInsets, 2);
                int j2 = (i != 0 || i7 + height < i5) ? 0 : j(rootWindowInsets, 3);
                fArr = new float[8];
                float f = i2;
                fArr[0] = f;
                fArr[1] = f;
                float f2 = i3;
                fArr[2] = f2;
                fArr[3] = f2;
                float f3 = j;
                fArr[4] = f3;
                fArr[5] = f3;
                float f4 = j2;
                fArr[c2] = f4;
                fArr[c] = f4;
            }
            this.i = fArr;
        }
        return this.i;
    }
}
