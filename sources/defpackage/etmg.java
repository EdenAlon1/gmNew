package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etmg {
    public static final etso a;
    public static final etsl b;
    public static final etro c;
    public static final etrl d;
    private static final eujt e;

    static {
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        e = b2;
        a = new etsm(etkg.class, ette.class, new etsn() { // from class: etmc
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                etso etsoVar = etmg.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
                eyee byteString = eubi.a.toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag b3 = etmg.b(((etkg) etgfVar).a);
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = b3.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: etmd
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = etmg.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    if (((eubi) eyfy.parseFrom(eubi.a, eyeeVar, eyfc.a)).b != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    euag b3 = euag.b(etteVar.b.d);
                    if (b3 == null) {
                        b3 = euag.UNRECOGNIZED;
                    }
                    return new etkg(etmg.a(b3));
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e2);
                }
            }
        });
        c = new etrm(etka.class, ettd.class, new etrn() { // from class: etme
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                etka etkaVar = (etka) etfsVar;
                etso etsoVar = etmg.a;
                eubf eubfVar = (eubf) eubg.a.createBuilder();
                eyee x = eyee.x(etkaVar.b.d());
                eubfVar.copyOnWrite();
                ((eubg) eubfVar.instance).c = x;
                eyee byteString = ((eubg) eubfVar.build()).toByteString();
                etkf etkfVar = etkaVar.a.a;
                return ettd.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", byteString, 3, etmg.b(etkfVar), etkaVar.d);
            }
        });
        d = new etrj(b2, ettd.class, new etrk() { // from class: etmf
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = etmg.a;
                if (!((ettd) ettiVar).a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    eubg eubgVar = (eubg) eyfy.parseFrom(eubg.a, eyeeVar, eyfc.a);
                    if (eubgVar.b == 0) {
                        return etka.b(etmg.a(((ettd) ettiVar).d), eujv.c(eubgVar.c.I()), ((ettd) ettiVar).e);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (eygu unused) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            }
        });
    }

    public static etkf a(euag euagVar) {
        int ordinal = euagVar.ordinal();
        if (ordinal == 1) {
            return etkf.a;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return etkf.c;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(a.P(euagVar, "Unable to parse OutputPrefixType: "));
            }
        }
        return etkf.b;
    }

    public static euag b(etkf etkfVar) {
        if (etkf.a.equals(etkfVar)) {
            return euag.TINK;
        }
        if (etkf.b.equals(etkfVar)) {
            return euag.CRUNCHY;
        }
        if (etkf.c.equals(etkfVar)) {
            return euag.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(etkfVar.d));
    }
}
