package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import defpackage.avk;
import defpackage.awl;
import defpackage.axv;
import defpackage.bfr;
import defpackage.bhh;
import defpackage.bhj;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements bfr {
    private static final Set a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean a() {
        return "oneplus".equalsIgnoreCase(Build.BRAND) && "cph2583".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean b() {
        return "google".equalsIgnoreCase(Build.BRAND) && a.contains(Build.MODEL.toLowerCase());
    }

    public static final boolean c(Collection collection) {
        if (collection.size() != 3) {
            return false;
        }
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            axv axvVar = (axv) it.next();
            if (axvVar instanceof awl) {
                z = true;
            } else if (axvVar instanceof avk) {
                z3 = true;
            } else if (axvVar.k.s(bhh.x)) {
                z2 = axvVar.k.k() == bhj.VIDEO_CAPTURE;
            }
        }
        return z && z2 && z3;
    }
}
