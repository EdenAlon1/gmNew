package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gae {
    public final String a = "yMMMM";
    private final String c = "yMMMd";
    private final String d = "yMMMMEEEEd";
    public final Map b = new LinkedHashMap();

    public final String a(Long l, Locale locale, boolean z) {
        if (l == null) {
            return null;
        }
        return hap.a(l.longValue(), z ? this.d : this.c, locale, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gae)) {
            return false;
        }
        gae gaeVar = (gae) obj;
        return ffkj.e(this.a, gaeVar.a) && ffkj.e(this.c, gaeVar.c) && ffkj.e(this.d, gaeVar.d);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }
}
