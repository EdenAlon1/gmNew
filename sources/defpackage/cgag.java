package defpackage;

import android.util.Pair;
import com.google.android.gms.feedback.FileTeleporter;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgag extends dghd {
    private final Map d;
    private final errl e;
    private final atux f;
    private enhk g;
    private enhk h;
    public static final cfva a = cfvl.f(cfvl.b, "feedback_async_timeout_ms", 4750);
    private static final cskc c = cskc.g("Bugle", "BugleFeedbackProductSpecificData");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2");

    public cgag(Map map, errl errlVar, atux atuxVar) {
        enhk enhkVar = enoz.a;
        this.g = enhkVar;
        this.h = enhkVar;
        this.d = map;
        this.e = errlVar;
        this.f = atuxVar;
    }

    @Override // defpackage.dghd
    public final List a() {
        ExecutionException e;
        InterruptedException e2;
        TimeoutException e3;
        final HashMap hashMap = new HashMap(this.d);
        hashMap.putAll(this.h);
        this.h = enoz.a;
        List arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList((Collection) Collection.EL.stream(hashMap.keySet()).filter(new cfzn()).sorted().collect(Collectors.toCollection(new cfzx())));
        try {
            try {
                final List list = (List) Collection.EL.stream(arrayList2).map(new Function() { // from class: cfzt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cfva cfvaVar = cgag.a;
                        cfzm cfzmVar = (cfzm) hashMap.get((String) obj);
                        cfzmVar.getClass();
                        return cfzmVar.c();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new cfzx()));
                ensk h = b.h();
                h.Y(ente.a, "Bugle");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2", "getAsyncFeedbackPsbd", 210, "BugleFeedbackProductSpecificDataV2.java")).r("psbdLength: %s", list.size());
                try {
                    return (List) elfo.j(list).a(new Callable() { // from class: cfzu
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            cfva cfvaVar = cgag.a;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList3.addAll((java.util.Collection) erqt.q((elfl) it.next()));
                            }
                            return arrayList3;
                        }
                    }, this.e).get(((Long) a.e()).longValue(), TimeUnit.MILLISECONDS);
                } catch (TimeoutException e4) {
                    if (!this.f.a()) {
                        throw e4;
                    }
                    ensk j = b.j();
                    j.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2", "getAsyncFeedbackPsbd", 228, "BugleFeedbackProductSpecificDataV2.java")).q("Encountered a timeout while getting PSBD. Returning partial results.");
                    List list2 = (List) Collection.EL.stream(list).filter(new Predicate() { // from class: cfzv
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
                            cfva cfvaVar = cgag.a;
                            return ((elfl) obj).isDone();
                        }
                    }).map(new Function() { // from class: cfzw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            elfl elflVar = (elfl) obj;
                            cfva cfvaVar = cgag.a;
                            try {
                                return Optional.of((List) erqt.q(elflVar));
                            } catch (Exception unused) {
                                TimeoutException timeoutException = e4;
                                ensk j2 = cgag.b.j();
                                j2.Y(ente.a, "Bugle");
                                ((enrr) ((enrr) ((enrr) j2).g(timeoutException)).h("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2", "getAsyncFeedbackPsbd", 239, "BugleFeedbackProductSpecificDataV2.java")).q("Skipping PSD");
                                return Optional.empty();
                            }
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new cgaf()).map(new cfzo()).flatMap(new cfzp()).collect(Collectors.toCollection(new cfzx()));
                    try {
                        list2.add(new FileTeleporter(((String) enqc.b(Collection.EL.stream(arrayList2), Collection.EL.stream(list), new cfzy()).filter(new Predicate() { // from class: cfzr
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
                                cfva cfvaVar = cgag.a;
                                return !((elfl) ((Pair) obj).second).isDone();
                            }
                        }).map(new Function() { // from class: cfzs
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                cfva cfvaVar = cgag.a;
                                return (String) ((Pair) obj).first;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.joining("\n"))).getBytes(), "PSBD Feedback Timeouts"));
                        return list2;
                    } catch (InterruptedException e5) {
                        e2 = e5;
                        arrayList = list2;
                        c.s("Interrupt while getAsyncFeedbackPsbd()", e2);
                        return arrayList;
                    } catch (ExecutionException e6) {
                        e = e6;
                        arrayList = list2;
                        c.s("Failed to getAsyncFeedbackPsbd()", e);
                        return arrayList;
                    } catch (TimeoutException e7) {
                        e3 = e7;
                        arrayList = list2;
                        c.s("Timeout while getAsyncFeedbackPsbd()", e3);
                        return arrayList;
                    }
                }
            } catch (TimeoutException e8) {
                e3 = e8;
            }
        } catch (InterruptedException e9) {
            e2 = e9;
        } catch (ExecutionException e10) {
            e = e10;
        }
    }

    @Override // defpackage.dghd
    public final List b() {
        final HashMap hashMap = new HashMap(this.d);
        hashMap.putAll(this.g);
        this.g = enoz.a;
        List arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        final List list = (List) Collection.EL.stream(arrayList2).filter(new cfzn()).sorted().map(new Function() { // from class: cgab
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfva cfvaVar = cgag.a;
                cfzm cfzmVar = (cfzm) hashMap.get((String) obj);
                cfzmVar.getClass();
                return cfzmVar.d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new cfzx()));
        try {
            try {
                try {
                    return (List) elfo.j(list).a(new Callable() { // from class: cgac
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            cfva cfvaVar = cgag.a;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                try {
                                    for (cfzl cfzlVar : (List) erqt.q((elfl) it.next())) {
                                        arrayList3.add(new Pair(cfzlVar.a(), cfzlVar.b()));
                                    }
                                } catch (Throwable th) {
                                    ensk j = cgag.b.j();
                                    j.Y(ente.a, "Bugle");
                                    ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2", "getAsyncFeedbackPsd", (char) 134, "BugleFeedbackProductSpecificDataV2.java")).q("Skipping PSD");
                                }
                            }
                            return arrayList3;
                        }
                    }, this.e).get(((Long) a.e()).longValue(), TimeUnit.MILLISECONDS);
                } catch (TimeoutException e) {
                    if (!this.f.a()) {
                        throw e;
                    }
                    ((enrr) c.k().h("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2", "getAsyncFeedbackPsd", 147, "BugleFeedbackProductSpecificDataV2.java")).q("Encountered a timeout while getting PSD. Returning partial results.");
                    List list2 = (List) Collection.EL.stream(list).filter(new Predicate() { // from class: cgad
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
                            cfva cfvaVar = cgag.a;
                            return ((elfl) obj).isDone();
                        }
                    }).map(new Function() { // from class: cgae
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            elfl elflVar = (elfl) obj;
                            cfva cfvaVar = cgag.a;
                            try {
                                return Optional.of((List) erqt.q(elflVar));
                            } catch (Exception e2) {
                                ensk j = cgag.b.j();
                                j.Y(ente.a, "Bugle");
                                ((enrr) ((enrr) ((enrr) j).g(e2)).h("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2", "getAsyncFeedbackPsd", (char) 157, "BugleFeedbackProductSpecificDataV2.java")).q("Skipping PSD");
                                return Optional.empty();
                            }
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new cgaf()).map(new cfzo()).flatMap(new cfzp()).map(new Function() { // from class: cfzq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            cfzl cfzlVar = (cfzl) obj;
                            cfva cfvaVar = cgag.a;
                            return new Pair(cfzlVar.a(), cfzlVar.b());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new cfzx()));
                    try {
                        list2.add(new Pair("PSD Feedback Timeouts", (String) enqc.b(Collection.EL.stream(arrayList2), Collection.EL.stream(list), new cfzy()).filter(new Predicate() { // from class: cfzz
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
                                cfva cfvaVar = cgag.a;
                                return !((elfl) ((Pair) obj).second).isDone();
                            }
                        }).map(new Function() { // from class: cgaa
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                cfva cfvaVar = cgag.a;
                                return (String) ((Pair) obj).first;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.joining("\n"))));
                        return list2;
                    } catch (InterruptedException e2) {
                        e = e2;
                        arrayList = list2;
                        c.s("Interrupt while getAsyncFeedbackPsd()", e);
                        return arrayList;
                    } catch (ExecutionException e3) {
                        e = e3;
                        arrayList = list2;
                        c.s("Failed to getAsyncFeedbackPsd()", e);
                        return arrayList;
                    } catch (TimeoutException e4) {
                        e = e4;
                        arrayList = list2;
                        c.s("Timeout while getAsyncFeedbackPsd()", e);
                        return arrayList;
                    }
                }
            } catch (TimeoutException e5) {
                e = e5;
            }
        } catch (InterruptedException e6) {
            e = e6;
        } catch (ExecutionException e7) {
            e = e7;
        }
    }

    public final void c(enhk enhkVar) {
        this.g = enhkVar;
        this.h = enhkVar;
    }
}
