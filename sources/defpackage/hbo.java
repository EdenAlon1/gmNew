package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbo implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final hho a = new hic(false, hla.a);

    public final void a(boolean z) {
        this.a.b(Boolean.valueOf(z));
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        a(z);
    }
}
