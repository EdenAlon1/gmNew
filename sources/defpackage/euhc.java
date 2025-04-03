package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euhc {
    public static final etso a;
    public static final etsl b;
    public static final etro c;
    public static final etrl d;
    private static final eujt e;

    static {
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey");
        e = b2;
        a = new etsm(eufz.class, ette.class, new etsn() { // from class: eugy
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                eufz eufzVar = (eufz) etgfVar;
                etso etsoVar = euhc.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
                etwt etwtVar = (etwt) etwu.a.createBuilder();
                int d2 = eufzVar.d();
                etwtVar.copyOnWrite();
                ((etwu) etwtVar.instance).e = d2;
                etww a2 = euhc.a(eufzVar);
                etwtVar.copyOnWrite();
                etwu etwuVar = (etwu) etwtVar.instance;
                a2.getClass();
                etwuVar.d = a2;
                etwuVar.b |= 1;
                eyee byteString = ((etwu) etwtVar.build()).toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag euagVar = euag.RAW;
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = euagVar.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: eugz
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = euhc.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmHkdfStreamingParameters.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etwu etwuVar = (etwu) eyfy.parseFrom(etwu.a, eyeeVar, eyfc.a);
                    if (etwuVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    etww etwwVar = etwuVar.d;
                    if (etwwVar == null) {
                        etwwVar = etww.a;
                    }
                    return euhc.b(etwwVar, etwuVar.e);
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing AesGcmHkdfStreamingParameters failed: ", e2);
                }
            }
        });
        c = new etrm(eufr.class, ettd.class, new etrn() { // from class: euha
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                eufr eufrVar = (eufr) etfsVar;
                etso etsoVar = euhc.a;
                etwr etwrVar = (etwr) etws.a.createBuilder();
                eyee x = eyee.x(eufrVar.b.d());
                etwrVar.copyOnWrite();
                ((etws) etwrVar.instance).e = x;
                etww a2 = euhc.a(eufrVar.a);
                etwrVar.copyOnWrite();
                etws etwsVar = (etws) etwrVar.instance;
                a2.getClass();
                etwsVar.d = a2;
                etwsVar.b |= 1;
                return ettd.a("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", ((etws) etwrVar.build()).toByteString(), 3, euag.RAW, null);
            }
        });
        d = new etrj(b2, ettd.class, new etrk() { // from class: euhb
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = euhc.a;
                if (!((ettd) ettiVar).a.equals("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmHkdfStreamingParameters.parseParameters");
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etws etwsVar = (etws) eyfy.parseFrom(etws.a, eyeeVar, eyfc.a);
                    if (etwsVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    etww etwwVar = etwsVar.d;
                    if (etwwVar == null) {
                        etwwVar = etww.a;
                    }
                    return eufr.b(euhc.b(etwwVar, etwsVar.e.d()), eujv.c(etwsVar.e.I()));
                } catch (eygu unused) {
                    throw new GeneralSecurityException("Parsing AesGcmHkdfStreamingKey failed");
                }
            }
        });
    }

    public static etww a(eufz eufzVar) {
        etys etysVar;
        etwv etwvVar = (etwv) etww.a.createBuilder();
        int b2 = eufzVar.b();
        etwvVar.copyOnWrite();
        ((etww) etwvVar.instance).b = b2;
        int c2 = eufzVar.c();
        etwvVar.copyOnWrite();
        ((etww) etwvVar.instance).c = c2;
        eufy eufyVar = eufy.a;
        eufy eufyVar2 = eufzVar.a;
        if (eufyVar.equals(eufyVar2)) {
            etysVar = etys.SHA1;
        } else if (eufy.b.equals(eufyVar2)) {
            etysVar = etys.SHA256;
        } else {
            if (!eufy.c.equals(eufyVar2)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(eufyVar2))));
            }
            etysVar = etys.SHA512;
        }
        etwvVar.copyOnWrite();
        ((etww) etwvVar.instance).d = etysVar.a();
        return (etww) etwvVar.build();
    }

    public static eufz b(etww etwwVar, int i) {
        eufy eufyVar;
        eufx eufxVar = new eufx();
        eufxVar.d(i);
        eufxVar.c(etwwVar.c);
        eufxVar.b(etwwVar.b);
        etys b2 = etys.b(etwwVar.d);
        if (b2 == null) {
            b2 = etys.UNRECOGNIZED;
        }
        int ordinal = b2.ordinal();
        if (ordinal == 1) {
            eufyVar = eufy.a;
        } else if (ordinal == 3) {
            eufyVar = eufy.b;
        } else {
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse HashType: " + b2.a());
            }
            eufyVar = eufy.c;
        }
        eufxVar.a = eufyVar;
        return eufxVar.a();
    }
}
