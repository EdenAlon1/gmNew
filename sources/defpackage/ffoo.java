package defpackage;

import com.android.vcard.VCardConfig;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffoo {
    public static final Charset a;
    public static final Charset b;
    public static volatile Charset c;
    public static volatile Charset d;

    static {
        Charset forName = Charset.forName("UTF-8");
        forName.getClass();
        a = forName;
        Charset.forName("UTF-16").getClass();
        Charset.forName("UTF-16BE").getClass();
        Charset.forName("UTF-16LE").getClass();
        Charset.forName("US-ASCII").getClass();
        Charset forName2 = Charset.forName(VCardConfig.DEFAULT_INTERMEDIATE_CHARSET);
        forName2.getClass();
        b = forName2;
    }
}
