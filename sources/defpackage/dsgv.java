package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsgv implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ int b;

    public dsgv(View view, int i) {
        this.a = view;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = this.b;
        view.setLayoutParams(layoutParams);
    }
}
