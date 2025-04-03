package defpackage;

import android.os.Handler;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csmi implements View.OnLayoutChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ lkk b;
    final /* synthetic */ Runnable c;

    public csmi(View view, lkk lkkVar, Runnable runnable) {
        this.a = view;
        this.b = lkkVar;
        this.c = runnable;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.removeOnLayoutChangeListener(this);
        Handler handler = cslq.a;
        final lkk lkkVar = this.b;
        final Runnable runnable = this.c;
        handler.post(new Runnable() { // from class: csmh
            @Override // java.lang.Runnable
            public final void run() {
                if (((lkv) lkk.this).c.equals(lkj.RESUMED)) {
                    runnable.run();
                }
            }
        });
    }
}
