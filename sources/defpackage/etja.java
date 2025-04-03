package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etja {
    public static final etso a;
    public static final etsl b;
    public static final etro c;
    public static final etrl d;
    private static final eujt e;

    static {
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        e = b2;
        a = new etsm(etiv.class, ette.class, new etsn() { // from class: etiw
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                etiv etivVar = (etiv) etgfVar;
                etso etsoVar = etja.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.KmsAeadKey";
                euaa euaaVar = (euaa) euab.a.createBuilder();
                String str = etivVar.a;
                euaaVar.copyOnWrite();
                euab euabVar = (euab) euaaVar.instance;
                str.getClass();
                euabVar.b = str;
                eyee byteString = ((euab) euaaVar.build()).toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag b3 = etja.b(etivVar.b);
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = b3.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: etix
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = etja.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    String str = ((euab) eyfy.parseFrom(euab.a, eyeeVar, eyfc.a)).b;
                    euag b3 = euag.b(etteVar.b.d);
                    if (b3 == null) {
                        b3 = euag.UNRECOGNIZED;
                    }
                    return new etiv(str, etja.a(b3));
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e2);
                }
            }
        });
        c = new etrm(etit.class, ettd.class, new etrn() { // from class: etiy
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                etit etitVar = (etit) etfsVar;
                etso etsoVar = etja.a;
                etzy etzyVar = (etzy) etzz.a.createBuilder();
                euaa euaaVar = (euaa) euab.a.createBuilder();
                String str = etitVar.a.a;
                euaaVar.copyOnWrite();
                euab euabVar = (euab) euaaVar.instance;
                str.getClass();
                euabVar.b = str;
                euab euabVar2 = (euab) euaaVar.build();
                etzyVar.copyOnWrite();
                etzz etzzVar = (etzz) etzyVar.instance;
                euabVar2.getClass();
                etzzVar.d = euabVar2;
                etzzVar.b |= 1;
                return ettd.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((etzz) etzyVar.build()).toByteString(), 6, etja.b(etitVar.a.b), etitVar.c);
            }
        });
        d = new etrj(b2, ettd.class, new etrk() { // from class: etiz
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = etja.a;
                if (!((ettd) ettiVar).a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etzz etzzVar = (etzz) eyfy.parseFrom(etzz.a, eyeeVar, eyfc.a);
                    if (etzzVar.c == 0) {
                        euab euabVar = etzzVar.d;
                        if (euabVar == null) {
                            euabVar = euab.a;
                        }
                        return etit.b(new etiv(euabVar.b, etja.a(((ettd) ettiVar).d)), ((ettd) ettiVar).e);
                    }
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(etzzVar));
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e2);
                }
            }
        });
    }

    public static etiu a(euag euagVar) {
        int ordinal = euagVar.ordinal();
        if (ordinal == 1) {
            return etiu.a;
        }
        if (ordinal == 3) {
            return etiu.b;
        }
        throw new GeneralSecurityException(a.P(euagVar, "Unable to parse OutputPrefixType: "));
    }

    public static euag b(etiu etiuVar) {
        if (etiu.a.equals(etiuVar)) {
            return euag.TINK;
        }
        if (etiu.b.equals(etiuVar)) {
            return euag.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(etiuVar.c));
    }
}
