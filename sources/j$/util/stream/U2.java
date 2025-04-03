package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes9.dex */
final class U2 extends I2 {
    private long[] c;
    private int d;

    @Override // j$.util.stream.InterfaceC0152t2, j$.util.stream.InterfaceC0157u2
    public final void accept(long j) {
        long[] jArr = this.c;
        int i = this.d;
        this.d = i + 1;
        jArr[i] = j;
    }

    @Override // j$.util.stream.AbstractC0133p2, j$.util.stream.InterfaceC0157u2
    public final void j() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        InterfaceC0157u2 interfaceC0157u2 = this.a;
        interfaceC0157u2.k(j);
        if (this.b) {
            while (i < this.d && !interfaceC0157u2.m()) {
                interfaceC0157u2.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d) {
                interfaceC0157u2.accept(this.c[i]);
                i++;
            }
        }
        interfaceC0157u2.j();
        this.c = null;
    }

    @Override // j$.util.stream.AbstractC0133p2, j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new long[(int) j];
    }
}
