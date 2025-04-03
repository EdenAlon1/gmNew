package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csup {
    private static final Set a = fffi.d("com.google.android.apps.messaging", "com.google.android.libraries.compose");

    public static final boolean a(Uri uri) {
        uri.getClass();
        if (!ffkj.e("content", uri.getScheme())) {
            return false;
        }
        Set set = a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (c(uri, (String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final boolean b(Uri uri) {
        uri.getClass();
        String scheme = uri.getScheme();
        return scheme != null && ffpc.l(scheme, "http", true);
    }

    public static final boolean c(Uri uri, String str) {
        uri.getClass();
        str.getClass();
        String authority = uri.getAuthority();
        return TextUtils.equals("content", uri.getScheme()) && authority != null && ffpc.t(authority, str);
    }
}
