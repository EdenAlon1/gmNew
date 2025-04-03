package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecvd {
    public static final /* synthetic */ int a = 0;
    private static final cmh b = new cmh();

    private ecvd() {
    }

    public static synchronized Uri a(String str) {
        synchronized (ecvd.class) {
            cmh cmhVar = b;
            Uri uri = (Uri) cmhVar.get(str);
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode(str))));
            cmhVar.put(str, parse);
            return parse;
        }
    }

    public static String b(String str) {
        int indexOf = str.indexOf("#");
        if (indexOf >= 0) {
            return str.substring(0, indexOf);
        }
        if (str.contains("@")) {
            throw new IllegalArgumentException("Invalid package name: ".concat(String.valueOf(str)));
        }
        return str;
    }

    public static String c(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(String.valueOf(str)));
        }
        return str + "#" + context.getPackageName();
    }
}
