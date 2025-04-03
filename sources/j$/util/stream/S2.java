package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes9.dex */
final class S2 extends G2 {
    private double[] c;
    private int d;

    @Override // j$.util.stream.InterfaceC0142r2, j$.util.stream.InterfaceC0157u2
    public final void accept(double d) {
        double[] dArr = this.c;
        int i = this.d;
        this.d = i + 1;
        dArr[i] = d;
    }

    @Override // j$.util.stream.AbstractC0123n2, j$.util.stream.InterfaceC0157u2
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

    @Override // j$.util.stream.AbstractC0123n2, j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new double[(int) j];
    }
}
