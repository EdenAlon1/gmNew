package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etpo {
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
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        h = b2;
        eujt b3 = ettp.b("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        i = b3;
        a = new etsm(etnt.class, ette.class, new etsn() { // from class: etpi
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                etnt etntVar = (etnt) etgfVar;
                etso etsoVar = etpo.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
                etxz etxzVar = (etxz) etya.a.createBuilder();
                etyc c2 = etpo.c(etntVar);
                etxzVar.copyOnWrite();
                etya etyaVar = (etya) etxzVar.instance;
                c2.getClass();
                etyaVar.c = c2;
                etyaVar.b |= 1;
                eyee byteString = ((etya) etxzVar.build()).toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag euagVar = (euag) etpo.g.a(etntVar.e);
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = euagVar.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: etpj
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = etpo.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etya etyaVar = (etya) eyfy.parseFrom(etya.a, eyeeVar, eyfc.a);
                    euag b4 = euag.b(etteVar.b.d);
                    if (b4 == null) {
                        b4 = euag.UNRECOGNIZED;
                    }
                    etyc etycVar = etyaVar.c;
                    if (etycVar == null) {
                        etycVar = etyc.a;
                    }
                    return etpo.b(b4, etycVar);
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing EciesParameters failed: ", e2);
                }
            }
        });
        c = new etrm(etnv.class, ettd.class, new etrn() { // from class: etpk
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                etnv etnvVar = (etnv) etfsVar;
                return ettd.a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", etpo.d(etnvVar).toByteString(), 5, (euag) etpo.g.a(etnvVar.a.e), etnvVar.e);
            }
        });
        d = new etrj(b3, ettd.class, new etrk() { // from class: etpl
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = etpo.a;
                ettd ettdVar = (ettd) ettiVar;
                if (!ettdVar.a.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: ".concat(String.valueOf(ettdVar.a)));
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etyg etygVar = (etyg) eyfy.parseFrom(etyg.a, eyeeVar, eyfc.a);
                    if (etygVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    euag euagVar = ((ettd) ettiVar).d;
                    etyc etycVar = etygVar.d;
                    if (etycVar == null) {
                        etycVar = etyc.a;
                    }
                    etnt b4 = etpo.b(euagVar, etycVar);
                    if (!b4.b.equals(etnp.d)) {
                        return etnv.c(b4, new ECPoint(new BigInteger(1, etygVar.e.I()), new BigInteger(1, etygVar.f.I())), ((ettd) ettiVar).e);
                    }
                    if (etygVar.f.H()) {
                        return etnv.b(b4, eujt.b(etygVar.e.I()), ((ettd) ettiVar).e);
                    }
                    throw new GeneralSecurityException("Y must be empty for X25519 points");
                } catch (eygu | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            }
        });
        e = new etrm(etnu.class, ettd.class, new etrn() { // from class: etpm
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                etnu etnuVar = (etnu) etfsVar;
                etso etsoVar = etpo.a;
                etyd etydVar = (etyd) etye.a.createBuilder();
                etydVar.copyOnWrite();
                ((etye) etydVar.instance).c = 0;
                etyg d2 = etpo.d(etnuVar.a);
                etydVar.copyOnWrite();
                etye etyeVar = (etye) etydVar.instance;
                d2.getClass();
                etyeVar.d = d2;
                etyeVar.b |= 1;
                if (etnuVar.c().b.equals(etnp.d)) {
                    eyee x = eyee.x(etnuVar.c.d());
                    etydVar.copyOnWrite();
                    ((etye) etydVar.instance).e = x;
                } else {
                    eyee x2 = eyee.x(etqq.b(etnuVar.b.a, etpo.a(etnuVar.c().b)));
                    etydVar.copyOnWrite();
                    ((etye) etydVar.instance).e = x2;
                }
                return ettd.a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((etye) etydVar.build()).toByteString(), 4, (euag) etpo.g.a(etnuVar.c().e), etnuVar.a());
            }
        });
        f = new etrj(b2, ettd.class, new etrk() { // from class: etpn
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = etpo.a;
                ettd ettdVar = (ettd) ettiVar;
                if (!ettdVar.a.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ettdVar.a)));
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etye etyeVar = (etye) eyfy.parseFrom(etye.a, eyeeVar, eyfc.a);
                    if (etyeVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    etyg etygVar = etyeVar.d;
                    if (etygVar == null) {
                        etygVar = etyg.a;
                    }
                    if (etygVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    euag euagVar = ((ettd) ettiVar).d;
                    etyc etycVar = etygVar.d;
                    if (etycVar == null) {
                        etycVar = etyc.a;
                    }
                    etnt b4 = etpo.b(euagVar, etycVar);
                    if (!b4.b.equals(etnp.d)) {
                        return etnu.d(etnv.c(b4, new ECPoint(new BigInteger(1, etygVar.e.I()), new BigInteger(1, etygVar.f.I())), ((ettd) ettiVar).e), new euju(new BigInteger(1, etyeVar.e.I())));
                    }
                    etnv b5 = etnv.b(b4, eujt.b(etygVar.e.I()), ((ettd) ettiVar).e);
                    eujv c2 = eujv.c(etyeVar.e.I());
                    if (b5.c == null) {
                        throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
                    }
                    byte[] d2 = c2.d();
                    byte[] c3 = b5.c.c();
                    if (d2.length != 32) {
                        throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
                    }
                    if (Arrays.equals(eujr.c(d2), c3)) {
                        return new etnu(b5, null, c2);
                    }
                    throw new GeneralSecurityException("Invalid private key for public key.");
                } catch (eygu | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
            }
        });
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        etrd.b(euag.RAW, etns.c, hashMap, hashMap2);
        etrd.b(euag.TINK, etns.a, hashMap, hashMap2);
        etrd.b(euag.LEGACY, etns.b, hashMap, hashMap2);
        etrd.b(euag.CRUNCHY, etns.b, hashMap, hashMap2);
        g = etrd.a(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        etrd.b(etys.SHA1, etnq.a, hashMap3, hashMap4);
        etrd.b(etys.SHA224, etnq.b, hashMap3, hashMap4);
        etrd.b(etys.SHA256, etnq.c, hashMap3, hashMap4);
        etrd.b(etys.SHA384, etnq.d, hashMap3, hashMap4);
        etrd.b(etys.SHA512, etnq.e, hashMap3, hashMap4);
        j = etrd.a(hashMap3, hashMap4);
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        etrd.b(etyp.NIST_P256, etnp.a, hashMap5, hashMap6);
        etrd.b(etyp.NIST_P384, etnp.b, hashMap5, hashMap6);
        etrd.b(etyp.NIST_P521, etnp.c, hashMap5, hashMap6);
        etrd.b(etyp.CURVE25519, etnp.d, hashMap5, hashMap6);
        k = etrd.a(hashMap5, hashMap6);
        HashMap hashMap7 = new HashMap();
        HashMap hashMap8 = new HashMap();
        etrd.b(etxn.UNCOMPRESSED, etnr.b, hashMap7, hashMap8);
        etrd.b(etxn.COMPRESSED, etnr.a, hashMap7, hashMap8);
        etrd.b(etxn.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, etnr.c, hashMap7, hashMap8);
        l = etrd.a(hashMap7, hashMap8);
    }

    public static int a(etnp etnpVar) {
        if (etnp.a.equals(etnpVar)) {
            return 33;
        }
        if (etnp.b.equals(etnpVar)) {
            return 49;
        }
        if (etnp.c.equals(etnpVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(String.valueOf(String.valueOf(etnpVar))));
    }

    public static etnt b(euag euagVar, etyc etycVar) {
        etzo etzoVar = (etzo) etzp.a.createBuilder();
        etxy etxyVar = etycVar.d;
        if (etxyVar == null) {
            etxyVar = etxy.a;
        }
        etzp etzpVar = etxyVar.c;
        if (etzpVar == null) {
            etzpVar = etzp.a;
        }
        String str = etzpVar.b;
        etzoVar.copyOnWrite();
        etzp etzpVar2 = (etzp) etzoVar.instance;
        str.getClass();
        etzpVar2.b = str;
        euag euagVar2 = euag.RAW;
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).d = euagVar2.a();
        etxy etxyVar2 = etycVar.d;
        if (etxyVar2 == null) {
            etxyVar2 = etxy.a;
        }
        etzp etzpVar3 = etxyVar2.c;
        if (etzpVar3 == null) {
            etzpVar3 = etzp.a;
        }
        eyee eyeeVar = etzpVar3.c;
        etzoVar.copyOnWrite();
        etzp etzpVar4 = (etzp) etzoVar.instance;
        eyeeVar.getClass();
        etzpVar4.c = eyeeVar;
        etzp etzpVar5 = (etzp) etzoVar.build();
        Set set = etnt.a;
        etno etnoVar = new etno();
        etnoVar.d = (etns) g.b(euagVar);
        etre etreVar = k;
        etyi etyiVar = etycVar.c;
        if (etyiVar == null) {
            etyiVar = etyi.a;
        }
        etyp b2 = etyp.b(etyiVar.b);
        if (b2 == null) {
            b2 = etyp.UNRECOGNIZED;
        }
        etnoVar.a = (etnp) etreVar.b(b2);
        etre etreVar2 = j;
        etyi etyiVar2 = etycVar.c;
        if (etyiVar2 == null) {
            etyiVar2 = etyi.a;
        }
        etys b3 = etys.b(etyiVar2.c);
        if (b3 == null) {
            b3 = etys.UNRECOGNIZED;
        }
        etnoVar.b = (etnq) etreVar2.b(b3);
        etnoVar.b(etgm.a(etzpVar5.toByteArray()));
        etyi etyiVar3 = etycVar.c;
        if (etyiVar3 == null) {
            etyiVar3 = etyi.a;
        }
        eujt b4 = eujt.b(etyiVar3.d.I());
        if (b4.a() == 0) {
            etnoVar.e = null;
        } else {
            etnoVar.e = b4;
        }
        etyi etyiVar4 = etycVar.c;
        if (etyiVar4 == null) {
            etyiVar4 = etyi.a;
        }
        etyp b5 = etyp.b(etyiVar4.b);
        if (b5 == null) {
            b5 = etyp.UNRECOGNIZED;
        }
        if (b5.equals(etyp.CURVE25519)) {
            etxn b6 = etxn.b(etycVar.e);
            if (b6 == null) {
                b6 = etxn.UNRECOGNIZED;
            }
            if (!b6.equals(etxn.COMPRESSED)) {
                throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
            }
        } else {
            etre etreVar3 = l;
            etxn b7 = etxn.b(etycVar.e);
            if (b7 == null) {
                b7 = etxn.UNRECOGNIZED;
            }
            etnoVar.c = (etnr) etreVar3.b(b7);
        }
        return etnoVar.a();
    }

    public static etyc c(etnt etntVar) {
        etyh etyhVar = (etyh) etyi.a.createBuilder();
        etyp etypVar = (etyp) k.a(etntVar.b);
        etyhVar.copyOnWrite();
        ((etyi) etyhVar.instance).b = etypVar.a();
        etys etysVar = (etys) j.a(etntVar.c);
        etyhVar.copyOnWrite();
        ((etyi) etyhVar.instance).c = etysVar.a();
        eujt eujtVar = etntVar.g;
        if (eujtVar != null && eujtVar.a() > 0) {
            eyee x = eyee.x(eujtVar.c());
            etyhVar.copyOnWrite();
            ((etyi) etyhVar.instance).d = x;
        }
        etyi etyiVar = (etyi) etyhVar.build();
        try {
            byte[] b2 = etgm.b(etntVar.f);
            eyfc eyfcVar = eyfc.a;
            eyib eyibVar = eyib.a;
            etzp etzpVar = (etzp) eyfy.parseFrom(etzp.a, b2, eyfc.a);
            etxx etxxVar = (etxx) etxy.a.createBuilder();
            etzo etzoVar = (etzo) etzp.a.createBuilder();
            String str = etzpVar.b;
            etzoVar.copyOnWrite();
            etzp etzpVar2 = (etzp) etzoVar.instance;
            str.getClass();
            etzpVar2.b = str;
            euag euagVar = euag.TINK;
            etzoVar.copyOnWrite();
            ((etzp) etzoVar.instance).d = euagVar.a();
            eyee eyeeVar = etzpVar.c;
            etzoVar.copyOnWrite();
            etzp etzpVar3 = (etzp) etzoVar.instance;
            eyeeVar.getClass();
            etzpVar3.c = eyeeVar;
            etzp etzpVar4 = (etzp) etzoVar.build();
            etxxVar.copyOnWrite();
            etxy etxyVar = (etxy) etxxVar.instance;
            etzpVar4.getClass();
            etxyVar.c = etzpVar4;
            etxyVar.b |= 1;
            etxy etxyVar2 = (etxy) etxxVar.build();
            etnr etnrVar = etntVar.d;
            if (etnrVar == null) {
                etnrVar = etnr.a;
            }
            etyb etybVar = (etyb) etyc.a.createBuilder();
            etybVar.copyOnWrite();
            etyc etycVar = (etyc) etybVar.instance;
            etyiVar.getClass();
            etycVar.c = etyiVar;
            etycVar.b |= 1;
            etybVar.copyOnWrite();
            etyc etycVar2 = (etyc) etybVar.instance;
            etxyVar2.getClass();
            etycVar2.d = etxyVar2;
            etycVar2.b |= 2;
            etxn etxnVar = (etxn) l.a(etnrVar);
            etybVar.copyOnWrite();
            ((etyc) etybVar.instance).e = etxnVar.a();
            return (etyc) etybVar.build();
        } catch (eygu e2) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e2);
        }
    }

    public static etyg d(etnv etnvVar) {
        if (etnvVar.a.b.equals(etnp.d)) {
            etyf etyfVar = (etyf) etyg.a.createBuilder();
            etyfVar.copyOnWrite();
            ((etyg) etyfVar.instance).c = 0;
            etyc c2 = c(etnvVar.a);
            etyfVar.copyOnWrite();
            etyg etygVar = (etyg) etyfVar.instance;
            c2.getClass();
            etygVar.d = c2;
            etygVar.b |= 1;
            eyee x = eyee.x(etnvVar.c.c());
            etyfVar.copyOnWrite();
            ((etyg) etyfVar.instance).e = x;
            eyee eyeeVar = eyee.b;
            etyfVar.copyOnWrite();
            etyg etygVar2 = (etyg) etyfVar.instance;
            eyeeVar.getClass();
            etygVar2.f = eyeeVar;
            return (etyg) etyfVar.build();
        }
        int a2 = a(etnvVar.a.b);
        ECPoint eCPoint = etnvVar.b;
        if (eCPoint == null) {
            throw new GeneralSecurityException("NistCurvePoint was null for NIST curve");
        }
        etyf etyfVar2 = (etyf) etyg.a.createBuilder();
        etyfVar2.copyOnWrite();
        ((etyg) etyfVar2.instance).c = 0;
        etyc c3 = c(etnvVar.a);
        etyfVar2.copyOnWrite();
        etyg etygVar3 = (etyg) etyfVar2.instance;
        c3.getClass();
        etygVar3.d = c3;
        etygVar3.b |= 1;
        eyee x2 = eyee.x(etqq.b(eCPoint.getAffineX(), a2));
        etyfVar2.copyOnWrite();
        ((etyg) etyfVar2.instance).e = x2;
        eyee x3 = eyee.x(etqq.b(eCPoint.getAffineY(), a2));
        etyfVar2.copyOnWrite();
        ((etyg) etyfVar2.instance).f = x3;
        return (etyg) etyfVar2.build();
    }
}
