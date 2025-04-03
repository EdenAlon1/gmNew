package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etvm {
    public static final etre a;
    public static final etre b;
    public static final etso c;
    public static final etsl d;
    public static final etro e;
    public static final etrl f;
    private static final eujt g;

    static {
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.HmacKey");
        g = b2;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        etrd.b(euag.RAW, etul.d, hashMap, hashMap2);
        etrd.b(euag.TINK, etul.a, hashMap, hashMap2);
        etrd.b(euag.LEGACY, etul.c, hashMap, hashMap2);
        etrd.b(euag.CRUNCHY, etul.b, hashMap, hashMap2);
        a = etrd.a(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        etrd.b(etys.SHA1, etuk.a, hashMap3, hashMap4);
        etrd.b(etys.SHA224, etuk.b, hashMap3, hashMap4);
        etrd.b(etys.SHA256, etuk.c, hashMap3, hashMap4);
        etrd.b(etys.SHA384, etuk.d, hashMap3, hashMap4);
        etrd.b(etys.SHA512, etuk.e, hashMap3, hashMap4);
        b = etrd.a(hashMap3, hashMap4);
        c = new etsm(etum.class, ette.class, new etsn() { // from class: etvi
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                etum etumVar = (etum) etgfVar;
                etre etreVar = etvm.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.HmacKey";
                etyv etyvVar = (etyv) etyw.a.createBuilder();
                etyy a2 = etvm.a(etumVar);
                etyvVar.copyOnWrite();
                etyw etywVar = (etyw) etyvVar.instance;
                a2.getClass();
                etywVar.c = a2;
                etywVar.b |= 1;
                int i = etumVar.a;
                etyvVar.copyOnWrite();
                ((etyw) etyvVar.instance).d = i;
                eyee byteString = ((etyw) etyvVar.build()).toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag euagVar = (euag) etvm.a.a(etumVar.c);
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = euagVar.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        d = new etsj(b2, ette.class, new etsk() { // from class: etvj
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etre etreVar = etvm.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etyw etywVar = (etyw) eyfy.parseFrom(etyw.a, eyeeVar, eyfc.a);
                    if (etywVar.e != 0) {
                        throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + etywVar.e);
                    }
                    etuj etujVar = new etuj();
                    etujVar.b(etywVar.d);
                    etyy etyyVar = etywVar.c;
                    if (etyyVar == null) {
                        etyyVar = etyy.a;
                    }
                    etujVar.c(etyyVar.c);
                    etre etreVar2 = etvm.b;
                    etyy etyyVar2 = etywVar.c;
                    if (etyyVar2 == null) {
                        etyyVar2 = etyy.a;
                    }
                    etys b3 = etys.b(etyyVar2.b);
                    if (b3 == null) {
                        b3 = etys.UNRECOGNIZED;
                    }
                    etujVar.a = (etuk) etreVar2.b(b3);
                    etre etreVar3 = etvm.a;
                    euag b4 = euag.b(etteVar.b.d);
                    if (b4 == null) {
                        b4 = euag.UNRECOGNIZED;
                    }
                    etujVar.b = (etul) etreVar3.b(b4);
                    return etujVar.a();
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e2);
                }
            }
        });
        e = new etrm(etud.class, ettd.class, new etrn() { // from class: etvk
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                etud etudVar = (etud) etfsVar;
                etre etreVar = etvm.a;
                etyt etytVar = (etyt) etyu.a.createBuilder();
                etyy a2 = etvm.a(etudVar.a);
                etytVar.copyOnWrite();
                etyu etyuVar = (etyu) etytVar.instance;
                a2.getClass();
                etyuVar.d = a2;
                etyuVar.b |= 1;
                eyee x = eyee.x(etudVar.b.d());
                etytVar.copyOnWrite();
                ((etyu) etytVar.instance).e = x;
                return ettd.a("type.googleapis.com/google.crypto.tink.HmacKey", ((etyu) etytVar.build()).toByteString(), 3, (euag) etvm.a.a(etudVar.a.c), etudVar.d);
            }
        });
        f = new etrj(b2, ettd.class, new etrk() { // from class: etvl
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etre etreVar = etvm.a;
                if (!((ettd) ettiVar).a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etyu etyuVar = (etyu) eyfy.parseFrom(etyu.a, eyeeVar, eyfc.a);
                    if (etyuVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    etuj etujVar = new etuj();
                    etujVar.b(etyuVar.e.d());
                    etyy etyyVar = etyuVar.d;
                    if (etyyVar == null) {
                        etyyVar = etyy.a;
                    }
                    etujVar.c(etyyVar.c);
                    etre etreVar2 = etvm.b;
                    etyy etyyVar2 = etyuVar.d;
                    if (etyyVar2 == null) {
                        etyyVar2 = etyy.a;
                    }
                    etys b3 = etys.b(etyyVar2.b);
                    if (b3 == null) {
                        b3 = etys.UNRECOGNIZED;
                    }
                    etujVar.a = (etuk) etreVar2.b(b3);
                    etujVar.b = (etul) etvm.a.b(((ettd) ettiVar).d);
                    return etuc.a(etujVar.a(), eujv.c(etyuVar.e.I()), ((ettd) ettiVar).e);
                } catch (eygu | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
            }
        });
    }

    public static etyy a(etum etumVar) {
        etyx etyxVar = (etyx) etyy.a.createBuilder();
        etyxVar.copyOnWrite();
        ((etyy) etyxVar.instance).c = etumVar.b;
        etys etysVar = (etys) b.a(etumVar.d);
        etyxVar.copyOnWrite();
        ((etyy) etyxVar.instance).b = etysVar.a();
        return (etyy) etyxVar.build();
    }
}
