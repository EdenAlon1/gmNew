package org.bouncycastle.asn1;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ASN1StreamParser {
    public final InputStream a;
    private final int b;
    private final byte[][] c;

    public ASN1StreamParser(InputStream inputStream, int i, byte[][] bArr) {
        this.a = inputStream;
        this.b = i;
        this.c = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final org.bouncycastle.asn1.ASN1Encodable a(int r14) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ASN1StreamParser.a(int):org.bouncycastle.asn1.ASN1Encodable");
    }

    public final ASN1Encodable b() {
        int read = this.a.read();
        if (read < 0) {
            return null;
        }
        return a(read);
    }

    final ASN1EncodableVector c() {
        int read = this.a.read();
        if (read < 0) {
            return new ASN1EncodableVector(0);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        do {
            ASN1Encodable a = a(read);
            if (a instanceof InMemoryRepresentable) {
                aSN1EncodableVector.b(((InMemoryRepresentable) a).j());
            } else {
                aSN1EncodableVector.b(a.p());
            }
            read = this.a.read();
        } while (read >= 0);
        return aSN1EncodableVector;
    }

    final ASN1Primitive d(int i, int i2) {
        ASN1EncodableVector c = c();
        int i3 = c.c;
        if (i3 == 1) {
            return new BERTaggedObject(3, i, i2, c.a(0));
        }
        return new BERTaggedObject(4, i, i2, i3 <= 0 ? BERFactory.a : new BERSequence(c));
    }
}
