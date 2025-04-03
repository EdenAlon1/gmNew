package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class djti {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final String c;

    public djti(String str) {
        this.c = str;
    }

    public final int a(String str, int i) {
        String e = e(str);
        if (e != null) {
            try {
                return Integer.parseInt(e);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public final djti b(String str) {
        djti djtiVar = new djti(str);
        this.b.add(djtiVar);
        return djtiVar;
    }

    public final djti c(String str) {
        for (djti djtiVar : this.b) {
            if (emuz.e(djtiVar.c, str)) {
                return djtiVar;
            }
        }
        return null;
    }

    public final djti d(String str, String str2) {
        for (djti djtiVar : this.b) {
            String e = djtiVar.e(str);
            if (e != null && emuz.e(e, str2)) {
                return djtiVar;
            }
        }
        return null;
    }

    public final String e(String str) {
        for (djth djthVar : this.a) {
            if (emuz.e(djthVar.a, str)) {
                return emuz.e(djthVar.b, "X") ? "" : djthVar.b;
            }
        }
        return null;
    }

    public final boolean f(String str) {
        return e(str) != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(" : {\r\n");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            sb.append((djti) it.next());
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            sb.append((djth) it2.next());
        }
        sb.append("}\r\n");
        return sb.toString();
    }
}
