package defpackage;

import android.app.AlarmManager;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgcg {
    public static final entd a = entd.c("Bugle");
    public final errl b;
    public final errl c;
    public final cqoh d;
    public final akvr e;
    public final Map f;
    public final cgbe g;
    public final Object h = new Object();
    public Optional i = Optional.empty();
    public Optional j = Optional.empty();
    public final cbwj k;

    public cgcg(errl errlVar, errl errlVar2, cbwj cbwjVar, cqoh cqohVar, Map map, akvr akvrVar, cgbe cgbeVar) {
        this.b = errlVar;
        this.c = errlVar2;
        this.k = cbwjVar;
        this.d = cqohVar;
        this.f = new HashMap(map);
        this.e = akvrVar;
        this.g = cgbeVar;
    }

    static final boolean d(final MessageIdType messageIdType, final byyx byyxVar) {
        Object apply;
        btfj a2 = btfo.a();
        a2.z("flaggedMessageExists");
        apply = new Function() { // from class: cgbl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btfn btfnVar = (btfn) obj;
                entd entdVar = cgcg.a;
                btfnVar.b(MessageIdType.this);
                btfnVar.d(byyxVar);
                return btfnVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new btfn());
        a2.k(new btfm((btfn) apply));
        return a2.b().T();
    }

    public final elfl a() {
        btfj a2 = btfo.a();
        a2.z("processAllFlaggedAndComputeNextTimer");
        return a2.b().w().i(new eroh() { // from class: cgbs
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final cgcg cgcgVar = cgcg.this;
                Map map = cgcgVar.f;
                final engw engwVar = (engw) obj;
                elfl e = elfo.e(null);
                for (final byyx byyxVar : map.keySet()) {
                    final cgbe cgbeVar = cgcgVar.g;
                    Stream filter = Collection.EL.stream(engwVar).filter(new Predicate() { // from class: cgbd
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
                            bted btedVar = (bted) obj2;
                            return btedVar.m() == byyxVar && cgbe.this.c(btedVar);
                        }
                    });
                    int i = engw.d;
                    final engw engwVar2 = (engw) filter.collect(endq.a);
                    e = e.i(new eroh() { // from class: cgcf
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return ((cgbh) cgcg.this.f.get(byyxVar)).b(engwVar2);
                        }
                    }, cgcgVar.c);
                }
                return e.h(new emwl() { // from class: cgbj
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        Stream stream = Collection.EL.stream(engwVar);
                        final cgcg cgcgVar2 = cgcg.this;
                        Stream filter2 = stream.filter(new Predicate() { // from class: cgby
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
                            public final boolean test(Object obj3) {
                                return !cgcg.this.g.c((bted) obj3);
                            }
                        });
                        final cgbe cgbeVar2 = cgcgVar2.g;
                        filter2.min(Comparator.CC.comparingLong(new ToLongFunction() { // from class: cgbz
                            @Override // java.util.function.ToLongFunction
                            public final long applyAsLong(Object obj3) {
                                return cgbe.this.a((bted) obj3);
                            }
                        })).ifPresent(new Consumer() { // from class: cgca
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj3) {
                                cgcg cgcgVar3 = cgcg.this;
                                Instant b = cgcgVar3.g.b((bted) obj3);
                                synchronized (cgcgVar3.h) {
                                    if (cgcgVar3.i.isPresent() && b.compareTo((Instant) cgcgVar3.i.get()) >= 0) {
                                        if (((Instant) cgcgVar3.i.get()).isAfter(cgcgVar3.d.f())) {
                                            return;
                                        }
                                    }
                                    akvr akvrVar = cgcgVar3.e;
                                    b.getClass();
                                    Object systemService = akvrVar.a.getSystemService("alarm");
                                    systemService.getClass();
                                    akvrVar.b = (AlarmManager) systemService;
                                    akvs akvsVar = (akvs) akvt.a.createBuilder();
                                    akvsVar.getClass();
                                    akvsVar.copyOnWrite();
                                    akvt akvtVar = (akvt) akvsVar.instance;
                                    akvtVar.b |= 2;
                                    akvtVar.d = "com.google.android.apps.messaging.shared.flaggedmessages.MessageFlaggerTask";
                                    String uuid = UUID.randomUUID().toString();
                                    uuid.getClass();
                                    akvsVar.copyOnWrite();
                                    akvt akvtVar2 = (akvt) akvsVar.instance;
                                    akvtVar2.b |= 1;
                                    akvtVar2.c = uuid;
                                    eyfy build = akvsVar.build();
                                    build.getClass();
                                    akvt akvtVar3 = (akvt) build;
                                    AlarmManager alarmManager = akvrVar.b;
                                    AlarmManager alarmManager2 = null;
                                    if (alarmManager == null) {
                                        ffkj.c("alarmManager");
                                        alarmManager = null;
                                    }
                                    akvn akvnVar = new akvn(alarmManager);
                                    AlarmManager alarmManager3 = akvrVar.b;
                                    if (alarmManager3 == null) {
                                        ffkj.c("alarmManager");
                                    } else {
                                        alarmManager2 = alarmManager3;
                                    }
                                    akvrVar.b(b, akvtVar3, true, akvnVar, new akvo(alarmManager2));
                                    cgcgVar3.j = Optional.of(akvtVar3);
                                    cgcgVar3.i = Optional.of(b);
                                    ((ensz) ((ensz) cgcg.a.h()).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageFlagger", "setAlarmTimer", 229, "MessageFlagger.java")).s("MessageFlagger processing scheduled for %d seconds later.", Duration.between(b, cgcgVar3.d.f()).toSeconds());
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return null;
                    }
                }, cgcgVar.c);
            }
        }, this.c);
    }

    public final elfl b(final engw engwVar, final byyx byyxVar) {
        return engwVar.isEmpty() ? elfo.e(null) : elfo.g(new Callable() { // from class: cgcc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                entd entdVar = cgcg.a;
                String[] strArr = btfo.a;
                btff btffVar = new btff();
                btffVar.f("unflagMessages");
                final engw engwVar2 = engw.this;
                final byyx byyxVar2 = byyxVar;
                btffVar.a(new Function() { // from class: cgcb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        btfn btfnVar = (btfn) obj;
                        entd entdVar2 = cgcg.a;
                        btfnVar.c(engw.this);
                        btfnVar.d(byyxVar2);
                        return btfnVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return Boolean.valueOf(btffVar.d() > 0);
            }
        }, this.b).i(new eroh() { // from class: cgcd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return elfo.e(null);
                }
                cgcg cgcgVar = cgcg.this;
                cgcgVar.c();
                return cgcgVar.a();
            }
        }, this.c);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [j$.time.temporal.Temporal, java.lang.Object] */
    public final void c() {
        synchronized (this.h) {
            if (this.i.isPresent()) {
                if (!this.j.isPresent()) {
                    ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageFlagger", "clearAlarmTimer", 242, "MessageFlagger.java")).q("Cannot delete reminder. Alarm token is null");
                    return;
                }
                this.e.a((akvt) this.j.get());
                this.j = Optional.empty();
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageFlagger", "clearAlarmTimer", 245, "MessageFlagger.java")).s("MessageFlagger cancelling alert scheduled for, %d seconds later.", Duration.between(this.i.get(), this.d.f()).toSeconds());
                this.i = Optional.empty();
            }
        }
    }
}
