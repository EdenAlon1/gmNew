package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhd {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final Set b = new HashSet();
    public boolean c;

    public final boolean a(rib ribVar) {
        boolean z = true;
        if (ribVar == null) {
            return true;
        }
        Set set = this.a;
        Set set2 = this.b;
        boolean remove = set.remove(ribVar);
        if (!set2.remove(ribVar) && !remove) {
            z = false;
        }
        if (z) {
            ribVar.c();
        }
        return z;
    }

    public final String toString() {
        Set set = this.a;
        return super.toString() + "{numRequests=" + set.size() + ", isPaused=" + this.c + "}";
    }
}
