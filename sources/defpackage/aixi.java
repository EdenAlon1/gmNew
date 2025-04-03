package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aixi extends ceut {
    private final errm a;
    private final aiwf b;

    public aixi(errm errmVar, aiwf aiwfVar) {
        this.a = errmVar;
        this.b = aiwfVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("P13nWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return aixg.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl i;
        if (((Boolean) aixc.a.e()).booleanValue()) {
            final aiwj aiwjVar = (aiwj) this.b;
            final aiwc aiwcVar = aiwjVar.c;
            final elfl h = elfo.h(new erog() { // from class: aivt
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    String[] strArr = bvar.a;
                    bvao bvaoVar = new bvao(bvar.a);
                    bvaoVar.z("getDaysWhichHaveFeatures");
                    bvaoVar.t();
                    bvaoVar.d(new Function() { // from class: aiwa
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((bvac) obj).b;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bvaoVar.c(new bval(bvar.c.b));
                    bvaoVar.x(((Integer) aixc.d.e()).intValue());
                    return bvaoVar.b().w().h(new emwl() { // from class: aiwb
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            final HashSet hashSet = new HashSet();
                            Collection.EL.stream((engw) obj).forEach(new Consumer() { // from class: aivz
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj2) {
                                    buzp buzpVar = (buzp) obj2;
                                    buzpVar.az(1, "date");
                                    hashSet.add(buzpVar.b);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            return hashSet;
                        }
                    }, aiwc.this.c);
                }
            }, aiwcVar.b);
            final Instant b = bdgt.b(aiwcVar.a.f().toEpochMilli());
            final elfl h2 = elfo.h(new erog() { // from class: aivx
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    buxo d = MessagesTable.d();
                    d.z("getDaysWhichHaveSentMessages");
                    d.t();
                    final Instant instant = b;
                    d.h(new Function() { // from class: aivu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            buxzVar.aa(Instant.this.minus(Duration.ofDays(((Integer) aixc.d.e()).intValue())).toEpochMilli());
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    d.f(new Function() { // from class: aivv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((buum) obj).g;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return d.b().w().h(new emwl() { // from class: aivw
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            final HashSet hashSet = new HashSet();
                            Collection.EL.stream((engw) obj).forEach(new Consumer() { // from class: aivy
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj2) {
                                    hashSet.add(bdgt.b(((MessagesTable.BindData) obj2).y()));
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            return hashSet;
                        }
                    }, aiwc.this.c);
                }
            }, aiwcVar.b);
            i = elfo.k(h, h2).a(new Callable() { // from class: aivs
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Set set = (Set) erqt.q(elfl.this);
                    Set set2 = (Set) erqt.q(h2);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    for (int intValue = ((Integer) aixc.d.e()).intValue(); intValue > 0; intValue--) {
                        Instant minus = b.minus(Duration.ofDays(intValue));
                        if (set2.contains(minus) && !set.contains(minus)) {
                            arrayDeque.add(minus);
                        }
                    }
                    return arrayDeque;
                }
            }, aiwcVar.c).i(new eroh() { // from class: aiwh
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return aiwj.this.a((Queue) obj);
                }
            }, aiwjVar.b);
        } else {
            i = elfo.e(null);
        }
        return i.h(new emwl() { // from class: aixh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ceyt.i();
            }
        }, this.a);
    }
}
