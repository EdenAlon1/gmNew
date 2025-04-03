package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.s1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0146s1 extends AbstractC0166w1 implements InterfaceC0142r2 {
    private final double[] h;

    C0146s1(Spliterator spliterator, AbstractC0060b abstractC0060b, double[] dArr) {
        super(spliterator, abstractC0060b, dArr.length);
        this.h = dArr;
    }

    @Override // j$.util.stream.AbstractC0166w1
    final AbstractC0166w1 a(Spliterator spliterator, long j, long j2) {
        return new C0146s1(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        o((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.nio.channels.c.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC0142r2
    public final /* synthetic */ void o(Double d) {
        AbstractC0175y0.e(this, d);
    }

    @Override // j$.util.stream.AbstractC0166w1, j$.util.stream.InterfaceC0157u2
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }

    C0146s1(C0146s1 c0146s1, Spliterator spliterator, long j, long j2) {
        super(c0146s1, spliterator, j, j2, c0146s1.h.length);
        this.h = c0146s1.h;
    }
}
