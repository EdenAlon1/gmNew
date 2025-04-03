package defpackage;

import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djha extends HashMap {
    private final djgs a;

    public djha(djgs djgsVar) {
        this.a = djgsVar;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dkkj put(String str, dkkj dkkjVar) {
        if (dizg.H()) {
            Optional filter = this.a.a.j().map(new Function() { // from class: djgp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((djtp) obj).o();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: djgq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((InstantMessageConfiguration) obj).mMaxConcurrentSession);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).filter(new Predicate() { // from class: djgr
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
                    return ((Integer) obj).intValue() > 0;
                }
            });
            while (filter.isPresent() && size() >= ((Integer) filter.get()).intValue()) {
                Map.Entry entry = (Map.Entry) Collection.EL.stream(entrySet()).min(Comparator.CC.comparing(new Function() { // from class: djgz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(((dkkj) ((Map.Entry) obj).getValue()).M);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                })).get();
                dkkj dkkjVar2 = (dkkj) entry.getValue();
                dkkjVar2.n(9, 68);
                remove(entry.getKey());
                dkty.q("The max session limit is exceeded. Stopping least recently active session id: %s", dktx.GENERIC.c(dkkjVar2.k));
            }
        }
        return (dkkj) super.put(str, dkkjVar);
    }
}
