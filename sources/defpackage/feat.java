package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feat {
    private static final Logger a = Logger.getLogger(feat.class.getName());
    private static feat b;
    private static final Iterable c;
    private final LinkedHashSet d = new LinkedHashSet();
    private final LinkedHashMap e = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("ferx"));
        } catch (ClassNotFoundException e) {
            a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("ffbm"));
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        c = DesugarCollections.unmodifiableList(arrayList);
    }

    public static synchronized feat b() {
        feat featVar;
        synchronized (feat.class) {
            if (b == null) {
                List<fear> a2 = fedj.a(fear.class, c, fear.class.getClassLoader(), new feas());
                b = new feat();
                for (fear fearVar : a2) {
                    a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(fearVar))));
                    b.c(fearVar);
                }
                b.d();
            }
            featVar = b;
        }
        return featVar;
    }

    private final synchronized void c(fear fearVar) {
        fearVar.e();
        emxf.b(true, "isAvailable() returned false");
        this.d.add(fearVar);
    }

    private final synchronized void d() {
        this.e.clear();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            fear fearVar = (fear) it.next();
            String c2 = fearVar.c();
            if (((fear) this.e.get(c2)) != null) {
                fearVar.d();
            } else {
                this.e.put(c2, fearVar);
            }
        }
    }

    public final synchronized fear a(String str) {
        return (fear) this.e.get(str);
    }
}
