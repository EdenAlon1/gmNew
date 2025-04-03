package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alwk {
    private final edwk a;

    public alwk(edwk edwkVar) {
        this.a = edwkVar;
    }

    public final void a(final long j, final List list) {
        ((enrr) ((enrr) edwk.a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltLoggerImpl", "logOccurrence", 35, "MobaltLoggerImpl.java")).q("Mobalt: schedule recording occurrence metric");
        final edwk edwkVar = this.a;
        final elfl h = elfo.h(new erog() { // from class: edwj
            @Override // defpackage.erog
            public final ListenableFuture a() {
                edwk edwkVar2 = edwk.this;
                final long epochMilli = edwkVar2.d.f().toEpochMilli();
                final emsi emsiVar = emsi.OCCURRENCE;
                final Consumer consumer = new Consumer() { // from class: edyi
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        emxf.b(((Long) obj).longValue() >= 0, "occurrence count can't be negative");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                final edym edymVar = edwkVar2.c;
                if (!edymVar.d) {
                    return edymVar.h.a(edymVar.l.f());
                }
                ((enrr) ((enrr) edym.a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/workers/writer/LogWriter", "logNumeric", 117, "LogWriter.java")).t("Mobalt: start logging %s metric", emsiVar);
                boolean z = true;
                if (emsiVar != emsi.OCCURRENCE && emsiVar != emsi.INTEGER) {
                    z = false;
                }
                final List list2 = list;
                final long j2 = j;
                emxf.f(z, "logNumeric must be called with OCCURRENCE or INTEGER metric types, not %s", emsiVar);
                return edymVar.h.b(edymVar.l.f()).h(new emwl() { // from class: edyf
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        emsi emsiVar2;
                        edym edymVar2 = edym.this;
                        emxf.b(edymVar2.b.b.size() == 1, "must be one customer");
                        emxf.b(((emrq) edymVar2.b.b.get(0)).c.size() == 1, "must be one project");
                        consumer.o(1L);
                        emxf.b(Collection.EL.stream(list2).allMatch(new Predicate() { // from class: edyc
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
                                return ((Integer) obj2).intValue() >= 0;
                            }
                        }), "event vectors can't contain negative event codes");
                        Stream stream = Collection.EL.stream(((emst) ((emrq) edymVar2.b.b.get(0)).c.get(0)).c);
                        final long j3 = j2;
                        Optional findFirst = stream.filter(new Predicate() { // from class: edye
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
                                return ((long) ((emsj) obj2).b) == j3;
                            }
                        }).findFirst();
                        emxf.e(findFirst.isPresent(), "failed to find metric with ID: %s", j3);
                        int i = ((emsj) findFirst.get()).c;
                        if (i != 0) {
                            switch (i) {
                                case 8:
                                    emsiVar2 = emsi.OCCURRENCE;
                                    break;
                                case 9:
                                    emsiVar2 = emsi.INTEGER;
                                    break;
                                case 10:
                                    emsiVar2 = emsi.INTEGER_HISTOGRAM;
                                    break;
                                case 11:
                                    emsiVar2 = emsi.STRING;
                                    break;
                                case 12:
                                    emsiVar2 = emsi.STRUCT;
                                    break;
                                default:
                                    emsiVar2 = null;
                                    break;
                            }
                        } else {
                            emsiVar2 = emsi.UNSET;
                        }
                        if (emsiVar2 == null) {
                            emsiVar2 = emsi.UNRECOGNIZED;
                        }
                        emsi emsiVar3 = emsiVar;
                        emxf.i(emsiVar2 == emsiVar3, "wrong metric type, input type is %s, found %s", emsiVar3, emsiVar2);
                        return (emsj) findFirst.get();
                    }
                }, edymVar.e).e(IllegalArgumentException.class, new emwl() { // from class: edyg
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        edym edymVar2 = edym.this;
                        IllegalArgumentException illegalArgumentException = (IllegalArgumentException) obj;
                        edymVar2.k.c(edymVar2.f, (int) edymVar2.g, "INVALID_METRIC_PARAMS");
                        throw illegalArgumentException;
                    }
                }, edymVar.e).i(new eroh() { // from class: edyh
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        List list3 = list2;
                        final edym edymVar2 = edym.this;
                        final emsj emsjVar = (emsj) obj;
                        final edvk b = edvk.b(list3);
                        int a = edymVar2.c.a();
                        emsd emsdVar = emsjVar.g;
                        if (emsdVar == null) {
                            emsdVar = emsd.a;
                        }
                        if (a > emsdVar.b) {
                            return elfo.e(null);
                        }
                        final long j3 = epochMilli;
                        return edymVar2.j.a().e(edxw.class, new emwl() { // from class: edyj
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                edym edymVar3 = edym.this;
                                edymVar3.k.c(edymVar3.f, (int) edymVar3.g, "EXPERIMENT_IDS_DECODING_ERROR");
                                return enpe.c;
                            }
                        }, edymVar2.e).i(new eroh() { // from class: edyk
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                int i;
                                int a2;
                                int a3;
                                int a4;
                                edyk edykVar = this;
                                emsj emsjVar2 = emsjVar;
                                enjc enjcVar = (enjc) obj2;
                                final int a5 = edxu.a(emsjVar2, Instant.ofEpochMilli(j3));
                                int i2 = engw.d;
                                engr engrVar = new engr();
                                for (emtc emtcVar : emsjVar2.h) {
                                    emsu b2 = emsu.b(emtcVar.q);
                                    if (b2 == null) {
                                        b2 = emsu.UNRECOGNIZED;
                                    }
                                    edym edymVar3 = edym.this;
                                    if (b2 == emsu.RELEASE_STAGE_NOT_SET || edymVar3.c.a() <= emtcVar.q) {
                                        final edvk edvkVar = b;
                                        emsj emsjVar3 = emsjVar2;
                                        final eduh eduhVar = new eduh(edymVar3.f, edymVar3.g, emsjVar2.b, emtcVar.f);
                                        int i3 = emtcVar.g;
                                        int a6 = emsz.a(i3);
                                        if (a6 != 0 && a6 == 14 && (((a2 = emsx.a((i = emtcVar.k))) != 0 && a2 == 9) || ((a3 = emsx.a(i)) != 0 && a3 == 10))) {
                                            final edva edvaVar = edymVar3.h;
                                            final emto a7 = edymVar3.i.a(emtcVar, enjcVar);
                                            int a8 = emtq.a(emtcVar.p);
                                            final int i4 = a8 == 0 ? 1 : a8;
                                            final long j4 = emtcVar.m;
                                            engrVar.h(elfl.g(edvaVar.c.e(new efkr() { // from class: eduq
                                                @Override // defpackage.efkr
                                                public final void a(efks efksVar) {
                                                    edva.f(efksVar, eduhVar, a5, a7, i4, edvkVar, j4, 0, new BiFunction() { // from class: eduy
                                                        public final /* synthetic */ BiFunction andThen(Function function) {
                                                            return BiFunction$CC.$default$andThen(this, function);
                                                        }

                                                        @Override // java.util.function.BiFunction
                                                        public final Object apply(Object obj3, Object obj4) {
                                                            ((Integer) obj3).intValue();
                                                            enru enruVar = edva.a;
                                                            return ((Optional) obj4).isPresent() ? Optional.empty() : Optional.of(eduz.b());
                                                        }
                                                    });
                                                }
                                            })));
                                        } else {
                                            int a9 = emsz.a(i3);
                                            if (a9 != 0 && a9 == 19 && (a4 = emsx.a(emtcVar.k)) != 0 && a4 == 5) {
                                                final edva edvaVar2 = edymVar3.h;
                                                final emto a10 = edymVar3.i.a(emtcVar, enjcVar);
                                                int a11 = emtq.a(emtcVar.p);
                                                final int i5 = a11 == 0 ? 1 : a11;
                                                final long j5 = emtcVar.m;
                                                engrVar.h(elfl.g(edvaVar2.c.e(new efkr() { // from class: edut
                                                    @Override // defpackage.efkr
                                                    public final void a(efks efksVar) {
                                                        edva.f(efksVar, eduhVar, a5, a10, i5, edvkVar, j5, 1L, new eduj(new BiFunction() { // from class: eduu
                                                            public final /* synthetic */ BiFunction andThen(Function function) {
                                                                return BiFunction$CC.$default$andThen(this, function);
                                                            }

                                                            @Override // java.util.function.BiFunction
                                                            public final Object apply(Object obj3, Object obj4) {
                                                                return Long.valueOf(Math.max(((Long) obj3).longValue(), ((Long) obj4).longValue()));
                                                            }
                                                        }));
                                                    }
                                                })));
                                            } else {
                                                int a12 = emsz.a(i3);
                                                if (a12 != 0 && a12 == 13) {
                                                    final edva edvaVar3 = edymVar3.h;
                                                    final emto a13 = edymVar3.i.a(emtcVar, enjcVar);
                                                    final long j6 = emtcVar.m;
                                                    engrVar.h(elfl.g(edvaVar3.c.e(new efkr() { // from class: edur
                                                        @Override // defpackage.efkr
                                                        public final void a(efks efksVar) {
                                                            edva.f(efksVar, eduhVar, a5, a13, 5, edvkVar, j6, 1L, new eduj(new BiFunction() { // from class: edus
                                                                public final /* synthetic */ BiFunction andThen(Function function) {
                                                                    return BiFunction$CC.$default$andThen(this, function);
                                                                }

                                                                @Override // java.util.function.BiFunction
                                                                public final Object apply(Object obj3, Object obj4) {
                                                                    long longValue = ((Long) obj3).longValue();
                                                                    long longValue2 = ((Long) obj4).longValue();
                                                                    long j7 = longValue + longValue2;
                                                                    if (((longValue2 ^ longValue) < 0) || ((longValue ^ j7) >= 0)) {
                                                                        return Long.valueOf(j7);
                                                                    }
                                                                    throw new ArithmeticException();
                                                                }
                                                            }));
                                                        }
                                                    })));
                                                }
                                            }
                                        }
                                        edykVar = this;
                                        emsjVar2 = emsjVar3;
                                    }
                                }
                                return elfo.a(engrVar.g());
                            }
                        }, edymVar2.e).h(new emwl() { // from class: edyl
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                ((enrr) ((enrr) edym.a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/workers/writer/LogWriter", "recordSuccess", 175, "LogWriter.java")).r("Mobalt: logged event to %s reports", ((List) obj2).size());
                                return null;
                            }
                        }, edymVar2.e).e(RuntimeException.class, new emwl() { // from class: edyd
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                edym edymVar3 = edym.this;
                                RuntimeException runtimeException = (RuntimeException) obj2;
                                edymVar3.k.c(edymVar3.f, (int) edymVar3.g, "UNEXPECTED_EXCEPTION");
                                throw runtimeException;
                            }
                        }, edymVar2.e);
                    }
                }, edymVar.e);
            }
        }, edwkVar.b);
        final Object[] objArr = new Object[0];
        h.b(eldl.l(new Runnable() { // from class: edxb
            @Override // java.lang.Runnable
            public final void run() {
                edxc.a(ListenableFuture.this, objArr);
            }
        }), erpp.a);
    }
}
