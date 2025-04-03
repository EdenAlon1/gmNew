package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeiy {
    public static final eeiz a(eejf eejfVar) {
        StringBuilder sb = new StringBuilder();
        if (eejfVar.a.o(0) == '[') {
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                if (!eejfVar.a.r()) {
                    break;
                }
                char o = eejfVar.a.o(0);
                if (eejh.u(o)) {
                    eejfVar.a.q(1);
                    sb2.append(o);
                } else if (o == '.' || o == ':' || o == '[') {
                    eejfVar.a.q(1);
                    sb2.append(o);
                } else if (o == ']') {
                    eejfVar.a.q(1);
                    sb2.append(']');
                    sb.append(sb2.toString());
                }
            }
            eejb eejbVar = eejfVar.a;
            String valueOf = String.valueOf(eejbVar.f);
            int i = eejbVar.g;
            throw new eeje(valueOf.concat(": Illegal Host name "));
        }
        sb.append(b(eejfVar));
        while (eejfVar.a.r() && eejfVar.a.o(0) == '.') {
            eejfVar.a.q(1);
            String b = b(eejfVar);
            sb.append(".");
            sb.append(b);
        }
        String sb3 = sb.toString();
        if (sb3.equals("")) {
            eejb eejbVar2 = eejfVar.a;
            String valueOf2 = String.valueOf(eejbVar2.f);
            int i2 = eejbVar2.g;
            throw new eeje(valueOf2.concat(": Illegal Host name "));
        }
        eeix eeixVar = new eeix(sb3);
        eeiz eeizVar = new eeiz();
        eeizVar.a = eeixVar;
        if (!eejfVar.a.r() || eejfVar.a.o(0) != ':') {
            return eeizVar;
        }
        eejfVar.a.q(1);
        try {
            eeizVar.b = Integer.parseInt(eejfVar.a.d());
            return eeizVar;
        } catch (NumberFormatException unused) {
            eejb eejbVar3 = eejfVar.a;
            String valueOf3 = String.valueOf(eejbVar3.f);
            int i3 = eejbVar3.g;
            throw new eeje(valueOf3.concat(" :Error parsing port "));
        }
    }

    protected static final String b(eejf eejfVar) {
        StringBuilder sb = new StringBuilder();
        while (eejfVar.a.r()) {
            char o = eejfVar.a.o(0);
            if (!eejh.s(o)) {
                if (!Character.isDigit(o)) {
                    if (o != '-') {
                        break;
                    }
                    eejfVar.a.q(1);
                    sb.append('-');
                } else {
                    eejfVar.a.q(1);
                    sb.append(o);
                }
            } else {
                eejfVar.a.q(1);
                sb.append(o);
            }
        }
        return sb.toString();
    }
}
