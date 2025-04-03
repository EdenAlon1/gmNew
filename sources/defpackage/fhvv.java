package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhvv implements ficu {
    private final fhvu a;
    private final byte[] b;
    private final byte[] c;

    public fhvv(fhvu fhvuVar, byte[] bArr, byte[] bArr2) {
        this.a = fhvuVar;
        this.b = bArr;
        this.c = bArr2;
    }

    public static fhvv a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof fhvv) {
            return (fhvv) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            fhvu a = fhvu.a(dataInputStream2.readInt());
            byte[] bArr = new byte[a.r];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[a.t * a.r];
            dataInputStream2.readFully(bArr2);
            return new fhvv(a, bArr, bArr2);
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
                fhvv a2 = a(dataInputStream);
                dataInputStream.close();
                return a2;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fhvv fhvvVar = (fhvv) obj;
        fhvu fhvuVar = this.a;
        if (fhvuVar == null ? fhvvVar.a != null : !fhvuVar.equals(fhvvVar.a)) {
            return false;
        }
        if (Arrays.equals(this.b, fhvvVar.b)) {
            return Arrays.equals(this.c, fhvvVar.c);
        }
        return false;
    }

    public final int hashCode() {
        fhvu fhvuVar = this.a;
        return ((((fhvuVar != null ? fhvuVar.hashCode() : 0) * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }

    @Override // defpackage.ficu
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        fhvo.d(this.a.q, byteArrayOutputStream);
        fhvo.b(this.b, byteArrayOutputStream);
        fhvo.b(this.c, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
