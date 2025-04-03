package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhpm extends fhpl {
    private final byte[] a;
    private final String b;

    public fhpm(byte[] bArr, String str) {
        this(bArr, "application/octet-stream", str);
    }

    @Override // defpackage.fhpo
    public long a() {
        return this.a.length;
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
        outputStream.write(this.a);
    }

    public fhpm(byte[] bArr, String str, String str2) {
        super(str);
        if (bArr == null) {
            throw new IllegalArgumentException("byte[] may not be null");
        }
        this.a = bArr;
        this.b = str2;
    }
}
