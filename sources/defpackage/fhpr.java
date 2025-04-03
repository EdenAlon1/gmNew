package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhpr extends fhpl {
    private final byte[] a;
    private final Charset b;

    public fhpr(String str) {
        this(str, "text/plain", null);
    }

    public static fhpr j(String str) {
        return l(str, null, null);
    }

    public static fhpr k(String str, Charset charset) {
        return l(str, null, charset);
    }

    public static fhpr l(String str, String str2, Charset charset) {
        try {
            return new fhpr(str, str2, charset);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(a.i(charset, "Charset ", " is not supported"), e);
        }
    }

    @Override // defpackage.fhpo
    public long a() {
        return this.a.length;
    }

    @Override // defpackage.fhpo
    public String e() {
        return this.b.name();
    }

    @Override // defpackage.fhpn
    public String f() {
        return null;
    }

    @Override // defpackage.fhpo
    public String g() {
        return fhpi.d;
    }

    @Override // defpackage.fhpn
    public void h(OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.a);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = byteArrayInputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public Reader i() {
        return new InputStreamReader(new ByteArrayInputStream(this.a), this.b);
    }

    public fhpr(String str, String str2, Charset charset) {
        super(str2);
        if (str == null) {
            throw new IllegalArgumentException("Text may not be null");
        }
        charset = charset == null ? Charset.forName("US-ASCII") : charset;
        this.a = str.getBytes(charset.name());
        this.b = charset;
    }

    public fhpr(String str, Charset charset) {
        this(str, "text/plain", charset);
    }
}
