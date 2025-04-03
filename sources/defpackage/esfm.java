package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esfm implements esfl {
    private final esfk a;
    private final enhk b;
    private final esgb c = new esgb(enip.r("DE", "TW"));

    public esfm(esfk esfkVar) {
        this.a = esfkVar;
        this.b = enhk.m(52, new esfz(esfkVar), 54, new esfw(esfkVar));
        enhk.l("AR", new esga());
    }

    @Override // defpackage.esfk
    public final int a(String str) {
        evqu evquVar = ((esfq) this.a).a;
        evpx n = esfq.n(str);
        if (evquVar.r(n)) {
            return evquVar.a(n);
        }
        evqu.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.PhoneNumberUtil", "getCountryCodeForRegion", a.a(n == null ? "null" : n.eW, "Invalid or missing region code (", ") provided."));
        return 0;
    }

    @Override // defpackage.esfk
    public final String b(esfh esfhVar, esfi esfiVar) {
        esfx esfxVar = (esfx) this.b.get(Integer.valueOf(esfhVar.a()));
        return (esfxVar == null || !this.a.g(esfhVar)) ? this.a.b(esfhVar, esfiVar) : esfxVar.a(esfhVar, esfiVar);
    }

    @Override // defpackage.esfk
    public final String c(esfh esfhVar, String str) {
        int indexOf;
        evrz evrzVar = ((esfp) esfhVar).a;
        evpx n = esfq.n(str);
        String str2 = evrzVar.h;
        int length = str2.length();
        evqu evquVar = ((esfq) this.a).a;
        String str3 = "";
        if (length == 0) {
            if (!evquVar.r(n)) {
                evqu.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.PhoneNumberUtil", "formatOutOfCountryCallingNumber", a.F(n, "Trying to format number from invalid region ", ". International formatting applied."));
                return evquVar.x(evrzVar, 2);
            }
            int i = evrzVar.c;
            String k = evquVar.k(evrzVar);
            if (!evquVar.o(i)) {
                return k;
            }
            if (i == 1) {
                if (evquVar.p(n)) {
                    return "1 ".concat(String.valueOf(evquVar.x(evrzVar, 3)));
                }
            } else if (i == evquVar.a(n)) {
                return evquVar.x(evrzVar, 3);
            }
            evqo f = evquVar.f(n);
            String str4 = f.p;
            if ((f.b & 1048576) != 0) {
                str3 = f.q;
            } else if (evqu.c.matcher(str4).matches()) {
                str3 = str4;
            }
            evqo g = evquVar.g(i, evquVar.c(i));
            StringBuilder sb = new StringBuilder(evquVar.y(k, g, 2));
            evquVar.z(evrzVar, g, 2, sb);
            if (str3.length() > 0) {
                sb.insert(0, " ").insert(0, i).insert(0, " ").insert(0, str3);
            } else {
                evquVar.A(i, 2, sb);
            }
            return sb.toString();
        }
        int i2 = evrzVar.c;
        if (!evquVar.o(i2)) {
            return str2;
        }
        String E = evqu.E(str2, evqu.b);
        String k2 = evquVar.k(evrzVar);
        if (k2.length() > 3 && (indexOf = E.indexOf(k2.substring(0, 3))) != -1) {
            E = E.substring(indexOf);
        }
        evqo f2 = evquVar.f(n);
        if (i2 == 1) {
            if (evquVar.p(n)) {
                return "1 ".concat(String.valueOf(E));
            }
        } else if (f2 != null && i2 == evquVar.a(n)) {
            evqh e = evquVar.e(f2.v, k2);
            if (e == null) {
                return E;
            }
            evqg evqgVar = (evqg) evqh.a.createBuilder();
            evqgVar.mergeFrom((evqg) e);
            evqgVar.copyOnWrite();
            evqh evqhVar = (evqh) evqgVar.instance;
            evqhVar.b |= 1;
            evqhVar.c = "(\\d+)(.*)";
            evqgVar.copyOnWrite();
            evqh evqhVar2 = (evqh) evqgVar.instance;
            evqhVar2.b |= 2;
            evqhVar2.d = "$1$2";
            return evquVar.B(E, (evqh) evqgVar.build(), 3);
        }
        if (f2 != null) {
            str3 = f2.p;
            if (!evqu.c.matcher(str3).matches()) {
                str3 = f2.q;
            }
        }
        StringBuilder sb2 = new StringBuilder(E);
        evqo g2 = evquVar.g(i2, evquVar.c(i2));
        evquVar.l(sb2);
        evquVar.z(evrzVar, g2, 2, sb2);
        if (str3.length() > 0) {
            sb2.insert(0, " ").insert(0, i2).insert(0, " ").insert(0, str3);
        } else {
            if (!evquVar.r(n)) {
                evqu.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.PhoneNumberUtil", "formatOutOfCountryKeepingAlphaChars", a.F(n, "Trying to format number from invalid region ", ". International formatting applied."));
            }
            evquVar.A(i2, 2, sb2);
        }
        return sb2.toString();
    }

    @Override // defpackage.esfk
    public final String d(esfh esfhVar) {
        return ((esfq) this.a).a.k(((esfp) esfhVar).a);
    }

    @Override // defpackage.esfk
    public final String e(int i) {
        return ((esfq) this.a).a.c(i).eW;
    }

    @Override // defpackage.esfk
    public final String f(esfh esfhVar) {
        evpx d = ((esfq) this.a).a.d(((esfp) esfhVar).a);
        if (d == null) {
            return null;
        }
        return d.eW;
    }

    @Override // defpackage.esfk
    public final boolean g(esfh esfhVar) {
        return this.a.g(esfhVar);
    }

    @Override // defpackage.esfk
    public final boolean h(String str, String str2) {
        evqu evquVar = ((esfq) this.a).a;
        try {
            return evquVar.q(evquVar.i(str, esfq.n(str2)));
        } catch (evqi unused) {
            return false;
        }
    }

    @Override // defpackage.esfk
    public final boolean i(esfh esfhVar) {
        evrz evrzVar = ((esfp) esfhVar).a;
        Integer valueOf = Integer.valueOf(evrzVar.c);
        evqv evqvVar = ((esfq) this.a).b;
        List<evpx> list = (List) evqvVar.c.get(valueOf);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        StringBuilder sb = new StringBuilder();
        if (evrzVar.f) {
            char[] cArr = new char[evrzVar.g];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(evrzVar.d);
        int length = sb.toString().length();
        for (evpx evpxVar : list) {
            evqo evqoVar = null;
            if (evpxVar != null) {
                try {
                    evru evruVar = evqvVar.b;
                    emxf.a(evqy.a(evpxVar));
                    evqoVar = ((evrp) ((evrv) evruVar).a.a(((evrv) evruVar).b.a(evpxVar))).b(evpxVar);
                } catch (IllegalArgumentException unused) {
                }
            }
            if (evqoVar != null) {
                evqs evqsVar = evqoVar.c;
                if (evqsVar == null) {
                    evqsVar = evqs.a;
                }
                if (evqsVar.d.contains(Integer.valueOf(length))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.esfk
    public final boolean j(esfh esfhVar) {
        return this.a.j(esfhVar);
    }

    @Override // defpackage.esfk
    public final int k(esfh esfhVar, esfh esfhVar2) {
        return esfq.o(((esfq) this.a).a.t(((esfp) esfhVar).a, ((esfp) esfhVar2).a));
    }

    @Override // defpackage.esfk
    public final int l(String str, String str2) {
        int t;
        evqu evquVar = ((esfq) this.a).a;
        try {
            t = evquVar.u(evquVar.i(str, evpx.ZZ), str2);
        } catch (evqi e) {
            if (e.a == 1) {
                try {
                    t = evquVar.u(evquVar.i(str2, evpx.ZZ), str);
                } catch (evqi e2) {
                    if (e2.a == 1) {
                        try {
                            evrw evrwVar = (evrw) evrz.a.createBuilder();
                            evrw evrwVar2 = (evrw) evrz.a.createBuilder();
                            evquVar.m(str, null, false, false, evrwVar);
                            evquVar.m(str2, null, false, false, evrwVar2);
                            t = evquVar.t((evrz) evrwVar.build(), (evrz) evrwVar2.build());
                        } catch (evqi unused) {
                            t = 1;
                            return esfq.o(t);
                        }
                    }
                    t = 1;
                }
            }
            t = 1;
        }
        return esfq.o(t);
    }

    @Override // defpackage.esfk
    public final int m(esfh esfhVar) {
        int w = ((esfq) this.a).a.w(((esfp) esfhVar).a) - 1;
        if (w == 0) {
            return 1;
        }
        if (w == 1) {
            return 2;
        }
        if (w == 2) {
            return 3;
        }
        if (w != 3) {
            return w != 4 ? 6 : 5;
        }
        return 4;
    }

    @Override // defpackage.esfl
    public final esfh n(CharSequence charSequence, String str) {
        String str2 = charSequence;
        str2 = charSequence;
        if (str != null && charSequence != null) {
            esgb esgbVar = this.c;
            str2 = charSequence;
            if (esgbVar.a.contains(emuz.d(str))) {
                String charSequence2 = charSequence.toString();
                boolean startsWith = charSequence2.startsWith("011");
                str2 = charSequence2;
                if (startsWith) {
                    int length = charSequence2.length();
                    str2 = charSequence2;
                    if (length >= 8) {
                        str2 = "+".concat(String.valueOf(charSequence2.substring(3)));
                    }
                }
            }
        }
        try {
            evqu evquVar = ((esfq) this.a).a;
            evqj c = evqk.c();
            c.b(true);
            ((evpz) c).a = esfq.n(str);
            return new esfp(evquVar.j(str2, c.a()));
        } catch (evqi e) {
            throw new esfo(e);
        }
    }

    @Override // defpackage.esfl
    public final String o(esfh esfhVar, esfi esfiVar) {
        return this.a.b(esfhVar, esfiVar);
    }

    @Override // defpackage.esfl
    public final /* synthetic */ void p() {
    }
}
