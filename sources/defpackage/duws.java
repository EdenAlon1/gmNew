package defpackage;

import android.text.TextUtils;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duws {
    public static final duvz a;
    static final duvz b;

    static {
        String str;
        duwb.d("haptic_improvement_long_press_effect");
        a = duwb.a("vibration_effect_min_sdk", 1024L);
        duvz a2 = duwb.a("config_haptic_cutoff", 200L);
        dvae dvaeVar = dvae.b;
        synchronized (dvaeVar) {
            if (dvaeVar.c.containsKey("ro.com.google.ime.haptic.cutoff")) {
                str = (String) dvaeVar.c.get("ro.com.google.ime.haptic.cutoff");
            } else {
                Method method = dvaeVar.d;
                String str2 = null;
                if (method != null) {
                    try {
                        String str3 = (String) method.invoke(null, "ro.com.google.ime.haptic.cutoff");
                        if (!TextUtils.isEmpty(str3)) {
                            str2 = str3;
                        }
                    } catch (Exception e) {
                        ((enrr) ((enrr) ((enrr) dvae.a.j()).g(e)).h("com/google/android/libraries/inputmethod/systemproperty/SystemProperties", "readSystemProperty", 126, "SystemProperties.java")).t("Fail to invoke SystemProperties.get(%s)", "ro.com.google.ime.haptic.cutoff");
                    }
                }
                dvaeVar.c.put("ro.com.google.ime.haptic.cutoff", str2);
                str = str2;
            }
        }
        if (!TextUtils.isEmpty(str) && a2.a(duwh.OEM, false) == null) {
            try {
                ((duwd) a2).h(duwh.OEM, Long.valueOf(Long.parseLong(str)));
            } catch (NumberFormatException e2) {
                ((enrr) ((enrr) ((enrr) duwb.a.j()).g(e2)).h("com/google/android/libraries/inputmethod/flag/FlagFactory", "createLongFlagWithSystemProperty", 228, "FlagFactory.java")).D("Fail to parse long for %s: %s", "ro.com.google.ime.haptic.cutoff", str);
            }
        }
        b = a2;
    }
}
