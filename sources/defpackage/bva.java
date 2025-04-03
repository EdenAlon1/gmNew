package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bva implements bee {
    private final bee a;
    private final aua c;
    private final Map d = new HashMap();

    public bva(bee beeVar, aua auaVar) {
        this.a = beeVar;
        this.c = auaVar;
    }

    private final bei c(int i) {
        Map map = this.d;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (bei) this.d.get(valueOf);
        }
        beg begVar = null;
        if (this.a.b(i)) {
            bei a = this.a.a(i);
            aua auaVar = this.c;
            if (a != null) {
                ArrayList arrayList = new ArrayList();
                for (beh behVar : a.d()) {
                    if (cao.a(behVar, auaVar)) {
                        arrayList.add(behVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    begVar = beg.e(a.a(), a.b(), a.c(), arrayList);
                }
            }
            this.d.put(Integer.valueOf(i), begVar);
        }
        return begVar;
    }

    @Override // defpackage.bee
    public final bei a(int i) {
        return c(i);
    }

    @Override // defpackage.bee
    public final boolean b(int i) {
        return this.a.b(i) && c(i) != null;
    }
}
