package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyk extends lml {
    public final Map a = new LinkedHashMap();

    public final void a(String str) {
        lmx lmxVar = (lmx) this.a.remove(str);
        if (lmxVar != null) {
            lmxVar.c();
        }
    }

    @Override // defpackage.lml
    protected final void fD() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((lmx) it.next()).c();
        }
        this.a.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(ffcw.b(System.identityHashCode(this) & 4294967295L, 16));
        sb.append("} ViewModelStores (");
        Iterator it = this.a.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
