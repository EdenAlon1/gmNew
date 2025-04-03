package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.LongConsumer$CC;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0156u1 extends AbstractC0166w1 implements InterfaceC0152t2 {
    private final long[] h;

    C0156u1(Spliterator spliterator, AbstractC0060b abstractC0060b, long[] jArr) {
        super(spliterator, abstractC0060b, jArr.length);
        this.h = jArr;
    }

    @Override // j$.util.stream.AbstractC0166w1
    final AbstractC0166w1 a(Spliterator spliterator, long j, long j2) {
        return new C0156u1(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        i((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0152t2
    public final /* synthetic */ void i(Long l) {
        AbstractC0175y0.i(this, l);
    }

    @Override // j$.util.stream.AbstractC0166w1, j$.util.stream.InterfaceC0157u2
    public final void accept(long j) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        long[] jArr = this.h;
        this.f = i + 1;
        jArr[i] = j;
    }

    C0156u1(C0156u1 c0156u1, Spliterator spliterator, long j, long j2) {
        super(c0156u1, spliterator, j, j2, c0156u1.h.length);
        this.h = c0156u1.h;
    }
}
