package defpackage;

import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adlh extends ebfq {
    final /* synthetic */ adli a;

    public adlh(adli adliVar) {
        this.a = adliVar;
    }

    @Override // defpackage.ebfq
    public final void a() {
        efbd.c();
        b(Collection.EL.stream((Set) this.a.c.b()).allMatch(new Predicate() { // from class: adlf
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
                return ((bzhr) obj).c();
            }
        }));
    }
}
