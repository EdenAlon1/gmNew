package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhvy extends fhvw {
    private static fhvx c;
    private static fhvx[] d;
    public fhvz b;
    private final byte[] e;
    private final fhwc f;
    private final fhvu g;
    private final int h;
    private final byte[] i;
    private final Map j;
    private final int k;
    private final fhqa l;
    private final int m;

    static {
        fhvx fhvxVar = new fhvx(1);
        c = fhvxVar;
        fhvx[] fhvxVarArr = new fhvx[129];
        d = fhvxVarArr;
        fhvxVarArr[1] = fhvxVar;
        int i = 2;
        while (true) {
            fhvx[] fhvxVarArr2 = d;
            int length = fhvxVarArr2.length;
            if (i >= 129) {
                return;
            }
            fhvxVarArr2[i] = new fhvx(i);
            i++;
        }
    }

    public fhvy(fhwc fhwcVar, fhvu fhvuVar, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.f = fhwcVar;
        this.g = fhvuVar;
        this.m = i;
        this.e = fics.c(bArr);
        this.h = i2;
        this.i = fics.c(bArr2);
        this.k = 1 << (fhwcVar.w + 1);
        this.j = new WeakHashMap();
        this.l = fhvq.a(fhwcVar.x, fhwcVar.v);
    }

    public static fhvy a(Object obj) {
        Throwable th;
        DataInputStream dataInputStream;
        if (obj instanceof fhvy) {
            return (fhvy) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() != 0) {
                throw new IllegalStateException("expected version 0 lms private key");
            }
            fhwc a = fhwc.a(dataInputStream2.readInt());
            fhvu a2 = fhvu.a(dataInputStream2.readInt());
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            int readInt = dataInputStream2.readInt();
            int readInt2 = dataInputStream2.readInt();
            int readInt3 = dataInputStream2.readInt();
            if (readInt3 < 0) {
                throw new IllegalStateException("secret length less than zero");
            }
            if (readInt3 <= dataInputStream2.available()) {
                byte[] bArr2 = new byte[readInt3];
                dataInputStream2.readFully(bArr2);
                return new fhvy(a, a2, readInt, bArr, readInt2, bArr2);
            }
            throw new IOException("secret length exceeded " + dataInputStream2.available());
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
                fhvy a3 = a(dataInputStream);
                dataInputStream.close();
                return a3;
            } catch (Throwable th2) {
                th = th2;
                if (dataInputStream == null) {
                    throw th;
                }
                dataInputStream.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            dataInputStream = null;
        }
    }

    private final byte[] e(int i) {
        int i2 = 1 << this.f.w;
        if (i < i2) {
            int i3 = i + i;
            byte[] c2 = c(i3);
            byte[] c3 = c(i3 + 1);
            fhwd.a(d(), this.l);
            fhwd.c(i, this.l);
            fhwd.b((short) -31869, this.l);
            fhwd.a(c2, this.l);
            fhwd.a(c3, this.l);
            fhqa fhqaVar = this.l;
            byte[] bArr = new byte[fhqaVar.b()];
            fhqaVar.a(bArr, 0);
            return bArr;
        }
        fhwd.a(d(), this.l);
        fhwd.c(i, this.l);
        fhwd.b((short) -32126, this.l);
        fhvu fhvuVar = this.g;
        byte[] d2 = d();
        byte[] c4 = fics.c(this.i);
        fhqa b = fhvq.b(fhvuVar);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        fhvo.b(d2, byteArrayOutputStream);
        int i4 = i - i2;
        fhvo.d(i4, byteArrayOutputStream);
        byteArrayOutputStream.write(-128);
        byteArrayOutputStream.write(-128);
        char c5 = 22;
        fhvo.c(22, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        b.e(byteArray, 0, byteArray.length);
        fhqa b2 = fhvq.b(fhvuVar);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        fhvo.b(d2, byteArrayOutputStream2);
        fhvo.d(i4, byteArrayOutputStream2);
        fhvo.c(b2.b() + 23, byteArrayOutputStream2);
        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
        fhqa b3 = fhvq.b(fhvuVar);
        int i5 = 1 << fhvuVar.s;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = fhvuVar.t;
            if (i6 >= i8) {
                byte[] bArr2 = new byte[b.b()];
                b.a(bArr2, 0);
                fhwd.a(bArr2, this.l);
                fhqa fhqaVar2 = this.l;
                byte[] bArr3 = new byte[fhqaVar2.b()];
                fhqaVar2.a(bArr3, 0);
                return bArr3;
            }
            int i9 = i8 - 1;
            char c6 = c5;
            if (byteArray2.length - 23 < b3.b()) {
                throw new IllegalArgumentException("target length is less than digest size.");
            }
            b3.e(d2, 0, d2.length);
            b3.d((byte) (i4 >> 24));
            b3.d((byte) (i4 >>> 16));
            b3.d((byte) (i4 >>> 8));
            b3.d((byte) i4);
            b3.d((byte) (i7 >>> 8));
            b3.d((byte) i7);
            b3.d((byte) -1);
            b3.e(c4, 0, c4.length);
            b3.a(byteArray2, 23);
            if (i6 < i9) {
                i7++;
            }
            short s = (short) i6;
            byteArray2[20] = (byte) (s >>> 8);
            byteArray2[21] = (byte) s;
            for (int i10 = 0; i10 < i5 - 1; i10++) {
                byteArray2[c6] = (byte) i10;
                b2.e(byteArray2, 0, byteArray2.length);
                b2.a(byteArray2, 23);
            }
            b.e(byteArray2, 23, fhvuVar.r);
            i6++;
            c5 = c6;
        }
    }

    private final byte[] f(fhvx fhvxVar) {
        synchronized (this.j) {
            byte[] bArr = (byte[]) this.j.get(fhvxVar);
            if (bArr != null) {
                return bArr;
            }
            byte[] e = e(fhvxVar.a);
            this.j.put(fhvxVar, e);
            return e;
        }
    }

    public final fhvz b() {
        fhvz fhvzVar;
        synchronized (this) {
            if (this.b == null) {
                this.b = new fhvz(this.f, this.g, f(c), this.e);
            }
            fhvzVar = this.b;
        }
        return fhvzVar;
    }

    final byte[] c(int i) {
        if (i >= this.k) {
            return e(i);
        }
        fhvx[] fhvxVarArr = d;
        int length = fhvxVarArr.length;
        return f(i < 129 ? fhvxVarArr[i] : new fhvx(i));
    }

    public final byte[] d() {
        return fics.c(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fhvy fhvyVar = (fhvy) obj;
        if (this.m != fhvyVar.m || this.h != fhvyVar.h || !Arrays.equals(this.e, fhvyVar.e)) {
            return false;
        }
        fhwc fhwcVar = this.f;
        if (fhwcVar == null ? fhvyVar.f != null : !fhwcVar.equals(fhvyVar.f)) {
            return false;
        }
        fhvu fhvuVar = this.g;
        if (fhvuVar == null ? fhvyVar.g == null : fhvuVar.equals(fhvyVar.g)) {
            return Arrays.equals(this.i, fhvyVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int a = (this.m * 31) + fics.a(this.e);
        fhwc fhwcVar = this.f;
        int hashCode = ((a * 31) + (fhwcVar != null ? fhwcVar.hashCode() : 0)) * 31;
        fhvu fhvuVar = this.g;
        return ((((hashCode + (fhvuVar != null ? fhvuVar.hashCode() : 0)) * 31) + this.h) * 31) + fics.a(this.i);
    }

    @Override // defpackage.fhvw, defpackage.ficu
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        fhvo.d(0, byteArrayOutputStream);
        fhvo.d(this.f.u, byteArrayOutputStream);
        fhvo.d(this.g.q, byteArrayOutputStream);
        fhvo.b(this.e, byteArrayOutputStream);
        fhvo.d(this.m, byteArrayOutputStream);
        fhvo.d(this.h, byteArrayOutputStream);
        fhvo.d(this.i.length, byteArrayOutputStream);
        fhvo.b(this.i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
