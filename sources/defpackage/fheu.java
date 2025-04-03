package defpackage;

import java.io.InputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fheu {
    public static final Log a = LogFactory.getLog(fheu.class);

    public static InputStream a(String str) {
        InputStream inputStream;
        try {
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(str);
        } catch (SecurityException e) {
            a.info("Unable to access context classloader, using default. ".concat(String.valueOf(e.getMessage())));
            inputStream = null;
        }
        return inputStream == null ? fheu.class.getResourceAsStream("/".concat(str)) : inputStream;
    }
}
