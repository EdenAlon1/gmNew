package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avjf {
    public static final cskc a = cskc.g("Bugle", "RbmBusinessLogger");
    public final ffbr b;
    public final errl c;
    public final akzt d;

    public avjf(ffbr ffbrVar, errl errlVar, akzt akztVar) {
        this.b = ffbrVar;
        this.c = errlVar;
        this.d = akztVar;
    }

    public static String a(String str) {
        int indexOf = str.indexOf(64);
        return Pattern.matches("\\+[01234567890]+", indexOf >= 0 ? str.substring(0, indexOf) : str) ? "REDACTED-phone number" : str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int j(String str) {
        char c;
        if (str == null) {
            return 1;
        }
        switch (str.hashCode()) {
            case 112701:
                if (str.equals("rbm")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 114009:
                if (str.equals("sms")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3213448:
                if (str.equals("http")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 99617003:
                if (str.equals("https")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 109566356:
                if (str.equals("smsto")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return 2;
        }
        if (c == 2 || c == 3) {
            return 3;
        }
        return c != 4 ? 1 : 4;
    }

    private final void n(eqdv eqdvVar) {
        eqeb eqebVar = (eqeb) eqec.a.createBuilder();
        eqebVar.copyOnWrite();
        eqec eqecVar = (eqec) eqebVar.instance;
        eqdvVar.getClass();
        eqecVar.d = eqdvVar;
        eqecVar.c = 12;
        f((eqec) eqebVar.build());
    }

    private final void o(eqes eqesVar) {
        eqeb eqebVar = (eqeb) eqec.a.createBuilder();
        eqebVar.copyOnWrite();
        eqec eqecVar = (eqec) eqebVar.instance;
        eqesVar.getClass();
        eqecVar.d = eqesVar;
        eqecVar.c = 9;
        f((eqec) eqebVar.build());
    }

    public final void b(String str) {
        eqdt eqdtVar = (eqdt) eqdv.a.createBuilder();
        eqdtVar.copyOnWrite();
        eqdv eqdvVar = (eqdv) eqdtVar.instance;
        eqdvVar.c = 1;
        eqdvVar.b |= 1;
        eqdtVar.copyOnWrite();
        eqdv eqdvVar2 = (eqdv) eqdtVar.instance;
        eqdvVar2.f = 1;
        eqdvVar2.b |= 8;
        if (str != null) {
            eqdtVar.copyOnWrite();
            eqdv eqdvVar3 = (eqdv) eqdtVar.instance;
            eqdvVar3.b |= 4;
            eqdvVar3.e = str;
        }
        n((eqdv) eqdtVar.build());
    }

    public final void c(String str, String str2) {
        eqdt eqdtVar = (eqdt) eqdv.a.createBuilder();
        eqdtVar.copyOnWrite();
        eqdv eqdvVar = (eqdv) eqdtVar.instance;
        eqdvVar.c = 2;
        eqdvVar.b |= 1;
        eqdtVar.copyOnWrite();
        eqdv eqdvVar2 = (eqdv) eqdtVar.instance;
        eqdvVar2.f = 1;
        eqdvVar2.b |= 8;
        if (str != null) {
            eqdtVar.copyOnWrite();
            eqdv eqdvVar3 = (eqdv) eqdtVar.instance;
            eqdvVar3.b |= 4;
            eqdvVar3.e = str;
        }
        eqeb eqebVar = (eqeb) eqec.a.createBuilder();
        eqdv eqdvVar4 = (eqdv) eqdtVar.build();
        eqebVar.copyOnWrite();
        eqec eqecVar = (eqec) eqebVar.instance;
        eqdvVar4.getClass();
        eqecVar.d = eqdvVar4;
        eqecVar.c = 12;
        String a2 = a(str2);
        eqebVar.copyOnWrite();
        eqec eqecVar2 = (eqec) eqebVar.instance;
        a2.getClass();
        eqecVar2.b |= 1;
        eqecVar2.e = a2;
        f((eqec) eqebVar.build());
    }

    public final void d(eqea eqeaVar, String str) {
        e(eqeaVar, str, null, null);
    }

    public final void e(eqea eqeaVar, String str, String str2, String str3) {
        eqeb eqebVar = (eqeb) eqec.a.createBuilder();
        eqdw eqdwVar = (eqdw) eqeaVar.toBuilder();
        eqdwVar.copyOnWrite();
        eqea eqeaVar2 = (eqea) eqdwVar.instance;
        eqeaVar2.f = j(str2) - 1;
        eqeaVar2.b |= 8;
        if (str3 != null) {
            eqdwVar.copyOnWrite();
            eqea eqeaVar3 = (eqea) eqdwVar.instance;
            eqeaVar3.b |= 16;
            eqeaVar3.g = str3;
        }
        eqea eqeaVar4 = (eqea) eqdwVar.build();
        eqebVar.copyOnWrite();
        eqec eqecVar = (eqec) eqebVar.instance;
        eqeaVar4.getClass();
        eqecVar.d = eqeaVar4;
        eqecVar.c = 14;
        if (str != null) {
            String a2 = a(str);
            eqebVar.copyOnWrite();
            eqec eqecVar2 = (eqec) eqebVar.instance;
            a2.getClass();
            eqecVar2.b |= 1;
            eqecVar2.e = a2;
        }
        f((eqec) eqebVar.build());
    }

    public final void f(eqec eqecVar) {
        akxl akxlVar = (akxl) this.b.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.RBM_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqecVar.getClass();
        eolvVar2.aO = eqecVar;
        eolvVar2.e |= 2048;
        akxlVar.o(eoluVar);
    }

    public final void g(eqeq eqeqVar, String str) {
        eqeb eqebVar = (eqeb) eqec.a.createBuilder();
        eqebVar.copyOnWrite();
        eqec eqecVar = (eqec) eqebVar.instance;
        eqeqVar.getClass();
        eqecVar.d = eqeqVar;
        eqecVar.c = 15;
        if (str != null) {
            String a2 = a(str);
            eqebVar.copyOnWrite();
            eqec eqecVar2 = (eqec) eqebVar.instance;
            a2.getClass();
            eqecVar2.b |= 1;
            eqecVar2.e = a2;
        }
        f((eqec) eqebVar.build());
    }

    public final void h(eqev eqevVar) {
        eqer eqerVar = (eqer) eqes.a.createBuilder();
        eqerVar.copyOnWrite();
        eqes eqesVar = (eqes) eqerVar.instance;
        eqevVar.getClass();
        eqesVar.c = eqevVar;
        eqesVar.b = 2;
        o((eqes) eqerVar.build());
    }

    public final void i(eqey eqeyVar) {
        eqer eqerVar = (eqer) eqes.a.createBuilder();
        eqerVar.copyOnWrite();
        eqes eqesVar = (eqes) eqerVar.instance;
        eqeyVar.getClass();
        eqesVar.c = eqeyVar;
        eqesVar.b = 1;
        o((eqes) eqerVar.build());
    }

    public final void k(int i, String str) {
        eqeb eqebVar = (eqeb) eqec.a.createBuilder();
        eqdc eqdcVar = (eqdc) eqde.a.createBuilder();
        eqdcVar.copyOnWrite();
        eqde eqdeVar = (eqde) eqdcVar.instance;
        eqdeVar.c = i - 1;
        eqdeVar.b |= 1;
        eqebVar.copyOnWrite();
        eqec eqecVar = (eqec) eqebVar.instance;
        eqde eqdeVar2 = (eqde) eqdcVar.build();
        eqdeVar2.getClass();
        eqecVar.d = eqdeVar2;
        eqecVar.c = 3;
        if (!TextUtils.isEmpty(str)) {
            String a2 = a(str);
            eqebVar.copyOnWrite();
            eqec eqecVar2 = (eqec) eqebVar.instance;
            a2.getClass();
            eqecVar2.b |= 1;
            eqecVar2.e = a2;
        }
        akxl akxlVar = (akxl) this.b.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.RBM_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqec eqecVar3 = (eqec) eqebVar.build();
        eqecVar3.getClass();
        eolvVar2.aO = eqecVar3;
        eolvVar2.e |= 2048;
        akxlVar.j(eoluVar);
    }

    public final void l(String str, int i) {
        eqdt eqdtVar = (eqdt) eqdv.a.createBuilder();
        eqdtVar.copyOnWrite();
        eqdv eqdvVar = (eqdv) eqdtVar.instance;
        eqdvVar.c = 3;
        eqdvVar.b |= 1;
        eqdtVar.copyOnWrite();
        eqdv eqdvVar2 = (eqdv) eqdtVar.instance;
        eqdvVar2.d = i - 1;
        eqdvVar2.b |= 2;
        eqdtVar.copyOnWrite();
        eqdv eqdvVar3 = (eqdv) eqdtVar.instance;
        eqdvVar3.f = 1;
        eqdvVar3.b |= 8;
        if (str != null) {
            eqdtVar.copyOnWrite();
            eqdv eqdvVar4 = (eqdv) eqdtVar.instance;
            eqdvVar4.b |= 4;
            eqdvVar4.e = str;
        }
        n((eqdv) eqdtVar.build());
    }

    public final void m(int i, String str, String str2, String str3) {
        eqdw eqdwVar = (eqdw) eqea.a.createBuilder();
        eqdwVar.copyOnWrite();
        eqea eqeaVar = (eqea) eqdwVar.instance;
        eqeaVar.c = 4;
        eqeaVar.b |= 1;
        eqdwVar.copyOnWrite();
        eqea eqeaVar2 = (eqea) eqdwVar.instance;
        eqeaVar2.d = i - 1;
        eqeaVar2.b |= 2;
        eqdwVar.copyOnWrite();
        eqea eqeaVar3 = (eqea) eqdwVar.instance;
        eqeaVar3.f = j(str2) - 1;
        eqeaVar3.b |= 8;
        e((eqea) eqdwVar.build(), str, str2, str3);
    }
}
