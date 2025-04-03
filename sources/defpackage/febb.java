package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class febb {
    private static final Logger a = Logger.getLogger(febb.class.getName());
    private static febb b;
    private final LinkedHashSet c = new LinkedHashSet();
    private List d = Collections.EMPTY_LIST;

    public static synchronized febb a() {
        febb febbVar;
        synchronized (febb.class) {
            if (b == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(Class.forName("fexw"));
                } catch (ClassNotFoundException e) {
                    a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find OkHttpChannelProvider", (Throwable) e);
                }
                try {
                    arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
                } catch (ClassNotFoundException e2) {
                    a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find NettyChannelProvider", (Throwable) e2);
                }
                try {
                    arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
                } catch (ClassNotFoundException e3) {
                    a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find UdsNettyChannelProvider", (Throwable) e3);
                }
                List<feay> a2 = fedj.a(feay.class, DesugarCollections.unmodifiableList(arrayList), feay.class.getClassLoader(), new feba());
                b = new febb();
                for (feay feayVar : a2) {
                    a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(feayVar))));
                    b.c(feayVar);
                }
                b.d();
            }
            febbVar = b;
        }
        return febbVar;
    }

    private final synchronized void c(feay feayVar) {
        feayVar.c();
        emxf.b(true, "isAvailable() returned false");
        this.c.add(feayVar);
    }

    private final synchronized void d() {
        ArrayList arrayList = new ArrayList(this.c);
        Collections.sort(arrayList, Collections.reverseOrder(new feaz()));
        this.d = DesugarCollections.unmodifiableList(arrayList);
    }

    public final synchronized List b() {
        return this.d;
    }
}
