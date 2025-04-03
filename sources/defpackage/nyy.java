package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyy {
    public final String c;
    public final String d;
    public final String e;
    public String f;
    public boolean g;
    public final ffbz h;
    public final ffbz i;
    public String j;
    public final ffbz k;
    public boolean l;
    private final List q;
    private final ffbz r;
    private final ffbz s;
    private final ffbz t;
    private final ffbz u;
    private final ffbz v;
    private static final ffpa m = new ffpa("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final ffpa a = new ffpa("\\{(.+?)\\}");
    private static final ffpa n = new ffpa("http[s]?://");
    private static final ffpa o = new ffpa(".*");
    private static final ffpa p = new ffpa("([^/]*?|)");
    public static final ffpa b = new ffpa("^[^?#]+\\?([^#]*).*");

    public nyy(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        this.r = ffca.a(new nyw(this));
        this.s = ffca.a(new nyu(this));
        this.t = ffca.b(3, new nyx(this));
        this.u = ffca.b(3, new nyq(this));
        this.v = ffca.b(3, new nyp(this));
        this.h = ffca.b(3, new nys(this));
        this.i = ffca.a(new nyr(this));
        this.k = ffca.a(new nyv(this));
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!m.c(str)) {
                sb.append(n);
            }
            ffos e = new ffpa("(\\?|#|$)").e(str);
            if (e != null) {
                boolean z = false;
                String substring = str.substring(0, e.b().a);
                substring.getClass();
                h(substring, arrayList, sb);
                if (!o.c(sb) && !p.c(sb)) {
                    z = true;
                }
                this.l = z;
                sb.append("($|(\\?(.)*)|(#(.)*))");
            }
            this.f = j(sb.toString());
        }
        if (str3 == null) {
            return;
        }
        if (!new ffpa("^[\\s\\S]+/[\\s\\S]+$").d(str3)) {
            throw new IllegalArgumentException("The given mimeType " + str3 + " does not match to required \"type/subtype\" format");
        }
        nyn nynVar = new nyn(str3);
        this.j = ffpc.q("^(" + nynVar.a + "|[*]+)/(" + nynVar.b + "|[*]+)$", "*|[*]", "[\\s\\S]");
    }

    public static final void h(String str, List list, StringBuilder sb) {
        int i = 0;
        for (ffos e = a.e(str); e != null; e = e.c()) {
            ffor b2 = ((ffov) e).b.b(1);
            b2.getClass();
            list.add(b2.a);
            if (e.b().a > i) {
                String substring = str.substring(i, e.b().a);
                substring.getClass();
                sb.append(ffow.a(substring));
            }
            sb.append(p);
            i = e.b().b + 1;
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            substring2.getClass();
            sb.append(ffow.a(substring2));
        }
    }

    public static final void i(Bundle bundle, String str, String str2, nxe nxeVar) {
        if (nxeVar == null) {
            bundle.putString(str, str2);
            return;
        }
        str.getClass();
        oab oabVar = nxeVar.a;
        oabVar.f(bundle, str, oabVar.c(str2));
    }

    public static final String j(String str) {
        boolean I;
        boolean I2;
        boolean I3;
        I = ffpc.I(str, "\\Q", false);
        if (I) {
            I3 = ffpc.I(str, "\\E", false);
            if (I3) {
                return ffpc.q(str, ".*", "\\E.*\\Q");
            }
        }
        I2 = ffpc.I(str, "\\.\\*", false);
        return I2 ? ffpc.q(str, "\\.\\*", ".*") : str;
    }

    private final Map k() {
        return (Map) this.t.a();
    }

    public final List a() {
        Collection values = k().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ffdx.w(arrayList, ((nyo) it.next()).b);
        }
        return ffdx.ad(ffdx.ad(this.q, arrayList), b());
    }

    public final List b() {
        return (List) this.v.a();
    }

    public final ffcf c() {
        return (ffcf) this.u.a();
    }

    public final ffpa d() {
        return (ffpa) this.r.a();
    }

    public final boolean e(ffos ffosVar, Bundle bundle, Map map) {
        List list = this.q;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                ffdx.l();
            }
            String str = (String) obj;
            ffor b2 = ((ffov) ffosVar).b.b(i2);
            String a2 = b2 != null ? oac.a(b2.a) : null;
            nxe nxeVar = (nxe) map.get(str);
            if (a2 == null) {
                a2 = "";
            }
            try {
                i(bundle, str, a2, nxeVar);
                arrayList.add(ffcu.a);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof nyy)) {
            nyy nyyVar = (nyy) obj;
            if (ffkj.e(this.c, nyyVar.c) && ffkj.e(this.d, nyyVar.d) && ffkj.e(this.e, nyyVar.e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.Map] */
    public final boolean f(Uri uri, Bundle bundle, Map map) {
        Object obj;
        boolean z;
        String query;
        for (Map.Entry entry : k().entrySet()) {
            String str = (String) entry.getKey();
            nyo nyoVar = (nyo) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.g && (query = uri.getQuery()) != null && !ffkj.e(query, uri.toString())) {
                queryParameters = ffdx.b(query);
            }
            queryParameters.getClass();
            boolean z2 = false;
            Bundle a2 = kqr.a((ffcf[]) Arrays.copyOf(new ffcf[0], 0));
            Iterator it = nyoVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                nxe nxeVar = (nxe) map.get(str2);
                oab oabVar = nxeVar != null ? nxeVar.a : null;
                if ((oabVar instanceof nwt) && !nxeVar.c) {
                    oabVar.f(a2, str2, ((nwt) oabVar).a());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = nyoVar.a;
                ffos b2 = str4 != null ? new ffpa(str4).b(str3) : null;
                if (b2 == null) {
                    return z2;
                }
                List list = nyoVar.b;
                ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
                ?? r13 = z2;
                for (Object obj2 : list) {
                    int i = r13 + 1;
                    if (r13 < 0) {
                        ffdx.l();
                    }
                    String str5 = (String) obj2;
                    ffor b3 = ((ffov) b2).b.b(i);
                    String str6 = b3 != null ? b3.a : null;
                    nxe nxeVar2 = (nxe) map.get(str5);
                    try {
                        boolean containsKey = a2.containsKey(str5);
                        if (str6 == null) {
                            str6 = "";
                        }
                        if (containsKey) {
                            if (a2.containsKey(str5)) {
                                if (nxeVar2 != null) {
                                    oab oabVar2 = nxeVar2.a;
                                    Object b4 = oabVar2.b(a2, str5);
                                    str5.getClass();
                                    if (!a2.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this savedState.");
                                    }
                                    oabVar2.f(a2, str5, oabVar2.d(str6, b4));
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            obj = Boolean.valueOf(z);
                        } else {
                            i(a2, str5, str6, nxeVar2);
                            obj = ffcu.a;
                        }
                    } catch (IllegalArgumentException unused) {
                        obj = ffcu.a;
                    }
                    arrayList.add(obj);
                    r13 = i;
                    z2 = false;
                }
            }
            bundle.putAll(a2);
        }
        return true;
    }

    public final boolean g() {
        return ((Boolean) this.s.a()).booleanValue();
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.d;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = hashCode * 31;
        String str3 = this.e;
        return ((i + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }
}
