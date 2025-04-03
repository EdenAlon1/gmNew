package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eenj {
    public final eelv a;
    public String b;
    private List c;

    public eenj(eelv eelvVar) {
        this.a = eelvVar;
    }

    public final int a() {
        eekg eekgVar = this.a.g;
        if (eekgVar == null) {
            return -1;
        }
        return eekgVar.b();
    }

    public final eekk b() {
        return (eekk) this.a.d("Contact");
    }

    public final eenh c(String str) {
        List<eenh> o = o();
        if (o != null && !o.isEmpty()) {
            for (eenh eenhVar : o) {
                if (eenhVar.b.equals(str)) {
                    return eenhVar;
                }
            }
        }
        return null;
    }

    public final String d() {
        return this.a.h();
    }

    public final String e() {
        eekk b = b();
        if (b != null) {
            return b.a();
        }
        return null;
    }

    public final String f() {
        eekk b = b();
        if (b != null) {
            return b.a.b.toString();
        }
        return null;
    }

    public final String g() {
        byte[] bArr = this.a.k;
        if (bArr != null) {
            return new String(bArr);
        }
        return null;
    }

    public final String h() {
        eeku d = this.a.d(fhpi.a);
        if (d != null) {
            return d.a();
        }
        return null;
    }

    public final String i() {
        eekt eektVar = this.a.e;
        if (eektVar == null) {
            return null;
        }
        return eektVar.a();
    }

    public final String j(String str) {
        if (this.a.q(str)) {
            return this.a.e(str).a();
        }
        return null;
    }

    public final String k(String str, String str2) {
        eejd d;
        eeku d2 = this.a.d(str);
        if (d2 == null || (d = d2.d()) == null) {
            return null;
        }
        return d.d(str2);
    }

    public final String l() {
        eell eellVar = this.a.f;
        if (eellVar == null) {
            return null;
        }
        return eellVar.a();
    }

    public final String m() {
        eell eellVar = this.a.f;
        if (eellVar == null) {
            return null;
        }
        return eellVar.a.b.toString();
    }

    public final String n() {
        StringBuilder sb = new StringBuilder();
        if (x()) {
            sb.append(((eelx) this.a).a.a());
        } else {
            eelw eelwVar = (eelw) this.a;
            sb.append(eelwVar.i());
            sb.append(" ");
            if (((Boolean) dinr.g.a()).booleanValue()) {
                sb.append(eelwVar.w());
            } else {
                sb.append("(redacted)");
            }
            sb.append(" SIP/2.0\n");
        }
        for (eeku eekuVar : this.a.d) {
            sb.append(eekuVar.c);
            sb.append(": ");
            if (!emxe.c(eekuVar.c) && ((emuz.e(eekuVar.c, "To") || emuz.e(eekuVar.c, "From") || emuz.e(eekuVar.c, "Via") || emuz.e(eekuVar.c, "Call-Id") || emuz.e(eekuVar.c, "Subject") || emuz.e(eekuVar.c, "Contact") || emuz.e(eekuVar.c, "Authorization") || emuz.e(eekuVar.c, "Reason") || emuz.e(eekuVar.c, "Refer-To") || emuz.e(eekuVar.c, "Referred-By") || emuz.e(eekuVar.c, "Refer-Sub") || emuz.e(eekuVar.c, "Security-Verify") || emuz.e(eekuVar.c, "P-Preferred-Identity") || emuz.e(eekuVar.c, "P-Asserted-Identity") || emuz.e(eekuVar.c, "P-Called-Party-ID") || emuz.e(eekuVar.c, "P-Associated-Uri") || emuz.e(eekuVar.c, "P-Associated-To") || emuz.e(eekuVar.c, "P-Access-Network-Info") || emuz.e(eekuVar.c, "P-Last-Access-Network-Info")) && !((Boolean) dinr.g.a()).booleanValue())) {
                sb.append("(redacted)");
            } else {
                sb.append(eekuVar.a());
            }
            sb.append("\n");
        }
        byte[] bArr = this.a.k;
        if (bArr != null && bArr.length > 0) {
            sb.append("\n");
            if (((Boolean) dinr.g.a()).booleanValue()) {
                sb.append(g());
                sb.append("\n");
            } else {
                String str = this.b;
                if (str != null) {
                    sb.append(str);
                } else {
                    List o = o();
                    for (int i = 0; i < o.size(); i++) {
                        if (o.get(i) != null) {
                            sb.append(((eenh) o.get(i)).c());
                        }
                        if (i != o.size() - 1) {
                            sb.append("\n");
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

    public final List o() {
        ArrayList arrayList;
        if (this.c == null) {
            try {
                byte[] bArr = this.a.k;
                if ("0".equals(j("Content-Length"))) {
                    arrayList = new ArrayList();
                } else {
                    eenh[] e = eenh.e(bArr, h());
                    ArrayList arrayList2 = new ArrayList();
                    for (eenh eenhVar : e) {
                        arrayList2.add(eenhVar);
                    }
                    arrayList = arrayList2;
                }
                this.c = arrayList;
            } catch (Exception unused) {
                this.c = new ArrayList();
            }
        }
        return this.c;
    }

    public final List p() {
        return this.a.g().a;
    }

    public final void q(eeku eekuVar) {
        this.a.k(eekuVar);
    }

    public final void r(String str) {
        eenf.b(this.a, str);
    }

    public final void s(String str, String str2) {
        this.a.k(eene.g(str, str2));
    }

    public final void t(String str) {
        this.a.m(str);
    }

    public final void u(eeku eekuVar) {
        this.a.p(eekuVar);
    }

    public final boolean v(String str) {
        return this.a.q(str);
    }

    public final boolean w() {
        String j = j("Contact");
        if (j == null) {
            return false;
        }
        return j.contains("automata");
    }

    public abstract boolean x();
}
