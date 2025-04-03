package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etkq {
    public static final etso a;
    public static final etsl b;
    public static final etro c;
    public static final etrl d;
    private static final eujt e;

    static {
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        e = b2;
        a = new etsm(ethn.class, ette.class, new etsn() { // from class: etkm
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                ethn ethnVar = (ethn) etgfVar;
                etso etsoVar = etkq.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.AesEaxKey";
                etwn etwnVar = (etwn) etwo.a.createBuilder();
                etwq b3 = etkq.b(ethnVar);
                etwnVar.copyOnWrite();
                etwo etwoVar = (etwo) etwnVar.instance;
                b3.getClass();
                etwoVar.c = b3;
                etwoVar.b |= 1;
                int i = ethnVar.a;
                etwnVar.copyOnWrite();
                ((etwo) etwnVar.instance).d = i;
                eyee byteString = ((etwo) etwnVar.build()).toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag c2 = etkq.c(ethnVar.d);
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = c2.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: etkn
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = etkq.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etwo etwoVar = (etwo) eyfy.parseFrom(etwo.a, eyeeVar, eyfc.a);
                    ethl ethlVar = new ethl();
                    ethlVar.c(etwoVar.d);
                    etwq etwqVar = etwoVar.c;
                    if (etwqVar == null) {
                        etwqVar = etwq.a;
                    }
                    ethlVar.b(etwqVar.b);
                    ethlVar.d();
                    euag b3 = euag.b(etteVar.b.d);
                    if (b3 == null) {
                        b3 = euag.UNRECOGNIZED;
                    }
                    ethlVar.a = etkq.a(b3);
                    return ethlVar.a();
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e2);
                }
            }
        });
        c = new etrm(ethh.class, ettd.class, new etrn() { // from class: etko
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                ethh ethhVar = (ethh) etfsVar;
                etso etsoVar = etkq.a;
                etwl etwlVar = (etwl) etwm.a.createBuilder();
                etwq b3 = etkq.b(ethhVar.a);
                etwlVar.copyOnWrite();
                etwm etwmVar = (etwm) etwlVar.instance;
                b3.getClass();
                etwmVar.d = b3;
                etwmVar.b |= 1;
                eyee x = eyee.x(ethhVar.b.d());
                etwlVar.copyOnWrite();
                ((etwm) etwlVar.instance).e = x;
                return ettd.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((etwm) etwlVar.build()).toByteString(), 3, etkq.c(ethhVar.a.d), ethhVar.d);
            }
        });
        d = new etrj(b2, ettd.class, new etrk() { // from class: etkp
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = etkq.a;
                if (!((ettd) ettiVar).a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etwm etwmVar = (etwm) eyfy.parseFrom(etwm.a, eyeeVar, eyfc.a);
                    if (etwmVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ethl ethlVar = new ethl();
                    ethlVar.c(etwmVar.e.d());
                    etwq etwqVar = etwmVar.d;
                    if (etwqVar == null) {
                        etwqVar = etwq.a;
                    }
                    ethlVar.b(etwqVar.b);
                    ethlVar.d();
                    ethlVar.a = etkq.a(((ettd) ettiVar).d);
                    return ethg.a(ethlVar.a(), eujv.c(etwmVar.e.I()), ((ettd) ettiVar).e);
                } catch (eygu unused) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            }
        });
    }

    public static ethm a(euag euagVar) {
        int ordinal = euagVar.ordinal();
        if (ordinal == 1) {
            return ethm.a;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return ethm.c;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(a.P(euagVar, "Unable to parse OutputPrefixType: "));
            }
        }
        return ethm.b;
    }

    public static etwq b(ethn ethnVar) {
        int i = ethnVar.c;
        etwp etwpVar = (etwp) etwq.a.createBuilder();
        etwpVar.copyOnWrite();
        ((etwq) etwpVar.instance).b = ethnVar.b;
        return (etwq) etwpVar.build();
    }

    public static euag c(ethm ethmVar) {
        if (ethm.a.equals(ethmVar)) {
            return euag.TINK;
        }
        if (ethm.b.equals(ethmVar)) {
            return euag.CRUNCHY;
        }
        if (ethm.c.equals(ethmVar)) {
            return euag.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(ethmVar))));
    }
}
