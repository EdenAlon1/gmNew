package defpackage;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djay {
    public static String a(String str) {
        int indexOf = str.indexOf("boundary=");
        if (indexOf < 0) {
            return null;
        }
        int i = indexOf + 9;
        int indexOf2 = str.indexOf(59, i);
        String substring = indexOf2 < i ? str.substring(i) : str.substring(i, indexOf2);
        if (substring.startsWith("\"")) {
            substring = substring.substring(1, substring.length());
        }
        return substring.endsWith("\"") ? substring.substring(0, substring.length() - 1) : substring;
    }

    public static void b(InputStream inputStream, String str, djaw djawVar) {
        int read;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, str.length() + 4);
        }
        byte[] bytes = str.getBytes();
        while (true) {
            if (djba.a(inputStream, bytes) || inputStream.read() == -1) {
                djba.b(inputStream);
                long length = bytes.length + 2;
                if (inputStream.skip(length) < length) {
                    return;
                }
                djba.b(inputStream);
                char c = 2;
                inputStream.mark(2);
                try {
                    if (inputStream.read() == 45 && inputStream.read() == 45) {
                        return;
                    }
                    inputStream.reset();
                    djawVar.a();
                    for (String c2 = djba.c(inputStream); !dktk.d(c2); c2 = djba.c(inputStream)) {
                        if (dktk.d(c2)) {
                            throw new IllegalArgumentException("Line must not be null");
                        }
                        int indexOf = c2.indexOf(58);
                        if (indexOf == -1) {
                            throw new djaz("Illegal header: ".concat(c2));
                        }
                        if (indexOf == c2.length()) {
                            throw new djaz("Illegal header: ".concat(c2));
                        }
                        djax djaxVar = new djax();
                        djaxVar.a = c2.substring(0, indexOf);
                        djaxVar.b = c2.substring(indexOf + 1, c2.length()).trim();
                        djawVar.d(djaxVar);
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
                    while (!djba.a(inputStream, bytes)) {
                        try {
                            if (c != 3) {
                                if (djba.a(inputStream, bytes)) {
                                    c = 3;
                                } else {
                                    read = inputStream.read();
                                    byteArrayOutputStream.write(read);
                                }
                            }
                            read = -1;
                            byteArrayOutputStream.write(read);
                        } catch (Throwable th) {
                            byteArrayOutputStream.close();
                            throw th;
                        }
                    }
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    int length2 = byteArray.length;
                    djawVar.b(byteArray);
                    djawVar.c();
                } finally {
                    inputStream.reset();
                }
            }
        }
    }
}
