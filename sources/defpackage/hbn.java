package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbn implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    public final hho a = new hic(false, hla.a);
    public final hho b = new hic(false, hla.a);

    public final void a(boolean z) {
        this.a.b(Boolean.valueOf(z));
    }

    public final void b(boolean z) {
        this.b.b(Boolean.valueOf(z));
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        a(hbp.c(accessibilityManager));
        b(hbp.d(accessibilityManager));
    }
}
