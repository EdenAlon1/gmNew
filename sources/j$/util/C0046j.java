package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0046j extends C0044h implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private Object writeReplace() {
        return new C0044h(this.c);
    }

    @Override // j$.util.C0044h, java.util.List
    public final java.util.List subList(int i, int i2) {
        C0046j c0046j;
        synchronized (this.b) {
            c0046j = new C0046j(this.c.subList(i, i2), this.b);
        }
        return c0046j;
    }
}
