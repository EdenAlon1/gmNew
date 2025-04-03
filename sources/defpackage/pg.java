package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pg implements Runnable {
    final /* synthetic */ ActionBarOverlayLayout a;

    public pg(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c();
        this.a.i = this.a.c.animate().translationY(-this.a.c.getHeight()).setListener(this.a.j);
    }
}
