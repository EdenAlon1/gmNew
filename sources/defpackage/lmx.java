package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmx {
    public final Map a = new LinkedHashMap();

    public final lml a(String str) {
        str.getClass();
        return (lml) this.a.get(str);
    }

    public final Set b() {
        return new HashSet(this.a.keySet());
    }

    public final void c() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((lml) it.next()).fC();
        }
        this.a.clear();
    }
}
