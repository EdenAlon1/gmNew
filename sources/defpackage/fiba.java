package defpackage;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiba extends fibt {
    private static final Set a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add(BCObjectIdentifiers.bN);
        hashSet.add(BCObjectIdentifiers.bO);
        hashSet.add(BCObjectIdentifiers.bP);
        hashSet.add(BCObjectIdentifiers.bQ);
        hashSet.add(BCObjectIdentifiers.bR);
        hashSet.add(BCObjectIdentifiers.bS);
    }

    public fiba() {
        super(a);
    }

    @Override // defpackage.fhsh
    public final PrivateKey a(PrivateKeyInfo privateKeyInfo) {
        return new fiay(privateKeyInfo);
    }

    @Override // defpackage.fhsh
    public final PublicKey b(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new fiaz(subjectPublicKeyInfo);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof fiay) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof fiaz)) {
                throw new InvalidKeySpecException(a.S(key, "Unsupported key type: "));
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        }
        throw new InvalidKeySpecException(a.F(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if ((key instanceof fiay) || (key instanceof fiaz)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
