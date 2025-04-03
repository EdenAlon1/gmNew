package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebfh extends vt {
    private final Drawable a;
    private final Rect b = new Rect();
    private final int c;

    public ebfh(Drawable drawable, int i) {
        this.a = drawable;
        this.c = i;
    }

    private final void c(RecyclerView recyclerView, View view, Canvas canvas, int i) {
        RecyclerView.Q(view, this.b);
        int round = this.b.top + Math.round(view.getTranslationY());
        int intrinsicHeight = this.a.getIntrinsicHeight() + round;
        int[] iArr = kvo.a;
        int layoutDirection = view.getLayoutDirection();
        int width = recyclerView.getWidth();
        if (layoutDirection == 1) {
            width -= i;
        }
        if (layoutDirection == 1) {
            i = 0;
        }
        this.a.setBounds(i, round, width, intrinsicHeight);
        this.a.draw(canvas);
    }

    private static int d(View view, RecyclerView recyclerView) {
        Object obj = recyclerView.n;
        if (obj == null) {
            return 1;
        }
        emxf.l(obj instanceof ebfg);
        return ((ebfg) obj).G(recyclerView, view);
    }

    @Override // defpackage.vt
    public final void a(Rect rect, View view, RecyclerView recyclerView, wo woVar) {
        if (d(view, recyclerView) == 1) {
            return;
        }
        rect.set(0, this.a.getIntrinsicHeight(), 0, 0);
    }

    @Override // defpackage.vt
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int d = d(childAt, recyclerView) - 1;
            if (d == 1) {
                c(recyclerView, childAt, canvas, 0);
            } else if (d == 2) {
                c(recyclerView, childAt, canvas, this.c);
            }
        }
    }
}
