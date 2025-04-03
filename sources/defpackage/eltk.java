package defpackage;

import j$.time.Duration;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.OffsetDateTime;
import j$.time.ZonedDateTime;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eltk {
    private final List a = new ArrayList();
    private elti b;

    private eltk() {
    }

    static eltk b(String str, Supplier supplier) {
        eltk o = o(str);
        o.l("identifier", new Function() { // from class: elsh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyv) obj).b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        o.l("name", new Function() { // from class: elsi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyv) obj).c();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return o;
    }

    public static eyjq c(String str) {
        eyjp eyjpVar = (eyjp) eyjq.a.createBuilder();
        eyjpVar.copyOnWrite();
        eyjq eyjqVar = (eyjq) eyjpVar.instance;
        str.getClass();
        eyjqVar.b = 3;
        eyjqVar.c = str;
        return (eyjq) eyjpVar.build();
    }

    public static eyjq d(eyiw eyiwVar) {
        eyjp eyjpVar = (eyjp) eyjq.a.createBuilder();
        eyjpVar.copyOnWrite();
        eyjq eyjqVar = (eyjq) eyjpVar.instance;
        eyiwVar.getClass();
        eyjqVar.c = eyiwVar;
        eyjqVar.b = 5;
        return (eyjq) eyjpVar.build();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [elti] */
    static eltk o(final String str) {
        eltk eltkVar = new eltk();
        eltkVar.l("@type", new Function() { // from class: elth
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Optional.of(str);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eltkVar.b = new Object() { // from class: elti
        };
        return eltkVar;
    }

    final elru a() {
        Optional.ofNullable(this.b);
        return new eltm(this.a);
    }

    public final void e(String str, Function function, elpp elppVar) {
        this.a.add(new elpo(str, function, elppVar));
    }

    final void f(final Function function) {
        e("duration", new Function() { // from class: eltf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply(obj);
                return ((Optional) apply).map(new Function() { // from class: elsn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((Duration) obj2).toString();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).map(new elsc());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new elpp() { // from class: eltg
        });
    }

    final void g(String str, final Function function) {
        e(str, new Function() { // from class: eltj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply(obj);
                return ((Optional) apply).map(new Function() { // from class: elsm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((Enum) obj2).toString();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).map(new elsc());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new elpp() { // from class: elrw
        });
    }

    final void h(String str, final Function function) {
        e(str, new Function() { // from class: eltb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply(obj);
                return ((Optional) apply).map(new Function() { // from class: elsr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((LocalDate) obj2).toString();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).map(new elsc());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new elpp() { // from class: eltc
        });
    }

    final void i(String str, final Function function) {
        e(str, new Function() { // from class: elrx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply(obj);
                return ((Optional) apply).map(new Function() { // from class: elta
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((LocalTime) obj2).toString();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).map(new elsc());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new elpp() { // from class: elry
        });
    }

    public final void j(String str, final Function function, final Function function2) {
        e(str, new Function() { // from class: elso
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                Object apply2;
                Function function3 = Function.this;
                apply = function3.apply(obj);
                if (((List) apply).isEmpty()) {
                    return Optional.empty();
                }
                Function function4 = function2;
                apply2 = function3.apply(obj);
                List list = (List) Collection.EL.stream((List) apply2).map(function4).filter(new Predicate() { // from class: elsd
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
                    public final boolean test(Object obj2) {
                        return ((Optional) obj2).isPresent();
                    }
                }).map(new Function() { // from class: else
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function5) {
                        return Function$CC.$default$andThen(this, function5);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (eyjq) ((Optional) obj2).get();
                    }

                    public final /* synthetic */ Function compose(Function function5) {
                        return Function$CC.$default$compose(this, function5);
                    }
                }).collect(elvb.a());
                eyjp eyjpVar = (eyjp) eyjq.a.createBuilder();
                eyhe eyheVar = (eyhe) eyhf.a.createBuilder();
                eyheVar.copyOnWrite();
                eyhf eyhfVar = (eyhf) eyheVar.instance;
                eygr eygrVar = eyhfVar.b;
                if (!eygrVar.c()) {
                    eyhfVar.b = eyfy.mutableCopy(eygrVar);
                }
                eydl.addAll(list, eyhfVar.b);
                eyhf eyhfVar2 = (eyhf) eyheVar.build();
                eyjpVar.copyOnWrite();
                eyjq eyjqVar = (eyjq) eyjpVar.instance;
                eyhfVar2.getClass();
                eyjqVar.c = eyhfVar2;
                eyjqVar.b = 6;
                return Optional.of((eyjq) eyjpVar.build());
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, new elpp() { // from class: elsz
        });
    }

    final void k(String str, final Function function, final elru elruVar) {
        e(str, new Function() { // from class: elst
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply(obj);
                Optional map = ((Optional) apply).map(Function$CC.identity());
                final elru elruVar2 = elruVar;
                elruVar2.getClass();
                return map.map(new Function() { // from class: elsx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return elru.this.a(obj2);
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).map(new Function() { // from class: elsy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return eltk.d((eyiw) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                });
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new elpp() { // from class: elsu
        });
    }

    final void l(String str, final Function function) {
        e(str, new Function() { // from class: elsj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply(obj);
                return ((Optional) apply).map(new elsc());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new elpp() { // from class: elsk
        });
    }

    final void m(String str, final Function function) {
        e(str, new Function() { // from class: elsp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply(obj);
                return ((Optional) apply).map(new Function() { // from class: elsa
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((ZonedDateTime) obj2).toOffsetDateTime();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).map(new Function() { // from class: elsb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((OffsetDateTime) obj2).toString();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).map(new elsc());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new elpp() { // from class: elsq
        });
    }

    final void n(String str, Function function, final elru elruVar) {
        j(str, function, new Function() { // from class: elrz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Optional ofNullable = Optional.ofNullable(obj);
                final elru elruVar2 = elru.this;
                return ofNullable.map(new Function() { // from class: elsg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return eltk.d(elru.this.a(obj2));
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                });
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        });
    }
}
