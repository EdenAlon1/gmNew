package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vja implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ HorizontalScrollView a;

    public vja(HorizontalScrollView horizontalScrollView) {
        this.a = horizontalScrollView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        HorizontalScrollView horizontalScrollView = this.a;
        if (horizontalScrollView.getWidth() >= horizontalScrollView.getResources().getDimensionPixelSize(R.dimen.reactions_selection_bar_recycler_view_width)) {
            HorizontalScrollView horizontalScrollView2 = this.a;
            View findViewById = horizontalScrollView2.findViewById(R.id.reaction_selection_background_panel);
            this.a.scrollTo((findViewById.getMeasuredWidth() - ((horizontalScrollView2.getWidth() - horizontalScrollView2.getPaddingLeft()) - this.a.getPaddingRight())) / 2, 0);
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
