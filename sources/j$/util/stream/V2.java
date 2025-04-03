package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes9.dex */
final class V2 extends J2 {
    private Object[] d;
    private int e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.AbstractC0138q2, j$.util.stream.InterfaceC0157u2
    public final void j() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        InterfaceC0157u2 interfaceC0157u2 = this.a;
        interfaceC0157u2.k(j);
        if (this.c) {
            while (i < this.e && !interfaceC0157u2.m()) {
                interfaceC0157u2.accept((InterfaceC0157u2) this.d[i]);
                i++;
            }
        } else {
            while (i < this.e) {
                interfaceC0157u2.accept((InterfaceC0157u2) this.d[i]);
                i++;
            }
        }
        interfaceC0157u2.j();
        this.d = null;
    }

    @Override // j$.util.stream.AbstractC0138q2, j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j];
    }
}
