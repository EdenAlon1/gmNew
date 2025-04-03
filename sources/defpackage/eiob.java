package defpackage;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.ArrayMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiob {
    public static final /* synthetic */ int a = 0;
    private static final eipn b = new eipn("PersistableBundles");

    public static Bundle a(PersistableBundle persistableBundle) {
        Bundle bundle = new Bundle();
        bundle.putAll(persistableBundle);
        return bundle;
    }

    public static boolean b(PersistableBundle persistableBundle, PersistableBundle persistableBundle2) {
        return persistableBundle == persistableBundle2 || d(persistableBundle).equals(d(persistableBundle2));
    }

    public static void c(PersistableBundle persistableBundle) {
        eioc.c(persistableBundle, "PersistableBundle cannot be null!");
        for (String str : persistableBundle.keySet()) {
            Object obj = persistableBundle.get(str);
            eioc.a(e(obj), String.format("Unknown/unsupported data type [%s] for key %s", obj, str));
        }
    }

    private static ArrayMap d(BaseBundle baseBundle) {
        if (baseBundle.isEmpty()) {
            return new ArrayMap(0);
        }
        ArrayMap arrayMap = new ArrayMap(baseBundle.size());
        for (String str : baseBundle.keySet()) {
            Object obj = baseBundle.get(str);
            if (e(obj)) {
                arrayMap.put(str, baseBundle.get(str));
            } else {
                b.f(String.format("Unknown/unsupported data type [%s] for key %s", obj, str));
            }
        }
        return arrayMap;
    }

    private static boolean e(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof String) || (obj instanceof Boolean);
    }
}
