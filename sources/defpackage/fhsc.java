package defpackage;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhsc {
    private static final Map a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(fhqu.b, "Ed25519");
        hashMap.put(fhqu.c, "Ed448");
        hashMap.put(fhrc.b, "SHA1withDSA");
        hashMap.put(X9ObjectIdentifiers.L, "SHA1withDSA");
    }

    static String a(AlgorithmIdentifier algorithmIdentifier) {
        String g;
        String g2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = algorithmIdentifier.a;
        ASN1Encodable aSN1Encodable = algorithmIdentifier.b;
        if (!h(aSN1Encodable)) {
            if (PKCSObjectIdentifiers.h.w(aSN1ObjectIdentifier)) {
                boolean z = aSN1Encodable instanceof RSASSAPSSparams;
                AlgorithmIdentifier algorithmIdentifier2 = RSASSAPSSparams.a;
                return String.valueOf(f((z ? (RSASSAPSSparams) aSN1Encodable : aSN1Encodable != null ? new RSASSAPSSparams(ASN1Sequence.j(aSN1Encodable)) : null).e.a)).concat("withRSAandMGF1");
            }
            if (X9ObjectIdentifiers.g.w(aSN1ObjectIdentifier)) {
                return String.valueOf(f((ASN1ObjectIdentifier) ASN1Sequence.j(aSN1Encodable).h(0))).concat("withECDSA");
            }
        }
        String str = (String) a.get(aSN1ObjectIdentifier);
        if (str != null) {
            return str;
        }
        Provider provider = Security.getProvider("BC");
        if (provider != null && (g2 = g(provider, aSN1ObjectIdentifier)) != null) {
            return g2;
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            Provider provider2 = providers[i];
            if (provider != provider2 && (g = g(provider2, aSN1ObjectIdentifier)) != null) {
                return g;
            }
        }
        return aSN1ObjectIdentifier.e();
    }

    static void b(byte[] bArr, StringBuffer stringBuffer, String str) {
        if (bArr.length <= 20) {
            stringBuffer.append("            Signature: ");
            stringBuffer.append(fidh.a(bArr));
            stringBuffer.append(str);
            return;
        }
        stringBuffer.append("            Signature: ");
        stringBuffer.append(fidh.b(bArr, 0, 20));
        stringBuffer.append(str);
        int i = 20;
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return;
            }
            if (i < length - 20) {
                stringBuffer.append("                       ");
                stringBuffer.append(fidh.b(bArr, i, 20));
                stringBuffer.append(str);
            } else {
                stringBuffer.append("                       ");
                stringBuffer.append(fidh.b(bArr, i, length - i));
                stringBuffer.append(str);
            }
            i += 20;
        }
    }

    static void c(Signature signature, ASN1Encodable aSN1Encodable) {
        if (h(aSN1Encodable)) {
            return;
        }
        String algorithm = signature.getAlgorithm();
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(algorithm, signature.getProvider());
        try {
            algorithmParameters.init(aSN1Encodable.p().s());
            if (algorithm.endsWith("MGF1")) {
                try {
                    signature.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                } catch (GeneralSecurityException e) {
                    throw new SignatureException("Exception extracting parameters: ".concat(String.valueOf(e.getMessage())));
                }
            }
        } catch (IOException e2) {
            throw new SignatureException("IOException decoding parameters: ".concat(String.valueOf(e2.getMessage())));
        }
    }

    static boolean d(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        if (!algorithmIdentifier.a.w(algorithmIdentifier2.a)) {
            return false;
        }
        if (ficz.b("org.bouncycastle.x509.allow_absent_equiv_NULL") && h(algorithmIdentifier.b) && h(algorithmIdentifier2.b)) {
            return true;
        }
        return ficv.b(algorithmIdentifier.b, algorithmIdentifier2.b);
    }

    static boolean e(AlgorithmIdentifier algorithmIdentifier) {
        return fhqy.m.w(algorithmIdentifier.a);
    }

    private static String f(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) fhsj.a.get(aSN1ObjectIdentifier);
        if (str == null) {
            str = aSN1ObjectIdentifier.e();
        }
        int indexOf = str.indexOf(45);
        if (indexOf <= 0 || str.startsWith("SHA3")) {
            return str;
        }
        return String.valueOf(str.substring(0, indexOf)).concat(String.valueOf(str.substring(indexOf + 1)));
    }

    private static String g(Provider provider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String property = provider.getProperty("Alg.Alias.Signature.".concat(String.valueOf(String.valueOf(aSN1ObjectIdentifier))));
        if (property != null) {
            return property;
        }
        String property2 = provider.getProperty("Alg.Alias.Signature.OID.".concat(String.valueOf(String.valueOf(aSN1ObjectIdentifier))));
        if (property2 != null) {
            return property2;
        }
        return null;
    }

    private static boolean h(ASN1Encodable aSN1Encodable) {
        DERNull dERNull;
        return aSN1Encodable == null || (dERNull = DERNull.a) == aSN1Encodable || dERNull.c(aSN1Encodable.p());
    }
}
