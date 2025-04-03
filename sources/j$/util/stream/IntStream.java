package j$.util.stream;

import j$.util.C0190z;
import j$.util.OptionalDouble;
import j$.util.OptionalInt;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
public interface IntStream extends BaseStream<Integer, IntStream> {

    /* renamed from: j$.util.stream.IntStream$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static IntStream range(int i, int i2) {
            if (i >= i2) {
                Spliterator.OfInt c = Spliterators.c();
                return new C0071d0(c, EnumC0124n3.v(c), false);
            }
            V3 v3 = new V3(i, i2, 0);
            return new C0071d0(v3, EnumC0124n3.v(v3), false);
        }
    }

    public final /* synthetic */ class VivifiedWrapper implements IntStream {
        public final /* synthetic */ java.util.stream.IntStream a;

        private /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.a = intStream;
        }

        public static /* synthetic */ IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof Wrapper ? IntStream.this : new VivifiedWrapper(intStream);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            boolean allMatch;
            allMatch = this.a.allMatch(intPredicate);
            return allMatch;
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            boolean anyMatch;
            anyMatch = this.a.anyMatch(intPredicate);
            return anyMatch;
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ DoubleStream asDoubleStream() {
            java.util.stream.DoubleStream asDoubleStream;
            asDoubleStream = this.a.asDoubleStream();
            return D.i(asDoubleStream);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ LongStream asLongStream() {
            java.util.stream.LongStream asLongStream;
            asLongStream = this.a.asLongStream();
            return C0136q0.i(asLongStream);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ OptionalDouble average() {
            java.util.OptionalDouble average;
            average = this.a.average();
            return j$.util.Q.i(average);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream boxed() {
            java.util.stream.Stream boxed;
            boxed = this.a.boxed();
            return C0104j3.i(boxed);
        }

        @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            this.a.close();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
            Object collect;
            collect = this.a.collect(supplier, objIntConsumer, biConsumer);
            return collect;
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ long count() {
            long count;
            count = this.a.count();
            return count;
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream distinct() {
            java.util.stream.IntStream distinct;
            distinct = this.a.distinct();
            return convert(distinct);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream dropWhile(IntPredicate intPredicate) {
            java.util.stream.IntStream dropWhile;
            dropWhile = this.a.dropWhile(intPredicate);
            return convert(dropWhile);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ DoubleStream e() {
            java.util.stream.DoubleStream mapToDouble;
            mapToDouble = this.a.mapToDouble(null);
            return D.i(mapToDouble);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.stream.IntStream intStream = this.a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).a;
            }
            return intStream.equals(obj);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream filter(IntPredicate intPredicate) {
            java.util.stream.IntStream filter;
            filter = this.a.filter(intPredicate);
            return convert(filter);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ OptionalInt findAny() {
            java.util.OptionalInt findAny;
            findAny = this.a.findAny();
            return j$.util.Q.j(findAny);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ OptionalInt findFirst() {
            java.util.OptionalInt findFirst;
            findFirst = this.a.findFirst();
            return j$.util.Q.j(findFirst);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            this.a.forEach(intConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            this.a.forEachOrdered(intConsumer);
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

        @Override // j$.util.stream.IntStream, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
        /* renamed from: iterator */
        public final /* synthetic */ Iterator<Integer> iterator2() {
            PrimitiveIterator.OfInt it;
            it = this.a.iterator();
            return j$.util.H.a(it);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ LongStream k() {
            java.util.stream.LongStream mapToLong;
            mapToLong = this.a.mapToLong(null);
            return C0136q0.i(mapToLong);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream limit(long j) {
            java.util.stream.IntStream limit;
            limit = this.a.limit(j);
            return convert(limit);
        }

        @Override // j$.util.stream.IntStream
        public final IntStream m(Q0 q0) {
            java.util.stream.IntStream flatMap;
            java.util.stream.IntStream intStream = this.a;
            Q0 q02 = new Q0();
            q02.a = q0;
            flatMap = intStream.flatMap(q02);
            return convert(flatMap);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream map(IntUnaryOperator intUnaryOperator) {
            java.util.stream.IntStream map;
            map = this.a.map(intUnaryOperator);
            return convert(map);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream mapToObj(IntFunction intFunction) {
            java.util.stream.Stream mapToObj;
            mapToObj = this.a.mapToObj(intFunction);
            return C0104j3.i(mapToObj);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ OptionalInt max() {
            java.util.OptionalInt max;
            max = this.a.max();
            return j$.util.Q.j(max);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ OptionalInt min() {
            java.util.OptionalInt min;
            min = this.a.min();
            return j$.util.Q.j(min);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            boolean noneMatch;
            noneMatch = this.a.noneMatch(intPredicate);
            return noneMatch;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [j$.util.stream.BaseStream, j$.util.stream.IntStream] */
        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ IntStream onClose(Runnable runnable) {
            java.util.stream.BaseStream onClose;
            onClose = this.a.onClose(runnable);
            return C0085g.i(onClose);
        }

        @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
        public final /* synthetic */ BaseStream parallel() {
            java.util.stream.BaseStream parallel;
            parallel = this.a.parallel();
            return C0085g.i(parallel);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream peek(IntConsumer intConsumer) {
            java.util.stream.IntStream peek;
            peek = this.a.peek(intConsumer);
            return convert(peek);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
            int reduce;
            reduce = this.a.reduce(i, intBinaryOperator);
            return reduce;
        }

        @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
        public final /* synthetic */ BaseStream sequential() {
            java.util.stream.BaseStream sequential;
            sequential = this.a.sequential();
            return C0085g.i(sequential);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream skip(long j) {
            java.util.stream.IntStream skip;
            skip = this.a.skip(j);
            return convert(skip);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream sorted() {
            java.util.stream.IntStream sorted;
            sorted = this.a.sorted();
            return convert(sorted);
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.BaseStream
        /* renamed from: spliterator */
        public final /* synthetic */ Spliterator<Integer> spliterator2() {
            Spliterator.OfInt spliterator;
            spliterator = this.a.spliterator();
            return j$.util.W.a(spliterator);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int sum() {
            int sum;
            sum = this.a.sum();
            return sum;
        }

        @Override // j$.util.stream.IntStream
        public final C0190z summaryStatistics() {
            this.a.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream takeWhile(IntPredicate intPredicate) {
            java.util.stream.IntStream takeWhile;
            takeWhile = this.a.takeWhile(intPredicate);
            return convert(takeWhile);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            int[] array;
            array = this.a.toArray();
            return array;
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ BaseStream unordered() {
            java.util.stream.BaseStream unordered;
            unordered = this.a.unordered();
            return C0085g.i(unordered);
        }

        @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
        /* renamed from: iterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ Iterator<Integer> iterator2() {
            Iterator<Integer> it;
            it = this.a.iterator();
            return it;
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
        public final /* synthetic */ IntStream parallel() {
            java.util.stream.IntStream parallel;
            parallel = this.a.parallel();
            return convert(parallel);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
            java.util.OptionalInt reduce;
            reduce = this.a.reduce(intBinaryOperator);
            return j$.util.Q.j(reduce);
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
        public final /* synthetic */ IntStream sequential() {
            java.util.stream.IntStream sequential;
            sequential = this.a.sequential();
            return convert(sequential);
        }

        @Override // j$.util.stream.BaseStream
        /* renamed from: spliterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ j$.util.Spliterator<Integer> spliterator2() {
            java.util.Spliterator spliterator;
            spliterator = this.a.spliterator();
            return j$.util.e0.a(spliterator);
        }
    }

    public final /* synthetic */ class Wrapper implements java.util.stream.IntStream {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.IntStream convert(IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof VivifiedWrapper ? ((VivifiedWrapper) intStream).a : intStream.new Wrapper();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            return IntStream.this.allMatch(intPredicate);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            return IntStream.this.anyMatch(intPredicate);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.DoubleStream asDoubleStream() {
            return E.i(IntStream.this.asDoubleStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.LongStream asLongStream() {
            return C0140r0.i(IntStream.this.asLongStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.OptionalDouble average() {
            return j$.util.Q.m(IntStream.this.average());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream boxed() {
            return Stream.Wrapper.convert(IntStream.this.boxed());
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            IntStream.this.close();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
            return IntStream.this.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ long count() {
            return IntStream.this.count();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream distinct() {
            return convert(IntStream.this.distinct());
        }

        public final /* synthetic */ java.util.stream.IntStream dropWhile(IntPredicate intPredicate) {
            return convert(IntStream.this.dropWhile(intPredicate));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            IntStream intStream = IntStream.this;
            if (obj instanceof Wrapper) {
                obj = IntStream.this;
            }
            return intStream.equals(obj);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
            return convert(IntStream.this.filter(intPredicate));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.OptionalInt findAny() {
            return j$.util.Q.n(IntStream.this.findAny());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.OptionalInt findFirst() {
            return j$.util.Q.n(IntStream.this.findFirst());
        }

        @Override // java.util.stream.IntStream
        public final java.util.stream.IntStream flatMap(IntFunction intFunction) {
            IntStream intStream = IntStream.this;
            Q0 q0 = new Q0();
            q0.a = intFunction;
            return convert(intStream.m(q0));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            IntStream.this.forEach(intConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            IntStream.this.forEachOrdered(intConsumer);
        }

        public final /* synthetic */ int hashCode() {
            return IntStream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return IntStream.this.isParallel();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Iterator<Integer> iterator() {
            return IntStream.this.iterator2();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream limit(long j) {
            return convert(IntStream.this.limit(j));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
            return convert(IntStream.this.map(intUnaryOperator));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
            return E.i(IntStream.this.e());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.LongStream mapToLong(IntToLongFunction intToLongFunction) {
            return C0140r0.i(IntStream.this.k());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream mapToObj(IntFunction intFunction) {
            return Stream.Wrapper.convert(IntStream.this.mapToObj(intFunction));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.OptionalInt max() {
            return j$.util.Q.n(IntStream.this.max());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.OptionalInt min() {
            return j$.util.Q.n(IntStream.this.min());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            return IntStream.this.noneMatch(intPredicate);
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.stream.BaseStream, java.util.stream.IntStream] */
        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream onClose(Runnable runnable) {
            return C0090h.i(IntStream.this.onClose(runnable));
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.IntStream] */
        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream parallel() {
            return C0090h.i(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream peek(IntConsumer intConsumer) {
            return convert(IntStream.this.peek(intConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
            return IntStream.this.reduce(i, intBinaryOperator);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.IntStream] */
        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream sequential() {
            return C0090h.i(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream skip(long j) {
            return convert(IntStream.this.skip(j));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream sorted() {
            return convert(IntStream.this.sorted());
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.Spliterator$OfInt] */
        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.Spliterator<Integer> spliterator() {
            return j$.util.X.a(IntStream.this.spliterator2());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return IntStream.this.sum();
        }

        @Override // java.util.stream.IntStream
        public final IntSummaryStatistics summaryStatistics() {
            IntStream.this.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
        }

        public final /* synthetic */ java.util.stream.IntStream takeWhile(IntPredicate intPredicate) {
            return convert(IntStream.this.takeWhile(intPredicate));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return IntStream.this.toArray();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.IntStream] */
        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream unordered() {
            return C0090h.i(IntStream.this.unordered());
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.J] */
        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: iterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ Iterator<Integer> iterator2() {
            return j$.util.I.a(IntStream.this.iterator2());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: parallel, reason: avoid collision after fix types in other method */
        public final /* synthetic */ java.util.stream.IntStream parallel2() {
            return convert(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
            return j$.util.Q.n(IntStream.this.reduce(intBinaryOperator));
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: sequential, reason: avoid collision after fix types in other method */
        public final /* synthetic */ java.util.stream.IntStream sequential2() {
            return convert(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: spliterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ java.util.Spliterator<Integer> spliterator2() {
            return j$.util.f0.a(IntStream.this.spliterator2());
        }
    }

    boolean allMatch(IntPredicate intPredicate);

    boolean anyMatch(IntPredicate intPredicate);

    DoubleStream asDoubleStream();

    LongStream asLongStream();

    OptionalDouble average();

    Stream<Integer> boxed();

    Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer);

    long count();

    IntStream distinct();

    IntStream dropWhile(IntPredicate intPredicate);

    DoubleStream e();

    IntStream filter(IntPredicate intPredicate);

    OptionalInt findAny();

    OptionalInt findFirst();

    void forEach(IntConsumer intConsumer);

    void forEachOrdered(IntConsumer intConsumer);

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    /* renamed from: iterator */
    Iterator<Integer> iterator2();

    LongStream k();

    IntStream limit(long j);

    IntStream m(Q0 q0);

    IntStream map(IntUnaryOperator intUnaryOperator);

    <U> Stream<U> mapToObj(IntFunction<? extends U> intFunction);

    OptionalInt max();

    OptionalInt min();

    boolean noneMatch(IntPredicate intPredicate);

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    IntStream parallel();

    IntStream peek(IntConsumer intConsumer);

    int reduce(int i, IntBinaryOperator intBinaryOperator);

    OptionalInt reduce(IntBinaryOperator intBinaryOperator);

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    IntStream sequential();

    IntStream skip(long j);

    IntStream sorted();

    @Override // j$.util.stream.BaseStream
    /* renamed from: spliterator */
    j$.util.Spliterator<Integer> spliterator2();

    int sum();

    C0190z summaryStatistics();

    IntStream takeWhile(IntPredicate intPredicate);

    int[] toArray();
}
