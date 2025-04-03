package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceqb extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/workhandlers/DeleteConversationHandler");
    static final cfup b;
    static final cfup c;
    public final ffbr A;
    public final ffbr B;
    public final fazb C;
    private final errl E;
    private final ffbr F;
    private final ffbr G;
    public final cskc d = cskc.g("BugleDataModel", "DeleteConversationHandler");
    public final ffbr e;
    public final Context f;
    public final errl g;
    public final dtuu h;
    public final ceqr i;
    public final cepg j;
    public final ceqm k;
    public final cgri l;
    public final axmw m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    public final ffbr r;
    public final akvy s;
    public final Optional t;
    public final ffbr u;
    public final ffbr v;
    public final alrv w;
    public final cbgf x;
    public final bdvi y;
    public final cqpk z;

    static {
        cfvl.x(216833586, "cancel_file_transfer_messages_first");
        b = cfvl.e(cfvl.b, "max_message_deletes_per_proto", 100);
        c = cfvl.e(cfvl.b, "max_parts_cleanup_per_proto", 100);
    }

    public ceqb(Context context, errl errlVar, errl errlVar2, dtuu dtuuVar, ceqr ceqrVar, cepg cepgVar, ceqm ceqmVar, cgri cgriVar, axmw axmwVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, akvy akvyVar, Optional optional, ffbr ffbrVar6, ffbr ffbrVar7, alrv alrvVar, cbgf cbgfVar, bdvi bdviVar, cqpk cqpkVar, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, fazb fazbVar) {
        this.f = context;
        this.E = errlVar;
        this.g = errlVar2;
        this.h = dtuuVar;
        this.i = ceqrVar;
        this.j = cepgVar;
        this.k = ceqmVar;
        this.l = cgriVar;
        this.m = axmwVar;
        this.n = ffbrVar;
        this.o = ffbrVar2;
        this.p = ffbrVar3;
        this.q = ffbrVar4;
        this.r = ffbrVar5;
        this.s = akvyVar;
        this.t = optional;
        this.u = ffbrVar6;
        this.v = ffbrVar7;
        this.w = alrvVar;
        this.x = cbgfVar;
        this.y = bdviVar;
        this.z = cqpkVar;
        this.e = ffbrVar8;
        this.A = ffbrVar9;
        this.B = ffbrVar10;
        this.F = ffbrVar11;
        this.G = ffbrVar12;
        this.C = fazbVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        ((ceti) l).c = eogt.DELETE_CONVERSATION_ACTION;
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("DeleteConversationHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ceqe.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final ceqe ceqeVar = (ceqe) eyhsVar;
        final ConversationIdType b2 = bdgq.b(ceqeVar.b);
        if (b2.b()) {
            this.d.n("conversationId is empty.");
            return elfo.e(ceyt.k());
        }
        if (ceqeVar.e == eoko.CONVERSATION_FROM_COMPOSE.u && ceqeVar.d) {
            try {
                csgg t = ((bczy) this.p.b()).t(b2);
                if (t == null) {
                    csjb e = this.d.e();
                    e.I("Skip deleting conversation since it appears it's not in database.");
                    e.A("conversationId", ceqeVar.b);
                    e.r();
                } else if (t.equals(csgg.CMS_RESTORE_IN_PROGRESS) || t.equals(csgg.RESTORED_FROM_CMS) || t.equals(csgg.MERGED_FROM_CMS)) {
                    if (axmm.m(((axkm) this.G.b()).c())) {
                        csjb c2 = this.d.c();
                        c2.I("Skip deleting conversation during initial restore for background task.");
                        c2.A("conversationId", ceqeVar.b);
                        c2.r();
                    }
                }
                return elfo.e(ceyt.i());
            } catch (eygu e2) {
                csjb e3 = this.d.e();
                e3.A("conversationId", ceqeVar.b);
                e3.I("Unable to parse CmsSettingsData, will delete conversation.");
                e3.s(e2);
            }
        }
        return elfo.h(new erog() { // from class: ceqa
            @Override // defpackage.erog
            public final ListenableFuture a() {
                if (ceqeVar.d) {
                    int i = engw.d;
                    return elfo.e(enou.a);
                }
                final ConversationIdType conversationIdType = b2;
                final cqpk cqpkVar = ceqb.this.z;
                return cqpkVar.e.a() ? elfo.h(new erog() { // from class: cqpi
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        cqpk cqpkVar2 = cqpk.this;
                        bdmq bdmqVar = (bdmq) cqpkVar2.c.c.b();
                        buxo d = MessagesTable.d();
                        d.z("FileTransferDatabaseOperations#retrieveOngoingFileTransferMessagesInConversation");
                        final ConversationIdType conversationIdType2 = conversationIdType;
                        d.h(new Function() { // from class: cqrh
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                buxz buxzVar = (buxz) obj;
                                entd entdVar = cqrl.a;
                                buxzVar.m(ConversationIdType.this);
                                buxzVar.K(3);
                                buxzVar.ai(axuh.e);
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        return elfo.i(cqpkVar2.c(bdmqVar.J(d.b())));
                    }
                }, cqpkVar.b).h(new cqpe(), cqpkVar.b) : elfo.h(new erog() { // from class: cqpj
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        buxo d = MessagesTable.d();
                        d.z("getOngoingFileTransferMessages");
                        final ConversationIdType conversationIdType2 = conversationIdType;
                        d.h(new Function() { // from class: cqre
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                buxz buxzVar = (buxz) obj;
                                entd entdVar = cqrl.a;
                                buxzVar.m(ConversationIdType.this);
                                buxzVar.K(3);
                                buxzVar.ai(axuh.e);
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        d.d(new buxl(MessagesTable.c.i, true));
                        Stream D = d.b().D();
                        cqpk cqpkVar2 = cqpk.this;
                        final cqrl cqrlVar = cqpkVar2.c;
                        try {
                            Stream filter = D.map(new Function() { // from class: cqrf
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return cqrl.this.a(((MessagesTable.BindData) obj).D());
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).filter(new Predicate() { // from class: cqrg
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
                                    return ((cqrn) obj).c();
                                }
                            });
                            int i2 = engw.d;
                            engw engwVar = (engw) filter.collect(endq.a);
                            if (D != null) {
                                D.close();
                            }
                            return cqpkVar2.b(engwVar);
                        } catch (Throwable th) {
                            if (D != null) {
                                try {
                                    D.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                }, cqpkVar.b);
            }
        }, this.E).i(new eroh() { // from class: cepq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                elfl c3;
                cjgb cjgbVar = (cjgb) ceqb.this.C.b();
                c3 = axol.c(cjgbVar.i, ffhe.a, ffsm.a, new cjga(cjgbVar, b2, null));
                return c3;
            }
        }, this.E).i(new eroh() { // from class: cepr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final ceqb ceqbVar = ceqb.this;
                final ConversationIdType conversationIdType = b2;
                final ceqe ceqeVar2 = ceqeVar;
                return elfo.g(new Callable() { // from class: ceps
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final ceqb ceqbVar2 = ceqb.this;
                        final ConversationIdType conversationIdType2 = conversationIdType;
                        final ceqe ceqeVar3 = ceqeVar2;
                        return (ceyt) ceqbVar2.h.c("DeleteConversationHandler.deleteLocallyAndQueue", new emyl() { // from class: cepp
                            @Override // defpackage.emyl
                            public final Object get() {
                                cpxu cpxuVar;
                                String[] strArr;
                                boolean c3;
                                ceyt j;
                                final ceqb ceqbVar3 = ceqb.this;
                                csjb c4 = ceqbVar3.d.c();
                                c4.I("Deleting conversation ");
                                final ConversationIdType conversationIdType3 = conversationIdType2;
                                c4.c(conversationIdType3);
                                c4.r();
                                ceqe ceqeVar4 = ceqeVar3;
                                try {
                                    int i = ceqeVar4.e;
                                    final boolean R = ((bdmq) ceqbVar3.q.b()).R(conversationIdType3);
                                    final byyt s = ((bczy) ceqbVar3.p.b()).s(conversationIdType3);
                                    final eokw e4 = ceqbVar3.s.e(conversationIdType3);
                                    final eoko b3 = eoko.b(i);
                                    ((cugm) ceqbVar3.B.b()).e(conversationIdType3);
                                    Runnable runnable = ((Boolean) ((cfup) aygh.b.get()).e()).booleanValue() ? new Runnable() { // from class: cepv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ((aygh) ceqb.this.v.b()).a(e4, conversationIdType3, b3, R, s);
                                        }
                                    } : new Runnable() { // from class: cepw
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ((altk) ceqb.this.u.b()).t(e4, conversationIdType3, b3, R, s);
                                        }
                                    };
                                    final long j2 = ceqeVar4.c;
                                    try {
                                        cpxuVar = ((cbek) ceqbVar3.r.b()).a(conversationIdType3);
                                    } catch (emyx unused) {
                                        cpxuVar = new cpxu();
                                    }
                                    SuperSortLabel a2 = SuperSortLabel.a(ceqeVar4.f);
                                    boolean d = ((axmt) ceqbVar3.o.b()).d(conversationIdType3, cpxuVar);
                                    cgot cgotVar = null;
                                    if (d) {
                                        String[] strArr2 = MessagesTable.a;
                                        buxz buxzVar = new buxz();
                                        if (j2 != Long.MAX_VALUE) {
                                            buxzVar.U(j2);
                                        }
                                        strArr = ((axmt) ceqbVar3.o.b()).f(conversationIdType3, new buxs(buxzVar));
                                    } else {
                                        strArr = null;
                                    }
                                    if (ceqeVar4.d) {
                                        c3 = ((cgpv) ceqbVar3.n.b()).g(conversationIdType3);
                                    } else {
                                        ceqk ceqkVar = (ceqk) ceql.a.createBuilder();
                                        buxo d2 = MessagesTable.d();
                                        d2.z("getMessageIdsQuery");
                                        d2.f(new Function() { // from class: cepx
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                enru enruVar = ceqb.a;
                                                return ((buum) obj2).a;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        d2.h(new Function() { // from class: cepy
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                buxz buxzVar2 = (buxz) obj2;
                                                enru enruVar = ceqb.a;
                                                buxzVar2.m(ConversationIdType.this);
                                                buxzVar2.U(j2);
                                                return buxzVar2;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        final buxm b4 = d2.b();
                                        buxo d3 = MessagesTable.d();
                                        d3.z("+queueCleanupParts-messages");
                                        d3.h(new Function() { // from class: cept
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                buxz buxzVar2 = (buxz) obj2;
                                                enru enruVar = ceqb.a;
                                                buxzVar2.t(dtzj.this);
                                                return buxzVar2;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        buuo buuoVar = (buuo) d3.b().o();
                                        while (buuoVar.moveToNext()) {
                                            try {
                                                Uri o = buuoVar.o();
                                                if (o != null) {
                                                    ceqkVar.a(o.toString());
                                                    if (((ceql) ceqkVar.instance).c.size() >= ((Integer) ceqb.b.e()).intValue()) {
                                                        ceqbVar3.k.a((ceql) ceqkVar.build());
                                                        ceqkVar.copyOnWrite();
                                                        ((ceql) ceqkVar.instance).c = eyfy.emptyProtobufList();
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        buuoVar.close();
                                        if (((ceql) ceqkVar.instance).c.size() > 0) {
                                            ceqbVar3.k.a((ceql) ceqkVar.build());
                                        }
                                        ceph cephVar = (ceph) cepi.a.createBuilder();
                                        cgrg cgrgVar = (cgrg) cgrh.a.createBuilder();
                                        bwdf c5 = PartsTable.c();
                                        c5.z("+queueCleanupParts-parts");
                                        c5.h(new Function() { // from class: cepu
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                bwdm bwdmVar = (bwdm) obj2;
                                                enru enruVar = ceqb.a;
                                                bwdmVar.i(ConversationIdType.this);
                                                bwdmVar.x();
                                                bwdmVar.o(b4);
                                                return bwdmVar;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        bwav bwavVar = (bwav) c5.b().o();
                                        while (bwavVar.moveToNext()) {
                                            try {
                                                Uri i2 = bwavVar.i();
                                                if (i2 != null) {
                                                    if (cgrd.a(i2)) {
                                                        cgrgVar.a(i2.toString());
                                                    } else if (eohh.b(bwavVar.c()) != eohh.GIF_CHOOSER) {
                                                        String uri = i2.toString();
                                                        cephVar.copyOnWrite();
                                                        cepi cepiVar = (cepi) cephVar.instance;
                                                        uri.getClass();
                                                        eygr eygrVar = cepiVar.b;
                                                        if (!eygrVar.c()) {
                                                            cepiVar.b = eyfy.mutableCopy(eygrVar);
                                                        }
                                                        cepiVar.b.add(uri);
                                                        if (((cepi) cephVar.instance).b.size() >= ((Integer) ceqb.c.e()).intValue()) {
                                                            ceqbVar3.j.a((cepi) cephVar.build());
                                                            cephVar.copyOnWrite();
                                                            ((cepi) cephVar.instance).b = eyfy.emptyProtobufList();
                                                        }
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        bwavVar.close();
                                        if (((cepi) cephVar.instance).b.size() > 0) {
                                            ceqbVar3.j.a((cepi) cephVar.build());
                                        }
                                        if (((cgrh) cgrgVar.instance).b.size() > 0) {
                                            ((cevh) ceqbVar3.l.a.b()).a(ceyr.g("delete_part_cms_attachment", (cgrh) cgrgVar.build()));
                                        }
                                        cgotVar = eoko.b(ceqeVar4.e) == eoko.CONVERSATION_FROM_CMS_ACTION ? ((cgpv) ceqbVar3.n.b()).f(conversationIdType3, a2, j2) : ((cgpv) ceqbVar3.n.b()).e(conversationIdType3, a2, j2);
                                        c3 = cgotVar.c();
                                        ((cgpv) ceqbVar3.n.b()).h(conversationIdType3, j2);
                                    }
                                    if (c3) {
                                        csjb c6 = ceqbVar3.d.c();
                                        c6.I("Deleted local");
                                        c6.c(conversationIdType3);
                                        c6.z("maxTimestampToDelete", j2);
                                        c6.r();
                                        engr engrVar = new engr();
                                        ensk h = ceqb.a.h();
                                        h.Y(ente.a, "BugleNotifications");
                                        enrr enrrVar = (enrr) h;
                                        enrrVar.Y(csux.o, conversationIdType3.toString());
                                        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/workhandlers/DeleteConversationHandler", "deleteLocallyAndQueue", 338, "DeleteConversationHandler.java")).q("Deleting conversation, canceling IM notification (handler)");
                                        ((cjbc) ceqbVar3.A.b()).a(conversationIdType3);
                                        if (!a2.b() || bsom.b(conversationIdType3) == null) {
                                            ((cjam) ceqbVar3.e.b()).d(conversationIdType3);
                                            ceqbVar3.x.d(conversationIdType3);
                                            ceqbVar3.t.ifPresent(new Consumer() { // from class: cepz
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void o(Object obj2) {
                                                    ((csll) obj2).i();
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            });
                                            if (!((Boolean) ayhv.a.e()).booleanValue() && cpxuVar.c()) {
                                                ceqr ceqrVar = ceqbVar3.i;
                                                ceqp ceqpVar = (ceqp) ceqq.a.createBuilder();
                                                long a3 = cpxv.a(cpxuVar);
                                                ceqpVar.copyOnWrite();
                                                ((ceqq) ceqpVar.instance).c = a3;
                                                ceqpVar.copyOnWrite();
                                                ((ceqq) ceqpVar.instance).d = j2;
                                                ((cevh) ceqrVar.a.b()).a(ceyr.g("delete_thread_from_telephony", (ceqq) ceqpVar.build()));
                                            } else if (!d) {
                                                if (!((Boolean) ayhv.a.e()).booleanValue()) {
                                                    csjb e5 = ceqbVar3.d.e();
                                                    e5.I("Local conversation");
                                                    e5.c(conversationIdType3);
                                                    e5.I("has an invalid telephony thread id; will delete messages individually.");
                                                    e5.r();
                                                }
                                                if (cgotVar != null) {
                                                    engw<Uri> b5 = cgotVar.b();
                                                    ceqk ceqkVar2 = (ceqk) ceql.a.createBuilder();
                                                    for (Uri uri2 : b5) {
                                                        if (uri2 != null) {
                                                            ceqkVar2.a(uri2.toString());
                                                            if (((ceql) ceqkVar2.instance).c.size() >= ((Integer) ceqb.b.e()).intValue()) {
                                                                ceqbVar3.k.a((ceql) ceqkVar2.build());
                                                                ceqkVar2.copyOnWrite();
                                                                ((ceql) ceqkVar2.instance).c = eyfy.emptyProtobufList();
                                                            }
                                                        }
                                                    }
                                                    if (((ceql) ceqkVar2.instance).c.size() > 0) {
                                                        ceqbVar3.k.a((ceql) ceqkVar2.build());
                                                    }
                                                }
                                            } else if (strArr != null) {
                                                ceqbVar3.m.b(ceqbVar3.f, strArr);
                                            }
                                            runnable.run();
                                            j = ceyt.j(engrVar.g());
                                        } else {
                                            j = ceyt.j(engrVar.g());
                                        }
                                    } else {
                                        if (!ceqeVar4.d) {
                                            csjb e6 = ceqbVar3.d.e();
                                            e6.I("Could not delete local");
                                            e6.c(conversationIdType3);
                                            e6.r();
                                            if (eoko.b(ceqeVar4.e) != eoko.CONVERSATION_FROM_CMS_ACTION) {
                                                ceqbVar3.y.a();
                                            }
                                        }
                                        j = ceyt.i();
                                    }
                                    return j;
                                } finally {
                                    ceqbVar3.w.f(alrv.m);
                                }
                            }
                        });
                    }
                }, ceqbVar.g);
            }
        }, this.E);
    }
}
