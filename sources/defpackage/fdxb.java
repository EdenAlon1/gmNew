package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdxb {
    public fdxd a;
    public IdentityHashMap b;

    public fdxb(fdxd fdxdVar) {
        this.a = fdxdVar;
    }

    public final fdxd a() {
        if (this.b != null) {
            fdxd fdxdVar = this.a;
            fdxd fdxdVar2 = fdxd.a;
            for (Map.Entry entry : fdxdVar.b.entrySet()) {
                if (!this.b.containsKey(entry.getKey())) {
                    this.b.put((fdxc) entry.getKey(), entry.getValue());
                }
            }
            this.a = new fdxd(this.b);
            this.b = null;
        }
        return this.a;
    }

    public final void b(fdxc fdxcVar, Object obj) {
        if (this.b == null) {
            this.b = new IdentityHashMap(1);
        }
        this.b.put(fdxcVar, obj);
    }
}
