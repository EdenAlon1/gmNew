package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhjo {
    public static final fhjl[] a = {new fhjl(fhjl.f, ""), new fhjl(fhjl.c, "GET"), new fhjl(fhjl.c, "POST"), new fhjl(fhjl.d, "/"), new fhjl(fhjl.d, "/index.html"), new fhjl(fhjl.e, "http"), new fhjl(fhjl.e, "https"), new fhjl(fhjl.b, "200"), new fhjl(fhjl.b, "204"), new fhjl(fhjl.b, "206"), new fhjl(fhjl.b, "304"), new fhjl(fhjl.b, "400"), new fhjl(fhjl.b, "404"), new fhjl(fhjl.b, "500"), new fhjl("accept-charset", ""), new fhjl("accept-encoding", "gzip, deflate"), new fhjl("accept-language", ""), new fhjl("accept-ranges", ""), new fhjl("accept", ""), new fhjl("access-control-allow-origin", ""), new fhjl("age", ""), new fhjl("allow", ""), new fhjl("authorization", ""), new fhjl("cache-control", ""), new fhjl("content-disposition", ""), new fhjl("content-encoding", ""), new fhjl("content-language", ""), new fhjl("content-length", ""), new fhjl("content-location", ""), new fhjl("content-range", ""), new fhjl("content-type", ""), new fhjl("cookie", ""), new fhjl("date", ""), new fhjl("etag", ""), new fhjl("expect", ""), new fhjl("expires", ""), new fhjl("from", ""), new fhjl("host", ""), new fhjl("if-match", ""), new fhjl("if-modified-since", ""), new fhjl("if-none-match", ""), new fhjl("if-range", ""), new fhjl("if-unmodified-since", ""), new fhjl("last-modified", ""), new fhjl("link", ""), new fhjl("location", ""), new fhjl("max-forwards", ""), new fhjl("proxy-authenticate", ""), new fhjl("proxy-authorization", ""), new fhjl("range", ""), new fhjl("referer", ""), new fhjl("refresh", ""), new fhjl("retry-after", ""), new fhjl("server", ""), new fhjl("set-cookie", ""), new fhjl("strict-transport-security", ""), new fhjl("transfer-encoding", ""), new fhjl("user-agent", ""), new fhjl("vary", ""), new fhjl("via", ""), new fhjl("www-authenticate", "")};
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            fhjl[] fhjlVarArr = a;
            if (!linkedHashMap.containsKey(fhjlVarArr[i].g)) {
                linkedHashMap.put(fhjlVarArr[i].g, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        b = unmodifiableMap;
    }

    public static final void a(fhmx fhmxVar) {
        int b2 = fhmxVar.b();
        for (int i = 0; i < b2; i++) {
            byte a2 = fhmxVar.a(i);
            if (a2 >= 65 && a2 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(fhmxVar.e()));
            }
        }
    }
}
