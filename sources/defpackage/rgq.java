package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rgq implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ rgr b;

    public rgq(rgr rgrVar, View view) {
        this.a = view;
        this.b = rgrVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        rkh.k(new rgp(this, this.a, this));
    }
}
