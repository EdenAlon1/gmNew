package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aedg implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ aedh a;

    public aedg(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        return this.a.aJ;
    }
}
