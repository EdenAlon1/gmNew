package defpackage;

import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ficz {
    private static final ThreadLocal a = new ThreadLocal();

    public static String a(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new ficx(str));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) a.get();
        return (map == null || (str2 = (String) map.get(str)) == null) ? (String) AccessController.doPrivileged(new ficy(str)) : str2;
    }

    public static boolean b(String str) {
        try {
            String a2 = a(str);
            if (a2 == null || a2.length() != 4) {
                return false;
            }
            if (a2.charAt(0) != 't' && a2.charAt(0) != 'T') {
                return false;
            }
            if (a2.charAt(1) != 'r' && a2.charAt(1) != 'R') {
                return false;
            }
            if (a2.charAt(2) != 'u' && a2.charAt(2) != 'U') {
                return false;
            }
            if (a2.charAt(3) != 'e') {
                if (a2.charAt(3) != 'E') {
                    return false;
                }
            }
            return true;
        } catch (AccessControlException unused) {
        }
        return false;
    }
}
