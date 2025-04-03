package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vd implements Runnable {
    final /* synthetic */ RecyclerView a;

    public vd(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.a;
        if (!recyclerView.t || recyclerView.isLayoutRequested()) {
            return;
        }
        RecyclerView recyclerView2 = this.a;
        if (!recyclerView2.r) {
            recyclerView2.requestLayout();
        } else if (recyclerView2.v) {
            recyclerView2.u = true;
        } else {
            recyclerView2.fi();
        }
    }
}
