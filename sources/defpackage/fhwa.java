package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhwa implements ficu {
    private final int a;
    private final fhvv b;
    private final fhwc c;
    private final byte[][] d;

    public fhwa(int i, fhvv fhvvVar, fhwc fhwcVar, byte[][] bArr) {
        this.a = i;
        this.b = fhvvVar;
        this.c = fhwcVar;
        this.d = bArr;
    }

    public static fhwa a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof fhwa) {
            return (fhwa) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            int readInt = dataInputStream2.readInt();
            fhvv a = fhvv.a(obj);
            fhwc a2 = fhwc.a(dataInputStream2.readInt());
            int i = a2.w;
            byte[][] bArr = new byte[i][];
            for (int i2 = 0; i2 < i; i2++) {
                byte[] bArr2 = new byte[a2.v];
                bArr[i2] = bArr2;
                dataInputStream2.readFully(bArr2);
            }
            return new fhwa(readInt, a, a2, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return a(fidk.a((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse ".concat(String.valueOf(String.valueOf(obj))));
        }
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
        } catch (Throwable th) {
            th = th;
            dataInputStream = null;
        }
        try {
            fhwa a3 = a(dataInputStream);
            dataInputStream.close();
            return a3;
        } catch (Throwable th2) {
            th = th2;
            if (dataInputStream != null) {
                dataInputStream.close();
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fhwa fhwaVar = (fhwa) obj;
        if (this.a != fhwaVar.a) {
            return false;
        }
        fhvv fhvvVar = this.b;
        if (fhvvVar == null ? fhwaVar.b != null : !fhvvVar.equals(fhwaVar.b)) {
            return false;
        }
        fhwc fhwcVar = this.c;
        if (fhwcVar == null ? fhwaVar.c == null : fhwcVar.equals(fhwaVar.c)) {
            return Arrays.deepEquals(this.d, fhwaVar.d);
        }
        return false;
    }

    public final int hashCode() {
        fhvv fhvvVar = this.b;
        int hashCode = fhvvVar != null ? fhvvVar.hashCode() : 0;
        int i = this.a;
        fhwc fhwcVar = this.c;
        return (((((i * 31) + hashCode) * 31) + (fhwcVar != null ? fhwcVar.hashCode() : 0)) * 31) + Arrays.deepHashCode(this.d);
    }

    @Override // defpackage.ficu
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        fhvo.d(this.a, byteArrayOutputStream);
        fhvo.b(this.b.s(), byteArrayOutputStream);
        fhvo.d(this.c.u, byteArrayOutputStream);
        try {
            for (byte[] bArr : this.d) {
                byteArrayOutputStream.write(bArr);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
