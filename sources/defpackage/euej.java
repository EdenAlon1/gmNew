package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euej {
    public static final etso a;
    public static final etsl b;
    public static final etro c;
    public static final etrl d;
    public static final etro e;
    public static final etrl f;
    private static final eujt g;
    private static final eujt h;

    static {
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        g = b2;
        eujt b3 = ettp.b("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        h = b3;
        a = new etsm(eubo.class, ette.class, new etsn() { // from class: eued
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                eubo euboVar = (eubo) etgfVar;
                etso etsoVar = euej.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
                etxo etxoVar = (etxo) etxp.a.createBuilder();
                etxr b4 = euej.b(euboVar);
                etxoVar.copyOnWrite();
                etxp etxpVar = (etxp) etxoVar.instance;
                b4.getClass();
                etxpVar.c = b4;
                etxpVar.b |= 1;
                eyee byteString = ((etxp) etxoVar.build()).toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag d2 = euej.d(euboVar.d);
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = d2.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: euee
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = euej.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etxp etxpVar = (etxp) eyfy.parseFrom(etxp.a, eyeeVar, eyfc.a);
                    etxr etxrVar = etxpVar.c;
                    if (etxrVar == null) {
                        etxrVar = etxr.a;
                    }
                    etys b4 = etys.b(etxrVar.b);
                    if (b4 == null) {
                        b4 = etys.UNRECOGNIZED;
                    }
                    eubl f2 = euej.f(b4);
                    etxr etxrVar2 = etxpVar.c;
                    if (etxrVar2 == null) {
                        etxrVar2 = etxr.a;
                    }
                    int b5 = etxw.b(etxrVar2.d);
                    if (b5 == 0) {
                        b5 = 1;
                    }
                    eubm h2 = euej.h(b5);
                    etxr etxrVar3 = etxpVar.c;
                    if (etxrVar3 == null) {
                        etxrVar3 = etxr.a;
                    }
                    etyp b6 = etyp.b(etxrVar3.c);
                    if (b6 == null) {
                        b6 = etyp.UNRECOGNIZED;
                    }
                    eubk e2 = euej.e(b6);
                    euag b7 = euag.b(etteVar.b.d);
                    if (b7 == null) {
                        b7 = euag.UNRECOGNIZED;
                    }
                    return eubj.a(h2, e2, f2, euej.g(b7));
                } catch (eygu e3) {
                    throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e3);
                }
            }
        });
        c = new etrm(eubs.class, ettd.class, new etrn() { // from class: euef
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                eubs eubsVar = (eubs) etfsVar;
                eyee byteString = euej.c(eubsVar).toByteString();
                eubn eubnVar = eubsVar.a.d;
                return ettd.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", byteString, 5, euej.d(eubnVar), eubsVar.d);
            }
        });
        d = new etrj(b3, ettd.class, new etrk() { // from class: eueg
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = euej.a;
                ettd ettdVar = (ettd) ettiVar;
                if (!ettdVar.a.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ettdVar.a)));
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etxv etxvVar = (etxv) eyfy.parseFrom(etxv.a, eyeeVar, eyfc.a);
                    if (etxvVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    etxr etxrVar = etxvVar.d;
                    if (etxrVar == null) {
                        etxrVar = etxr.a;
                    }
                    etys b4 = etys.b(etxrVar.b);
                    if (b4 == null) {
                        b4 = etys.UNRECOGNIZED;
                    }
                    eubl f2 = euej.f(b4);
                    etxr etxrVar2 = etxvVar.d;
                    if (etxrVar2 == null) {
                        etxrVar2 = etxr.a;
                    }
                    int b5 = etxw.b(etxrVar2.d);
                    if (b5 == 0) {
                        b5 = 1;
                    }
                    eubm h2 = euej.h(b5);
                    etxr etxrVar3 = etxvVar.d;
                    if (etxrVar3 == null) {
                        etxrVar3 = etxr.a;
                    }
                    etyp b6 = etyp.b(etxrVar3.c);
                    if (b6 == null) {
                        b6 = etyp.UNRECOGNIZED;
                    }
                    return eubr.a(eubj.a(h2, euej.e(b6), f2, euej.g(((ettd) ettiVar).d)), new ECPoint(new BigInteger(1, etxvVar.e.I()), new BigInteger(1, etxvVar.f.I())), ((ettd) ettiVar).e);
                } catch (eygu | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            }
        });
        e = new etrm(eubq.class, ettd.class, new etrn() { // from class: eueh
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                eubq eubqVar = (eubq) etfsVar;
                etso etsoVar = euej.a;
                int a2 = euej.a(eubqVar.c().b);
                etxs etxsVar = (etxs) etxt.a.createBuilder();
                etxv c2 = euej.c(eubqVar.a);
                etxsVar.copyOnWrite();
                etxt etxtVar = (etxt) etxsVar.instance;
                c2.getClass();
                etxtVar.d = c2;
                etxtVar.b |= 1;
                eyee x = eyee.x(etqq.b(eubqVar.b.a, a2));
                etxsVar.copyOnWrite();
                ((etxt) etxsVar.instance).e = x;
                return ettd.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((etxt) etxsVar.build()).toByteString(), 4, euej.d(eubqVar.c().d), eubqVar.a());
            }
        });
        f = new etrj(b2, ettd.class, new etrk() { // from class: euei
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = euej.a;
                ettd ettdVar = (ettd) ettiVar;
                if (!ettdVar.a.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ettdVar.a)));
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etxt etxtVar = (etxt) eyfy.parseFrom(etxt.a, eyeeVar, eyfc.a);
                    if (etxtVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    etxv etxvVar = etxtVar.d;
                    if (etxvVar == null) {
                        etxvVar = etxv.a;
                    }
                    if (etxvVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    etxr etxrVar = etxvVar.d;
                    if (etxrVar == null) {
                        etxrVar = etxr.a;
                    }
                    etys b4 = etys.b(etxrVar.b);
                    if (b4 == null) {
                        b4 = etys.UNRECOGNIZED;
                    }
                    eubl f2 = euej.f(b4);
                    etxr etxrVar2 = etxvVar.d;
                    if (etxrVar2 == null) {
                        etxrVar2 = etxr.a;
                    }
                    int b5 = etxw.b(etxrVar2.d);
                    if (b5 == 0) {
                        b5 = 1;
                    }
                    eubm h2 = euej.h(b5);
                    etxr etxrVar3 = etxvVar.d;
                    if (etxrVar3 == null) {
                        etxrVar3 = etxr.a;
                    }
                    etyp b6 = etyp.b(etxrVar3.c);
                    if (b6 == null) {
                        b6 = etyp.UNRECOGNIZED;
                    }
                    return eubp.a(eubr.a(eubj.a(h2, euej.e(b6), f2, euej.g(((ettd) ettiVar).d)), new ECPoint(new BigInteger(1, etxvVar.e.I()), new BigInteger(1, etxvVar.f.I())), ((ettd) ettiVar).e), new euju(new BigInteger(1, etxtVar.e.I())));
                } catch (eygu | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
            }
        });
    }

    public static int a(eubk eubkVar) {
        if (eubk.a.equals(eubkVar)) {
            return 33;
        }
        if (eubk.b.equals(eubkVar)) {
            return 49;
        }
        if (eubk.c.equals(eubkVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(eubkVar.d));
    }

    public static etxr b(eubo euboVar) {
        etys etysVar;
        etyp etypVar;
        int i;
        etxq etxqVar = (etxq) etxr.a.createBuilder();
        eubl eublVar = euboVar.c;
        if (eubl.a.equals(eublVar)) {
            etysVar = etys.SHA256;
        } else if (eubl.b.equals(eublVar)) {
            etysVar = etys.SHA384;
        } else {
            if (!eubl.c.equals(eublVar)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(eublVar.d));
            }
            etysVar = etys.SHA512;
        }
        etxqVar.copyOnWrite();
        ((etxr) etxqVar.instance).b = etysVar.a();
        eubk eubkVar = euboVar.b;
        if (eubk.a.equals(eubkVar)) {
            etypVar = etyp.NIST_P256;
        } else if (eubk.b.equals(eubkVar)) {
            etypVar = etyp.NIST_P384;
        } else {
            if (!eubk.c.equals(eubkVar)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(eubkVar.d));
            }
            etypVar = etyp.NIST_P521;
        }
        etxqVar.copyOnWrite();
        ((etxr) etxqVar.instance).c = etypVar.a();
        eubm eubmVar = euboVar.a;
        if (eubm.a.equals(eubmVar)) {
            i = 3;
        } else {
            if (!eubm.b.equals(eubmVar)) {
                throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(eubmVar.c));
            }
            i = 4;
        }
        etxqVar.copyOnWrite();
        ((etxr) etxqVar.instance).d = etxw.a(i);
        return (etxr) etxqVar.build();
    }

    public static etxv c(eubs eubsVar) {
        int a2 = a(eubsVar.a.b);
        etxu etxuVar = (etxu) etxv.a.createBuilder();
        etxr b2 = b(eubsVar.a);
        etxuVar.copyOnWrite();
        etxv etxvVar = (etxv) etxuVar.instance;
        b2.getClass();
        etxvVar.d = b2;
        etxvVar.b |= 1;
        ECPoint eCPoint = eubsVar.b;
        eyee x = eyee.x(etqq.b(eCPoint.getAffineX(), a2));
        etxuVar.copyOnWrite();
        ((etxv) etxuVar.instance).e = x;
        eyee x2 = eyee.x(etqq.b(eCPoint.getAffineY(), a2));
        etxuVar.copyOnWrite();
        ((etxv) etxuVar.instance).f = x2;
        return (etxv) etxuVar.build();
    }

    public static euag d(eubn eubnVar) {
        if (eubn.a.equals(eubnVar)) {
            return euag.TINK;
        }
        if (eubn.b.equals(eubnVar)) {
            return euag.CRUNCHY;
        }
        if (eubn.d.equals(eubnVar)) {
            return euag.RAW;
        }
        if (eubn.c.equals(eubnVar)) {
            return euag.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(eubnVar.e));
    }

    public static eubk e(etyp etypVar) {
        int ordinal = etypVar.ordinal();
        if (ordinal == 1) {
            return eubk.a;
        }
        if (ordinal == 2) {
            return eubk.b;
        }
        if (ordinal == 3) {
            return eubk.c;
        }
        throw new GeneralSecurityException("Unable to parse EllipticCurveType: " + etypVar.a());
    }

    public static eubl f(etys etysVar) {
        int ordinal = etysVar.ordinal();
        if (ordinal == 2) {
            return eubl.b;
        }
        if (ordinal == 3) {
            return eubl.a;
        }
        if (ordinal == 4) {
            return eubl.c;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + etysVar.a());
    }

    public static eubn g(euag euagVar) {
        int ordinal = euagVar.ordinal();
        if (ordinal == 1) {
            return eubn.a;
        }
        if (ordinal == 2) {
            return eubn.c;
        }
        if (ordinal == 3) {
            return eubn.d;
        }
        if (ordinal == 4) {
            return eubn.b;
        }
        throw new GeneralSecurityException(a.P(euagVar, "Unable to parse OutputPrefixType: "));
    }

    public static eubm h(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return eubm.a;
        }
        if (i2 == 2) {
            return eubm.b;
        }
        throw new GeneralSecurityException("Unable to parse EcdsaSignatureEncoding: " + etxw.a(i));
    }
}
