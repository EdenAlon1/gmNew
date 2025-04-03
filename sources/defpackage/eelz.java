package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eelz {
    public static final eeio a(eemq eemqVar) {
        return b(false, eemqVar);
    }

    public static final eeio b(boolean z, eemq eemqVar) {
        int i = 0;
        while (eemqVar.a.r() && eemqVar.a.o(i) != '<' && eemqVar.a.o(i) != '\"' && eemqVar.a.o(i) != ':' && eemqVar.a.o(i) != '/') {
            if (eemqVar.a.o(i) == 0) {
                throw eemqVar.f("unexpected EOL");
            }
            i++;
        }
        if (eemqVar.a.o(i) != '<' && eemqVar.a.o(i) != '\"') {
            if (eemqVar.a.o(i) != ':' && eemqVar.a.o(i) != '/') {
                throw eemqVar.f("Bad address spec");
            }
            eeio eeioVar = new eeio();
            eeit i2 = new eenb((eemn) eemqVar.a).i(z);
            eeioVar.c = 2;
            eeioVar.b = i2;
            return eeioVar;
        }
        eeio eeioVar2 = new eeio();
        if (eemqVar.a.o(0) == '\"') {
            String e = eemqVar.a.e();
            if (e == null) {
                throw new eeje("Name is null");
            }
            eeioVar2.d(e.trim());
            eemqVar.a.h();
        }
        if (eemqVar.a.o(0) == '<') {
            c(eeioVar2, eemqVar);
            return eeioVar2;
        }
        if (eeioVar2.a != null) {
            eemqVar.a.j("sip_urlLexer");
            eemqVar.a.h();
            eeit i3 = new eenb((eemn) eemqVar.a).i(false);
            eeioVar2.c = 1;
            eeioVar2.b = i3;
            eemqVar.a.h();
            return eeioVar2;
        }
        eejb eejbVar = eemqVar.a;
        int i4 = eejbVar.g;
        StringBuilder sb = new StringBuilder();
        while (true) {
            char o = eejbVar.o(0);
            if (o == 0) {
                String valueOf = String.valueOf(eejbVar.f);
                int i5 = eejbVar.g;
                eeje eejeVar = new eeje(valueOf.concat("unexpected EOL"));
                eejbVar.g = i4;
                throw eejeVar;
            }
            if (o == ' ') {
                eejbVar.q(1);
                String sb2 = sb.toString();
                eemqVar.a.h();
                if (eemqVar.a.o(0) != '<') {
                    throw eemqVar.f("Bad address spec");
                }
                eeioVar2.d(sb2);
                c(eeioVar2, eemqVar);
                return eeioVar2;
            }
            if (o == '\\') {
                eejbVar.q(1);
                char o2 = eejbVar.o(0);
                if (o2 == 0) {
                    String valueOf2 = String.valueOf(eejbVar.f);
                    int i6 = eejbVar.g;
                    eeje eejeVar2 = new eeje(valueOf2.concat("unexpected EOL"));
                    eejbVar.g = i4;
                    throw eejeVar2;
                }
                eejbVar.q(1);
                sb.append(o2);
            } else {
                eejbVar.q(1);
                sb.append(o);
            }
        }
    }

    private static final void c(eeio eeioVar, eemq eemqVar) {
        eemqVar.a.a(60);
        eemqVar.a.j("sip_urlLexer");
        eemqVar.a.h();
        eeit e = new eenb((eemn) eemqVar.a).e();
        eeioVar.c = 1;
        eeioVar.b = e;
        eemqVar.a.h();
        eemqVar.a.a(62);
    }
}
