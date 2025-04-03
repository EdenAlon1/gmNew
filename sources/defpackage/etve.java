package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etve {
    public static final etso a;
    public static final etsl b;
    public static final etro c;
    public static final etrl d;
    private static final eujt e;

    static {
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        e = b2;
        a = new etsm(etty.class, ette.class, new etsn() { // from class: etva
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                etty ettyVar = (etty) etgfVar;
                etso etsoVar = etve.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.AesCmacKey";
                etvr etvrVar = (etvr) etvs.a.createBuilder();
                etvu b3 = etve.b(ettyVar);
                etvrVar.copyOnWrite();
                etvs etvsVar = (etvs) etvrVar.instance;
                b3.getClass();
                etvsVar.d = b3;
                etvsVar.b |= 1;
                int i = ettyVar.a;
                etvrVar.copyOnWrite();
                ((etvs) etvrVar.instance).c = i;
                eyee byteString = ((etvs) etvrVar.build()).toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag c2 = etve.c(ettyVar.c);
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = c2.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: etvb
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = etve.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etvs etvsVar = (etvs) eyfy.parseFrom(etvs.a, eyeeVar, eyfc.a);
                    ettw ettwVar = new ettw();
                    ettwVar.b(etvsVar.c);
                    etvu etvuVar = etvsVar.d;
                    if (etvuVar == null) {
                        etvuVar = etvu.a;
                    }
                    ettwVar.c(etvuVar.b);
                    euag b3 = euag.b(etteVar.b.d);
                    if (b3 == null) {
                        b3 = euag.UNRECOGNIZED;
                    }
                    ettwVar.a = etve.a(b3);
                    return ettwVar.a();
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e2);
                }
            }
        });
        c = new etrm(ettr.class, ettd.class, new etrn() { // from class: etvc
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                ettr ettrVar = (ettr) etfsVar;
                etso etsoVar = etve.a;
                etvp etvpVar = (etvp) etvq.a.createBuilder();
                etvu b3 = etve.b(ettrVar.a);
                etvpVar.copyOnWrite();
                etvq etvqVar = (etvq) etvpVar.instance;
                b3.getClass();
                etvqVar.e = b3;
                etvqVar.b |= 1;
                eyee x = eyee.x(ettrVar.b.d());
                etvpVar.copyOnWrite();
                ((etvq) etvpVar.instance).d = x;
                return ettd.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((etvq) etvpVar.build()).toByteString(), 3, etve.c(ettrVar.a.c), ettrVar.d);
            }
        });
        d = new etrj(b2, ettd.class, new etrk() { // from class: etvd
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = etve.a;
                if (!((ettd) ettiVar).a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etvq etvqVar = (etvq) eyfy.parseFrom(etvq.a, eyeeVar, eyfc.a);
                    if (etvqVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ettw ettwVar = new ettw();
                    ettwVar.b(etvqVar.d.d());
                    etvu etvuVar = etvqVar.e;
                    if (etvuVar == null) {
                        etvuVar = etvu.a;
                    }
                    ettwVar.c(etvuVar.b);
                    ettwVar.a = etve.a(((ettd) ettiVar).d);
                    return ettq.a(ettwVar.a(), eujv.c(etvqVar.d.I()), ((ettd) ettiVar).e);
                } catch (eygu | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            }
        });
    }

    public static ettx a(euag euagVar) {
        int ordinal = euagVar.ordinal();
        if (ordinal == 1) {
            return ettx.a;
        }
        if (ordinal == 2) {
            return ettx.c;
        }
        if (ordinal == 3) {
            return ettx.d;
        }
        if (ordinal == 4) {
            return ettx.b;
        }
        throw new GeneralSecurityException(a.P(euagVar, "Unable to parse OutputPrefixType: "));
    }

    public static etvu b(etty ettyVar) {
        etvt etvtVar = (etvt) etvu.a.createBuilder();
        etvtVar.copyOnWrite();
        ((etvu) etvtVar.instance).b = ettyVar.b;
        return (etvu) etvtVar.build();
    }

    public static euag c(ettx ettxVar) {
        if (ettx.a.equals(ettxVar)) {
            return euag.TINK;
        }
        if (ettx.b.equals(ettxVar)) {
            return euag.CRUNCHY;
        }
        if (ettx.d.equals(ettxVar)) {
            return euag.RAW;
        }
        if (ettx.c.equals(ettxVar)) {
            return euag.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(ettxVar))));
    }
}
