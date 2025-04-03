package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jge implements View.OnAttachStateChangeListener {
    final /* synthetic */ iya a;
    final /* synthetic */ fflb b;

    public jge(iya iyaVar, fflb fflbVar) {
        this.a = iyaVar;
        this.b = fflbVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        iya iyaVar = this.a;
        lkr a = lmz.a(iyaVar);
        if (a == null) {
            imn.a(a.i(iyaVar, "View tree for ", " has no ViewTreeLifecycleOwner"));
            throw new ffbx();
        }
        this.b.a = jgh.a(iyaVar, a.P());
        this.a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
