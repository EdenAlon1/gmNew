package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vi {
    public final /* synthetic */ RecyclerView a;

    public vi(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final int a() {
        return this.a.getChildCount();
    }

    public final int b(View view) {
        return this.a.indexOfChild(view);
    }

    public final View c(int i) {
        return this.a.getChildAt(i);
    }

    public final void d(View view) {
        wr l = RecyclerView.l(view);
        if (l != null) {
            this.a.aK(l, l.o);
            l.o = 0;
        }
    }

    public final void e(int i) {
        View childAt = this.a.getChildAt(i);
        if (childAt != null) {
            this.a.fj(childAt);
            childAt.clearAnimation();
        }
        this.a.removeViewAt(i);
    }
}
