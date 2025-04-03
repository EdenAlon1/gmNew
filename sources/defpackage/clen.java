package defpackage;

import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clen implements ejny {
    public static final cfup a = cfvl.f(cfvl.b, "rcs_limbo_messages_resolver_worker_frequency_hours", 6);
    private final ffbr b;

    public clen(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(WorkerParameters workerParameters) {
        final cleh clehVar = (cleh) this.b.b();
        return (!clehVar.m.a() ? clehVar.a().i(new eroh() { // from class: cldo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final cleh clehVar2 = cleh.this;
                long epochMilli = clehVar2.e.f().minus(cleh.b).toEpochMilli();
                String[] strArr = bjjn.a;
                final bjjm bjjmVar = new bjjm();
                bjjmVar.aq(new dtwe("messages.message_protocol", 1, 3));
                bjjmVar.f(cleh.c);
                bjjmVar.e(epochMilli);
                int intValue = bjjn.c().intValue();
                if (intValue < 10007) {
                    dtub.w("conv_type", intValue);
                }
                bjjmVar.aq(new dtwe("conversations.conv_type", 1, 0));
                int intValue2 = bjjn.c().intValue();
                if (intValue2 < 12001) {
                    dtub.w("has_ea2p_bot_recipient", intValue2);
                }
                bjjmVar.aq(new dtwe("conversations.has_ea2p_bot_recipient", 1, 0));
                return elfo.g(new Callable() { // from class: cldt
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        bjji a2 = ((bigl) cleh.this.k.b()).a();
                        a2.e(bjjmVar);
                        return a2.b().D();
                    }
                }, clehVar2.f);
            }
        }, clehVar.g).i(new eroh() { // from class: cldp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Stream distinct = ((Stream) obj).limit(200L).map(new Function() { // from class: clec
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        cskc cskcVar = cleh.a;
                        return Optional.ofNullable(((bigm) obj2).h());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new cldw()).distinct();
                final cleh clehVar2 = cleh.this;
                Stream map = distinct.map(new Function() { // from class: cled
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((aolr) cleh.this.j.b()).r((String) ((Optional) obj2).get());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).map(new clea(clehVar2));
                try {
                    int i = engw.d;
                    final engw engwVar = (engw) map.collect(endq.a);
                    elfl a2 = engwVar.isEmpty() ? ((clej) ((Optional) clehVar2.i.b()).get()).a() : elfo.j(engwVar).a(new Callable() { // from class: clee
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            engw engwVar2 = engwVar;
                            int size = engwVar2.size();
                            int i2 = 0;
                            for (int i3 = 0; i3 < size; i3++) {
                                i2 += ((Integer) erqt.q((elfl) engwVar2.get(i3))).intValue();
                            }
                            if (i2 <= 0) {
                                return null;
                            }
                            cleh.this.b(i2);
                            return null;
                        }
                    }, clehVar2.f);
                    if (map != null) {
                        map.close();
                    }
                    return a2;
                } catch (Throwable th) {
                    if (map != null) {
                        try {
                            map.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }, clehVar.g) : clehVar.a().i(new eroh() { // from class: clef
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final cleh clehVar2 = cleh.this;
                final long epochMilli = clehVar2.e.f().minus(cleh.b).toEpochMilli();
                return elfo.g(new Callable() { // from class: cldq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        bigl biglVar = (bigl) cleh.this.k.b();
                        buxo d = MessagesTable.d();
                        d.c(MessagesTable.c.a);
                        bsob e = bsom.e();
                        e.u();
                        e.i(new Function() { // from class: cldr
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bsol bsolVar = (bsol) obj2;
                                cskc cskcVar = cleh.a;
                                bsolVar.j(0);
                                bsolVar.p();
                                return bsolVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        buxo buxoVar = (buxo) d.j(dtvz.i(e.b(), bsom.c.a, MessagesTable.c.b));
                        final long j = epochMilli;
                        buxoVar.h(new Function() { // from class: clds
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                buxz buxzVar = (buxz) obj2;
                                cskc cskcVar = cleh.a;
                                buxzVar.K(3);
                                buxzVar.ai(cleh.c);
                                buxzVar.S(j);
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        return biglVar.f(true, buxoVar).b().D();
                    }
                }, clehVar2.f);
            }
        }, clehVar.g).i(new eroh() { // from class: cleg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Stream distinct = ((Stream) obj).limit(200L).map(new Function() { // from class: cldl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        cskc cskcVar = cleh.a;
                        return Optional.ofNullable(((bgmp) obj2).h());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new cldw()).distinct();
                final cleh clehVar2 = cleh.this;
                Stream map = distinct.map(new Function() { // from class: cldz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((aolr) cleh.this.j.b()).r((String) ((Optional) obj2).get());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).map(new clea(clehVar2));
                try {
                    int i = engw.d;
                    final engw engwVar = (engw) map.collect(endq.a);
                    elfl a2 = engwVar.isEmpty() ? ((clej) ((Optional) clehVar2.i.b()).get()).a() : elfo.j(engwVar).a(new Callable() { // from class: cleb
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            engw engwVar2 = engwVar;
                            int size = engwVar2.size();
                            int i2 = 0;
                            for (int i3 = 0; i3 < size; i3++) {
                                i2 += ((Integer) erqt.q((elfl) engwVar2.get(i3))).intValue();
                            }
                            if (i2 <= 0) {
                                return null;
                            }
                            cleh.this.b(i2);
                            return null;
                        }
                    }, clehVar2.f);
                    if (map != null) {
                        map.close();
                    }
                    return a2;
                } catch (Throwable th) {
                    if (map != null) {
                        try {
                            map.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }, clehVar.g)).h(new emwl() { // from class: clem
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cfup cfupVar = clen.a;
                return new ppp();
            }
        }, erpp.a);
    }
}
