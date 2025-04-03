package defpackage;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHPublicKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class faoq {
    public static final BigInteger a;
    public static final BigInteger b;
    private static final Boolean c;
    private static final BigInteger d;
    private static final BigInteger e;
    private static final ECParameterSpec f;
    private static final BigInteger g;
    private static final BigInteger h;
    private static final BigInteger i;

    static {
        boolean z;
        try {
            h();
            z = false;
        } catch (Exception unused) {
            z = true;
        }
        c = Boolean.valueOf(z);
        d = new BigInteger("1");
        BigInteger bigInteger = new BigInteger("2");
        e = bigInteger;
        ECParameterSpec params = f() ? null : ((ECPublicKey) b().getPublic()).getParams();
        f = params;
        g = f() ? null : ((ECFieldFp) params.getCurve().getField()).getP();
        h = f() ? null : params.getCurve().getA();
        i = f() ? null : params.getCurve().getB();
        a = new BigInteger("FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AACAA68FFFFFFFFFFFFFFFF", 16);
        b = bigInteger;
    }

    public static faow a(PublicKey publicKey) {
        publicKey.getClass();
        if (publicKey instanceof ECPublicKey) {
            faov faovVar = (faov) faow.a.createBuilder();
            faovVar.copyOnWrite();
            faow faowVar = (faow) faovVar.instance;
            faowVar.c = 1;
            faowVar.b |= 1;
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            faot faotVar = (faot) faou.a.createBuilder();
            eyee x = eyee.x(eCPublicKey.getW().getAffineX().toByteArray());
            faotVar.copyOnWrite();
            faou faouVar = (faou) faotVar.instance;
            faouVar.b = 1 | faouVar.b;
            faouVar.c = x;
            eyee x2 = eyee.x(eCPublicKey.getW().getAffineY().toByteArray());
            faotVar.copyOnWrite();
            faou faouVar2 = (faou) faotVar.instance;
            faouVar2.b |= 2;
            faouVar2.d = x2;
            faou faouVar3 = (faou) faotVar.build();
            faovVar.copyOnWrite();
            faow faowVar2 = (faow) faovVar.instance;
            faouVar3.getClass();
            faowVar2.d = faouVar3;
            faowVar2.b |= 2;
            return (faow) faovVar.build();
        }
        if (!(publicKey instanceof RSAPublicKey)) {
            if (!(publicKey instanceof DHPublicKey)) {
                throw new IllegalArgumentException("Unsupported PublicKey type");
            }
            faov faovVar2 = (faov) faow.a.createBuilder();
            faovVar2.copyOnWrite();
            faow faowVar3 = (faow) faovVar2.instance;
            faowVar3.c = 3;
            faowVar3.b |= 1;
            faor faorVar = (faor) faos.a.createBuilder();
            eyee x3 = eyee.x(((DHPublicKey) publicKey).getY().toByteArray());
            faorVar.copyOnWrite();
            faos faosVar = (faos) faorVar.instance;
            faosVar.b = 1 | faosVar.b;
            faosVar.c = x3;
            faos faosVar2 = (faos) faorVar.build();
            faovVar2.copyOnWrite();
            faow faowVar4 = (faow) faovVar2.instance;
            faosVar2.getClass();
            faowVar4.f = faosVar2;
            faowVar4.b |= 8;
            return (faow) faovVar2.build();
        }
        faov faovVar3 = (faov) faow.a.createBuilder();
        faovVar3.copyOnWrite();
        faow faowVar5 = (faow) faovVar3.instance;
        faowVar5.c = 2;
        faowVar5.b |= 1;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
        faoz faozVar = (faoz) fapa.a.createBuilder();
        eyee x4 = eyee.x(rSAPublicKey.getModulus().toByteArray());
        faozVar.copyOnWrite();
        fapa fapaVar = (fapa) faozVar.instance;
        fapaVar.b = 1 | fapaVar.b;
        fapaVar.c = x4;
        int intValue = rSAPublicKey.getPublicExponent().intValue();
        faozVar.copyOnWrite();
        fapa fapaVar2 = (fapa) faozVar.instance;
        fapaVar2.b = 2 | fapaVar2.b;
        fapaVar2.d = intValue;
        fapa fapaVar3 = (fapa) faozVar.build();
        faovVar3.copyOnWrite();
        faow faowVar6 = (faow) faovVar3.instance;
        fapaVar3.getClass();
        faowVar6.e = fapaVar3;
        faowVar6.b |= 4;
        return (faow) faovVar3.build();
    }

    public static KeyPair b() {
        return h().generateKeyPair();
    }

    public static ECPublicKey c(faou faouVar) {
        int i2 = faouVar.b;
        if ((i2 & 1) == 0 || (i2 & 2) == 0) {
            throw new InvalidKeySpecException("Key is missing a required coordinate");
        }
        if (f()) {
            throw new InvalidKeySpecException("Elliptic Curve keys not supported on this platform");
        }
        byte[] I = faouVar.c.I();
        byte[] I2 = faouVar.d.I();
        try {
            i(I);
            i(I2);
            BigInteger bigInteger = new BigInteger(I);
            BigInteger bigInteger2 = new BigInteger(I2);
            if (bigInteger.signum() == -1 || bigInteger2.signum() == -1) {
                throw new InvalidKeySpecException("Point encoding must use only non-negative integers");
            }
            BigInteger bigInteger3 = g;
            if (bigInteger.compareTo(bigInteger3) >= 0 || bigInteger2.compareTo(bigInteger3) >= 0) {
                throw new InvalidKeySpecException("Point lies outside of the expected field");
            }
            if (g(bigInteger2, bigInteger3).equals(g(bigInteger, bigInteger3).add(h).multiply(bigInteger).mod(bigInteger3).add(i).mod(bigInteger3))) {
                return (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, bigInteger2), f));
            }
            throw new InvalidKeySpecException("Point does not lie on the expected curve");
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static RSAPublicKey d(fapa fapaVar) {
        if ((fapaVar.b & 1) == 0) {
            throw new InvalidKeySpecException("required field is missing");
        }
        byte[] I = fapaVar.c.I();
        int length = I.length;
        if (length == 0 || length > 257) {
            throw new InvalidKeySpecException();
        }
        BigInteger bigInteger = new BigInteger(I);
        if (bigInteger.bitLength() != 2048) {
            throw new InvalidKeySpecException();
        }
        try {
            return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(bigInteger, BigInteger.valueOf(fapaVar.d)));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static DHPublicKey e(faos faosVar) {
        if ((faosVar.b & 1) == 0) {
            throw new InvalidKeySpecException("required field is missing");
        }
        byte[] I = faosVar.c.I();
        int length = I.length;
        if (length == 0 || length > 257) {
            throw new InvalidKeySpecException();
        }
        try {
            BigInteger bigInteger = new BigInteger(I);
            BigInteger bigInteger2 = d;
            if (bigInteger.compareTo(bigInteger2) > 0) {
                BigInteger bigInteger3 = a;
                if (bigInteger.compareTo(bigInteger3.subtract(bigInteger2)) < 0) {
                    try {
                        return (DHPublicKey) KeyFactory.getInstance("DH").generatePublic(new DHPublicKeySpec(bigInteger, bigInteger3, b));
                    } catch (NoSuchAlgorithmException e2) {
                        throw new AssertionError(e2);
                    }
                }
            }
            throw new InvalidKeySpecException();
        } catch (NumberFormatException e3) {
            throw new InvalidKeySpecException(e3);
        }
    }

    public static boolean f() {
        return c.booleanValue();
    }

    private static BigInteger g(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.multiply(bigInteger).mod(bigInteger2);
    }

    private static KeyPairGenerator h() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            try {
                try {
                    keyPairGenerator.initialize(new ECGenParameterSpec("prime256v1"));
                    return keyPairGenerator;
                } catch (InvalidAlgorithmParameterException unused) {
                    keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
                    return keyPairGenerator;
                }
            } catch (InvalidAlgorithmParameterException e2) {
                throw new RuntimeException("Unable to find the NIST P-256 curve", e2);
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static void i(byte[] bArr) {
        int length = bArr.length;
        if (length == 0 || length > 33 || (length == 33 && bArr[0] != 0)) {
            throw new InvalidKeySpecException();
        }
    }
}
