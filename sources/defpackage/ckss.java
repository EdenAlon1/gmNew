package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckss {
    public static final entd a = entd.c("BugleGroupManagement");
    public final ffbr b;
    public final Context c;
    public final errl d;
    public final ffbr e;
    public final coxk f;
    public final ffbr g;
    public final cbgf h;
    public final ckju i;
    public final clbb j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    private final bctg n;
    private final ffbr o;

    public ckss(Context context, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, coxk coxkVar, ffbr ffbrVar3, cbgf cbgfVar, bctg bctgVar, ckju ckjuVar, clbb clbbVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        this.c = context;
        this.d = errlVar;
        this.e = ffbrVar;
        this.b = ffbrVar2;
        this.f = coxkVar;
        this.g = ffbrVar3;
        this.h = cbgfVar;
        this.n = bctgVar;
        this.i = ckjuVar;
        this.j = clbbVar;
        this.k = ffbrVar4;
        this.o = ffbrVar5;
        this.l = ffbrVar6;
        this.m = ffbrVar7;
    }

    public static ParticipantsTable.BindData b(final String str) {
        if (emxe.c(str)) {
            return null;
        }
        bvvn e = ParticipantsTable.e();
        e.z("getOriginatorBindData");
        e.h(new Function() { // from class: cksm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                entd entdVar = ckss.a;
                bvvwVar.r(str);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.d(new bvvk(ParticipantsTable.c.d, false));
        e.x(1);
        bvti bvtiVar = (bvti) e.b().o();
        try {
            ParticipantsTable.BindData bindData = bvtiVar.moveToFirst() ? (ParticipantsTable.BindData) bvtiVar.cO() : null;
            bvtiVar.close();
            ((ensz) a.n().h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "getOriginatorBindData", 548, "RcsGroupNameUpdater.java")).t("Originator MSISDN participant subIds: %s", new enrw() { // from class: cksn
                @Override // defpackage.enrw
                public final Object a() {
                    entd entdVar = ckss.a;
                    bvvn e2 = ParticipantsTable.e();
                    e2.z("getLoggableOriginatorParticipantSubIds");
                    final String str2 = str;
                    e2.h(new Function() { // from class: cksl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bvvw bvvwVar = (bvvw) obj;
                            entd entdVar2 = ckss.a;
                            bvvwVar.r(str2);
                            return bvvwVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    e2.d(new bvvk(ParticipantsTable.c.d, false));
                    return e2.b().g();
                }
            });
            return bindData;
        } catch (Throwable th) {
            try {
                bvtiVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final bsoe a(String str, ConversationIdType conversationIdType) {
        if (!str.isEmpty()) {
            String[] strArr = bsom.a;
            bsoe bsoeVar = new bsoe();
            bsoeVar.al();
            bsoeVar.ap("getUpdateValues-conversations2");
            bsoeVar.C(str);
            bsoeVar.D(byyy.NAME_IS_MANUAL);
            return bsoeVar;
        }
        bdvj a2 = ((bdvl) this.o.b()).a(engw.n(((bczy) this.e.b()).L(conversationIdType)));
        String[] strArr2 = bsom.a;
        bsoe bsoeVar2 = new bsoe();
        bsoeVar2.ap("getUpdateValues-conversations1");
        bsoeVar2.C(this.n.a(a2));
        bsoeVar2.D(byyy.NAME_IS_AUTOMATIC);
        return bsoeVar2;
    }

    public final elfl c(final cksv cksvVar) {
        return elfo.h(new erog() { // from class: cksj
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final ConversationIdType a2;
                long b;
                bsoe a3;
                String I;
                final cksv cksvVar2 = cksvVar;
                if (cksvVar2.h.isEmpty() && cksvVar2.c.isEmpty()) {
                    ((ensz) ((ensz) ckss.a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "areParametersInvalid", 292, "RcsGroupNameUpdater.java")).q("No conversation ID or group ID provided when updating the group name");
                } else {
                    eyja eyjaVar = cksvVar2.f;
                    if (eyjaVar == null) {
                        eyjaVar = eyja.a;
                    }
                    if (eykm.b(eyjaVar) >= 0) {
                        String str = cksvVar2.d;
                        eyja eyjaVar2 = cksvVar2.f;
                        if (eyjaVar2 == null) {
                            eyjaVar2 = eyja.a;
                        }
                        final ckss ckssVar = ckss.this;
                        if (cksvVar2.h.isEmpty()) {
                            String str2 = cksvVar2.c;
                            long j = cksvVar2.e;
                            ckjy w = ckjz.w();
                            w.j(false);
                            w.p(false);
                            w.q(true);
                            w.w(epby.GROUP_NOTIFICATION);
                            if (!str2.isEmpty()) {
                                w.u(str2);
                            }
                            if (j != -1) {
                                w.z(j);
                            }
                            a2 = ckssVar.i.a(w.D());
                        } else {
                            a2 = bdgq.b(cksvVar2.h);
                        }
                        if (a2.b()) {
                            ensz enszVar = (ensz) ckss.a.j();
                            enszVar.Y(csux.p, a2);
                            enszVar.Y(csux.J, cksvVar2.c);
                            enszVar.Y(csux.H, Long.valueOf(cksvVar2.e));
                            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "update", 165, "RcsGroupNameUpdater.java")).q("Failed to retrieve conversation and thread id");
                            return elfo.e(ceyt.k());
                        }
                        bsob e = bsom.e();
                        e.z("getProjectedConversationData");
                        e.f(new Function() { // from class: cksp
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bskp bskpVar = (bskp) obj;
                                entd entdVar = ckss.a;
                                return new bskq[]{bskpVar.b, bskpVar.aa, bskpVar.c, bskpVar.d, bskpVar.ae, bskpVar.A};
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        e.i(new Function() { // from class: cksq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bsol bsolVar = (bsol) obj;
                                entd entdVar = ckss.a;
                                bsolVar.q(ConversationIdType.this);
                                return bsolVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bseh bsehVar = (bseh) ((bskr) e.b().o()).cS();
                        if (bsehVar == null) {
                            ensz enszVar2 = (ensz) ckss.a.j();
                            enszVar2.Y(csux.p, a2);
                            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "update", 175, "RcsGroupNameUpdater.java")).q("Failed to retrieve conversation data");
                            return elfo.e(ceyt.k());
                        }
                        final String ad = bsehVar.ad();
                        if (ad == null) {
                            ensz enszVar3 = (ensz) ckss.a.j();
                            enszVar3.Y(csux.p, a2);
                            ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "update", 183, "RcsGroupNameUpdater.java")).q("Conversation has null group ID");
                            return elfo.e(ceyt.k());
                        }
                        if (ckrv.a(str, bsehVar.X(), bsehVar.H())) {
                            long w2 = bsehVar.w();
                            if (eyja.a.equals(eyjaVar2) || eykm.b(eyjaVar2) >= w2) {
                                if (eyja.a.equals(eyjaVar2)) {
                                    a3 = ckssVar.a(str, a2);
                                    b = -1;
                                } else {
                                    b = eykm.b(eyjaVar2);
                                    a3 = ckssVar.a(str, a2);
                                    int intValue = bsom.g().intValue();
                                    int intValue2 = bsom.g().intValue();
                                    if (intValue2 < 46050) {
                                        dtub.w("rcs_subject_change_timestamp_ms", intValue2);
                                    }
                                    if (intValue >= 46050) {
                                        a3.a.put("rcs_subject_change_timestamp_ms", Long.valueOf(b));
                                    }
                                }
                                cpxu M = bsehVar.M();
                                if (!((atzq) ckssVar.b.b()).a()) {
                                    I = ckssVar.f.I(M);
                                    if (I == null) {
                                        ensz enszVar4 = (ensz) ckss.a.j();
                                        enszVar4.Y(csux.r, M);
                                        ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "update", 238, "RcsGroupNameUpdater.java")).q("Failed to retrieve recipient id for thread id");
                                        return elfo.e(ceyt.k());
                                    }
                                } else if (M.d()) {
                                    ensk n = ckss.a.n();
                                    n.Y(csux.p, a2);
                                    ((ensz) n.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "update", 218, "RcsGroupNameUpdater.java")).q("Ignoring telephony group rename for empty thread id");
                                    ((akzt) ckssVar.m.b()).c("Bugle.GroupName.RcsRenameNoTelephonyThreadId.Counts");
                                    I = null;
                                } else {
                                    I = ckssVar.f.I(M);
                                    if (I == null) {
                                        ensz enszVar5 = (ensz) ckss.a.j();
                                        enszVar5.Y(csux.r, M);
                                        ((ensz) enszVar5.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "update", 228, "RcsGroupNameUpdater.java")).q("Failed to retrieve recipient id for thread id");
                                        return elfo.e(ceyt.k());
                                    }
                                }
                                emxf.b(cksvVar2.i > 0, "Invalid subscription Id while attempting group rename.");
                                final aztg g = ((bdtd) ckssVar.k.b()).g(cksvVar2.i);
                                ensk n2 = ckss.a.n();
                                n2.Y(csux.p, a2);
                                n2.Y(csux.r, M);
                                n2.Y(csux.J, ad);
                                n2.Y(cksx.a, I);
                                ensn ensnVar = cksx.b;
                                String d = a3.d();
                                d.getClass();
                                n2.Y(ensnVar, d);
                                n2.Y(cksx.c, a3.c());
                                n2.Y(cksx.d, Long.valueOf(b));
                                n2.Y(cksx.e, cksvVar2.g);
                                ((ensz) n2.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "update", 259, "RcsGroupNameUpdater.java")).q("Updating conversation name");
                                SelfIdentityId c = aqvf.c(bsehVar.S());
                                final bsoe bsoeVar = a3;
                                final ConversationIdType conversationIdType = a2;
                                final String str3 = I;
                                return (c == null ? elfo.e(Optional.empty()) : ((ckac) ckssVar.l.b()).c(c)).h(new emwl() { // from class: ckso
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj) {
                                        String str4 = cksvVar2.g;
                                        cksi cksiVar = new cksi(conversationIdType, ad, str3);
                                        String str5 = (String) ((Optional) obj).map(new Function() { // from class: cksk
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                return ((awui) obj2).d;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).orElse(null);
                                        bsoe bsoeVar2 = bsoeVar;
                                        bsoeVar2.d().getClass();
                                        if (TextUtils.isEmpty(str5)) {
                                            ((ensz) ((ensz) ckss.a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "updateState", 456, "RcsGroupNameUpdater.java")).q("Failed to retrieve the local MSISDN");
                                            return ceyt.m();
                                        }
                                        ckss ckssVar2 = ckss.this;
                                        if (!((bczy) ckssVar2.e.b()).ak(cksiVar.a, bsoeVar2)) {
                                            ((ensz) ((ensz) ckss.a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "updateState", 462, "RcsGroupNameUpdater.java")).q("updateConversationRowIfExists failed when updating conversation name");
                                            return ceyt.k();
                                        }
                                        final String d2 = bsoeVar2.d();
                                        d2.getClass();
                                        byyy c2 = bsoeVar2.c();
                                        String str6 = cksiVar.c;
                                        ffbr ffbrVar = ckssVar2.b;
                                        byyy byyyVar = byyy.NAME_IS_AUTOMATIC;
                                        if (!((atzq) ffbrVar.b()).a() || str6 != null) {
                                            ((ensz) ckss.a.n().h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "onSuccessfulDatabaseUpdate", 501, "RcsGroupNameUpdater.java")).r("TelephonyManagerInterface updated %s rows when updating the canonical address", ckssVar2.f.c(ckssVar2.c.getContentResolver(), str6, ckssVar2.j.a(str5, cksiVar.b, c2 == byyyVar ? "" : d2)));
                                        }
                                        final aztg aztgVar = g;
                                        if (c2 == byyyVar) {
                                            final cbvt cbvtVar = (cbvt) ckssVar2.g.b();
                                            final ConversationIdType conversationIdType2 = cksiVar.a;
                                            final ParticipantsTable.BindData b2 = ckss.b(str4);
                                            cbvtVar.j.d("TombstoneInserter#insertRcsGroupNameClearTombstone", new Runnable() { // from class: cbvf
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    engw engwVar;
                                                    aztg aztgVar2 = aztgVar;
                                                    ParticipantsTable.BindData bindData = b2;
                                                    Optional empty = Optional.empty();
                                                    ParticipantsTable.BindData a4 = bindData != null ? bindData : aztgVar2.a();
                                                    if (bindData != null) {
                                                        engwVar = engw.r(bindData);
                                                    } else {
                                                        int i = engw.d;
                                                        engwVar = enou.a;
                                                    }
                                                    engw engwVar2 = engwVar;
                                                    ConversationIdType conversationIdType3 = conversationIdType2;
                                                    cbvt cbvtVar2 = cbvt.this;
                                                    cbvtVar2.k(empty, conversationIdType3, aztgVar2, a4, engwVar2, 218, cbvtVar2.f.f().toEpochMilli(), -1L, null);
                                                }
                                            });
                                        } else {
                                            final cbvt cbvtVar2 = (cbvt) ckssVar2.g.b();
                                            final ConversationIdType conversationIdType3 = cksiVar.a;
                                            final ParticipantsTable.BindData b3 = ckss.b(str4);
                                            cbvtVar2.j.d("TombstoneInserter#insertRcsGroupRenameTombstone", new Runnable() { // from class: cbve
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    engw engwVar;
                                                    aztg aztgVar2 = aztgVar;
                                                    ParticipantsTable.BindData bindData = b3;
                                                    Optional empty = Optional.empty();
                                                    ParticipantsTable.BindData a4 = bindData != null ? bindData : aztgVar2.a();
                                                    if (bindData != null) {
                                                        engwVar = engw.r(bindData);
                                                    } else {
                                                        int i = engw.d;
                                                        engwVar = enou.a;
                                                    }
                                                    engw engwVar2 = engwVar;
                                                    String str7 = d2;
                                                    ConversationIdType conversationIdType4 = conversationIdType3;
                                                    cbvt cbvtVar3 = cbvt.this;
                                                    cbvtVar3.k(empty, conversationIdType4, aztgVar2, a4, engwVar2, 217, cbvtVar3.f.f().toEpochMilli(), -1L, str7);
                                                }
                                            });
                                        }
                                        ckssVar2.h.d(cksiVar.a);
                                        return ceyt.i();
                                    }
                                }, ckssVar.d);
                            }
                        }
                        ensk n3 = ckss.a.n();
                        n3.Y(csux.p, a2);
                        n3.Y(cksx.b, str);
                        n3.Y(cksx.c, bsehVar.H());
                        n3.Y(cksx.d, Long.valueOf(eykm.b(eyjaVar2)));
                        n3.Y(cksx.d, Long.valueOf(bsehVar.w()));
                        ((ensz) n3.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "update", 197, "RcsGroupNameUpdater.java")).q("No name update applicable");
                        return elfo.e(ceyt.i());
                    }
                    ensz enszVar6 = (ensz) ckss.a.j();
                    enszVar6.Y(csux.o, cksvVar2.h);
                    enszVar6.Y(csux.J, cksvVar2.c);
                    ((ensz) enszVar6.h("com/google/android/apps/messaging/shared/rcs/groups/management/namechange/workhandler/RcsGroupNameUpdater", "areParametersInvalid", 303, "RcsGroupNameUpdater.java")).q("Negative timestamp provided when updating the group name");
                }
                return elfo.e(ceyt.k());
            }
        }, this.d);
    }
}
