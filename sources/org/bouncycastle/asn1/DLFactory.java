package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes6.dex */
class DLFactory {
    static final DLSequence a = new DLSequence();
    static final DLSet b = new DLSet();

    DLFactory() {
    }

    static DLSequence a(ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.c <= 0 ? a : new DLSequence(aSN1EncodableVector);
    }

    static DLSet b(ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.c <= 0 ? b : new DLSet(aSN1EncodableVector);
    }
}
