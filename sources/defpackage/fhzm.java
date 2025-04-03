package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhzm {
    public final fhzo a;
    public final fhzh b;
    public byte[] c;
    private byte[] d;

    public fhzm(fhzo fhzoVar) {
        this.a = fhzoVar;
        int i = fhzoVar.a;
        this.b = new fhzh(fhzoVar.c, i);
        this.d = new byte[i];
        this.c = new byte[i];
    }

    private final byte[] d(byte[] bArr, int i, fhzl fhzlVar) {
        int length = bArr.length;
        int i2 = this.a.a;
        if (length != i2) {
            throw new IllegalArgumentException(a.f(i2, "startHash needs to be ", "bytes"));
        }
        fhzlVar.a();
        if (i > 15) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (i == 0) {
            return bArr;
        }
        int i3 = i - 1;
        byte[] d = d(bArr, i3, fhzlVar);
        fhzk fhzkVar = new fhzk();
        fhzkVar.e = fhzlVar.d;
        fhzkVar.f = fhzlVar.e;
        fhzkVar.a = fhzlVar.a;
        fhzkVar.b = fhzlVar.b;
        fhzkVar.c = i3;
        fhzkVar.g = 0;
        fhzl fhzlVar2 = new fhzl(fhzkVar);
        byte[] a = this.b.a(this.c, fhzlVar2.a());
        fhzk fhzkVar2 = new fhzk();
        fhzkVar2.e = fhzlVar2.d;
        fhzkVar2.f = fhzlVar2.e;
        fhzkVar2.a = fhzlVar2.a;
        fhzkVar2.b = fhzlVar2.b;
        fhzkVar2.c = fhzlVar2.c;
        fhzkVar2.g = 1;
        byte[] a2 = this.b.a(this.c, new fhzl(fhzkVar2).a());
        byte[] bArr2 = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = (byte) (d[i4] ^ a2[i4]);
        }
        fhzh fhzhVar = this.b;
        int length2 = a.length;
        int i5 = fhzhVar.a;
        if (length2 != i5) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (i2 == i5) {
            return fhzhVar.b(0, a, bArr2);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    final fhzp a(fhzl fhzlVar) {
        byte[][] bArr = new byte[this.a.b][];
        int i = 0;
        while (true) {
            fhzo fhzoVar = this.a;
            int i2 = fhzoVar.b;
            if (i >= i2) {
                return new fhzp(fhzoVar, bArr);
            }
            fhzk fhzkVar = new fhzk();
            fhzkVar.e = fhzlVar.d;
            fhzkVar.f = fhzlVar.e;
            fhzkVar.a = fhzlVar.a;
            fhzkVar.b = i;
            fhzkVar.c = fhzlVar.c;
            fhzkVar.g = fhzlVar.f;
            fhzlVar = new fhzl(fhzkVar);
            if (i >= i2) {
                throw new IllegalArgumentException("index out of bounds");
            }
            bArr[i] = d(this.b.a(this.d, fiai.j(i, 32)), 15, fhzlVar);
            i++;
        }
    }

    final void b(byte[] bArr, byte[] bArr2) {
        fhzo fhzoVar = this.a;
        int length = bArr.length;
        int i = fhzoVar.a;
        if (length != i) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (bArr2.length != i) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.d = bArr;
        this.c = bArr2;
    }

    protected final byte[] c(byte[] bArr, fhzl fhzlVar) {
        fhzk fhzkVar = new fhzk();
        fhzkVar.e = fhzlVar.d;
        fhzkVar.f = fhzlVar.e;
        fhzkVar.a = fhzlVar.a;
        return this.b.a(bArr, new fhzl(fhzkVar).a());
    }
}
