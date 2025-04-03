package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etqa {
    public static final etsv a = new etst(etoc.class, etfq.class, new etsu() { // from class: etpx
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            return etps.b((etoc) etfsVar);
        }
    });
    public static final etsv b = new etst(etok.class, etfr.class, new etsu() { // from class: etpy
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            return etpt.b((etok) etfsVar);
        }
    });
    public static final etft c;
    public static final etrx d;
    public static final etrp e;

    static {
        etzh.a.getParserForType();
        e = new etrp("type.googleapis.com/google.crypto.tink.HpkePrivateKey", etfq.class);
        etzj.a.getParserForType();
        c = new etrq("type.googleapis.com/google.crypto.tink.HpkePublicKey", etfr.class, 5);
        d = new etrx() { // from class: etpz
            @Override // defpackage.etrx
            public final etfs a(etgf etgfVar, Integer num) {
                euic euicVar;
                eujt b2;
                eujv c2;
                etob etobVar = (etob) etgfVar;
                etnz etnzVar = etobVar.a;
                etsv etsvVar = etqa.a;
                if (etnzVar.equals(etnz.f)) {
                    byte[] b3 = eujr.b();
                    c2 = eujv.c(b3);
                    b2 = eujt.b(eujr.c(b3));
                } else {
                    if (!etobVar.a.equals(etnz.a) && !etobVar.a.equals(etnz.b) && !etobVar.a.equals(etnz.c)) {
                        throw new GeneralSecurityException("Unknown KEM ID");
                    }
                    etnz etnzVar2 = etobVar.a;
                    byte[] bArr = etqb.a;
                    if (etnzVar2 == etnz.a) {
                        euicVar = euic.NIST_P256;
                    } else if (etnzVar2 == etnz.b) {
                        euicVar = euic.NIST_P384;
                    } else {
                        if (etnzVar2 != etnz.c) {
                            throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                        }
                        euicVar = euic.NIST_P521;
                    }
                    KeyPair b4 = euif.b(euicVar);
                    b2 = eujt.b(euif.l(euicVar, euie.UNCOMPRESSED, ((ECPublicKey) b4.getPublic()).getW()));
                    c2 = eujv.c(etqq.b(((ECPrivateKey) b4.getPrivate()).getS(), etqb.a(etobVar.a)));
                }
                return etoc.d(etok.b(etobVar, b2, num), c2);
            }
        };
    }
}
