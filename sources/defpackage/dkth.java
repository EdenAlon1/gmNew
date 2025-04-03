package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkth {
    public static String a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int read = inputStream.read();
        do {
            if (read == 13) {
                read = inputStream.read();
            } else {
                if (read == 10) {
                    return new String(byteArrayOutputStream.toByteArray(), "utf-8");
                }
                byteArrayOutputStream.write(read);
                read = inputStream.read();
            }
        } while (read > 0);
        throw new dktg("0d0a sequence not read before InputStream EOF.");
    }
}
