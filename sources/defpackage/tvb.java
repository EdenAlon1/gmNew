package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvb {
    public static Rect a(RecyclerView recyclerView, View view, View view2, View view3) {
        int left = recyclerView.getLeft() + view.getLeft();
        int left2 = recyclerView.getLeft() + view.getRight();
        int top = recyclerView.getTop() + view.getTop();
        int top2 = recyclerView.getTop() + view.getBottom();
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.badge_touch_target_size);
        int max = Math.max(0, dimensionPixelSize - (left2 - left));
        int max2 = Math.max(0, dimensionPixelSize - (top2 - top));
        int min = view2 == null ? max / 2 : Math.min(max / 2, (view.getLeft() - view2.getRight()) / 2);
        int min2 = view3 == null ? max / 2 : Math.min(max / 2, (view3.getLeft() - view.getRight()) / 2);
        Rect rect = new Rect();
        rect.top = top;
        rect.bottom = top2 + max2;
        rect.left = left - min;
        rect.right = left2 + min2;
        return rect;
    }
}
