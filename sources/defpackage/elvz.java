package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.EnumSet;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elvz {
    public static final eluv a;

    static {
        elur f = elur.a("actions.intent.CREATE_MESSAGE").e().d(new Supplier() { // from class: elvh
            @Override // java.util.function.Supplier
            public final Object get() {
                return new elvd();
            }
        }).f();
        final Function function = new Function() { // from class: elvk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elvy) obj).d();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        final BiConsumer biConsumer = new BiConsumer() { // from class: elvl
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((elvr) obj).e((elya) obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                return BiConsumer$CC.$default$andThen(this, biConsumer2);
            }
        };
        f.c("message.recipient.name", new Function() { // from class: elui
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply(obj);
                return ((Optional) apply).map(new Function() { // from class: elug
                    public final /* synthetic */ String a = "message.recipient.name";

                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        elwj elwjVar = (elwj) obj2;
                        elzh a2 = elpz.a(this.a, elwjVar);
                        Collection.EL.stream(elpz.c(elwjVar, new Function() { // from class: elpv
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function2) {
                                return Function$CC.$default$andThen(this, function2);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                elwh elwhVar = (elwh) obj3;
                                final elzk elzkVar = (elzk) elzl.a.createBuilder();
                                elzkVar.a(elwhVar.c());
                                elwhVar.b().ifPresent(new Consumer() { // from class: elpx
                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj4) {
                                        elzk elzkVar2 = elzk.this;
                                        String str = (String) obj4;
                                        elzkVar2.copyOnWrite();
                                        elzl elzlVar = (elzl) elzkVar2.instance;
                                        elzl elzlVar2 = elzl.a;
                                        str.getClass();
                                        elzlVar.d = str;
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                elwhVar.a().ifPresent(new Consumer() { // from class: elpy
                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj4) {
                                        elzk elzkVar2 = elzk.this;
                                        String str = (String) obj4;
                                        elzkVar2.copyOnWrite();
                                        elzl elzlVar = (elzl) elzkVar2.instance;
                                        elzl elzlVar2 = elzl.a;
                                        str.getClass();
                                        elzlVar.b |= 1;
                                        elzlVar.c = str;
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                return (elzl) elzkVar.build();
                            }

                            public final /* synthetic */ Function compose(Function function2) {
                                return Function$CC.$default$compose(this, function2);
                            }
                        })).forEach(new elpt(a2));
                        return (elzi) a2.build();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                });
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new elux() { // from class: eltw
            @Override // defpackage.elux
            public final void a(Object obj, List list) {
                if (list.isEmpty()) {
                    return;
                }
                BiConsumer.this.accept(obj, (elya) elqa.a(list, new elpr() { // from class: eltv
                    @Override // defpackage.elpr
                    public final Object a(emac emacVar) {
                        elru elruVar = elrt.a;
                        Optional empty = Optional.empty();
                        if ((emacVar.b & 1) != 0) {
                            empty = Optional.of(emacVar.e);
                        }
                        String str = emacVar.c == 2 ? (String) emacVar.d : "";
                        if (str != null) {
                            return new elxf(empty, str);
                        }
                        throw new NullPointerException("Null value");
                    }
                }));
            }
        });
        final Function function2 = new Function() { // from class: elvm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elvy) obj).a();
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        };
        final BiConsumer biConsumer2 = new BiConsumer() { // from class: elvn
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((elvr) obj).b((String) obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer3) {
                return BiConsumer$CC.$default$andThen(this, biConsumer3);
            }
        };
        f.c("message.text", new Function() { // from class: elue
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply(obj);
                return ((Optional) apply).map(new Function() { // from class: elun
                    public final /* synthetic */ String a = "message.text";

                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function3) {
                        return Function$CC.$default$andThen(this, function3);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        elwv elwvVar = (elwv) obj2;
                        elzh a2 = elpz.a(this.a, elwvVar);
                        Collection.EL.stream(elpz.c(elwvVar, new Function() { // from class: elpw
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function3) {
                                return Function$CC.$default$andThen(this, function3);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                elwu elwuVar = (elwu) obj3;
                                elzk elzkVar = (elzk) elzl.a.createBuilder();
                                String a3 = elwuVar.a();
                                elzkVar.copyOnWrite();
                                elzl elzlVar = (elzl) elzkVar.instance;
                                a3.getClass();
                                elzlVar.b |= 1;
                                elzlVar.c = a3;
                                String a4 = elwuVar.a();
                                elzkVar.copyOnWrite();
                                elzl elzlVar2 = (elzl) elzkVar.instance;
                                a4.getClass();
                                elzlVar2.d = a4;
                                elzkVar.a(elwuVar.b());
                                return (elzl) elzkVar.build();
                            }

                            public final /* synthetic */ Function compose(Function function3) {
                                return Function$CC.$default$compose(this, function3);
                            }
                        })).forEach(new elpt(a2));
                        return (elzi) a2.build();
                    }

                    public final /* synthetic */ Function compose(Function function3) {
                        return Function$CC.$default$compose(this, function3);
                    }
                });
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, new elux() { // from class: eluf
            @Override // defpackage.elux
            public final void a(Object obj, List list) {
                if (list.isEmpty()) {
                    return;
                }
                BiConsumer.this.accept(obj, (String) elqa.a(list, new elty()));
            }
        });
        final Function function3 = new Function() { // from class: elvo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function4) {
                return Function$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elvy) obj).c();
            }

            public final /* synthetic */ Function compose(Function function4) {
                return Function$CC.$default$compose(this, function4);
            }
        };
        final BiConsumer biConsumer3 = new BiConsumer() { // from class: elvp
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((elvr) obj).d(((Integer) obj2).intValue());
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer4) {
                return BiConsumer$CC.$default$andThen(this, biConsumer4);
            }
        };
        f.c("message.position", new Function() { // from class: elul
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function4) {
                return Function$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply(obj);
                return ((Optional) apply).map(new Function() { // from class: eluq
                    public final /* synthetic */ String a = "message.position";

                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function4) {
                        return Function$CC.$default$andThen(this, function4);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (elzi) elpz.a(this.a, (elwn) obj2).build();
                    }

                    public final /* synthetic */ Function compose(Function function4) {
                        return Function$CC.$default$compose(this, function4);
                    }
                });
            }

            public final /* synthetic */ Function compose(Function function4) {
                return Function$CC.$default$compose(this, function4);
            }
        }, new elux() { // from class: elum
            @Override // defpackage.elux
            public final void a(Object obj, List list) {
                if (list.isEmpty()) {
                    return;
                }
                BiConsumer.this.accept(obj, (Integer) elqa.a(list, new elpr() { // from class: elua
                    @Override // defpackage.elpr
                    public final Object a(emac emacVar) {
                        elru elruVar = elrt.a;
                        return Integer.valueOf((int) (emacVar.c == 4 ? ((Double) emacVar.d).doubleValue() : eobe.a));
                    }
                }));
            }
        });
        final Function function4 = new Function() { // from class: elvq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function5) {
                return Function$CC.$default$andThen(this, function5);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elvy) obj).b();
            }

            public final /* synthetic */ Function compose(Function function5) {
                return Function$CC.$default$compose(this, function5);
            }
        };
        final Class<elvv> cls = elvv.class;
        f.c("message.messageMode", new Function() { // from class: eluo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function5) {
                return Function$CC.$default$andThen(this, function5);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply(obj);
                return ((Optional) apply).map(new Function() { // from class: elud
                    public final /* synthetic */ String a = "message.messageMode";

                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function5) {
                        return Function$CC.$default$andThen(this, function5);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        elwl elwlVar = (elwl) obj2;
                        elzh a2 = elpz.a(this.a, elwlVar);
                        Collection.EL.stream(elpz.c(elwlVar, new Function() { // from class: elps
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function5) {
                                return Function$CC.$default$andThen(this, function5);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return elpz.b((Enum) obj3);
                            }

                            public final /* synthetic */ Function compose(Function function5) {
                                return Function$CC.$default$compose(this, function5);
                            }
                        })).forEach(new elpt(a2));
                        return (elzi) a2.build();
                    }

                    public final /* synthetic */ Function compose(Function function5) {
                        return Function$CC.$default$compose(this, function5);
                    }
                });
            }

            public final /* synthetic */ Function compose(Function function5) {
                return Function$CC.$default$compose(this, function5);
            }
        }, new elux() { // from class: eluk
            @Override // defpackage.elux
            public final void a(Object obj, final List list) {
                if (list.isEmpty()) {
                    return;
                }
                Optional findFirst = Collection.EL.stream(EnumSet.allOf(cls)).filter(new Predicate() { // from class: elub
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
                        return ((Enum) obj2).toString().equals(((emac) list.get(0)).e);
                    }
                }).findFirst();
                if (findFirst.isPresent()) {
                    ((elvr) obj).c((elvv) ((Enum) findFirst.get()));
                }
            }
        });
        f.b(new Function() { // from class: elvi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function5) {
                return Function$CC.$default$andThen(this, function5);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elvw) obj).a();
            }

            public final /* synthetic */ Function compose(Function function5) {
                return Function$CC.$default$compose(this, function5);
            }
        }, new Function() { // from class: elvj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function5) {
                return Function$CC.$default$andThen(this, function5);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eluv eluvVar = elvz.a;
                throw null;
            }

            public final /* synthetic */ Function compose(Function function5) {
                return Function$CC.$default$compose(this, function5);
            }
        });
        a = f.g();
    }
}
