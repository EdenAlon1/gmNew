package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxx extends ffkk implements ffix {
    final /* synthetic */ hbp a;
    final /* synthetic */ AccessibilityManager b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxx(hbp hbpVar, AccessibilityManager accessibilityManager) {
        super(0);
        this.a = hbpVar;
        this.b = accessibilityManager;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        hbn hbnVar;
        AccessibilityManager accessibilityManager = this.b;
        hbp hbpVar = this.a;
        accessibilityManager.removeAccessibilityStateChangeListener(hbpVar);
        accessibilityManager.removeTouchExplorationStateChangeListener(hbpVar.a);
        if (Build.VERSION.SDK_INT >= 33 && (hbnVar = hbpVar.b) != null) {
            accessibilityManager.removeAccessibilityServicesStateChangeListener(hbnVar);
        }
        return ffcu.a;
    }
}
