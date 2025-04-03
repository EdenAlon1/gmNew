package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbb {
    public View b;
    public final Map a = new HashMap();
    final ArrayList c = new ArrayList();

    @Deprecated
    public pbb() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pbb)) {
            return false;
        }
        pbb pbbVar = (pbb) obj;
        return this.b == pbbVar.b && this.a.equals(pbbVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        String concat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n").concat("    values:");
        for (String str : this.a.keySet()) {
            concat = concat + "    " + str + ": " + this.a.get(str) + "\n";
        }
        return concat;
    }

    public pbb(View view) {
        this.b = view;
    }
}
