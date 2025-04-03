package defpackage;

import android.app.AlarmManager;
import android.content.ContentValues;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aksw implements coja {
    public static final entd a = entd.c("BugleScheduledSend");
    public final cqoh b;
    public final errl c;
    public final errl d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ejvp h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final aktq l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    private final bzac r;

    public aksw(cqoh cqohVar, errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ejvp ejvpVar, aktq aktqVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, bzac bzacVar, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11) {
        this.b = cqohVar;
        this.c = errlVar;
        this.d = errlVar2;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ejvpVar;
        this.i = ffbrVar5;
        this.j = ffbrVar6;
        this.k = ffbrVar7;
        this.l = aktqVar;
        this.m = ffbrVar4;
        this.n = ffbrVar8;
        this.r = bzacVar;
        this.o = ffbrVar9;
        this.p = ffbrVar10;
        this.q = ffbrVar11;
    }

    private final elfl l(final String str) {
        akrr akrrVar = (akrr) this.m.b();
        dtzj dtzjVar = cogw.a;
        cogn a2 = cogq.a();
        a2.z("ScheduledSendQueries#getQueryForId");
        a2.c(new Function() { // from class: cogs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cogp cogpVar = (cogp) obj;
                dtzj dtzjVar2 = cogw.a;
                cogpVar.aq(new dtrt("scheduled_send._id", 1, String.valueOf(str)));
                return cogpVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return akrrVar.b(a2.b()).h(new emwl() { // from class: aksl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                engw engwVar = (engw) obj;
                entd entdVar = aksw.a;
                emxf.a(engwVar.size() == 1);
                return (coiy) engwVar.get(0);
            }
        }, this.d);
    }

    @Override // defpackage.coja
    public final ejuh a(lkk lkkVar, ConversationIdType conversationIdType) {
        return this.r.a(cogw.a(conversationIdType), new byzu() { // from class: akru
            @Override // defpackage.byzu
            public final elfl a(Object obj) {
                return ((akrr) aksw.this.m.b()).b((cogl) obj);
            }
        }, coiz.a(conversationIdType), lkkVar);
    }

    @Override // defpackage.coja
    public final elfl b(final MessageCoreData messageCoreData, final Instant instant) {
        messageCoreData.bV(16);
        final akrr akrrVar = (akrr) this.m.b();
        return elfo.g(new Callable() { // from class: akrp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final MessageCoreData messageCoreData2 = messageCoreData;
                emxf.a(messageCoreData2.k() == 16);
                final Instant instant2 = instant;
                final akrr akrrVar2 = akrr.this;
                return (ScheduledSendTable.BindData) akrrVar2.f.c("ScheduledSendDatabaseOperations#insertScheduledMessage", new emyl() { // from class: akrq
                    @Override // defpackage.emyl
                    public final Object get() {
                        akrr akrrVar3 = akrr.this;
                        bdjr bdjrVar = (bdjr) akrrVar3.g.b();
                        MessageCoreData messageCoreData3 = messageCoreData2;
                        MessageIdType e = bdjrVar.e(messageCoreData3, false);
                        if (messageCoreData3.z().b()) {
                            throw new IllegalArgumentException("empty conversationId");
                        }
                        Instant instant3 = instant2;
                        String[] strArr = ScheduledSendTable.a;
                        cohj cohjVar = new cohj();
                        cohjVar.f(e);
                        cohjVar.c(messageCoreData3.z());
                        cohjVar.g(instant3);
                        cohjVar.d(akrrVar3.c.f());
                        cohjVar.h(coiu.SCHEDULED);
                        final ScheduledSendTable.BindData b = cohjVar.b(new Supplier() { // from class: cohg
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new cohf();
                            }
                        });
                        final dtve c = ScheduledSendTable.c();
                        dtub.b(ScheduledSendTable.c(), "scheduled_send", b, new Function() { // from class: cogz
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Long.valueOf(dtve.this.S("scheduled_send", (ContentValues) obj));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: coha
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                ScheduledSendTable.BindData.this.n((Long) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        ((cbgf) akrrVar3.d.b()).l(messageCoreData3.z(), e, new String[0]);
                        return b;
                    }
                });
            }
        }, akrrVar.a).i(new eroh() { // from class: akst
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final ScheduledSendTable.BindData bindData = (ScheduledSendTable.BindData) obj;
                return aksw.this.i().h(new emwl() { // from class: aksc
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = aksw.a;
                        return ScheduledSendTable.BindData.this;
                    }
                }, erpp.a);
            }
        }, this.d).h(new emwl() { // from class: aksu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ScheduledSendTable.BindData bindData = (ScheduledSendTable.BindData) obj;
                bdmq bdmqVar = (bdmq) aksw.this.p.b();
                MessageCoreData messageCoreData2 = messageCoreData;
                bdmqVar.aa(messageCoreData2.z(), messageCoreData2, 1, true);
                return bindData;
            }
        }, this.c);
    }

    public final elfl c(coiy coiyVar) {
        elfl a2 = ((akrr) this.m.b()).a(coiyVar);
        ConversationIdType C = coiyVar.b().C();
        C.getClass();
        this.h.a(a2, coiz.a(C));
        return a2;
    }

    public final elfl d(cois coisVar, final long j, final cniz cnizVar) {
        return j(coisVar, coiu.SENDING).i(new eroh() { // from class: akrz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                akrr akrrVar = (akrr) aksw.this.m.b();
                Stream map = Collection.EL.stream((engw) obj).map(new Function() { // from class: aksp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((ScheduledSendTable.BindData) obj2).m();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                final List list = (List) map.collect(endq.a);
                dtzj dtzjVar = cogw.a;
                cogn a2 = cogq.a();
                a2.z("+ScheduledSendQueries#getQueryForIds");
                a2.c(new Function() { // from class: cogv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        cogp cogpVar = (cogp) obj2;
                        dtzj dtzjVar2 = cogw.a;
                        cogpVar.aq(new dtrw("scheduled_send._id", 3, cogp.at(list), false));
                        return cogpVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return akrrVar.b(a2.b());
            }
        }, this.d).i(new eroh() { // from class: aksa
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final engw engwVar = (engw) obj;
                ((ensz) ((ensz) aksw.a.h()).h("com/google/android/apps/messaging/scheduledsend/dataservice/ScheduledSendDataServiceImpl", "sendScheduledMessages", 378, "ScheduledSendDataServiceImpl.java")).r("Processing %d scheduled messages for sending.", engwVar.size());
                Stream stream = Collection.EL.stream(engwVar);
                final aksw akswVar = aksw.this;
                final long j2 = j;
                final cniz cnizVar2 = cnizVar;
                return elfo.a((engw) stream.map(new Function() { // from class: aksm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        final aksw akswVar2 = aksw.this;
                        final coiy coiyVar = (coiy) obj2;
                        elfl h = akswVar2.h(coiyVar).h(new emwl() { // from class: aksk
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                MessageCoreData messageCoreData = (MessageCoreData) obj3;
                                entd entdVar = aksw.a;
                                messageCoreData.bV(4);
                                return messageCoreData;
                            }
                        }, akswVar2.d);
                        final cniz cnizVar3 = cnizVar2;
                        final long j3 = j2;
                        return h.i(new eroh() { // from class: akrv
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                MessageCoreData messageCoreData = (MessageCoreData) obj3;
                                ensz enszVar = (ensz) aksw.a.h();
                                coiy coiyVar2 = coiyVar;
                                enszVar.Y(akti.a, coiyVar2.e());
                                enszVar.Y(csux.o, coiyVar2.b().C().toString());
                                enszVar.Y(csux.a, coiyVar2.b().D().b());
                                ((ensz) enszVar.h("com/google/android/apps/messaging/scheduledsend/dataservice/ScheduledSendDataServiceImpl", "sendScheduledMessage", 423, "ScheduledSendDataServiceImpl.java")).q("Queueing scheduled message for sending.");
                                SelfIdentityId v = messageCoreData.v();
                                aksw akswVar3 = aksw.this;
                                if (v == null) {
                                    v = ((bczy) akswVar3.q.b()).i(messageCoreData.z());
                                    v.getClass();
                                    messageCoreData.aO(v);
                                }
                                long j4 = j3;
                                cniz cnizVar4 = cnizVar3;
                                aztg f = ((bdtd) akswVar3.n.b()).f(v);
                                f.getClass();
                                int e = f.e();
                                return cnizVar4 != null ? ((ambs) akswVar3.e.b()).i(e, messageCoreData, j4, cnizVar4) : ((ambs) akswVar3.e.b()).h(e, messageCoreData, j4);
                            }
                        }, akswVar2.c).i(new eroh() { // from class: akrw
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                aksw akswVar3 = aksw.this;
                                coiy coiyVar2 = coiyVar;
                                final Duration between = Duration.between(coiyVar2.d(), akswVar3.b.f());
                                akpj akpjVar = (akpj) akswVar3.j.b();
                                final ScheduledSendTable.BindData c = coiyVar2.c();
                                akpjVar.o(new Supplier() { // from class: akph
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        eqgb eqgbVar = (eqgb) eqgc.a.createBuilder();
                                        eqga d = akpq.d(ScheduledSendTable.BindData.this);
                                        eqgbVar.copyOnWrite();
                                        eqgc eqgcVar = (eqgc) eqgbVar.instance;
                                        d.getClass();
                                        eqgcVar.c = d;
                                        eqgcVar.b |= 1;
                                        long millis = between.toMillis();
                                        eqgbVar.copyOnWrite();
                                        eqgc eqgcVar2 = (eqgc) eqgbVar.instance;
                                        eqgcVar2.b |= 2;
                                        eqgcVar2.d = millis;
                                        return (eqgc) eqgbVar.build();
                                    }
                                });
                                return akswVar3.c(coiyVar2);
                            }
                        }, akswVar2.d).h(new emwl() { // from class: akrx
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                Boolean bool = (Boolean) obj3;
                                entd entdVar = aksw.a;
                                if (!bool.booleanValue()) {
                                    coiy coiyVar2 = coiy.this;
                                    ensz enszVar = (ensz) aksw.a.i();
                                    enszVar.Y(akti.a, coiyVar2.e());
                                    enszVar.Y(csux.o, coiyVar2.b().C().toString());
                                    enszVar.Y(csux.a, coiyVar2.b().D().b());
                                    ((ensz) enszVar.h("com/google/android/apps/messaging/scheduledsend/dataservice/ScheduledSendDataServiceImpl", "sendScheduledMessage", 460, "ScheduledSendDataServiceImpl.java")).q("Failed to delete scheduled message after processing for sending.");
                                }
                                return bool;
                            }
                        }, akswVar2.d).e(Exception.class, new emwl() { // from class: akry
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                ensz enszVar = (ensz) aksw.a.i();
                                coiy coiyVar2 = coiy.this;
                                enszVar.Y(akti.a, coiyVar2.e());
                                enszVar.Y(csux.o, coiyVar2.b().C().toString());
                                enszVar.Y(csux.a, coiyVar2.b().D().b());
                                ((ensz) ((ensz) enszVar.g((Exception) obj3)).h("com/google/android/apps/messaging/scheduledsend/dataservice/ScheduledSendDataServiceImpl", "sendScheduledMessage", 480, "ScheduledSendDataServiceImpl.java")).q("Failed to send scheduled message.");
                                return false;
                            }
                        }, akswVar2.d);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.a)).h(new emwl() { // from class: aksn
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = aksw.a;
                        long count = Collection.EL.stream((List) obj2).filter(new Predicate() { // from class: aksj
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
                                entd entdVar2 = aksw.a;
                                return ((Boolean) obj3).booleanValue();
                            }
                        }).count();
                        ((ensz) ((ensz) aksw.a.h()).h("com/google/android/apps/messaging/scheduledsend/dataservice/ScheduledSendDataServiceImpl", "sendScheduledMessages", 393, "ScheduledSendDataServiceImpl.java")).z("%d scheduled messages successfully processed. %d failed to process.", count, r9.size() - count);
                        return engw.this;
                    }
                }, akswVar.d);
            }
        }, this.d);
    }

    @Override // defpackage.coja
    public final elfl e(String str) {
        return l(str).i(new eroh() { // from class: aksv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                aksw akswVar = aksw.this;
                final coiy coiyVar = (coiy) obj;
                akpm akpmVar = (akpm) akswVar.k.b();
                final ScheduledSendTable.BindData c = coiyVar.c();
                akpmVar.o(new Supplier() { // from class: akpl
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        eqgd eqgdVar = (eqgd) eqge.a.createBuilder();
                        eqga d = akpq.d(ScheduledSendTable.BindData.this);
                        eqgdVar.copyOnWrite();
                        eqge eqgeVar = (eqge) eqgdVar.instance;
                        d.getClass();
                        eqgeVar.c = d;
                        eqgeVar.b |= 1;
                        return (eqge) eqgdVar.build();
                    }
                });
                return akswVar.c(coiyVar).h(new emwl() { // from class: aksd
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = aksw.a;
                        return coiy.this;
                    }
                }, erpp.a);
            }
        }, this.d).i(new eroh() { // from class: akrt
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return aksw.this.h((coiy) obj);
            }
        }, this.d);
    }

    @Override // defpackage.coja
    public final elfl f(final String str) {
        akrr akrrVar = (akrr) this.m.b();
        final Instant f = this.b.f();
        return elfo.g(new Callable() { // from class: akrg
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object apply;
                String[] strArr = ScheduledSendTable.a;
                coir coirVar = new coir();
                coirVar.ap("updateScheduledTime");
                Instant instant = Instant.this;
                if (instant == null) {
                    coirVar.a.putNull("scheduled_time");
                } else {
                    coirVar.a.put("scheduled_time", Long.valueOf(bdgw.a(instant)));
                }
                final String str2 = str;
                apply = new Function() { // from class: akro
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        coit coitVar = (coit) obj;
                        coitVar.c(str2);
                        return coitVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new coit());
                coirVar.af(new cois((coit) apply));
                final coiq b = coirVar.b();
                return (ScheduledSendTable.BindData) ((engw) ScheduledSendTable.c().r("updateAndReturnUpdatedRowsAfterUpdate-txn-scheduled_send", new emyl() { // from class: coio
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emyl
                    public final Object get() {
                        coin b2 = ScheduledSendTable.b();
                        b2.z("updateAndReturnUpdatedRowsAfterUpdate-pre-scheduled_send");
                        b2.u();
                        b2.n(new dtzq("ROWID", new Object[0]), "_rowid");
                        coiq coiqVar = coiq.this;
                        engw engwVar = coiqVar.e;
                        int i = ((enou) engwVar).c;
                        for (int i2 = 0; i2 < i; i2++) {
                            b2.k((cois) ((duap) engwVar.get(i2)));
                        }
                        if (((dtrm) coiqVar.d).b) {
                            coit coitVar = new coit();
                            coitVar.as(coiqVar.h());
                            b2.d(coitVar);
                        }
                        engr engrVar = new engr();
                        coia coiaVar = (coia) b2.b().o();
                        while (coiaVar.moveToNext()) {
                            try {
                                engrVar.h(coiaVar.dd("_rowid"));
                            } catch (Throwable th) {
                                try {
                                    coiaVar.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        coiaVar.close();
                        String str3 = (String) Collection.EL.stream(engrVar.g()).collect(Collectors.joining(","));
                        coiqVar.e();
                        coin b3 = ScheduledSendTable.b();
                        b3.z("updateAndReturnUpdatedRowsAfterUpdate-post-scheduled_send");
                        coit coitVar2 = new coit();
                        coitVar2.as(new dtzq("ROWID IN ($R)", new Object[]{str3}));
                        b3.d(coitVar2);
                        return ((coia) b3.b().o()).cW();
                    }
                })).get(0);
            }
        }, akrrVar.a).i(new eroh() { // from class: aksq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String[] strArr = ScheduledSendTable.a;
                coit coitVar = new coit();
                coitVar.c(str);
                cois coisVar = new cois(coitVar);
                aksw akswVar = aksw.this;
                return akswVar.d(coisVar, akswVar.b.a(), null);
            }
        }, this.d).h(new emwl() { // from class: aksr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = aksw.a;
                return ((coiy) ((engw) obj).get(0)).c();
            }
        }, erpp.a);
    }

    @Override // defpackage.coja
    public final elfl g(cniz cnizVar) {
        String[] strArr = ScheduledSendTable.a;
        coit coitVar = new coit();
        coitVar.d(coiu.SCHEDULED);
        coitVar.aq(new dtrt("scheduled_send.scheduled_time", 10, Long.valueOf(bdgw.a(this.b.f()))));
        return d(new cois(coitVar), this.b.a(), cnizVar).h(new emwl() { // from class: aksi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = aksw.a;
                return null;
            }
        }, erpp.a);
    }

    public final elfl h(final coiy coiyVar) {
        return elfo.g(new Callable() { // from class: akse
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final aksw akswVar = aksw.this;
                MessageCoreData a2 = ((byzp) akswVar.f.b()).a();
                coiy coiyVar2 = coiyVar;
                a2.aM(coiyVar2.b());
                a2.aR();
                a2.bq(null);
                MessageData messageData = (MessageData) a2;
                messageData.j.j(null);
                a2.bt(null);
                a2.bA(Optional.of(UUID.randomUUID()));
                String f = coiyVar2.a().f();
                if (f != null) {
                    messageData.r = new bdnn(f);
                }
                Stream map = DesugarArrays.stream(coiyVar2.f()).map(new Function() { // from class: aksh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        MessagePartData e = ((bcwz) aksw.this.g.b()).e((PartsTable.BindData) obj);
                        e.af();
                        e.aQ(bdhb.a);
                        return e;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                ((bdpt) akswVar.o.b()).b(a2, (engw) map.collect(endq.a), true);
                return a2;
            }
        }, this.c);
    }

    @Override // defpackage.coja
    public final elfl i() {
        return elfo.g(new Callable() { // from class: akrn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                coin b = ScheduledSendTable.b();
                b.z("getEarliestScheduledTime");
                b.e(new Function() { // from class: akrl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        coit coitVar = (coit) obj;
                        coitVar.d(coiu.SCHEDULED);
                        return coitVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                b.c(ScheduledSendTable.c.d);
                b.C((String) DesugarArrays.stream(new coik[]{new coik(ScheduledSendTable.c.d)}).map(new Function() { // from class: coim
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((coik) obj).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.joining(", ")));
                b.x(1);
                return Optional.ofNullable((ScheduledSendTable.BindData) ((coia) b.b().o()).cS()).map(new Function() { // from class: akrm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ScheduledSendTable.BindData) obj).l();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, ((akrr) this.m.b()).a).h(new emwl() { // from class: akss
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                boolean isPresent = optional.isPresent();
                aksw akswVar = aksw.this;
                if (isPresent) {
                    aktq aktqVar = akswVar.l;
                    Instant instant = (Instant) optional.get();
                    akvt a2 = aktq.a();
                    a2.getClass();
                    akvr akvrVar = aktqVar.a;
                    Object systemService = akvrVar.a.getSystemService("alarm");
                    systemService.getClass();
                    akvrVar.b = (AlarmManager) systemService;
                    AlarmManager alarmManager = akvrVar.b;
                    if (alarmManager == null) {
                        ffkj.c("alarmManager");
                        alarmManager = null;
                    }
                    akvp akvpVar = new akvp(alarmManager);
                    AlarmManager alarmManager2 = akvrVar.b;
                    if (alarmManager2 == null) {
                        ffkj.c("alarmManager");
                        alarmManager2 = null;
                    }
                    akvrVar.b(instant, a2, false, akvpVar, new akvq(alarmManager2));
                } else {
                    akswVar.l.a.a(aktq.a());
                }
                return null;
            }
        }, this.d);
    }

    @Override // defpackage.coja
    public final elfl j(final cois coisVar, final coiu coiuVar) {
        return elfo.g(new Callable() { // from class: akrf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] strArr = ScheduledSendTable.a;
                coir coirVar = new coir();
                coirVar.ap("updateStatusForScheduledMessages");
                coirVar.af(cois.this);
                coiu coiuVar2 = coiuVar;
                if (coiuVar2 == null) {
                    coirVar.a.putNull("status");
                } else {
                    coirVar.a.put("status", Integer.valueOf(coiuVar2.ordinal()));
                }
                final coiq b = coirVar.b();
                final int i = 0;
                return (engw) ScheduledSendTable.c().r("scheduled_send.updateAndReturnUpdatedRows-txn", new emyl() { // from class: coip
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emyl
                    public final Object get() {
                        coin b2 = ScheduledSendTable.b();
                        b2.z("scheduled_send.updateAndReturnUpdatedRows-query");
                        coiq coiqVar = coiq.this;
                        engw engwVar = coiqVar.e;
                        int i2 = ((enou) engwVar).c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            b2.k((cois) ((duap) engwVar.get(i3)));
                        }
                        if (((dtrm) coiqVar.d).b) {
                            coit coitVar = new coit();
                            coitVar.as(coiqVar.h());
                            b2.d(coitVar);
                        }
                        if (((dtrm) coiqVar.d).c) {
                            b2.r();
                        }
                        Integer num = i;
                        engw y = b2.b().y();
                        num.intValue();
                        coiqVar.t(0);
                        return y;
                    }
                });
            }
        }, ((akrr) this.m.b()).a).i(new eroh() { // from class: aksb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final engw engwVar = (engw) obj;
                return aksw.this.i().h(new emwl() { // from class: akso
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = aksw.a;
                        return engw.this;
                    }
                }, erpp.a);
            }
        }, this.d);
    }

    @Override // defpackage.coja
    public final void k(String str) {
        l(str).i(new eroh() { // from class: aksf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final coiy coiyVar = (coiy) obj;
                aksw akswVar = aksw.this;
                akpd akpdVar = (akpd) akswVar.i.b();
                final ScheduledSendTable.BindData c = coiyVar.c();
                akpdVar.o(new Supplier() { // from class: akpb
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        eqfv eqfvVar = (eqfv) eqfw.a.createBuilder();
                        eqga d = akpq.d(ScheduledSendTable.BindData.this);
                        eqfvVar.copyOnWrite();
                        eqfw eqfwVar = (eqfw) eqfvVar.instance;
                        d.getClass();
                        eqfwVar.c = d;
                        eqfwVar.b |= 1;
                        return (eqfw) eqfvVar.build();
                    }
                });
                final akrr akrrVar = (akrr) akswVar.m.b();
                elfl h = akrrVar.a(coiyVar).h(new emwl() { // from class: akrk
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        Boolean bool = (Boolean) obj2;
                        if (bool.booleanValue()) {
                            for (PartsTable.BindData bindData : coiyVar.f()) {
                                ((bcwz) akrr.this.e.b()).e(bindData).al();
                            }
                        }
                        return bool;
                    }
                }, akrrVar.a);
                ConversationIdType C = coiyVar.b().C();
                C.getClass();
                akswVar.h.a(h, coiz.a(C));
                return h;
            }
        }, this.d).i(new eroh() { // from class: aksg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Boolean bool = (Boolean) obj;
                return aksw.this.i().h(new emwl() { // from class: akrs
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = aksw.a;
                        return bool;
                    }
                }, erpp.a);
            }
        }, this.d);
    }
}
