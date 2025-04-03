package defpackage;

import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.net.QuotedPrintableCodec;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fheq extends fhep {
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.fhep
    public final BinaryDecoder a(fhbc fhbcVar) {
        if (fhbc.c.equals(fhbcVar)) {
            return new QuotedPrintableCodec();
        }
        if (fhbc.d.equals(fhbcVar)) {
            return new Base64();
        }
        throw new UnsupportedEncodingException(MessageFormat.format("Decoder not available for encoding [{0}]", fhbcVar));
    }

    @Override // defpackage.fhep
    public final StringDecoder b(fhbc fhbcVar) {
        if (fhbc.c.equals(fhbcVar)) {
            return new QuotedPrintableCodec();
        }
        throw new UnsupportedEncodingException(MessageFormat.format("Decoder not available for encoding [{0}]", fhbcVar));
    }
}
