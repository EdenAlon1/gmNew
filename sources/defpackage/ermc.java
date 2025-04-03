package defpackage;

import com.android.vcard.VCardConfig;
import j$.net.URLDecoder;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ermc extends enfi implements Cloneable, Serializable {
    public static final ermc a = new ermc(enet.a);
    private static final long serialVersionUID = -3053773769157973706L;
    public final enkg b;

    public ermc(enkg enkgVar) {
        this.b = new erlq(enkgVar);
    }

    public static String f(String str, int i, int i2, Charset charset, boolean z) {
        try {
            return z ? new String(URLDecoder.decode(str.substring(i, i2), VCardConfig.DEFAULT_INTERMEDIATE_CHARSET).getBytes(StandardCharsets.ISO_8859_1), charset) : URLDecoder.decode(str.substring(i, i2), charset.name());
        } catch (UnsupportedEncodingException unused) {
            return str.substring(i, i2);
        } catch (IllegalArgumentException unused2) {
            return str.substring(i, i2);
        }
    }

    @Override // defpackage.enfi
    protected final enkg b() {
        return this.b;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new ermc(new enkf(this.b));
    }

    @Override // defpackage.enfi, defpackage.enfl
    protected final /* synthetic */ ennd e() {
        return this.b;
    }

    @Override // defpackage.enfl, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.b;
    }

    @Override // defpackage.enfm
    public final String toString() {
        Charset charset = ermb.a;
        charset.getClass();
        StringBuilder sb = new StringBuilder();
        try {
            Iterator it = u().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append((CharSequence) ermb.a((String) entry.getKey(), charset));
                if (!((String) entry.getValue()).isEmpty()) {
                    sb.append('=').append(ermb.a((String) entry.getValue(), charset));
                }
                if (it.hasNext()) {
                    sb.append('&');
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public ermc() {
        this(new enkf(12));
    }
}
