package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etsd {
    public static final etsd a = new etsd();
    private final Map b = new HashMap();

    public final synchronized void a(String str, etgf etgfVar) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, etgfVar);
            return;
        }
        if (((etgf) this.b.get(str)).equals(etgfVar)) {
            return;
        }
        throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.b.get(str)) + "), cannot insert " + String.valueOf(etgfVar));
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (etgf) entry.getValue());
        }
    }

    public final synchronized etgf c() {
        if (!this.b.containsKey("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM")) {
            throw new GeneralSecurityException("Name ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM does not exist");
        }
        return (etgf) this.b.get("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM");
    }
}
