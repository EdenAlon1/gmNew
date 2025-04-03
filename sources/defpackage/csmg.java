package defpackage;

import android.os.Handler;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csmg implements View.OnLayoutChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ Runnable b;

    public csmg(View view, Runnable runnable) {
        this.a = view;
        this.b = runnable;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.removeOnLayoutChangeListener(this);
        Handler handler = cslq.a;
        final View view2 = this.a;
        final Runnable runnable = this.b;
        handler.post(new Runnable() { // from class: csmf
            @Override // java.lang.Runnable
            public final void run() {
                if (view2.getContext() == null) {
                    return;
                }
                runnable.run();
            }
        });
    }
}
