package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehuh implements ehuj {
    private final int a;

    public ehuh(int i) {
        this.a = i;
    }

    private static Animator c(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f2));
        ofPropertyValuesHolder.addListener(new ehug(view, f3));
        return ofPropertyValuesHolder;
    }

    private static boolean d(View view) {
        return view.getLayoutDirection() == 1;
    }

    private static final int e(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    @Override // defpackage.ehuj
    public final Animator a(ViewGroup viewGroup, View view) {
        int e = e(view.getContext());
        float translationX = view.getTranslationX();
        view.getTranslationY();
        int i = this.a;
        if (i == 8388611) {
            float f = e;
            return c(view, d(viewGroup) ? f + translationX : translationX - f, translationX, translationX);
        }
        if (i != 8388613) {
            throw new IllegalArgumentException(a.h(i, "Invalid slide direction: "));
        }
        float f2 = e;
        return c(view, d(viewGroup) ? translationX - f2 : translationX + f2, translationX, translationX);
    }

    @Override // defpackage.ehuj
    public final Animator b(ViewGroup viewGroup, View view) {
        int e = e(view.getContext());
        float translationX = view.getTranslationX();
        view.getTranslationY();
        int i = this.a;
        if (i == 8388611) {
            float f = e;
            return c(view, translationX, d(viewGroup) ? translationX - f : translationX + f, translationX);
        }
        if (i != 8388613) {
            throw new IllegalArgumentException(a.h(i, "Invalid slide direction: "));
        }
        float f2 = e;
        return c(view, translationX, d(viewGroup) ? f2 + translationX : translationX - f2, translationX);
    }
}
