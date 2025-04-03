package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rgp implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ ViewTreeObserver.OnDrawListener b;
    final /* synthetic */ rgq c;

    public rgp(rgq rgqVar, View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        this.a = view;
        this.b = onDrawListener;
        this.c = rgqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rdv a = rdv.a();
        rkh.j();
        a.c.set(true);
        this.c.b.b = true;
        this.a.getViewTreeObserver().removeOnDrawListener(this.b);
        this.c.b.a.clear();
    }
}
