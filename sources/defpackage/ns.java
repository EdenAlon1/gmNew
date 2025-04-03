package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ns implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ nx a;

    public ns(nx nxVar) {
        this.a = nxVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!this.a.x() || this.a.b.size() <= 0 || ((nw) this.a.b.get(0)).a.q) {
            return;
        }
        View view = this.a.d;
        if (view == null || !view.isShown()) {
            this.a.m();
            return;
        }
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            ((nw) it.next()).a.v();
        }
    }
}
