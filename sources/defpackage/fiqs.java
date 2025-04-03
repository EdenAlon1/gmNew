package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiqs {
    public final List a = new ArrayList();

    public static fiqs c(fiqr fiqrVar) {
        fiqs fiqsVar = new fiqs();
        fiqsVar.d(fiqrVar);
        return fiqsVar;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.a.size(); i++) {
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(((fiqr) this.a.get(i)).a);
        }
        return sb.toString();
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            fiqf fiqfVar = ((fiqr) it.next()).b;
        }
        return arrayList;
    }

    public final void d(fiqr fiqrVar) {
        this.a.add(fiqrVar);
    }

    public final boolean e() {
        return this.a.isEmpty();
    }
}
