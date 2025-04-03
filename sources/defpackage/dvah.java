package defpackage;

import android.text.TextUtils;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvah {
    public static String a(Class cls) {
        String simpleName = cls.getSimpleName();
        if (!TextUtils.isEmpty(simpleName)) {
            return simpleName;
        }
        String name = cls.getName();
        return TextUtils.isEmpty(name) ? "UnknownClass" : name.substring(name.lastIndexOf(".") + 1);
    }

    public static String b(String str) {
        if (str.length() > 127) {
            str = str.substring(str.length() + NetError.ERR_PROXY_AUTH_REQUESTED);
        }
        return str.replace('$', '.');
    }
}
