package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euez {
    public static final etso a;
    public static final etsl b;
    public static final etro c;
    public static final etrl d;
    public static final etro e;
    public static final etrl f;
    public static final etre g;
    public static final etre h;
    private static final eujt i;
    private static final eujt j;

    static {
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        i = b2;
        eujt b3 = ettp.b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        j = b3;
        a = new etsm(eude.class, ette.class, new etsn() { // from class: euet
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                eude eudeVar = (eude) etgfVar;
                etso etsoVar = euez.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
                euaj euajVar = (euaj) euak.a.createBuilder();
                euam a2 = euez.a(eudeVar);
                euajVar.copyOnWrite();
                euak euakVar = (euak) euajVar.instance;
                a2.getClass();
                euakVar.c = a2;
                euakVar.b |= 1;
                int i2 = eudeVar.b;
                euajVar.copyOnWrite();
                ((euak) euajVar.instance).d = i2;
                eyee c2 = euez.c(eudeVar.c);
                euajVar.copyOnWrite();
                ((euak) euajVar.instance).e = c2;
                eyee byteString = ((euak) euajVar.build()).toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag euagVar = (euag) euez.g.a(eudeVar.d);
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = euagVar.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: eueu
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = euez.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    euak euakVar = (euak) eyfy.parseFrom(euak.a, eyeeVar, eyfc.a);
                    BigInteger bigInteger = eude.a;
                    eudb eudbVar = new eudb();
                    etre etreVar = euez.h;
                    euam euamVar = euakVar.c;
                    if (euamVar == null) {
                        euamVar = euam.a;
                    }
                    etys b4 = etys.b(euamVar.b);
                    if (b4 == null) {
                        b4 = etys.UNRECOGNIZED;
                    }
                    eudbVar.b = (eudc) etreVar.b(b4);
                    eudbVar.a = euez.d(euakVar.e);
                    eudbVar.b(euakVar.d);
                    etre etreVar2 = euez.g;
                    euag b5 = euag.b(etteVar.b.d);
                    if (b5 == null) {
                        b5 = euag.UNRECOGNIZED;
                    }
                    eudbVar.c = (eudd) etreVar2.b(b5);
                    return eudbVar.a();
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e2);
                }
            }
        });
        c = new etrm(eudi.class, ettd.class, new etrn() { // from class: euev
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                eudi eudiVar = (eudi) etfsVar;
                return ettd.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", euez.b(eudiVar).toByteString(), 5, (euag) euez.g.a(eudiVar.a.d), eudiVar.d);
            }
        });
        d = new etrj(b3, ettd.class, new etrk() { // from class: euew
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = euez.a;
                ettd ettdVar = (ettd) ettiVar;
                if (!ettdVar.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(ettdVar.a)));
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    euaq euaqVar = (euaq) eyfy.parseFrom(euaq.a, eyeeVar, eyfc.a);
                    if (euaqVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger d2 = euez.d(euaqVar.e);
                    int bitLength = d2.bitLength();
                    BigInteger bigInteger = eude.a;
                    eudb eudbVar = new eudb();
                    etre etreVar = euez.h;
                    euam euamVar = euaqVar.d;
                    if (euamVar == null) {
                        euamVar = euam.a;
                    }
                    etys b4 = etys.b(euamVar.b);
                    if (b4 == null) {
                        b4 = etys.UNRECOGNIZED;
                    }
                    eudbVar.b = (eudc) etreVar.b(b4);
                    eudbVar.a = euez.d(euaqVar.f);
                    eudbVar.b(bitLength);
                    eudbVar.c = (eudd) euez.g.b(((ettd) ettiVar).d);
                    return eudh.a(eudbVar.a(), d2, ((ettd) ettiVar).e);
                } catch (eygu | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
                }
            }
        });
        e = new etrm(eudg.class, ettd.class, new etrn() { // from class: euex
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                eudg eudgVar = (eudg) etfsVar;
                etso etsoVar = euez.a;
                euan euanVar = (euan) euao.a.createBuilder();
                euanVar.copyOnWrite();
                ((euao) euanVar.instance).c = 0;
                euaq b4 = euez.b(eudgVar.a);
                euanVar.copyOnWrite();
                euao euaoVar = (euao) euanVar.instance;
                b4.getClass();
                euaoVar.d = b4;
                euaoVar.b |= 1;
                eyee f2 = euez.f(eudgVar.b);
                euanVar.copyOnWrite();
                ((euao) euanVar.instance).e = f2;
                eyee f3 = euez.f(eudgVar.c);
                euanVar.copyOnWrite();
                ((euao) euanVar.instance).f = f3;
                eyee f4 = euez.f(eudgVar.d);
                euanVar.copyOnWrite();
                ((euao) euanVar.instance).g = f4;
                eyee f5 = euez.f(eudgVar.e);
                euanVar.copyOnWrite();
                ((euao) euanVar.instance).h = f5;
                eyee f6 = euez.f(eudgVar.f);
                euanVar.copyOnWrite();
                ((euao) euanVar.instance).i = f6;
                eyee f7 = euez.f(eudgVar.g);
                euanVar.copyOnWrite();
                ((euao) euanVar.instance).j = f7;
                return ettd.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((euao) euanVar.build()).toByteString(), 4, (euag) euez.g.a(eudgVar.c().d), eudgVar.a());
            }
        });
        f = new etrj(b2, ettd.class, new etrk() { // from class: euey
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = euez.a;
                ettd ettdVar = (ettd) ettiVar;
                if (!ettdVar.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ettdVar.a)));
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    euao euaoVar = (euao) eyfy.parseFrom(euao.a, eyeeVar, eyfc.a);
                    if (euaoVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    euaq euaqVar = euaoVar.d;
                    if (euaqVar == null) {
                        euaqVar = euaq.a;
                    }
                    if (euaqVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger d2 = euez.d(euaqVar.e);
                    int bitLength = d2.bitLength();
                    BigInteger d3 = euez.d(euaqVar.f);
                    BigInteger bigInteger = eude.a;
                    eudb eudbVar = new eudb();
                    etre etreVar = euez.h;
                    euam euamVar = euaqVar.d;
                    if (euamVar == null) {
                        euamVar = euam.a;
                    }
                    etys b4 = etys.b(euamVar.b);
                    if (b4 == null) {
                        b4 = etys.UNRECOGNIZED;
                    }
                    eudbVar.b = (eudc) etreVar.b(b4);
                    eudbVar.a = d3;
                    eudbVar.b(bitLength);
                    eudbVar.c = (eudd) euez.g.b(((ettd) ettiVar).d);
                    eudi a2 = eudh.a(eudbVar.a(), d2, ((ettd) ettiVar).e);
                    eudf eudfVar = new eudf();
                    eudfVar.a = a2;
                    eudfVar.c(euez.e(euaoVar.f), euez.e(euaoVar.g));
                    eudfVar.b = euez.e(euaoVar.e);
                    eudfVar.b(euez.e(euaoVar.h), euez.e(euaoVar.i));
                    eudfVar.c = euez.e(euaoVar.j);
                    return eudfVar.a();
                } catch (eygu | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
                }
            }
        });
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        etrd.b(euag.RAW, eudd.d, hashMap, hashMap2);
        etrd.b(euag.TINK, eudd.a, hashMap, hashMap2);
        etrd.b(euag.CRUNCHY, eudd.b, hashMap, hashMap2);
        etrd.b(euag.LEGACY, eudd.c, hashMap, hashMap2);
        g = etrd.a(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        etrd.b(etys.SHA256, eudc.a, hashMap3, hashMap4);
        etrd.b(etys.SHA384, eudc.b, hashMap3, hashMap4);
        etrd.b(etys.SHA512, eudc.c, hashMap3, hashMap4);
        h = etrd.a(hashMap3, hashMap4);
    }

    public static euam a(eude eudeVar) {
        eual eualVar = (eual) euam.a.createBuilder();
        etys etysVar = (etys) h.a(eudeVar.e);
        eualVar.copyOnWrite();
        ((euam) eualVar.instance).b = etysVar.a();
        return (euam) eualVar.build();
    }

    public static euaq b(eudi eudiVar) {
        euap euapVar = (euap) euaq.a.createBuilder();
        euam a2 = a(eudiVar.a);
        euapVar.copyOnWrite();
        euaq euaqVar = (euaq) euapVar.instance;
        a2.getClass();
        euaqVar.d = a2;
        euaqVar.b |= 1;
        eyee c2 = c(eudiVar.b);
        euapVar.copyOnWrite();
        ((euaq) euapVar.instance).e = c2;
        eyee c3 = c(eudiVar.a.c);
        euapVar.copyOnWrite();
        ((euaq) euapVar.instance).f = c3;
        return (euaq) euapVar.build();
    }

    public static eyee c(BigInteger bigInteger) {
        return eyee.x(etqq.a(bigInteger));
    }

    public static BigInteger d(eyee eyeeVar) {
        return new BigInteger(1, eyeeVar.I());
    }

    public static euju e(eyee eyeeVar) {
        return new euju(new BigInteger(1, eyeeVar.I()));
    }

    public static eyee f(euju eujuVar) {
        return c(eujuVar.a);
    }
}
