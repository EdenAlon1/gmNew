package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
abstract class AbstractC0166w1 extends CountedCompleter implements InterfaceC0157u2 {
    protected final Spliterator a;
    protected final AbstractC0060b b;
    protected final long c;
    protected long d;
    protected long e;
    protected int f;
    protected int g;

    AbstractC0166w1(Spliterator spliterator, AbstractC0060b abstractC0060b, int i) {
        this.a = spliterator;
        this.b = abstractC0060b;
        this.c = AbstractC0075e.g(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    abstract AbstractC0166w1 a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(double d) {
        AbstractC0175y0.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        AbstractC0166w1 abstractC0166w1 = this;
        while (spliterator.estimateSize() > abstractC0166w1.c && (trySplit = spliterator.trySplit()) != null) {
            abstractC0166w1.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            AbstractC0166w1 abstractC0166w12 = abstractC0166w1;
            abstractC0166w12.a(trySplit, abstractC0166w1.d, estimateSize).fork();
            abstractC0166w1 = abstractC0166w12.a(spliterator, abstractC0166w12.d + estimateSize, abstractC0166w12.e - estimateSize);
        }
        AbstractC0166w1 abstractC0166w13 = abstractC0166w1;
        abstractC0166w13.b.Q(spliterator, abstractC0166w13);
        abstractC0166w13.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ boolean m() {
        return false;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC0175y0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC0175y0.l();
        throw null;
    }

    AbstractC0166w1(AbstractC0166w1 abstractC0166w1, Spliterator spliterator, long j, long j2, int i) {
        super(abstractC0166w1);
        this.a = spliterator;
        this.b = abstractC0166w1.b;
        this.c = abstractC0166w1.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }
}
