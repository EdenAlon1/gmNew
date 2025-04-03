package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhok implements Serializable {
    private static final long serialVersionUID = 1;
    public String a;
    private final Map b = new LinkedHashMap();

    public final void a(fhoj fhojVar) {
        if (fhojVar == null) {
            this.a = null;
            return;
        }
        String str = this.a;
        if (str != null && !str.equals(fhojVar.a)) {
            throw new fhoc(this, fhojVar);
        }
        this.a = fhojVar.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            fhoj fhojVar = (fhoj) it.next();
            String str = fhojVar.a;
            sb.append("-");
            sb.append(fhojVar.a);
            if (fhojVar.c != null) {
                sb.append(" ");
                sb.append(fhojVar.c);
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
