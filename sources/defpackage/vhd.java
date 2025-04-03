package defpackage;

import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vhd implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ HorizontalScrollView a;
    final /* synthetic */ vhe b;

    public vhd(vhe vheVar, HorizontalScrollView horizontalScrollView) {
        this.a = horizontalScrollView;
        this.b = vheVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.getWidth() >= this.b.b.getResources().getDimensionPixelSize(R.dimen.reactions_selection_bar_recycler_view_width)) {
            this.a.scrollTo((this.a.findViewById(R.id.panel).getMeasuredWidth() - this.a.getWidth()) / 2, 0);
        }
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
