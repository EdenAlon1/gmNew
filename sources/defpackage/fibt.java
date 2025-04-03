package defpackage;

import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fibt extends KeyFactorySpi implements fhsh {
    private final Set a;

    protected fibt(Set set) {
        this.a = set;
    }

    private final void c(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (!this.a.contains(aSN1ObjectIdentifier)) {
            throw new InvalidKeySpecException("incorrect algorithm OID for key: ".concat(String.valueOf(String.valueOf(aSN1ObjectIdentifier))));
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(a.R(keySpec, "Unsupported key specification: "));
        }
        try {
            PrivateKeyInfo b = PrivateKeyInfo.b(((PKCS8EncodedKeySpec) keySpec).getEncoded());
            c(b.a.a);
            return a(b);
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(a.F(keySpec, "Unknown key specification: ", "."));
        }
        try {
            SubjectPublicKeyInfo b = SubjectPublicKeyInfo.b(((X509EncodedKeySpec) keySpec).getEncoded());
            c(b.a.a);
            return b(b);
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString());
        }
    }
}
