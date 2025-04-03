package defpackage;

import androidx.car.app.model.Alert;
import j$.util.DesugarCollections;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fhry extends X509Certificate {
    protected final Certificate a;
    protected final BasicConstraints b;
    protected final boolean[] c;
    protected final String d;
    protected final byte[] e;
    protected final fhsk f;

    public fhry(fhsk fhskVar, Certificate certificate, BasicConstraints basicConstraints, boolean[] zArr, String str, byte[] bArr) {
        this.f = fhskVar;
        this.a = certificate;
        this.b = basicConstraints;
        this.c = zArr;
        this.d = str;
        this.e = bArr;
    }

    protected static ASN1OctetString a(Certificate certificate, String str) {
        Extension b;
        Extensions extensions = certificate.b.l;
        if (extensions == null || (b = extensions.b(new ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        return b.u;
    }

    protected static byte[] b(Certificate certificate, String str) {
        ASN1OctetString a = a(certificate, str);
        if (a != null) {
            return a.c;
        }
        return null;
    }

    private static Collection c(Certificate certificate, String str) {
        byte[] b = b(certificate, str);
        if (b == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration f = ASN1Sequence.j(b).f();
            while (f.hasMoreElements()) {
                GeneralName a = GeneralName.a(f.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(a.b));
                int i = a.b;
                switch (i) {
                    case 0:
                    case 3:
                    case 5:
                        arrayList2.add(a.s());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    case 1:
                    case 2:
                    case 6:
                        arrayList2.add(((ASN1String) a.a).e());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    case 4:
                        X500NameStyle x500NameStyle = RFC4519Style.R;
                        ASN1Encodable aSN1Encodable = a.a;
                        int i2 = X500Name.b;
                        arrayList2.add((aSN1Encodable instanceof X500Name ? new X500Name(x500NameStyle, (X500Name) aSN1Encodable) : aSN1Encodable != null ? new X500Name(x500NameStyle, ASN1Sequence.j(aSN1Encodable)) : null).toString());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    case 7:
                        try {
                            arrayList2.add(InetAddress.getByAddress(DEROctetString.f(a.a).c).getHostAddress());
                            arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                        } catch (UnknownHostException unused) {
                        }
                    case 8:
                        arrayList2.add(ASN1ObjectIdentifier.h(a.a).e());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    default:
                        throw new IOException(a.h(i, "Bad tag number: "));
                }
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return DesugarCollections.unmodifiableCollection(arrayList);
        } catch (Exception e) {
            throw new CertificateParsingException(e.getMessage());
        }
    }

    private final void d(PublicKey publicKey, Signature signature, ASN1Encodable aSN1Encodable, byte[] bArr) {
        Certificate certificate = this.a;
        if (!fhsc.d(certificate.c, certificate.b.d)) {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        fhsc.c(signature, aSN1Encodable);
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new fhrf(signature), 512);
            this.a.b.t(bufferedOutputStream);
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("certificate does not verify with supplied key");
            }
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    private final void e(PublicKey publicKey, fhrm fhrmVar) {
        boolean z = publicKey instanceof fhre;
        if (z && fhsc.e(this.a.c)) {
            throw null;
        }
        if (!fhsc.e(this.a.c)) {
            Signature a = fhrmVar.a(this.d);
            if (!z) {
                d(publicKey, a, this.a.c.b, getSignature());
                return;
            } else {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = fhqy.a;
                throw null;
            }
        }
        ASN1Sequence j = ASN1Sequence.j(this.a.c.b);
        ASN1Sequence j2 = ASN1Sequence.j(this.a.d.n());
        boolean z2 = false;
        for (int i = 0; i != j2.e(); i++) {
            AlgorithmIdentifier a2 = AlgorithmIdentifier.a(j.h(i));
            try {
                d(publicKey, fhrmVar.a(fhsc.a(a2)), a2.b, ASN1BitString.i(j2.h(i)).n());
                z2 = true;
            } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            } catch (SignatureException e) {
                e = e;
            }
            e = null;
            if (e != null) {
                throw e;
            }
        }
        if (!z2) {
            throw new InvalidKeyException("no matching key found");
        }
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() {
        checkValidity(new Date());
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
        BasicConstraints basicConstraints = this.b;
        if (basicConstraints == null || !basicConstraints.b()) {
            return -1;
        }
        ASN1Integer aSN1Integer = basicConstraints.b;
        if (aSN1Integer == null) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        byte[] bArr = aSN1Integer.b;
        int length = bArr.length;
        int i = aSN1Integer.c;
        int i2 = length - i;
        if (i2 > 4 || (i2 == 4 && (bArr[i] & 128) != 0)) {
            throw new ArithmeticException("ASN.1 Integer out of positive int range");
        }
        return ASN1Integer.e(bArr, i, PrivateKeyType.INVALID);
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Extensions extensions = this.a.b.l;
        if (extensions == null) {
            return null;
        }
        Enumeration a = extensions.a();
        while (a.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) a.nextElement();
            if (extensions.b(aSN1ObjectIdentifier).t) {
                hashSet.add(aSN1ObjectIdentifier.e());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Certificate
    public final List getExtendedKeyUsage() {
        byte[] b = b(this.a, "2.5.29.37");
        if (b == null) {
            return null;
        }
        try {
            ASN1Sequence j = ASN1Sequence.j(ASN1Primitive.v(b));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != j.e(); i++) {
                arrayList.add(((ASN1ObjectIdentifier) j.h(i)).e());
            }
            return DesugarCollections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        ASN1OctetString a = a(this.a, str);
        if (a == null) {
            return null;
        }
        try {
            return a.s();
        } catch (Exception e) {
            throw new IllegalStateException("error parsing ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getIssuerAlternativeNames() {
        return c(this.a, Extension.d.e());
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getIssuerDN() {
        return new fhsl(this.a.a());
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        ASN1BitString aSN1BitString = this.a.b.j;
        if (aSN1BitString == null) {
            return null;
        }
        byte[] m = aSN1BitString.m();
        int length = (m.length * 8) - aSN1BitString.f();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (m[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.a.a().u());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
        boolean[] zArr = this.c;
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Extensions extensions = this.a.b.l;
        if (extensions == null) {
            return null;
        }
        Enumeration a = extensions.a();
        while (a.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) a.nextElement();
            if (!extensions.b(aSN1ObjectIdentifier).t) {
                hashSet.add(aSN1ObjectIdentifier.e());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotAfter() {
        return this.a.d().b();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotBefore() {
        return this.a.e().b();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        fhsh fhshVar;
        try {
            SubjectPublicKeyInfo subjectPublicKeyInfo = this.a.b.i;
            Logger logger = fhsp.a;
            if (subjectPublicKeyInfo.a.a.m(BCObjectIdentifiers.am)) {
                new fibm();
                return new fibl(subjectPublicKeyInfo);
            }
            ASN1ObjectIdentifier aSN1ObjectIdentifier = subjectPublicKeyInfo.a.a;
            synchronized (fhsp.b) {
                fhshVar = (fhsh) fhsp.b.get(aSN1ObjectIdentifier);
            }
            if (fhshVar == null) {
                return null;
            }
            return fhshVar.b(subjectPublicKeyInfo);
        } catch (IOException e) {
            throw new IllegalStateException("failed to recover public key: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    @Override // java.security.cert.X509Certificate
    public final BigInteger getSerialNumber() {
        return this.a.b.c.j();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgName() {
        return this.d;
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgOID() {
        return this.a.c.a.e();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() {
        return fics.c(this.e);
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
        return this.a.d.n();
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getSubjectAlternativeNames() {
        return c(this.a, Extension.c.e());
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getSubjectDN() {
        return new fhsl(this.a.b());
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
        ASN1BitString aSN1BitString = this.a.b.k;
        if (aSN1BitString == null) {
            return null;
        }
        byte[] m = aSN1BitString.m();
        int length = (m.length * 8) - aSN1BitString.f();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (m[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.a.b().u());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode subject DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() {
        try {
            return this.a.b.u();
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() {
        return this.a.b.b.f() + 1;
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        Extensions extensions;
        if (getVersion() != 3 || (extensions = this.a.b.l) == null) {
            return false;
        }
        Enumeration a = extensions.a();
        while (a.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) a.nextElement();
            if (!aSN1ObjectIdentifier.w(Extension.b) && !aSN1ObjectIdentifier.w(Extension.m) && !aSN1ObjectIdentifier.w(Extension.n) && !aSN1ObjectIdentifier.w(Extension.r) && !aSN1ObjectIdentifier.w(Extension.l) && !aSN1ObjectIdentifier.w(Extension.i) && !aSN1ObjectIdentifier.w(Extension.h) && !aSN1ObjectIdentifier.w(Extension.o) && !aSN1ObjectIdentifier.w(Extension.e) && !aSN1ObjectIdentifier.w(Extension.c) && !aSN1ObjectIdentifier.w(Extension.k) && extensions.b(aSN1ObjectIdentifier).t) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = fidb.a;
        stringBuffer.append("  [0]         Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(str);
        stringBuffer.append("         SerialNumber: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(str);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(str);
        stringBuffer.append("           Start Date: ");
        stringBuffer.append(getNotBefore());
        stringBuffer.append(str);
        stringBuffer.append("           Final Date: ");
        stringBuffer.append(getNotAfter());
        stringBuffer.append(str);
        stringBuffer.append("            SubjectDN: ");
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(str);
        stringBuffer.append("           Public Key: ");
        stringBuffer.append(getPublicKey());
        stringBuffer.append(str);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(this.d);
        stringBuffer.append(str);
        fhsc.b(getSignature(), stringBuffer, str);
        Extensions extensions = this.a.b.l;
        if (extensions != null) {
            Enumeration a = extensions.a();
            if (a.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
            }
            while (a.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) a.nextElement();
                Extension b = extensions.b(aSN1ObjectIdentifier);
                ASN1OctetString aSN1OctetString = b.u;
                if (aSN1OctetString != null) {
                    ASN1InputStream aSN1InputStream = new ASN1InputStream(aSN1OctetString.c);
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(b.t);
                    stringBuffer.append(") ");
                    try {
                        if (aSN1ObjectIdentifier.w(Extension.e)) {
                            stringBuffer.append(BasicConstraints.a(aSN1InputStream.f()));
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.w(Extension.b)) {
                            ASN1Primitive f = aSN1InputStream.f();
                            stringBuffer.append(f != null ? new KeyUsage(ASN1BitString.i(f)) : null);
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.w(fhqy.b)) {
                            stringBuffer.append(new fhqz(ASN1BitString.i(aSN1InputStream.f())));
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.w(fhqy.c)) {
                            stringBuffer.append(new fhra(ASN1IA5String.f(aSN1InputStream.f())));
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.w(fhqy.e)) {
                            stringBuffer.append(new fhrb(ASN1IA5String.f(aSN1InputStream.f())));
                            stringBuffer.append(str);
                        } else {
                            stringBuffer.append(aSN1ObjectIdentifier.e());
                            stringBuffer.append(" value = ");
                            stringBuffer.append(ASN1Dump.a(aSN1InputStream.f()));
                            stringBuffer.append(str);
                        }
                    } catch (Exception unused) {
                        stringBuffer.append(aSN1ObjectIdentifier.e());
                        stringBuffer.append(" value = ");
                        stringBuffer.append("*****");
                        stringBuffer.append(str);
                    }
                } else {
                    stringBuffer.append(str);
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) {
        e(publicKey, new fhrv(this));
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) {
        if (date.getTime() > getNotAfter().getTime()) {
            throw new CertificateExpiredException("certificate expired on ".concat(this.a.d().a()));
        }
        if (date.getTime() < getNotBefore().getTime()) {
            throw new CertificateNotYetValidException("certificate not valid till ".concat(this.a.e().a()));
        }
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) {
        e(publicKey, new fhrw(str));
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) {
        try {
            e(publicKey, new fhrx(provider));
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException("provider issue: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
