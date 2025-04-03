package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhvz extends fhvw {
    private final fhwc b;
    private final fhvu c;
    private final byte[] d;
    private final byte[] e;

    public fhvz(fhwc fhwcVar, fhvu fhvuVar, byte[] bArr, byte[] bArr2) {
        super(false);
        this.b = fhwcVar;
        this.c = fhvuVar;
        this.d = fics.c(bArr2);
        this.e = fics.c(bArr);
    }

    public static fhvz a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof fhvz) {
            return (fhvz) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            fhwc a = fhwc.a(dataInputStream2.readInt());
            fhvu a2 = fhvu.a(dataInputStream2.readInt());
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[a.v];
            dataInputStream2.readFully(bArr2);
            return new fhvz(a, a2, bArr2, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return a(fidk.a((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse ".concat(String.valueOf(String.valueOf(obj))));
        }
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                fhvz a3 = a(dataInputStream);
                dataInputStream.close();
                return a3;
            } catch (Throwable th) {
                th = th;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dataInputStream = null;
        }
    }

    final byte[] b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        fhvo.d(this.b.u, byteArrayOutputStream);
        fhvo.d(this.c.q, byteArrayOutputStream);
        fhvo.b(this.d, byteArrayOutputStream);
        fhvo.b(this.e, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fhvz fhvzVar = (fhvz) obj;
        if (this.b.equals(fhvzVar.b) && this.c.equals(fhvzVar.c) && Arrays.equals(this.d, fhvzVar.d)) {
            return Arrays.equals(this.e, fhvzVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + fics.a(this.d)) * 31) + fics.a(this.e);
    }

    @Override // defpackage.fhvw, defpackage.ficu
    public final byte[] s() {
        return b();
    }
}
