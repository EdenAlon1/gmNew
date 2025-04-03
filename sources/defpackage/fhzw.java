package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhzw extends fhzt implements ficu {
    public final fhzu c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final byte[] g;
    private volatile long h;
    private volatile fhza i;

    public fhzw(fhzv fhzvVar) {
        super(true, fhzvVar.a.b());
        fhzu fhzuVar = fhzvVar.a;
        this.c = fhzuVar;
        int a = fhzuVar.a();
        this.h = fhzvVar.b;
        byte[] bArr = fhzvVar.d;
        if (bArr == null) {
            this.d = new byte[a];
        } else {
            if (bArr.length != a) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.d = bArr;
        }
        byte[] bArr2 = fhzvVar.e;
        if (bArr2 == null) {
            this.e = new byte[a];
        } else {
            if (bArr2.length != a) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.e = bArr2;
        }
        byte[] bArr3 = fhzvVar.f;
        if (bArr3 == null) {
            this.f = new byte[a];
        } else {
            if (bArr3.length != a) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f = bArr3;
        }
        byte[] bArr4 = fhzvVar.g;
        if (bArr4 == null) {
            this.g = new byte[a];
        } else {
            if (bArr4.length != a) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.g = bArr4;
        }
        fhza fhzaVar = fhzvVar.h;
        if (fhzaVar != null) {
            this.i = fhzaVar;
        } else {
            if (!fiai.f(fhzuVar.d, fhzvVar.b) || bArr3 == null || bArr == null) {
                this.i = new fhza(fhzvVar.c + 1);
            } else {
                this.i = new fhza(fhzuVar, fhzvVar.b, bArr3, bArr);
            }
        }
        long j = fhzvVar.c;
        if (j >= 0 && j != this.i.b) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public final byte[] a() {
        byte[] e;
        synchronized (this) {
            fhzu fhzuVar = this.c;
            int a = fhzuVar.a();
            int i = (fhzuVar.d + 7) / 8;
            int i2 = i + a;
            int i3 = i2 + a;
            int i4 = i3 + a;
            byte[] bArr = new byte[a + i4];
            fiai.d(bArr, fiai.j(this.h, i), 0);
            fiai.d(bArr, this.d, i);
            fiai.d(bArr, this.e, i2);
            fiai.d(bArr, this.f, i3);
            fiai.d(bArr, this.g, i4);
            try {
                e = fics.e(bArr, fiai.i(this.i));
            } catch (IOException e2) {
                throw new IllegalStateException("error serializing bds state: " + e2.getMessage(), e2);
            }
        }
        return e;
    }

    @Override // defpackage.ficu
    public final byte[] s() {
        byte[] a;
        synchronized (this) {
            a = a();
        }
        return a;
    }
}
