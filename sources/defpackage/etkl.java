package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etkl {
    public static final etso a;
    public static final etsl b;
    public static final etro c;
    public static final etrl d;
    private static final eujt e;

    static {
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        e = b2;
        a = new etsm(ethf.class, ette.class, new etsn() { // from class: etkh
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                ethf ethfVar = (ethf) etgfVar;
                etso etsoVar = etkl.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
                etvx etvxVar = (etvx) etvy.a.createBuilder();
                etwh etwhVar = (etwh) etwi.a.createBuilder();
                etwj etwjVar = (etwj) etwk.a.createBuilder();
                int i = ethfVar.c;
                etwjVar.copyOnWrite();
                ((etwk) etwjVar.instance).b = i;
                etwk etwkVar = (etwk) etwjVar.build();
                etwhVar.copyOnWrite();
                etwi etwiVar = (etwi) etwhVar.instance;
                etwkVar.getClass();
                etwiVar.c = etwkVar;
                etwiVar.b |= 1;
                int i2 = ethfVar.a;
                etwhVar.copyOnWrite();
                ((etwi) etwhVar.instance).d = i2;
                etwi etwiVar2 = (etwi) etwhVar.build();
                etvxVar.copyOnWrite();
                etvy etvyVar = (etvy) etvxVar.instance;
                etwiVar2.getClass();
                etvyVar.c = etwiVar2;
                etvyVar.b |= 1;
                etyv etyvVar = (etyv) etyw.a.createBuilder();
                etyy c2 = etkl.c(ethfVar);
                etyvVar.copyOnWrite();
                etyw etywVar = (etyw) etyvVar.instance;
                c2.getClass();
                etywVar.c = c2;
                etywVar.b |= 1;
                int i3 = ethfVar.b;
                etyvVar.copyOnWrite();
                ((etyw) etyvVar.instance).d = i3;
                etyw etywVar2 = (etyw) etyvVar.build();
                etvxVar.copyOnWrite();
                etvy etvyVar2 = (etvy) etvxVar.instance;
                etywVar2.getClass();
                etvyVar2.d = etywVar2;
                etvyVar2.b |= 2;
                eyee byteString = ((etvy) etvxVar.build()).toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag d2 = etkl.d(ethfVar.e);
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = d2.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: etki
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = etkl.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etvy etvyVar = (etvy) eyfy.parseFrom(etvy.a, eyeeVar, eyfc.a);
                    etyw etywVar = etvyVar.d;
                    if (etywVar == null) {
                        etywVar = etyw.a;
                    }
                    if (etywVar.e != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ethc ethcVar = new ethc();
                    etwi etwiVar = etvyVar.c;
                    if (etwiVar == null) {
                        etwiVar = etwi.a;
                    }
                    ethcVar.b(etwiVar.d);
                    etyw etywVar2 = etvyVar.d;
                    if (etywVar2 == null) {
                        etywVar2 = etyw.a;
                    }
                    ethcVar.c(etywVar2.d);
                    etwi etwiVar2 = etvyVar.c;
                    if (etwiVar2 == null) {
                        etwiVar2 = etwi.a;
                    }
                    etwk etwkVar = etwiVar2.c;
                    if (etwkVar == null) {
                        etwkVar = etwk.a;
                    }
                    ethcVar.d(etwkVar.b);
                    etyw etywVar3 = etvyVar.d;
                    if (etywVar3 == null) {
                        etywVar3 = etyw.a;
                    }
                    etyy etyyVar = etywVar3.c;
                    if (etyyVar == null) {
                        etyyVar = etyy.a;
                    }
                    ethcVar.e(etyyVar.c);
                    etyw etywVar4 = etvyVar.d;
                    if (etywVar4 == null) {
                        etywVar4 = etyw.a;
                    }
                    etyy etyyVar2 = etywVar4.c;
                    if (etyyVar2 == null) {
                        etyyVar2 = etyy.a;
                    }
                    etys b3 = etys.b(etyyVar2.b);
                    if (b3 == null) {
                        b3 = etys.UNRECOGNIZED;
                    }
                    ethcVar.a = etkl.a(b3);
                    euag b4 = euag.b(etteVar.b.d);
                    if (b4 == null) {
                        b4 = euag.UNRECOGNIZED;
                    }
                    ethcVar.b = etkl.b(b4);
                    return ethcVar.a();
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e2);
                }
            }
        });
        c = new etrm(etgx.class, ettd.class, new etrn() { // from class: etkj
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                etgx etgxVar = (etgx) etfsVar;
                etso etsoVar = etkl.a;
                etvv etvvVar = (etvv) etvw.a.createBuilder();
                etwf etwfVar = (etwf) etwg.a.createBuilder();
                etwj etwjVar = (etwj) etwk.a.createBuilder();
                int i = etgxVar.a.c;
                etwjVar.copyOnWrite();
                ((etwk) etwjVar.instance).b = i;
                etwk etwkVar = (etwk) etwjVar.build();
                etwfVar.copyOnWrite();
                etwg etwgVar = (etwg) etwfVar.instance;
                etwkVar.getClass();
                etwgVar.d = etwkVar;
                etwgVar.b |= 1;
                eyee x = eyee.x(etgxVar.b.d());
                etwfVar.copyOnWrite();
                ((etwg) etwfVar.instance).e = x;
                etwg etwgVar2 = (etwg) etwfVar.build();
                etvvVar.copyOnWrite();
                etvw etvwVar = (etvw) etvvVar.instance;
                etwgVar2.getClass();
                etvwVar.d = etwgVar2;
                etvwVar.b |= 1;
                etyt etytVar = (etyt) etyu.a.createBuilder();
                etyy c2 = etkl.c(etgxVar.a);
                etytVar.copyOnWrite();
                etyu etyuVar = (etyu) etytVar.instance;
                c2.getClass();
                etyuVar.d = c2;
                etyuVar.b |= 1;
                eyee x2 = eyee.x(etgxVar.c.d());
                etytVar.copyOnWrite();
                ((etyu) etytVar.instance).e = x2;
                etyu etyuVar2 = (etyu) etytVar.build();
                etvvVar.copyOnWrite();
                etvw etvwVar2 = (etvw) etvvVar.instance;
                etyuVar2.getClass();
                etvwVar2.e = etyuVar2;
                etvwVar2.b |= 2;
                return ettd.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((etvw) etvvVar.build()).toByteString(), 3, etkl.d(etgxVar.a.e), etgxVar.e);
            }
        });
        d = new etrj(b2, ettd.class, new etrk() { // from class: etkk
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = etkl.a;
                if (!((ettd) ettiVar).a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etvw etvwVar = (etvw) eyfy.parseFrom(etvw.a, eyeeVar, eyfc.a);
                    if (etvwVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    etwg etwgVar = etvwVar.d;
                    if (etwgVar == null) {
                        etwgVar = etwg.a;
                    }
                    if (etwgVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    etyu etyuVar = etvwVar.e;
                    if (etyuVar == null) {
                        etyuVar = etyu.a;
                    }
                    if (etyuVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    ethc ethcVar = new ethc();
                    etwg etwgVar2 = etvwVar.d;
                    if (etwgVar2 == null) {
                        etwgVar2 = etwg.a;
                    }
                    ethcVar.b(etwgVar2.e.d());
                    etyu etyuVar2 = etvwVar.e;
                    if (etyuVar2 == null) {
                        etyuVar2 = etyu.a;
                    }
                    ethcVar.c(etyuVar2.e.d());
                    etwg etwgVar3 = etvwVar.d;
                    if (etwgVar3 == null) {
                        etwgVar3 = etwg.a;
                    }
                    etwk etwkVar = etwgVar3.d;
                    if (etwkVar == null) {
                        etwkVar = etwk.a;
                    }
                    ethcVar.d(etwkVar.b);
                    etyu etyuVar3 = etvwVar.e;
                    if (etyuVar3 == null) {
                        etyuVar3 = etyu.a;
                    }
                    etyy etyyVar = etyuVar3.d;
                    if (etyyVar == null) {
                        etyyVar = etyy.a;
                    }
                    ethcVar.e(etyyVar.c);
                    etyu etyuVar4 = etvwVar.e;
                    if (etyuVar4 == null) {
                        etyuVar4 = etyu.a;
                    }
                    etyy etyyVar2 = etyuVar4.d;
                    if (etyyVar2 == null) {
                        etyyVar2 = etyy.a;
                    }
                    etys b3 = etys.b(etyyVar2.b);
                    if (b3 == null) {
                        b3 = etys.UNRECOGNIZED;
                    }
                    ethcVar.a = etkl.a(b3);
                    ethcVar.b = etkl.b(((ettd) ettiVar).d);
                    ethf a2 = ethcVar.a();
                    etwg etwgVar4 = etvwVar.d;
                    if (etwgVar4 == null) {
                        etwgVar4 = etwg.a;
                    }
                    eujv c2 = eujv.c(etwgVar4.e.I());
                    etyu etyuVar5 = etvwVar.e;
                    if (etyuVar5 == null) {
                        etyuVar5 = etyu.a;
                    }
                    return etgw.a(a2, c2, eujv.c(etyuVar5.e.I()), ((ettd) ettiVar).e);
                } catch (eygu unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            }
        });
    }

    public static ethd a(etys etysVar) {
        int ordinal = etysVar.ordinal();
        if (ordinal == 1) {
            return ethd.a;
        }
        if (ordinal == 2) {
            return ethd.d;
        }
        if (ordinal == 3) {
            return ethd.c;
        }
        if (ordinal == 4) {
            return ethd.e;
        }
        if (ordinal == 5) {
            return ethd.b;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + etysVar.a());
    }

    public static ethe b(euag euagVar) {
        int ordinal = euagVar.ordinal();
        if (ordinal == 1) {
            return ethe.a;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return ethe.c;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(a.P(euagVar, "Unable to parse OutputPrefixType: "));
            }
        }
        return ethe.b;
    }

    public static etyy c(ethf ethfVar) {
        etys etysVar;
        etyx etyxVar = (etyx) etyy.a.createBuilder();
        etyxVar.copyOnWrite();
        ((etyy) etyxVar.instance).c = ethfVar.d;
        ethd ethdVar = ethd.a;
        ethd ethdVar2 = ethfVar.f;
        if (ethdVar.equals(ethdVar2)) {
            etysVar = etys.SHA1;
        } else if (ethd.b.equals(ethdVar2)) {
            etysVar = etys.SHA224;
        } else if (ethd.c.equals(ethdVar2)) {
            etysVar = etys.SHA256;
        } else if (ethd.d.equals(ethdVar2)) {
            etysVar = etys.SHA384;
        } else {
            if (!ethd.e.equals(ethdVar2)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(ethdVar2))));
            }
            etysVar = etys.SHA512;
        }
        etyxVar.copyOnWrite();
        ((etyy) etyxVar.instance).b = etysVar.a();
        return (etyy) etyxVar.build();
    }

    public static euag d(ethe etheVar) {
        if (ethe.a.equals(etheVar)) {
            return euag.TINK;
        }
        if (ethe.b.equals(etheVar)) {
            return euag.CRUNCHY;
        }
        if (ethe.c.equals(etheVar)) {
            return euag.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(etheVar))));
    }
}
