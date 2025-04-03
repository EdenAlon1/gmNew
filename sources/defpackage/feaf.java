package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feaf {
    public final List a;
    public final fdxd b;
    public final Object[][] c;

    public feaf(List list, fdxd fdxdVar, Object[][] objArr) {
        list.getClass();
        this.a = list;
        fdxdVar.getClass();
        this.b = fdxdVar;
        objArr.getClass();
        this.c = objArr;
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("addrs", this.a);
        b.b("attrs", this.b);
        b.b("customOptions", Arrays.deepToString(this.c));
        return b.toString();
    }
}
