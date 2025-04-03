package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes9.dex */
abstract class J2 extends AbstractC0138q2 {
    protected final Comparator b;
    protected boolean c;

    J2(InterfaceC0157u2 interfaceC0157u2, Comparator comparator) {
        super(interfaceC0157u2);
        this.b = comparator;
    }

    @Override // j$.util.stream.AbstractC0138q2, j$.util.stream.InterfaceC0157u2
    public final boolean m() {
        this.c = true;
        return false;
    }
}
