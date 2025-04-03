package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fezr {
    public static final fhmx a;
    public static final fezo[] b;
    public static final Map c;

    static {
        fhmx fhmxVar = fhmx.a;
        a = fhmw.b(":");
        int i = 0;
        b = new fezo[]{new fezo(fezo.e, ""), new fezo(fezo.b, "GET"), new fezo(fezo.b, "POST"), new fezo(fezo.c, "/"), new fezo(fezo.c, "/index.html"), new fezo(fezo.d, "http"), new fezo(fezo.d, "https"), new fezo(fezo.a, "200"), new fezo(fezo.a, "204"), new fezo(fezo.a, "206"), new fezo(fezo.a, "304"), new fezo(fezo.a, "400"), new fezo(fezo.a, "404"), new fezo(fezo.a, "500"), new fezo("accept-charset", ""), new fezo("accept-encoding", "gzip, deflate"), new fezo("accept-language", ""), new fezo("accept-ranges", ""), new fezo("accept", ""), new fezo("access-control-allow-origin", ""), new fezo("age", ""), new fezo("allow", ""), new fezo("authorization", ""), new fezo("cache-control", ""), new fezo("content-disposition", ""), new fezo("content-encoding", ""), new fezo("content-language", ""), new fezo("content-length", ""), new fezo("content-location", ""), new fezo("content-range", ""), new fezo("content-type", ""), new fezo("cookie", ""), new fezo("date", ""), new fezo("etag", ""), new fezo("expect", ""), new fezo("expires", ""), new fezo("from", ""), new fezo("host", ""), new fezo("if-match", ""), new fezo("if-modified-since", ""), new fezo("if-none-match", ""), new fezo("if-range", ""), new fezo("if-unmodified-since", ""), new fezo("last-modified", ""), new fezo("link", ""), new fezo("location", ""), new fezo("max-forwards", ""), new fezo("proxy-authenticate", ""), new fezo("proxy-authorization", ""), new fezo("range", ""), new fezo("referer", ""), new fezo("refresh", ""), new fezo("retry-after", ""), new fezo("server", ""), new fezo("set-cookie", ""), new fezo("strict-transport-security", ""), new fezo("transfer-encoding", ""), new fezo("user-agent", ""), new fezo("vary", ""), new fezo("via", ""), new fezo("www-authenticate", "")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (true) {
            fezo[] fezoVarArr = b;
            int length = fezoVarArr.length;
            if (i >= 61) {
                c = DesugarCollections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(fezoVarArr[i].f)) {
                    linkedHashMap.put(fezoVarArr[i].f, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    public static void a(fhmx fhmxVar) {
        int b2 = fhmxVar.b();
        for (int i = 0; i < b2; i++) {
            byte a2 = fhmxVar.a(i);
            if (a2 >= 65 && a2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(fhmxVar.e()));
            }
        }
    }
}
