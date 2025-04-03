package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eueq {
    public static final etso a;
    public static final etsl b;
    public static final etro c;
    public static final etrl d;
    public static final etro e;
    public static final etrl f;
    public static final etre g;
    private static final eujt h;
    private static final eujt i;

    static {
        eujt b2 = ettp.b("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        h = b2;
        eujt b3 = ettp.b("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        i = b3;
        a = new etsm(euby.class, ette.class, new etsn() { // from class: euek
            @Override // defpackage.etsn
            public final etti a(etgf etgfVar) {
                etso etsoVar = eueq.a;
                etzo etzoVar = (etzo) etzp.a.createBuilder();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).b = "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
                eyee byteString = etyk.a.toByteString();
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).c = byteString;
                euag euagVar = (euag) eueq.g.a(((euby) etgfVar).a);
                etzoVar.copyOnWrite();
                ((etzp) etzoVar.instance).d = euagVar.a();
                return ette.b((etzp) etzoVar.build());
            }
        });
        b = new etsj(b2, ette.class, new etsk() { // from class: euel
            @Override // defpackage.etsk
            public final etgf a(etti ettiVar) {
                etso etsoVar = eueq.a;
                ette etteVar = (ette) ettiVar;
                if (!etteVar.b.b.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(etteVar.b.b)));
                }
                try {
                    eyee eyeeVar = ((ette) ettiVar).b.c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    if (((etyk) eyfy.parseFrom(etyk.a, eyeeVar, eyfc.a)).b != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    etre etreVar = eueq.g;
                    euag b4 = euag.b(etteVar.b.d);
                    if (b4 == null) {
                        b4 = euag.UNRECOGNIZED;
                    }
                    return new euby((eubx) etreVar.b(b4));
                } catch (eygu e2) {
                    throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e2);
                }
            }
        });
        c = new etrm(eucf.class, ettd.class, new etrn() { // from class: euem
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                eucf eucfVar = (eucf) etfsVar;
                return ettd.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", eueq.a(eucfVar).toByteString(), 5, (euag) eueq.g.a(eucfVar.a.a), eucfVar.d);
            }
        });
        d = new etrj(b3, ettd.class, new etrk() { // from class: euen
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = eueq.a;
                ettd ettdVar = (ettd) ettiVar;
                if (!ettdVar.a.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(ettdVar.a)));
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etyo etyoVar = (etyo) eyfy.parseFrom(etyo.a, eyeeVar, eyfc.a);
                    if (etyoVar.b == 0) {
                        return eucf.c((eubx) eueq.g.b(((ettd) ettiVar).d), eujt.b(etyoVar.c.I()), ((ettd) ettiVar).e);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (eygu unused) {
                    throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
                }
            }
        });
        e = new etrm(eubz.class, ettd.class, new etrn() { // from class: eueo
            @Override // defpackage.etrn
            public final etti a(etfs etfsVar) {
                eubz eubzVar = (eubz) etfsVar;
                etso etsoVar = eueq.a;
                etyl etylVar = (etyl) etym.a.createBuilder();
                etyo a2 = eueq.a(eubzVar.a);
                etylVar.copyOnWrite();
                etym etymVar = (etym) etylVar.instance;
                a2.getClass();
                etymVar.e = a2;
                etymVar.b |= 1;
                eyee x = eyee.x(eubzVar.b.d());
                etylVar.copyOnWrite();
                ((etym) etylVar.instance).d = x;
                return ettd.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((etym) etylVar.build()).toByteString(), 4, (euag) eueq.g.a(eubzVar.c().a), eubzVar.a());
            }
        });
        f = new etrj(b2, ettd.class, new etrk() { // from class: euep
            @Override // defpackage.etrk
            public final etfs a(etti ettiVar) {
                etso etsoVar = eueq.a;
                ettd ettdVar = (ettd) ettiVar;
                if (!ettdVar.a.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ettdVar.a)));
                }
                try {
                    eyee eyeeVar = ((ettd) ettiVar).c;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etym etymVar = (etym) eyfy.parseFrom(etym.a, eyeeVar, eyfc.a);
                    if (etymVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    etyo etyoVar = etymVar.e;
                    if (etyoVar == null) {
                        etyoVar = etyo.a;
                    }
                    if (etyoVar.b == 0) {
                        return eubz.e(eucf.c((eubx) eueq.g.b(((ettd) ettiVar).d), eujt.b(etyoVar.c.I()), ((ettd) ettiVar).e), eujv.c(etymVar.d.I()));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (eygu unused) {
                    throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
                }
            }
        });
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        etrd.b(euag.RAW, eubx.d, hashMap, hashMap2);
        etrd.b(euag.TINK, eubx.a, hashMap, hashMap2);
        etrd.b(euag.CRUNCHY, eubx.b, hashMap, hashMap2);
        etrd.b(euag.LEGACY, eubx.c, hashMap, hashMap2);
        g = etrd.a(hashMap, hashMap2);
    }

    public static etyo a(eucf eucfVar) {
        etyn etynVar = (etyn) etyo.a.createBuilder();
        eyee x = eyee.x(eucfVar.b.c());
        etynVar.copyOnWrite();
        ((etyo) etynVar.instance).c = x;
        return (etyo) etynVar.build();
    }
}
