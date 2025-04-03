package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class DLBitStringParser implements ASN1BitStringParser {
    private final DefiniteLengthInputStream a;
    private int b = 0;

    public DLBitStringParser(DefiniteLengthInputStream definiteLengthInputStream) {
        this.a = definiteLengthInputStream;
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public final int f() {
        return this.b;
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public final InputStream g() {
        DefiniteLengthInputStream definiteLengthInputStream = this.a;
        int i = definiteLengthInputStream.b;
        if (i <= 0) {
            throw new IllegalStateException("content octets cannot be empty");
        }
        int read = definiteLengthInputStream.read();
        this.b = read;
        if (read > 0) {
            if (i < 2) {
                throw new IllegalStateException("zero length data with non-zero pad bits");
            }
            if (read > 7) {
                throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
            }
        }
        return this.a;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public final ASN1Primitive j() {
        return ASN1BitString.h(this.a.a());
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
