package defpackage;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eudm {
    public static final etsv a = new etst(eudg.class, etgh.class, new etsu() { // from class: eudj
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            return euje.a((eudg) etfsVar);
        }
    });
    public static final etsv b = new etst(eudi.class, etgi.class, new etsu() { // from class: eudk
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            return eujg.b((eudi) etfsVar);
        }
    });
    public static final etft c;
    public static final etrx d;
    public static final int e;
    public static final etrp f;

    static {
        euao.a.getParserForType();
        f = new etrp("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", etgh.class);
        euaq.a.getParserForType();
        c = new etrq("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", etgi.class, 5);
        d = new etrx() { // from class: eudl
            @Override // defpackage.etrx
            public final etfs a(etgf etgfVar, Integer num) {
                eude eudeVar = (eude) etgfVar;
                etsv etsvVar = eudm.a;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) euil.f.a("RSA");
                keyPairGenerator.initialize(new RSAKeyGenParameterSpec(eudeVar.b, new BigInteger(1, eudeVar.c.toByteArray())));
                KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
                eudi a2 = eudh.a(eudeVar, rSAPublicKey.getModulus(), num);
                eudf eudfVar = new eudf();
                eudfVar.a = a2;
                eudfVar.c(new euju(rSAPrivateCrtKey.getPrimeP()), new euju(rSAPrivateCrtKey.getPrimeQ()));
                eudfVar.b = new euju(rSAPrivateCrtKey.getPrivateExponent());
                eudfVar.b(new euju(rSAPrivateCrtKey.getPrimeExponentP()), new euju(rSAPrivateCrtKey.getPrimeExponentQ()));
                eudfVar.c = new euju(rSAPrivateCrtKey.getCrtCoefficient());
                return eudfVar.a();
            }
        };
        e = 2;
    }
}
