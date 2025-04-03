package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eugk {
    static {
        euai euaiVar = euai.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        etse.a.c(eugs.a);
        etse.a.b(eugs.b);
        if (etmk.a()) {
            return;
        }
        etsv etsvVar = eufn.a;
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Registering AES CTR HMAC Streaming AEAD is not supported in FIPS mode");
        }
        etso etsoVar = eugx.a;
        etsh etshVar = etsh.a;
        etshVar.h(eugx.a);
        etshVar.g(eugx.b);
        etshVar.f(eugx.c);
        etshVar.e(eugx.d);
        etsd etsdVar = etsd.a;
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256_4KB", eugj.a);
        hashMap.put("AES128_CTR_HMAC_SHA256_1MB", eugj.b);
        hashMap.put("AES256_CTR_HMAC_SHA256_4KB", eugj.c);
        hashMap.put("AES256_CTR_HMAC_SHA256_1MB", eugj.d);
        etsdVar.b(DesugarCollections.unmodifiableMap(hashMap));
        etry.a.b(eufn.b, eufq.class);
        etse.a.b(eufn.a);
        etri.a.b(eufn.c, true);
        etsv etsvVar2 = eufw.a;
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Registering AES-GCM HKDF Streaming AEAD is not supported in FIPS mode");
        }
        etso etsoVar2 = euhc.a;
        etsh etshVar2 = etsh.a;
        etshVar2.h(euhc.a);
        etshVar2.g(euhc.b);
        etshVar2.f(euhc.c);
        etshVar2.e(euhc.d);
        etsd etsdVar2 = etsd.a;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("AES128_GCM_HKDF_4KB", eugj.e);
        hashMap2.put("AES128_GCM_HKDF_1MB", eugj.f);
        hashMap2.put("AES256_GCM_HKDF_4KB", eugj.g);
        hashMap2.put("AES256_GCM_HKDF_1MB", eugj.h);
        etsdVar2.b(DesugarCollections.unmodifiableMap(hashMap2));
        etsa.a.a(eufw.d, eufz.class);
        etry.a.b(eufw.c, eufz.class);
        etse.a.b(eufw.a);
        etri.a.b(eufw.b, true);
    }
}
