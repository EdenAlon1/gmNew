package j$.util;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class Q {
    public static void a(V v, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            v.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (u0.a) {
                u0.a(v.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            v.forEachRemaining((DoubleConsumer) new C(consumer));
        }
    }

    public static void b(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            ofInt.forEachRemaining((IntConsumer) consumer);
        } else {
            if (u0.a) {
                u0.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            ofInt.forEachRemaining((IntConsumer) new G(consumer));
        }
    }

    public static void c(Spliterator.OfLong ofLong, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            ofLong.forEachRemaining((LongConsumer) consumer);
        } else {
            if (u0.a) {
                u0.a(ofLong.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            ofLong.forEachRemaining((LongConsumer) new K(consumer));
        }
    }

    public static Spliterator d(java.util.SortedSet sortedSet) {
        return new S(sortedSet, sortedSet);
    }

    public static boolean e(V v, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return v.tryAdvance((DoubleConsumer) consumer);
        }
        if (u0.a) {
            u0.a(v.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return v.tryAdvance((DoubleConsumer) new C(consumer));
    }

    public static boolean f(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return ofInt.tryAdvance((IntConsumer) consumer);
        }
        if (u0.a) {
            u0.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return ofInt.tryAdvance((IntConsumer) new G(consumer));
    }

    public static boolean g(Spliterator.OfLong ofLong, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return ofLong.tryAdvance((LongConsumer) consumer);
        }
        if (u0.a) {
            u0.a(ofLong.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return ofLong.tryAdvance((LongConsumer) new K(consumer));
    }

    public static Optional h(java.util.Optional optional) {
        boolean isPresent;
        Object obj;
        if (optional == null) {
            return null;
        }
        isPresent = optional.isPresent();
        if (!isPresent) {
            return Optional.empty();
        }
        obj = optional.get();
        return Optional.of(obj);
    }

    public static OptionalDouble i(java.util.OptionalDouble optionalDouble) {
        boolean isPresent;
        double asDouble;
        if (optionalDouble == null) {
            return null;
        }
        isPresent = optionalDouble.isPresent();
        if (!isPresent) {
            return OptionalDouble.a();
        }
        asDouble = optionalDouble.getAsDouble();
        return OptionalDouble.b(asDouble);
    }

    public static OptionalInt j(java.util.OptionalInt optionalInt) {
        boolean isPresent;
        int asInt;
        if (optionalInt == null) {
            return null;
        }
        isPresent = optionalInt.isPresent();
        if (!isPresent) {
            return OptionalInt.empty();
        }
        asInt = optionalInt.getAsInt();
        return OptionalInt.of(asInt);
    }

    public static OptionalLong k(java.util.OptionalLong optionalLong) {
        boolean isPresent;
        long asLong;
        if (optionalLong == null) {
            return null;
        }
        isPresent = optionalLong.isPresent();
        if (!isPresent) {
            return OptionalLong.empty();
        }
        asLong = optionalLong.getAsLong();
        return OptionalLong.of(asLong);
    }

    public static java.util.Optional l(Optional optional) {
        java.util.Optional empty;
        java.util.Optional of;
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            of = java.util.Optional.of(optional.get());
            return of;
        }
        empty = java.util.Optional.empty();
        return empty;
    }

    public static java.util.OptionalDouble m(OptionalDouble optionalDouble) {
        java.util.OptionalDouble empty;
        java.util.OptionalDouble of;
        if (optionalDouble == null) {
            return null;
        }
        if (optionalDouble.isPresent()) {
            of = java.util.OptionalDouble.of(optionalDouble.getAsDouble());
            return of;
        }
        empty = java.util.OptionalDouble.empty();
        return empty;
    }

    public static java.util.OptionalInt n(OptionalInt optionalInt) {
        java.util.OptionalInt empty;
        java.util.OptionalInt of;
        if (optionalInt == null) {
            return null;
        }
        if (optionalInt.isPresent()) {
            of = java.util.OptionalInt.of(optionalInt.getAsInt());
            return of;
        }
        empty = java.util.OptionalInt.empty();
        return empty;
    }

    public static java.util.OptionalLong o(OptionalLong optionalLong) {
        java.util.OptionalLong empty;
        java.util.OptionalLong of;
        if (optionalLong == null) {
            return null;
        }
        if (optionalLong.isPresent()) {
            of = java.util.OptionalLong.of(optionalLong.getAsLong());
            return of;
        }
        empty = java.util.OptionalLong.empty();
        return empty;
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
