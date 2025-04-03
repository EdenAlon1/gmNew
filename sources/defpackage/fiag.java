package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiag extends fhzs implements ficu {
    public final fiac c;
    public final byte[] d;
    public final byte[] e;
    private final int f;

    public fiag(fiaf fiafVar) {
        super(false, fiafVar.a.e);
        fiac fiacVar = fiafVar.a;
        this.c = fiacVar;
        if (fiacVar == null) {
            throw new NullPointerException("params == null");
        }
        int i = fiacVar.f;
        byte[] bArr = fiafVar.d;
        if (bArr != null) {
            int i2 = i + i;
            int length = bArr.length;
            if (length == i2) {
                this.f = 0;
                this.d = fiai.h(bArr, 0, i);
                this.e = fiai.h(bArr, i, i);
                return;
            } else {
                int i3 = i + 4;
                if (length != i3 + i) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.f = ficw.a(bArr, 0);
                this.d = fiai.h(bArr, 4, i);
                this.e = fiai.h(bArr, i3, i);
                return;
            }
        }
        fiab fiabVar = fiacVar.b;
        if (fiabVar != null) {
            this.f = ((fhzd) fiabVar).b;
        } else {
            this.f = 0;
        }
        byte[] bArr2 = fiafVar.b;
        if (bArr2 == null) {
            this.d = new byte[i];
        } else {
            if (bArr2.length != i) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.d = bArr2;
        }
        byte[] bArr3 = fiafVar.c;
        if (bArr3 == null) {
            this.e = new byte[i];
        } else {
            if (bArr3.length != i) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.e = bArr3;
        }
    }

    public final byte[] a() {
        byte[] bArr;
        int i = this.c.f;
        int i2 = this.f;
        int i3 = 0;
        if (i2 != 0) {
            bArr = new byte[i + 4 + i];
            ficw.e(i2, bArr, 0);
            i3 = 4;
        } else {
            bArr = new byte[i + i];
        }
        fiai.d(bArr, this.d, i3);
        fiai.d(bArr, this.e, i3 + i);
        return bArr;
    }

    @Override // defpackage.ficu
    public final byte[] s() {
        return a();
    }
}
