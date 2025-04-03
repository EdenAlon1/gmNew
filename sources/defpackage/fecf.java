package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fecf {
    private static final Logger a = Logger.getLogger(fecf.class.getName());
    private static fecf b;
    private String c = "unknown";
    private final LinkedHashSet d = new LinkedHashSet();
    private enhk e = enoz.a;

    public static synchronized fecf b() {
        fecf fecfVar;
        synchronized (fecf.class) {
            if (b == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(Class.forName("femk"));
                } catch (ClassNotFoundException e) {
                    a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e);
                }
                List<fecd> a2 = fedj.a(fecd.class, DesugarCollections.unmodifiableList(arrayList), fecd.class.getClassLoader(), new fece());
                if (a2.isEmpty()) {
                    a.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                b = new fecf();
                for (fecd fecdVar : a2) {
                    a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(fecdVar))));
                    b.f(fecdVar);
                }
                b.g();
            }
            fecfVar = b;
        }
        return fecfVar;
    }

    private final synchronized void f(fecd fecdVar) {
        fecdVar.d();
        emxf.b(true, "isAvailable() returned false");
        this.d.add(fecdVar);
    }

    private final synchronized void g() {
        HashMap hashMap = new HashMap();
        Iterator it = this.d.iterator();
        String str = "unknown";
        char c = 0;
        while (it.hasNext()) {
            fecd fecdVar = (fecd) it.next();
            String b2 = fecdVar.b();
            if (((fecd) hashMap.get(b2)) != null) {
                fecdVar.e();
            } else {
                hashMap.put(b2, fecdVar);
            }
            fecdVar.e();
            if (c < 5) {
                fecdVar.e();
                str = fecdVar.b();
            }
            c = 5;
        }
        this.e = enhk.j(hashMap);
        this.c = str;
    }

    public final fecd a(String str) {
        if (str == null) {
            return null;
        }
        return (fecd) d().get(str.toLowerCase(Locale.US));
    }

    public final synchronized String c() {
        return this.c;
    }

    final synchronized Map d() {
        return this.e;
    }

    public final synchronized void e(fecd fecdVar) {
        f(fecdVar);
        g();
    }
}
