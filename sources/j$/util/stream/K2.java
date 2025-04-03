package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes9.dex */
final class K2 extends G2 {
    private Y2 c;

    @Override // j$.util.stream.InterfaceC0142r2, j$.util.stream.InterfaceC0157u2
    public final void accept(double d) {
        this.c.accept(d);
    }

    @Override // j$.util.stream.AbstractC0123n2, j$.util.stream.InterfaceC0157u2
    public final void j() {
        double[] dArr = (double[]) this.c.c();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC0157u2 interfaceC0157u2 = this.a;
        interfaceC0157u2.k(length);
        int i = 0;
        if (this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                double d = dArr[i];
                if (interfaceC0157u2.m()) {
                    break;
                }
                interfaceC0157u2.accept(d);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                interfaceC0157u2.accept(dArr[i]);
                i++;
            }
        }
        interfaceC0157u2.j();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.Y2, j$.util.stream.e3] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.e3] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.e3] */
    @Override // j$.util.stream.AbstractC0123n2, j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = j > 0 ? new Y2((int) j) : new AbstractC0079e3();
    }
}
