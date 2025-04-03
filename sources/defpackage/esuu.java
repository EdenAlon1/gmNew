package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esuu {
    public final fcek a;
    public final Iterable b;

    public esuu(fcek fcekVar, Iterable iterable) {
        this.a = fcekVar;
        this.b = iterable;
    }

    public final Set a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ffdx.w(arrayList, ((esus) it.next()).a);
        }
        return ffdx.ar(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esuu)) {
            return false;
        }
        esuu esuuVar = (esuu) obj;
        return ffkj.e(this.a, esuuVar.a) && ffkj.e(this.b, esuuVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "UserRegistration(id=" + this.a + ", devices=" + this.b + ")";
    }
}
