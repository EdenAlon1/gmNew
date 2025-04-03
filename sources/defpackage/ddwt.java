package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddwt implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ String c;
    final /* synthetic */ ddwu d;

    public ddwt(ddwu ddwuVar, View view, Runnable runnable, String str) {
        this.a = view;
        this.b = runnable;
        this.c = str;
        this.d = ddwuVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        final Runnable runnable = this.b;
        new elaz(this.d.a, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ddws
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                runnable.run();
            }
        }, this.c).onGlobalLayout();
    }
}
