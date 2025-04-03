package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0185u extends C0051o implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new C0051o(this.b);
    }

    @Override // j$.util.C0051o, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new C0185u(this.b.subList(i, i2));
    }
}
