package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0075e extends CountedCompleter {
    private static final int g;
    protected final AbstractC0060b a;
    protected Spliterator b;
    protected long c;
    protected AbstractC0075e d;
    protected AbstractC0075e e;
    private Object f;

    static {
        int commonPoolParallelism;
        commonPoolParallelism = ForkJoinPool.getCommonPoolParallelism();
        g = commonPoolParallelism << 2;
    }

    protected AbstractC0075e(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        super(null);
        this.a = abstractC0060b;
        this.b = spliterator;
        this.c = 0L;
    }

    public static int b() {
        return g;
    }

    public static long g(long j) {
        long j2 = j / g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    protected abstract Object a();

    protected Object c() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long estimateSize = spliterator.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = g(estimateSize);
            this.c = j;
        }
        boolean z = false;
        AbstractC0075e abstractC0075e = this;
        while (estimateSize > j && (trySplit = spliterator.trySplit()) != null) {
            AbstractC0075e e = abstractC0075e.e(trySplit);
            abstractC0075e.d = e;
            AbstractC0075e e2 = abstractC0075e.e(spliterator);
            abstractC0075e.e = e2;
            abstractC0075e.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                abstractC0075e = e;
                e = e2;
            } else {
                abstractC0075e = e2;
            }
            z = !z;
            e.fork();
            estimateSize = spliterator.estimateSize();
        }
        abstractC0075e.f(abstractC0075e.a());
        abstractC0075e.tryComplete();
    }

    protected final boolean d() {
        CountedCompleter completer;
        completer = getCompleter();
        return ((AbstractC0075e) completer) == null;
    }

    protected abstract AbstractC0075e e(Spliterator spliterator);

    protected void f(Object obj) {
        this.f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    protected AbstractC0075e(AbstractC0075e abstractC0075e, Spliterator spliterator) {
        super(abstractC0075e);
        this.b = spliterator;
        this.a = abstractC0075e.a;
        this.c = abstractC0075e.c;
    }
}
