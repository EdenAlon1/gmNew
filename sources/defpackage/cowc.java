package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cowc {
    public final ffbr a;
    long b = -1;
    long c = -1;
    private final ffbr d;

    public cowc(ffbr ffbrVar, ffbr ffbrVar2) {
        this.d = ffbrVar;
        this.a = ffbrVar2;
    }

    public final Collection a(long j) {
        Stream map = Collection.EL.stream(((bczy) this.d.b()).M(cpxu.b(j))).filter(new Predicate() { // from class: cowa
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
                return ((ParticipantsTable.BindData) obj).o() != -2;
            }
        }).map(new Function() { // from class: cowb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aolr) cowc.this.a.b()).q((ParticipantsTable.BindData) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return (java.util.Collection) map.collect(endq.a);
    }
}
