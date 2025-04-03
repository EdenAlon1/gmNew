package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyr implements Animation.AnimationListener {
    final /* synthetic */ SwipeRefreshLayout a;

    public oyr(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        oyy oyyVar;
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        if (!swipeRefreshLayout.b) {
            swipeRefreshLayout.b();
            return;
        }
        swipeRefreshLayout.h.setAlpha(PrivateKeyType.INVALID);
        this.a.h.start();
        SwipeRefreshLayout swipeRefreshLayout2 = this.a;
        if (swipeRefreshLayout2.i && (oyyVar = swipeRefreshLayout2.a) != null) {
            oyyVar.a();
        }
        SwipeRefreshLayout swipeRefreshLayout3 = this.a;
        swipeRefreshLayout3.c = swipeRefreshLayout3.d.getTop();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
