package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwr {
    public kwq a;

    public kwr(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new kwp(new WindowInsetsAnimation(i, interpolator, j));
        } else {
            this.a = new kwn(i, interpolator, j);
        }
    }

    public static void c(View view, kwi kwiVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(kwiVar != null ? new kwo(kwiVar) : null);
            return;
        }
        Interpolator interpolator = kwn.a;
        View.OnApplyWindowInsetsListener kwmVar = kwiVar != null ? new kwm(view, kwiVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, kwmVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(kwmVar);
        }
    }

    public final float a() {
        return this.a.g();
    }

    public final long b() {
        return this.a.i();
    }

    public final void d(float f) {
        this.a.j(f);
    }

    public kwr(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new kwp(windowInsetsAnimation);
        }
    }
}
