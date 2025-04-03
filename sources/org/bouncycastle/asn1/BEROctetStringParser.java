package org.bouncycastle.asn1;

import defpackage.fidk;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class BEROctetStringParser implements ASN1OctetStringParser {
    private final ASN1StreamParser a;

    public BEROctetStringParser(ASN1StreamParser aSN1StreamParser) {
        this.a = aSN1StreamParser;
    }

    static BEROctetString a(ASN1StreamParser aSN1StreamParser) {
        return new BEROctetString(fidk.a(new ConstructedOctetStream(aSN1StreamParser)), null);
    }

    @Override // org.bouncycastle.asn1.ASN1OctetStringParser
    public final InputStream e() {
        return new ConstructedOctetStream(this.a);
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public final ASN1Primitive j() {
        return a(this.a);
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        try {
            return j();
        } catch (IOException e) {
            throw new ASN1ParsingException("IOException converting stream to byte array: ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
