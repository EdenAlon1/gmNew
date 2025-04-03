package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efcj {
    public final String a;
    public final List b = new ArrayList();

    public efcj(String str, List list) {
        this.a = str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            efcl efclVar = (efcl) it.next();
            int i = 0;
            while (true) {
                if (i >= this.b.size()) {
                    this.b.add(efclVar);
                    break;
                } else {
                    if (((efcl) this.b.get(i)).a.equals(efclVar.a)) {
                        this.b.set(i, efclVar);
                        break;
                    }
                    i++;
                }
            }
        }
    }
}
