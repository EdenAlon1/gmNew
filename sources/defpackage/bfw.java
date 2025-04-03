package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfw implements afd {
    private static Set b(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class<?> cls = null;
            try {
                Class<?> cls2 = Class.forName(str);
                if (bfr.class.isAssignableFrom(cls2)) {
                    cls = cls2;
                } else {
                    avw.f("QuirkSettingsLoader", a.v(str, " does not implement the Quirk interface."));
                }
            } catch (ClassNotFoundException e) {
                avw.g("QuirkSettingsLoader", "Class not found: ".concat(String.valueOf(str)), e);
            }
            if (cls != null) {
                hashSet.add(cls);
            }
        }
        return hashSet;
    }

    private static String[] c(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            avw.f("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException e) {
            avw.g("QuirkSettingsLoader", a.h(i, "Quirk class names resource not found: "), e);
            return new String[0];
        }
    }

    @Override // defpackage.afd
    public final /* synthetic */ Object a(Object obj) {
        Context context = (Context) obj;
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) bfv.class), 640).metaData;
            if (bundle == null) {
                avw.f("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
                return null;
            }
            boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
            String[] c = c(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
            String[] c2 = c(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
            avw.a("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
            avw.a("QuirkSettingsLoader", a.q(z, "  KEY_DEFAULT_QUIRK_ENABLED = "));
            avw.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = ".concat(String.valueOf(Arrays.toString(c))));
            avw.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = ".concat(String.valueOf(Arrays.toString(c2))));
            return new bfs(z, new HashSet(b(c)), new HashSet(b(c2)));
        } catch (PackageManager.NameNotFoundException unused) {
            avw.a("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
