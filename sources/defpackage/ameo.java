package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ameo implements amdh {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/control/status/control/MessageStatusControllerImpl");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final errl f;
    public final errl g;
    public final asuz h;
    public final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final asvn n;

    public ameo(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, errl errlVar, errl errlVar2, ffbr ffbrVar8, asuz asuzVar, ffbr ffbrVar9, asvn asvnVar) {
        this.j = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.k = ffbrVar5;
        this.l = ffbrVar6;
        this.e = ffbrVar7;
        this.m = ffbrVar8;
        this.f = errlVar;
        this.g = errlVar2;
        this.h = asuzVar;
        this.i = ffbrVar9;
        this.n = asvnVar;
    }

    public static void h(final buxr buxrVar, amdg amdgVar) {
        l(buxrVar, amdgVar.a());
        amdgVar.e().ifPresent(new Consumer() { // from class: amem
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                buxr.this.q(((Boolean) obj).booleanValue());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public static boolean i(int i) {
        return bdjs.u(i) || bdjs.x(i) || bdjs.v(i) || bdjs.w(i) || i == 24;
    }

    private final int k(final buxr buxrVar, final int i, final epdh epdhVar, final boolean z) {
        l(buxrVar, i);
        final bdmq bdmqVar = (bdmq) this.j.b();
        ekzz f = eleg.f("MessageDatabaseOperations#updateAndReturnUpdatedMessages");
        try {
            buxo d = MessagesTable.d();
            d.z("updateAndReturnUpdatedMessages#query");
            d.h(new Function() { // from class: bdlo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    cskc cskcVar = bdmq.a;
                    buxr buxrVar2 = buxr.this;
                    buxrVar2.ap("updateAndReturnUpdatedMessages#update");
                    Stream map = Collection.EL.stream(buxrVar2.b().b()).map(new bdjt());
                    int i2 = engw.d;
                    buxzVar.u((Iterable) map.collect(endq.a));
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            Stream map = Collection.EL.stream(d.b().y()).map(new Function() { // from class: bdlp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    MessageCoreData a2 = ((byzp) bdmq.this.e.b()).a();
                    a2.aM((MessagesTable.BindData) obj);
                    return a2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i2 = engw.d;
            final engw engwVar = (engw) map.collect(endq.a);
            if (!engwVar.isEmpty()) {
                Map.EL.forEach((HashMap) Collection.EL.stream(engwVar).collect(Collectors.groupingBy(new Function() { // from class: bdlq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((MessageCoreData) obj).z();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Supplier() { // from class: bdlr
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new HashMap();
                    }
                }, Collectors.mapping(new Function() { // from class: bdlt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((MessageCoreData) obj).B();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, endq.a))), new BiConsumer() { // from class: bdlu
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        ((cbgf) bdmq.this.h.b()).m((ConversationIdType) obj, (engw) obj2, new String[0]);
                    }

                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                    }
                });
            }
            f.close();
            ((dtuu) this.m.b()).g(new dtut() { // from class: amdl
                @Override // defpackage.dtut
                public final ekzz a() {
                    return eleg.f("MessageStatusController::failUndeliveredMessagesWithLogAndThenAttemptFallback");
                }
            }, null, new Runnable() { // from class: amdm
                @Override // java.lang.Runnable
                public final void run() {
                    engw engwVar2 = engwVar;
                    Stream stream = Collection.EL.stream(engwVar2);
                    final ameo ameoVar = ameo.this;
                    final int i3 = i;
                    final epdh epdhVar2 = epdhVar;
                    stream.forEach(new Consumer() { // from class: amdi
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            MessageCoreData messageCoreData = (MessageCoreData) obj;
                            epdh epdhVar3 = epdhVar2;
                            ameo ameoVar2 = ameo.this;
                            if (ameo.i(i3)) {
                                ameoVar2.f(messageCoreData, epdhVar3);
                                return;
                            }
                            amdd p = amdg.p();
                            p.c(messageCoreData.B());
                            p.i(Instant.ofEpochMilli(messageCoreData.r()));
                            ((amcr) p).f = Optional.of(amde.f());
                            p.g(epdhVar3);
                            ameoVar2.g(messageCoreData, p.a());
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    if (ameoVar.h.a() && z) {
                        axnw.h(elfo.i(((aqgl) ameoVar.e.b()).c(engwVar2, eokl.SEND_MESSAGE_FAILED)).h(new emwl() { // from class: amdt
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                long count = Collection.EL.stream((List) obj).filter(new Predicate() { // from class: amef
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
                                        return ((aqgm) obj2) == null;
                                    }
                                }).count();
                                ensk j = ameo.a.j();
                                j.Y(ente.a, "BugleDataModel");
                                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/api/messaging/control/status/control/MessageStatusControllerImpl", "failUndeliveredMessagesWithLogAndThenAttemptFallback", 250, "MessageStatusControllerImpl.java")).J("%s fallback attempts are cancelled or failed, with %d and %s", Long.valueOf(count), Integer.valueOf(i3), epdhVar2.name());
                                return null;
                            }
                        }, ameoVar.f));
                    }
                }
            });
            return engwVar.size();
        } finally {
        }
    }

    private static void l(buxr buxrVar, int i) {
        if (i(i)) {
            buxrVar.Y(new Function() { // from class: amdo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    buxzVar.ao(2, 11);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            buxrVar.Y(new Function() { // from class: amdp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    buxzVar.ao(2, 11);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        buxrVar.U(i);
    }

    private final boolean m(amdg amdgVar, BiFunction biFunction) {
        Object apply;
        Object apply2;
        boolean a2 = this.n.a();
        MessageIdType messageIdType = ((amcs) amdgVar).a;
        final MessageCoreData v = a2 ? ((bdmq) this.j.b()).v(messageIdType) : ((bdmq) this.j.b()).z(messageIdType);
        if (v == null) {
            ensk j = a.j();
            j.Y(ente.a, "BugleDataModel");
            enrr enrrVar = (enrr) j;
            enrrVar.Y(csux.b, messageIdType);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/control/status/control/MessageStatusControllerImpl", "handleSendOrDeliveryFailureForSingleMessage", 187, "MessageStatusControllerImpl.java")).q("failed in finding message from Messages Table");
            return false;
        }
        if (!v.cX()) {
            apply = biFunction.apply(v, amdgVar);
            return ((Boolean) apply).booleanValue();
        }
        apply2 = biFunction.apply(v, amdgVar);
        boolean booleanValue = ((Boolean) apply2).booleanValue();
        ((dtuu) this.m.b()).g(new dtut() { // from class: amds
            @Override // defpackage.dtut
            public final ekzz a() {
                return eleg.f("MessageStatusController::failAndThenFallback");
            }
        }, null, new Runnable() { // from class: amdu
            @Override // java.lang.Runnable
            public final void run() {
                final ameo ameoVar = ameo.this;
                boolean a3 = ((attl) ameoVar.i.b()).a();
                final MessageCoreData messageCoreData = v;
                if (!a3) {
                    axnw.h(((aqgl) ameoVar.e.b()).a(messageCoreData, eokl.SEND_MESSAGE_FAILED));
                } else {
                    final elfl g = elfo.g(new Callable() { // from class: ameh
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ameo ameoVar2 = ameo.this;
                            List L = ((bczy) ameoVar2.b.b()).L(messageCoreData.z());
                            if (((enou) L).c != 1) {
                                return Optional.empty();
                            }
                            aoku q = ((aolr) ameoVar2.d.b()).q((ParticipantsTable.BindData) L.get(0));
                            return (!q.w() || q.e().isEmpty()) ? Optional.empty() : Optional.of(q);
                        }
                    }, ameoVar.g);
                    axnw.h(g.i(new eroh() { // from class: amei
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            final ameo ameoVar2 = ameo.this;
                            return (ListenableFuture) ((Optional) obj).map(new Function() { // from class: amen
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return ((cfsm) ameo.this.c.b()).b(((awui) ((aoku) obj2).e().get()).d, aplf.a);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).orElseGet(new Supplier() { // from class: amdj
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return elfo.e(null);
                                }
                            });
                        }
                    }, ameoVar.f).i(new eroh() { // from class: amej
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            return (((Optional) erqt.q(elfl.this)).isPresent() && ((apkn) obj) == null) ? elfo.e(eokl.EMERGENCY_RCS_PROTOCOL_DETERMINATION_MESSAGE_FAILED) : elfo.e(eokl.SEND_MESSAGE_FAILED);
                        }
                    }, ameoVar.f).i(new eroh() { // from class: amdn
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            return ((aqgl) ameo.this.e.b()).a(messageCoreData, (eokl) obj);
                        }
                    }, ameoVar.f));
                }
            }
        });
        return booleanValue;
    }

    @Override // defpackage.amdh
    public final int a(epdh epdhVar) {
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.Y(new Function() { // from class: amee
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.aj(5, 6, 10, 20);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return k(buxrVar, 8, epdhVar, this.h.a());
    }

    @Override // defpackage.amdh
    public final int b(final Iterable iterable, ameq ameqVar) {
        amcv amcvVar = (amcv) ameqVar;
        emxf.b(i(amcvVar.c), "terminal status is not a delivery failure");
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.Y(new Function() { // from class: amdk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.u(iterable);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return k(buxrVar, amcvVar.c, amcvVar.b, amcvVar.d == 1);
    }

    @Override // defpackage.amdh
    public final boolean c(amdg amdgVar) {
        emxf.b(i(((amcs) amdgVar).b), "terminal status is not a delivery failure");
        return m(amdgVar, new BiFunction() { // from class: ameg
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                MessageCoreData messageCoreData = (MessageCoreData) obj;
                amdg amdgVar2 = (amdg) obj2;
                messageCoreData.bz(amdgVar2.n());
                final buxr K = messageCoreData.K();
                K.ap("MessageStatusControllerImpl#failOrExpireSentMessage");
                amdgVar2.h().ifPresent(new Consumer() { // from class: amek
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj3) {
                        buxr.this.E((bdhg) obj3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                amdgVar2.j().ifPresent(new Consumer() { // from class: amel
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj3) {
                        buxr.this.L(((Integer) obj3).intValue());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ameo.h(K, amdgVar2);
                boolean m = amdgVar2.m();
                ameo ameoVar = ameo.this;
                if (m) {
                    ameoVar.f(messageCoreData, amdgVar2.c());
                }
                return Boolean.valueOf(ameoVar.j(messageCoreData, K));
            }
        });
    }

    @Override // defpackage.amdh
    public final boolean d(amdg amdgVar) {
        emxf.b(!i(((amcs) amdgVar).b), "terminal status is not a send failure");
        return m(amdgVar, new BiFunction() { // from class: amdx
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                final MessageCoreData messageCoreData = (MessageCoreData) obj;
                amdg amdgVar2 = (amdg) obj2;
                Optional g = amdgVar2.g();
                messageCoreData.getClass();
                g.ifPresent(new Consumer() { // from class: amdy
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj3) {
                        MessageCoreData.this.bL(((Integer) obj3).intValue());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                amdgVar2.i().ifPresent(new Consumer() { // from class: amdz
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj3) {
                        MessageCoreData.this.bP(((Integer) obj3).intValue());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                amdgVar2.d().ifPresent(new Consumer() { // from class: amea
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj3) {
                        MessageCoreData.this.bS(((Integer) obj3).intValue());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                messageCoreData.bz(amdgVar2.n());
                amdgVar2.k().ifPresent(new Consumer() { // from class: ameb
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj3) {
                        Instant instant = (Instant) obj3;
                        long epochMilli = instant.toEpochMilli();
                        MessageCoreData messageCoreData2 = MessageCoreData.this;
                        messageCoreData2.bR(epochMilli);
                        messageCoreData2.bM(instant.toEpochMilli());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                messageCoreData.bV(amdgVar2.a());
                amdgVar2.l().ifPresent(new Consumer() { // from class: amec
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj3) {
                        MessageCoreData.this.cb((byzl) obj3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                final buxr K = messageCoreData.K();
                K.ap("MessageStatusControllerImpl#failSendingMessage");
                amdgVar2.l().ifPresent(new Consumer() { // from class: amed
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj3) {
                        buxr.this.W((byzl) obj3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ameo.h(K, amdgVar2);
                ameo ameoVar = ameo.this;
                boolean j = ameoVar.j(messageCoreData, K);
                if (amdgVar2.m()) {
                    ameoVar.g(messageCoreData, amdgVar2);
                }
                return Boolean.valueOf(j);
            }
        });
    }

    @Override // defpackage.amdh
    public final void e(final Iterable iterable, ameq ameqVar) {
        String[] strArr = MessagesTable.a;
        final buxr buxrVar = new buxr();
        buxrVar.Y(new Function() { // from class: amdq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.u(iterable);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        amcv amcvVar = (amcv) ameqVar;
        amcvVar.a.ifPresent(new Consumer() { // from class: amdr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                buxr.this.B(((Integer) obj).intValue());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        k(buxrVar, amcvVar.c, amcvVar.b, amcvVar.d == 1);
    }

    public final void f(MessageCoreData messageCoreData, epdh epdhVar) {
        altk altkVar = (altk) this.k.b();
        if (messageCoreData == null) {
            throw new NullPointerException("Null messageSnapshot");
        }
        if (epdhVar == null) {
            throw new NullPointerException("Null outgoingMessageFailureReason");
        }
        altkVar.V(new alqp(messageCoreData, epdhVar));
    }

    public final void g(MessageCoreData messageCoreData, amdg amdgVar) {
        amde amdeVar = (amde) amdgVar.f().orElse(amde.f());
        final alqn alqnVar = new alqn();
        alqnVar.f(messageCoreData);
        aztg d = ((bdtd) this.l.b()).d(messageCoreData.v());
        if (d == null) {
            d = ((bdtd) this.l.b()).c();
        }
        alqnVar.i(d != null ? d.e() : -1);
        alqnVar.g(((Integer) amdgVar.i().orElse(-2)).intValue());
        alqnVar.d(amdeVar.a());
        alqnVar.b(((Integer) amdgVar.d().orElse(-1)).intValue());
        alqnVar.c = amdeVar.e();
        alqnVar.e(amdeVar.b());
        alqnVar.b = Optional.of(amdgVar.c());
        if (this.n.a() && messageCoreData.da()) {
            alqnVar.h(messageCoreData.cC() ? eopk.END_OF_EMERGENCY : eopk.SOS_MESSAGE);
        }
        amdeVar.d().ifPresent(new Consumer() { // from class: amdv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((alqn) alrj.this).a = Optional.of((eqxi) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        amdeVar.c().ifPresent(new Consumer() { // from class: amdw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                alrj.this.c((eoov) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((altk) this.k.b()).K(alqnVar.a());
    }

    public final boolean j(MessageCoreData messageCoreData, buxr buxrVar) {
        boolean U = ((bdmq) this.j.b()).U(messageCoreData.z(), messageCoreData.B(), buxrVar);
        if (!U) {
            ensk j = a.j();
            j.Y(ente.a, "BugleDataModel");
            enrr enrrVar = (enrr) j;
            enrrVar.Y(csux.b, messageCoreData.B());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/control/status/control/MessageStatusControllerImpl", "updateMessageStorage", 511, "MessageStatusControllerImpl.java")).t("failed in updating message in Message Table. Message might be deleted. SnapshotStatus=%s", messageCoreData.aC());
        }
        return U;
    }
}
