package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etoj {
    public static final etso a;
    public static final etsl b;
    public static final etro c;
    public static final etrl d;
    public static final etro e;
    public static final etrl f;
    public static final etre g;
    private static final eujt h;
    private static final eujt i;
    private static final etre j;
    private static final etre k;
    private static final etre l;

    static {
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        h = b2;
        eujt b3 = ettp.b("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        i = b3;
        a = new etsm(etob.class, ette.class, new etsn() { // from class: etod
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                etob etobVar = (etob) etgfVar;
                etso etsoVar = etoj.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
                etzc etzcVar = (etzc) etzd.a.createBuilder();
                etzf b4 = etoj.b(etobVar);
                etzcVar.copyOnWrite();
                etzd etzdVar = (etzd) etzcVar.instance;
                b4.getClass();
                etzdVar.c = b4;
                etzdVar.b |= 1;
                eyee byteString = ((etzd) etzcVar.build()).toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag euagVar = (euag) etoj.g.a(etobVar.d);
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = euagVar.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: etoe
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = etoj.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etzd etzdVar = (etzd) eyfy.parseFrom(etzd.a, eyeeVar, eyfc.a);
                    euag b4 = euag.b(etteVar.b.d);
                    if (b4 == null) {
                        b4 = euag.UNRECOGNIZED;
                    }
                    etzf etzfVar = etzdVar.c;
                    if (etzfVar == null) {
                        etzfVar = etzf.a;
                    }
                    return etoj.a(b4, etzfVar);
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e2);
                }
            }
        });
        c = new etrm(etok.class, ettd.class, new etrn() { // from class: etof
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                etok etokVar = (etok) etfsVar;
                return ettd.a("type.googleapis.com/google.crypto.tink.HpkePublicKey", etoj.c(etokVar).toByteString(), 5, (euag) etoj.g.a(etokVar.a.d), etokVar.d);
            }
        });
        d = new etrj(b3, ettd.class, new etrk() { // from class: etog
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = etoj.a;
                ettd ettdVar = (ettd) ettiVar;
                if (!ettdVar.a.equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ".concat(String.valueOf(ettdVar.a)));
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etzj etzjVar = (etzj) eyfy.parseFrom(etzj.a, eyeeVar, eyfc.a);
                    if (etzjVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    euag euagVar = ((ettd) ettiVar).d;
                    etzf etzfVar = etzjVar.d;
                    if (etzfVar == null) {
                        etzfVar = etzf.a;
                    }
                    etob a2 = etoj.a(euagVar, etzfVar);
                    return etok.b(a2, etoj.d(a2.a, etzjVar.e.I()), ((ettd) ettiVar).e);
                } catch (eygu unused) {
                    throw new GeneralSecurityException("Parsing HpkePublicKey failed");
                }
            }
        });
        e = new etrm(etoc.class, ettd.class, new etrn() { // from class: etoh
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                etoc etocVar = (etoc) etfsVar;
                etso etsoVar = etoj.a;
                etzg etzgVar = (etzg) etzh.a.createBuilder();
                etzgVar.copyOnWrite();
                ((etzh) etzgVar.instance).c = 0;
                etzj c2 = etoj.c(etocVar.a);
                etzgVar.copyOnWrite();
                etzh etzhVar = (etzh) etzgVar.instance;
                c2.getClass();
                etzhVar.d = c2;
                etzhVar.b |= 1;
                eyee x = eyee.x(etocVar.b.d());
                etzgVar.copyOnWrite();
                ((etzh) etzgVar.instance).e = x;
                return ettd.a("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((etzh) etzgVar.build()).toByteString(), 4, (euag) etoj.g.a(etocVar.c().d), etocVar.a());
            }
        });
        f = new etrj(b2, ettd.class, new etrk() { // from class: etoi
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = etoj.a;
                ettd ettdVar = (ettd) ettiVar;
                if (!ettdVar.a.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ettdVar.a)));
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etzh etzhVar = (etzh) eyfy.parseFrom(etzh.a, eyeeVar, eyfc.a);
                    if (etzhVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    etzj etzjVar = etzhVar.d;
                    if (etzjVar == null) {
                        etzjVar = etzj.a;
                    }
                    if (etzjVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    euag euagVar = ((ettd) ettiVar).d;
                    etzf etzfVar = etzjVar.d;
                    if (etzfVar == null) {
                        etzfVar = etzf.a;
                    }
                    etob a2 = etoj.a(euagVar, etzfVar);
                    return etoc.d(etok.b(a2, etoj.d(a2.a, etzjVar.e.I()), ((ettd) ettiVar).e), eujv.c(etqq.b(new BigInteger(1, etzhVar.e.I()), etqb.a(a2.a))));
                } catch (eygu unused) {
                    throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
                }
            }
        });
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        etrd.b(euag.RAW, etoa.c, hashMap, hashMap2);
        etrd.b(euag.TINK, etoa.a, hashMap, hashMap2);
        etrd.b(euag.LEGACY, etoa.b, hashMap, hashMap2);
        etrd.b(euag.CRUNCHY, etoa.b, hashMap, hashMap2);
        g = etrd.a(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        etrd.b(etzb.DHKEM_P256_HKDF_SHA256, etnz.a, hashMap3, hashMap4);
        etrd.b(etzb.DHKEM_P384_HKDF_SHA384, etnz.b, hashMap3, hashMap4);
        etrd.b(etzb.DHKEM_P521_HKDF_SHA512, etnz.c, hashMap3, hashMap4);
        etrd.b(etzb.DHKEM_X25519_HKDF_SHA256, etnz.f, hashMap3, hashMap4);
        j = etrd.a(hashMap3, hashMap4);
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        etrd.b(etza.HKDF_SHA256, etny.a, hashMap5, hashMap6);
        etrd.b(etza.HKDF_SHA384, etny.b, hashMap5, hashMap6);
        etrd.b(etza.HKDF_SHA512, etny.c, hashMap5, hashMap6);
        k = etrd.a(hashMap5, hashMap6);
        HashMap hashMap7 = new HashMap();
        HashMap hashMap8 = new HashMap();
        etrd.b(etyz.AES_128_GCM, etnw.a, hashMap7, hashMap8);
        etrd.b(etyz.AES_256_GCM, etnw.b, hashMap7, hashMap8);
        etrd.b(etyz.CHACHA20_POLY1305, etnw.c, hashMap7, hashMap8);
        l = etrd.a(hashMap7, hashMap8);
    }

    public static etob a(euag euagVar, etzf etzfVar) {
        etoa etoaVar = (etoa) g.b(euagVar);
        etre etreVar = j;
        int i2 = etzfVar.b;
        etyz etyzVar = null;
        etzb etzbVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : etzb.DHKEM_P521_HKDF_SHA512 : etzb.DHKEM_P384_HKDF_SHA384 : etzb.DHKEM_P256_HKDF_SHA256 : etzb.DHKEM_X25519_HKDF_SHA256 : etzb.KEM_UNKNOWN;
        if (etzbVar == null) {
            etzbVar = etzb.UNRECOGNIZED;
        }
        etnz etnzVar = (etnz) etreVar.b(etzbVar);
        etre etreVar2 = k;
        int i3 = etzfVar.c;
        etza etzaVar = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? null : etza.HKDF_SHA512 : etza.HKDF_SHA384 : etza.HKDF_SHA256 : etza.KDF_UNKNOWN;
        if (etzaVar == null) {
            etzaVar = etza.UNRECOGNIZED;
        }
        etny etnyVar = (etny) etreVar2.b(etzaVar);
        etre etreVar3 = l;
        int i4 = etzfVar.d;
        if (i4 == 0) {
            etyzVar = etyz.AEAD_UNKNOWN;
        } else if (i4 == 1) {
            etyzVar = etyz.AES_128_GCM;
        } else if (i4 == 2) {
            etyzVar = etyz.AES_256_GCM;
        } else if (i4 == 3) {
            etyzVar = etyz.CHACHA20_POLY1305;
        }
        if (etyzVar == null) {
            etyzVar = etyz.UNRECOGNIZED;
        }
        return new etob(etnzVar, etnyVar, (etnw) etreVar3.b(etyzVar), etoaVar);
    }

    public static etzf b(etob etobVar) {
        etze etzeVar = (etze) etzf.a.createBuilder();
        etzb etzbVar = (etzb) j.a(etobVar.a);
        etzeVar.copyOnWrite();
        ((etzf) etzeVar.instance).b = etzbVar.a();
        etza etzaVar = (etza) k.a(etobVar.b);
        etzeVar.copyOnWrite();
        ((etzf) etzeVar.instance).c = etzaVar.a();
        etyz etyzVar = (etyz) l.a(etobVar.c);
        etzeVar.copyOnWrite();
        ((etzf) etzeVar.instance).d = etyzVar.a();
        return (etzf) etzeVar.build();
    }

    public static etzj c(etok etokVar) {
        etzi etziVar = (etzi) etzj.a.createBuilder();
        etziVar.copyOnWrite();
        ((etzj) etziVar.instance).c = 0;
        etzf b2 = b(etokVar.a);
        etziVar.copyOnWrite();
        etzj etzjVar = (etzj) etziVar.instance;
        b2.getClass();
        etzjVar.d = b2;
        etzjVar.b |= 1;
        eyee x = eyee.x(etokVar.b.c());
        etziVar.copyOnWrite();
        ((etzj) etziVar.instance).e = x;
        return (etzj) etziVar.build();
    }

    public static eujt d(etnz etnzVar, byte[] bArr) {
        int i2;
        BigInteger bigInteger = new BigInteger(1, bArr);
        byte[] bArr2 = etqb.a;
        if (etnzVar == etnz.f) {
            i2 = 32;
        } else if (etnzVar == etnz.a) {
            i2 = 65;
        } else if (etnzVar == etnz.b) {
            i2 = 97;
        } else {
            if (etnzVar != etnz.c) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            i2 = 133;
        }
        return eujt.b(etqq.b(bigInteger, i2));
    }
}
