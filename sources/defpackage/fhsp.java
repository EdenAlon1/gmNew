package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.security.Provider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhsp extends Provider {
    public static final Map b;
    public static final Class c;
    public static final String[] d;
    public static final String[] e;
    public static final fhpt[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public static final String[] j;
    public static final String[] k;
    public final Map l;
    public static final Logger a = Logger.getLogger(fhsp.class.getName());
    private static final String m = "BouncyCastle Security Provider v1.78.1";

    static {
        int i2 = fhsq.a;
        new ThreadLocal();
        new ThreadLocal();
        new HashSet();
        new HashMap();
        b = new HashMap();
        c = fhsf.a(fhsp.class, "java.security.cert.PKIXRevocationChecker");
        d = new String[]{"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
        e = new String[]{"SipHash", "SipHash128", "Poly1305"};
        f = new fhpt[]{new fhso("AES"), new fhso("ARC4"), new fhso("ARIA"), new fhso("Blowfish"), new fhso("Camellia"), new fhso("CAST5"), new fhso("CAST6"), new fhso("ChaCha"), new fhso("DES"), new fhso("DESede"), new fhso("GOST28147"), new fhso("Grainv1"), new fhso("Grain128"), new fhso("HC128"), new fhso("HC256"), new fhso("IDEA"), new fhso("Noekeon"), new fhso("RC2"), new fhso("RC5"), new fhso("RC6"), new fhso("Rijndael"), new fhso("Salsa20"), new fhso("SEED"), new fhso("Serpent"), new fhso("Shacal2"), new fhso("Skipjack"), new fhso("SM4"), new fhso("TEA"), new fhso("Twofish"), new fhso("Threefish"), new fhso("VMPC"), new fhso("VMPCKSA3"), new fhso("XTEA"), new fhso("XSalsa20"), new fhso("OpenSSLPBKDF"), new fhso("DSTU7624"), new fhso("GOST3412_2015"), new fhso("Zuc")};
        g = new String[]{"X509", "IES", "COMPOSITE", "EXTERNAL", "CompositeSignatures"};
        h = new String[]{"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC", "LMS", "SPHINCSPlus", "Dilithium", "Falcon", "NTRU"};
        i = new String[]{"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka", "Blake3"};
        j = new String[]{"BC", "BCFKS", "PKCS12"};
        k = new String[]{"DRBG"};
    }

    public fhsp() {
        super("BC", 1.7801d, m);
        this.l = new ConcurrentHashMap();
        AccessController.doPrivileged(new fhsm(this));
    }

    public static final void d(ASN1ObjectIdentifier aSN1ObjectIdentifier, fhsh fhshVar) {
        Map map = b;
        synchronized (map) {
            map.put(aSN1ObjectIdentifier, fhshVar);
        }
    }

    public static final void e(String str, String str2) {
        Class a2 = fhsf.a(fhsp.class, str + str2 + "$Mappings");
        if (a2 != null) {
            try {
                ((fhsg) a2.newInstance()).a();
            } catch (Exception e2) {
                throw new InternalError("cannot create instance of " + str + str2 + "$Mappings : " + e2.toString());
            }
        }
    }

    public static final void f(String str, String[] strArr) {
        for (int i2 = 0; i2 != strArr.length; i2++) {
            e(str, strArr[i2]);
        }
    }

    @Override // java.security.Provider
    public final Provider.Service getService(String str, String str2) {
        Provider.Service service;
        String w = a.w(fidb.c(str2), str, ".");
        Provider.Service service2 = (Provider.Service) this.l.get(w);
        if (service2 != null) {
            return service2;
        }
        synchronized (this) {
            service = !this.l.containsKey(w) ? (Provider.Service) AccessController.doPrivileged(new fhsn(this, str, str2, w)) : (Provider.Service) this.l.get(w);
        }
        return service;
    }
}
