package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhfh {
    public static final fhfh a = new fhfh(ffdx.ar(new ArrayList()), null);
    public final fhlu b;
    private final Set c;

    public fhfh(Set set, fhlu fhluVar) {
        this.c = set;
        this.b = fhluVar;
    }

    public final fhfh a(fhlu fhluVar) {
        return ffkj.e(this.b, fhluVar) ? this : new fhfh(this.c, fhluVar);
    }

    public final void b() {
        Iterator it = this.c.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fhfh)) {
            return false;
        }
        fhfh fhfhVar = (fhfh) obj;
        return ffkj.e(fhfhVar.c, this.c) && ffkj.e(fhfhVar.b, this.b);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() + 1517;
        fhlu fhluVar = this.b;
        return (hashCode * 41) + (fhluVar != null ? fhluVar.hashCode() : 0);
    }
}
