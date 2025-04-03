package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.action.DeleteConversationAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import defpackage.aewg;
import defpackage.agsp;
import defpackage.agss;
import defpackage.akvy;
import defpackage.alrv;
import defpackage.altk;
import defpackage.axmt;
import defpackage.axmw;
import defpackage.aygh;
import defpackage.badh;
import defpackage.bbet;
import defpackage.bcwz;
import defpackage.bczy;
import defpackage.bdgq;
import defpackage.bdmq;
import defpackage.bdvi;
import defpackage.bsoe;
import defpackage.bsom;
import defpackage.buuo;
import defpackage.buxo;
import defpackage.buxs;
import defpackage.buxz;
import defpackage.bwav;
import defpackage.bwdf;
import defpackage.bwdm;
import defpackage.byyt;
import defpackage.cbbm;
import defpackage.cbek;
import defpackage.cbgf;
import defpackage.cfup;
import defpackage.cgpv;
import defpackage.cish;
import defpackage.cjam;
import defpackage.cjbc;
import defpackage.ckds;
import defpackage.covo;
import defpackage.coxk;
import defpackage.cpxu;
import defpackage.cqrl;
import defpackage.csix;
import defpackage.csjb;
import defpackage.csjy;
import defpackage.cskc;
import defpackage.csll;
import defpackage.csux;
import defpackage.cthp;
import defpackage.cubs;
import defpackage.cugm;
import defpackage.cuqm;
import defpackage.dtzj;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.engw;
import defpackage.enqv;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.eogt;
import defpackage.eohh;
import defpackage.eoko;
import defpackage.eokw;
import defpackage.ffbr;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class DeleteConversationAction extends Action<Void> implements Parcelable {
    private final axmw A;
    private final ffbr B;
    private final ffbr C;
    private final ffbr D;
    private final ffbr E;
    private final ffbr F;
    public final altk a;
    public final ffbr b;
    private final Context e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final akvy k;
    private final ckds l;
    private final Optional m;
    private final coxk n;
    private final covo o;
    private final alrv p;
    private final cbgf q;
    private final bdvi y;
    private final bcwz z;
    private static final cskc c = cskc.g("BugleDataModel", "DeleteConversationAction");
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/datamodel/action/DeleteConversationAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new badh();

    /* compiled from: PG */
    public interface a {
        bbet aS();
    }

    public DeleteConversationAction(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, akvy akvyVar, ckds ckdsVar, Optional optional, coxk coxkVar, altk altkVar, ffbr ffbrVar7, covo covoVar, alrv alrvVar, cbgf cbgfVar, bdvi bdviVar, bcwz bcwzVar, axmw axmwVar, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, Parcel parcel) {
        super(parcel, eogt.DELETE_CONVERSATION_ACTION);
        this.e = context;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.j = ffbrVar5;
        this.k = akvyVar;
        this.l = ckdsVar;
        this.m = optional;
        this.n = coxkVar;
        this.a = altkVar;
        this.b = ffbrVar7;
        this.o = covoVar;
        this.p = alrvVar;
        this.q = cbgfVar;
        this.y = bdviVar;
        this.z = bcwzVar;
        this.A = axmwVar;
        this.B = ffbrVar8;
        this.C = ffbrVar6;
        this.D = ffbrVar9;
        this.E = ffbrVar10;
        this.F = ffbrVar11;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("DeleteConversationAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        w();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.DeleteConversation.ExcuteAction.Latency";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fR() {
        Bundle bundle;
        Runnable runnable;
        String[] strArr;
        boolean z;
        boolean z2;
        Runnable runnable2;
        buxs buxsVar;
        final DeleteConversationAction deleteConversationAction = this;
        try {
            final ConversationIdType b = bdgq.b(deleteConversationAction.t.l("conversation_id"));
            if (b.b()) {
                bundle = null;
                c.n("conversationId is empty.");
            } else {
                final SuperSortLabel a2 = SuperSortLabel.a(deleteConversationAction.t.a("supersort_filter"));
                final long d2 = deleteConversationAction.t.d("cutoff_timestamp");
                if (((Boolean) ((cfup) cubs.b.get()).e()).booleanValue()) {
                    ((Optional) deleteConversationAction.B.b()).ifPresent(new Consumer() { // from class: badf
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ((cuqm) obj).a(ConversationIdType.this, true, cuqh.c);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                final boolean R = ((bdmq) deleteConversationAction.i.b()).R(b);
                final byyt s = ((bczy) deleteConversationAction.h.b()).s(b);
                final eokw e = deleteConversationAction.k.e(b);
                eoko b2 = eoko.b(deleteConversationAction.t.a("conversation_origin"));
                if (b2 == null) {
                    b2 = eoko.CONVERSATION_FROM_DELETION_LOGGING;
                }
                final eoko eokoVar = b2;
                ((cugm) deleteConversationAction.F.b()).e(b);
                try {
                    if (((Boolean) ((cfup) aygh.b.get()).e()).booleanValue()) {
                        runnable = new Runnable() { // from class: bada
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((aygh) DeleteConversationAction.this.b.b()).a(e, b, eokoVar, R, s);
                            }
                        };
                        deleteConversationAction = this;
                    } else {
                        deleteConversationAction = this;
                        runnable = new Runnable() { // from class: badb
                            @Override // java.lang.Runnable
                            public final void run() {
                                DeleteConversationAction.this.a.t(e, b, eokoVar, R, s);
                            }
                        };
                    }
                    Runnable runnable3 = runnable;
                    boolean y = deleteConversationAction.t.y("conversation_only_if_empty");
                    cpxu a3 = ((cbek) deleteConversationAction.C.b()).a(b);
                    boolean d3 = ((axmt) deleteConversationAction.g.b()).d(b, a3);
                    if (d3) {
                        if (d2 != Long.MAX_VALUE) {
                            String[] strArr2 = MessagesTable.a;
                            buxz buxzVar = new buxz();
                            buxzVar.U(d2);
                            buxsVar = new buxs(buxzVar);
                        } else {
                            buxsVar = null;
                        }
                        strArr = ((axmt) deleteConversationAction.g.b()).f(b, buxsVar);
                    } else {
                        strArr = null;
                    }
                    ekzz f = eleg.f("FileTransferDatabaseOperations#getConversationFileTransferSessionIds");
                    try {
                        csix.h();
                        csix.l(b);
                        buxo d4 = MessagesTable.d();
                        d4.z("getConversationFileTransferSessionIds");
                        d4.h(new Function() { // from class: cqrk
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                buxz buxzVar2 = (buxz) obj;
                                entd entdVar = cqrl.a;
                                buxzVar2.m(ConversationIdType.this);
                                int intValue = MessagesTable.g().intValue();
                                if (intValue < 10004) {
                                    dtub.w("rcs_file_transfer_session_id", intValue);
                                }
                                buxzVar2.aq(new dtwe("messages.rcs_file_transfer_session_id", 2, -1L));
                                return buxzVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        buuo buuoVar = (buuo) d4.b().p(MessagesTable.c.I);
                        try {
                            engw x = buuoVar.x();
                            buuoVar.close();
                            f.close();
                            buxo d5 = MessagesTable.d();
                            d5.f(new Function() { // from class: badc
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return ((buum) obj).a;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            buxz buxzVar2 = new buxz();
                            buxzVar2.m(b);
                            buxzVar2.U(d2);
                            d5.g(buxzVar2);
                            dtzj b3 = d5.b();
                            if (aewg.h() && a2.b()) {
                                agsp a4 = agss.a();
                                a4.d(new Function() { // from class: badd
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        return ((agsi) obj).f;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                a4.e(new Function() { // from class: bade
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        agsr agsrVar = (agsr) obj;
                                        Parcelable.Creator<Action<Void>> creator = DeleteConversationAction.CREATOR;
                                        agsrVar.b(ConversationIdType.this);
                                        agsrVar.aq(new dtwe("messages.received_timestamp", 10, Long.valueOf(d2)));
                                        agsrVar.aq(new dtwe("message_labels.label", 1, Integer.valueOf(a2.i)));
                                        return agsrVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                b3 = a4.b();
                            }
                            bwdf c2 = PartsTable.c();
                            bundle = null;
                            c2.z("cleanupParts");
                            bwdm bwdmVar = new bwdm();
                            bwdmVar.i(b);
                            bwdmVar.x();
                            bwdmVar.o(b3);
                            c2.g(bwdmVar);
                            bwav bwavVar = (bwav) c2.b().o();
                            while (bwavVar.moveToNext()) {
                                try {
                                    covo covoVar = deleteConversationAction.o;
                                    Uri i = bwavVar.i();
                                    if (i != null) {
                                        z2 = y;
                                        runnable2 = runnable3;
                                        csjy.l("Bugle", "Clearing cache for ".concat(i.toString()));
                                        ((cbbm) covoVar.a.b()).c(1).e(i.toString());
                                    } else {
                                        z2 = y;
                                        runnable2 = runnable3;
                                    }
                                    if (!z2 && eohh.b(bwavVar.c()) != eohh.GIF_CHOOSER) {
                                        deleteConversationAction.z.f(bwavVar).ak();
                                    }
                                    y = z2;
                                    runnable3 = runnable2;
                                } finally {
                                }
                            }
                            boolean z3 = y;
                            Runnable runnable4 = runnable3;
                            bwavVar.close();
                            eoko b4 = eoko.b(deleteConversationAction.t.a("conversation_origin"));
                            eoko eokoVar2 = eoko.CONVERSATION_FROM_CMS_ACTION;
                            if (z3) {
                                z = ((cgpv) deleteConversationAction.f.b()).g(b);
                            } else if ((b4 == eokoVar2 ? ((cgpv) deleteConversationAction.f.b()).f(b, a2, d2) : ((cgpv) deleteConversationAction.f.b()).e(b, a2, d2)).c()) {
                                cskc cskcVar = c;
                                csjb c3 = cskcVar.c();
                                c3.I("Deleted local");
                                c3.c(b);
                                c3.z("cutoffTimestamp", d2);
                                c3.r();
                                if (!x.isEmpty()) {
                                    csjb c4 = cskcVar.c();
                                    c4.I("Deleting RCS engine file transfers associated with");
                                    c4.c(b);
                                    c4.r();
                                    enqv it = x.iterator();
                                    while (it.hasNext()) {
                                        deleteConversationAction.l.x(((Long) it.next()).longValue());
                                    }
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z3) {
                                f = eleg.f("DeleteDatabaseOperations#resetConversationDeleteTimestamp");
                                try {
                                    String[] strArr3 = bsom.a;
                                    bsoe bsoeVar = new bsoe();
                                    bsoeVar.ap("resetConversationDeleteTimestamp");
                                    bsoeVar.o(0L);
                                    bsoeVar.ad(new Function() { // from class: cgpo
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            bsol bsolVar = (bsol) obj;
                                            bsolVar.q(ConversationIdType.this);
                                            return bsolVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    bsoeVar.b().e();
                                    f.close();
                                } finally {
                                }
                            } else {
                                ((cgpv) deleteConversationAction.f.b()).h(b, d2);
                            }
                            if (z) {
                                ensk h = d.h();
                                h.Y(ente.a, "BugleNotifications");
                                enrr enrrVar = (enrr) h;
                                enrrVar.Y(csux.o, b.toString());
                                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/action/DeleteConversationAction", "doBackgroundWork", 380, "DeleteConversationAction.java")).q("Deleting conversation, canceling IM notification (action)");
                                ((cjbc) deleteConversationAction.D.b()).a(b);
                                ((cjam) deleteConversationAction.E.b()).d(b);
                                deleteConversationAction.q.d(b);
                                deleteConversationAction.m.ifPresent(new Consumer() { // from class: badg
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj) {
                                        ((csll) obj).i();
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                if (a3.c()) {
                                    if (deleteConversationAction.n.U(a3.a(), d2)) {
                                        csjb c5 = c.c();
                                        c5.I("Deleted telephony");
                                        c5.A("threadId", a3);
                                        c5.z("cutoffTimestamp", d2);
                                        c5.r();
                                    } else {
                                        csjb e2 = c.e();
                                        e2.I("there were no messages to delete. telephony:");
                                        e2.c(b);
                                        e2.A("threadId", a3);
                                        e2.z("cutoffTimestamp", d2);
                                        e2.I("[might have been a conversation with just a draft].");
                                        e2.r();
                                    }
                                } else if (!d3) {
                                    csjb e3 = c.e();
                                    e3.I("Local conversation");
                                    e3.c(b);
                                    e3.I("has an invalid telephony thread id; will delete messages individually.");
                                    e3.r();
                                    ConversationIdType b5 = bdgq.b(deleteConversationAction.t.l("conversation_id"));
                                    csix.l(b5);
                                    ArrayList arrayList = new ArrayList();
                                    buxo d6 = MessagesTable.d();
                                    d6.z("deleteConversationMessagesFromTelephony");
                                    buxz buxzVar3 = new buxz();
                                    buxzVar3.m(b5);
                                    d6.g(buxzVar3);
                                    d6.c(MessagesTable.c.o);
                                    buuo buuoVar2 = (buuo) d6.b().o();
                                    while (buuoVar2.moveToNext()) {
                                        try {
                                            try {
                                                arrayList.add(buuoVar2.o());
                                            } catch (Exception e4) {
                                                csjb b6 = c.b();
                                                b6.I("Could not parse message uri:");
                                                b6.I(buuoVar2.o());
                                                b6.s(e4);
                                            }
                                        } finally {
                                        }
                                    }
                                    buuoVar2.close();
                                    int size = arrayList.size();
                                    boolean z4 = true;
                                    for (int i2 = 0; i2 < size; i2++) {
                                        Uri uri = (Uri) arrayList.get(i2);
                                        if (deleteConversationAction.n.a(uri, "Bugle.Telephony.Delete.SmsBulk.Latency") > 0) {
                                            csjb a5 = c.a();
                                            a5.I("Deleted telephony message:");
                                            a5.A("messageUri", uri);
                                            a5.r();
                                        } else {
                                            csjb e5 = c.e();
                                            e5.I("Could not delete telephony message:");
                                            e5.A("messageUri", uri);
                                            e5.r();
                                            z4 = false;
                                        }
                                    }
                                    if (!z4) {
                                        c.r("doBackgroundWork: not all message deleted.");
                                        deleteConversationAction.y.a();
                                    }
                                } else if (strArr != null) {
                                    deleteConversationAction.A.b(deleteConversationAction.e, strArr);
                                }
                                runnable4.run();
                            } else if (!z3) {
                                csjb e6 = c.e();
                                e6.I("Could not delete local");
                                e6.c(b);
                                e6.r();
                                deleteConversationAction.y.a();
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    th = th;
                    deleteConversationAction = this;
                    deleteConversationAction.p.f(alrv.m);
                    throw th;
                }
            }
            deleteConversationAction.p.f(alrv.m);
            return bundle;
        } catch (Throwable th2) {
            th = th2;
            deleteConversationAction.p.f(alrv.m);
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public DeleteConversationAction(Context context, ffbr<cgpv> ffbrVar, ffbr<axmt> ffbrVar2, ffbr<bczy> ffbrVar3, ffbr<bdmq> ffbrVar4, ffbr<cqrl> ffbrVar5, ffbr<cbek> ffbrVar6, akvy akvyVar, ckds ckdsVar, cthp cthpVar, Optional<csll> optional, coxk coxkVar, altk altkVar, ffbr<aygh> ffbrVar7, covo covoVar, alrv alrvVar, cish cishVar, cbgf cbgfVar, bdvi bdviVar, bcwz bcwzVar, axmw axmwVar, ffbr<Optional<cuqm>> ffbrVar8, ffbr<cjbc> ffbrVar9, ffbr<cjam> ffbrVar10, ffbr<cugm> ffbrVar11, ConversationIdType conversationIdType, long j, SuperSortLabel superSortLabel, eoko eokoVar, boolean z) {
        super(eogt.DELETE_CONVERSATION_ACTION);
        this.e = context;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.j = ffbrVar5;
        this.k = akvyVar;
        this.l = ckdsVar;
        this.m = optional;
        this.n = coxkVar;
        this.a = altkVar;
        this.b = ffbrVar7;
        this.o = covoVar;
        this.p = alrvVar;
        this.q = cbgfVar;
        this.y = bdviVar;
        this.z = bcwzVar;
        this.A = axmwVar;
        this.B = ffbrVar8;
        this.D = ffbrVar9;
        this.E = ffbrVar10;
        this.F = ffbrVar11;
        if (!conversationIdType.b()) {
            this.t.v("conversation_id", conversationIdType.a());
        }
        this.t.s("cutoff_timestamp", j);
        this.t.r("conversation_origin", eokoVar == null ? -1 : eokoVar.u);
        this.t.p("conversation_only_if_empty", z);
        this.t.r("supersort_filter", superSortLabel.i);
        this.C = ffbrVar6;
    }
}
