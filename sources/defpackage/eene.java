package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eene {
    public static final eekg a(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(a.h(i, "bad arg "));
        }
        eekg eekgVar = new eekg();
        eekgVar.f(str);
        eekgVar.g(i);
        return eekgVar;
    }

    public static final eekh b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null arg callId");
        }
        eekh eekhVar = new eekh();
        eekhVar.b(str);
        return eekhVar;
    }

    public static final eekn c(int i) {
        eekn eeknVar = new eekn();
        eeknVar.b(i);
        return eeknVar;
    }

    public static final eeko d(String str, String str2) {
        eeko eekoVar = new eeko();
        eekoVar.g(str);
        eekoVar.f(str2);
        return eekoVar;
    }

    public static final eekr e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.h(i, "bad value "));
        }
        eekr eekrVar = new eekr();
        eekrVar.e(i);
        return eekrVar;
    }

    public static final eekt f(eeio eeioVar, String str) {
        eekt eektVar = new eekt();
        eektVar.a = eeioVar;
        eektVar.e(str);
        return eektVar;
    }

    public static final eeku g(String str, String str2) {
        String concat;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(str2);
        String stringBuffer2 = stringBuffer.toString();
        Class cls = (Class) eeky.a.get(str.toLowerCase(Locale.US));
        if (cls == null) {
            eeks eeksVar = new eeks();
            eeksVar.c = str;
            eeksVar.d = str2;
            return eeksVar;
        }
        if (str2 == null) {
            try {
                ((eeku) cls.newInstance()).c = str;
            } catch (Exception unused) {
                throw new eeje("Problems creating header!");
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            concat = stringBuffer2.concat("\n\n");
            if (concat.charAt(i) != '\n' && concat.charAt(i) != '\t' && concat.charAt(i) != ' ') {
                break;
            }
            i++;
        }
        while (i < concat.length()) {
            if (i < concat.length() - 1 && concat.charAt(i) == '\n') {
                int i2 = i + 1;
                if (concat.charAt(i2) == '\t' || concat.charAt(i2) == ' ') {
                    sb.append(' ');
                    i = i2;
                    i++;
                }
            }
            sb.append(concat.charAt(i));
            i++;
        }
        sb.append("\n");
        eemm a = eemr.a(sb.toString());
        if (a == null) {
            throw new eeje("could not create parser");
        }
        eeku b = a.b();
        if (!(b instanceof eekv)) {
            return b;
        }
        eekv eekvVar = (eekv) b;
        if (eekvVar.b() <= 1) {
            return eekvVar.f();
        }
        throw new eeje("Only singleton allowed !");
    }

    public static final eekw h(int i) {
        eekw eekwVar = new eekw();
        eekwVar.b(i);
        return eekwVar;
    }

    public static final eell i(eeio eeioVar, String str) {
        eell eellVar = new eell();
        eellVar.a = eeioVar;
        if (str != null) {
            eellVar.f(str);
        }
        return eellVar;
    }

    public static final eelo j(String str, int i, String str2, String str3) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("null arg");
        }
        eelo eeloVar = new eelo();
        eeloVar.e(str3);
        eeloVar.b.a = new eeix(str);
        eeloVar.b.b = i;
        eeloVar.p(str2);
        return eeloVar;
    }
}
