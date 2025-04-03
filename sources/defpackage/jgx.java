package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgx implements View.OnAttachStateChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ hjh b;

    public jgx(View view, hjh hjhVar) {
        this.a = view;
        this.b = hjhVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        this.b.w();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
