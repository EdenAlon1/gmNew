package defpackage;

import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface fhsh {
    PrivateKey a(PrivateKeyInfo privateKeyInfo);

    PublicKey b(SubjectPublicKeyInfo subjectPublicKeyInfo);
}
