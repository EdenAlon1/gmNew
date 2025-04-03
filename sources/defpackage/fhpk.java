package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhpk implements HttpEntity {
    private static final char[] a = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private final fhpg b;
    private final Header c;
    private long d;
    private volatile boolean e;

    public fhpk() {
        this(fhph.STRICT, null, null);
    }

    protected String a() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int nextInt = random.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            char[] cArr = a;
            sb.append(cArr[random.nextInt(cArr.length)]);
        }
        return sb.toString();
    }

    protected String b(String str, Charset charset) {
        StringBuilder sb = new StringBuilder("multipart/form-data; boundary=");
        sb.append(str);
        if (charset != null) {
            sb.append("; charset=");
            sb.append(charset.name());
        }
        return sb.toString();
    }

    public void c(fhpe fhpeVar) {
        this.b.g(fhpeVar);
        this.e = true;
    }

    @Override // org.apache.http.HttpEntity
    public void consumeContent() {
        if (isStreaming()) {
            throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
        }
    }

    public void d(String str, fhpn fhpnVar) {
        c(new fhpe(str, fhpnVar));
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        throw new UnsupportedOperationException("Multipart form entity does not implement #getContent()");
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentEncoding() {
        return null;
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        if (this.e) {
            this.d = this.b.a();
            this.e = false;
        }
        return this.d;
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentType() {
        return this.c;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isChunked() {
        return !isRepeatable();
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        Iterator<fhpe> it = this.b.e().iterator();
        while (it.hasNext()) {
            if (it.next().c().a() < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return !isRepeatable();
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        this.b.h(outputStream);
    }

    public fhpk(fhph fhphVar) {
        this(fhphVar, null, null);
    }

    public fhpk(fhph fhphVar, String str, Charset charset) {
        str = str == null ? a() : str;
        this.b = new fhpg("form-data", charset, str, fhphVar == null ? fhph.STRICT : fhphVar);
        this.c = new BasicHeader(fhpi.a, b(str, charset));
        this.e = true;
    }
}
