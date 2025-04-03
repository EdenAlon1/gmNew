package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhzy extends fhzt implements ficu {
    public final fhzu c;
    private final int d;
    private final byte[] e;
    private final byte[] f;

    public fhzy(fhzx fhzxVar) {
        super(false, fhzxVar.a.b());
        fhzu fhzuVar = fhzxVar.a;
        this.c = fhzuVar;
        if (fhzuVar == null) {
            throw new NullPointerException("params == null");
        }
        int a = fhzuVar.a();
        byte[] bArr = fhzxVar.d;
        if (bArr != null) {
            int i = a + a;
            int length = bArr.length;
            if (length == i) {
                this.d = 0;
                this.e = fiai.h(bArr, 0, a);
                this.f = fiai.h(bArr, a, a);
                return;
            } else {
                int i2 = a + 4;
                if (length != i2 + a) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.d = ficw.a(bArr, 0);
                this.e = fiai.h(bArr, 4, a);
                this.f = fiai.h(bArr, i2, a);
                return;
            }
        }
        fiab fiabVar = fhzuVar.b;
        if (fiabVar != null) {
            this.d = ((fhzc) fiabVar).b;
        } else {
            this.d = 0;
        }
        byte[] bArr2 = fhzxVar.b;
        if (bArr2 == null) {
            this.e = new byte[a];
        } else {
            if (bArr2.length != a) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.e = bArr2;
        }
        byte[] bArr3 = fhzxVar.c;
        if (bArr3 == null) {
            this.f = new byte[a];
        } else {
            if (bArr3.length != a) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f = bArr3;
        }
    }

    public final byte[] a() {
        return fiai.g(this.f);
    }

    public final byte[] b() {
        return fiai.g(this.e);
    }

    public final byte[] c() {
        byte[] bArr;
        int i = this.d;
        int a = this.c.a();
        int i2 = 0;
        if (i != 0) {
            bArr = new byte[a + 4 + a];
            ficw.e(i, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[a + a];
        }
        fiai.d(bArr, this.e, i2);
        fiai.d(bArr, this.f, i2 + a);
        return bArr;
    }

    @Override // defpackage.ficu
    public final byte[] s() {
        return c();
    }
}
