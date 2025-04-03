package defpackage;

import j$.util.Objects;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etma {
    public static final etso a;
    public static final etsl b;
    public static final etro c;
    public static final etrl d;
    private static final eujt e;

    static {
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        e = b2;
        a = new etsm(etjz.class, ette.class, new etsn() { // from class: etlw
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                etjz etjzVar = (etjz) etgfVar;
                etso etsoVar = etma.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.XAesGcmKey";
                eubb eubbVar = (eubb) eubc.a.createBuilder();
                eubd eubdVar = (eubd) eube.a.createBuilder();
                int i = etjzVar.b;
                eubdVar.copyOnWrite();
                ((eube) eubdVar.instance).b = i;
                eube eubeVar = (eube) eubdVar.build();
                eubbVar.copyOnWrite();
                eubc eubcVar = (eubc) eubbVar.instance;
                eubeVar.getClass();
                eubcVar.d = eubeVar;
                eubcVar.b |= 1;
                eyee byteString = ((eubc) eubbVar.build()).toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag b3 = etma.b(etjzVar.a);
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = b3.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: etlx
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = etma.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    eubc eubcVar = (eubc) eyfy.parseFrom(eubc.a, eyeeVar, eyfc.a);
                    if (eubcVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    euag b3 = euag.b(etteVar.b.d);
                    if (b3 == null) {
                        b3 = euag.UNRECOGNIZED;
                    }
                    etjy a2 = etma.a(b3);
                    eube eubeVar = eubcVar.d;
                    if (eubeVar == null) {
                        eubeVar = eube.a;
                    }
                    return etjz.b(a2, eubeVar.b);
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e2);
                }
            }
        });
        c = new etrm(etju.class, ettd.class, new etrn() { // from class: etly
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                etju etjuVar = (etju) etfsVar;
                etso etsoVar = etma.a;
                euaz euazVar = (euaz) euba.a.createBuilder();
                eyee x = eyee.x(etjuVar.b.d());
                euazVar.copyOnWrite();
                ((euba) euazVar.instance).e = x;
                eubd eubdVar = (eubd) eube.a.createBuilder();
                int i = etjuVar.a.b;
                eubdVar.copyOnWrite();
                ((eube) eubdVar.instance).b = i;
                eube eubeVar = (eube) eubdVar.build();
                euazVar.copyOnWrite();
                euba eubaVar = (euba) euazVar.instance;
                eubeVar.getClass();
                eubaVar.d = eubeVar;
                eubaVar.b |= 1;
                return ettd.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((euba) euazVar.build()).toByteString(), 3, etma.b(etjuVar.a.a), etjuVar.d);
            }
        });
        d = new etrj(b2, ettd.class, new etrk() { // from class: etlz
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = etma.a;
                if (!((ettd) ettiVar).a.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    euba eubaVar = (euba) eyfy.parseFrom(euba.a, eyeeVar, eyfc.a);
                    if (eubaVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (eubaVar.e.d() != 32) {
                        throw new GeneralSecurityException("Only 32 byte key size is accepted");
                    }
                    etjy a2 = etma.a(((ettd) ettiVar).d);
                    eube eubeVar = eubaVar.d;
                    if (eubeVar == null) {
                        eubeVar = eube.a;
                    }
                    return etju.b(etjz.b(a2, eubeVar.b), eujv.c(eubaVar.e.I()), ((ettd) ettiVar).e);
                } catch (eygu unused) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
            }
        });
    }

    public static etjy a(euag euagVar) {
        int ordinal = euagVar.ordinal();
        if (ordinal == 1) {
            return etjy.a;
        }
        if (ordinal == 3) {
            return etjy.b;
        }
        throw new GeneralSecurityException(a.P(euagVar, "Unable to parse OutputPrefixType: "));
    }

    public static euag b(etjy etjyVar) {
        if (Objects.equals(etjyVar, etjy.a)) {
            return euag.TINK;
        }
        if (Objects.equals(etjyVar, etjy.b)) {
            return euag.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(etjyVar.c));
    }
}
