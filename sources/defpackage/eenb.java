package defpackage;

import java.util.Locale;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eenb extends eemq {
    public eenb(eemn eemnVar) {
        this.a = eemnVar;
        this.a.j("sip_urlLexer");
    }

    private final eejd j() {
        eejc eejcVar;
        String str;
        eejd eejdVar = new eejd();
        while (true) {
            String l = l();
            if (l.equalsIgnoreCase("phone-context")) {
                this.a.a(61);
                char o = this.a.o(0);
                if (o == '+') {
                    this.a.q(1);
                    str = "+".concat(k());
                } else {
                    if (!eejh.t(o)) {
                        throw new eeje("Invalid phone-context:" + o);
                    }
                    str = this.a.a(4095).a;
                }
                eejcVar = new eejc("phone-context", str);
            } else if (this.a.o(0) == '=') {
                this.a.q(1);
                eejcVar = new eejc(l, l());
            } else {
                eejcVar = new eejc(l, "");
            }
            eejdVar.g(eejcVar);
            if (this.a.o(0) != ';') {
                return eejdVar;
            }
            this.a.q(1);
        }
    }

    private final String k() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (true) {
            if (!this.a.r()) {
                break;
            }
            char o = this.a.o(0);
            if (Character.isDigit(o) || o == '-' || o == '.' || o == '(' || o == ')') {
                this.a.q(1);
                stringBuffer.append(o);
                i++;
            } else if (i <= 0) {
                throw f("unexpected " + o);
            }
        }
        return stringBuffer.toString();
    }

    private final String l() {
        StringBuffer stringBuffer = new StringBuffer();
        while (this.a.r()) {
            char o = this.a.o(0);
            if (o != '[' && o != ']' && o != '/' && o != ':' && o != '&' && o != '+' && o != '$' && !o(o)) {
                if (!n()) {
                    break;
                }
                String m = this.a.m();
                this.a.q(3);
                stringBuffer.append(m);
            } else {
                stringBuffer.append(o);
                this.a.q(1);
            }
        }
        return stringBuffer.toString();
    }

    private final String m() {
        StringBuffer stringBuffer = new StringBuffer();
        while (this.a.r()) {
            char o = this.a.o(0);
            if (!o(o) && o != '&' && o != '?' && o != '+' && o != '$' && o != '#' && o != '/' && o != ',' && o != ';' && o != '=') {
                if (!n()) {
                    break;
                }
                String m = this.a.m();
                this.a.q(3);
                stringBuffer.append(m);
            } else {
                stringBuffer.append(o);
                this.a.q(1);
            }
        }
        return stringBuffer.toString();
    }

    private final boolean n() {
        try {
            char o = this.a.o(0);
            char o2 = this.a.o(1);
            char o3 = this.a.o(2);
            if (o == '%' && eejh.u(o2)) {
                if (eejh.u(o3)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean o(char c) {
        return eejh.s(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.' || c == '!' || c == '~' || c == '*' || c == '\'' || c == '(' || c == ')';
    }

    public final eeiq b() {
        return c(true);
    }

    public final eeiq c(boolean z) {
        String str;
        eeiq eeiqVar = new eeiq();
        this.a.a(2051);
        char c = ':';
        this.a.a(58);
        eeiqVar.e = "SIP".toLowerCase(Locale.US);
        int i = this.a.g;
        char c2 = '$';
        char c3 = '&';
        try {
            try {
                String m = m();
                this.a.o(0);
                this.a.a(58);
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    char o = this.a.o(0);
                    if (!o(o) && o != c3 && o != '=' && o != '+' && o != '$' && o != ',') {
                        if (!n()) {
                            break;
                        }
                        stringBuffer.append(this.a.m());
                        this.a.q(3);
                        c3 = '&';
                    }
                    stringBuffer.append(o);
                    this.a.q(1);
                    c3 = '&';
                }
                String stringBuffer2 = stringBuffer.toString();
                this.a.a(64);
                eejb eejbVar = this.a;
                eejf eejfVar = new eejf();
                eejfVar.a = eejbVar;
                eejbVar.j("charLexer");
                eeiz a = eeiy.a(eejfVar);
                eeiqVar.k(m);
                if (eeiqVar.a == null) {
                    eeiqVar.a = new eeip();
                }
                eeip eeipVar = eeiqVar.a;
                if (eeipVar.b == null) {
                    eeipVar.b = new eeiu();
                }
                eeipVar.b.b = stringBuffer2;
                eeiqVar.g(a);
            } catch (eeje unused) {
                this.a.g = i;
                eejb eejbVar2 = this.a;
                eejf eejfVar2 = new eejf();
                eejfVar2.a = eejbVar2;
                eejbVar2.j("charLexer");
                eeiqVar.g(eeiy.a(eejfVar2));
            }
        } catch (eeje unused2) {
            this.a.g = i;
            String m2 = m();
            this.a.a(64);
            eejb eejbVar3 = this.a;
            eejf eejfVar3 = new eejf();
            eejfVar3.a = eejbVar3;
            eejbVar3.j("charLexer");
            eeiz a2 = eeiy.a(eejfVar3);
            eeiqVar.k(m2);
            eeiqVar.g(a2);
        }
        if (z) {
            this.a.j("charLexer");
            while (this.a.r() && this.a.o(0) == ';') {
                this.a.q(1);
                String l = l();
                if (this.a.o(0) == '=') {
                    this.a.q(1);
                    str = l();
                } else {
                    str = null;
                }
                eeiqVar.b.g(new eejc(l, str));
            }
            if (this.a.r()) {
                char c4 = '?';
                if (this.a.o(0) == '?') {
                    this.a.q(1);
                    while (this.a.r()) {
                        String p = this.a.p('=');
                        this.a.q(1);
                        StringBuffer stringBuffer3 = new StringBuffer();
                        while (this.a.r()) {
                            char o2 = this.a.o(0);
                            if (o2 != '+' && o2 != c4 && o2 != c && o2 != '@' && o2 != '[' && o2 != ']' && o2 != '/' && o2 != c2 && o2 != '_' && o2 != '-' && o2 != '\"' && o2 != '!' && o2 != '~' && o2 != '*' && o2 != '.' && o2 != '(' && o2 != ')' && !eejh.s(o2) && !Character.isDigit(o2)) {
                                if (o2 != '%') {
                                    break;
                                }
                                StringBuffer stringBuffer4 = new StringBuffer();
                                char o3 = this.a.o(0);
                                char o4 = this.a.o(1);
                                char o5 = this.a.o(2);
                                if (o3 != '%' || !eejh.u(o4) || !eejh.u(o5)) {
                                    throw f("escaped");
                                }
                                this.a.q(3);
                                stringBuffer4.append('%');
                                stringBuffer4.append(o4);
                                stringBuffer4.append(o5);
                                stringBuffer3.append(stringBuffer4.toString());
                            } else {
                                this.a.q(1);
                                stringBuffer3.append(o2);
                            }
                            c4 = '?';
                            c = ':';
                            c2 = '$';
                        }
                        eeiqVar.c.g(new eejc(p, stringBuffer3.toString()));
                        if (this.a.r() && this.a.o(0) != '&') {
                            break;
                        }
                        this.a.q(1);
                        c4 = '?';
                        c = ':';
                        c2 = '$';
                    }
                }
            }
        }
        return eeiqVar;
    }

    public final eeir d() {
        eeis eeisVar;
        this.a.a(2105);
        this.a.a(58);
        this.a.j("charLexer");
        char o = this.a.o(0);
        if (o == '+') {
            eeisVar = new eeis();
            eeisVar.a = true;
            this.a.a(43);
            eeisVar.b = k();
            if (this.a.r() && this.a.o(0) == ';') {
                this.a.q(1);
                eeisVar.c = j();
            }
        } else {
            if (!eejh.s(o) && !Character.isDigit(o) && o != '-' && o != '*' && o != '.' && o != '(' && o != ')' && o != '#') {
                throw f("unexpected char " + o);
            }
            eeisVar = new eeis();
            eeisVar.a = false;
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            while (true) {
                if (!this.a.r()) {
                    break;
                }
                char o2 = this.a.o(0);
                if (o2 != '*' && o2 != '#' && o2 != '-' && o2 != '.' && o2 != '(') {
                    if (o2 == ')') {
                        o2 = ')';
                    } else if (!Character.isDigit(o2)) {
                        if (i <= 0) {
                            throw f("unexepcted " + o2);
                        }
                    }
                }
                this.a.q(1);
                stringBuffer.append(o2);
                i++;
            }
            eeisVar.b = stringBuffer.toString();
            if (this.a.r() && ((eejj) this.a.g(1).elementAt(0)).b == 59) {
                this.a.q(1);
                eeisVar.c = j();
            }
        }
        eeir eeirVar = new eeir();
        eeirVar.a = eeisVar;
        return eeirVar;
    }

    public final eeit e() {
        return i(true);
    }

    public final eeit i(boolean z) {
        Vector g = this.a.g(2);
        eejj eejjVar = (eejj) g.elementAt(0);
        eejj eejjVar2 = (eejj) g.elementAt(1);
        int i = eejjVar.b;
        if (i == 2051) {
            if (eejjVar2.b == 58) {
                return c(z);
            }
            throw f("Expecting ':'");
        }
        if (i == 2105) {
            if (eejjVar2.b == 58) {
                return d();
            }
            throw f("Expecting ':'");
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String str = null;
            try {
                char o = this.a.o(0);
                if (o(o)) {
                    this.a.q(1);
                    str = eejb.b(o);
                } else {
                    if (o != ';' && o != '/' && o != '?' && o != ':' && o != '@' && o != '&' && o != '+' && o != '$' && o != '=' && o != ',') {
                        if (n()) {
                            String m = this.a.m();
                            this.a.q(3);
                            str = m;
                        }
                    }
                    this.a.q(1);
                    str = eejb.b(o);
                }
            } catch (Exception unused) {
            }
            if (str == null) {
                try {
                    return new eeit(stringBuffer.toString());
                } catch (eeje e) {
                    throw f(e.getMessage());
                }
            }
            stringBuffer.append(str);
        }
    }

    public eenb(String str) {
        this.a = new eemn("sip_urlLexer", str);
    }
}
