package com.google.android.apps.messaging.shared.datamodel.action;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessMessageUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akzt;
import defpackage.aswh;
import defpackage.aswi;
import defpackage.atky;
import defpackage.banq;
import defpackage.bbfl;
import defpackage.bbfn;
import defpackage.bbfs;
import defpackage.bbgi;
import defpackage.bcse;
import defpackage.bcsf;
import defpackage.bcsq;
import defpackage.bcsy;
import defpackage.bzax;
import defpackage.bzgd;
import defpackage.bzlh;
import defpackage.bzpf;
import defpackage.bzpg;
import defpackage.bzph;
import defpackage.bzpi;
import defpackage.cetp;
import defpackage.chww;
import defpackage.cqoh;
import defpackage.cskc;
import defpackage.ecda;
import defpackage.ecri;
import defpackage.ecrj;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.emyz;
import defpackage.emzf;
import defpackage.enrr;
import defpackage.eogt;
import defpackage.erog;
import defpackage.erpp;
import defpackage.errl;
import defpackage.ersb;
import defpackage.erzn;
import defpackage.esab;
import defpackage.fbzx;
import defpackage.fcek;
import defpackage.ffbr;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarArrays;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessMessageUpdateAsyncAction extends Action<fbzx> {
    public static final Parcelable.Creator<Action<fbzx>> CREATOR;
    public static final cskc a = cskc.g("BugleAction", "ProcessMessageUpdateAsyncAction");
    public static final ecda b = new ecda("ProcessMessageUpdateAsyncActionTimer");
    public static final emyz c;
    private final errl A;
    private final ffbr B;
    private final cqoh C;
    private final ffbr D;
    private final ffbr E;
    private final ffbr F;
    private final ffbr G;
    private final Executor H;
    public final bzgd d;
    public final ffbr e;
    public final ffbr f;
    public final bcsf g;
    public final bcsq h;
    public final bcsy i;
    public final bbfs j;
    public final bbfl k;
    public final akzt l;
    public final errl m;
    public final ffbr n;
    public final ffbr o;
    public final atky p;
    public final chww q;
    private final bbgi y;
    private final ffbr z;

    /* compiled from: PG */
    public interface a {
        bbfn bg();
    }

    static {
        emzf emzfVar = new emzf();
        emzfVar.f(100L);
        emzfVar.e(10L, TimeUnit.MINUTES);
        c = emzfVar.a();
        CREATOR = new banq();
    }

    public ProcessMessageUpdateAsyncAction(bzgd bzgdVar, Optional optional, ffbr ffbrVar, ffbr ffbrVar2, chww chwwVar, ffbr ffbrVar3, akzt akztVar, bbfl bbflVar, bbfs bbfsVar, bbgi bbgiVar, bcsf bcsfVar, errl errlVar, errl errlVar2, ffbr ffbrVar4, bcsq bcsqVar, bcsy bcsyVar, ffbr ffbrVar5, ffbr ffbrVar6, cqoh cqohVar, ffbr ffbrVar7, ffbr ffbrVar8, atky atkyVar, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, fcek fcekVar, String str, Uri uri) {
        super(eogt.PROCESS_MESSAGE_UPDATE_ACTION);
        this.d = bzgdVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.q = chwwVar;
        this.z = ffbrVar3;
        this.l = akztVar;
        this.m = errlVar;
        this.A = errlVar2;
        this.n = ffbrVar5;
        this.B = ffbrVar6;
        this.C = cqohVar;
        this.k = bbflVar;
        this.j = bbfsVar;
        this.y = bbgiVar;
        this.g = bcsfVar;
        this.h = bcsqVar;
        this.i = bcsyVar;
        this.o = ffbrVar8;
        this.p = atkyVar;
        this.E = ffbrVar9;
        this.F = ffbrVar10;
        this.G = ffbrVar11;
        this.D = ffbrVar7;
        if (((aswi) ffbrVar7.b()).a()) {
            this.H = (Executor) ffbrVar4.b();
        } else {
            this.H = new ersb(errlVar2);
        }
        cskc cskcVar = a;
        cskcVar.q("Showing notification for processing message update.");
        if (optional.isEmpty()) {
            cskcVar.r("Ditto foreground service is not available in this device");
            return;
        }
        this.t.q("desktop_id_key", fcekVar.toByteArray());
        this.t.v("request_id_key", str);
        this.t.v("conversation_id_key", uri.getPathSegments().get(r2.size() - 2));
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            this.t.v("message_id_key", lastPathSegment);
        }
    }

    public static void h(esab esabVar, erzn erznVar) {
        erzn erznVar2 = (erzn) c.b(erznVar.c);
        if (erznVar2 == null || !erznVar2.equals(erznVar)) {
            esabVar.a(erznVar);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ProcessMessageUpdateAsyncAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessMessageUpdate.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        if (!((aswh) this.E.b()).a()) {
        } else if (((bzlh) this.G.b()).b()) {
            ((enrr) a.h().h("com/google/android/apps/messaging/shared/datamodel/action/ProcessMessageUpdateAsyncAction", "executeActionInternal", 476, "ProcessMessageUpdateAsyncAction.java")).q("Ditto Push Updates Rate limit exceeded, Ignoring Message Update");
        }
        Boolean bool = (Boolean) bzax.a.e();
        if (bool.booleanValue()) {
            this.l.e("Bugle.Ditto.Action.Success.Metrics.Counts", 13);
        }
        final ecri d = ((ecrj) this.o.b()).d();
        elfl h = elfo.h(new erog() { // from class: banm
            /* JADX WARN: Type inference failed for: r5v24 */
            /* JADX WARN: Type inference failed for: r5v25, types: [boolean] */
            /* JADX WARN: Type inference failed for: r5v28 */
            @Override // defpackage.erog
            public final ListenableFuture a() {
                byte[] bArr;
                engw engwVar;
                String str;
                final esab esabVar;
                bjjd bjjdVar;
                boolean z;
                erzn m;
                boolean z2;
                bifw bifwVar;
                boolean z3;
                bifw bifwVar2;
                buxl buxlVar;
                ?? r5;
                bifu bifuVar;
                boolean z4;
                erzn m2;
                final ProcessMessageUpdateAsyncAction processMessageUpdateAsyncAction = ProcessMessageUpdateAsyncAction.this;
                bbcg bbcgVar = processMessageUpdateAsyncAction.t;
                bzgd bzgdVar = processMessageUpdateAsyncAction.d;
                String l = bbcgVar.l("request_id_key");
                byte[] A = bbcgVar.A("desktop_id_key");
                engw l2 = bzgdVar.l();
                if (l2.isEmpty()) {
                    return elfo.e(null);
                }
                bbcg bbcgVar2 = processMessageUpdateAsyncAction.t;
                atky atkyVar = processMessageUpdateAsyncAction.p;
                final long e = bbcgVar2.e("message_timestamp_key", Long.MAX_VALUE);
                if (atkyVar.a()) {
                    ConversationIdType b2 = bdgq.b(processMessageUpdateAsyncAction.t.l("conversation_id_key"));
                    MessageIdType b3 = bdhb.b(processMessageUpdateAsyncAction.t.l("message_id_key"));
                    esabVar = (esab) esac.a.createBuilder();
                    if (b2.b() || b3.c()) {
                        boolean z5 = processMessageUpdateAsyncAction.t.z("is_standalone_push_key", false);
                        bcsy bcsyVar = processMessageUpdateAsyncAction.i;
                        int intValue = ((Integer) bzaq.c.e()).intValue() + 1;
                        emxf.a(intValue >= 0);
                        if (z5) {
                            z2 = z5;
                            engwVar = l2;
                            bifwVar = new bifw(bige.b.a, true);
                            z3 = true;
                        } else {
                            engwVar = l2;
                            z2 = z5;
                            bifwVar = new bifw(bige.b.a, false);
                            z3 = false;
                        }
                        bigl biglVar = bcsyVar.a;
                        buxo d2 = MessagesTable.d();
                        boolean z6 = z3;
                        d2.h(new Function() { // from class: bcsw
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                buxz buxzVar = (buxz) obj;
                                buxzVar.S(e);
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        buxl[] buxlVarArr = new buxl[2];
                        if (z6) {
                            bifwVar2 = bifwVar;
                            str = l;
                            bArr = A;
                            buxlVar = new buxl(MessagesTable.c.i, true);
                            r5 = 0;
                        } else {
                            bArr = A;
                            str = l;
                            bifwVar2 = bifwVar;
                            r5 = 0;
                            buxlVar = new buxl(MessagesTable.c.i, false);
                        }
                        buxlVarArr[r5] = buxlVar;
                        buxlVarArr[1] = new buxl(MessagesTable.c.a, r5);
                        d2.d(buxlVarArr);
                        d2.x(intValue);
                        bifz f = biglVar.f(true, d2);
                        bifw[] bifwVarArr = new bifw[1];
                        bifwVarArr[r5] = bifwVar2;
                        f.C((String) DesugarArrays.stream(bifwVarArr).map(new Function() { // from class: bify
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return ((bifw) obj).a();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.joining(", ")));
                        f.z("ConversationMessageDataQueryHelperV2::getMessagesAfterTimestampQuery");
                        bifuVar = (bifu) f.b().o();
                        if (z2) {
                            try {
                                if (bifuVar.getCount() > 0) {
                                    processMessageUpdateAsyncAction.l.e("Bugle.Ditto.Messages.NoConversationUpdate.ToSend.Counts", bifuVar.getCount());
                                }
                                z4 = true;
                            } finally {
                            }
                        } else {
                            z4 = false;
                        }
                        csjb c2 = ProcessMessageUpdateAsyncAction.a.c();
                        c2.G(bifuVar.getCount());
                        c2.I("messages need retrying.");
                        c2.r();
                        while (bifuVar.moveToNext()) {
                            bcse c3 = processMessageUpdateAsyncAction.g.c(bifuVar);
                            if (!axuh.b.contains(Integer.valueOf(c3.f()))) {
                                processMessageUpdateAsyncAction.k(c3, b3);
                                csjb a2 = ProcessMessageUpdateAsyncAction.a.a();
                                a2.I("Re-pushed messageId: ");
                                a2.I(c3.u());
                                a2.r();
                                ProcessMessageUpdateAsyncAction.h(esabVar, ((cgzv) processMessageUpdateAsyncAction.e.b()).o(c3, z4));
                            }
                        }
                        bifuVar.close();
                    } else {
                        bifuVar = (bifu) processMessageUpdateAsyncAction.i.a(b3).o();
                        try {
                            if (!bifuVar.moveToNext() || bifuVar.n()) {
                                if (((Boolean) MessagesTable.h(b3, new Function() { // from class: bani
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        return Boolean.valueOf(((MessagesTable.BindData) obj).ad());
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }, new Supplier() { // from class: banj
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        cskc cskcVar = ProcessMessageUpdateAsyncAction.a;
                                        return false;
                                    }
                                })).booleanValue() && !btza.b(b3).isPresent()) {
                                    m2 = null;
                                }
                                m2 = ((cgzv) processMessageUpdateAsyncAction.e.b()).m(b2, b3);
                            } else {
                                bcse c4 = processMessageUpdateAsyncAction.g.c(bifuVar);
                                if (axuh.b.contains(Integer.valueOf(c4.f()))) {
                                    bifuVar.close();
                                    bArr = A;
                                    engwVar = l2;
                                    str = l;
                                } else {
                                    processMessageUpdateAsyncAction.k(c4, b3);
                                    m2 = ((cgzv) processMessageUpdateAsyncAction.e.b()).n(c4);
                                }
                            }
                            bifuVar.close();
                            if (m2 != null) {
                                ProcessMessageUpdateAsyncAction.h(esabVar, m2);
                            }
                            bArr = A;
                            engwVar = l2;
                            str = l;
                        } finally {
                            try {
                                bifuVar.close();
                                throw th;
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                    }
                } else {
                    bArr = A;
                    engwVar = l2;
                    str = l;
                    ConversationIdType b4 = bdgq.b(processMessageUpdateAsyncAction.t.l("conversation_id_key"));
                    MessageIdType b5 = bdhb.b(processMessageUpdateAsyncAction.t.l("message_id_key"));
                    esabVar = (esab) esac.a.createBuilder();
                    if (b4.b() || b5.c()) {
                        boolean z7 = processMessageUpdateAsyncAction.t.z("is_standalone_push_key", false);
                        bcsq bcsqVar = processMessageUpdateAsyncAction.h;
                        bjjf bjjfVar = z7 ? new bjjf(bjjn.c.d, true) : new bjjf(bjjn.c.d, false);
                        bjji a3 = bcsqVar.a.a();
                        a3.f(new Function() { // from class: bcsg
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bjjm bjjmVar = (bjjm) obj;
                                bjjmVar.e(e);
                                return bjjmVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        a3.v(bjjn.c.a);
                        a3.c(bjjfVar);
                        bjjdVar = (bjjd) a3.b().o();
                        if (z7) {
                            try {
                                if (bjjdVar.getCount() > 0) {
                                    processMessageUpdateAsyncAction.l.e("Bugle.Ditto.Messages.NoConversationUpdate.ToSend.Counts", bjjdVar.getCount());
                                }
                                z = true;
                            } finally {
                            }
                        } else {
                            z = false;
                        }
                        csjb c5 = ProcessMessageUpdateAsyncAction.a.c();
                        c5.G(bjjdVar.getCount());
                        c5.I("messages need retrying.");
                        c5.r();
                        while (bjjdVar.moveToNext()) {
                            bcse e2 = processMessageUpdateAsyncAction.g.e(bjjdVar);
                            if (!axuh.b.contains(Integer.valueOf(e2.f()))) {
                                processMessageUpdateAsyncAction.k(e2, b5);
                                csjb a4 = ProcessMessageUpdateAsyncAction.a.a();
                                a4.I("Re-pushed messageId: ");
                                a4.I(e2.u());
                                a4.r();
                                ProcessMessageUpdateAsyncAction.h(esabVar, ((cgzv) processMessageUpdateAsyncAction.e.b()).o(e2, z));
                            }
                        }
                        bjjdVar.close();
                    } else {
                        bjjdVar = (bjjd) processMessageUpdateAsyncAction.h.b(b5).o();
                        try {
                            if (bjjdVar.moveToNext()) {
                                bcse e3 = processMessageUpdateAsyncAction.g.e(bjjdVar);
                                if (axuh.b.contains(Integer.valueOf(e3.f()))) {
                                    bjjdVar.close();
                                } else {
                                    processMessageUpdateAsyncAction.k(e3, b5);
                                    m = ((cgzv) processMessageUpdateAsyncAction.e.b()).n(e3);
                                }
                            } else {
                                if (((Boolean) MessagesTable.h(b5, new Function() { // from class: bani
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        return Boolean.valueOf(((MessagesTable.BindData) obj).ad());
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }, new Supplier() { // from class: banl
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        cskc cskcVar = ProcessMessageUpdateAsyncAction.a;
                                        return false;
                                    }
                                })).booleanValue() && !btza.b(b5).isPresent()) {
                                    m = null;
                                }
                                m = ((cgzv) processMessageUpdateAsyncAction.e.b()).m(b4, b5);
                            }
                            bjjdVar.close();
                            if (m != null) {
                                ProcessMessageUpdateAsyncAction.h(esabVar, m);
                            }
                        } finally {
                            try {
                                bjjdVar.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                    }
                }
                if (((esac) esabVar.instance).b.size() == 0) {
                    return elfo.e(null);
                }
                if (processMessageUpdateAsyncAction.t.z("is_standalone_push_key", false)) {
                    if (bArr == null || str == null) {
                        return elfo.e(null);
                    }
                    try {
                        fcek fcekVar = (fcek) eyfy.parseFrom(fcek.a, bArr, eyfc.a());
                        if (((esac) esabVar.instance).b.size() > ((Integer) bzaq.c.e()).intValue()) {
                            ProcessMessageUpdateAsyncAction.a.m("Notify Ditto to refresh since there are too many messages needs to repush");
                            return processMessageUpdateAsyncAction.j.f(10, fcekVar, str);
                        }
                        ProcessMessageUpdateAsyncAction.a.m("Send corresponding conversation update");
                        processMessageUpdateAsyncAction.k.a(fcekVar, str, e).C(processMessageUpdateAsyncAction);
                    } catch (eygu e4) {
                        ProcessMessageUpdateAsyncAction.a.o("Couldn't parse protobuff.", e4);
                        return elfo.e(null);
                    }
                }
                return bzgd.E(engwVar, new Function() { // from class: bang
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        chwv a5;
                        bzej bzejVar = (bzej) obj;
                        fcek d3 = bzejVar.d();
                        String e5 = bzejVar.e();
                        ProcessMessageUpdateAsyncAction processMessageUpdateAsyncAction2 = ProcessMessageUpdateAsyncAction.this;
                        boolean a6 = ((cgcu) processMessageUpdateAsyncAction2.n.b()).a();
                        esab esabVar2 = esabVar;
                        if (a6) {
                            chwu a7 = processMessageUpdateAsyncAction2.q.a(bzejVar.c(), esaa.GET_UPDATES);
                            a7.c = e5;
                            erxg erxgVar = (erxg) erxi.a.createBuilder();
                            erxgVar.copyOnWrite();
                            erxi erxiVar = (erxi) erxgVar.instance;
                            esac esacVar = (esac) esabVar2.build();
                            esacVar.getClass();
                            erxiVar.c = esacVar;
                            erxiVar.b = 3;
                            a7.b(erxgVar.build());
                            a7.c();
                            a5 = a7.a();
                        } else {
                            chwu c6 = processMessageUpdateAsyncAction2.q.c(d3, Optional.empty(), esaa.GET_UPDATES);
                            c6.c = e5;
                            erxg erxgVar2 = (erxg) erxi.a.createBuilder();
                            erxgVar2.copyOnWrite();
                            erxi erxiVar2 = (erxi) erxgVar2.instance;
                            esac esacVar2 = (esac) esabVar2.build();
                            esacVar2.getClass();
                            erxiVar2.c = esacVar2;
                            erxiVar2.b = 3;
                            c6.b(erxgVar2.build());
                            c6.c();
                            a5 = c6.a();
                        }
                        if (((Optional) processMessageUpdateAsyncAction2.f.b()).isEmpty()) {
                            return elfo.d(new UnsupportedOperationException("DittoRetryExecutor is not available on this device."));
                        }
                        elfl a8 = ((cikg) ((Optional) processMessageUpdateAsyncAction2.f.b()).get()).a(a5);
                        a5.q(a8);
                        return a8;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).h(new emwl() { // from class: banh
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        esab esabVar2 = esab.this;
                        emyz emyzVar = ProcessMessageUpdateAsyncAction.c;
                        ((enai) emyzVar).a.putAll(ennc.d(DesugarCollections.unmodifiableList(((esac) esabVar2.instance).b), new emwl() { // from class: bank
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return ((erzn) obj2).c;
                            }
                        }));
                        return null;
                    }
                }, processMessageUpdateAsyncAction.m);
            }
        }, ((aswi) this.D.b()).a() ? this.H : this.A).e(Throwable.class, new emwl() { // from class: bann
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ecrj ecrjVar = (ecrj) ProcessMessageUpdateAsyncAction.this.o.b();
                ecri ecriVar = d;
                ecriVar.getClass();
                ecrjVar.f(ecriVar, ProcessMessageUpdateAsyncAction.b, null, ecrh.ERROR);
                ProcessMessageUpdateAsyncAction.a.s("Action failed.", (Throwable) obj);
                return null;
            }
        }, erpp.a).h(new emwl() { // from class: bano
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fbzx fbzxVar = (fbzx) obj;
                ecrj ecrjVar = (ecrj) ProcessMessageUpdateAsyncAction.this.o.b();
                ecri ecriVar = d;
                ecriVar.getClass();
                ecrjVar.f(ecriVar, ProcessMessageUpdateAsyncAction.b, null, ecrh.SUCCESS);
                return fbzxVar;
            }
        }, this.m);
        if (bool.booleanValue()) {
            h.h(new emwl() { // from class: banp
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    fbzx fbzxVar = (fbzx) obj;
                    ProcessMessageUpdateAsyncAction.this.l.e("Bugle.Ditto.Action.Success.Metrics.Counts", 14);
                    return fbzxVar;
                }
            }, this.m);
        }
        return elfo.e(null);
    }

    public final void k(bcse bcseVar, MessageIdType messageIdType) {
        if (Instant.ofEpochMilli(bcseVar.i()).isAfter(this.C.f().minus(Duration.ofDays(((Long) this.B.b()).longValue())))) {
            if (!((Boolean) bzpf.a.e()).booleanValue()) {
                this.y.b(bcseVar).t();
                return;
            }
            bzpi bzpiVar = (bzpi) this.z.b();
            bzpg bzpgVar = (bzpg) bzph.a.createBuilder();
            bzpgVar.a(messageIdType.b());
            bzph bzphVar = (bzph) bzpgVar.build();
            cetp cetpVar = new cetp();
            cetpVar.b = "blobstore-".concat(String.valueOf(messageIdType.b()));
            bzpiVar.b(bzphVar, cetpVar.a());
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ProcessMessageUpdateAsyncAction(bzgd bzgdVar, ffbr ffbrVar, ffbr ffbrVar2, chww chwwVar, ffbr ffbrVar3, akzt akztVar, bbfl bbflVar, bbfs bbfsVar, bbgi bbgiVar, bcsf bcsfVar, errl errlVar, errl errlVar2, ffbr ffbrVar4, bcsq bcsqVar, bcsy bcsyVar, ffbr ffbrVar5, ffbr ffbrVar6, cqoh cqohVar, ffbr ffbrVar7, ffbr ffbrVar8, atky atkyVar, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, Parcel parcel) {
        super(parcel, eogt.PROCESS_MESSAGE_UPDATE_ACTION);
        this.d = bzgdVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.q = chwwVar;
        this.z = ffbrVar3;
        this.l = akztVar;
        this.m = errlVar;
        this.A = errlVar2;
        this.n = ffbrVar5;
        this.B = ffbrVar6;
        this.C = cqohVar;
        this.k = bbflVar;
        this.j = bbfsVar;
        this.y = bbgiVar;
        this.g = bcsfVar;
        this.h = bcsqVar;
        this.i = bcsyVar;
        this.o = ffbrVar8;
        this.p = atkyVar;
        this.E = ffbrVar9;
        this.F = ffbrVar10;
        this.G = ffbrVar11;
        this.D = ffbrVar7;
        if (((aswi) ffbrVar7.b()).a()) {
            this.H = (Executor) ffbrVar4.b();
        } else {
            this.H = new ersb(errlVar2);
        }
    }

    public ProcessMessageUpdateAsyncAction(bzgd bzgdVar, ffbr ffbrVar, ffbr ffbrVar2, chww chwwVar, ffbr ffbrVar3, akzt akztVar, bbfl bbflVar, bbfs bbfsVar, bbgi bbgiVar, bcsf bcsfVar, errl errlVar, errl errlVar2, ffbr ffbrVar4, bcsq bcsqVar, bcsy bcsyVar, ffbr ffbrVar5, ffbr ffbrVar6, cqoh cqohVar, ffbr ffbrVar7, ffbr ffbrVar8, atky atkyVar, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, fcek fcekVar, String str, long j) {
        super(eogt.PROCESS_MESSAGE_UPDATE_ACTION);
        this.d = bzgdVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.q = chwwVar;
        this.z = ffbrVar3;
        this.l = akztVar;
        this.m = errlVar;
        this.A = errlVar2;
        this.k = bbflVar;
        this.j = bbfsVar;
        this.y = bbgiVar;
        this.g = bcsfVar;
        this.h = bcsqVar;
        this.i = bcsyVar;
        this.n = ffbrVar5;
        this.B = ffbrVar6;
        this.C = cqohVar;
        this.t.q("desktop_id_key", fcekVar.toByteArray());
        this.t.v("request_id_key", str);
        this.t.s("message_timestamp_key", j);
        this.o = ffbrVar8;
        this.p = atkyVar;
        this.E = ffbrVar9;
        this.F = ffbrVar10;
        this.G = ffbrVar11;
        this.D = ffbrVar7;
        if (((aswi) ffbrVar7.b()).a()) {
            this.H = (Executor) ffbrVar4.b();
        } else {
            this.H = new ersb(errlVar2);
        }
    }

    public ProcessMessageUpdateAsyncAction(bzgd bzgdVar, ffbr ffbrVar, ffbr ffbrVar2, chww chwwVar, ffbr ffbrVar3, akzt akztVar, bbfl bbflVar, bbfs bbfsVar, bbgi bbgiVar, bcsf bcsfVar, errl errlVar, errl errlVar2, ffbr ffbrVar4, bcsq bcsqVar, bcsy bcsyVar, ffbr ffbrVar5, ffbr ffbrVar6, cqoh cqohVar, ffbr ffbrVar7, ffbr ffbrVar8, atky atkyVar, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, fcek fcekVar, String str, long j, byte[] bArr) {
        super(eogt.PROCESS_MESSAGE_UPDATE_ACTION);
        this.d = bzgdVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.q = chwwVar;
        this.z = ffbrVar3;
        this.l = akztVar;
        this.m = errlVar;
        this.A = errlVar2;
        this.k = bbflVar;
        this.j = bbfsVar;
        this.y = bbgiVar;
        this.g = bcsfVar;
        this.h = bcsqVar;
        this.i = bcsyVar;
        this.n = ffbrVar5;
        this.B = ffbrVar6;
        this.C = cqohVar;
        this.p = atkyVar;
        this.t.q("desktop_id_key", fcekVar.toByteArray());
        this.t.v("request_id_key", str);
        this.t.s("message_timestamp_key", j);
        this.t.p("is_standalone_push_key", true);
        this.o = ffbrVar8;
        this.E = ffbrVar9;
        this.F = ffbrVar10;
        this.G = ffbrVar11;
        this.D = ffbrVar7;
        if (((aswi) ffbrVar7.b()).a()) {
            this.H = (Executor) ffbrVar4.b();
        } else {
            this.H = new ersb(errlVar2);
        }
    }
}
