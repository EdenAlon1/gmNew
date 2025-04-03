package defpackage;

import java.util.Hashtable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eemr {
    private static final Hashtable a;

    static {
        Hashtable hashtable = new Hashtable();
        a = hashtable;
        hashtable.put("t", eena.class);
        hashtable.put("To".toLowerCase(Locale.US), eena.class);
        hashtable.put("From".toLowerCase(Locale.US), eeml.class);
        hashtable.put("f", eeml.class);
        hashtable.put("CSeq".toLowerCase(Locale.US), eemb.class);
        hashtable.put("X-Pidgey-Conference-Params".toLowerCase(Locale.US), eeme.class);
        hashtable.put("X-Pidgey-Selected-Experiments".toLowerCase(Locale.US), eemx.class);
        hashtable.put("Via".toLowerCase(Locale.US), eenc.class);
        hashtable.put("v", eenc.class);
        hashtable.put("Contact".toLowerCase(Locale.US), eemf.class);
        hashtable.put("m", eemf.class);
        hashtable.put(fhpi.a.toLowerCase(Locale.US), eemh.class);
        hashtable.put("c", eemh.class);
        hashtable.put("Content-Length".toLowerCase(Locale.US), eemg.class);
        hashtable.put("l", eemg.class);
        hashtable.put("Authorization".toLowerCase(Locale.US), eema.class);
        hashtable.put("WWW-Authenticate".toLowerCase(Locale.US), eend.class);
        hashtable.put("Call-Id".toLowerCase(Locale.US), eemc.class);
        hashtable.put("i", eemc.class);
        hashtable.put("Route".toLowerCase(Locale.US), eemw.class);
        hashtable.put("Record-Route".toLowerCase(Locale.US), eemu.class);
        hashtable.put("Date".toLowerCase(Locale.US), eemi.class);
        hashtable.put("Proxy-Authorization".toLowerCase(Locale.US), eemt.class);
        hashtable.put("Proxy-Authenticate".toLowerCase(Locale.US), eems.class);
        hashtable.put("Max-Forwards".toLowerCase(Locale.US), eemo.class);
        hashtable.put("Expires".toLowerCase(Locale.US), eemk.class);
        hashtable.put("Event".toLowerCase(Locale.US), eemj.class);
        hashtable.put("o", eemj.class);
        hashtable.put("Session-Expires".toLowerCase(Locale.US), eemy.class);
        hashtable.put("Referred-By".toLowerCase(Locale.US), eemv.class);
        hashtable.put("b", eemv.class);
    }

    public static eemm a(String str) {
        String v = eemn.v(str);
        String w = eemn.w(str);
        if (v == null || w == null) {
            throw new eeje("The header name or value is null");
        }
        Class cls = (Class) a.get(v.toLowerCase(Locale.US));
        if (cls == null) {
            return new eemm(str);
        }
        try {
            eemm eemmVar = (eemm) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            eemmVar.e(str);
            return eemmVar;
        } catch (Exception unused) {
            return null;
        }
    }
}
