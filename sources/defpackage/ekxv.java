package defpackage;

import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxv {
    public static final /* synthetic */ int a = 0;
    private static final WeakHashMap b = new WeakHashMap();
    private static final WeakHashMap c = new WeakHashMap();

    public static elef a(Throwable th) {
        emxf.m(true, "Trace uncaught exception is disabled.");
        synchronized (b) {
            Throwable th2 = th;
            while (th2 != null) {
                try {
                    if (b.containsKey(th2)) {
                        break;
                    }
                    th2 = th2.getCause();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (th2 == null) {
                return null;
            }
            WeakHashMap weakHashMap = b;
            elcf elcfVar = (elcf) weakHashMap.get(th2);
            weakHashMap.put(th, elcfVar);
            return new elef(elcfVar);
        }
    }

    public static void b(Throwable th) {
        WeakHashMap weakHashMap = c;
        synchronized (weakHashMap) {
            weakHashMap.put(th, true);
        }
    }

    public static void c(Throwable th) {
        Throwable th2;
        elat c2;
        synchronized (c) {
            th2 = th;
            while (th2 != null) {
                if (c.containsKey(th2)) {
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
            c.put(th, Boolean.valueOf(th2 != null));
        }
        if (th2 == null && a(th) == null && (c2 = ekyf.c()) != null) {
            ArrayList arrayList = new ArrayList();
            for (c2 = ekyf.c(); c2 != null; c2 = c2.a()) {
                arrayList.add(c2);
            }
            UUID e = ((elat) arrayList.get(0)).e();
            if (e == null) {
                throw new NullPointerException("Null rootTraceId");
            }
            engr d = engw.d(arrayList.size());
            engr d2 = engw.d(arrayList.size());
            for (elat elatVar : enkr.f(arrayList)) {
                d2.h(elatVar.c());
                d.h(elatVar.j());
            }
            WeakHashMap weakHashMap = b;
            synchronized (weakHashMap) {
                engw g = d2.g();
                if (g == null) {
                    throw new NullPointerException("Null spansNames");
                }
                engw g2 = d.g();
                if (g2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap.put(th, new ekwt(g, g2, e));
            }
        }
    }
}
