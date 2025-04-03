package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsmw implements View.OnAttachStateChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ dsmx b;

    public dsmw(View view, dsmx dsmxVar) {
        this.a = view;
        this.b = dsmxVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        ((enrr) dsmx.a.h().h("com/google/android/libraries/compose/ui/keyboard/detector/KeyboardDetectorPopupWindowStrategy$attachPopupWindow$$inlined$doOnAttach$1", "onViewAttachedToWindow", 64, "KeyboardDetectorPopupWindowStrategy.kt")).q("Starting keyboard detection");
        this.b.d().showAtLocation(((ViewGroup) this.a).getRootView(), 0, 0, 0);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
    }
}
