package defpackage;

import com.android.vcard.VCardConstants;
import java.util.Hashtable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eemn extends eejb {
    public eemn(String str, String str2) {
        super(str);
        this.f = str2;
        j(str);
    }

    public static String v(String str) {
        try {
            int indexOf = str.indexOf(":");
            if (indexOf > 0) {
                return str.substring(0, indexOf);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
        return null;
    }

    public static String w(String str) {
        try {
            return str.substring(str.indexOf(":") + 1);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    @Override // defpackage.eejb
    public final void j(String str) {
        synchronized (b) {
            Hashtable hashtable = (Hashtable) c.get(str);
            if (hashtable != null) {
                this.d = hashtable;
            } else {
                synchronized (eejb.b) {
                    Hashtable hashtable2 = (Hashtable) eejb.c.get(str);
                    if (hashtable2 == null) {
                        this.d = new Hashtable();
                        eejb.c.put(str, this.d);
                    } else {
                        this.d = hashtable2;
                    }
                }
                if (str.equals("method_keywordLexer")) {
                    i("REGISTER".toUpperCase(Locale.US), 2052);
                    i("ACK".toUpperCase(Locale.US), 2054);
                    i("OPTIONS".toUpperCase(Locale.US), 2056);
                    i("BYE".toUpperCase(Locale.US), 2055);
                    i("INVITE".toUpperCase(Locale.US), 2053);
                    i("SIP".toUpperCase(Locale.US), 2051);
                    i("SUBSCRIBE".toUpperCase(Locale.US), 2101);
                    i("NOTIFY".toUpperCase(Locale.US), 2102);
                } else if (str.equals("command_keywordLexer")) {
                    i("From".toUpperCase(Locale.US), 2062);
                    i("To".toUpperCase(Locale.US), 2063);
                    i("Via".toUpperCase(Locale.US), 2064);
                    i("Route".toUpperCase(Locale.US), 2070);
                    i("Max-Forwards".toUpperCase(Locale.US), 2079);
                    i("Authorization".toUpperCase(Locale.US), 2071);
                    i("Proxy-Authorization".toUpperCase(Locale.US), 2072);
                    i("Date".toUpperCase(Locale.US), 2080);
                    i("Content-Length".toUpperCase(Locale.US), 2084);
                    i(fhpi.a.toUpperCase(Locale.US), 2086);
                    i("Contact".toUpperCase(Locale.US), 2087);
                    i("Call-Id".toUpperCase(Locale.US), 2088);
                    i("Expires".toUpperCase(Locale.US), 2090);
                    i("Record-Route".toUpperCase(Locale.US), 2092);
                    i("CSeq".toUpperCase(Locale.US), 2094);
                    i("X-Pidgey-Conference-Params".toUpperCase(Locale.US), 2116);
                    i("X-Pidgey-Selected-Experiments".toUpperCase(Locale.US), 2118);
                    i("WWW-Authenticate".toUpperCase(Locale.US), 2096);
                    i("Proxy-Authenticate".toUpperCase(Locale.US), 2082);
                    i("Event".toUpperCase(Locale.US), 2111);
                    i("C".toUpperCase(Locale.US), 2086);
                    i("F".toUpperCase(Locale.US), 2062);
                    i("I".toUpperCase(Locale.US), 2088);
                    i("M".toUpperCase(Locale.US), 2087);
                    i("L".toUpperCase(Locale.US), 2084);
                    i("T".toUpperCase(Locale.US), 2063);
                    i("V".toUpperCase(Locale.US), 2064);
                    i("O".toUpperCase(Locale.US), 2111);
                    i("Session-Expires".toUpperCase(Locale.US), 2115);
                } else if (str.equals("status_lineLexer")) {
                    i("SIP".toUpperCase(Locale.US), 2051);
                } else if (str.equals("request_lineLexer")) {
                    i("SIP".toUpperCase(Locale.US), 2051);
                } else if (str.equals("sip_urlLexer")) {
                    i(VCardConstants.PROPERTY_TEL.toUpperCase(Locale.US), 2105);
                    i("SIP".toUpperCase(Locale.US), 2051);
                }
                Hashtable hashtable3 = (Hashtable) c.get(str);
                hashtable3.getClass();
                this.d = hashtable3;
            }
        }
    }
}
