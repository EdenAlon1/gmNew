package defpackage;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eudy {
    public static final etsv a = new etst(euds.class, etgh.class, new etsu() { // from class: eudv
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            return euji.a((euds) etfsVar);
        }
    });
    public static final etsv b = new etst(eudu.class, etgi.class, new etsu() { // from class: eudw
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            return eujk.b((eudu) etfsVar);
        }
    });
    public static final etft c;
    public static final etrx d;
    public static final int e;
    public static final etrp f;

    static {
        euaw.a.getParserForType();
        f = new etrp("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", etgh.class);
        euay.a.getParserForType();
        c = new etrq("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", etgi.class, 5);
        d = new etrx() { // from class: eudx
            @Override // defpackage.etrx
            public final etfs a(etgf etgfVar, Integer num) {
                eudq eudqVar = (eudq) etgfVar;
                etsv etsvVar = eudy.a;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) euil.f.a("RSA");
                keyPairGenerator.initialize(new RSAKeyGenParameterSpec(eudqVar.b, new BigInteger(1, eudqVar.c.toByteArray())));
                KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
                eudu a2 = eudt.a(eudqVar, rSAPublicKey.getModulus(), num);
                eudr eudrVar = new eudr();
                eudrVar.a = a2;
                eudrVar.c(new euju(rSAPrivateCrtKey.getPrimeP()), new euju(rSAPrivateCrtKey.getPrimeQ()));
                eudrVar.b = new euju(rSAPrivateCrtKey.getPrivateExponent());
                eudrVar.b(new euju(rSAPrivateCrtKey.getPrimeExponentP()), new euju(rSAPrivateCrtKey.getPrimeExponentQ()));
                eudrVar.c = new euju(rSAPrivateCrtKey.getCrtCoefficient());
                return eudrVar.a();
            }
        };
        e = 2;
    }
}
