package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dewp {
    int a = 0;
    int b = 0;
    final int[] c;
    final byte[] d;

    public dewp(int[] iArr, byte[] bArr) {
        this.c = iArr;
        this.d = bArr;
    }

    public final void a(int i) {
        if (i < this.a) {
            this.a = 0;
            this.b = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 >= i) {
                return;
            }
            this.b += this.c[i2];
            this.a = i2 + 1;
        }
    }
}
