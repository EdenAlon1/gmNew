package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adzb {
    private final Context a;

    public adzb(Context context) {
        context.getClass();
        this.a = context;
    }

    public final void a(String str) {
        AccessibilityEvent obtain;
        str.getClass();
        Object systemService = this.a.getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (accessibilityManager.isEnabled()) {
            if (Build.VERSION.SDK_INT >= 30) {
                obtain = new AccessibilityEvent();
            } else {
                obtain = AccessibilityEvent.obtain();
                obtain.getClass();
            }
            obtain.setEventType(16384);
            obtain.getText().add(str);
            obtain.setClassName(getClass().getName());
            obtain.setPackageName(this.a.getPackageName());
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }
}
