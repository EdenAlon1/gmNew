package defpackage;

import j$.util.Objects;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eehk {
    public static final eeio a(eeit eeitVar) {
        eeio eeioVar = new eeio();
        eeioVar.b = eeitVar;
        return eeioVar;
    }

    public static final eeio b(String str) {
        if (str.equals("*")) {
            eeio eeioVar = new eeio();
            eeioVar.c = 3;
            return eeioVar;
        }
        eemq eemqVar = new eemq();
        eemqVar.a = new eemn("charLexer", str);
        return eelz.b(true, eemqVar);
    }

    public static final eeiq c(String str, int i, String str2) {
        eeiq eeiqVar = new eeiq();
        eeix eeixVar = new eeix(str);
        eeiqVar.a = new eeip();
        eeip eeipVar = eeiqVar.a;
        if (eeipVar.a == null) {
            eeipVar.a = new eeiz();
        }
        eeipVar.a.a = eeixVar;
        eeiqVar.i(i);
        eejc eejcVar = new eejc("lr", null);
        eeiqVar.b.i("lr");
        eeiqVar.b.e(eejcVar);
        eeiqVar.j(str2);
        return eeiqVar;
    }

    public static final eeit d(String str) {
        if (str == null) {
            throw new NullPointerException("null arg");
        }
        try {
            eenb eenbVar = new eenb(str);
            Vector g = eenbVar.a.g(1);
            String str2 = g.size() == 0 ? null : ((eejj) g.elementAt(0)).a;
            if (str2 != null) {
                return str2.equalsIgnoreCase("sip") ? eenbVar.b() : str2.equalsIgnoreCase("sips") ? eenbVar.b() : str2.equalsIgnoreCase("tel") ? eenbVar.d() : new eeit(str);
            }
            throw new eeje("bad scheme");
        } catch (eeje e) {
            throw new eeje(Objects.toString(e.getMessage(), "Problems parsing URI"));
        }
    }

    public static final eeiq e(String str) {
        if (str == null) {
            throw new NullPointerException("null URI");
        }
        try {
            return g(str);
        } catch (eeje e) {
            throw new eeje(Objects.toString(e.getMessage(), "Problems parsing SIP URI"));
        }
    }

    public static final eeiq f(String str, boolean z, String str2, String str3) {
        if (str != null && !z) {
            return e(str);
        }
        if (str3 == null) {
            throw new NullPointerException("null host");
        }
        StringBuffer stringBuffer = new StringBuffer("sip:");
        if (str2 != null) {
            stringBuffer.append(str2);
            stringBuffer.append("@");
        }
        if (str3.indexOf(58) != str3.lastIndexOf(58) && str3.trim().charAt(0) != '[') {
            str3 = a.a(str3, "[", "]");
        }
        stringBuffer.append(str3);
        try {
            return g(stringBuffer.toString());
        } catch (eeje e) {
            throw new eeje(Objects.toString(e.getMessage(), "Problems parsing SIP URI"));
        }
    }

    private static final eeiq g(String str) {
        try {
            return (eeiq) new eenb(str).e();
        } catch (ClassCastException unused) {
            throw new eeje(str.concat(" Not a SIP URL "));
        }
    }
}
