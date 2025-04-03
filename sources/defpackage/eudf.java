package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eudf {
    public eudi a = null;
    public euju b = null;
    private euju d = null;
    private euju e = null;
    private euju f = null;
    private euju g = null;
    public euju c = null;

    public final eudg a() {
        euju eujuVar;
        euju eujuVar2;
        eudi eudiVar = this.a;
        if (eudiVar == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        euju eujuVar3 = this.d;
        if (eujuVar3 == null || (eujuVar = this.e) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        euju eujuVar4 = this.b;
        if (eujuVar4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        euju eujuVar5 = this.f;
        if (eujuVar5 == null || (eujuVar2 = this.g) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        euju eujuVar6 = this.c;
        if (eujuVar6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        eude eudeVar = eudiVar.a;
        BigInteger bigInteger = eudiVar.b;
        BigInteger bigInteger2 = eujuVar4.a;
        BigInteger bigInteger3 = eujuVar3.a;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        BigInteger bigInteger4 = eujuVar.a;
        if (!bigInteger4.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger5 = eudeVar.c;
        BigInteger subtract = bigInteger3.subtract(BigInteger.ONE);
        BigInteger subtract2 = bigInteger4.subtract(BigInteger.ONE);
        if (!bigInteger5.multiply(bigInteger2).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(BigInteger.ONE)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger5.multiply(eujuVar5.a).mod(subtract).equals(BigInteger.ONE)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger5.multiply(eujuVar2.a).mod(subtract2).equals(BigInteger.ONE)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger4.multiply(eujuVar6.a).mod(bigInteger3).equals(BigInteger.ONE)) {
            return new eudg(this.a, this.d, this.e, this.b, this.f, this.g, this.c);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public final void b(euju eujuVar, euju eujuVar2) {
        this.f = eujuVar;
        this.g = eujuVar2;
    }

    public final void c(euju eujuVar, euju eujuVar2) {
        this.d = eujuVar;
        this.e = eujuVar2;
    }
}
