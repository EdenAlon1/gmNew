package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eerv {
    public static int a(int i, float f, float f2, float f3) {
        return (int) ((i - (f3 + f3)) / (f + (f2 + f2)));
    }

    public static Drawable b(Drawable drawable, View view, int i, int i2) {
        int i3 = view.getLayoutParams().width;
        InsetDrawable insetDrawable = new InsetDrawable(drawable, i3 > i ? (i3 - i) / 2 : 0);
        insetDrawable.setAlpha(i2);
        return insetDrawable;
    }

    public static String c(String str) {
        int indexOf = str.indexOf(47, 6);
        return indexOf == -1 ? "" : str.substring(0, indexOf);
    }

    public static void d(View view, String str) {
        Context context = view.getContext();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().add(str);
            obtain.setClassName(view.getClass().getName());
            obtain.setSource(view);
            obtain.setPackageName(context.getPackageName());
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    public static boolean e(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) ? false : true;
    }
}
