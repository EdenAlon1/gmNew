package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efcl {
    public final String a;
    public final List b = new ArrayList();

    public efcl(String str, List list) {
        this.a = str;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            efcn efcnVar = (efcn) it.next();
            int i = 0;
            while (true) {
                if (i >= this.b.size()) {
                    this.b.add(efcnVar);
                    break;
                } else {
                    if (((efcn) this.b.get(i)).a.equals(efcnVar.a)) {
                        this.b.set(i, efcnVar);
                        break;
                    }
                    i++;
                }
            }
        }
    }
}
