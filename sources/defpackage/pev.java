package defpackage;

import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pev {
    public static pfv a(WebSettings webSettings) {
        try {
            return new pfv((WebSettingsBoundaryInterface) fimp.a(WebSettingsBoundaryInterface.class, pgb.a.a.convertSettings(webSettings)));
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e);
            return new pfw();
        }
    }
}
