package defpackage;

import android.os.Build;
import com.google.android.apps.messaging.R;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehdq {
    public static final int[] a = {R.attr.dynamicColorThemeOverlay};
    private static final ehdp b;
    private static final ehdp c;
    private static final Map d;
    private static final Map e;

    static {
        ehdn ehdnVar = new ehdn();
        b = ehdnVar;
        ehdo ehdoVar = new ehdo();
        c = ehdoVar;
        HashMap hashMap = new HashMap();
        hashMap.put("fcnt", ehdnVar);
        hashMap.put("google", ehdnVar);
        hashMap.put("hmd global", ehdnVar);
        hashMap.put("infinix", ehdnVar);
        hashMap.put("infinix mobility limited", ehdnVar);
        hashMap.put("itel", ehdnVar);
        hashMap.put("kyocera", ehdnVar);
        hashMap.put("lenovo", ehdnVar);
        hashMap.put("lge", ehdnVar);
        hashMap.put("meizu", ehdnVar);
        hashMap.put("motorola", ehdnVar);
        hashMap.put("nothing", ehdnVar);
        hashMap.put("oneplus", ehdnVar);
        hashMap.put("oppo", ehdnVar);
        hashMap.put("realme", ehdnVar);
        hashMap.put("robolectric", ehdnVar);
        hashMap.put("samsung", ehdoVar);
        hashMap.put("sharp", ehdnVar);
        hashMap.put("shift", ehdnVar);
        hashMap.put("sony", ehdnVar);
        hashMap.put("tcl", ehdnVar);
        hashMap.put("tecno", ehdnVar);
        hashMap.put("tecno mobile limited", ehdnVar);
        hashMap.put("vivo", ehdnVar);
        hashMap.put("wingtech", ehdnVar);
        hashMap.put("xiaomi", ehdnVar);
        d = DesugarCollections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", ehdnVar);
        hashMap2.put("jio", ehdnVar);
        e = DesugarCollections.unmodifiableMap(hashMap2);
    }

    private ehdq() {
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (kqq.b()) {
            return true;
        }
        ehdp ehdpVar = (ehdp) d.get(Build.MANUFACTURER.toLowerCase(Locale.ROOT));
        if (ehdpVar == null) {
            ehdpVar = (ehdp) e.get(Build.BRAND.toLowerCase(Locale.ROOT));
        }
        return ehdpVar != null && ehdpVar.a();
    }
}
