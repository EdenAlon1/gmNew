package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbp implements AccessibilityManager.AccessibilityStateChangeListener, hkx {
    public final hbn b;
    private final hho c = new hic(false, hla.a);
    public final hbo a = new hbo();

    public hbp() {
        this.b = Build.VERSION.SDK_INT >= 33 ? new hbn() : null;
    }

    public static final boolean c(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && ffpc.I(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && ffpc.I(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hkx
    public final /* bridge */ /* synthetic */ Object a() {
        hbn hbnVar;
        hbn hbnVar2;
        boolean z = false;
        if (((Boolean) this.c.a()).booleanValue() && (((Boolean) this.a.a.a()).booleanValue() || (((hbnVar = this.b) != null && ((Boolean) hbnVar.a.a()).booleanValue()) || ((hbnVar2 = this.b) != null && ((Boolean) hbnVar2.b.a()).booleanValue())))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final void b(boolean z) {
        this.c.b(Boolean.valueOf(z));
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        b(z);
    }
}
