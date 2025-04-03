package defpackage;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhtu extends ASN1Object {
    public final int a;
    public final AlgorithmIdentifier b;
    private final ASN1Integer c;

    public fhtu(int i, AlgorithmIdentifier algorithmIdentifier) {
        this.c = new ASN1Integer(0L);
        this.a = i;
        this.b = algorithmIdentifier;
    }

    public static fhtu a(Object obj) {
        if (obj instanceof fhtu) {
            return (fhtu) obj;
        }
        if (obj != null) {
            return new fhtu(ASN1Sequence.j(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(this.c);
        aSN1EncodableVector.b(new ASN1Integer(this.a));
        aSN1EncodableVector.b(this.b);
        return new DERSequence(aSN1EncodableVector);
    }

    private fhtu(ASN1Sequence aSN1Sequence) {
        this.c = ASN1Integer.m(aSN1Sequence.h(0));
        this.a = ASN1Integer.m(aSN1Sequence.h(1)).f();
        this.b = AlgorithmIdentifier.a(aSN1Sequence.h(2));
    }
}
