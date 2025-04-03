package defpackage;

import android.net.Uri;
import android.provider.Telephony;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adfw extends adbn {
    public static final entd a = entd.c("MessagingApiServiceImpl");
    static final cfup b = cfvl.e(cfvl.b, "external_api_still_pending_log_timeout_seconds", 60);
    public final ambs c;
    public final cqoh d;
    public final ffbr e;
    public final errm f;
    public final errl g;
    public final errm h;
    public final adgd i;
    public final adeh j;
    public final ffbr k;
    public final ffbr l;
    public final comc m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final asix q;
    public final ffbr r;
    public final adea s;
    private final ffbr t;

    public adfw(ambs ambsVar, cqoh cqohVar, adgd adgdVar, adeh adehVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, errm errmVar, errl errlVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, errm errmVar2, adea adeaVar, ffbr ffbrVar8, asix asixVar, ffbr ffbrVar9) {
        this.c = ambsVar;
        this.d = cqohVar;
        this.i = adgdVar;
        this.j = adehVar;
        this.e = ffbrVar;
        this.k = ffbrVar2;
        this.l = ffbrVar3;
        this.t = ffbrVar5;
        this.f = errmVar;
        this.g = errlVar;
        comy comyVar = (comy) ffbrVar4.b();
        comu c = comv.c();
        c.d(comb.CMC_USER_CONSENT_SETTINGS);
        c.f(akoh.a);
        this.m = comyVar.a(c.a());
        this.h = errmVar2;
        this.n = ffbrVar6;
        this.o = ffbrVar7;
        this.s = adeaVar;
        this.p = ffbrVar8;
        this.q = asixVar;
        this.r = ffbrVar9;
    }

    public static StatusException p(IllegalArgumentException illegalArgumentException) {
        ((ensz) ((ensz) ((ensz) a.j()).g(illegalArgumentException)).h("com/google/android/apps/messaging/externalapi/service/impl/ExternalMessagingApiServiceImpl", "createIllegalArgument", (char) 394, "ExternalMessagingApiServiceImpl.java")).q("API Request failed with IllegalArgumentException");
        return Status.e.d(illegalArgumentException).withDescription((String) Optional.ofNullable(illegalArgumentException.getMessage()).orElse("")).asException();
    }

    public static boolean q(String str) {
        if (emxe.c(str)) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/externalapi/service/impl/ExternalMessagingApiServiceImpl", "isValidUri", 293, "ExternalMessagingApiServiceImpl.java")).q("Empty Uri");
            return false;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme == null || !scheme.equals(Telephony.Sms.CONTENT_URI.getScheme())) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/externalapi/service/impl/ExternalMessagingApiServiceImpl", "isValidUri", 301, "ExternalMessagingApiServiceImpl.java")).t("Invalid Uri Scheme: %s", parse.getScheme());
            return false;
        }
        String authority = parse.getAuthority();
        if (authority != null && (authority.equals(Telephony.Sms.CONTENT_URI.getAuthority()) || authority.equals(Telephony.Mms.CONTENT_URI.getAuthority()))) {
            return true;
        }
        ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/externalapi/service/impl/ExternalMessagingApiServiceImpl", "isValidUri", 310, "ExternalMessagingApiServiceImpl.java")).t("Invalid Uri Scheme: %s", parse.getAuthority());
        return false;
    }

    private static StatusException u() {
        return Status.i.withDescription("Messaging API service disabled").asException();
    }

    private final void v(String str, final int i, final ffbc ffbcVar, Supplier supplier, final long j) {
        Object obj;
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/externalapi/service/impl/ExternalMessagingApiServiceImpl", "runAsyncWithoutMdeCheck", 441, "ExternalMessagingApiServiceImpl.java")).t("Trace: %s", str);
        final String uuid = UUID.randomUUID().toString();
        this.s.b(uuid, i);
        try {
            ekzz f = eleg.f(str);
            try {
                ekzz f2 = eleg.f("ExternalMessagingApiServiceImpl#asyncFuture");
                try {
                    elfl g = elfl.g(this.h.schedule(eldl.l(new Runnable() { // from class: adek
                        @Override // java.lang.Runnable
                        public final void run() {
                            adfw.this.s.a(uuid, i);
                        }
                    }), ((Integer) b.e()).intValue(), TimeUnit.SECONDS));
                    obj = supplier.get();
                    elfl elflVar = (elfl) obj;
                    elflVar.k(new adfv(g), this.h);
                    elfl h = elflVar.h(new emwl() { // from class: adel
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            ((ensz) adfw.a.n().h("com/google/android/apps/messaging/externalapi/service/impl/ExternalMessagingApiServiceImpl", "runAsyncWithoutMdeCheck", 465, "ExternalMessagingApiServiceImpl.java")).q("Completing api request");
                            ffbc ffbcVar2 = ffbc.this;
                            ffbcVar2.c(obj2);
                            ffbcVar2.a();
                            ((ensz) adfw.a.n().h("com/google/android/apps/messaging/externalapi/service/impl/ExternalMessagingApiServiceImpl", "runAsyncWithoutMdeCheck", 468, "ExternalMessagingApiServiceImpl.java")).q("Completed api request");
                            return fagh.OK;
                        }
                    }, this.f).e(IllegalArgumentException.class, new emwl() { // from class: adem
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            IllegalArgumentException illegalArgumentException = (IllegalArgumentException) obj2;
                            ((ensz) ((ensz) ((ensz) adfw.a.j()).g(illegalArgumentException)).h("com/google/android/apps/messaging/externalapi/service/impl/ExternalMessagingApiServiceImpl", "runAsyncWithoutMdeCheck", (char) 475, "ExternalMessagingApiServiceImpl.java")).q("API Request failed with IllegalArgumentException");
                            ffbc.this.b(adfw.p(illegalArgumentException));
                            return fagh.INVALID_ARGUMENT;
                        }
                    }, this.f).e(Throwable.class, new emwl() { // from class: aden
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            Throwable th = (Throwable) obj2;
                            ((ensz) ((ensz) ((ensz) adfw.a.j()).g(th)).h("com/google/android/apps/messaging/externalapi/service/impl/ExternalMessagingApiServiceImpl", "runAsyncWithoutMdeCheck", (char) 484, "ExternalMessagingApiServiceImpl.java")).q("API Request failed with error");
                            ffbc.this.b(th);
                            return fagh.UNKNOWN;
                        }
                    }, this.f).h(new emwl() { // from class: adeo
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            adfw adfwVar = adfw.this;
                            adfwVar.t(uuid, i, j, adfwVar.d.b(), (fagh) obj2);
                            return true;
                        }
                    }, this.h);
                    f2.b(h);
                    axnw.h(h);
                    f2.close();
                    f.close();
                } finally {
                }
            } finally {
            }
        } catch (IllegalArgumentException e) {
            ffbcVar.b(p(e));
            t(uuid, i, j, this.d.b(), fagh.INVALID_ARGUMENT);
        } catch (Throwable th) {
            ((ensz) ((ensz) ((ensz) a.j()).g(th)).h("com/google/android/apps/messaging/externalapi/service/impl/ExternalMessagingApiServiceImpl", "runAsyncWithoutMdeCheck", (char) 507, "ExternalMessagingApiServiceImpl.java")).q("API Request failed with error");
            ffbcVar.b(th);
            t(uuid, i, j, this.d.b(), fagh.UNKNOWN);
        }
    }

    @Override // defpackage.adbn, defpackage.adbm
    public final void b(final adbf adbfVar, ffbc ffbcVar) {
        r("ExternalMessagingApiServiceImpl#createMmsGroupConversation", 9, ffbcVar, new Supplier() { // from class: adfh
            @Override // java.util.function.Supplier
            public final Object get() {
                adbf adbfVar2 = adbfVar;
                if (adbfVar2.b.size() == 1) {
                    throw new IllegalArgumentException("Must specify more than one destination for group");
                }
                adfw adfwVar = adfw.this;
                return adfwVar.j.a(engw.n(adbfVar2.b));
            }
        });
    }

    @Override // defpackage.adbn, defpackage.adbm
    public final void c(final adbh adbhVar, ffbc ffbcVar) {
        r("ExternalMessagingApiServiceImpl#createOneOnOneConversation", 4, ffbcVar, new Supplier() { // from class: adfc
            @Override // java.util.function.Supplier
            public final Object get() {
                return adfw.this.j.a(engw.r(adbhVar.b));
            }
        });
    }

    @Override // defpackage.adbn, defpackage.adbm
    public final void d(final adbj adbjVar, ffbc ffbcVar) {
        s("ExternalMessagingApiServiceImpl#deleteMessage", 6, ffbcVar, new Supplier() { // from class: adfn
            @Override // java.util.function.Supplier
            public final Object get() {
                String str = adbjVar.b;
                if (!adfw.q(str)) {
                    throw new IllegalArgumentException("messageUri is not valid");
                }
                adfw adfwVar = adfw.this;
                MessageCoreData y = ((bdmq) adfwVar.e.b()).y(Uri.parse(str));
                if (y == null) {
                    throw new IllegalArgumentException("Message not found in Bugle");
                }
                if (adfwVar.q.a()) {
                    adfwVar.c.k(Arrays.asList(y.B()), cgrr.EXTERNAL_API_DELETION);
                } else {
                    adfwVar.c.j(Arrays.asList(y.B()));
                }
                return adbl.a;
            }
        });
    }

    @Override // defpackage.adbn, defpackage.adbm
    public final void e(final adbr adbrVar, ffbc ffbcVar) {
        r("ExternalMessagingApiServiceImpl#getRcsGroupMetadata", 12, ffbcVar, new Supplier() { // from class: adeu
            @Override // java.util.function.Supplier
            public final Object get() {
                final adfw adfwVar = adfw.this;
                final adbr adbrVar2 = adbrVar;
                return elfo.g(new Callable() { // from class: adei
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        adfx adfxVar = (adfx) adfw.this.n.b();
                        long j = adbrVar2.b;
                        ConversationIdType a2 = ((ayhm) adfxVar.c.b()).a(cpxu.b(j));
                        if (a2.b()) {
                            throw new IllegalArgumentException(a.y(j, "Conversation with threadId=", " was not found"));
                        }
                        String b2 = emxe.b(((bczy) adfxVar.a.b()).J(a2));
                        List f = ((bdfp) adfxVar.d.b()).f(a2);
                        int i = engw.d;
                        engr engrVar = new engr();
                        Iterator it = f.iterator();
                        while (it.hasNext()) {
                            Optional e = ((aolr) adfxVar.b.b()).q((ParticipantsTable.BindData) it.next()).e();
                            if (e.isPresent()) {
                                engrVar.h(((awui) e.get()).d);
                            } else {
                                engrVar.h("");
                            }
                        }
                        engw g = engrVar.g();
                        adbs adbsVar = (adbs) adbt.a.createBuilder();
                        adbsVar.copyOnWrite();
                        adbt adbtVar = (adbt) adbsVar.instance;
                        eygr eygrVar = adbtVar.c;
                        if (!eygrVar.c()) {
                            adbtVar.c = eyfy.mutableCopy(eygrVar);
                        }
                        eydl.addAll(g, adbtVar.c);
                        adbsVar.copyOnWrite();
                        ((adbt) adbsVar.instance).b = b2;
                        return (adbt) adbsVar.build();
                    }
                }, adfwVar.f);
            }
        });
    }

    @Override // defpackage.adbn, defpackage.adbm
    public final void f(final addi addiVar, ffbc ffbcVar) {
        s("ExternalMessagingApiServiceImpl#getXmsConfigs", 5, ffbcVar, new Supplier() { // from class: adfa
            @Override // java.util.function.Supplier
            public final Object get() {
                return ((adgf) adfw.this.k.b()).a(addiVar.b);
            }
        });
    }

    @Override // defpackage.adbn, defpackage.adbm
    public final void g(final adcg adcgVar, ffbc ffbcVar) {
        r("ExternalMessagingApiServiceImpl#markConversationAsRead", 2, ffbcVar, new Supplier() { // from class: adfd
            @Override // java.util.function.Supplier
            public final Object get() {
                final adfw adfwVar = adfw.this;
                final adcg adcgVar2 = adcgVar;
                elfl g = elfo.g(new Callable() { // from class: adeq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new BugleConversationId(((ayhm) adfw.this.r.b()).a(new cpxu(adcgVar2.b)));
                    }
                }, adfwVar.g);
                final ambs ambsVar = adfwVar.c;
                ambsVar.getClass();
                return g.i(new eroh() { // from class: ader
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ambs.this.e((BugleConversationId) obj);
                    }
                }, adfwVar.f).h(new emwl() { // from class: ades
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        entd entdVar = adfw.a;
                        return adci.a;
                    }
                }, adfwVar.f);
            }
        });
    }

    @Override // defpackage.adbn, defpackage.adbm
    public final void h(final adck adckVar, ffbc ffbcVar) {
        r("ExternalMessagingApiServiceImpl#markMessagesAsRead", 10, ffbcVar, new Supplier() { // from class: adff
            @Override // java.util.function.Supplier
            public final Object get() {
                eygr eygrVar = adckVar.b;
                Stream map = Collection.EL.stream(eygrVar).filter(new Predicate() { // from class: adfq
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
                        return adfw.q((String) obj);
                    }
                }).map(new Function() { // from class: adfr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Uri.parse((String) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                engw engwVar = (engw) map.collect(endq.a);
                if (engwVar.size() != eygrVar.size()) {
                    ((ensz) adfw.a.a(Level.WARNING).h("com/google/android/apps/messaging/externalapi/service/impl/ExternalMessagingApiServiceImpl", "markMessagesAsRead", 239, "ExternalMessagingApiServiceImpl.java")).J("Mark messages as read received %d uris, and %d of them are valid: %s", Integer.valueOf(eygrVar.size()), Integer.valueOf(engwVar.size()), Collection.EL.stream(engwVar).map(new Function() { // from class: adfs
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((Uri) obj).toString();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).reduce(", ", new BinaryOperator() { // from class: adft
                        public final /* synthetic */ BiFunction andThen(Function function) {
                            return BiFunction$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            return ((String) obj).concat((String) obj2);
                        }
                    }));
                }
                adfw adfwVar = adfw.this;
                return adfwVar.c.f(engwVar).h(new emwl() { // from class: adfu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        entd entdVar = adfw.a;
                        return adcm.a;
                    }
                }, adfwVar.f);
            }
        });
    }

    @Override // defpackage.adbn, defpackage.adbm
    public final void i(final adcr adcrVar, ffbc ffbcVar) {
        r("ExternalMessagingApiServiceImpl#scheduleMessage", 14, ffbcVar, new Supplier() { // from class: adfg
            @Override // java.util.function.Supplier
            public final Object get() {
                final adcr adcrVar2 = adcrVar;
                int i = adcrVar2.b;
                if ((i & 2) == 0) {
                    throw new IllegalArgumentException("Scheduled time must be specified");
                }
                if ((i & 1) == 0) {
                    throw new IllegalArgumentException("Message content must be specified");
                }
                adde addeVar = adcrVar2.c;
                if (addeVar == null) {
                    addeVar = adde.a;
                }
                adgd.c(addeVar);
                adde addeVar2 = adcrVar2.c;
                if (addeVar2 == null) {
                    addeVar2 = adde.a;
                }
                final adfw adfwVar = adfw.this;
                adgd adgdVar = adfwVar.i;
                return adgdVar.b(addeVar2, adgdVar.a(addeVar2)).i(new eroh() { // from class: adfi
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        MessageCoreData messageCoreData = (MessageCoreData) obj;
                        coja cojaVar = (coja) adfw.this.p.b();
                        eyja eyjaVar = adcrVar2.d;
                        if (eyjaVar == null) {
                            eyjaVar = eyja.a;
                        }
                        return cojaVar.b(messageCoreData, eykj.d(eyjaVar));
                    }
                }, adfwVar.h).h(new emwl() { // from class: adfj
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        entd entdVar = adfw.a;
                        return adct.a;
                    }
                }, adfwVar.h);
            }
        });
    }

    @Override // defpackage.adbn, defpackage.adbm
    public final void j(final adcy adcyVar, ffbc ffbcVar) {
        r("ExternalMessagingApiServiceImpl#searchMessage", 13, ffbcVar, new Supplier() { // from class: adfk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ((addp) adfw.this.o.b()).a(adcyVar);
            }
        });
    }

    @Override // defpackage.adbn, defpackage.adbm
    public final void k(final adde addeVar, ffbc ffbcVar) {
        r("ExternalMessagingApiServiceImpl#sendMessage", 3, ffbcVar, new Supplier() { // from class: adfb
            @Override // java.util.function.Supplier
            public final Object get() {
                final adde addeVar2 = addeVar;
                if (addeVar2.g.isEmpty()) {
                    throw new IllegalArgumentException("Id must be specified");
                }
                final adfw adfwVar = adfw.this;
                UUID.fromString(addeVar2.g);
                adgd.c(addeVar2);
                adgd adgdVar = adfwVar.i;
                return adgdVar.b(addeVar2, adgdVar.a(addeVar2)).i(new eroh() { // from class: adet
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        MessageCoreData messageCoreData = (MessageCoreData) obj;
                        MessageUsageStatisticsData y = messageCoreData.y();
                        y.s(eooi.EXTERNAL_MESSAGING_API);
                        adfw adfwVar2 = adfw.this;
                        return adfwVar2.c.g(addeVar2.c, messageCoreData, adfwVar2.d.a(), y);
                    }
                }, adfwVar.f).h(new emwl() { // from class: adfe
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        entd entdVar = adfw.a;
                        return addg.a;
                    }
                }, adfwVar.f);
            }
        });
    }

    @Override // defpackage.adbn, defpackage.adbm
    public final void l(ffbc ffbcVar) {
        r("ExternalMessagingApiServiceImpl#getAppSettings", 8, ffbcVar, new Supplier() { // from class: adev
            @Override // java.util.function.Supplier
            public final Object get() {
                final adfw adfwVar = adfw.this;
                return elfo.g(new Callable() { // from class: adfp
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        adap adapVar = (adap) adfw.this.l.b();
                        aday adayVar = (aday) adaz.a.createBuilder();
                        int i = 3;
                        int i2 = true != ((cmgr) adapVar.c.b()).n() ? 3 : 4;
                        adayVar.copyOnWrite();
                        ((adaz) adayVar.instance).c = i2 - 2;
                        int i3 = ((ckge) ((csjk) adapVar.b.b()).a()).q() ? 3 : (((ckge) ((csjk) adapVar.b.b()).a()).r() || ((ckge) ((csjk) adapVar.b.b()).a()).t()) ? 4 : 2;
                        adayVar.copyOnWrite();
                        ((adaz) adayVar.instance).b = i3 - 2;
                        int a2 = ((ckby) adapVar.a.b()).a(ckcf.b);
                        if (a2 == -2) {
                            a2 = Integer.MIN_VALUE;
                        }
                        adayVar.copyOnWrite();
                        ((adaz) adayVar.instance).d = a2;
                        String str = (String) dimn.E().u().a();
                        if (!emuz.e("Crane", str)) {
                            if (emuz.e("UP_T", str)) {
                                i = 4;
                            } else {
                                i = 5;
                                if (!emuz.e("UP", str) && !emuz.e("UP_2.3", str)) {
                                    i = 2;
                                }
                            }
                        }
                        adayVar.copyOnWrite();
                        ((adaz) adayVar.instance).e = i - 2;
                        return (adaz) adayVar.build();
                    }
                }, adfwVar.g);
            }
        });
    }

    @Override // defpackage.adbn, defpackage.adbm
    public final void m(ffbc ffbcVar) {
        s("ExternalMessagingApiServiceImpl#getServiceCapabilities", 15, ffbcVar, new Supplier() { // from class: adej
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.Supplier
            public final Object get() {
                entd entdVar = adfw.a;
                adbw adbwVar = (adbw) adby.a.createBuilder();
                engw engwVar = adge.a;
                adbwVar.copyOnWrite();
                adby adbyVar = (adby) adbwVar.instance;
                eygi eygiVar = adbyVar.b;
                if (!eygiVar.c()) {
                    adbyVar.b = eyfy.mutableCopy(eygiVar);
                }
                enqv it = engwVar.iterator();
                while (it.hasNext()) {
                    adbyVar.b.h(((adbx) it.next()).a());
                }
                return (adby) adbwVar.build();
            }
        });
    }

    @Override // defpackage.adbn, defpackage.adbm
    public final void n(ffbc ffbcVar) {
        r("ExternalMessagingApiServiceImpl#getThreadIdsForAllRcsGroups", 11, ffbcVar, new Supplier() { // from class: adew
            @Override // java.util.function.Supplier
            public final Object get() {
                return elfo.g(new Callable() { // from class: adfo
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        entd entdVar = adfw.a;
                        ekzz f = eleg.f("ExternalMessagingApiServiceImpl#getAllRcsGroupThreadIds");
                        try {
                            bsob e = bsom.e();
                            e.z("getSmsThreadIdsForAllRcsGroups");
                            e.r();
                            e.i(new Function() { // from class: adey
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bsol bsolVar = (bsol) obj;
                                    entd entdVar2 = adfw.a;
                                    bsolVar.j(2);
                                    int[] iArr = {0, 1};
                                    int intValue = bsom.g().intValue();
                                    if (intValue < 10006) {
                                        dtub.w("join_state", intValue);
                                    }
                                    bsolVar.aq(new dtrw("conversations.join_state", 3, bsol.au(iArr), true));
                                    return bsolVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            e.g(new Function() { // from class: adez
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    entd entdVar2 = adfw.a;
                                    return ((bskp) obj).b;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            engw g = e.b().g();
                            f.close();
                            adcb adcbVar = (adcb) adcc.a.createBuilder();
                            Stream map = Collection.EL.stream(g).map(new Function() { // from class: adfm
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return Long.valueOf(cpxv.a((cpxu) obj));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i = engw.d;
                            Iterable iterable = (Iterable) map.collect(endq.a);
                            adcbVar.copyOnWrite();
                            adcc adccVar = (adcc) adcbVar.instance;
                            eygl eyglVar = adccVar.b;
                            if (!eyglVar.c()) {
                                adccVar.b = eyfy.mutableCopy(eyglVar);
                            }
                            eydl.addAll(iterable, adccVar.b);
                            return (adcc) adcbVar.build();
                        } catch (Throwable th) {
                            try {
                                f.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }, adfw.this.f);
            }
        });
    }

    @Override // defpackage.adbn, defpackage.adbm
    public final void o(ffbc ffbcVar) {
        ffbr ffbrVar = this.t;
        long b2 = this.d.b();
        if (((adaq) ffbrVar.b()).b()) {
            v("ExternalMessagingApiServiceImpl#getUserConsentSetting", 7, ffbcVar, new Supplier() { // from class: adex
                @Override // java.util.function.Supplier
                public final Object get() {
                    adfw adfwVar = adfw.this;
                    return adfwVar.m.h().h(new emwl() { // from class: adfl
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            akoh akohVar = (akoh) obj;
                            entd entdVar = adfw.a;
                            adba adbaVar = (adba) adbb.a.createBuilder();
                            boolean z = false;
                            if (akohVar != null && akohVar.c) {
                                z = true;
                            }
                            adbaVar.copyOnWrite();
                            ((adbb) adbaVar.instance).b = z;
                            return (adbb) adbaVar.build();
                        }
                    }, adfwVar.h);
                }
            }, b2);
        } else {
            ffbcVar.b(u());
        }
    }

    final void r(String str, int i, ffbc ffbcVar, Supplier supplier) {
        ffbr ffbrVar = this.t;
        long b2 = this.d.b();
        if (((adaq) ffbrVar.b()).a()) {
            v(str, i, ffbcVar, supplier, b2);
        } else {
            ffbcVar.b(u());
        }
    }

    final void s(String str, final int i, ffbc ffbcVar, Supplier supplier) {
        fagh faghVar;
        Object obj;
        long b2 = this.d.b();
        if (!((adaq) this.t.b()).a()) {
            ffbcVar.b(u());
            return;
        }
        final String uuid = UUID.randomUUID().toString();
        this.s.b(uuid, i);
        try {
            ekzz f = eleg.f(str);
            try {
                elfl g = elfl.g(this.h.schedule(eldl.l(new Runnable() { // from class: adep
                    @Override // java.lang.Runnable
                    public final void run() {
                        adfw.this.s.a(uuid, i);
                    }
                }), ((Integer) b.e()).intValue(), TimeUnit.SECONDS));
                try {
                    obj = supplier.get();
                    g.cancel(false);
                    ffbcVar.c(obj);
                    ffbcVar.a();
                    faghVar = fagh.OK;
                    f.close();
                } catch (Throwable th) {
                    g.cancel(false);
                    throw th;
                }
            } finally {
            }
        } catch (IllegalArgumentException e) {
            ffbcVar.b(p(e));
            faghVar = fagh.INVALID_ARGUMENT;
        } catch (Throwable th2) {
            ((ensz) ((ensz) ((ensz) a.j()).g(th2)).h("com/google/android/apps/messaging/externalapi/service/impl/ExternalMessagingApiServiceImpl", "runSync", (char) 380, "ExternalMessagingApiServiceImpl.java")).q("API Request failed with error");
            ffbcVar.b(th2);
            faghVar = fagh.UNKNOWN;
        }
        t(uuid, i, b2, this.d.b(), faghVar);
    }

    public final void t(String str, int i, long j, long j2, fagh faghVar) {
        Duration ofNanos = Duration.ofNanos(j2 - j);
        epao epaoVar = (epao) epap.a.createBuilder();
        epaoVar.copyOnWrite();
        epap epapVar = (epap) epaoVar.instance;
        str.getClass();
        epapVar.b |= 1;
        epapVar.c = str;
        epaoVar.copyOnWrite();
        epap epapVar2 = (epap) epaoVar.instance;
        epapVar2.d = i - 1;
        epapVar2.b |= 2;
        eyev a2 = eykj.a(ofNanos);
        epaoVar.copyOnWrite();
        epap epapVar3 = (epap) epaoVar.instance;
        a2.getClass();
        epapVar3.e = a2;
        epapVar3.b |= 4;
        epaoVar.copyOnWrite();
        epap epapVar4 = (epap) epaoVar.instance;
        epapVar4.f = faghVar.a();
        epapVar4.b |= 8;
        epap epapVar5 = (epap) epaoVar.build();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.EXTERNAL_API_SERVICE_CALL_END;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        epapVar5.getClass();
        eolvVar2.aE = epapVar5;
        eolvVar2.d |= 1073741824;
        ((akxl) this.s.a.b()).j(eoluVar);
    }
}
