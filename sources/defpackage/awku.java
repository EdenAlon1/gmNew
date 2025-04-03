package defpackage;

import j$.util.function.Predicate$CC;
import java.util.Collection;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class awku implements Predicate {
    public final /* synthetic */ Collection a;

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
        return this.a.contains((awui) obj);
    }
}
