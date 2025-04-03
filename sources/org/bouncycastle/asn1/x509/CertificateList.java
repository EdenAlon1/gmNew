package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.TBSCertList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class CertificateList extends ASN1Object {
    public TBSCertList a;
    public AlgorithmIdentifier b;
    public ASN1BitString c;
    boolean d = false;
    int e;

    private CertificateList(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.e() != 3) {
            throw new IllegalArgumentException("sequence wrong size for CertificateList");
        }
        ASN1Encodable h = aSN1Sequence.h(0);
        this.a = h instanceof TBSCertList ? (TBSCertList) h : h != null ? new TBSCertList(ASN1Sequence.j(h)) : null;
        this.b = AlgorithmIdentifier.a(aSN1Sequence.h(1));
        this.c = ASN1BitString.i(aSN1Sequence.h(2));
    }

    public static CertificateList c(Object obj) {
        if (obj instanceof CertificateList) {
            return (CertificateList) obj;
        }
        if (obj != null) {
            return new CertificateList(ASN1Sequence.j(obj));
        }
        return null;
    }

    public final Enumeration a() {
        ASN1Sequence aSN1Sequence = this.a.f;
        return aSN1Sequence == null ? new TBSCertList.EmptyEnumeration() : new TBSCertList.RevokedCertificatesEnumeration(aSN1Sequence.f());
    }

    public final X500Name b() {
        return this.a.c;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        if (!this.d) {
            this.e = super.hashCode();
            this.d = true;
        }
        return this.e;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.b(this.a);
        aSN1EncodableVector.b(this.b);
        aSN1EncodableVector.b(this.c);
        return new DERSequence(aSN1EncodableVector);
    }
}
