package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes9.dex */
final class L2 extends H2 {
    private C0059a3 c;

    @Override // j$.util.stream.InterfaceC0147s2, j$.util.stream.InterfaceC0157u2, java.util.function.IntConsumer
    public final void accept(int i) {
        this.c.accept(i);
    }

    @Override // j$.util.stream.AbstractC0128o2, j$.util.stream.InterfaceC0157u2
    public final void j() {
        int[] iArr = (int[]) this.c.c();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC0157u2 interfaceC0157u2 = this.a;
        interfaceC0157u2.k(length);
        int i = 0;
        if (this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                int i2 = iArr[i];
                if (interfaceC0157u2.m()) {
                    break;
                }
                interfaceC0157u2.accept(i2);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                interfaceC0157u2.accept(iArr[i]);
                i++;
            }
        }
        interfaceC0157u2.j();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.a3, j$.util.stream.e3] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.e3] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.e3] */
    @Override // j$.util.stream.AbstractC0128o2, j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = j > 0 ? new C0059a3((int) j) : new AbstractC0079e3();
    }
}
