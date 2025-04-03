package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eugx {
    public static final etso a;
    public static final etsl b;
    public static final etro c;
    public static final etrl d;
    private static final eujt e;

    static {
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey");
        e = b2;
        a = new etsm(eufq.class, ette.class, new etsn() { // from class: eugt
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                eufq eufqVar = (eufq) etgfVar;
                etso etsoVar = eugx.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
                etwb etwbVar = (etwb) etwc.a.createBuilder();
                int e2 = eufqVar.e();
                etwbVar.copyOnWrite();
                ((etwc) etwbVar.instance).d = e2;
                etwe a2 = eugx.a(eufqVar);
                etwbVar.copyOnWrite();
                etwc etwcVar = (etwc) etwbVar.instance;
                a2.getClass();
                etwcVar.c = a2;
                etwcVar.b |= 1;
                eyee byteString = ((etwc) etwbVar.build()).toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag euagVar = euag.RAW;
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = euagVar.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: eugu
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = eugx.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etwc etwcVar = (etwc) eyfy.parseFrom(etwc.a, eyeeVar, eyfc.a);
                    etwe etweVar = etwcVar.c;
                    if (etweVar == null) {
                        etweVar = etwe.a;
                    }
                    return eugx.b(etweVar, etwcVar.d);
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacStreamingParameters failed: ", e2);
                }
            }
        });
        c = new etrm(eufk.class, ettd.class, new etrn() { // from class: eugv
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                eufk eufkVar = (eufk) etfsVar;
                etso etsoVar = eugx.a;
                etvz etvzVar = (etvz) etwa.a.createBuilder();
                eyee x = eyee.x(eufkVar.b.d());
                etvzVar.copyOnWrite();
                ((etwa) etvzVar.instance).e = x;
                etwe a2 = eugx.a(eufkVar.a);
                etvzVar.copyOnWrite();
                etwa etwaVar = (etwa) etvzVar.instance;
                a2.getClass();
                etwaVar.d = a2;
                etwaVar.b |= 1;
                return ettd.a("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey", ((etwa) etvzVar.build()).toByteString(), 3, euag.RAW, null);
            }
        });
        d = new etrj(b2, ettd.class, new etrk() { // from class: eugw
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = eugx.a;
                if (!((ettd) ettiVar).a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters");
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etwa etwaVar = (etwa) eyfy.parseFrom(etwa.a, eyeeVar, eyfc.a);
                    if (etwaVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    etwe etweVar = etwaVar.d;
                    if (etweVar == null) {
                        etweVar = etwe.a;
                    }
                    return eufk.b(eugx.b(etweVar, etwaVar.e.d()), eujv.c(etwaVar.e.I()));
                } catch (eygu unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacStreamingKey failed");
                }
            }
        });
    }

    public static etwe a(eufq eufqVar) {
        etwd etwdVar = (etwd) etwe.a.createBuilder();
        int b2 = eufqVar.b();
        etwdVar.copyOnWrite();
        ((etwe) etwdVar.instance).c = b2;
        int c2 = eufqVar.c();
        etwdVar.copyOnWrite();
        ((etwe) etwdVar.instance).d = c2;
        etys c3 = c(eufqVar.a);
        etwdVar.copyOnWrite();
        ((etwe) etwdVar.instance).e = c3.a();
        etyx etyxVar = (etyx) etyy.a.createBuilder();
        etys c4 = c(eufqVar.b);
        etyxVar.copyOnWrite();
        ((etyy) etyxVar.instance).b = c4.a();
        int d2 = eufqVar.d();
        etyxVar.copyOnWrite();
        ((etyy) etyxVar.instance).c = d2;
        etwdVar.copyOnWrite();
        etwe etweVar = (etwe) etwdVar.instance;
        etyy etyyVar = (etyy) etyxVar.build();
        etyyVar.getClass();
        etweVar.f = etyyVar;
        etweVar.b |= 1;
        return (etwe) etwdVar.build();
    }

    public static eufq b(etwe etweVar, int i) {
        eufo eufoVar = new eufo();
        eufoVar.d(i);
        eufoVar.c(etweVar.d);
        eufoVar.b(etweVar.c);
        etys b2 = etys.b(etweVar.e);
        if (b2 == null) {
            b2 = etys.UNRECOGNIZED;
        }
        eufoVar.a = d(b2);
        etyy etyyVar = etweVar.f;
        if (etyyVar == null) {
            etyyVar = etyy.a;
        }
        etys b3 = etys.b(etyyVar.b);
        if (b3 == null) {
            b3 = etys.UNRECOGNIZED;
        }
        eufoVar.b = d(b3);
        etyy etyyVar2 = etweVar.f;
        if (etyyVar2 == null) {
            etyyVar2 = etyy.a;
        }
        eufoVar.c = Integer.valueOf(etyyVar2.c);
        return eufoVar.a();
    }

    private static etys c(eufp eufpVar) {
        if (eufp.a.equals(eufpVar)) {
            return etys.SHA1;
        }
        if (eufp.b.equals(eufpVar)) {
            return etys.SHA256;
        }
        if (eufp.c.equals(eufpVar)) {
            return etys.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(eufpVar))));
    }

    private static eufp d(etys etysVar) {
        int ordinal = etysVar.ordinal();
        if (ordinal == 1) {
            return eufp.a;
        }
        if (ordinal == 3) {
            return eufp.b;
        }
        if (ordinal == 4) {
            return eufp.c;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + etysVar.a());
    }
}
