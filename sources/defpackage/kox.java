package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kox {
    public static final /* synthetic */ int a = 0;
    private static volatile kow b;
    private static volatile List c;

    private kox() {
    }

    public static kow a(Context context) {
        if (b == null) {
            try {
                b = (kow) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, kox.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (b == null) {
                b = new kov();
            }
        }
        return b;
    }

    public static List b(Context context) {
        Bundle bundle;
        String string;
        if (c == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((kos) Class.forName(string, false, kox.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (c == null) {
                c = arrayList;
            }
        }
        return c;
    }

    public static List c(Context context, int i) {
        List pinnedShortcuts;
        List dynamicShortcuts;
        List manifestShortcuts;
        List shortcuts;
        if (Build.VERSION.SDK_INT >= 30) {
            shortcuts = kox$$ExternalSyntheticApiModelOutline0.m471m(context.getSystemService(kox$$ExternalSyntheticApiModelOutline0.m())).getShortcuts(i);
            return kou.a(context, shortcuts);
        }
        ShortcutManager m471m = kox$$ExternalSyntheticApiModelOutline0.m471m(context.getSystemService(kox$$ExternalSyntheticApiModelOutline0.m()));
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            manifestShortcuts = m471m.getManifestShortcuts();
            arrayList.addAll(manifestShortcuts);
        }
        if ((i & 2) != 0) {
            dynamicShortcuts = m471m.getDynamicShortcuts();
            arrayList.addAll(dynamicShortcuts);
        }
        if ((i & 4) != 0) {
            pinnedShortcuts = m471m.getPinnedShortcuts();
            arrayList.addAll(pinnedShortcuts);
        }
        return kou.a(context, arrayList);
    }

    public static void d(Context context, List list) {
        kox$$ExternalSyntheticApiModelOutline0.m471m(context.getSystemService(kox$$ExternalSyntheticApiModelOutline0.m())).removeDynamicShortcuts(list);
        a(context).b();
        Iterator it = b(context).iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    public static void e(Context context, List list) {
        if (Build.VERSION.SDK_INT < 30) {
            d(context, list);
            return;
        }
        kox$$ExternalSyntheticApiModelOutline0.m471m(context.getSystemService(kox$$ExternalSyntheticApiModelOutline0.m())).removeLongLivedShortcuts(list);
        a(context).b();
        Iterator it = b(context).iterator();
        if (it.hasNext()) {
            throw null;
        }
    }
}
