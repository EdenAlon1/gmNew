package defpackage;

import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cknh {
    public final long a;

    public cknh(long j) {
        this.a = j;
    }

    public static cknh b() {
        return new cknf(0L).a();
    }

    public final cknf a() {
        return new cknf(this.a);
    }

    public final engw c() {
        Stream filter = DesugarArrays.stream(ckng.values()).filter(new Predicate() { // from class: ckne
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cknh.this.d((ckng) obj);
            }
        });
        int i = engw.d;
        return (engw) filter.collect(endq.a);
    }

    public final boolean d(ckng ckngVar) {
        return (this.a & ckngVar.e) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof cknh) && this.a == ((cknh) obj).a;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a));
    }
}
