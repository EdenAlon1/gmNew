package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euif {
    public static int a(EllipticCurve ellipticCurve) {
        return (etrc.d(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static KeyPair b(euic euicVar) {
        return c(h(euicVar));
    }

    public static KeyPair c(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) euil.f.a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static ECPrivateKey d(euic euicVar, byte[] bArr) {
        return (ECPrivateKey) ((KeyFactory) euil.g.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), h(euicVar)));
    }

    public static ECPublicKey e(byte[] bArr) {
        return (ECPublicKey) ((KeyFactory) euil.g.a("EC")).generatePublic(new X509EncodedKeySpec(bArr));
    }

    public static ECPublicKey f(euic euicVar, euie euieVar, byte[] bArr) {
        return g(h(euicVar), euieVar, bArr);
    }

    public static ECPublicKey g(ECParameterSpec eCParameterSpec, euie euieVar, byte[] bArr) {
        return (ECPublicKey) ((KeyFactory) euil.g.a("EC")).generatePublic(new ECPublicKeySpec(i(eCParameterSpec.getCurve(), euieVar, bArr), eCParameterSpec));
    }

    public static ECParameterSpec h(euic euicVar) {
        int ordinal = euicVar.ordinal();
        if (ordinal == 0) {
            return etrc.a;
        }
        if (ordinal == 1) {
            return etrc.b;
        }
        if (ordinal == 2) {
            return etrc.c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(String.valueOf(String.valueOf(euicVar))));
    }

    public static ECPoint i(EllipticCurve ellipticCurve, euie euieVar, byte[] bArr) {
        int a = a(ellipticCurve);
        int ordinal = euieVar.ordinal();
        boolean z = false;
        if (ordinal == 0) {
            int length = bArr.length;
            if (length != a + a + 1) {
                throw new GeneralSecurityException("invalid point size");
            }
            if (bArr[0] != 4) {
                throw new GeneralSecurityException("invalid point format");
            }
            int i = a + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i)), new BigInteger(1, Arrays.copyOfRange(bArr, i, length)));
            etrc.f(eCPoint, ellipticCurve);
            return eCPoint;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                throw new GeneralSecurityException("invalid format:".concat(String.valueOf(String.valueOf(euieVar))));
            }
            int i2 = a + a;
            int length2 = bArr.length;
            if (length2 != i2) {
                throw new GeneralSecurityException("invalid point size");
            }
            ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOf(bArr, a)), new BigInteger(1, Arrays.copyOfRange(bArr, a, length2)));
            etrc.f(eCPoint2, ellipticCurve);
            return eCPoint2;
        }
        int i3 = a + 1;
        BigInteger d = etrc.d(ellipticCurve);
        int length3 = bArr.length;
        if (length3 != i3) {
            throw new GeneralSecurityException("compressed point has wrong length");
        }
        byte b = bArr[0];
        if (b != 2) {
            if (b != 3) {
                throw new GeneralSecurityException("invalid format");
            }
            z = true;
        }
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, length3));
        if (bigInteger.signum() == -1 || bigInteger.compareTo(d) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        return new ECPoint(bigInteger, o(bigInteger, z, ellipticCurve));
    }

    static void j(ECPublicKey eCPublicKey) {
        etrc.f(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    public static byte[] k(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        try {
            if (!etrc.g(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w = eCPublicKey.getW();
            etrc.f(w, eCPrivateKey.getParams().getCurve());
            PublicKey generatePublic = ((KeyFactory) euil.g.a("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
            KeyAgreement keyAgreement = (KeyAgreement) euil.e.a("ECDH");
            keyAgreement.init(eCPrivateKey);
            try {
                keyAgreement.doPhase(generatePublic, true);
                byte[] generateSecret = keyAgreement.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger = new BigInteger(1, generateSecret);
                if (bigInteger.signum() == -1 || bigInteger.compareTo(etrc.d(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                o(bigInteger, true, curve);
                return generateSecret;
            } catch (IllegalStateException e) {
                throw new GeneralSecurityException(e);
            }
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    public static byte[] l(euic euicVar, euie euieVar, ECPoint eCPoint) {
        return m(h(euicVar).getCurve(), euieVar, eCPoint);
    }

    public static byte[] m(EllipticCurve ellipticCurve, euie euieVar, ECPoint eCPoint) {
        etrc.f(eCPoint, ellipticCurve);
        int a = a(ellipticCurve);
        int ordinal = euieVar.ordinal();
        if (ordinal == 0) {
            int i = a + 1;
            int i2 = a + a + 1;
            byte[] bArr = new byte[i2];
            byte[] a2 = etqq.a(eCPoint.getAffineX());
            byte[] a3 = etqq.a(eCPoint.getAffineY());
            int length = a3.length;
            System.arraycopy(a3, 0, bArr, i2 - length, length);
            int length2 = a2.length;
            System.arraycopy(a2, 0, bArr, i - length2, length2);
            bArr[0] = 4;
            return bArr;
        }
        if (ordinal == 1) {
            int i3 = a + 1;
            byte[] bArr2 = new byte[i3];
            byte[] a4 = etqq.a(eCPoint.getAffineX());
            int length3 = a4.length;
            System.arraycopy(a4, 0, bArr2, i3 - length3, length3);
            bArr2[0] = true == eCPoint.getAffineY().testBit(0) ? (byte) 3 : (byte) 2;
            return bArr2;
        }
        if (ordinal != 2) {
            throw new GeneralSecurityException("invalid format:".concat(String.valueOf(String.valueOf(euieVar))));
        }
        int i4 = a + a;
        byte[] bArr3 = new byte[i4];
        byte[] a5 = etqq.a(eCPoint.getAffineX());
        int length4 = a5.length;
        if (length4 > a) {
            a5 = Arrays.copyOfRange(a5, length4 - a, length4);
        }
        byte[] a6 = etqq.a(eCPoint.getAffineY());
        int length5 = a6.length;
        if (length5 > a) {
            a6 = Arrays.copyOfRange(a6, length5 - a, length5);
        }
        int length6 = a6.length;
        System.arraycopy(a6, 0, bArr3, i4 - length6, length6);
        int length7 = a5.length;
        System.arraycopy(a5, 0, bArr3, a - length7, length7);
        return bArr3;
    }

    public static byte[] n(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length || bArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == length) {
            i = length - 1;
        }
        int i2 = (bArr[i] & 128) == 128 ? 1 : 0;
        int i3 = length - i;
        byte[] bArr2 = new byte[i3 + i2];
        System.arraycopy(bArr, i, bArr2, i2, i3);
        return bArr2;
    }

    private static BigInteger o(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger d = etrc.d(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(d);
        if (d.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger mod2 = mod.mod(d);
        if (mod2.equals(BigInteger.ZERO)) {
            bigInteger3 = BigInteger.ZERO;
        } else {
            if (d.testBit(0) && d.testBit(1)) {
                bigInteger2 = mod2.modPow(d.add(BigInteger.ONE).shiftRight(2), d);
            } else {
                bigInteger2 = null;
                if (d.testBit(0) && !d.testBit(1)) {
                    BigInteger bigInteger4 = BigInteger.ONE;
                    BigInteger shiftRight = d.subtract(BigInteger.ONE).shiftRight(1);
                    int i = 0;
                    while (true) {
                        BigInteger mod3 = bigInteger4.multiply(bigInteger4).subtract(mod2).mod(d);
                        if (mod3.equals(BigInteger.ZERO)) {
                            bigInteger3 = bigInteger4;
                            break;
                        }
                        BigInteger modPow = mod3.modPow(shiftRight, d);
                        if (modPow.add(BigInteger.ONE).equals(d)) {
                            BigInteger shiftRight2 = d.add(BigInteger.ONE).shiftRight(1);
                            BigInteger bigInteger5 = BigInteger.ONE;
                            BigInteger bigInteger6 = bigInteger4;
                            for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                BigInteger multiply = bigInteger6.multiply(bigInteger5);
                                BigInteger mod4 = bigInteger6.multiply(bigInteger6).add(bigInteger5.multiply(bigInteger5).mod(d).multiply(mod3)).mod(d);
                                BigInteger mod5 = multiply.add(multiply).mod(d);
                                if (shiftRight2.testBit(bitLength)) {
                                    BigInteger mod6 = mod4.multiply(bigInteger4).add(mod5.multiply(mod3)).mod(d);
                                    bigInteger5 = bigInteger4.multiply(mod5).add(mod4).mod(d);
                                    bigInteger6 = mod6;
                                } else {
                                    bigInteger6 = mod4;
                                    bigInteger5 = mod5;
                                }
                            }
                            bigInteger2 = bigInteger6;
                        } else {
                            if (!modPow.equals(BigInteger.ONE)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                            bigInteger4 = bigInteger4.add(BigInteger.ONE);
                            i++;
                            if (i == 128 && !d.isProbablePrime(80)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    }
                }
            }
            if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(d).compareTo(mod2) != 0) {
                throw new GeneralSecurityException("Could not find a modular square root");
            }
            bigInteger3 = bigInteger2;
        }
        return z != bigInteger3.testBit(0) ? d.subtract(bigInteger3).mod(d) : bigInteger3;
    }
}
