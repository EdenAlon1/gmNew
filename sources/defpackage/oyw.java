package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyw extends Animation {
    final /* synthetic */ SwipeRefreshLayout a;

    public oyw(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        boolean z = swipeRefreshLayout.j;
        int abs = swipeRefreshLayout.g - Math.abs(swipeRefreshLayout.f);
        SwipeRefreshLayout swipeRefreshLayout2 = this.a;
        this.a.j((swipeRefreshLayout2.e + ((int) ((abs - r1) * f))) - swipeRefreshLayout2.d.getTop());
        this.a.h.c(1.0f - f);
    }
}
