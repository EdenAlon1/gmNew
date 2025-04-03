package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiae extends fhzs implements ficu {
    public final fiac c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final byte[] g;
    private volatile fhyz h;

    public fiae(fiad fiadVar) {
        super(true, fiadVar.a.e);
        fiac fiacVar = fiadVar.a;
        this.c = fiacVar;
        int i = fiacVar.f;
        byte[] bArr = fiadVar.d;
        if (bArr == null) {
            this.d = new byte[i];
        } else {
            if (bArr.length != i) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.d = bArr;
        }
        byte[] bArr2 = fiadVar.e;
        if (bArr2 == null) {
            this.e = new byte[i];
        } else {
            if (bArr2.length != i) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.e = bArr2;
        }
        byte[] bArr3 = fiadVar.f;
        if (bArr3 == null) {
            this.f = new byte[i];
        } else {
            if (bArr3.length != i) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f = bArr3;
        }
        byte[] bArr4 = fiadVar.g;
        if (bArr4 == null) {
            this.g = new byte[i];
        } else {
            if (bArr4.length != i) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.g = bArr4;
        }
        fhyz fhyzVar = fiadVar.h;
        if (fhyzVar != null) {
            this.h = fhyzVar;
        } else {
            int i2 = fiadVar.b;
            int i3 = 1 << fiacVar.c;
            if (i2 >= i3 - 2 || bArr3 == null || bArr == null) {
                this.h = new fhyz(fiacVar, i3 - 1, i2);
            } else {
                this.h = new fhyz(fiacVar, bArr3, bArr, new fhzl(new fhzk()), i2);
            }
        }
        int i4 = fiadVar.c;
        if (i4 >= 0 && i4 != this.h.b) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public final byte[] a() {
        byte[] e;
        synchronized (this) {
            int i = this.c.f;
            int i2 = i + 4;
            int i3 = i2 + i;
            int i4 = i3 + i;
            byte[] bArr = new byte[i + i4];
            ficw.e(this.h.a, bArr, 0);
            fiai.d(bArr, this.d, 4);
            fiai.d(bArr, this.e, i2);
            fiai.d(bArr, this.f, i3);
            fiai.d(bArr, this.g, i4);
            try {
                e = fics.e(bArr, fiai.i(this.h));
            } catch (IOException e2) {
                throw new RuntimeException("error serializing bds state: " + e2.getMessage());
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
