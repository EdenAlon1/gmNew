package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feam {
    public final List a;
    public final fdxd b;
    public final Object c;

    public feam(List list, fdxd fdxdVar, Object obj) {
        list.getClass();
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        fdxdVar.getClass();
        this.b = fdxdVar;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof feam)) {
            return false;
        }
        feam feamVar = (feam) obj;
        return emxb.a(this.a, feamVar.a) && emxb.a(this.b, feamVar.b) && emxb.a(this.c, feamVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("addresses", this.a);
        b.b("attributes", this.b);
        b.b("loadBalancingPolicyConfig", this.c);
        return b.toString();
    }
}
