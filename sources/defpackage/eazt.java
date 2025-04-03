package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eazt extends vt {
    private final Drawable a;
    private final Rect b = new Rect();
    private final View c;

    public eazt(View view, Drawable drawable) {
        this.c = view;
        this.a = drawable;
    }

    @Override // defpackage.vt
    public final void a(Rect rect, View view, RecyclerView recyclerView, wo woVar) {
        super.a(rect, view, recyclerView, woVar);
        if (recyclerView.getChildAt(0) == view) {
            rect.set(0, this.a.getIntrinsicHeight(), 0, 0);
        }
    }

    @Override // defpackage.vt
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView.getChildCount() == 0) {
            return;
        }
        View childAt = recyclerView.getChildAt(0);
        RecyclerView.Q(childAt, this.b);
        int round = this.b.top + Math.round(childAt.getTranslationY());
        int intrinsicHeight = this.a.getIntrinsicHeight() + round;
        View view = this.c;
        int[] iArr = kvo.a;
        if (view.getLayoutDirection() == 1) {
            this.a.setBounds(0, round, recyclerView.getWidth(), intrinsicHeight);
        } else {
            this.a.setBounds(0, round, recyclerView.getWidth(), intrinsicHeight);
        }
        this.a.draw(canvas);
    }
}
