package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egzu implements Runnable {
    final /* synthetic */ egzv a;
    private final CoordinatorLayout b;
    private final View c;

    public egzu(egzv egzvVar, CoordinatorLayout coordinatorLayout, View view) {
        this.a = egzvVar;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller;
        if (this.c == null || (overScroller = this.a.b) == null) {
            return;
        }
        if (!overScroller.computeScrollOffset()) {
            this.a.C(this.b, this.c);
            return;
        }
        egzv egzvVar = this.a;
        egzvVar.H(this.b, this.c, egzvVar.b.getCurrY());
        this.c.postOnAnimation(this);
    }
}
