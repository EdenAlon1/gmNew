package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.t1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0151t1 extends AbstractC0166w1 implements InterfaceC0147s2 {
    private final int[] h;

    C0151t1(Spliterator spliterator, AbstractC0060b abstractC0060b, int[] iArr) {
        super(spliterator, abstractC0060b, iArr.length);
        this.h = iArr;
    }

    @Override // j$.util.stream.AbstractC0166w1
    final AbstractC0166w1 a(Spliterator spliterator, long j, long j2) {
        return new C0151t1(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0147s2
    public final /* synthetic */ void l(Integer num) {
        AbstractC0175y0.g(this, num);
    }

    @Override // j$.util.stream.AbstractC0166w1, j$.util.stream.InterfaceC0157u2, java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }

    C0151t1(C0151t1 c0151t1, Spliterator spliterator, long j, long j2) {
        super(c0151t1, spliterator, j, j2, c0151t1.h.length);
        this.h = c0151t1.h;
    }
}
