package defpackage;

import j$.time.DayOfWeek;
import j$.time.Period;
import j$.time.ZoneId;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elrt {
    public static final elru a;
    public static final elru b;
    public static final elru c;
    public static final elru d;
    public static final elru e;

    static {
        elru a2 = eltk.b("ListItem", new Supplier() { // from class: elrq
            @Override // java.util.function.Supplier
            public final Object get() {
                return new elxi();
            }
        }).a();
        a = a2;
        eltk b2 = eltk.b("ItemList", new Supplier() { // from class: elqg
            @Override // java.util.function.Supplier
            public final Object get() {
                return new elxg();
            }
        });
        b2.n("itemListElement", new Function() { // from class: elqm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyc) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, a2);
        b2.a();
        elru a3 = eltk.b("OrderItem", new Supplier() { // from class: elqz
            @Override // java.util.function.Supplier
            public final Object get() {
                return new elxm();
            }
        }).a();
        b = a3;
        elru a4 = eltk.b("Organization", new Supplier() { // from class: elrg
            @Override // java.util.function.Supplier
            public final Object get() {
                return new elxo();
            }
        }).a();
        c = a4;
        eltk o = eltk.o("ParcelDelivery");
        o.l("deliveryAddress", new Function() { // from class: elro
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyl) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        o.m("expectedArrivalFrom", new Function() { // from class: elrp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyl) obj).e();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        o.m("expectedArrivalUntil", new Function() { // from class: elqb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyl) obj).f();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        o.l("hasDeliveryMethod", new Function() { // from class: elqc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyl) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        o.l("trackingNumber", new Function() { // from class: elqd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyl) obj).g();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        o.l("trackingUrl", new Function() { // from class: elqe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyl) obj).h();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        elru a5 = o.a();
        d = a5;
        eltk b3 = eltk.b("Order", new Supplier() { // from class: elqf
            @Override // java.util.function.Supplier
            public final Object get() {
                return new elxk();
            }
        });
        b3.m("orderDate", new Function() { // from class: elqh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyg) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        b3.k("orderDelivery", new Function() { // from class: elqi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyg) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, a5);
        b3.n("orderedItem", new Function() { // from class: elqj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyg) obj).g();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, a3);
        b3.g("orderStatus", new Function() { // from class: elqk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyg) obj).e();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        b3.k("seller", new Function() { // from class: elql
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyg) obj).f();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, a4);
        b3.a();
        eltk b4 = eltk.b("Person", new Supplier() { // from class: elqn
            @Override // java.util.function.Supplier
            public final Object get() {
                return new elxq();
            }
        });
        b4.l("email", new Function() { // from class: elqo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyn) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        b4.l("telephone", new Function() { // from class: elqp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyn) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        b4.l("name", new Function() { // from class: elqq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyn) obj).c();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        b4.a();
        eltk b5 = eltk.b("Timer", new Supplier() { // from class: elqr
            @Override // java.util.function.Supplier
            public final Object get() {
                return new elxw();
            }
        });
        b5.g("timerStatus", new Function() { // from class: elqs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyx) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        b5.f(new Function() { // from class: elqt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyx) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        b5.a();
        eltk b6 = eltk.b("CalendarEvent", new Supplier() { // from class: elqu
            @Override // java.util.function.Supplier
            public final Object get() {
                return new elxd();
            }
        });
        b6.m("startDate", new Function() { // from class: elqv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elxz) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        b6.m("endDate", new Function() { // from class: elqw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elxz) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        b6.n("attendee", new Function() { // from class: elqx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elxz) obj).e();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new elrs());
        b6.a();
        eltk b7 = eltk.b("SafetyCheck", new Supplier() { // from class: elqy
            @Override // java.util.function.Supplier
            public final Object get() {
                return new elxs();
            }
        });
        b7.f(new Function() { // from class: elra
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyp) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        b7.m("checkinTime", new Function() { // from class: elrb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyp) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        b7.a();
        eltk b8 = eltk.b("Schedule", new Supplier() { // from class: elrc
            @Override // java.util.function.Supplier
            public final Object get() {
                return new elxu();
            }
        });
        b8.h("startDate", new Function() { // from class: elrd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyr) obj).g();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        b8.i("startTime", new Function() { // from class: elre
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyr) obj).h();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        b8.h("endDate", new Function() { // from class: elrf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyr) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        b8.i("endTime", new Function() { // from class: elrh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyr) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final Function function = new Function() { // from class: elri
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyr) obj).f();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        b8.e("scheduleTimezone", new Function() { // from class: elrv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply(obj);
                return ((Optional) apply).map(new Function() { // from class: elss
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((ZoneId) obj2).toString();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }).map(new elsc());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new elpp() { // from class: elsf
        });
        final Function function2 = new Function() { // from class: elrj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyr) obj).e();
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        };
        b8.e("repeatFrequency", new Function() { // from class: elsv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply(obj);
                return ((Optional) apply).map(new Function() { // from class: elte
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function3) {
                        return Function$CC.$default$andThen(this, function3);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((Period) obj2).toString();
                    }

                    public final /* synthetic */ Function compose(Function function3) {
                        return Function$CC.$default$compose(this, function3);
                    }
                }).map(new elsc());
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        }, new elpp() { // from class: elsw
        });
        Function function3 = new Function() { // from class: elrk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function4) {
                return Function$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elyr) obj).i();
            }

            public final /* synthetic */ Function compose(Function function4) {
                return Function$CC.$default$compose(this, function4);
            }
        };
        final Function function4 = new Function() { // from class: elrl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function5) {
                return Function$CC.$default$andThen(this, function5);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                elru elruVar = elrt.a;
                switch (elrr.a[((DayOfWeek) obj).ordinal()]) {
                    case 1:
                        return "http://schema.org/Monday";
                    case 2:
                        return "http://schema.org/Tuesday";
                    case 3:
                        return "http://schema.org/Wednesday";
                    case 4:
                        return "http://schema.org/Thursday";
                    case 5:
                        return "http://schema.org/Friday";
                    case 6:
                        return "http://schema.org/Saturday";
                    case 7:
                        return "http://schema.org/Sunday";
                    default:
                        return "";
                }
            }

            public final /* synthetic */ Function compose(Function function5) {
                return Function$CC.$default$compose(this, function5);
            }
        };
        b8.j("byDay", function3, new Function() { // from class: eltd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function5) {
                return Function$CC.$default$andThen(this, function5);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Optional ofNullable = Optional.ofNullable(obj);
                final Function function5 = Function.this;
                return ofNullable.map(new Function() { // from class: elsl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function6) {
                        return Function$CC.$default$andThen(this, function6);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        Object apply;
                        apply = Function.this.apply(obj2);
                        return eltk.c((String) apply);
                    }

                    public final /* synthetic */ Function compose(Function function6) {
                        return Function$CC.$default$compose(this, function6);
                    }
                });
            }

            public final /* synthetic */ Function compose(Function function5) {
                return Function$CC.$default$compose(this, function5);
            }
        });
        elru a6 = b8.a();
        e = a6;
        eltk b9 = eltk.b("Alarm", new Supplier() { // from class: elrm
            @Override // java.util.function.Supplier
            public final Object get() {
                return new elxb();
            }
        });
        b9.k("alarmSchedule", new Function() { // from class: elrn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function5) {
                return Function$CC.$default$andThen(this, function5);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elwx) obj).a();
            }

            public final /* synthetic */ Function compose(Function function5) {
                return Function$CC.$default$compose(this, function5);
            }
        }, a6);
        b9.a();
    }
}
