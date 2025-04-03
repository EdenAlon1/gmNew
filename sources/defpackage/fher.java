package defpackage;

import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.net.QuotedPrintableCodec;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fher extends fhes {
    @Override // defpackage.fhes
    public final BinaryEncoder a(fhbc fhbcVar) {
        if (fhbc.c.equals(fhbcVar)) {
            return new QuotedPrintableCodec();
        }
        if (fhbc.d.equals(fhbcVar)) {
            return new Base64();
        }
        throw new UnsupportedEncodingException(MessageFormat.format("Encoder not available for encoding [{0}]", fhbcVar));
    }
}
