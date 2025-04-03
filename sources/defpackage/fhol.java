package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhol implements Serializable {
    private static final long serialVersionUID = 1;
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();
    public final List c = new ArrayList();
    public final Map d = new LinkedHashMap();

    public final List a() {
        return new ArrayList(this.a.values());
    }

    public final fhok b(fhoj fhojVar) {
        return (fhok) this.d.get(fhojVar.a);
    }

    public final boolean c(String str) {
        Map map = this.a;
        String a = fhop.a(str);
        return map.containsKey(a) || this.b.containsKey(a);
    }

    public final void d(fhoj fhojVar) {
        if (fhojVar.b()) {
            this.b.put(fhojVar.b, fhojVar);
        }
        this.a.put(fhojVar.a, fhojVar);
    }

    public final String toString() {
        return "[ Options: [ short " + this.a.toString() + " ] [ long " + this.b + " ]";
    }
}
