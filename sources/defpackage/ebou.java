package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebou implements View.OnAttachStateChangeListener {
    final /* synthetic */ RecyclerView a;
    final /* synthetic */ vk b;

    public ebou(RecyclerView recyclerView, vk vkVar) {
        this.a = recyclerView;
        this.b = vkVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.am(this.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.am(null);
    }
}
