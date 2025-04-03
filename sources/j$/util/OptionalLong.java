package j$.util;

import java.util.NoSuchElementException;
import java.util.function.LongConsumer;

/* loaded from: classes9.dex */
public final class OptionalLong {
    private static final OptionalLong c = new OptionalLong();
    private final boolean a;
    private final long b;

    private OptionalLong() {
        this.a = false;
        this.b = 0L;
    }

    public static OptionalLong empty() {
        return c;
    }

    public static OptionalLong of(long j) {
        return new OptionalLong(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalLong)) {
            return false;
        }
        OptionalLong optionalLong = (OptionalLong) obj;
        boolean z = this.a;
        return (z && optionalLong.a) ? this.b == optionalLong.b : z == optionalLong.a;
    }

    public long getAsLong() {
        if (this.a) {
            return this.b;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        if (!this.a) {
            return 0;
        }
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public void ifPresent(LongConsumer longConsumer) {
        if (this.a) {
            longConsumer.accept(this.b);
        }
    }

    public boolean isPresent() {
        return this.a;
    }

    public long orElse(long j) {
        return this.a ? this.b : j;
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalLong.empty";
        }
        return "OptionalLong[" + this.b + "]";
    }

    private OptionalLong(long j) {
        this.a = true;
        this.b = j;
    }
}
