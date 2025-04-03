package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class RDN extends ASN1Object {
    private final ASN1Set a;

    public RDN(ASN1Set aSN1Set) {
        this.a = aSN1Set;
    }

    public final int a() {
        return this.a.e();
    }

    public final AttributeTypeAndValue b() {
        if (this.a.e() == 0) {
            return null;
        }
        return AttributeTypeAndValue.a(this.a.f(0));
    }

    public final boolean c() {
        return this.a.e() > 1;
    }

    public final AttributeTypeAndValue[] d() {
        int e = this.a.e();
        AttributeTypeAndValue[] attributeTypeAndValueArr = new AttributeTypeAndValue[e];
        for (int i = 0; i != e; i++) {
            attributeTypeAndValueArr[i] = AttributeTypeAndValue.a(this.a.f(i));
        }
        return attributeTypeAndValueArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this.a;
    }
}
