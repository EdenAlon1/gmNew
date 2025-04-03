package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enxj {
    static byte a(InputStream inputStream) {
        int read = inputStream.read();
        if (read >= 0) {
            return (byte) (read & PrivateKeyType.INVALID);
        }
        throw new IOException("EOF");
    }
}
