package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.InsertNewMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aolr;
import defpackage.aquz;
import defpackage.aqvf;
import defpackage.astl;
import defpackage.augw;
import defpackage.axol;
import defpackage.bagh;
import defpackage.bagi;
import defpackage.bahn;
import defpackage.bahp;
import defpackage.bbfb;
import defpackage.bdgq;
import defpackage.byyt;
import defpackage.cipm;
import defpackage.csix;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.endq;
import defpackage.engw;
import defpackage.entd;
import defpackage.eogt;
import defpackage.eooi;
import defpackage.equw;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.ffbr;
import defpackage.ffhe;
import defpackage.ffsm;
import defpackage.fhpc;
import defpackage.fjay;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class InsertNewMessageAction extends Action<Void> implements Parcelable {
    public final ffbr b;
    public final ffbr c;
    public final dtuu d;
    public final aolr e;
    public final ffbr f;
    public final bagi g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final augw k;
    private final cipm l;
    public static final entd a = entd.c("BugleDataModel");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bagh();

    /* compiled from: PG */
    public interface a {
        bbfb aW();
    }

    public InsertNewMessageAction(ffbr ffbrVar, ffbr ffbrVar2, dtuu dtuuVar, aolr aolrVar, cipm cipmVar, ffbr ffbrVar3, ffbr ffbrVar4, bagi bagiVar, ffbr ffbrVar5, ffbr ffbrVar6, augw augwVar, int i, engw engwVar, String str, String str2, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, boolean z, boolean z2, eooi eooiVar, DeviceData deviceData, boolean z3, ArrayList arrayList, boolean z4, fjay fjayVar) {
        super(eogt.INSERT_NEW_MESSAGE_ACTION);
        if (engwVar.isEmpty() && conversationIdType.b()) {
            csix.c("InsertNewMessageAction: Can't have empty messaging identities and empty conversation id");
        }
        if (TextUtils.isEmpty(str) && (arrayList == null || arrayList.isEmpty())) {
            csix.c("InsertNewMessageAction: Can't have empty message and no attachments");
        }
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = dtuuVar;
        this.e = aolrVar;
        this.l = cipmVar;
        this.f = ffbrVar3;
        this.h = ffbrVar4;
        this.g = bagiVar;
        this.i = ffbrVar5;
        this.j = ffbrVar6;
        this.k = augwVar;
        this.t.r("sub_id", i);
        final boolean a2 = ((astl) bagiVar.d.b()).a();
        if (a2) {
            this.t.u("messaging_identities", new ArrayList((Collection) Collection.EL.stream(engwVar).map(new Function() { // from class: bafx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return aolm.f((aoku) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(endq.a)));
        }
        h("recipients", (String) Collection.EL.stream(engwVar).map(new Function() { // from class: bafy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = InsertNewMessageAction.a;
                return emxe.b(((aoku) obj).p(a2));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: bafz
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
                entd entdVar = InsertNewMessageAction.a;
                return !((String) obj).isEmpty();
            }
        }).collect(Collectors.joining(",")));
        h("message_text", str);
        h("subject_text", str2);
        h("self_id", aquz.b(selfIdentityId));
        h("conversation_id", conversationIdType.a());
        this.t.p("require_mms", z);
        this.t.p("has_rbm_bot_recipient", z2);
        this.t.r("message_source", eooiVar.J);
        if (arrayList != null) {
            this.t.u("message_parts", arrayList);
        }
        this.t.t("secondary_device", deviceData);
        this.t.p("should_refresh_notification", z3);
        this.t.p("update_draft", false);
        this.t.s("sent_realtime", 0L);
        this.t.p("from_notification", z4);
        if (fjayVar != null) {
            this.t.q("trace_id", fjayVar.toByteArray());
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("InsertNewMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.InsertNewMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        elfl c;
        try {
            final bahp bahpVar = (bahp) this.i.b();
            MessageCoreData messageCoreData = (MessageCoreData) this.t.h("message");
            elfl e = elfo.e(messageCoreData);
            ConversationIdType b = bdgq.b(this.t.l("conversation_id"));
            final int b2 = this.t.b("sub_id", -1);
            final int b3 = this.t.b("locked_default_sms_sub_id", -1);
            final eooi b4 = eooi.b(this.t.a("message_source"));
            if (messageCoreData == null) {
                ekzz f = eleg.f("InsertNewMessageAction#createMessage");
                try {
                    String l = this.t.l("recipients");
                    String l2 = this.t.l("message_text");
                    String l3 = this.t.l("subject_text");
                    SelfIdentityId c2 = aqvf.c(this.t.l("self_id"));
                    boolean y = this.t.y("require_mms");
                    boolean y2 = this.t.y("has_rbm_bot_recipient");
                    ArrayList m = this.t.m("message_parts");
                    Byte[] bArr = null;
                    List asList = null;
                    if (this.t.A("trace_id") != null) {
                        final byte[] A = this.t.A("trace_id");
                        if (A != null) {
                            int length = A.length;
                            if (length == 0) {
                                bArr = fhpc.a;
                            } else {
                                bArr = new Byte[length];
                                Arrays.setAll(bArr, new IntFunction() { // from class: fhpb
                                    @Override // java.util.function.IntFunction
                                    public final Object apply(int i) {
                                        return Byte.valueOf(A[i]);
                                    }
                                });
                            }
                        }
                        asList = Arrays.asList(bArr);
                    }
                    c = axol.c(bahpVar.F, ffhe.a, ffsm.a, new bahn(bahpVar, b2, l, l2, l3, c2, b, y, y2, m, asList, this.t.m("messaging_identities"), null));
                    e = c.h(new emwl() { // from class: bagb
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            MessageCoreData messageCoreData2 = (MessageCoreData) obj;
                            entd entdVar = InsertNewMessageAction.a;
                            return messageCoreData2;
                        }
                    }, erpp.a);
                    f.b(e);
                    f.close();
                } finally {
                }
            }
            return e.i(new eroh() { // from class: bagc
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final MessageCoreData messageCoreData2 = (MessageCoreData) obj;
                    final int i = b2;
                    final int i2 = b3;
                    final eooi eooiVar = b4;
                    final InsertNewMessageAction insertNewMessageAction = InsertNewMessageAction.this;
                    final bahp bahpVar2 = bahpVar;
                    return (ListenableFuture) insertNewMessageAction.d.b(new emyl() { // from class: bagd
                        /* JADX WARN: Type inference failed for: r3v21, types: [baze, com.google.android.apps.messaging.shared.datamodel.action.common.Action] */
                        @Override // defpackage.emyl
                        public final Object get() {
                            String str;
                            String str2;
                            String str3;
                            String str4;
                            boolean z;
                            String str5;
                            bagd bagdVar;
                            String str6;
                            ekzz ekzzVar;
                            ekzz ekzzVar2;
                            final MessageCoreData messageCoreData3 = messageCoreData2;
                            if (messageCoreData3 == null) {
                                ((ensz) ((ensz) InsertNewMessageAction.a.j()).h("com/google/android/apps/messaging/shared/datamodel/action/InsertNewMessageAction", "runActionAsync", 430, "InsertNewMessageAction.java")).q("InsertNewMessageAction: Failed to create MessageData.");
                                return elfo.e(null);
                            }
                            final InsertNewMessageAction insertNewMessageAction2 = InsertNewMessageAction.this;
                            final bcyk a2 = ((azwh) insertNewMessageAction2.b.b()).a(messageCoreData3.z());
                            ekzz f2 = eleg.f("InsertNewMessageAction::getParticipantIdentities");
                            try {
                                emyl a3 = emys.a(new emyl() { // from class: bagg
                                    @Override // defpackage.emyl
                                    public final Object get() {
                                        final InsertNewMessageAction insertNewMessageAction3 = InsertNewMessageAction.this;
                                        MessageCoreData messageCoreData4 = messageCoreData3;
                                        bcyk bcykVar = a2;
                                        engw z2 = bcykVar != null ? ((bczy) insertNewMessageAction3.c.b()).z(messageCoreData4.ag().flatMap(new Function() { // from class: baga
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                return ((aoku) obj2).e();
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }), messageCoreData4.z(), bcykVar.L()) : ((bczy) insertNewMessageAction3.c.b()).y(messageCoreData4.ag().flatMap(new Function() { // from class: baga
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                return ((aoku) obj2).e();
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }), messageCoreData4.z());
                                        final boolean cw = messageCoreData4.cw();
                                        Stream map = Collection.EL.stream(z2).map(new Function() { // from class: bagf
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                InsertNewMessageAction insertNewMessageAction4 = InsertNewMessageAction.this;
                                                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj2;
                                                boolean z3 = cw;
                                                aolr aolrVar = insertNewMessageAction4.e;
                                                return z3 ? aolrVar.q(bindData) : aolrVar.t(bindData);
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        int i3 = engw.d;
                                        return (List) map.collect(endq.a);
                                    }
                                });
                                eooi eooiVar2 = eooiVar;
                                int i3 = i2;
                                f2.close();
                                boolean j = ((bahp) insertNewMessageAction2.i.b()).j(messageCoreData3);
                                String str7 = "archive";
                                if (a2 != null) {
                                    str = "has_rbm_bot_recipient";
                                    Integer a4 = ((bahp) insertNewMessageAction2.i.b()).a(a2, messageCoreData3, i, i3, eooiVar2 != null ? eooiVar2 : eooi.UNKNOWN_BUGLE_MESSAGE_SOURCE);
                                    if (a4 != null) {
                                        int intValue = a4.intValue();
                                        ekzz f3 = eleg.f("InsertNewMessageAction::canEarlySend");
                                        try {
                                            if (messageCoreData3.cX() && !messageCoreData3.db() && !messageCoreData3.cm() && messageCoreData3.U() == null && !insertNewMessageAction2.t.y(str) && ((azzz) insertNewMessageAction2.f.b()).c(messageCoreData3.z()) && ((clws) insertNewMessageAction2.h.b()).o(intValue)) {
                                                if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
                                                    List list = (List) a3.get();
                                                    if (list.size() <= 2) {
                                                        Iterator it = list.iterator();
                                                        while (it.hasNext()) {
                                                            if (((aoku) it.next()).A()) {
                                                            }
                                                        }
                                                    }
                                                }
                                                f3.close();
                                                int intValue2 = a4.intValue();
                                                if (a2.K()) {
                                                    if (messageCoreData3.cB()) {
                                                        str6 = "startEarlySend";
                                                    } else {
                                                        ensz enszVar = (ensz) InsertNewMessageAction.a.j();
                                                        enszVar.aa(ensy.MEDIUM);
                                                        str6 = "startEarlySend";
                                                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/action/InsertNewMessageAction", "startEarlySend", 561, "InsertNewMessageAction.java")).t("InsertNewMessageAction: encryption different between conversation and draft message; draftId = %s", messageCoreData3.aI());
                                                    }
                                                    messageCoreData3.by();
                                                    if (insertNewMessageAction2.k.a()) {
                                                        messageCoreData3.bu(cfmh.b);
                                                    }
                                                } else {
                                                    str6 = "startEarlySend";
                                                }
                                                ekzz f4 = eleg.f("InsertNewMessageAction::buildMessageIdentityProtos");
                                                try {
                                                    ArrayList arrayList = new ArrayList();
                                                    Iterator it2 = ((List) a3.get()).iterator();
                                                    while (it2.hasNext()) {
                                                        ekzzVar = f4;
                                                        try {
                                                            arrayList.add(aolm.f((aoku) it2.next()));
                                                            f4 = ekzzVar;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            Throwable th2 = th;
                                                            try {
                                                                ekzzVar.close();
                                                                throw th2;
                                                            } catch (Throwable th3) {
                                                                th2.addSuppressed(th3);
                                                                throw th2;
                                                            }
                                                        }
                                                    }
                                                    f4.close();
                                                    if (messageCoreData3.E().i()) {
                                                        messageCoreData3.ce(((awtm) insertNewMessageAction2.g.a.b()).a());
                                                    }
                                                    ekzz f5 = eleg.f("InsertNewMessageAction::createSendMessageAction");
                                                    try {
                                                        ekzz f6 = eleg.f("InsertNewMessageAction::createSendMessageAction::create");
                                                        ekzzVar2 = f5;
                                                        try {
                                                            try {
                                                                ?? a5 = ((bbge) insertNewMessageAction2.j.b()).a();
                                                                f6.close();
                                                                a5.t.p("is_early_send", true);
                                                                a5.t.s("rcs_session_id", a2.e());
                                                                a5.t.t("message", messageCoreData3);
                                                                a5.t.r("sub_id", intValue2);
                                                                a5.t.u("remote_messaging_identities", arrayList);
                                                                a5.t.p("is_rbm_conversation", insertNewMessageAction2.t.y(str));
                                                                a5.t.p("is_rcs_group", a2.X());
                                                                a5.t.t("secondary_device", insertNewMessageAction2.t.h("secondary_device"));
                                                                a5.t.t("message_usage_stats_data", insertNewMessageAction2.t.h("message_usage_stats_data"));
                                                                a5.t.r("message_source", insertNewMessageAction2.t.a("message_source"));
                                                                a5.t.s("sent_realtime", insertNewMessageAction2.t.d("sent_realtime"));
                                                                a5.t.r("locked_default_sms_sub_id", i3);
                                                                a5.t.p("update_draft", insertNewMessageAction2.t.y("update_draft"));
                                                                a5.t.v("archive", insertNewMessageAction2.t.l("archive"));
                                                                a5.t.p("should_refresh_notification", insertNewMessageAction2.t.y("should_refresh_notification"));
                                                                a5.t.p("from_notification", insertNewMessageAction2.t.y("from_notification"));
                                                                a5.t.p("ui_has_been_notified", j);
                                                                ekzzVar2.close();
                                                                f3 = eleg.f("InsertNewMessageAction::startSendMessageActionForEarlySend");
                                                                try {
                                                                    ((ensz) ((ensz) InsertNewMessageAction.a.h()).h("com/google/android/apps/messaging/shared/datamodel/action/InsertNewMessageAction", str6, 602, "InsertNewMessageAction.java")).q("InsertNewMessageAction: Starting early send");
                                                                    a5.k();
                                                                    f3.close();
                                                                    return elfo.e(null);
                                                                } finally {
                                                                }
                                                            } finally {
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            Throwable th5 = th;
                                                            try {
                                                                ekzzVar2.close();
                                                                throw th5;
                                                            } catch (Throwable th6) {
                                                                th5.addSuppressed(th6);
                                                                throw th5;
                                                            }
                                                        }
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        ekzzVar2 = f5;
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    ekzzVar = f4;
                                                }
                                            }
                                            f3.close();
                                            bagdVar = this;
                                            str3 = "sent_realtime";
                                            str4 = "update_draft";
                                            z = j;
                                            str5 = "should_refresh_notification";
                                            str7 = "archive";
                                            str2 = "from_notification";
                                            bahp bahpVar3 = bahpVar2;
                                            DeviceData deviceData = (DeviceData) insertNewMessageAction2.t.h("secondary_device");
                                            MessageUsageStatisticsData messageUsageStatisticsData = (MessageUsageStatisticsData) insertNewMessageAction2.t.h("message_usage_stats_data");
                                            bbcg bbcgVar = insertNewMessageAction2.t;
                                            bbcg bbcgVar2 = insertNewMessageAction2.t;
                                            long d = bbcgVar.d(str3);
                                            int b5 = bbcgVar.b("sub_id", -1);
                                            boolean z2 = bbcgVar2.z(str4, true);
                                            bbcg bbcgVar3 = insertNewMessageAction2.t;
                                            bbcg bbcgVar4 = insertNewMessageAction2.t;
                                            bahpVar3.d(new bagm(insertNewMessageAction2, messageCoreData3, deviceData, messageUsageStatisticsData, eooiVar2, d, b5, i3, z2, bbcgVar3.l(str7), bbcgVar3.z(str5, false), bbcgVar4.y(str2), bbcgVar4.y(str), false, z, null));
                                            return elfo.e(null);
                                        } finally {
                                        }
                                    } else {
                                        str3 = "sent_realtime";
                                        str4 = "update_draft";
                                        z = j;
                                        str5 = "should_refresh_notification";
                                        str7 = "archive";
                                        str2 = "from_notification";
                                    }
                                } else {
                                    str = "has_rbm_bot_recipient";
                                    str2 = "from_notification";
                                    str3 = "sent_realtime";
                                    str4 = "update_draft";
                                    z = j;
                                    str5 = "should_refresh_notification";
                                }
                                bagdVar = this;
                                bahp bahpVar32 = bahpVar2;
                                DeviceData deviceData2 = (DeviceData) insertNewMessageAction2.t.h("secondary_device");
                                MessageUsageStatisticsData messageUsageStatisticsData2 = (MessageUsageStatisticsData) insertNewMessageAction2.t.h("message_usage_stats_data");
                                bbcg bbcgVar5 = insertNewMessageAction2.t;
                                bbcg bbcgVar22 = insertNewMessageAction2.t;
                                long d2 = bbcgVar5.d(str3);
                                int b52 = bbcgVar5.b("sub_id", -1);
                                boolean z22 = bbcgVar22.z(str4, true);
                                bbcg bbcgVar32 = insertNewMessageAction2.t;
                                bbcg bbcgVar42 = insertNewMessageAction2.t;
                                bahpVar32.d(new bagm(insertNewMessageAction2, messageCoreData3, deviceData2, messageUsageStatisticsData2, eooiVar2, d2, b52, i3, z22, bbcgVar32.l(str7), bbcgVar32.z(str5, false), bbcgVar42.y(str2), bbcgVar42.y(str), false, z, null));
                                return elfo.e(null);
                            } finally {
                                try {
                                    f2.close();
                                    throw th;
                                } catch (Throwable th9) {
                                    th.addSuppressed(th9);
                                }
                            }
                        }
                    });
                }
            }, this.g.c).f(RuntimeException.class, new eroh() { // from class: bage
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    RuntimeException runtimeException = (RuntimeException) obj;
                    InsertNewMessageAction.this.g(runtimeException);
                    throw runtimeException;
                }
            }, this.g.b);
        } catch (RuntimeException e2) {
            g(e2);
            throw e2;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fV() {
        return false;
    }

    public final void g(Exception exc) {
        if (this.t.y("from_notification")) {
            this.l.g(equw.MESSAGE_TYPE_UNKNOWN, 5, cipm.c(exc), Optional.of(true));
        }
    }

    protected final void h(String str, String str2) {
        if (str2 != null) {
            this.t.v(str, str2);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public InsertNewMessageAction(ffbr ffbrVar, ffbr ffbrVar2, dtuu dtuuVar, aolr aolrVar, cipm cipmVar, ffbr ffbrVar3, ffbr ffbrVar4, bagi bagiVar, ffbr ffbrVar5, ffbr ffbrVar6, augw augwVar, Parcel parcel) {
        super(parcel, eogt.INSERT_NEW_MESSAGE_ACTION);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = dtuuVar;
        this.e = aolrVar;
        this.l = cipmVar;
        this.f = ffbrVar3;
        this.h = ffbrVar4;
        this.g = bagiVar;
        this.i = ffbrVar5;
        this.j = ffbrVar6;
        this.k = augwVar;
    }

    public InsertNewMessageAction(ffbr ffbrVar, ffbr ffbrVar2, dtuu dtuuVar, aolr aolrVar, cipm cipmVar, ffbr ffbrVar3, ffbr ffbrVar4, bagi bagiVar, ffbr ffbrVar5, ffbr ffbrVar6, augw augwVar, MessageCoreData messageCoreData, boolean z, eooi eooiVar, byyt byytVar, int i, Optional optional, long j, boolean z2) {
        super(eogt.INSERT_NEW_MESSAGE_ACTION);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = dtuuVar;
        this.e = aolrVar;
        this.l = cipmVar;
        this.f = ffbrVar3;
        this.h = ffbrVar4;
        this.g = bagiVar;
        this.i = ffbrVar5;
        this.j = ffbrVar6;
        this.k = augwVar;
        this.t.t("message", messageCoreData);
        this.t.p("update_draft", z);
        if (eooiVar != null) {
            this.t.r("message_source", eooiVar.J);
        }
        if (byytVar != null) {
            this.t.v("archive", byytVar.name());
        }
        this.t.r("sub_id", i);
        if (optional.isPresent()) {
            this.t.r("locked_default_sms_sub_id", ((Integer) optional.get()).intValue());
        }
        this.t.s("sent_realtime", j);
        if (messageCoreData.y() != null) {
            this.t.t("message_usage_stats_data", messageCoreData.y());
        }
        this.t.p("from_notification", false);
        this.t.p("should_refresh_notification", z2);
    }
}
