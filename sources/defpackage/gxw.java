package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxw extends ffkk implements ffji {
    final /* synthetic */ hbp a;
    final /* synthetic */ AccessibilityManager b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxw(hbp hbpVar, AccessibilityManager accessibilityManager) {
        super(1);
        this.a = hbpVar;
        this.b = accessibilityManager;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        hbn hbnVar;
        if (((lki) obj) == lki.ON_RESUME) {
            hbp hbpVar = this.a;
            AccessibilityManager accessibilityManager = this.b;
            hbpVar.b(accessibilityManager.isEnabled());
            accessibilityManager.addAccessibilityStateChangeListener(hbpVar);
            hbo hboVar = hbpVar.a;
            hboVar.a(accessibilityManager.isTouchExplorationEnabled());
            accessibilityManager.addTouchExplorationStateChangeListener(hboVar);
            if (Build.VERSION.SDK_INT >= 33 && (hbnVar = hbpVar.b) != null) {
                hbnVar.a(hbp.c(accessibilityManager));
                hbnVar.b(hbp.d(accessibilityManager));
                accessibilityManager.addAccessibilityServicesStateChangeListener(hbnVar);
            }
        }
        return ffcu.a;
    }
}
