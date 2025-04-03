package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eufh {
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
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        i = b2;
        eujt b3 = ettp.b("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        j = b3;
        a = new etsm(eudq.class, ette.class, new etsn() { // from class: eufb
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                eudq eudqVar = (eudq) etgfVar;
                etso etsoVar = eufh.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
                euar euarVar = (euar) euas.a.createBuilder();
                euau a2 = eufh.a(eudqVar);
                euarVar.copyOnWrite();
                euas euasVar = (euas) euarVar.instance;
                a2.getClass();
                euasVar.c = a2;
                euasVar.b |= 1;
                int i2 = eudqVar.b;
                euarVar.copyOnWrite();
                ((euas) euarVar.instance).d = i2;
                eyee c2 = eufh.c(eudqVar.c);
                euarVar.copyOnWrite();
                ((euas) euarVar.instance).e = c2;
                eyee byteString = ((euas) euarVar.build()).toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag euagVar = (euag) eufh.g.a(eudqVar.d);
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = euagVar.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: eufc
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = eufh.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    euas euasVar = (euas) eyfy.parseFrom(euas.a, eyeeVar, eyfc.a);
                    BigInteger bigInteger = eudq.a;
                    eudn eudnVar = new eudn();
                    etre etreVar = eufh.h;
                    euau euauVar = euasVar.c;
                    if (euauVar == null) {
                        euauVar = euau.a;
                    }
                    etys b4 = etys.b(euauVar.b);
                    if (b4 == null) {
                        b4 = etys.UNRECOGNIZED;
                    }
                    eudnVar.b = (eudo) etreVar.b(b4);
                    etre etreVar2 = eufh.h;
                    euau euauVar2 = euasVar.c;
                    if (euauVar2 == null) {
                        euauVar2 = euau.a;
                    }
                    etys b5 = etys.b(euauVar2.c);
                    if (b5 == null) {
                        b5 = etys.UNRECOGNIZED;
                    }
                    eudnVar.c = (eudo) etreVar2.b(b5);
                    eudnVar.a = eufh.d(euasVar.e);
                    eudnVar.b(euasVar.d);
                    euau euauVar3 = euasVar.c;
                    if (euauVar3 == null) {
                        euauVar3 = euau.a;
                    }
                    eudnVar.c(euauVar3.d);
                    etre etreVar3 = eufh.g;
                    euag b6 = euag.b(etteVar.b.d);
                    if (b6 == null) {
                        b6 = euag.UNRECOGNIZED;
                    }
                    eudnVar.d = (eudp) etreVar3.b(b6);
                    return eudnVar.a();
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e2);
                }
            }
        });
        c = new etrm(eudu.class, ettd.class, new etrn() { // from class: eufd
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                eudu euduVar = (eudu) etfsVar;
                return ettd.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", eufh.b(euduVar).toByteString(), 5, (euag) eufh.g.a(euduVar.a.d), euduVar.d);
            }
        });
        d = new etrj(b3, ettd.class, new etrk() { // from class: eufe
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = eufh.a;
                ettd ettdVar = (ettd) ettiVar;
                if (!ettdVar.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(ettdVar.a)));
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    euay euayVar = (euay) eyfy.parseFrom(euay.a, eyeeVar, eyfc.a);
                    if (euayVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger d2 = eufh.d(euayVar.e);
                    int bitLength = d2.bitLength();
                    BigInteger bigInteger = eudq.a;
                    eudn eudnVar = new eudn();
                    etre etreVar = eufh.h;
                    euau euauVar = euayVar.d;
                    if (euauVar == null) {
                        euauVar = euau.a;
                    }
                    etys b4 = etys.b(euauVar.b);
                    if (b4 == null) {
                        b4 = etys.UNRECOGNIZED;
                    }
                    eudnVar.b = (eudo) etreVar.b(b4);
                    etre etreVar2 = eufh.h;
                    euau euauVar2 = euayVar.d;
                    if (euauVar2 == null) {
                        euauVar2 = euau.a;
                    }
                    etys b5 = etys.b(euauVar2.c);
                    if (b5 == null) {
                        b5 = etys.UNRECOGNIZED;
                    }
                    eudnVar.c = (eudo) etreVar2.b(b5);
                    eudnVar.a = eufh.d(euayVar.f);
                    eudnVar.b(bitLength);
                    euau euauVar3 = euayVar.d;
                    if (euauVar3 == null) {
                        euauVar3 = euau.a;
                    }
                    eudnVar.c(euauVar3.d);
                    eudnVar.d = (eudp) eufh.g.b(((ettd) ettiVar).d);
                    return eudt.a(eudnVar.a(), d2, ((ettd) ettiVar).e);
                } catch (eygu | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
                }
            }
        });
        e = new etrm(euds.class, ettd.class, new etrn() { // from class: euff
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                euds eudsVar = (euds) etfsVar;
                etso etsoVar = eufh.a;
                euav euavVar = (euav) euaw.a.createBuilder();
                euavVar.copyOnWrite();
                ((euaw) euavVar.instance).c = 0;
                euay b4 = eufh.b(eudsVar.a);
                euavVar.copyOnWrite();
                euaw euawVar = (euaw) euavVar.instance;
                b4.getClass();
                euawVar.d = b4;
                euawVar.b |= 1;
                eyee f2 = eufh.f(eudsVar.b);
                euavVar.copyOnWrite();
                ((euaw) euavVar.instance).e = f2;
                eyee f3 = eufh.f(eudsVar.c);
                euavVar.copyOnWrite();
                ((euaw) euavVar.instance).f = f3;
                eyee f4 = eufh.f(eudsVar.d);
                euavVar.copyOnWrite();
                ((euaw) euavVar.instance).g = f4;
                eyee f5 = eufh.f(eudsVar.e);
                euavVar.copyOnWrite();
                ((euaw) euavVar.instance).h = f5;
                eyee f6 = eufh.f(eudsVar.f);
                euavVar.copyOnWrite();
                ((euaw) euavVar.instance).i = f6;
                eyee f7 = eufh.f(eudsVar.g);
                euavVar.copyOnWrite();
                ((euaw) euavVar.instance).j = f7;
                return ettd.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((euaw) euavVar.build()).toByteString(), 4, (euag) eufh.g.a(eudsVar.c().d), eudsVar.a());
            }
        });
        f = new etrj(b2, ettd.class, new etrk() { // from class: eufg
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = eufh.a;
                ettd ettdVar = (ettd) ettiVar;
                if (!ettdVar.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ettdVar.a)));
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    euaw euawVar = (euaw) eyfy.parseFrom(euaw.a, eyeeVar, eyfc.a);
                    if (euawVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    euay euayVar = euawVar.d;
                    if (euayVar == null) {
                        euayVar = euay.a;
                    }
                    if (euayVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger d2 = eufh.d(euayVar.e);
                    int bitLength = d2.bitLength();
                    BigInteger d3 = eufh.d(euayVar.f);
                    BigInteger bigInteger = eudq.a;
                    eudn eudnVar = new eudn();
                    etre etreVar = eufh.h;
                    euau euauVar = euayVar.d;
                    if (euauVar == null) {
                        euauVar = euau.a;
                    }
                    etys b4 = etys.b(euauVar.b);
                    if (b4 == null) {
                        b4 = etys.UNRECOGNIZED;
                    }
                    eudnVar.b = (eudo) etreVar.b(b4);
                    etre etreVar2 = eufh.h;
                    euau euauVar2 = euayVar.d;
                    if (euauVar2 == null) {
                        euauVar2 = euau.a;
                    }
                    etys b5 = etys.b(euauVar2.c);
                    if (b5 == null) {
                        b5 = etys.UNRECOGNIZED;
                    }
                    eudnVar.c = (eudo) etreVar2.b(b5);
                    eudnVar.a = d3;
                    eudnVar.b(bitLength);
                    euau euauVar3 = euayVar.d;
                    if (euauVar3 == null) {
                        euauVar3 = euau.a;
                    }
                    eudnVar.c(euauVar3.d);
                    eudnVar.d = (eudp) eufh.g.b(((ettd) ettiVar).d);
                    eudu a2 = eudt.a(eudnVar.a(), d2, ((ettd) ettiVar).e);
                    eudr eudrVar = new eudr();
                    eudrVar.a = a2;
                    eudrVar.c(eufh.e(euawVar.f), eufh.e(euawVar.g));
                    eudrVar.b = eufh.e(euawVar.e);
                    eudrVar.b(eufh.e(euawVar.h), eufh.e(euawVar.i));
                    eudrVar.c = eufh.e(euawVar.j);
                    return eudrVar.a();
                } catch (eygu | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
                }
            }
        });
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        etrd.b(euag.RAW, eudp.d, hashMap, hashMap2);
        etrd.b(euag.TINK, eudp.a, hashMap, hashMap2);
        etrd.b(euag.CRUNCHY, eudp.b, hashMap, hashMap2);
        etrd.b(euag.LEGACY, eudp.c, hashMap, hashMap2);
        g = etrd.a(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        etrd.b(etys.SHA256, eudo.a, hashMap3, hashMap4);
        etrd.b(etys.SHA384, eudo.b, hashMap3, hashMap4);
        etrd.b(etys.SHA512, eudo.c, hashMap3, hashMap4);
        h = etrd.a(hashMap3, hashMap4);
    }

    public static euau a(eudq eudqVar) {
        euat euatVar = (euat) euau.a.createBuilder();
        etre etreVar = h;
        etys etysVar = (etys) etreVar.a(eudqVar.e);
        euatVar.copyOnWrite();
        ((euau) euatVar.instance).b = etysVar.a();
        etys etysVar2 = (etys) etreVar.a(eudqVar.f);
        euatVar.copyOnWrite();
        ((euau) euatVar.instance).c = etysVar2.a();
        euatVar.copyOnWrite();
        ((euau) euatVar.instance).d = eudqVar.g;
        return (euau) euatVar.build();
    }

    public static euay b(eudu euduVar) {
        euax euaxVar = (euax) euay.a.createBuilder();
        euau a2 = a(euduVar.a);
        euaxVar.copyOnWrite();
        euay euayVar = (euay) euaxVar.instance;
        a2.getClass();
        euayVar.d = a2;
        euayVar.b |= 1;
        eyee c2 = c(euduVar.b);
        euaxVar.copyOnWrite();
        ((euay) euaxVar.instance).e = c2;
        eyee c3 = c(euduVar.a.c);
        euaxVar.copyOnWrite();
        ((euay) euaxVar.instance).f = c3;
        euaxVar.copyOnWrite();
        ((euay) euaxVar.instance).c = 0;
        return (euay) euaxVar.build();
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
