package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etol {
    static {
        euai euaiVar = euai.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        etse.a.c(etot.a);
        etse.a.b(etot.b);
        etse.a.c(etow.a);
        etse.a.b(etow.b);
        etgo.a();
        etmu.a();
        if (etmk.a()) {
            return;
        }
        etsv etsvVar = etnm.a;
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Registering ECIES Hybrid Encryption is not supported in FIPS mode");
        }
        etso etsoVar = etpo.a;
        etsh etshVar = etsh.a;
        etshVar.h(etpo.a);
        etshVar.g(etpo.b);
        etshVar.f(etpo.c);
        etshVar.e(etpo.d);
        etshVar.f(etpo.e);
        etshVar.e(etpo.f);
        etsd etsdVar = etsd.a;
        HashMap hashMap = new HashMap();
        Set set = etnt.a;
        etno etnoVar = new etno();
        etnoVar.a = etnp.a;
        etnoVar.b = etnq.c;
        etnoVar.c = etnr.b;
        etnoVar.d = etns.a;
        ethu ethuVar = new ethu();
        ethuVar.b();
        ethuVar.c(16);
        ethuVar.d();
        ethuVar.a = ethv.c;
        etnoVar.b(ethuVar.a());
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", etnoVar.a());
        etno etnoVar2 = new etno();
        etnoVar2.a = etnp.a;
        etnoVar2.b = etnq.c;
        etnoVar2.c = etnr.b;
        etnoVar2.d = etns.c;
        ethu ethuVar2 = new ethu();
        ethuVar2.b();
        ethuVar2.c(16);
        ethuVar2.d();
        ethuVar2.a = ethv.c;
        etnoVar2.b(ethuVar2.a());
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", etnoVar2.a());
        etno etnoVar3 = new etno();
        etnoVar3.a = etnp.a;
        etnoVar3.b = etnq.c;
        etnoVar3.c = etnr.a;
        etnoVar3.d = etns.a;
        ethu ethuVar3 = new ethu();
        ethuVar3.b();
        ethuVar3.c(16);
        ethuVar3.d();
        ethuVar3.a = ethv.c;
        etnoVar3.b(ethuVar3.a());
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", etnoVar3.a());
        etno etnoVar4 = new etno();
        etnoVar4.a = etnp.a;
        etnoVar4.b = etnq.c;
        etnoVar4.c = etnr.a;
        etnoVar4.d = etns.c;
        ethu ethuVar4 = new ethu();
        ethuVar4.b();
        ethuVar4.c(16);
        ethuVar4.d();
        ethuVar4.a = ethv.c;
        etnoVar4.b(ethuVar4.a());
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", etnoVar4.a());
        etno etnoVar5 = new etno();
        etnoVar5.a = etnp.a;
        etnoVar5.b = etnq.c;
        etnoVar5.c = etnr.a;
        etnoVar5.d = etns.c;
        ethu ethuVar5 = new ethu();
        ethuVar5.b();
        ethuVar5.c(16);
        ethuVar5.d();
        ethuVar5.a = ethv.c;
        etnoVar5.b(ethuVar5.a());
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", etnoVar5.a());
        etno etnoVar6 = new etno();
        etnoVar6.a = etnp.a;
        etnoVar6.b = etnq.c;
        etnoVar6.c = etnr.b;
        etnoVar6.d = etns.a;
        ethc ethcVar = new ethc();
        ethcVar.b(16);
        ethcVar.c(32);
        ethcVar.e(16);
        ethcVar.d(16);
        ethcVar.a = ethd.c;
        ethcVar.b = ethe.c;
        etnoVar6.b(ethcVar.a());
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", etnoVar6.a());
        etno etnoVar7 = new etno();
        etnoVar7.a = etnp.a;
        etnoVar7.b = etnq.c;
        etnoVar7.c = etnr.b;
        etnoVar7.d = etns.c;
        ethc ethcVar2 = new ethc();
        ethcVar2.b(16);
        ethcVar2.c(32);
        ethcVar2.e(16);
        ethcVar2.d(16);
        ethcVar2.a = ethd.c;
        ethcVar2.b = ethe.c;
        etnoVar7.b(ethcVar2.a());
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", etnoVar7.a());
        etno etnoVar8 = new etno();
        etnoVar8.a = etnp.a;
        etnoVar8.b = etnq.c;
        etnoVar8.c = etnr.a;
        etnoVar8.d = etns.a;
        ethc ethcVar3 = new ethc();
        ethcVar3.b(16);
        ethcVar3.c(32);
        ethcVar3.e(16);
        ethcVar3.d(16);
        ethcVar3.a = ethd.c;
        ethcVar3.b = ethe.c;
        etnoVar8.b(ethcVar3.a());
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", etnoVar8.a());
        etno etnoVar9 = new etno();
        etnoVar9.a = etnp.a;
        etnoVar9.b = etnq.c;
        etnoVar9.c = etnr.a;
        etnoVar9.d = etns.c;
        ethc ethcVar4 = new ethc();
        ethcVar4.b(16);
        ethcVar4.c(32);
        ethcVar4.e(16);
        ethcVar4.d(16);
        ethcVar4.a = ethd.c;
        ethcVar4.b = ethe.c;
        etnoVar9.b(ethcVar4.a());
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", etnoVar9.a());
        etsdVar.b(DesugarCollections.unmodifiableMap(hashMap));
        etse.a.b(etnm.a);
        etse.a.b(etnm.b);
        etry.a.b(etnm.d, etnt.class);
        etri.a.b(etnm.e, true);
        etri.a.b(etnm.c, false);
        etsv etsvVar2 = etqa.a;
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Registering HPKE Hybrid Encryption is not supported in FIPS mode");
        }
        etso etsoVar2 = etoj.a;
        etsh etshVar2 = etsh.a;
        etshVar2.h(etoj.a);
        etshVar2.g(etoj.b);
        etshVar2.f(etoj.c);
        etshVar2.e(etoj.d);
        etshVar2.f(etoj.e);
        etshVar2.e(etoj.f);
        etsd etsdVar2 = etsd.a;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", new etob(etnz.f, etny.a, etnw.a, etoa.a));
        hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", new etob(etnz.f, etny.a, etnw.a, etoa.c));
        hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", new etob(etnz.f, etny.a, etnw.b, etoa.a));
        hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", new etob(etnz.f, etny.a, etnw.b, etoa.c));
        hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", new etob(etnz.f, etny.a, etnw.c, etoa.a));
        hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", new etob(etnz.f, etny.a, etnw.c, etoa.c));
        hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", new etob(etnz.a, etny.a, etnw.a, etoa.a));
        hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", new etob(etnz.a, etny.a, etnw.a, etoa.c));
        hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", new etob(etnz.a, etny.a, etnw.b, etoa.a));
        hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", new etob(etnz.a, etny.a, etnw.b, etoa.c));
        hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", new etob(etnz.b, etny.b, etnw.a, etoa.a));
        hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", new etob(etnz.b, etny.b, etnw.a, etoa.c));
        hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", new etob(etnz.b, etny.b, etnw.b, etoa.a));
        hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", new etob(etnz.b, etny.b, etnw.b, etoa.c));
        hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", new etob(etnz.c, etny.c, etnw.a, etoa.a));
        hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", new etob(etnz.c, etny.c, etnw.a, etoa.c));
        hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", new etob(etnz.c, etny.c, etnw.b, etoa.a));
        hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", new etob(etnz.c, etny.c, etnw.b, etoa.c));
        etsdVar2.b(DesugarCollections.unmodifiableMap(hashMap2));
        etse.a.b(etqa.a);
        etse.a.b(etqa.b);
        etry.a.b(etqa.d, etob.class);
        etri.a.b(etqa.e, true);
        etri.a.b(etqa.c, false);
    }
}
