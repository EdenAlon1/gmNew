package defpackage;

import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class endq {
    public static final Collector a = Collector.CC.of(new Supplier() { // from class: ency
        @Override // java.util.function.Supplier
        public final Object get() {
            int i = engw.d;
            return new engr();
        }
    }, new BiConsumer() { // from class: endb
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((engr) obj).h(obj2);
        }

        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }, new BinaryOperator() { // from class: endc
        public final /* synthetic */ BiFunction andThen(Function function) {
            return BiFunction$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            engr engrVar = (engr) obj;
            engr engrVar2 = (engr) obj2;
            engrVar.a(engrVar2.a, engrVar2.b);
            return engrVar;
        }
    }, new Function() { // from class: endd
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo448andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((engr) obj).g();
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, new Collector.Characteristics[0]);
    public static final Collector b = Collector.CC.of(new Supplier() { // from class: ende
        @Override // java.util.function.Supplier
        public final Object get() {
            return new enin();
        }
    }, new BiConsumer() { // from class: endf
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((enin) obj).c(obj2);
        }

        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }, new BinaryOperator() { // from class: endg
        public final /* synthetic */ BiFunction andThen(Function function) {
            return BiFunction$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            enin eninVar = (enin) obj;
            eninVar.k((enin) obj2);
            return eninVar;
        }
    }, new Function() { // from class: endh
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo448andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((enin) obj).g();
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, new Collector.Characteristics[0]);

    static {
        Collector.CC.of(new Supplier() { // from class: endi
            @Override // java.util.function.Supplier
            public final Object get() {
                enim enimVar = enim.a;
                return new enik();
            }
        }, new BiConsumer() { // from class: endj
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((enik) obj).a((enop) obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: encz
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                enik enikVar = (enik) obj;
                Iterator it = ((enik) obj2).a.iterator();
                while (it.hasNext()) {
                    enikVar.a((enop) it.next());
                }
                return enikVar;
            }
        }, new Function() { // from class: enda
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enik enikVar = (enik) obj;
                engr engrVar = new engr(enikVar.a.size());
                List list = enikVar.a;
                enop enopVar = enop.a;
                Collections.sort(list, enoo.a);
                Iterator it = enikVar.a.iterator();
                enjs enjsVar = it instanceof enjs ? (enjs) it : new enjs(it);
                while (enjsVar.hasNext()) {
                    enop enopVar2 = (enop) enjsVar.next();
                    while (enjsVar.hasNext()) {
                        if (!enjsVar.b) {
                            enjsVar.c = enjsVar.a.next();
                            enjsVar.b = true;
                        }
                        enop enopVar3 = (enop) enjsVar.c;
                        if (enopVar2.g(enopVar3)) {
                            emxf.i(enopVar2.e(enopVar3).h(), "Overlapping ranges not permitted but found %s overlapping %s", enopVar2, enopVar3);
                            enop enopVar4 = (enop) enjsVar.next();
                            int compareTo = enopVar2.b.compareTo(enopVar4.b);
                            int compareTo2 = enopVar2.c.compareTo(enopVar4.c);
                            if (compareTo > 0 || compareTo2 < 0) {
                                if (compareTo < 0 || compareTo2 > 0) {
                                    enopVar4 = new enop(compareTo <= 0 ? enopVar2.b : enopVar4.b, compareTo2 >= 0 ? enopVar2.c : enopVar4.c);
                                }
                                enopVar2 = enopVar4;
                            }
                        }
                    }
                    engrVar.h(enopVar2);
                }
                engw g = engrVar.g();
                return g.isEmpty() ? enim.a : (((enou) g).c == 1 && ((enop) enjk.l(g)).equals(enop.a)) ? enim.b : new enim(g);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Collector.Characteristics[0]);
    }

    public static Collector a(final Function function, final Function function2) {
        function.getClass();
        function2.getClass();
        return Collector.CC.of(new Supplier() { // from class: endk
            @Override // java.util.function.Supplier
            public final Object get() {
                return new enhd();
            }
        }, new BiConsumer() { // from class: endl
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Object apply;
                Object apply2;
                Collector collector = endq.a;
                Function function3 = function2;
                apply = Function.this.apply(obj2);
                apply2 = function3.apply(obj2);
                ((enhd) obj).k(apply, apply2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: endm
            public final /* synthetic */ BiFunction andThen(Function function3) {
                return BiFunction$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                enhd enhdVar = (enhd) obj;
                enhdVar.j((enhd) obj2);
                return enhdVar;
            }
        }, new Function() { // from class: endn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((enhd) obj).c();
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, new Collector.Characteristics[0]);
    }

    public static Collector b(Function function, Function function2, BinaryOperator binaryOperator) {
        function2.getClass();
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new Supplier() { // from class: endo
            @Override // java.util.function.Supplier
            public final Object get() {
                return new LinkedHashMap();
            }
        }), new Function() { // from class: endp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return enhk.j((LinkedHashMap) obj);
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        });
    }
}
