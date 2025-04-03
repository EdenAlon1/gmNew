package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etlc {
    public static final etso a;
    public static final etsl b;
    public static final etro c;
    public static final etrl d;
    private static final eujt e;

    static {
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        e = b2;
        a = new etsm(etif.class, ette.class, new etsn() { // from class: etky
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                etif etifVar = (etif) etgfVar;
                etso etsoVar = etlc.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
                etxd etxdVar = (etxd) etxe.a.createBuilder();
                int i = etifVar.a;
                etxdVar.copyOnWrite();
                ((etxe) etxdVar.instance).b = i;
                eyee byteString = ((etxe) etxdVar.build()).toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag b3 = etlc.b(etifVar.b);
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = b3.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: etkz
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = etlc.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etxe etxeVar = (etxe) eyfy.parseFrom(etxe.a, eyeeVar, eyfc.a);
                    if (etxeVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    etid etidVar = new etid();
                    etidVar.b(etxeVar.b);
                    euag b3 = euag.b(etteVar.b.d);
                    if (b3 == null) {
                        b3 = euag.UNRECOGNIZED;
                    }
                    etidVar.a = etlc.a(b3);
                    return etidVar.a();
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e2);
                }
            }
        });
        c = new etrm(ethy.class, ettd.class, new etrn() { // from class: etla
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                ethy ethyVar = (ethy) etfsVar;
                etso etsoVar = etlc.a;
                etxb etxbVar = (etxb) etxc.a.createBuilder();
                eyee x = eyee.x(ethyVar.b.d());
                etxbVar.copyOnWrite();
                ((etxc) etxbVar.instance).c = x;
                eyee byteString = ((etxc) etxbVar.build()).toByteString();
                etie etieVar = ethyVar.a.b;
                return ettd.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", byteString, 3, etlc.b(etieVar), ethyVar.d);
            }
        });
        d = new etrj(b2, ettd.class, new etrk() { // from class: etlb
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = etlc.a;
                if (!((ettd) ettiVar).a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etxc etxcVar = (etxc) eyfy.parseFrom(etxc.a, eyeeVar, eyfc.a);
                    if (etxcVar.b != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    etid etidVar = new etid();
                    etidVar.b(etxcVar.c.d());
                    etidVar.a = etlc.a(((ettd) ettiVar).d);
                    return ethx.a(etidVar.a(), eujv.c(etxcVar.c.I()), ((ettd) ettiVar).e);
                } catch (eygu unused) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            }
        });
    }

    public static etie a(euag euagVar) {
        int ordinal = euagVar.ordinal();
        if (ordinal == 1) {
            return etie.a;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return etie.c;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(a.P(euagVar, "Unable to parse OutputPrefixType: "));
            }
        }
        return etie.b;
    }

    public static euag b(etie etieVar) {
        if (etie.a.equals(etieVar)) {
            return euag.TINK;
        }
        if (etie.b.equals(etieVar)) {
            return euag.CRUNCHY;
        }
        if (etie.c.equals(etieVar)) {
            return euag.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(etieVar))));
    }
}
