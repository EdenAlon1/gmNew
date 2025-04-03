package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lnx {
    public final Map b = new LinkedHashMap();

    public abstract Object a(lnw lnwVar);

    public final boolean equals(Object obj) {
        return (obj instanceof lnx) && ffkj.e(this.b, ((lnx) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.b + ')';
    }
}
