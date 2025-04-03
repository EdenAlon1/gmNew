package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etgo {
    static {
        euai euaiVar = euai.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        etse.a.c(etgv.a);
        etse.a.b(etgv.b);
        etun.a();
        if (!etmj.a(ethb.e)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        etso etsoVar = etkl.a;
        etsh etshVar = etsh.a;
        etshVar.h(etkl.a);
        etshVar.g(etkl.b);
        etshVar.f(etkl.c);
        etshVar.e(etkl.d);
        etse.a.b(ethb.a);
        etsd etsdVar = etsd.a;
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", etjt.e);
        ethc ethcVar = new ethc();
        ethcVar.b(16);
        ethcVar.c(32);
        ethcVar.e(16);
        ethcVar.d(16);
        ethcVar.a = ethd.c;
        ethcVar.b = ethe.c;
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", ethcVar.a());
        hashMap.put("AES256_CTR_HMAC_SHA256", etjt.f);
        ethc ethcVar2 = new ethc();
        ethcVar2.b(32);
        ethcVar2.c(32);
        ethcVar2.e(32);
        ethcVar2.d(16);
        ethcVar2.a = ethd.c;
        ethcVar2.b = ethe.c;
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", ethcVar2.a());
        etsdVar.b(DesugarCollections.unmodifiableMap(hashMap));
        etsa.a.a(ethb.c, ethf.class);
        etry.a.b(ethb.d, ethf.class);
        etri.a.c(ethb.b, ethb.e, true);
        if (!etmj.a(etht.e)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        etso etsoVar2 = etkx.a;
        etsh etshVar2 = etsh.a;
        etshVar2.h(etkx.a);
        etshVar2.g(etkx.b);
        etshVar2.f(etkx.c);
        etshVar2.e(etkx.d);
        etse.a.b(etht.a);
        etsd etsdVar2 = etsd.a;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("AES128_GCM", etjt.a);
        ethu ethuVar = new ethu();
        ethuVar.b();
        ethuVar.c(16);
        ethuVar.d();
        ethuVar.a = ethv.c;
        hashMap2.put("AES128_GCM_RAW", ethuVar.a());
        hashMap2.put("AES256_GCM", etjt.b);
        ethu ethuVar2 = new ethu();
        ethuVar2.b();
        ethuVar2.c(32);
        ethuVar2.d();
        ethuVar2.a = ethv.c;
        hashMap2.put("AES256_GCM_RAW", ethuVar2.a());
        etsdVar2.b(DesugarCollections.unmodifiableMap(hashMap2));
        etsa.a.a(etht.c, ethw.class);
        etry.a.b(etht.d, ethw.class);
        etri.a.c(etht.b, etht.e, true);
        if (etmk.a()) {
            return;
        }
        etsv etsvVar = ethk.a;
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        etso etsoVar3 = etkq.a;
        etsh etshVar3 = etsh.a;
        etshVar3.h(etkq.a);
        etshVar3.g(etkq.b);
        etshVar3.f(etkq.c);
        etshVar3.e(etkq.d);
        etse.a.b(ethk.a);
        etsd etsdVar3 = etsd.a;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("AES128_EAX", etjt.c);
        ethl ethlVar = new ethl();
        ethlVar.b(16);
        ethlVar.c(16);
        ethlVar.d();
        ethlVar.a = ethm.c;
        hashMap3.put("AES128_EAX_RAW", ethlVar.a());
        hashMap3.put("AES256_EAX", etjt.d);
        ethl ethlVar2 = new ethl();
        ethlVar2.b(16);
        ethlVar2.c(32);
        ethlVar2.d();
        ethlVar2.a = ethm.c;
        hashMap3.put("AES256_EAX_RAW", ethlVar2.a());
        etsdVar3.b(DesugarCollections.unmodifiableMap(hashMap3));
        etry.a.b(ethk.c, ethn.class);
        etri.a.b(ethk.b, true);
        etsv etsvVar2 = etic.a;
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        etso etsoVar4 = etlc.a;
        etsh etshVar4 = etsh.a;
        etshVar4.h(etlc.a);
        etshVar4.g(etlc.b);
        etshVar4.f(etlc.c);
        etshVar4.e(etlc.d);
        if (etic.a()) {
            etse.a.b(etic.a);
            etsd etsdVar4 = etsd.a;
            HashMap hashMap4 = new HashMap();
            etid etidVar = new etid();
            etidVar.b(16);
            etidVar.a = etie.a;
            hashMap4.put("AES128_GCM_SIV", etidVar.a());
            etid etidVar2 = new etid();
            etidVar2.b(16);
            etidVar2.a = etie.c;
            hashMap4.put("AES128_GCM_SIV_RAW", etidVar2.a());
            etid etidVar3 = new etid();
            etidVar3.b(32);
            etidVar3.a = etie.a;
            hashMap4.put("AES256_GCM_SIV", etidVar3.a());
            etid etidVar4 = new etid();
            etidVar4.b(32);
            etidVar4.a = etie.c;
            hashMap4.put("AES256_GCM_SIV_RAW", etidVar4.a());
            etsdVar4.b(DesugarCollections.unmodifiableMap(hashMap4));
            etsa.a.a(etic.c, etif.class);
            etry.a.b(etic.b, etif.class);
            etri.a.b(etic.d, true);
        }
        etsv etsvVar3 = etij.a;
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        etso etsoVar5 = etlj.a;
        etsh etshVar5 = etsh.a;
        etshVar5.h(etlj.a);
        etshVar5.g(etlj.b);
        etshVar5.f(etlj.c);
        etshVar5.e(etlj.d);
        etse.a.b(etij.a);
        etry.a.b(etij.b, etil.class);
        etsd etsdVar5 = etsd.a;
        HashMap hashMap5 = new HashMap();
        hashMap5.put("CHACHA20_POLY1305", new etil(etik.a));
        hashMap5.put("CHACHA20_POLY1305_RAW", new etil(etik.c));
        etsdVar5.b(DesugarCollections.unmodifiableMap(hashMap5));
        etri.a.b(etij.c, true);
        etsv etsvVar4 = etio.a;
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        etso etsoVar6 = etja.a;
        etsh etshVar6 = etsh.a;
        etshVar6.h(etja.a);
        etshVar6.g(etja.b);
        etshVar6.f(etja.c);
        etshVar6.e(etja.d);
        etse.a.b(etio.a);
        etry.a.b(etio.c, etiv.class);
        etri.a.b(etio.b, true);
        etft etftVar = etis.a;
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        etso etsoVar7 = etjj.a;
        etsh etshVar7 = etsh.a;
        etshVar7.h(etjj.a);
        etshVar7.g(etjj.b);
        etshVar7.f(etjj.c);
        etshVar7.e(etjj.d);
        etry.a.b(etis.b, etje.class);
        etse.a.b(etis.c);
        etri.a.b(etis.a, true);
        etsv etsvVar5 = etke.a;
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        etso etsoVar8 = etmg.a;
        etsh etshVar8 = etsh.a;
        etshVar8.h(etmg.a);
        etshVar8.g(etmg.b);
        etshVar8.f(etmg.c);
        etshVar8.e(etmg.d);
        etse.a.b(etke.a);
        etsd etsdVar6 = etsd.a;
        HashMap hashMap6 = new HashMap();
        hashMap6.put("XCHACHA20_POLY1305", new etkg(etkf.a));
        hashMap6.put("XCHACHA20_POLY1305_RAW", new etkg(etkf.c));
        etsdVar6.b(DesugarCollections.unmodifiableMap(hashMap6));
        etry.a.b(etke.d, etkg.class);
        etsa.a.a(etke.c, etkg.class);
        etri.a.b(etke.b, true);
        etso etsoVar9 = etma.a;
        etsh etshVar9 = etsh.a;
        etshVar9.h(etma.a);
        etshVar9.g(etma.b);
        etshVar9.f(etma.c);
        etshVar9.e(etma.d);
        etsd etsdVar7 = etsd.a;
        HashMap hashMap7 = new HashMap();
        hashMap7.put("XAES_256_GCM_192_BIT_NONCE", etjt.g);
        hashMap7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", etjt.h);
        hashMap7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", etjt.i);
        hashMap7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", etjt.j);
        etsdVar7.b(DesugarCollections.unmodifiableMap(hashMap7));
        etse.a.b(etjx.b);
        etry.a.b(etjx.a, etjz.class);
    }
}
