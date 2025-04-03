package defpackage;

import java.util.Hashtable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeky {
    public static final Hashtable a = new Hashtable();

    static {
        a("CSeq", eekg.class);
        a("Record-Route", eeld.class);
        a("Via", eelo.class);
        a("From", eekt.class);
        a("Call-Id", eekh.class);
        a("Max-Forwards", eekw.class);
        a("Proxy-Authenticate", eelb.class);
        a(fhpi.a, eeko.class);
        a("Content-Length", eekn.class);
        a("Route", eelg.class);
        a("Contact", eekk.class);
        a("WWW-Authenticate", eelq.class);
        a("Proxy-Authorization", eelc.class);
        a("Date", eekp.class);
        a("Expires", eekr.class);
        a("Authorization", eekf.class);
        a("Session-Expires", eelj.class);
    }

    protected static void a(String str, Class cls) {
        a.put(str.toLowerCase(Locale.US), cls);
    }
}
