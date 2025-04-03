package org.chromium.base;

import android.content.pm.ApplicationInfo;
import android.util.ArrayMap;
import dalvik.system.BaseDexClassLoader;
import defpackage.fidy;
import defpackage.fiem;
import defpackage.fieu;
import j$.util.DesugarCollections;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class BundleUtils {
    public static final /* synthetic */ int a = 0;

    static {
        new ArrayMap();
        DesugarCollections.synchronizedMap(new ArrayMap());
    }

    private static String a(String str, String str2) {
        String[] strArr;
        int binarySearch;
        ApplicationInfo applicationInfo = fidy.a.getApplicationInfo();
        strArr = applicationInfo.splitNames;
        String str3 = (strArr != null && (binarySearch = Arrays.binarySearch(strArr, str2)) >= 0) ? applicationInfo.splitSourceDirs[binarySearch] : null;
        if (str3 == null) {
            return null;
        }
        ApplicationInfo applicationInfo2 = fidy.a.getApplicationInfo();
        return str3 + "!/lib/" + ((String) applicationInfo2.getClass().getField("primaryCpuAbi").get(applicationInfo2)) + "/" + System.mapLibraryName(str);
    }

    public static String getNativeLibraryPath(String str, String str2) {
        fiem a2 = fiem.a();
        try {
            String findLibrary = ((BaseDexClassLoader) BundleUtils.class.getClassLoader()).findLibrary(str);
            if (findLibrary != null) {
                a2.close();
                return findLibrary;
            }
            ClassLoader classLoader = fidy.a.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                findLibrary = ((BaseDexClassLoader) classLoader).findLibrary(str);
            } else if (classLoader instanceof fieu) {
                throw null;
            }
            if (findLibrary != null) {
                a2.close();
                return findLibrary;
            }
            String a3 = a(str, str2);
            a2.close();
            return a3;
        } catch (Throwable th) {
            try {
                a2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static boolean isBundleForNative() {
        return false;
    }
}
