package defpackage;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdxd {
    public static final fdxd a;
    private static final IdentityHashMap c;
    public final IdentityHashMap b;

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        c = identityHashMap;
        a = new fdxd(identityHashMap);
    }

    public fdxd(IdentityHashMap identityHashMap) {
        this.b = identityHashMap;
    }

    public final Object a(fdxc fdxcVar) {
        return this.b.get(fdxcVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fdxd fdxdVar = (fdxd) obj;
        if (this.b.size() != fdxdVar.b.size()) {
            return false;
        }
        for (Map.Entry entry : this.b.entrySet()) {
            if (!fdxdVar.b.containsKey(entry.getKey()) || !emxb.a(entry.getValue(), fdxdVar.b.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            i += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i;
    }

    public final String toString() {
        return this.b.toString();
    }
}
