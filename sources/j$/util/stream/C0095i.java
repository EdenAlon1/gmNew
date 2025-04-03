package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0095i implements Collector {
    public final /* synthetic */ java.util.stream.Collector a;

    private /* synthetic */ C0095i(java.util.stream.Collector collector) {
        this.a = collector;
    }

    public static /* synthetic */ Collector a(java.util.stream.Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C0100j ? ((C0100j) collector).a : new C0095i(collector);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        BiConsumer accumulator;
        accumulator = this.a.accumulator();
        return accumulator;
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        Set characteristics;
        characteristics = this.a.characteristics();
        return AbstractC0109k3.a(characteristics);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        BinaryOperator combiner;
        combiner = this.a.combiner();
        return combiner;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Collector collector = this.a;
        if (obj instanceof C0095i) {
            obj = ((C0095i) obj).a;
        }
        return collector.equals(obj);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        Function finisher;
        finisher = this.a.finisher();
        return finisher;
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        Supplier supplier;
        supplier = this.a.supplier();
        return supplier;
    }
}
