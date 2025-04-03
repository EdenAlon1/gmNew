package defpackage;

import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dslh {
    public static final Point a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static final ffxx b(View view) {
        return new ffxn(new dsla(view, null));
    }

    public static final ffxx c(View view) {
        view.getClass();
        return ffyy.a(new dsld(b(view)));
    }

    public static final ffxx d(View view) {
        view.getClass();
        return ffyy.a(new dslg(b(view)));
    }

    public static final void e(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        viewGroup.setAccessibilityTraversalAfter(i);
    }

    public static final boolean f(View view) {
        return view.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
