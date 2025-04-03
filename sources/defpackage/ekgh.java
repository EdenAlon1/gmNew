package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekgh {
    public final Set a = new HashSet();
    public final Set b = new HashSet();
    public final Map c = new HashMap();
    public boolean d;

    public final boolean a() {
        Collection values = this.c.values();
        if ((values instanceof Collection) && values.isEmpty()) {
            return false;
        }
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (((ekbo) it.next()).d()) {
                return true;
            }
        }
        return false;
    }
}
