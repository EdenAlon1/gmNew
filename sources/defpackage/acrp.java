package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum acrp {
    NOT_STARTED,
    CONNECTING,
    CONNECTED,
    PAUSED,
    PAUSING,
    UNPAUSING,
    DESTROYED;

    public static acrp a(final int i) {
        return (acrp) DesugarArrays.stream(values()).filter(new Predicate() { // from class: acrn
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
                return ((acrp) obj).ordinal() == i;
            }
        }).findFirst().orElseThrow(new Supplier() { // from class: acro
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalStateException();
            }
        });
    }
}
