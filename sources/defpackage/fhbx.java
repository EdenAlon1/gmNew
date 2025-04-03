package defpackage;

import com.android.vcard.VCardConstants;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.logging.LogFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhbx extends fgwo {
    private static final long serialVersionUID = 4439949507756383452L;
    private URI c;
    private byte[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhbx() {
        super("ATTACH");
        fgyu fgyuVar = fgyu.a;
    }

    @Override // defpackage.fguw
    public final String a() {
        URI uri = this.c;
        if (uri != null) {
            String f = fhev.f(uri);
            int i = fhex.a;
            return f;
        }
        if (this.d == null) {
            return null;
        }
        try {
            return new String(fhes.a.a((fhbc) b(VCardConstants.PARAM_ENCODING)).encode(this.d));
        } catch (UnsupportedEncodingException e) {
            LogFactory.getLog(fhbx.class).error("Error encoding binary data", e);
            return null;
        } catch (EncoderException e2) {
            LogFactory.getLog(fhbx.class).error("Error encoding binary data", e2);
            return null;
        }
    }

    @Override // defpackage.fgwo
    public final void c(String str) {
        if (b(VCardConstants.PARAM_ENCODING) == null) {
            this.c = fhex.b(str);
            return;
        }
        try {
            this.d = fhep.a.a((fhbc) b(VCardConstants.PARAM_ENCODING)).decode(str.getBytes());
        } catch (UnsupportedEncodingException e) {
            LogFactory.getLog(fhbx.class).error("Error encoding binary data", e);
        } catch (DecoderException e2) {
            LogFactory.getLog(fhbx.class).error("Error decoding binary data", e2);
        }
    }
}
