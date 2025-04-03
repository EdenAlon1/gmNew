package org.bouncycastle.asn1.pkcs;

import defpackage.a;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class SignedData extends ASN1Object implements PKCSObjectIdentifiers {
    public ASN1Set K;
    private ASN1Integer L;
    private ASN1Set M;
    private ContentInfo N;
    private ASN1Set O;
    public ASN1Set a;

    public SignedData(ASN1Integer aSN1Integer, ASN1Set aSN1Set, ContentInfo contentInfo, ASN1Set aSN1Set2, ASN1Set aSN1Set3) {
        this.L = aSN1Integer;
        this.M = aSN1Set;
        this.N = contentInfo;
        this.a = aSN1Set2;
        this.K = null;
        this.O = aSN1Set3;
    }

    public static SignedData a(Object obj) {
        if (obj != null) {
            return new SignedData(ASN1Sequence.j(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.b(this.L);
        aSN1EncodableVector.b(this.M);
        aSN1EncodableVector.b(this.N);
        ASN1Set aSN1Set = this.a;
        if (aSN1Set != null) {
            aSN1EncodableVector.b(new DERTaggedObject(false, 0, aSN1Set));
        }
        ASN1Set aSN1Set2 = this.K;
        if (aSN1Set2 != null) {
            aSN1EncodableVector.b(new DERTaggedObject(false, 1, aSN1Set2));
        }
        aSN1EncodableVector.b(this.O);
        return new BERSequence(aSN1EncodableVector);
    }

    public SignedData(ASN1Sequence aSN1Sequence) {
        Enumeration f = aSN1Sequence.f();
        this.L = (ASN1Integer) f.nextElement();
        this.M = (ASN1Set) f.nextElement();
        Object nextElement = f.nextElement();
        boolean z = nextElement instanceof ContentInfo;
        int i = ContentInfo.a;
        this.N = z ? (ContentInfo) nextElement : nextElement != null ? new ContentInfo(ASN1Sequence.j(nextElement)) : null;
        while (f.hasMoreElements()) {
            ASN1Primitive aSN1Primitive = (ASN1Primitive) f.nextElement();
            if (aSN1Primitive instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
                int i2 = aSN1TaggedObject.c;
                if (i2 == 0) {
                    this.a = ASN1Set.h(aSN1TaggedObject);
                } else {
                    if (i2 != 1) {
                        throw new IllegalArgumentException(a.h(i2, "unknown tag value "));
                    }
                    this.K = ASN1Set.h(aSN1TaggedObject);
                }
            } else {
                this.O = (ASN1Set) aSN1Primitive;
            }
        }
    }
}
