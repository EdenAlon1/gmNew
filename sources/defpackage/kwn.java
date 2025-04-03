package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kwn extends kwq {
    public static final Interpolator a = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final Interpolator b = new ljl();
    public static final Interpolator c = new DecelerateInterpolator(1.5f);
    public static final Interpolator d = new AccelerateInterpolator(1.5f);

    public kwn(int i, Interpolator interpolator, long j) {
        super(i, interpolator, j);
    }

    static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    static kwi b(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof kwm) {
            return ((kwm) tag).a;
        }
        return null;
    }

    static void c(View view, kwr kwrVar) {
        kwi b2 = b(view);
        if (b2 != null) {
            b2.c(kwrVar);
            if (b2.c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                c(viewGroup.getChildAt(i), kwrVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void d(View view, kwr kwrVar, kxh kxhVar, boolean z) {
        kwi b2 = b(view);
        boolean z2 = z;
        if (b2 != null) {
            b2.b = kxhVar;
            z2 = z;
            if (!z) {
                b2.d();
                z2 = b2.c ^ 1;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                d(viewGroup.getChildAt(i), kwrVar, kxhVar, true == z2);
            }
        }
    }

    static void e(View view, kxh kxhVar, List list) {
        kwi b2 = b(view);
        if (b2 != null) {
            kxhVar = b2.b(kxhVar, list);
            if (b2.c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), kxhVar, list);
            }
        }
    }

    static void f(View view, kwr kwrVar, kwh kwhVar) {
        kwi b2 = b(view);
        if (b2 != null) {
            b2.e(kwhVar);
            if (b2.c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), kwrVar, kwhVar);
            }
        }
    }
}
