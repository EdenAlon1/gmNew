package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class DLTaggedObject extends ASN1TaggedObject {
    public DLTaggedObject(int i, int i2, int i3, ASN1Encodable aSN1Encodable) {
        super(i, i2, i3, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        ASN1Primitive l = this.d.p().l();
        boolean n = n();
        int a = l.a(n);
        if (n) {
            a += ASN1OutputStream.a(a);
        }
        return a + (z ? ASN1OutputStream.c(this.c) : 0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        ASN1Primitive l = this.d.p().l();
        boolean n = n();
        if (z) {
            int i = this.b;
            if (n || l.d()) {
                i |= 32;
            }
            aSN1OutputStream.o(i, this.c);
        }
        if (n) {
            aSN1OutputStream.h(l.a(true));
        }
        l.b(aSN1OutputStream.e(), n);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return n() || this.d.p().l().d();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public final ASN1Sequence i(ASN1Primitive aSN1Primitive) {
        return new DLSequence(aSN1Primitive);
    }

    public DLTaggedObject(boolean z, int i, ASN1Encodable aSN1Encodable) {
        super(z, i, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive l() {
        return this;
    }
}
