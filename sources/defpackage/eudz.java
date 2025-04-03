package defpackage;

import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eudz {
    static {
        euai euaiVar = euai.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        etse.a.c(eucx.a);
        etse.a.b(eucx.b);
        etse.a.c(euda.a);
        etse.a.b(euda.b);
        if (!etmj.a(eubw.e)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        etso etsoVar = euej.a;
        etsh etshVar = etsh.a;
        etshVar.h(euej.a);
        etshVar.g(euej.b);
        etshVar.f(euej.c);
        etshVar.e(euej.d);
        etshVar.f(euej.e);
        etshVar.e(euej.f);
        etsd etsdVar = etsd.a;
        HashMap hashMap = new HashMap();
        hashMap.put("ECDSA_P256", eucu.a);
        hashMap.put("ECDSA_P256_IEEE_P1363", eucu.d);
        eubl eublVar = eubl.a;
        hashMap.put("ECDSA_P256_RAW", eubj.a(eubm.a, eubk.a, eublVar, eubn.d));
        hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", eucu.f);
        hashMap.put("ECDSA_P384", eucu.b);
        hashMap.put("ECDSA_P384_IEEE_P1363", eucu.e);
        eubl eublVar2 = eubl.c;
        hashMap.put("ECDSA_P384_SHA512", eubj.a(eubm.b, eubk.b, eublVar2, eubn.a));
        eubl eublVar3 = eubl.b;
        hashMap.put("ECDSA_P384_SHA384", eubj.a(eubm.b, eubk.b, eublVar3, eubn.a));
        hashMap.put("ECDSA_P521", eucu.c);
        hashMap.put("ECDSA_P521_IEEE_P1363", eucu.g);
        etsdVar.b(DesugarCollections.unmodifiableMap(hashMap));
        etse.a.b(eubw.a);
        etse.a.b(eubw.b);
        etry.a.b(eubw.d, eubo.class);
        etri.a.c(eubw.f, eubw.e, true);
        etri.a.c(eubw.c, eubw.e, false);
        if (!etmj.a(eudm.e)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        etso etsoVar2 = euez.a;
        etsh etshVar2 = etsh.a;
        etshVar2.h(euez.a);
        etshVar2.g(euez.b);
        etshVar2.f(euez.c);
        etshVar2.e(euez.d);
        etshVar2.f(euez.e);
        etshVar2.e(euez.f);
        etsd etsdVar2 = etsd.a;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4", eucu.h);
        BigInteger bigInteger = eude.a;
        eudb eudbVar = new eudb();
        eudbVar.b = eudc.a;
        eudbVar.b(3072);
        eudbVar.a = eude.a;
        eudbVar.c = eudd.d;
        hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", eudbVar.a());
        hashMap2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", eucu.i);
        hashMap2.put("RSA_SSA_PKCS1_4096_SHA512_F4", eucu.j);
        eudb eudbVar2 = new eudb();
        eudbVar2.b = eudc.c;
        eudbVar2.b(4096);
        eudbVar2.a = eude.a;
        eudbVar2.c = eudd.d;
        hashMap2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", eudbVar2.a());
        etsdVar2.b(hashMap2);
        etse.a.b(eudm.a);
        etse.a.b(eudm.b);
        etry.a.b(eudm.d, eude.class);
        etri.a.c(eudm.f, eudm.e, true);
        etri.a.c(eudm.c, eudm.e, false);
        if (!etmj.a(eudy.e)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        etso etsoVar3 = eufh.a;
        etsh etshVar3 = etsh.a;
        etshVar3.h(eufh.a);
        etshVar3.g(eufh.b);
        etshVar3.f(eufh.c);
        etshVar3.e(eufh.d);
        etshVar3.f(eufh.e);
        etshVar3.e(eufh.f);
        etsd etsdVar3 = etsd.a;
        HashMap hashMap3 = new HashMap();
        BigInteger bigInteger2 = eudq.a;
        eudn eudnVar = new eudn();
        eudo eudoVar = eudo.a;
        eudnVar.b = eudoVar;
        eudnVar.c = eudoVar;
        eudnVar.c(32);
        eudnVar.b(3072);
        eudnVar.a = eudq.a;
        eudnVar.d = eudp.a;
        hashMap3.put("RSA_SSA_PSS_3072_SHA256_F4", eudnVar.a());
        eudn eudnVar2 = new eudn();
        eudo eudoVar2 = eudo.a;
        eudnVar2.b = eudoVar2;
        eudnVar2.c = eudoVar2;
        eudnVar2.c(32);
        eudnVar2.b(3072);
        eudnVar2.a = eudq.a;
        eudnVar2.d = eudp.d;
        hashMap3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", eudnVar2.a());
        hashMap3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", eucu.k);
        eudn eudnVar3 = new eudn();
        eudo eudoVar3 = eudo.c;
        eudnVar3.b = eudoVar3;
        eudnVar3.c = eudoVar3;
        eudnVar3.c(64);
        eudnVar3.b(4096);
        eudnVar3.a = eudq.a;
        eudnVar3.d = eudp.a;
        hashMap3.put("RSA_SSA_PSS_4096_SHA512_F4", eudnVar3.a());
        eudn eudnVar4 = new eudn();
        eudo eudoVar4 = eudo.c;
        eudnVar4.b = eudoVar4;
        eudnVar4.c = eudoVar4;
        eudnVar4.c(64);
        eudnVar4.b(4096);
        eudnVar4.a = eudq.a;
        eudnVar4.d = eudp.d;
        hashMap3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", eudnVar4.a());
        hashMap3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", eucu.l);
        etsdVar3.b(DesugarCollections.unmodifiableMap(hashMap3));
        etse.a.b(eudy.a);
        etse.a.b(eudy.b);
        etry.a.b(eudy.d, eudq.class);
        etri.a.c(eudy.f, eudy.e, true);
        etri.a.c(eudy.c, eudy.e, false);
        if (etmk.a()) {
            return;
        }
        etsv etsvVar = euce.a;
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        etso etsoVar4 = eueq.a;
        etsh etshVar4 = etsh.a;
        etshVar4.h(eueq.a);
        etshVar4.g(eueq.b);
        etshVar4.f(eueq.c);
        etshVar4.e(eueq.d);
        etshVar4.f(eueq.e);
        etshVar4.e(eueq.f);
        etsd etsdVar4 = etsd.a;
        HashMap hashMap4 = new HashMap();
        hashMap4.put("ED25519", new euby(eubx.a));
        hashMap4.put("ED25519_RAW", new euby(eubx.d));
        hashMap4.put("ED25519WithRawOutput", new euby(eubx.d));
        etsdVar4.b(DesugarCollections.unmodifiableMap(hashMap4));
        etry.a.b(euce.e, euby.class);
        etsa.a.a(euce.d, euby.class);
        etse.a.b(euce.a);
        etse.a.b(euce.b);
        etri.a.b(euce.f, true);
        etri.a.b(euce.c, false);
    }
}
