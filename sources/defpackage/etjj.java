package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etjj {
    public static final etso a;
    public static final etsl b;
    public static final etro c;
    public static final etrl d;
    private static final eujt e;

    static {
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        e = b2;
        a = new etsm(etje.class, ette.class, new etsn() { // from class: etjf
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                etje etjeVar = (etje) etgfVar;
                etso etsoVar = etjj.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
                eyee byteString = etjj.b(etjeVar).toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag c2 = etjj.c(etjeVar.a);
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = c2.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: etjg
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = etjj.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    euaf euafVar = (euaf) eyfy.parseFrom(euaf.a, eyeeVar, eyfc.a);
                    euag b3 = euag.b(etteVar.b.d);
                    if (b3 == null) {
                        b3 = euag.UNRECOGNIZED;
                    }
                    return etjj.a(euafVar, b3);
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
                }
            }
        });
        c = new etrm(etjb.class, ettd.class, new etrn() { // from class: etjh
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                etjb etjbVar = (etjb) etfsVar;
                etso etsoVar = etjj.a;
                euac euacVar = (euac) euad.a.createBuilder();
                euaf b3 = etjj.b(etjbVar.a);
                euacVar.copyOnWrite();
                euad euadVar = (euad) euacVar.instance;
                b3.getClass();
                euadVar.d = b3;
                euadVar.b |= 1;
                return ettd.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((euad) euacVar.build()).toByteString(), 6, etjj.c(etjbVar.a.a), etjbVar.c);
            }
        });
        d = new etrj(b2, ettd.class, new etrk() { // from class: etji
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = etjj.a;
                if (!((ettd) ettiVar).a.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    euad euadVar = (euad) eyfy.parseFrom(euad.a, eyeeVar, eyfc.a);
                    if (euadVar.c == 0) {
                        euaf euafVar = euadVar.d;
                        if (euafVar == null) {
                            euafVar = euaf.a;
                        }
                        return etjb.b(etjj.a(euafVar, ((ettd) ettiVar).d), ((ettd) ettiVar).e);
                    }
                    throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + String.valueOf(euadVar));
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
                }
            }
        });
    }

    public static etje a(euaf euafVar, euag euagVar) {
        etjc etjcVar;
        etjd etjdVar;
        etzo etzoVar = (etzo) etzp.a.createBuilder();
        etzp etzpVar = euafVar.d;
        if (etzpVar == null) {
            etzpVar = etzp.a;
        }
        String str = etzpVar.b;
        etzoVar.copyOnWrite();
        etzp etzpVar2 = (etzp) etzoVar.instance;
        str.getClass();
        etzpVar2.b = str;
        etzp etzpVar3 = euafVar.d;
        if (etzpVar3 == null) {
            etzpVar3 = etzp.a;
        }
        eyee eyeeVar = etzpVar3.c;
        etzoVar.copyOnWrite();
        etzp etzpVar4 = (etzp) etzoVar.instance;
        eyeeVar.getClass();
        etzpVar4.c = eyeeVar;
        euag euagVar2 = euag.RAW;
        etzoVar.copyOnWrite();
        ((etzp) etzoVar.instance).d = euagVar2.a();
        etgf a2 = etgm.a(((etzp) etzoVar.build()).toByteArray());
        if (a2 instanceof ethw) {
            etjcVar = etjc.a;
        } else if (a2 instanceof etil) {
            etjcVar = etjc.c;
        } else if (a2 instanceof etkg) {
            etjcVar = etjc.b;
        } else if (a2 instanceof ethf) {
            etjcVar = etjc.d;
        } else if (a2 instanceof ethn) {
            etjcVar = etjc.e;
        } else {
            if (!(a2 instanceof etif)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(a2.toString()));
            }
            etjcVar = etjc.f;
        }
        int ordinal = euagVar.ordinal();
        if (ordinal == 1) {
            etjdVar = etjd.a;
        } else {
            if (ordinal != 3) {
                throw new GeneralSecurityException(a.P(euagVar, "Unable to parse OutputPrefixType: "));
            }
            etjdVar = etjd.b;
        }
        String str2 = euafVar.c;
        etgr etgrVar = (etgr) a2;
        if (str2 == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (etgrVar.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((etjcVar.equals(etjc.a) && (etgrVar instanceof ethw)) || ((etjcVar.equals(etjc.c) && (etgrVar instanceof etil)) || ((etjcVar.equals(etjc.b) && (etgrVar instanceof etkg)) || ((etjcVar.equals(etjc.d) && (etgrVar instanceof ethf)) || ((etjcVar.equals(etjc.e) && (etgrVar instanceof ethn)) || (etjcVar.equals(etjc.f) && (etgrVar instanceof etif))))))) {
            return new etje(etjdVar, str2, etjcVar, etgrVar);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + etjcVar.g + " when new keys are picked according to " + etgrVar.toString() + ".");
    }

    public static euaf b(etje etjeVar) {
        byte[] b2 = etgm.b(etjeVar.c);
        try {
            eyfc eyfcVar = eyfc.a;
            eyib eyibVar = eyib.a;
            etzp etzpVar = (etzp) eyfy.parseFrom(etzp.a, b2, eyfc.a);
            euae euaeVar = (euae) euaf.a.createBuilder();
            String str = etjeVar.b;
            euaeVar.copyOnWrite();
            ((euaf) euaeVar.instance).c = str;
            euaeVar.copyOnWrite();
            euaf euafVar = (euaf) euaeVar.instance;
            etzpVar.getClass();
            euafVar.d = etzpVar;
            euafVar.b |= 1;
            return (euaf) euaeVar.build();
        } catch (eygu e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }

    public static euag c(etjd etjdVar) {
        if (etjd.a.equals(etjdVar)) {
            return euag.TINK;
        }
        if (etjd.b.equals(etjdVar)) {
            return euag.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(etjdVar.c));
    }
}
