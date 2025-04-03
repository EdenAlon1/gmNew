package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.x0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0170x0 extends AbstractC0065c {
    private final C0165w0 j;

    C0170x0(C0165w0 c0165w0, AbstractC0060b abstractC0060b, Spliterator spliterator) {
        super(abstractC0060b, spliterator);
        this.j = c0165w0;
    }

    @Override // j$.util.stream.AbstractC0075e
    protected final Object a() {
        boolean z;
        AbstractC0060b abstractC0060b = this.a;
        AbstractC0155u0 abstractC0155u0 = (AbstractC0155u0) this.j.b.get();
        abstractC0060b.Q(this.b, abstractC0155u0);
        boolean z2 = abstractC0155u0.b;
        z = this.j.a.b;
        if (z2 == z) {
            j$.util.concurrent.m.a(this.h, null, Boolean.valueOf(z2));
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0075e
    protected final AbstractC0075e e(Spliterator spliterator) {
        return new C0170x0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0065c
    protected final Object j() {
        boolean z;
        z = this.j.a.b;
        return Boolean.valueOf(!z);
    }

    C0170x0(C0170x0 c0170x0, Spliterator spliterator) {
        super(c0170x0, spliterator);
        this.j = c0170x0.j;
    }
}
