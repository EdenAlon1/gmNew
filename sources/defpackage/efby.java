package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efby {
    public static final /* synthetic */ int a = 0;
    private static final emye b = emye.d(".");

    static void a(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            String str = pathSegments.get(0);
            if (b.i(str).size() == 1 || (c(str) && !TextUtils.equals(str, ".lease"))) {
                if (TextUtils.isEmpty(uri.getQuery())) {
                    return;
                }
                if (uri.getQueryParameterNames().size() != 1 || uri.getQueryParameter("expiryDateSecs") == null) {
                    throw new efcv(String.format("The uri query is malformed, expected %s but found query %s", "expiryDateSecs=<expiryDateSecs>", uri.getQuery()));
                }
                return;
            }
        }
        throw new efcv(String.format("The uri is malformed, expected %s or %s but found %s", "<non_empty_checksum>", "<non_empty_checksum>.lease", uri.getPath()));
    }

    static boolean b(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return TextUtils.equals(str, "*.lease");
    }

    static boolean c(String str) {
        return str.endsWith(".lease");
    }

    static byte[] d(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return eoeg.h.f().k((CharSequence) b.i(str).get(0));
    }
}
