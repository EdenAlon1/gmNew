package j$.time.zone;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public abstract class h {
    private static final CopyOnWriteArrayList a;
    private static final ConcurrentHashMap b;
    private static volatile Set c;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        a = copyOnWriteArrayList;
        b = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new f(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public static Set a() {
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneRules b(String str, boolean z) {
        Objects.a(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = b;
        h hVar = (h) concurrentHashMap.get(str);
        if (hVar != null) {
            return hVar.c(str);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new e("No time-zone data files registered");
        }
        throw new e("Unknown time-zone ID: ".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(h hVar) {
        Objects.a(hVar, "provider");
        synchronized (h.class) {
            try {
                for (String str : hVar.d()) {
                    Objects.a(str, "zoneId");
                    if (((h) b.putIfAbsent(str, hVar)) != null) {
                        throw new e("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + String.valueOf(hVar));
                    }
                }
                c = Collections.unmodifiableSet(new HashSet(b.keySet()));
            } catch (Throwable th) {
                throw th;
            }
        }
        a.add(hVar);
    }

    protected abstract ZoneRules c(String str);

    protected abstract Set d();
}
