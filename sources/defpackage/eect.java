package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Hashtable;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.asn1.x509.V3TBSCertificateGenerator;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.asn1.x509.X509ExtensionsGenerator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eect {
    public static final char[] a = {'J', 'I', 'B', 'E'};
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(Certificate certificate, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(certificate.getEncoded());
            byte[] digest = messageDigest.digest();
            int length = digest.length;
            StringBuffer stringBuffer = new StringBuffer(length + length);
            for (int i = 0; i < digest.length; i++) {
                if (i > 0) {
                    stringBuffer.append(':');
                }
                char[] cArr = b;
                stringBuffer.append(cArr[(digest[i] & 240) >> 4]);
                stringBuffer.append(cArr[digest[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            dkty.i(e, "Error while creating fingerprint: %s", e.getMessage());
            return null;
        }
    }

    public static X509Certificate b(KeyStore keyStore) {
        return (X509Certificate) keyStore.getCertificate("private");
    }

    public static boolean c(String str) {
        return "SHA-1".equalsIgnoreCase(str) || "SHA-256".equalsIgnoreCase(str);
    }

    public static void d(Context context, String str) {
        dkty.c("Generating keypair of length %d", 2048);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048, new SecureRandom());
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        dkty.c("Generating certificate for issuer %s", "C=US, ST=California, L=California, O=Jibe, OU=Jibe, CN=Jibe");
        Certificate f = f(generateKeyPair, str);
        dkty.c("Generating key store", new Object[0]);
        Certificate[] certificateArr = {f};
        PrivateKey privateKey = generateKeyPair.getPrivate();
        KeyStore keyStore = KeyStore.getInstance("BKS");
        keyStore.load(null, null);
        char[] cArr = a;
        keyStore.setKeyEntry("private", privateKey, cArr, certificateArr);
        dkty.c("Saving key store to file %s", "msrp.bks");
        if (TextUtils.isEmpty("msrp.bks")) {
            throw new IllegalArgumentException("Filename must not be empty");
        }
        try {
            FileOutputStream openFileOutput = context.getApplicationContext().openFileOutput("msrp.bks", 0);
            if (openFileOutput == null) {
                throw new IOException(a.t("msrp.bks", "Unable to open file for writing: "));
            }
            keyStore.store(openFileOutput, cArr);
            dkug.a(openFileOutput);
        } catch (Throwable th) {
            dkug.a(null);
            throw th;
        }
    }

    public static KeyStore e(Context context) {
        if (TextUtils.isEmpty("msrp.bks")) {
            throw new IllegalArgumentException("Filename must not be empty");
        }
        dkty.c("Loading key store %s", "msrp.bks");
        FileInputStream openFileInput = context.getApplicationContext().openFileInput("msrp.bks");
        if (openFileInput == null) {
            throw new FileNotFoundException("Keystore file not found: msrp.bks");
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("BKS");
            keyStore.load(openFileInput, a);
            return keyStore;
        } finally {
            dkug.a(openFileInput);
        }
    }

    private static Certificate f(KeyPair keyPair, String str) {
        AlgorithmIdentifier algorithmIdentifier;
        Extension b2;
        Date date = new Date(dkvj.a().longValue() - 86400000);
        Date date2 = new Date(dkvj.a().longValue() + 31536000000L);
        X500Principal x500Principal = new X500Principal("C=US, ST=California, L=California, O=Jibe, OU=Jibe, CN=Jibe");
        X500Principal x500Principal2 = new X500Principal("C=US, ST=California, L=California, O=Jibe, OU=Jibe, CN=Jibe");
        try {
            fidq fidqVar = new fidq();
            try {
                fidqVar.b.d = X500Name.b(new fhsl(x500Principal.getEncoded()));
                BigInteger bigInteger = BigInteger.ONE;
                if (bigInteger.compareTo(BigInteger.ZERO) <= 0) {
                    throw new IllegalArgumentException("serial number must be a positive integer");
                }
                fidqVar.b.b = new ASN1Integer(bigInteger);
                fidqVar.b.e = new Time(date);
                fidqVar.b.f = new Time(date2);
                try {
                    fidqVar.b.g = X500Name.b(new fhsl(x500Principal2.getEncoded()).p());
                    try {
                        fidqVar.b.h = SubjectPublicKeyInfo.b(new ASN1InputStream(keyPair.getPublic().getEncoded()).f());
                        fidqVar.e = str;
                        try {
                            Hashtable hashtable = fidp.a;
                            String c = fidb.c(str);
                            fidqVar.c = fidp.a.containsKey(c) ? (ASN1ObjectIdentifier) fidp.a.get(c) : new ASN1ObjectIdentifier(c);
                            ASN1ObjectIdentifier aSN1ObjectIdentifier = fidqVar.c;
                            if (fidp.c.contains(aSN1ObjectIdentifier)) {
                                algorithmIdentifier = new AlgorithmIdentifier(aSN1ObjectIdentifier);
                            } else {
                                String c2 = fidb.c(str);
                                algorithmIdentifier = fidp.b.containsKey(c2) ? new AlgorithmIdentifier(aSN1ObjectIdentifier, (ASN1Encodable) fidp.b.get(c2)) : new AlgorithmIdentifier(aSN1ObjectIdentifier, DERNull.a);
                            }
                            fidqVar.d = algorithmIdentifier;
                            fidqVar.b.c = fidqVar.d;
                            PrivateKey privateKey = keyPair.getPrivate();
                            if (!fidqVar.f.b.isEmpty()) {
                                V3TBSCertificateGenerator v3TBSCertificateGenerator = fidqVar.b;
                                X509ExtensionsGenerator x509ExtensionsGenerator = fidqVar.f;
                                Extensions c3 = Extensions.c(new X509Extensions(x509ExtensionsGenerator.b, x509ExtensionsGenerator.a));
                                v3TBSCertificateGenerator.i = c3;
                                if (c3 != null && (b2 = c3.b(Extension.c)) != null && b2.t) {
                                    v3TBSCertificateGenerator.j = true;
                                }
                            }
                            V3TBSCertificateGenerator v3TBSCertificateGenerator2 = fidqVar.b;
                            if (v3TBSCertificateGenerator2.b == null || v3TBSCertificateGenerator2.c == null || v3TBSCertificateGenerator2.d == null || v3TBSCertificateGenerator2.e == null || v3TBSCertificateGenerator2.f == null || ((v3TBSCertificateGenerator2.g == null && !v3TBSCertificateGenerator2.j) || v3TBSCertificateGenerator2.h == null)) {
                                throw new IllegalStateException("not all mandatory fields set in V3 TBScertificate generator");
                            }
                            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(10);
                            aSN1EncodableVector.b(v3TBSCertificateGenerator2.a);
                            aSN1EncodableVector.b(v3TBSCertificateGenerator2.b);
                            AlgorithmIdentifier algorithmIdentifier2 = v3TBSCertificateGenerator2.c;
                            if (algorithmIdentifier2 != null) {
                                aSN1EncodableVector.b(algorithmIdentifier2);
                            }
                            aSN1EncodableVector.b(v3TBSCertificateGenerator2.d);
                            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(2);
                            aSN1EncodableVector2.b(v3TBSCertificateGenerator2.e);
                            aSN1EncodableVector2.b(v3TBSCertificateGenerator2.f);
                            aSN1EncodableVector.b(new DERSequence(aSN1EncodableVector2));
                            X500Name x500Name = v3TBSCertificateGenerator2.g;
                            if (x500Name != null) {
                                aSN1EncodableVector.b(x500Name);
                            } else {
                                aSN1EncodableVector.b(new DERSequence());
                            }
                            aSN1EncodableVector.b(v3TBSCertificateGenerator2.h);
                            Extensions extensions = v3TBSCertificateGenerator2.i;
                            if (extensions != null) {
                                aSN1EncodableVector.b(new DERTaggedObject(true, 3, extensions));
                            }
                            TBSCertificate a2 = TBSCertificate.a(new DERSequence(aSN1EncodableVector));
                            try {
                                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = fidqVar.c;
                                String str2 = fidqVar.e;
                                if (aSN1ObjectIdentifier2 == null) {
                                    throw new IllegalStateException("no signature algorithm specified");
                                }
                                Signature signature = Signature.getInstance(str2);
                                signature.initSign(privateKey);
                                signature.update(a2.p().u());
                                byte[] sign = signature.sign();
                                try {
                                    ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
                                    aSN1EncodableVector3.b(a2);
                                    aSN1EncodableVector3.b(fidqVar.d);
                                    aSN1EncodableVector3.b(new DERBitString(sign));
                                    return fidqVar.a.engineGenerateCertificate(new ByteArrayInputStream(new DERSequence(aSN1EncodableVector3).u()));
                                } catch (Exception e) {
                                    throw new fido("exception producing certificate object", e);
                                }
                            } catch (IOException e2) {
                                throw new fido("exception encoding TBS cert", e2);
                            }
                        } catch (Exception unused) {
                            throw new IllegalArgumentException("Unknown signature type requested: ".concat(str));
                        }
                    } catch (Exception e3) {
                        throw new IllegalArgumentException("unable to process key - ".concat(String.valueOf(e3.toString())));
                    }
                } catch (IOException e4) {
                    throw new IllegalArgumentException("can't process principal: ".concat(e4.toString()));
                }
            } catch (IOException e5) {
                throw new IllegalArgumentException("can't process principal: ".concat(e5.toString()));
            }
        } catch (NoSuchMethodError e6) {
            dkty.i(e6, "Platform does not have API to use X509V3CertificateGenerator.", new Object[0]);
            throw new IllegalStateException(e6.toString());
        }
    }
}
