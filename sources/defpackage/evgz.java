package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evgz extends fdzj {
    private static final enru a = enru.c("com/google/frameworks/client/data/android/server/LazyServicesHandlerRegistry");
    private static final fecz b = new fecz(null, null);
    private static final fedb c = feda.a("not_found", null, new HashMap());
    private final Map d;
    private final Object e = new Object();
    private final Map f = new HashMap();
    private final Map g = new HashMap();
    private final ConcurrentHashMap h = new ConcurrentHashMap();

    public evgz(Map map) {
        this.d = map;
    }

    @Override // defpackage.fdzj
    public final fecz a(String str) {
        int indexOf;
        fecz feczVar = (fecz) this.h.get(str);
        if (feczVar == null && (indexOf = str.indexOf(47)) > 0) {
            String substring = str.substring(0, indexOf);
            synchronized (this.e) {
                fedb fedbVar = (fedb) this.g.get(substring);
                if (fedbVar == null) {
                    ffbr ffbrVar = (ffbr) this.d.get(substring);
                    if (ffbrVar != null) {
                        fdxe fdxeVar = (fdxe) ffbrVar.b();
                        this.f.put(substring, fdxeVar);
                        fedbVar = fdxeVar.w();
                    } else {
                        ((enrr) ((enrr) a.j()).h("com/google/frameworks/client/data/android/server/LazyServicesHandlerRegistry", "initService", 113, "LazyServicesHandlerRegistry.java")).t("No factory available for service %s.", substring);
                        fedbVar = c;
                    }
                    this.g.put(substring, fedbVar);
                }
                feczVar = fedbVar != c ? (fecz) fedbVar.b.get(str) : null;
                if (feczVar == null) {
                    feczVar = b;
                }
                this.h.put(str, feczVar);
            }
        }
        if (feczVar == b) {
            return null;
        }
        return feczVar;
    }
}
