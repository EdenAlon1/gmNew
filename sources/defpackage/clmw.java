package defpackage;

import com.google.android.rcs.client.messaging.GetMessagesRequest;
import com.google.android.rcs.client.messaging.GetMessagesResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clmw extends ceut {
    static final GetMessagesRequest c;
    public final errl d;
    public final errl e;
    public final clja f;
    public final clhd g;
    public final clna h;
    public final clie i;
    public final clmz j;
    public final cqoh k;
    public final ffbr l;
    private final errl o;
    private final ctzw p;
    private final BiFunction q;
    private final akvz r;
    private static final cfup m = cfvl.e(cfvl.b, "rcs_engine_get_single_message_max_retry_count", 5);
    private static final cfup n = cfvl.e(cfvl.b, "rcs_engine_get_single_message_retry_delay_seconds", 2);
    public static final cskc a = cskc.g("BugleRcs", "GetMessagesMethod");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/rcs/messaging/handler/GetSingleMessageHandler");

    static {
        eian c2 = GetMessagesRequest.c();
        c2.b(1);
        c = c2.a();
    }

    public clmw(clja cljaVar, ctzw ctzwVar, BiFunction biFunction, clhd clhdVar, clna clnaVar, errl errlVar, errl errlVar2, errl errlVar3, clie clieVar, clmz clmzVar, akvz akvzVar, cqoh cqohVar, ffbr ffbrVar) {
        this.d = errlVar;
        this.o = errlVar2;
        this.f = cljaVar;
        this.e = errlVar3;
        this.p = ctzwVar;
        this.q = biFunction;
        this.g = clhdVar;
        this.h = clnaVar;
        this.i = clieVar;
        this.j = clmzVar;
        this.r = akvzVar;
        this.k = cqohVar;
        this.l = ffbrVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(((Integer) m.e()).intValue());
        l.g(Duration.ofSeconds(((Integer) n.e()).intValue()).toMillis());
        l.f(poa.EXPONENTIAL);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("GetSingleMessageHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return clnc.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final clnc clncVar = (clnc) eyhsVar;
        if (((Boolean) ((cfup) clie.e.get()).e()).booleanValue()) {
            clie clieVar = this.i;
            axad axadVar = clncVar.e;
            if (axadVar == null) {
                axadVar = axad.a;
            }
            clieVar.c(axadVar, bdhg.a, 4, 19);
        }
        final Instant ofEpochMilli = Instant.ofEpochMilli(this.k.a());
        return this.p.a(this.q, RcsMessagingService.class).f(TimeoutException.class, new eroh() { // from class: clmp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                TimeoutException timeoutException = (TimeoutException) obj;
                if (dizg.v()) {
                    clmw.this.g.b.c("Bugle.MessagingService.GetMessages.Binder.OnDemand.Connect.Timeout.Count");
                }
                return elfo.d(timeoutException);
            }
        }, this.e).h(new emwl() { // from class: clmq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                clmw clmwVar = clmw.this;
                RcsMessagingService rcsMessagingService = (RcsMessagingService) obj;
                if (dizg.v()) {
                    Instant instant = ofEpochMilli;
                    clhd clhdVar = clmwVar.g;
                    clhdVar.b.g("Bugle.MessagingService.GetMessages.Binder.OnDemand.Connect.Latency", Duration.between(instant, Instant.ofEpochMilli(clmwVar.k.a())).toMillis());
                }
                if (((Boolean) ((cfup) clie.e.get()).e()).booleanValue()) {
                    clnc clncVar2 = clncVar;
                    clie clieVar2 = clmwVar.i;
                    axad axadVar2 = clncVar2.e;
                    if (axadVar2 == null) {
                        axadVar2 = axad.a;
                    }
                    clieVar2.c(axadVar2, bdhg.a, 9, 19);
                }
                return rcsMessagingService.getMessages(clmw.c);
            }
        }, this.o).i(new eroh() { // from class: clmr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                elfl e;
                GetMessagesResponse getMessagesResponse = (GetMessagesResponse) obj;
                if (getMessagesResponse == null) {
                    clmw.a.r("Null response from getMessages. RCS Engine might not be ready");
                    return elfo.e(ceyt.m());
                }
                final clmw clmwVar = clmw.this;
                if (MessagingResult.d.equals(getMessagesResponse.a())) {
                    engw b2 = getMessagesResponse.b();
                    clmwVar.g.b(b2.size());
                    if (b2.isEmpty()) {
                        csjb e2 = clmw.a.e();
                        e2.I("Fetching incoming RCS messages successful but no messages returned from GetSingleMessageHandler");
                        e2.r();
                        e = elfo.e(Optional.empty());
                    } else {
                        if (b2.size() > 1) {
                            throw new IllegalStateException("Unexpected number of messages: " + b2.size());
                        }
                        MessageNotification messageNotification = (MessageNotification) b2.get(0);
                        if (dizg.v()) {
                            Optional d = messageNotification.d();
                            final clhd clhdVar = clmwVar.g;
                            clhdVar.getClass();
                            d.ifPresent(new Consumer() { // from class: clmk
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj2) {
                                    clhd clhdVar2 = clhd.this;
                                    Duration between = Duration.between((Instant) obj2, Instant.ofEpochMilli(clhdVar2.c.a()));
                                    if (Duration.ZERO.compareTo(between) > 0) {
                                        clhd.a.m("Skipping UMA histogram update for invalid incoming message queuing duration");
                                    } else {
                                        clhdVar2.b.g("Bugle.MessagingService.GetMessages.Queuing.Latency", between.toMillis());
                                    }
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                        final bdhg a2 = bdhg.a(messageNotification.b().h());
                        e = clmwVar.f.a(messageNotification).h(new emwl() { // from class: clml
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return Optional.of((awxk) obj2);
                            }
                        }, clmwVar.e).e(IllegalArgumentException.class, new emwl() { // from class: clmm
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                csjb e3 = clmw.a.e();
                                e3.I("Ignoring invalid incoming RCS message");
                                e3.h(bdhg.this);
                                e3.s((IllegalArgumentException) obj2);
                                return Optional.empty();
                            }
                        }, clmwVar.e);
                    }
                } else {
                    csjb e3 = clmw.a.e();
                    e3.I("Fetching incoming RCS messages failed");
                    e3.y("errorCode", getMessagesResponse.a().b());
                    e3.r();
                    e = elfo.e(Optional.empty());
                }
                return e.i(new eroh() { // from class: clmi
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        cfkl k;
                        Optional optional = (Optional) obj2;
                        if (optional.isEmpty()) {
                            return elfo.e(ceyt.k());
                        }
                        final clmw clmwVar2 = clmw.this;
                        final awxk awxkVar = (awxk) optional.get();
                        final bdhg a3 = bdhg.a(awxkVar.l);
                        if (((Boolean) ((cfup) clie.f.get()).e()).booleanValue()) {
                            clmwVar2.i.b(a3, 4, 20);
                        }
                        clmz clmzVar = clmwVar2.j;
                        awui awuiVar = awxkVar.g;
                        if (awuiVar == null) {
                            awuiVar = awui.a;
                        }
                        awuh b3 = awuh.b(awuiVar.c);
                        if (b3 == null) {
                            b3 = awuh.UNKNOWN_TYPE;
                        }
                        if (b3.equals(awuh.GROUP)) {
                            k = clmwVar2.k(awxkVar.m);
                        } else {
                            awui awuiVar2 = awxkVar.g;
                            if (awuiVar2 == null) {
                                awuiVar2 = awui.a;
                            }
                            k = clmwVar2.k(avki.a(awuiVar2));
                        }
                        final elfl b4 = ((cevh) clmzVar.a.b()).b(ceyr.h("post_incoming_message_to_chat_api", awxkVar, k));
                        awui awuiVar3 = awxkVar.g;
                        if (awuiVar3 == null) {
                            awuiVar3 = awui.a;
                        }
                        awuh b5 = awuh.b(awuiVar3.c);
                        if (b5 == null) {
                            b5 = awuh.UNKNOWN_TYPE;
                        }
                        final elfl e4 = !b5.equals(awuh.GROUP) ? elfo.e(false) : elfo.g(new Callable() { // from class: clmj
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return Boolean.valueOf(!((bczy) clmw.this.l.b()).ag(awxkVar.m));
                            }
                        }, clmwVar2.d);
                        return elfo.k(b4, e4).b(new erog() { // from class: clmv
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                cskc cskcVar = clmw.a;
                                cevg cevgVar = (cevg) erqt.q(elfl.this);
                                if (!((Boolean) erqt.q(e4)).booleanValue()) {
                                    return cevgVar.a().h(new emwl() { // from class: clmu
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj3) {
                                            cskc cskcVar2 = clmw.a;
                                            return ((ceyt) obj3).e() ? ceyt.i() : ceyt.k();
                                        }
                                    }, erpp.a);
                                }
                                awxk awxkVar2 = awxkVar;
                                enrr enrrVar = (enrr) clmw.b.j();
                                enrrVar.Y(csux.e, awxkVar2.l);
                                enrrVar.Y(csux.p, bdgq.b(awxkVar2.m));
                                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/messaging/handler/GetSingleMessageHandler", "enqueueAndWaitForResultIfGroupConversationExists", 351, "GetSingleMessageHandler.java")).q("Group conversation missing, not waiting for message processing");
                                return cevgVar.b().h(new emwl() { // from class: clmt
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        cskc cskcVar2 = clmw.a;
                                        return ceyt.i();
                                    }
                                }, erpp.a);
                            }
                        }, clmwVar2.e).h(new emwl() { // from class: clmh
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                ceyt ceytVar = (ceyt) obj3;
                                if (((Boolean) ((cfup) clie.f.get()).e()).booleanValue()) {
                                    clmw.this.i.b(a3, 5, 20);
                                }
                                return ceytVar;
                            }
                        }, clmwVar2.e);
                    }
                }, clmwVar.e);
            }
        }, this.d).h(new emwl() { // from class: clms
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ceyt ceytVar = (ceyt) obj;
                if (ceytVar.e()) {
                    clnc clncVar2 = clncVar;
                    if (clncVar2.d) {
                        clmw clmwVar = clmw.this;
                        cetp cetpVar = new cetp();
                        cetpVar.b = "perform_catch_up_work_item_dedup_tag";
                        clmwVar.h.a(clncVar2, cetpVar.a());
                    }
                }
                return ceytVar;
            }
        }, this.e).e(eiby.class, new emwl() { // from class: clmg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                clmw.a.s("MessagingService.GetMessages rejected request", (eiby) obj);
                return ceyt.m();
            }
        }, this.e).e(TimeoutException.class, new emwl() { // from class: clmn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                clmw.a.s("MessagingService. connection timed out", (TimeoutException) obj);
                return ceyt.m();
            }
        }, this.e).e(cual.class, new emwl() { // from class: clmo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                clmw.a.s("MessagingService connection failed", (cual) obj);
                return ceyt.m();
            }
        }, this.e);
    }

    public final cfkl k(String str) {
        cetp cetpVar = new cetp();
        cetpVar.a = Long.toString(this.r.c(str));
        return cetpVar.a();
    }
}
