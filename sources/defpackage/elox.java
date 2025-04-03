package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.EnumSet;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elox {
    public static final elod a;
    public static final eluv b;

    static {
        elur f = elur.a("actions.intent.EXECUTE_SOFTWARE_INSTRUCTION").e().d(new Supplier() { // from class: eloj
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eloe();
            }
        }).f();
        final Function function = new Function() { // from class: elok
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elov) obj).a();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        final BiConsumer biConsumer = new BiConsumer() { // from class: elol
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((eloo) obj).b((elyt) obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                return BiConsumer$CC.$default$andThen(this, biConsumer2);
            }
        };
        final Class<elow> cls = elow.class;
        f.c("softwareInstruction.name", new Function() { // from class: eltz
            public final /* synthetic */ String a = "softwareInstruction.name";

            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply(obj);
                elws elwsVar = (elws) apply;
                elzh a2 = elpz.a(this.a, elwsVar);
                Collection.EL.stream(elpz.c(elwsVar, new Function() { // from class: elpu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        elwr elwrVar = (elwr) obj2;
                        elwrVar.b();
                        return elpz.b(elwrVar.a());
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                })).forEach(new elpt(a2));
                return Optional.of((elzi) a2.build());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new elux() { // from class: eltx
            @Override // defpackage.elux
            public final void a(Object obj, List list) {
                if (list.isEmpty()) {
                    return;
                }
                BiConsumer biConsumer2 = biConsumer;
                final emac emacVar = (emac) list.get(0);
                if ((emacVar.b & 1) != 0) {
                    Optional findFirst = Collection.EL.stream(EnumSet.allOf(cls)).filter(new Predicate() { // from class: eluc
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
                            return ((Enum) obj2).toString().equals(emac.this.e);
                        }
                    }).findFirst();
                    if (findFirst.isPresent()) {
                        biConsumer2.accept(obj, new elwy((Enum) findFirst.get()));
                        return;
                    }
                }
                String str = (String) elqa.a(list, new elty());
                str.getClass();
                biConsumer2.accept(obj, new elwz(str));
            }
        });
        f.b(new Function() { // from class: elom
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elou) obj).a();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new Function() { // from class: elon
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                elod elodVar = elox.a;
                elzb elzbVar = ((elos) obj).a;
                emab emabVar = (emab) emac.a.createBuilder();
                eyiu eyiuVar = (eyiu) eyiw.a.createBuilder();
                eyjp eyjpVar = (eyjp) eyjq.a.createBuilder();
                eyjpVar.copyOnWrite();
                eyjq eyjqVar = (eyjq) eyjpVar.instance;
                eyjqVar.b = 3;
                eyjqVar.c = "GenericErrorStatus";
                eyiuVar.a("@type", (eyjq) eyjpVar.build());
                eyiw eyiwVar = (eyiw) eyiuVar.build();
                emabVar.copyOnWrite();
                emac emacVar = (emac) emabVar.instance;
                eyiwVar.getClass();
                emacVar.d = eyiwVar;
                emacVar.c = 6;
                return (emac) emabVar.build();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        });
        b = f.g();
        eloc c = elod.c();
        elog elogVar = new elog();
        elogVar.a = Optional.of(new elos(new elyy().a()));
        ((eloa) c).a = elogVar.a();
        a = c.a();
    }
}
