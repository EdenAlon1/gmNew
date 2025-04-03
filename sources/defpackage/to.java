package defpackage;

import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class to implements Runnable {
    final /* synthetic */ tq a;

    public to(tq tqVar) {
        this.a = tqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewParent parent = this.a.c.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
