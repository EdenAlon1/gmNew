package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;

/* renamed from: j$.util.stream.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0085g implements BaseStream {
    public final /* synthetic */ java.util.stream.BaseStream a;

    private /* synthetic */ C0085g(java.util.stream.BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ BaseStream i(java.util.stream.BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C0090h ? ((C0090h) baseStream).a : j$.util.Y.D(baseStream) ? D.i(AbstractC0080f.o(baseStream)) : AbstractC0080f.w(baseStream) ? IntStream.VivifiedWrapper.convert(AbstractC0080f.q(baseStream)) : AbstractC0080f.B(baseStream) ? C0136q0.i(AbstractC0080f.s(baseStream)) : AbstractC0080f.D(baseStream) ? C0104j3.i(AbstractC0080f.t(baseStream)) : new C0085g(baseStream);
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.BaseStream baseStream = this.a;
        if (obj instanceof C0085g) {
            obj = ((C0085g) obj).a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        boolean isParallel;
        isParallel = this.a.isParallel();
        return isParallel;
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    /* renamed from: iterator */
    public final /* synthetic */ Iterator iterator2() {
        Iterator it;
        it = this.a.iterator();
        return it;
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        java.util.stream.BaseStream onClose;
        onClose = this.a.onClose(runnable);
        return i(onClose);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* synthetic */ BaseStream parallel() {
        java.util.stream.BaseStream parallel;
        parallel = this.a.parallel();
        return i(parallel);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* synthetic */ BaseStream sequential() {
        java.util.stream.BaseStream sequential;
        sequential = this.a.sequential();
        return i(sequential);
    }

    @Override // j$.util.stream.BaseStream
    /* renamed from: spliterator */
    public final /* synthetic */ Spliterator spliterator2() {
        java.util.Spliterator spliterator;
        spliterator = this.a.spliterator();
        return j$.util.e0.a(spliterator);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        java.util.stream.BaseStream unordered;
        unordered = this.a.unordered();
        return i(unordered);
    }
}
