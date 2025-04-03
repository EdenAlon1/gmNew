package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DLSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ContentInfo extends ASN1Object implements PKCSObjectIdentifiers {
    public static final /* synthetic */ int a = 0;
    private final ASN1ObjectIdentifier K;
    private ASN1Encodable L;
    private boolean M;

    public ContentInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.M = true;
        this.K = aSN1ObjectIdentifier;
        this.L = aSN1Encodable;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.b(this.K);
        ASN1Encodable aSN1Encodable = this.L;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.b(new BERTaggedObject(aSN1Encodable));
        }
        return this.M ? new BERSequence(aSN1EncodableVector) : new DLSequence(aSN1EncodableVector);
    }

    public ContentInfo(ASN1Sequence aSN1Sequence) {
        this.M = true;
        Enumeration f = aSN1Sequence.f();
        this.K = (ASN1ObjectIdentifier) f.nextElement();
        if (f.hasMoreElements()) {
            this.L = ((ASN1TaggedObject) f.nextElement()).f();
        }
        this.M = aSN1Sequence instanceof BERSequence;
    }
}
