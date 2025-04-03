package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izv implements View.OnAttachStateChangeListener {
    final /* synthetic */ jae a;

    public izv(jae jaeVar) {
        this.a = jaeVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        jae jaeVar = this.a;
        AccessibilityManager accessibilityManager = jaeVar.d;
        accessibilityManager.addAccessibilityStateChangeListener(jaeVar.e);
        accessibilityManager.addTouchExplorationStateChangeListener(jaeVar.f);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        jae jaeVar = this.a;
        jaeVar.h.removeCallbacks(jaeVar.D);
        jae jaeVar2 = this.a;
        AccessibilityManager accessibilityManager = jaeVar2.d;
        accessibilityManager.removeAccessibilityStateChangeListener(jaeVar2.e);
        accessibilityManager.removeTouchExplorationStateChangeListener(jaeVar2.f);
    }
}
