package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etkx {
    public static final etso a;
    public static final etsl b;
    public static final etro c;
    public static final etrl d;
    private static final eujt e;

    static {
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.AesGcmKey");
        e = b2;
        a = new etsm(ethw.class, ette.class, new etsn() { // from class: etkt
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                ethw ethwVar = (ethw) etgfVar;
                etkx.c(ethwVar);
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
                etwz etwzVar = (etwz) etxa.a.createBuilder();
                int i = ethwVar.a;
                etwzVar.copyOnWrite();
                ((etxa) etwzVar.instance).b = i;
                eyee byteString = ((etxa) etwzVar.build()).toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag b3 = etkx.b(ethwVar.d);
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = b3.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: etku
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = etkx.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etxa etxaVar = (etxa) eyfy.parseFrom(etxa.a, eyeeVar, eyfc.a);
                    if (etxaVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    ethu ethuVar = new ethu();
                    ethuVar.c(etxaVar.b);
                    ethuVar.b();
                    ethuVar.d();
                    euag b3 = euag.b(etteVar.b.d);
                    if (b3 == null) {
                        b3 = euag.UNRECOGNIZED;
                    }
                    ethuVar.a = etkx.a(b3);
                    return ethuVar.a();
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e2);
                }
            }
        });
        c = new etrm(ethp.class, ettd.class, new etrn() { // from class: etkv
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                ethp ethpVar = (ethp) etfsVar;
                etkx.c(ethpVar.a);
                etwx etwxVar = (etwx) etwy.a.createBuilder();
                eyee x = eyee.x(ethpVar.b.d());
                etwxVar.copyOnWrite();
                ((etwy) etwxVar.instance).c = x;
                eyee byteString = ((etwy) etwxVar.build()).toByteString();
                ethv ethvVar = ethpVar.a.d;
                return ettd.a("type.googleapis.com/google.crypto.tink.AesGcmKey", byteString, 3, etkx.b(ethvVar), ethpVar.d);
            }
        });
        d = new etrj(b2, ettd.class, new etrk() { // from class: etkw
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = etkx.a;
                if (!((ettd) ettiVar).a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etwy etwyVar = (etwy) eyfy.parseFrom(etwy.a, eyeeVar, eyfc.a);
                    if (etwyVar.b != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ethu ethuVar = new ethu();
                    ethuVar.c(etwyVar.c.d());
                    ethuVar.b();
                    ethuVar.d();
                    ethuVar.a = etkx.a(((ettd) ettiVar).d);
                    return etho.a(ethuVar.a(), eujv.c(etwyVar.c.I()), ((ettd) ettiVar).e);
                } catch (eygu unused) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            }
        });
    }

    public static ethv a(euag euagVar) {
        int ordinal = euagVar.ordinal();
        if (ordinal == 1) {
            return ethv.a;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return ethv.c;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(a.P(euagVar, "Unable to parse OutputPrefixType: "));
            }
        }
        return ethv.b;
    }

    public static euag b(ethv ethvVar) {
        if (ethv.a.equals(ethvVar)) {
            return euag.TINK;
        }
        if (ethv.b.equals(ethvVar)) {
            return euag.CRUNCHY;
        }
        if (ethv.c.equals(ethvVar)) {
            return euag.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(ethvVar))));
    }

    public static void c(ethw ethwVar) {
        int i = ethwVar.c;
        int i2 = ethwVar.b;
    }
}
