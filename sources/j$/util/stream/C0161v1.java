package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.v1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0161v1 extends AbstractC0166w1 {
    private final Object[] h;

    C0161v1(Spliterator spliterator, AbstractC0060b abstractC0060b, Object[] objArr) {
        super(spliterator, abstractC0060b, objArr.length);
        this.h = objArr;
    }

    @Override // j$.util.stream.AbstractC0166w1
    final AbstractC0166w1 a(Spliterator spliterator, long j, long j2) {
        return new C0161v1(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }

    C0161v1(C0161v1 c0161v1, Spliterator spliterator, long j, long j2) {
        super(c0161v1, spliterator, j, j2, c0161v1.h.length);
        this.h = c0161v1.h;
    }
}
