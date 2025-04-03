package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etri {
    private static final Logger c = Logger.getLogger(etri.class.getName());
    public static final etri a = new etri();
    private final ConcurrentMap d = new ConcurrentHashMap();
    public final ConcurrentMap b = new ConcurrentHashMap();

    private final synchronized void d(etft etftVar, boolean z) {
        String d = etftVar.d();
        if (z && this.b.containsKey(d) && !((Boolean) this.b.get(d)).booleanValue()) {
            throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(d));
        }
        etft etftVar2 = (etft) this.d.get(d);
        if (etftVar2 != null && !etftVar2.getClass().equals(etftVar.getClass())) {
            c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(d));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", d, etftVar2.getClass().getName(), etftVar.getClass().getName()));
        }
        this.d.putIfAbsent(d, etftVar);
        this.b.put(d, Boolean.valueOf(z));
    }

    public final synchronized etft a(String str) {
        if (!this.d.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (etft) this.d.get(str);
    }

    public final synchronized void b(etft etftVar, boolean z) {
        c(etftVar, 1, z);
    }

    public final synchronized void c(etft etftVar, int i, boolean z) {
        if (!etmj.a(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        d(etftVar, z);
    }
}
