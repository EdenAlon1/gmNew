package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhim {
    public final fhey a;
    public final fhij b;
    public List c;
    public int d;
    public List e;
    public final List f;

    public fhim(fhey fheyVar, fhij fhijVar) {
        List n;
        this.a = fheyVar;
        this.b = fhijVar;
        ffel ffelVar = ffel.a;
        this.c = ffelVar;
        this.e = ffelVar;
        this.f = new ArrayList();
        fhgk fhgkVar = fheyVar.i;
        Proxy proxy = fheyVar.g;
        if (proxy != null) {
            n = ffdx.b(proxy);
        } else {
            URI f = fhgkVar.f();
            if (f.getHost() == null) {
                n = fhhl.n(Proxy.NO_PROXY);
            } else {
                List<Proxy> select = fheyVar.h.select(f);
                n = (select == null || select.isEmpty()) ? fhhl.n(Proxy.NO_PROXY) : fhhl.o(select);
            }
        }
        this.c = n;
        this.d = 0;
        n.getClass();
    }

    public final boolean a() {
        return b() || !this.f.isEmpty();
    }

    public final boolean b() {
        return this.d < this.c.size();
    }
}
