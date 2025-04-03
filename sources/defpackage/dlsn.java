package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlsn implements hgo {
    final /* synthetic */ AccessibilityManager a;
    final /* synthetic */ ffji b;

    public dlsn(AccessibilityManager accessibilityManager, ffji ffjiVar) {
        this.a = accessibilityManager;
        this.b = ffjiVar;
    }

    @Override // defpackage.hgo
    public final void a() {
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager != null) {
            final ffji ffjiVar = this.b;
            accessibilityManager.removeAccessibilityStateChangeListener(new AccessibilityManager.AccessibilityStateChangeListener() { // from class: dlso
                @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                public final /* synthetic */ void onAccessibilityStateChanged(boolean z) {
                    ffji.this.invoke(Boolean.valueOf(z));
                }
            });
        }
    }
}
