package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.bbr;
import defpackage.bfr;
import defpackage.bgs;
import defpackage.bgt;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements bfr {
    public static final bgs a;
    public static final bgs b;
    private static final Set c;
    private static final Set d;

    static {
        bgs bgsVar = new bgs();
        bgsVar.b(new bbr(2, bgt.VGA, 0L));
        bgsVar.b(new bbr(1, bgt.PREVIEW, 0L));
        bgsVar.b(new bbr(2, bgt.MAXIMUM, 0L));
        a = bgsVar;
        bgs bgsVar2 = new bgs();
        bgsVar2.b(new bbr(1, bgt.PREVIEW, 0L));
        bgsVar2.b(new bbr(1, bgt.VGA, 0L));
        bgsVar2.b(new bbr(2, bgt.MAXIMUM, 0L));
        b = bgsVar2;
        c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));
        d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));
    }

    public static boolean a() {
        return "heroqltevzw".equalsIgnoreCase(Build.DEVICE) || "heroqltetmo".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean b() {
        if (!"google".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return c.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean c() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
