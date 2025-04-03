package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhpq extends fhpl {
    private final InputStream a;
    private final String b;

    public fhpq(InputStream inputStream, String str) {
        this(inputStream, "application/octet-stream", str);
    }

    @Override // defpackage.fhpo
    public long a() {
        return -1L;
    }

    @Override // defpackage.fhpo
    public String e() {
        return null;
    }

    @Override // defpackage.fhpn
    public String f() {
        return this.b;
    }

    @Override // defpackage.fhpo
    public String g() {
        return fhpi.e;
    }

    @Override // defpackage.fhpn
    public void h(OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = this.a.read(bArr);
                if (read == -1) {
                    outputStream.flush();
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        } finally {
            this.a.close();
        }
    }

    public InputStream i() {
        return this.a;
    }

    public fhpq(InputStream inputStream, String str, String str2) {
        super(str);
        if (inputStream == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        }
        this.a = inputStream;
        this.b = str2;
    }
}
