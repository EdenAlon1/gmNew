package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffbh extends feaq {
    public static final Logger f = Logger.getLogger(ffbh.class.getName());
    public final feai h;
    protected boolean i;
    protected fdyc k;
    public List g = new ArrayList(0);
    protected final fear j = new ferx();

    protected ffbh(feai feaiVar) {
        this.h = feaiVar;
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "<init>", "Created");
    }

    @Override // defpackage.feaq
    public final Status a(feam feamVar) {
        ArrayList arrayList;
        Status status;
        try {
            this.i = true;
            f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "acceptResolvedAddressesInternal", "Received resolution result: {0}", feamVar);
            LinkedHashMap j = ennc.j(feamVar.a.size());
            Iterator it = feamVar.a.iterator();
            while (true) {
                arrayList = null;
                if (!it.hasNext()) {
                    break;
                }
                fdyw fdywVar = (fdyw) it.next();
                fdxd fdxdVar = fdxd.a;
                List list = feamVar.a;
                fdxd fdxdVar2 = feamVar.b;
                Object obj = feamVar.c;
                List singletonList = Collections.singletonList(fdywVar);
                fdxb fdxbVar = new fdxb(fdxd.a);
                fdxbVar.b(e, true);
                j.put(new ffbg(fdywVar), new feam(singletonList, fdxbVar.a(), null));
            }
            if (j.isEmpty()) {
                status = Status.p.withDescription("NameResolver returned no usable address. ".concat(String.valueOf(String.valueOf(feamVar))));
                b(status);
            } else {
                LinkedHashMap j2 = ennc.j(this.g.size());
                for (ffbf ffbfVar : this.g) {
                    j2.put(ffbfVar.a, ffbfVar);
                }
                ArrayList arrayList2 = new ArrayList(j.size());
                for (Map.Entry entry : j.entrySet()) {
                    ffbf ffbfVar2 = (ffbf) j2.remove(entry.getKey());
                    if (ffbfVar2 == null) {
                        ffbfVar2 = f(entry.getKey());
                    }
                    arrayList2.add(ffbfVar2);
                    if (entry.getValue() != null) {
                        ffbfVar2.b.c((feam) entry.getValue());
                    }
                }
                this.g = arrayList2;
                arrayList = new ArrayList(j2.values());
                status = Status.b;
            }
            if (status.f()) {
                g();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ffbf) it2.next()).b();
                }
            }
            return status;
        } finally {
            this.i = false;
        }
    }

    @Override // defpackage.feaq
    public final void b(Status status) {
        if (this.k != fdyc.READY) {
            this.h.f(fdyc.TRANSIENT_FAILURE, new feah(feak.b(status)));
        }
    }

    @Override // defpackage.feaq
    public final void e() {
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "shutdown", "Shutdown");
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((ffbf) it.next()).b();
        }
        this.g.clear();
    }

    protected ffbf f(Object obj) {
        throw null;
    }

    protected abstract void g();
}
