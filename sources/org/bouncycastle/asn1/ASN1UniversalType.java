package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ASN1UniversalType extends ASN1Type {
    public ASN1UniversalType(Class cls) {
        super(cls);
    }

    public ASN1Primitive a(DEROctetString dEROctetString) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    public ASN1Primitive b(ASN1Sequence aSN1Sequence) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    final ASN1Primitive c(byte[] bArr) {
        ASN1Primitive v = ASN1Primitive.v(bArr);
        e(v);
        return v;
    }

    public final ASN1Primitive d(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive b;
        ASN1Util.c(aSN1TaggedObject);
        if (z) {
            if (!aSN1TaggedObject.n()) {
                throw new IllegalStateException("object explicit - implicit expected.");
            }
            b = aSN1TaggedObject.d.p();
            e(b);
        } else {
            if (aSN1TaggedObject.a == 1) {
                throw new IllegalStateException("object explicit - implicit expected.");
            }
            ASN1Primitive p = aSN1TaggedObject.d.p();
            int i = aSN1TaggedObject.a;
            if (i == 3) {
                b = b(aSN1TaggedObject.i(p));
            } else if (i != 4) {
                e(p);
                b = p;
            } else {
                b = p instanceof ASN1Sequence ? b((ASN1Sequence) p) : a((DEROctetString) p);
            }
        }
        e(b);
        return b;
    }

    final void e(ASN1Primitive aSN1Primitive) {
        if (!this.a.isInstance(aSN1Primitive)) {
            throw new IllegalStateException("unexpected object: ".concat(String.valueOf(aSN1Primitive.getClass().getName())));
        }
    }
}
