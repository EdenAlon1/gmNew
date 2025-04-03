package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import defpackage.bfr;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExtraCroppingQuirk implements bfr {
    private static final Map a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("SM-T580", null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", null);
        hashMap.put("SM-G570M", null);
        hashMap.put("SM-G610F", null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    public static boolean a() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        Map map = a;
        if (!map.containsKey(Build.MODEL.toUpperCase(Locale.US))) {
            return false;
        }
        Range range = (Range) map.get(Build.MODEL.toUpperCase(Locale.US));
        if (range == null) {
            return true;
        }
        return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
    }

    public static final Size b(int i) {
        if (!a()) {
            return null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return new Size(1920, 1080);
        }
        if (i2 == 1) {
            return new Size(1280, 720);
        }
        if (i2 != 2) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
