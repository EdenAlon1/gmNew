package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azbj implements azaw {
    private final avrk a;
    private final errl b;

    public azbj(avrk avrkVar, errl errlVar) {
        this.a = avrkVar;
        this.b = errlVar;
    }

    @Override // defpackage.azal
    public final elfl a(int i, aoku aokuVar) {
        return c(aokuVar);
    }

    @Override // defpackage.azaw
    public final elfl b(engw engwVar) {
        Stream filter = Collection.EL.stream(engwVar).filter(new Predicate() { // from class: azax
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
                return ((aoku) obj).e().isPresent();
            }
        });
        int i = engw.d;
        engw engwVar2 = (engw) filter.collect(endq.a);
        final engw engwVar3 = (engw) Collection.EL.stream(engwVar).filter(new Predicate() { // from class: azbb
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
                return ((aoku) obj).e().isEmpty();
            }
        }).collect(endq.a);
        final enhk enhkVar = (enhk) Collection.EL.stream(engwVar2).collect(endq.a(new Function() { // from class: azbc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (awui) ((aoku) obj).e().get();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: azbd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (aoku) obj;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
        return this.a.a((engw) Collection.EL.stream(engwVar2).map(new Function() { // from class: azbe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (awui) ((aoku) obj).e().get();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a)).h(new emwl() { // from class: azbf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Stream stream = Collection.EL.stream(((Map) obj).entrySet());
                final enhk enhkVar2 = enhk.this;
                enhk enhkVar3 = (enhk) stream.collect(endq.a(new Function() { // from class: azaz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        aoku aokuVar = (aoku) enhk.this.get(((Map.Entry) obj2).getKey());
                        aokuVar.getClass();
                        return aokuVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: azba
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return azav.a(((avmz) ((Map.Entry) obj2).getValue()).a());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
                HashMap hashMap = new HashMap();
                enqu listIterator = enhkVar3.entrySet().listIterator();
                while (listIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    hashMap.put((aoku) entry.getKey(), (azau) entry.getValue());
                }
                engw engwVar4 = engwVar3;
                int size = engwVar4.size();
                for (int i2 = 0; i2 < size; i2++) {
                    hashMap.put((aoku) engwVar4.get(i2), azau.c());
                }
                return enhk.j(hashMap);
            }
        }, this.b);
    }

    @Override // defpackage.azaw
    public final elfl c(aoku aokuVar) {
        Optional e = aokuVar.e();
        return e.isEmpty() ? elfo.e(azau.c()) : this.a.b((awui) e.get()).h(new emwl() { // from class: azbi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return azav.a(((avmz) obj).a());
            }
        }, this.b);
    }

    @Override // defpackage.azaw
    public final elfl d(awui awuiVar) {
        return this.a.b(awuiVar).h(new emwl() { // from class: azay
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return avlk.b(((avmz) obj).a());
            }
        }, this.b);
    }

    @Override // defpackage.azaw
    public final elfl e(aoku aokuVar) {
        return (elfl) aokuVar.e().map(new Function() { // from class: azbg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return azbj.this.d((awui) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: azbh
            @Override // java.util.function.Supplier
            public final Object get() {
                return elfo.e(avlk.d());
            }
        });
    }
}
