package defpackage;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfmi {
    public static final dfmi a;
    public static final dfmi b;
    public static final dfmi c;
    public final enip d;

    static {
        enip enipVar;
        EnumSet allOf = EnumSet.allOf(dfmj.class);
        if (allOf instanceof Collection) {
            enipVar = allOf.isEmpty() ? enpd.a : engn.a(EnumSet.copyOf((Collection) allOf));
        } else {
            Iterator it = allOf.iterator();
            if (it.hasNext()) {
                EnumSet of = EnumSet.of((Enum) it.next());
                enju.l(of, it);
                enipVar = engn.a(of);
            } else {
                enipVar = enpd.a;
            }
        }
        a = new dfmi(enipVar);
        b = new dfmi(enpd.a);
        c = new dfmi(engn.a(EnumSet.of(dfmj.ZWIEBACK, new dfmj[0])));
    }

    public dfmi(enip enipVar) {
        this.d = enipVar;
    }

    public final boolean a(dfmj dfmjVar) {
        return this.d.contains(dfmjVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dfmi) && this.d.equals(((dfmi) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
