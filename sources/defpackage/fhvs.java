package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhvs extends fhvw {
    public final int b;
    public final fhvz c;

    public fhvs(int i, fhvz fhvzVar) {
        super(false);
        if (fhvzVar == null) {
            throw new NullPointerException("lmsPublicKey");
        }
        this.b = i;
        this.c = fhvzVar;
    }

    public static fhvs a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof fhvs) {
            return (fhvs) obj;
        }
        if (obj instanceof DataInputStream) {
            return new fhvs(((DataInputStream) obj).readInt(), fhvz.a(obj));
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
                fhvs a = a(dataInputStream);
                dataInputStream.close();
                return a;
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
        fhvs fhvsVar = (fhvs) obj;
        if (this.b != fhvsVar.b) {
            return false;
        }
        return this.c.equals(fhvsVar.c);
    }

    public final int hashCode() {
        return (this.b * 31) + this.c.hashCode();
    }

    @Override // defpackage.fhvw, defpackage.ficu
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        fhvo.d(this.b, byteArrayOutputStream);
        fhvo.b(this.c.b(), byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
