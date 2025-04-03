package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes9.dex */
final class M2 extends I2 {
    private C0069c3 c;

    @Override // j$.util.stream.InterfaceC0152t2, j$.util.stream.InterfaceC0157u2
    public final void accept(long j) {
        this.c.accept(j);
    }

    @Override // j$.util.stream.AbstractC0133p2, j$.util.stream.InterfaceC0157u2
    public final void j() {
        long[] jArr = (long[]) this.c.c();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC0157u2 interfaceC0157u2 = this.a;
        interfaceC0157u2.k(length);
        int i = 0;
        if (this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                if (interfaceC0157u2.m()) {
                    break;
                }
                interfaceC0157u2.accept(j);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                interfaceC0157u2.accept(jArr[i]);
                i++;
            }
        }
        interfaceC0157u2.j();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.c3, j$.util.stream.e3] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.e3] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.e3] */
    @Override // j$.util.stream.AbstractC0133p2, j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = j > 0 ? new C0069c3((int) j) : new AbstractC0079e3();
    }
}
