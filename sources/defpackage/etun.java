package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etun {
    static {
        euai euaiVar = euai.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        etse.a.c(etut.a);
        etse.a.b(etut.b);
        etse.a.c(etub.a);
        if (!etmj.a(etui.f)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        etre etreVar = etvm.a;
        etsh etshVar = etsh.a;
        etshVar.h(etvm.c);
        etshVar.g(etvm.d);
        etshVar.f(etvm.e);
        etshVar.e(etvm.f);
        etse.a.b(etui.a);
        etse.a.b(etui.b);
        etsd etsdVar = etsd.a;
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", etuz.a);
        etuj etujVar = new etuj();
        etujVar.b(32);
        etujVar.c(16);
        etujVar.b = etul.d;
        etujVar.a = etuk.c;
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", etujVar.a());
        etuj etujVar2 = new etuj();
        etujVar2.b(32);
        etujVar2.c(32);
        etujVar2.b = etul.a;
        etujVar2.a = etuk.c;
        hashMap.put("HMAC_SHA256_256BITTAG", etujVar2.a());
        etuj etujVar3 = new etuj();
        etujVar3.b(32);
        etujVar3.c(32);
        etujVar3.b = etul.d;
        etujVar3.a = etuk.c;
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", etujVar3.a());
        etuj etujVar4 = new etuj();
        etujVar4.b(64);
        etujVar4.c(16);
        etujVar4.b = etul.a;
        etujVar4.a = etuk.e;
        hashMap.put("HMAC_SHA512_128BITTAG", etujVar4.a());
        etuj etujVar5 = new etuj();
        etujVar5.b(64);
        etujVar5.c(16);
        etujVar5.b = etul.d;
        etujVar5.a = etuk.e;
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", etujVar5.a());
        etuj etujVar6 = new etuj();
        etujVar6.b(64);
        etujVar6.c(32);
        etujVar6.b = etul.a;
        etujVar6.a = etuk.e;
        hashMap.put("HMAC_SHA512_256BITTAG", etujVar6.a());
        etuj etujVar7 = new etuj();
        etujVar7.b(64);
        etujVar7.c(32);
        etujVar7.b = etul.d;
        etujVar7.a = etuk.e;
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", etujVar7.a());
        hashMap.put("HMAC_SHA512_512BITTAG", etuz.b);
        etuj etujVar8 = new etuj();
        etujVar8.b(64);
        etujVar8.c(64);
        etujVar8.b = etul.d;
        etujVar8.a = etuk.e;
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", etujVar8.a());
        etsdVar.b(DesugarCollections.unmodifiableMap(hashMap));
        etry.a.b(etui.e, etum.class);
        etsa.a.a(etui.d, etum.class);
        etri.a.c(etui.c, etui.f, true);
        if (etmk.a()) {
            return;
        }
        etrx etrxVar = ettv.a;
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        etso etsoVar = etve.a;
        etsh etshVar2 = etsh.a;
        etshVar2.h(etve.a);
        etshVar2.g(etve.b);
        etshVar2.f(etve.c);
        etshVar2.e(etve.d);
        etry.a.b(ettv.a, etty.class);
        etse.a.b(ettv.b);
        etse.a.b(ettv.c);
        etsd etsdVar2 = etsd.a;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("AES_CMAC", etuz.c);
        hashMap2.put("AES256_CMAC", etuz.c);
        ettw ettwVar = new ettw();
        ettwVar.b(32);
        ettwVar.c(16);
        ettwVar.a = ettx.d;
        hashMap2.put("AES256_CMAC_RAW", ettwVar.a());
        etsdVar2.b(DesugarCollections.unmodifiableMap(hashMap2));
        etri.a.b(ettv.d, true);
    }
}
