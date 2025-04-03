package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aac {
    private static final Interpolator a = new aaa();
    private static final Interpolator b = new aab();
    private int c = -1;

    public static int f(int i, int i2) {
        return i2 << (i * 8);
    }

    public static int g(int i, int i2) {
        return f(2, i) | f(1, i2) | f(0, i2 | i);
    }

    public static int w(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 + i4;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public int b(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    public abstract int e(RecyclerView recyclerView, wr wrVar);

    public void h(Canvas canvas, RecyclerView recyclerView, wr wrVar, float f, float f2, int i, boolean z) {
        View view = wrVar.a;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            int[] iArr = kvo.a;
            Float valueOf = Float.valueOf(kvd.a(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    float a2 = kvd.a(childAt);
                    if (a2 > f3) {
                        f3 = a2;
                    }
                }
            }
            kvd.j(view, f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public abstract void i(wr wrVar, int i);

    final boolean j(RecyclerView recyclerView, wr wrVar) {
        return (x(recyclerView, wrVar) & 16711680) != 0;
    }

    public boolean k() {
        return true;
    }

    public boolean l() {
        return true;
    }

    public abstract boolean m(RecyclerView recyclerView, wr wrVar, wr wrVar2);

    public final void n(wr wrVar) {
        View view = wrVar.a;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            int[] iArr = kvo.a;
            kvd.j(view, floatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public final int o(RecyclerView recyclerView, int i, int i2, long j) {
        int i3 = this.c;
        if (i3 == -1) {
            i3 = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.c = i3;
        }
        int abs = Math.abs(i2);
        int signum = (int) (((int) (((int) Math.signum(i2)) * i3 * b.getInterpolation(Math.min(1.0f, abs / i)))) * a.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f));
        return signum == 0 ? i2 > 0 ? 1 : -1 : signum;
    }

    final int x(RecyclerView recyclerView, wr wrVar) {
        return b(e(recyclerView, wrVar), recyclerView.getLayoutDirection());
    }

    public void p(wr wrVar) {
    }

    public float v(float f) {
        return f;
    }
}
