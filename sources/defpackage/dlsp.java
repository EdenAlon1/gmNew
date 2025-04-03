package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlsp {
    public static final boolean a(boolean z, hfd hfdVar) {
        hfdVar.v(-1962223493);
        boolean z2 = false;
        if (z && b(hfdVar)) {
            z2 = true;
        }
        hfdVar.o();
        return z2;
    }

    public static final boolean b(hfd hfdVar) {
        hfdVar.v(1674911942);
        Object systemService = ((Context) hfdVar.e(AndroidCompositionLocals_androidKt.b)).getSystemService("accessibility");
        final AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        hfdVar.v(473433427);
        Object f = hfdVar.f();
        if (f == hfc.a) {
            Object hicVar = new hic(Boolean.valueOf(accessibilityManager != null ? accessibilityManager.isEnabled() : false), hla.a);
            hfdVar.y(hicVar);
            f = hicVar;
        }
        final hho hhoVar = (hho) f;
        hfdVar.o();
        hfdVar.v(473436010);
        boolean F = hfdVar.F(accessibilityManager);
        Object f2 = hfdVar.f();
        if (F || f2 == hfc.a) {
            f2 = new ffji() { // from class: dlsm
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((hgp) obj).getClass();
                    final hho hhoVar2 = hhoVar;
                    final ffji ffjiVar = new ffji() { // from class: dlsk
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            Boolean bool = (Boolean) obj2;
                            bool.booleanValue();
                            hho.this.b(bool);
                            return ffcu.a;
                        }
                    };
                    AccessibilityManager accessibilityManager2 = accessibilityManager;
                    if (accessibilityManager2 != null) {
                        accessibilityManager2.addAccessibilityStateChangeListener(new AccessibilityManager.AccessibilityStateChangeListener() { // from class: dlsl
                            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                            public final void onAccessibilityStateChanged(boolean z) {
                                ffji.this.invoke(Boolean.valueOf(z));
                            }
                        });
                    }
                    return new dlsn(accessibilityManager2, ffjiVar);
                }
            };
            hfdVar.y(f2);
        }
        hfdVar.o();
        hgs.c(accessibilityManager, (ffji) f2, hfdVar);
        boolean booleanValue = ((Boolean) hhoVar.a()).booleanValue();
        hfdVar.o();
        return booleanValue;
    }
}
