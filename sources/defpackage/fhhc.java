package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhhc extends Reader {
    private final fhmv a;
    private final Charset b;
    private boolean c;
    private Reader d;

    public fhhc(fhmv fhmvVar, Charset charset) {
        fhmvVar.getClass();
        charset.getClass();
        this.a = fhmvVar;
        this.b = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c = true;
        Reader reader = this.d;
        if (reader != null) {
            reader.close();
        } else {
            this.a.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        cArr.getClass();
        if (this.c) {
            throw new IOException("Stream closed");
        }
        Reader reader = this.d;
        if (reader == null) {
            fhmv fhmvVar = this.a;
            Charset charset = this.b;
            InputStream k = fhmvVar.k();
            byte[] bArr = fhhl.a;
            fhmvVar.getClass();
            charset.getClass();
            int g = fhmvVar.g(fhhl.d);
            if (g != -1) {
                if (g == 0) {
                    charset = StandardCharsets.UTF_8;
                    charset.getClass();
                } else if (g == 1) {
                    charset = StandardCharsets.UTF_16BE;
                    charset.getClass();
                } else if (g == 2) {
                    charset = StandardCharsets.UTF_16LE;
                    charset.getClass();
                } else if (g == 3) {
                    Charset charset2 = ffoo.a;
                    charset = ffoo.d;
                    if (charset == null) {
                        charset = Charset.forName("UTF-32BE");
                        charset.getClass();
                        ffoo.d = charset;
                    }
                } else {
                    if (g != 4) {
                        throw new AssertionError();
                    }
                    Charset charset3 = ffoo.a;
                    charset = ffoo.c;
                    if (charset == null) {
                        charset = Charset.forName("UTF-32LE");
                        charset.getClass();
                        ffoo.c = charset;
                    }
                }
            }
            InputStreamReader inputStreamReader = new InputStreamReader(k, charset);
            this.d = inputStreamReader;
            reader = inputStreamReader;
        }
        return reader.read(cArr, i, i2);
    }
}
