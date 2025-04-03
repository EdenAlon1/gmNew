package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwck {
    public final Map a = new HashMap();
    public final dvxe b;

    public dwck(dvxe dvxeVar) {
        this.b = dvxeVar;
    }

    public final dvxe a(Object obj, dvwz dvwzVar) {
        emxf.l(this.a.get(obj) == null);
        dvxe e = dvwzVar.e(this.b.e);
        dwcl dwclVar = new dwcl(e);
        e.f = dwclVar;
        dwclVar.l();
        this.a.put(obj, e);
        this.b.f.e(e);
        return e;
    }

    public final dvxe b(Object obj) {
        dvxe dvxeVar = (dvxe) this.a.get(obj);
        if (dvxeVar == null) {
            dvxe dvxeVar2 = this.b;
            dvxeVar2.e.d(new NullPointerException(a.b(obj, "Synthetic container did not have specified child ve with id=", "\nThis points to a likely instrumentation error.")));
        }
        return dvxeVar;
    }

    @Deprecated
    public final dwcj c(int i) {
        return new dwcj(this, dvxd.a(i));
    }
}
