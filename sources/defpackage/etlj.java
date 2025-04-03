package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etlj {
    public static final etso a;
    public static final etsl b;
    public static final etro c;
    public static final etrl d;
    private static final eujt e;

    static {
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        e = b2;
        a = new etsm(etil.class, ette.class, new etsn() { // from class: etlf
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                etso etsoVar = etlj.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
                eyee byteString = etxm.a.toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag b3 = etlj.b(((etil) etgfVar).a);
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = b3.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: etlg
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = etlj.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    euag b3 = euag.b(etteVar.b.d);
                    if (b3 == null) {
                        b3 = euag.UNRECOGNIZED;
                    }
                    return new etil(etlj.a(b3));
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e2);
                }
            }
        });
        c = new etrm(etig.class, ettd.class, new etrn() { // from class: etlh
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                etig etigVar = (etig) etfsVar;
                etso etsoVar = etlj.a;
                etxj etxjVar = (etxj) etxk.a.createBuilder();
                eyee x = eyee.x(etigVar.b.d());
                etxjVar.copyOnWrite();
                ((etxk) etxjVar.instance).c = x;
                eyee byteString = ((etxk) etxjVar.build()).toByteString();
                etik etikVar = etigVar.a.a;
                return ettd.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", byteString, 3, etlj.b(etikVar), etigVar.d);
            }
        });
        d = new etrj(b2, ettd.class, new etrk() { // from class: etli
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = etlj.a;
                if (!((ettd) ettiVar).a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etxk etxkVar = (etxk) eyfy.parseFrom(etxk.a, eyeeVar, eyfc.a);
                    if (etxkVar.b == 0) {
                        return etig.b(etlj.a(((ettd) ettiVar).d), eujv.c(etxkVar.c.I()), ((ettd) ettiVar).e);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (eygu unused) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            }
        });
    }

    public static etik a(euag euagVar) {
        int ordinal = euagVar.ordinal();
        if (ordinal == 1) {
            return etik.a;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return etik.c;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(a.P(euagVar, "Unable to parse OutputPrefixType: "));
            }
        }
        return etik.b;
    }

    public static euag b(etik etikVar) {
        if (etik.a.equals(etikVar)) {
            return euag.TINK;
        }
        if (etik.b.equals(etikVar)) {
            return euag.CRUNCHY;
        }
        if (etik.c.equals(etikVar)) {
            return euag.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(etikVar.d));
    }
}
