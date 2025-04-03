package defpackage;

import com.android.vcard.VCardConfig;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdb {
    public static final Charset a;

    static {
        Charset.forName("US-ASCII");
        Charset.forName(VCardConfig.DEFAULT_INTERMEDIATE_CHARSET);
        a = Charset.forName("UTF-8");
    }
}
