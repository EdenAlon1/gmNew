package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhfj {
    public static final fhfk b(String str) {
        fhfk fhfkVar = new fhfk(str);
        fhfk.c.put(str, fhfkVar);
        return fhfkVar;
    }

    public final synchronized fhfk a(String str) {
        fhfk fhfkVar;
        String str2;
        str.getClass();
        fhfkVar = (fhfk) fhfk.c.get(str);
        if (fhfkVar == null) {
            Map map = fhfk.c;
            if (ffpc.t(str, "TLS_")) {
                String substring = str.substring(4);
                substring.getClass();
                str2 = "SSL_".concat(substring);
            } else if (ffpc.t(str, "SSL_")) {
                String substring2 = str.substring(4);
                substring2.getClass();
                str2 = "TLS_".concat(substring2);
            } else {
                str2 = str;
            }
            fhfkVar = (fhfk) map.get(str2);
            if (fhfkVar == null) {
                fhfkVar = new fhfk(str);
            }
            fhfk.c.put(str, fhfkVar);
        }
        return fhfkVar;
    }
}
