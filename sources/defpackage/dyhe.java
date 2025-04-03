package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyhe {
    public static void a(Context context, int i) {
        b(context, context.getResources().getString(i));
    }

    public static void b(Context context, String str) {
        if (c(context)) {
            Toast.makeText(context, str, 1).show();
        }
    }

    public static boolean c(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }
}
