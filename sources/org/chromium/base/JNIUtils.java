package org.chromium.base;

import android.util.Log;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class JNIUtils {
    private static ClassLoader getSplitClassLoader(String str) {
        if (!str.isEmpty()) {
            int i = BundleUtils.a;
            Log.i("cn_JNIUtils", String.format(Locale.US, "Init JNI Classloader for %s. isInstalled=%b", str, false));
        }
        return JNIUtils.class.getClassLoader();
    }
}
