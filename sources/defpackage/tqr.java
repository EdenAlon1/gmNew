package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqr {
    public static final cskc a = cskc.g("BugleCms", "ConversationSync");
    public final tsc b;
    public final errl c;
    public final ccie d;
    public final crty e;
    public final crwy f;
    public final errl g;

    public tqr(crty crtyVar, crwy crwyVar, tsc tscVar, ccie ccieVar, errl errlVar, errl errlVar2) {
        this.d = ccieVar;
        this.e = crtyVar;
        this.f = crwyVar;
        this.b = tscVar;
        this.c = errlVar;
        this.g = errlVar2;
    }

    public final elfl a(final String str, final String str2) {
        return (elfl) bsom.h(str, new Function() { // from class: tqi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                csjb c = tqr.a.c();
                c.A(cdii.t.a, str2);
                c.A(cdii.v.a, "Ignore");
                c.A(cdii.w.a, str);
                c.A(cdii.x.a, "Conversation already in db");
                c.I("Conversation Sync");
                c.r();
                return elfo.e(null);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Supplier() { // from class: tqj
            @Override // java.util.function.Supplier
            public final Object get() {
                final tqr tqrVar = tqr.this;
                crty crtyVar = tqrVar.e;
                final String str3 = str;
                final String str4 = str2;
                return crtyVar.m(str3).i(new eroh() { // from class: tqk
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final tqr tqrVar2 = tqr.this;
                        final eswr eswrVar = (eswr) obj;
                        try {
                            eshz a2 = tqrVar2.f.a(eswrVar);
                            final String str5 = str4;
                            final eygr eygrVar = a2.g;
                            bvvn e = ParticipantsTable.e();
                            e.z("getParticipantsInDb");
                            e.h(new Function() { // from class: tqo
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    bvvw bvvwVar = (bvvw) obj2;
                                    bvvwVar.e(eygrVar);
                                    return bvvwVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            e.f(new Function() { // from class: tqp
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return ((bvtg) obj2).E;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            return e.b().w().h(new emwl() { // from class: tqq
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    final HashSet hashSet = new HashSet();
                                    Collection.EL.stream((engw) obj2).forEach(new Consumer() { // from class: tqh
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void o(Object obj3) {
                                            String L = ((ParticipantsTable.BindData) obj3).L();
                                            if (TextUtils.isEmpty(L)) {
                                                return;
                                            }
                                            hashSet.add(L);
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    return hashSet;
                                }
                            }, tqrVar2.g).i(new eroh() { // from class: tqd
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    final HashSet hashSet = (HashSet) obj2;
                                    Stream filter = Collection.EL.stream(eygrVar).filter(new Predicate() { // from class: tqe
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
                                            return !hashSet.contains((String) obj3);
                                        }
                                    });
                                    final tqr tqrVar3 = tqr.this;
                                    final String str6 = str5;
                                    Stream map = filter.map(new Function() { // from class: tqf
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj3) {
                                            return tqr.this.b.a((String) obj3, str6);
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    int i = engw.d;
                                    elfn l = elfo.l((Iterable) map.collect(endq.a));
                                    final eswr eswrVar2 = eswrVar;
                                    return l.a(new Callable() { // from class: tqg
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            return eswr.this;
                                        }
                                    }, tqrVar3.g);
                                }
                            }, tqrVar2.c);
                        } catch (eygu e2) {
                            throw new IllegalStateException("Error parsing conversation extended details", e2);
                        }
                    }
                }, tqrVar.c).i(new eroh() { // from class: tql
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return tqr.this.d.a((eswr) obj, false);
                    }
                }, tqrVar.g).h(new emwl() { // from class: tqm
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        csjb c = tqr.a.c();
                        c.A(cdii.t.a, str4);
                        c.A(cdii.v.a, "Created conversation in DB");
                        c.A(cdii.w.a, str3);
                        c.I("Conversation Sync");
                        c.r();
                        return null;
                    }
                }, tqrVar.c).f(Throwable.class, new eroh() { // from class: tqn
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        Throwable th = (Throwable) obj;
                        boolean equals = Status.c(th).getCode().equals(Status.Code.NOT_FOUND);
                        String str5 = str4;
                        String str6 = str3;
                        if (equals) {
                            csjb e = tqr.a.e();
                            e.A(cdii.t.a, str5);
                            e.A(cdii.v.a, "Ignore: Conversation not found in CMS");
                            e.A(cdii.w.a, str6);
                            e.I("Conversation Sync");
                            e.r();
                            return elfo.e(null);
                        }
                        csjb e2 = tqr.a.e();
                        e2.A(cdii.t.a, str5);
                        e2.A(cdii.v.a, "Exception while processing event");
                        e2.A(cdii.w.a, str6);
                        e2.I("Conversation Sync");
                        e2.s(th);
                        return elfo.d(th);
                    }
                }, erpp.a);
            }
        });
    }
}
