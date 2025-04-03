package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etmu {
    static {
        euai euaiVar = euai.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        etse.a.c(etna.a);
        etse.a.b(etna.b);
        if (etmk.a()) {
            return;
        }
        etsv etsvVar = etmq.a;
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
        etso etsoVar = etnh.a;
        etsh etshVar = etsh.a;
        etshVar.h(etnh.a);
        etshVar.g(etnh.b);
        etshVar.f(etnh.c);
        etshVar.e(etnh.d);
        etse.a.b(etmq.a);
        etsd etsdVar = etsd.a;
        HashMap hashMap = new HashMap();
        hashMap.put("AES256_SIV", etnc.a);
        etmr etmrVar = new etmr();
        etmrVar.b(64);
        etmrVar.a = etms.c;
        hashMap.put("AES256_SIV_RAW", etmrVar.a());
        etsdVar.b(DesugarCollections.unmodifiableMap(hashMap));
        etsa.a.a(etmq.c, etmt.class);
        etry.a.b(etmq.d, etmt.class);
        etri.a.b(etmq.b, true);
    }
}
