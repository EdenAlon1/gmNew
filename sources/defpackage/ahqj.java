package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahqj implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ahqt a;
    final /* synthetic */ View b;

    public ahqj(ahqt ahqtVar, View view) {
        this.a = ahqtVar;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.a.b.isDestroyed()) {
            return false;
        }
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
