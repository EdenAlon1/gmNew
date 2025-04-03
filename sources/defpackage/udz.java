package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.photos.client.MediaUploadStates;
import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udz {
    public static final entd a = entd.c("BugleDatabase");
    public static final ensn b = new ensn("conversation_id", String.class, false, false);
    public static final ensn c = new ensn("conversation_self_id", String.class, false, false);
    public final ffbr d;
    public final byzp e;
    public final errl f;
    public final errl g;
    public final ejvp h;
    public final cbgf i;
    public final ffbr j;
    public final ffbr k;
    public final adgn l;
    public final Optional m;
    public final ucq n;
    public final ConversationIdType o;
    public final AtomicReference p = new AtomicReference(ueb.a);
    public final AtomicReference q = new AtomicReference();
    private final ejvb r;
    private final String s;

    public udz(ffbr ffbrVar, byzp byzpVar, errl errlVar, errl errlVar2, ejvp ejvpVar, cbgf cbgfVar, ejvb ejvbVar, ffbr ffbrVar2, ffbr ffbrVar3, adgn adgnVar, Optional optional, ucq ucqVar, ConversationIdType conversationIdType) {
        this.d = ffbrVar;
        this.e = byzpVar;
        this.f = errlVar;
        this.g = errlVar2;
        this.h = ejvpVar;
        this.i = cbgfVar;
        this.r = ejvbVar;
        this.j = ffbrVar2;
        this.k = ffbrVar3;
        this.l = adgnVar;
        this.m = optional;
        this.n = ucqVar;
        this.o = conversationIdType;
        this.s = "draft_data_service".concat(conversationIdType.toString());
    }

    public final ejuh a(final eisx eisxVar) {
        return new ejuy(this.r, new eros() { // from class: udp
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                final elfl i;
                final eisx eisxVar2;
                ekzz f = eleg.f("DraftDataService#getDraftData");
                final udz udzVar = udz.this;
                try {
                    final MessageCoreData messageCoreData = (MessageCoreData) udzVar.q.getAndSet(null);
                    final ueb uebVar = (ueb) udzVar.p.getAndSet(ueb.a);
                    final elfl g = elfo.g(new Callable() { // from class: udg
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r3v4, types: [ucr] */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            String[] strArr;
                            Object apply;
                            ekzz f2 = eleg.f("DraftDataService#queryDraft");
                            udz udzVar2 = udz.this;
                            final ConversationIdType conversationIdType = udzVar2.o;
                            try {
                                ucq ucqVar = udzVar2.n;
                                String[] strArr2 = bjvk.a;
                                Integer b2 = bjvk.b();
                                if (b2.intValue() == Integer.MAX_VALUE) {
                                    strArr = bjvk.a;
                                } else {
                                    int i2 = engw.d;
                                    engr engrVar = new engr();
                                    engrVar.h("messages._id");
                                    engrVar.h("messages.conversation_id");
                                    engrVar.h("messages.sender_id");
                                    if (b2.intValue() >= 54040) {
                                        engrVar.h("messages.sender_send_destination");
                                    }
                                    if (b2.intValue() >= 59340) {
                                        engrVar.h("messages.msisdn_receiving_rcs_message");
                                    }
                                    if (b2.intValue() >= 54040) {
                                        engrVar.h("messages.receiving_network_country");
                                    }
                                    engrVar.h("messages.sent_timestamp");
                                    if (b2.intValue() >= 17030) {
                                        engrVar.h("messages.queue_insert_timestamp");
                                    }
                                    engrVar.h("messages.received_timestamp");
                                    engrVar.h("messages.message_protocol");
                                    engrVar.h("messages.message_status");
                                    if (b2.intValue() >= 13020) {
                                        engrVar.h("messages.message_report_status");
                                    }
                                    engrVar.h("messages.seen");
                                    engrVar.h("messages.read");
                                    engrVar.h("messages.sms_message_uri");
                                    engrVar.h("messages.sms_priority");
                                    engrVar.h("messages.sms_message_size");
                                    engrVar.h("messages.mms_subject");
                                    engrVar.h("messages.mms_transaction_id");
                                    engrVar.h("messages.mms_content_location");
                                    engrVar.h("messages.mms_expiry");
                                    if (b2.intValue() >= 59890) {
                                        engrVar.h("messages.rcs_expiry");
                                    }
                                    if (b2.intValue() >= 9030) {
                                        engrVar.h("messages.mms_retrieve_text");
                                    }
                                    engrVar.h("messages.raw_status");
                                    engrVar.h("messages.self_id");
                                    if (b2.intValue() >= 60160) {
                                        engrVar.h("messages.my_identity_foreign_key");
                                    }
                                    engrVar.h("messages.retry_start_timestamp");
                                    if (b2.intValue() >= 8500) {
                                        engrVar.h("messages.cloud_sync_id");
                                    }
                                    if (b2.intValue() >= 41040) {
                                        engrVar.h("messages.rcs_message_id_with_text_type");
                                    }
                                    if (b2.intValue() >= 29060) {
                                        engrVar.h("messages.etouffee_status");
                                    }
                                    if (b2.intValue() >= 29090) {
                                        engrVar.h("messages.verification_status");
                                    }
                                    if (b2.intValue() >= 39000) {
                                        engrVar.h("messages.rcs_ui_status");
                                    }
                                    if (b2.intValue() >= 30010) {
                                        engrVar.h("messages.is_hidden");
                                    }
                                    if (b2.intValue() >= 10002) {
                                        engrVar.h("messages.rcs_remote_instance");
                                    }
                                    if (b2.intValue() >= 10004) {
                                        engrVar.h("messages.rcs_file_transfer_session_id");
                                    }
                                    if (b2.intValue() >= 9000) {
                                        engrVar.h("messages.sms_error_code");
                                    }
                                    if (b2.intValue() >= 9000) {
                                        engrVar.h("messages.sms_error_desc_map_name");
                                    }
                                    if (b2.intValue() >= 9010) {
                                        engrVar.h("messages.correlation_id");
                                    }
                                    if (b2.intValue() >= 31010) {
                                        engrVar.h("messages.cms_id");
                                    }
                                    if (b2.intValue() >= 37040) {
                                        engrVar.h("messages.cms_last_mod_seq");
                                    }
                                    if (b2.intValue() >= 19020) {
                                        engrVar.h("messages.web_id");
                                    }
                                    if (b2.intValue() >= 29100) {
                                        engrVar.h("messages.usage_stats_logging_id");
                                    }
                                    if (b2.intValue() >= 35030) {
                                        engrVar.h("messages.send_counter");
                                    }
                                    if (b2.intValue() >= 35030) {
                                        engrVar.h("messages.original_rcs_message_id");
                                    }
                                    if (b2.intValue() >= 37020) {
                                        engrVar.h("messages.custom_delivery_receipt_mime_type");
                                    }
                                    if (b2.intValue() >= 37020) {
                                        engrVar.h("messages.custom_delivery_receipt_content");
                                    }
                                    if (b2.intValue() >= 37030) {
                                        engrVar.h("messages.report_attempt_acounter");
                                    }
                                    if (b2.intValue() >= 45020) {
                                        engrVar.h("messages.custom_headers");
                                    }
                                    if (b2.intValue() >= 46010) {
                                        engrVar.h("messages.cms_correlation_id");
                                    }
                                    if (b2.intValue() >= 48030) {
                                        engrVar.h("messages.group_private_participant");
                                    }
                                    if (b2.intValue() >= 48030) {
                                        engrVar.h("messages.original_message_id");
                                    }
                                    if (b2.intValue() >= 49060) {
                                        engrVar.h("messages.awaiting_reverse_sync");
                                    }
                                    if (b2.intValue() >= 49060) {
                                        engrVar.h("messages.old_sms_message_uri");
                                    }
                                    if (b2.intValue() >= 56000) {
                                        engrVar.h("messages.draft_id");
                                    }
                                    if (b2.intValue() >= 58040) {
                                        engrVar.h("messages.result_code");
                                    }
                                    if (b2.intValue() >= 58210) {
                                        engrVar.h("messages.cms_life_cycle");
                                    }
                                    if (b2.intValue() >= 60750) {
                                        engrVar.h("messages.mute_priority");
                                    }
                                    if (b2.intValue() >= 58710) {
                                        engrVar.h("messages.fallback_reason");
                                    }
                                    if (b2.intValue() >= 58230) {
                                        engrVar.h("messages.auto_retry_counter");
                                    }
                                    if (b2.intValue() >= 58280) {
                                        engrVar.h("messages.can_revoke_before_delivered_with_rcs");
                                    }
                                    if (b2.intValue() >= 58680) {
                                        engrVar.h("messages.trace_id");
                                    }
                                    if (b2.intValue() >= 58720) {
                                        engrVar.h("messages.outgoing_delivery_report_status");
                                    }
                                    if (b2.intValue() >= 58720) {
                                        engrVar.h("messages.outgoing_read_report_status");
                                    }
                                    if (b2.intValue() >= 59310) {
                                        engrVar.h("messages.xms_transport");
                                    }
                                    if (b2.intValue() >= 59430) {
                                        engrVar.h("messages.message_original_protocol");
                                    }
                                    if (b2.intValue() >= 59490) {
                                        engrVar.h("messages.satellite_datagram_id");
                                    }
                                    if (b2.intValue() >= 60190) {
                                        engrVar.h("messages.encryption_protocol");
                                    }
                                    if (b2.intValue() >= 60370) {
                                        engrVar.h("messages.message_persistence_id");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view.message_id_message_replies");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view._id_messages");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view.received_timestamp_messages");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view._id_participants");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view.sub_id_participants");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view.normalized_destination_participants");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view.display_destination_participants");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view.full_name_participants");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view.first_name_participants");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view._id_parts");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view.text_parts");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view.uri_parts");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view.content_type_parts");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view.file_name_parts");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view.duration_parts");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view.trigger_url_link_preview");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view.expiration_time_millis_link_preview");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view.link_title_link_preview");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view.link_image_url_link_preview");
                                    }
                                    if (b2.intValue() >= 0) {
                                        engrVar.h("message_replies_view.link_preview_failed_link_preview");
                                    }
                                    strArr = (String[]) engrVar.g().toArray(new String[0]);
                                }
                                bjvh bjvhVar = new bjvh(strArr);
                                bjvhVar.z("queryDraftForConversation1");
                                apply = new Function() { // from class: ucp
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bjvj bjvjVar = (bjvj) obj;
                                        bjvjVar.aq(new dtrt("messages.conversation_id", 1, Long.valueOf(bdgq.a(ConversationIdType.this))));
                                        return bjvjVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }.apply(new bjvj());
                                bjvhVar.k(new bjvi((bjvj) apply));
                                if (ucqVar.a.contains(bpzk.a)) {
                                    bjvhVar.o("REPLIES_VIEW_JOIN", bjvl.a);
                                } else {
                                    bjvhVar.o("REPLIES_VIEW_JOIN", "0");
                                    bjvhVar.r();
                                }
                                bjoa bjoaVar = (bjoa) ((bjvf) bjvhVar.b().o()).cS();
                                if (bjoaVar != null) {
                                    bmwr bmwrVar = bjoaVar.a;
                                    if (true == bmwrVar.f().c()) {
                                        bmwrVar = null;
                                    }
                                    r2 = bmwrVar != null ? ajqu.a(bmwrVar) : null;
                                    MessagesTable.BindData bindData = bjoaVar.b;
                                    bindData.getClass();
                                    r2 = new ucr(bindData, r2);
                                }
                                f2.close();
                                return Optional.ofNullable(r2);
                            } catch (Throwable th) {
                                try {
                                    f2.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }, udzVar.g);
                    final elfl g2 = elfo.g(new Callable() { // from class: udh
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            udz udzVar2 = udz.this;
                            return ((bdeo) udzVar2.d.b()).a(udzVar2.o);
                        }
                    }, udzVar.g);
                    final elfl b2 = elfo.m(g, g2).b(new erog() { // from class: udi
                        @Override // defpackage.erog
                        public final ListenableFuture a() {
                            elfl h;
                            final Optional optional = (Optional) erqt.q(g);
                            final bcyk bcykVar = (bcyk) erqt.q(g2);
                            ekzz f2 = eleg.f("DraftDataService#combineWithIncomingDraft");
                            final MessageCoreData messageCoreData2 = messageCoreData;
                            final ueb uebVar2 = uebVar;
                            final udz udzVar2 = udz.this;
                            try {
                                if (bcykVar == null) {
                                    h = elfo.e(new ucw(Optional.empty(), 1));
                                } else {
                                    h = elfo.g(new Callable() { // from class: udx
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            MessageCoreData messageCoreData3;
                                            udz udzVar3 = udz.this;
                                            Optional optional2 = optional;
                                            bcyk bcykVar2 = bcykVar;
                                            ekzz f3 = eleg.f("DraftDataService#processMessageData");
                                            try {
                                                if (optional2.isPresent()) {
                                                    messageCoreData3 = udzVar3.e.a();
                                                    MessagesTable.BindData bindData = ((ucr) optional2.get()).a;
                                                    SelfIdentityId f4 = bcykVar2.f();
                                                    ((MessageData) messageCoreData3).aM(bindData);
                                                    ((MessageData) messageCoreData3).j.ae(((SelfIdentityIdImpl) f4).a);
                                                    MessageIdType messageIdType = ((ucr) optional2.get()).c;
                                                    if (!messageIdType.c()) {
                                                        ((MessageData) messageCoreData3).m = cnmc.a(messageIdType);
                                                    }
                                                    ((bdpt) udzVar3.j.b()).c(messageCoreData3, true);
                                                    for (MessagePartCoreData messagePartCoreData : ((MessageData) messageCoreData3).i) {
                                                        messagePartCoreData.af();
                                                        messagePartCoreData.aQ(bdhb.a);
                                                    }
                                                    messageCoreData3.aR();
                                                } else {
                                                    messageCoreData3 = null;
                                                }
                                                f3.close();
                                                return messageCoreData3;
                                            } catch (Throwable th) {
                                                try {
                                                    f3.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                                throw th;
                                            }
                                        }
                                    }, udzVar2.g).h(new emwl() { // from class: udb
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj) {
                                            ucw ucwVar;
                                            MessageCoreData messageCoreData3 = (MessageCoreData) obj;
                                            SelfIdentityId f3 = bcykVar.f();
                                            MessageCoreData messageCoreData4 = messageCoreData2;
                                            udz udzVar3 = udz.this;
                                            ConversationIdType conversationIdType = udzVar3.o;
                                            ekzz f4 = eleg.f("DraftDataService#combineDrafts");
                                            try {
                                                if (messageCoreData3 == null && messageCoreData4 == null) {
                                                    ensk n = udz.a.n();
                                                    n.Y(udz.b, conversationIdType.toString());
                                                    n.Y(udz.c, ((SelfIdentityIdImpl) f3).a);
                                                    ((ensz) n.h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "combineDrafts", 652, "DraftDataService.java")).q("empty draft.");
                                                    ucwVar = new ucw(Optional.empty(), 1);
                                                } else if (messageCoreData4 == null) {
                                                    messageCoreData3.getClass();
                                                    ensk n2 = udz.a.n();
                                                    n2.Y(udz.b, conversationIdType.toString());
                                                    n2.Y(udz.c, ((SelfIdentityIdImpl) f3).a);
                                                    ((ensz) n2.h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "combineDrafts", 661, "DraftDataService.java")).q("read existing draft.");
                                                    ucwVar = new ucw(Optional.of(messageCoreData3), 3);
                                                } else {
                                                    ueb uebVar3 = uebVar2;
                                                    if (messageCoreData3 == null || !uebVar3.equals(ueb.c)) {
                                                        if (uebVar3.equals(ueb.b) && messageCoreData3 != null) {
                                                            String ar = messageCoreData3.ar();
                                                            String ar2 = messageCoreData4.ar();
                                                            if ((TextUtils.isEmpty(ar) || TextUtils.isEmpty(ar2)) && messageCoreData3.U() == null) {
                                                                ensk n3 = udz.a.n();
                                                                n3.Y(udz.b, conversationIdType.toString());
                                                                n3.Y(udz.c, ((SelfIdentityIdImpl) f3).a);
                                                                ((ensz) n3.h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "combineDrafts", 697, "DraftDataService.java")).q("combining existing and incoming drafts.");
                                                                Iterator it = messageCoreData4.ab().iterator();
                                                                while (it.hasNext()) {
                                                                    messageCoreData3.aL((MessagePartCoreData) it.next());
                                                                }
                                                                ucwVar = new ucw(Optional.of(messageCoreData3), 4);
                                                            }
                                                        }
                                                        ensk n4 = udz.a.n();
                                                        n4.Y(udz.b, conversationIdType.toString());
                                                        n4.Y(udz.c, ((SelfIdentityIdImpl) f3).a);
                                                        ((ensz) n4.h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "combineDrafts", 682, "DraftDataService.java")).q("created new draft from incoming draft.");
                                                        ucwVar = new ucw(Optional.of(udzVar3.e.f(conversationIdType, f3, messageCoreData4)), 2);
                                                    } else {
                                                        ensk n5 = udz.a.n();
                                                        n5.Y(udz.b, conversationIdType.toString());
                                                        n5.Y(udz.c, ((SelfIdentityIdImpl) f3).a);
                                                        ((ensz) n5.h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "combineDrafts", 670, "DraftDataService.java")).q("combined non text parts from existing draft with incoming draft.");
                                                        messageCoreData4.bO(messageCoreData3.U());
                                                        for (MessagePartCoreData messagePartCoreData : messageCoreData3.ab()) {
                                                            if (!messagePartCoreData.aX()) {
                                                                messageCoreData4.aL(messagePartCoreData);
                                                            }
                                                        }
                                                        ucwVar = new ucw(Optional.of(messageCoreData4), 4);
                                                    }
                                                }
                                                f4.close();
                                                return ucwVar;
                                            } catch (Throwable th) {
                                                try {
                                                    f4.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                                throw th;
                                            }
                                        }
                                    }, udzVar2.f);
                                    f2.b(h);
                                }
                                f2.close();
                                return h;
                            } catch (Throwable th) {
                                try {
                                    f2.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }, udzVar.f);
                    if (((Boolean) cjja.a.e()).booleanValue() && (eisxVar2 = eisxVar) != null) {
                        b2 = b2.i(new eroh() { // from class: udj
                            /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.lang.Object] */
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                elfl e;
                                elfl h;
                                final udy udyVar = (udy) obj;
                                ekzz f2 = eleg.f("DraftDataService#populateGooglePhotosUploadStateIntoParts");
                                eisx eisxVar3 = eisxVar2;
                                try {
                                    if (udyVar.a().isEmpty()) {
                                        h = elfo.e(udyVar);
                                    } else {
                                        final List aH = udyVar.a().get().aH();
                                        boolean isEmpty = aH.isEmpty();
                                        udz udzVar2 = udz.this;
                                        if (!isEmpty && !udzVar2.l.a().isEmpty()) {
                                            Stream map = Collection.EL.stream(aH).map(new Function() { // from class: udc
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo448andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj2) {
                                                    entd entdVar = udz.a;
                                                    Uri t = ((MessagePartCoreData) obj2).t();
                                                    t.getClass();
                                                    return t.toString();
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            });
                                            int i2 = engw.d;
                                            e = ((cjhi) udzVar2.l.a().get()).a(eisxVar3, (engw) map.collect(endq.a)).h(new emwl() { // from class: udd
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj2) {
                                                    final MediaUploadStates mediaUploadStates = (MediaUploadStates) obj2;
                                                    entd entdVar = udz.a;
                                                    Iterable$EL.forEach(aH, new Consumer() { // from class: udu
                                                        @Override // java.util.function.Consumer
                                                        /* renamed from: accept */
                                                        public final void o(Object obj3) {
                                                            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj3;
                                                            entd entdVar2 = udz.a;
                                                            Uri t = messagePartCoreData.t();
                                                            t.getClass();
                                                            String uri = t.toString();
                                                            MediaUploadStates mediaUploadStates2 = MediaUploadStates.this;
                                                            if (mediaUploadStates2.a.containsKey(uri)) {
                                                                messagePartCoreData.aC((drso) mediaUploadStates2.a.get(uri));
                                                            }
                                                        }

                                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                            return Consumer$CC.$default$andThen(this, consumer);
                                                        }
                                                    });
                                                    return null;
                                                }
                                            }, udzVar2.f);
                                            h = e.h(new emwl() { // from class: ude
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj2) {
                                                    entd entdVar = udz.a;
                                                    return udy.this;
                                                }
                                            }, udzVar2.f);
                                            f2.b(h);
                                        }
                                        e = elfo.e(null);
                                        h = e.h(new emwl() { // from class: ude
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj2) {
                                                entd entdVar = udz.a;
                                                return udy.this;
                                            }
                                        }, udzVar2.f);
                                        f2.b(h);
                                    }
                                    f2.close();
                                    return h;
                                } catch (Throwable th) {
                                    try {
                                        f2.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        }, udzVar.f);
                    }
                    if (messageCoreData != null && !uebVar.equals(ueb.c)) {
                        ((ensz) udz.a.n().h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "getDraftData", 252, "DraftDataService.java")).q("Skipping extractRepliedToData because incomingDraft is present");
                        i = elfo.e(Optional.empty());
                        elfl a2 = elfo.m(b2, g2, i).a(new Callable() { // from class: udm
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                entd entdVar = udz.a;
                                final udy udyVar = (udy) erqt.q(elfl.this);
                                final bcyk bcykVar = (bcyk) erqt.q(g2);
                                final Optional optional = (Optional) erqt.q(i);
                                ekzz f2 = eleg.f("DraftDataService#buildDraftData");
                                final ueb uebVar2 = uebVar;
                                try {
                                    Optional empty = bcykVar == null ? Optional.empty() : udyVar.a().map(new Function() { // from class: udf
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            bcyk bcykVar2;
                                            int i2;
                                            final MessageCoreData messageCoreData2 = (MessageCoreData) obj;
                                            entd entdVar2 = udz.a;
                                            final ucu ucuVar = new ucu();
                                            if (messageCoreData2 == null) {
                                                throw new NullPointerException("Null message");
                                            }
                                            final ueb uebVar3 = uebVar2;
                                            Optional optional2 = optional;
                                            udy udyVar2 = udyVar;
                                            bcyk bcykVar3 = bcyk.this;
                                            ucuVar.a = messageCoreData2;
                                            ucuVar.b = bcykVar3;
                                            ucuVar.d = udyVar2.b();
                                            optional2.ifPresentOrElse(new Consumer() { // from class: udr
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void o(Object obj2) {
                                                    RepliedToDataAdapter repliedToDataAdapter = (RepliedToDataAdapter) obj2;
                                                    entd entdVar3 = udz.a;
                                                    boolean equals = ueb.this.equals(ueb.c);
                                                    ucx ucxVar = ucuVar;
                                                    MessageCoreData messageCoreData3 = messageCoreData2;
                                                    if (equals) {
                                                        ((ensz) udz.a.n().h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "setRepliedToDataWithPreconditions", 325, "DraftDataService.java")).q("Setting RepliedToDataAdapter for combined draft with overwritten text");
                                                        messageCoreData3.bO(cnmc.a(repliedToDataAdapter.b));
                                                        ((ucu) ucxVar).c = repliedToDataAdapter;
                                                        return;
                                                    }
                                                    cnmd U = messageCoreData3.U();
                                                    if (U == null) {
                                                        ((ensz) ((ensz) udz.a.j()).h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "setRepliedToDataWithPreconditions", 335, "DraftDataService.java")).q("Combined draft is not a reply but RepliedToDataAdapter was extracted");
                                                        return;
                                                    }
                                                    ((ensz) udz.a.n().h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "setRepliedToDataWithPreconditions", 339, "DraftDataService.java")).q("Setting RepliedToDataAdapter for combined draft");
                                                    emxf.m(repliedToDataAdapter.b.equals(U.b), "Extracted RepliedToDataAdapter has different message ID than the replied-to message ID of combined draft");
                                                    ((ucu) ucxVar).c = repliedToDataAdapter;
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            }, new Runnable() { // from class: uds
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    entd entdVar3 = udz.a;
                                                    if (MessageCoreData.this.U() != null) {
                                                        ((ensz) ((ensz) udz.a.j()).h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "setRepliedToDataWithPreconditions", 351, "DraftDataService.java")).q("Combined draft has ReplyMessageDataWrapper but no RepliedToDataAdapter was extracted");
                                                    }
                                                }
                                            });
                                            MessageCoreData messageCoreData3 = ucuVar.a;
                                            if (messageCoreData3 != null && (bcykVar2 = ucuVar.b) != null && (i2 = ucuVar.d) != 0) {
                                                return new ucv(messageCoreData3, bcykVar2, i2, ucuVar.c);
                                            }
                                            StringBuilder sb = new StringBuilder();
                                            if (ucuVar.a == null) {
                                                sb.append(" message");
                                            }
                                            if (ucuVar.b == null) {
                                                sb.append(" conversation");
                                            }
                                            if (ucuVar.d == 0) {
                                                sb.append(" source");
                                            }
                                            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    f2.close();
                                    return empty;
                                } catch (Throwable th) {
                                    try {
                                        f2.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        }, udzVar.f);
                        f.b(a2);
                        f.close();
                        return new erph(a2);
                    }
                    i = g.i(new eroh() { // from class: udk
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            Optional optional = (Optional) obj;
                            ekzz f2 = eleg.f("DraftDataService#extractRepliedToData");
                            final udz udzVar2 = udz.this;
                            final MessageCoreData messageCoreData2 = messageCoreData;
                            try {
                                ((ensz) udz.a.n().h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "extractRepliedToData", 376, "DraftDataService.java")).q("Executing extractRepliedToData");
                                elfl i2 = ((elfl) optional.map(new Function() { // from class: udl
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        final ucr ucrVar = (ucr) obj2;
                                        Function function = new Function() { // from class: udw
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function2) {
                                                return Function$CC.$default$andThen(this, function2);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                ajss ajssVar = (ajss) obj3;
                                                entd entdVar = udz.a;
                                                ajqt ajqtVar = ucr.this.b;
                                                if (ajqtVar == null) {
                                                    return null;
                                                }
                                                return ajssVar.b(ajqtVar);
                                            }

                                            public final /* synthetic */ Function compose(Function function2) {
                                                return Function$CC.$default$compose(this, function2);
                                            }
                                        };
                                        udz udzVar3 = udz.this;
                                        return udzVar3.b(udzVar3.m.map(function));
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).orElse(elfo.e(Optional.empty()))).i(new eroh() { // from class: udq
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        Optional empty;
                                        Optional optional2 = (Optional) obj2;
                                        if (optional2.isPresent()) {
                                            return elfo.e(optional2);
                                        }
                                        MessageCoreData messageCoreData3 = messageCoreData2;
                                        udz udzVar3 = udz.this;
                                        if (messageCoreData3 == null) {
                                            empty = Optional.empty();
                                        } else {
                                            final cnmd U = messageCoreData3.U();
                                            empty = U == null ? Optional.empty() : udzVar3.m.map(new Function() { // from class: udv
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo448andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj3) {
                                                    entd entdVar = udz.a;
                                                    return ((ajss) obj3).c(cnmd.this.b);
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            });
                                        }
                                        return udzVar3.b(empty);
                                    }
                                }, udzVar2.f);
                                f2.b(i2);
                                f2.close();
                                return i2;
                            } catch (Throwable th) {
                                try {
                                    f2.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }, udzVar.f);
                    elfl a22 = elfo.m(b2, g2, i).a(new Callable() { // from class: udm
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            entd entdVar = udz.a;
                            final udy udyVar = (udy) erqt.q(elfl.this);
                            final bcyk bcykVar = (bcyk) erqt.q(g2);
                            final Optional optional = (Optional) erqt.q(i);
                            ekzz f2 = eleg.f("DraftDataService#buildDraftData");
                            final ueb uebVar2 = uebVar;
                            try {
                                Optional empty = bcykVar == null ? Optional.empty() : udyVar.a().map(new Function() { // from class: udf
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bcyk bcykVar2;
                                        int i2;
                                        final MessageCoreData messageCoreData2 = (MessageCoreData) obj;
                                        entd entdVar2 = udz.a;
                                        final ucx ucuVar = new ucu();
                                        if (messageCoreData2 == null) {
                                            throw new NullPointerException("Null message");
                                        }
                                        final ueb uebVar3 = uebVar2;
                                        Optional optional2 = optional;
                                        udy udyVar2 = udyVar;
                                        bcyk bcykVar3 = bcyk.this;
                                        ucuVar.a = messageCoreData2;
                                        ucuVar.b = bcykVar3;
                                        ucuVar.d = udyVar2.b();
                                        optional2.ifPresentOrElse(new Consumer() { // from class: udr
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void o(Object obj2) {
                                                RepliedToDataAdapter repliedToDataAdapter = (RepliedToDataAdapter) obj2;
                                                entd entdVar3 = udz.a;
                                                boolean equals = ueb.this.equals(ueb.c);
                                                ucx ucxVar = ucuVar;
                                                MessageCoreData messageCoreData3 = messageCoreData2;
                                                if (equals) {
                                                    ((ensz) udz.a.n().h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "setRepliedToDataWithPreconditions", 325, "DraftDataService.java")).q("Setting RepliedToDataAdapter for combined draft with overwritten text");
                                                    messageCoreData3.bO(cnmc.a(repliedToDataAdapter.b));
                                                    ((ucu) ucxVar).c = repliedToDataAdapter;
                                                    return;
                                                }
                                                cnmd U = messageCoreData3.U();
                                                if (U == null) {
                                                    ((ensz) ((ensz) udz.a.j()).h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "setRepliedToDataWithPreconditions", 335, "DraftDataService.java")).q("Combined draft is not a reply but RepliedToDataAdapter was extracted");
                                                    return;
                                                }
                                                ((ensz) udz.a.n().h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "setRepliedToDataWithPreconditions", 339, "DraftDataService.java")).q("Setting RepliedToDataAdapter for combined draft");
                                                emxf.m(repliedToDataAdapter.b.equals(U.b), "Extracted RepliedToDataAdapter has different message ID than the replied-to message ID of combined draft");
                                                ((ucu) ucxVar).c = repliedToDataAdapter;
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer$CC.$default$andThen(this, consumer);
                                            }
                                        }, new Runnable() { // from class: uds
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                entd entdVar3 = udz.a;
                                                if (MessageCoreData.this.U() != null) {
                                                    ((ensz) ((ensz) udz.a.j()).h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "setRepliedToDataWithPreconditions", 351, "DraftDataService.java")).q("Combined draft has ReplyMessageDataWrapper but no RepliedToDataAdapter was extracted");
                                                }
                                            }
                                        });
                                        MessageCoreData messageCoreData3 = ucuVar.a;
                                        if (messageCoreData3 != null && (bcykVar2 = ucuVar.b) != null && (i2 = ucuVar.d) != 0) {
                                            return new ucv(messageCoreData3, bcykVar2, i2, ucuVar.c);
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        if (ucuVar.a == null) {
                                            sb.append(" message");
                                        }
                                        if (ucuVar.b == null) {
                                            sb.append(" conversation");
                                        }
                                        if (ucuVar.d == 0) {
                                            sb.append(" source");
                                        }
                                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                f2.close();
                                return empty;
                            } catch (Throwable th) {
                                try {
                                    f2.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }, udzVar.f);
                    f.b(a22);
                    f.close();
                    return new erph(a22);
                } finally {
                }
            }
        }, this.s);
    }

    public final elfl b(Optional optional) {
        return (elfl) optional.map(new Function() { // from class: udt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elfl) obj).h(new emwl() { // from class: uda
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return Optional.of(obj2);
                    }
                }, udz.this.f);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(elfo.e(Optional.empty()));
    }

    public final void c(MessageCoreData messageCoreData, boolean z, boolean z2) {
        if (messageCoreData == null || messageCoreData.U() == null || z2) {
            emxf.b(messageCoreData == null || messageCoreData.U() == null || z2, "DraftDataService does not accept incoming drafts that are replies unless they are explicitly overwriting the draft text");
        } else {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "acceptNewDraft", 454, "DraftDataService.java")).q("DraftDataService only accepts incoming drafts that with replies if they are overwriting the text: clearing the reply context");
            messageCoreData.bO(null);
        }
        ((ensz) a.n().h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "acceptNewDraft", 466, "DraftDataService.java")).H("DraftDataService : update local cached value with %s %s", z, messageCoreData);
        MessageCoreData messageCoreData2 = (MessageCoreData) this.q.getAndSet(messageCoreData);
        boolean z3 = messageCoreData2 != null ? !messageCoreData2.equals(messageCoreData) : messageCoreData != null;
        ueb uebVar = ueb.a;
        if (z) {
            uebVar = z2 ? ueb.c : ueb.b;
        }
        if (z3 || (this.p.getAndSet(uebVar) != uebVar)) {
            this.h.a(elfo.e(null), this.s);
        }
    }

    public final void d(bcvr bcvrVar) {
        if (!this.o.equals(bcvrVar.e)) {
            throw new IllegalArgumentException("Mismatched conversation id");
        }
        if (!bcvrVar.t.isEmpty()) {
            for (PendingAttachmentData pendingAttachmentData : bcvrVar.t) {
                bcvrVar.v.remove(pendingAttachmentData);
                pendingAttachmentData.bR();
            }
            bcvrVar.t.clear();
        }
        ejvp ejvpVar = this.h;
        final MessageCoreData u = bcvrVar.u(false);
        ejvpVar.a(elfo.h(new erog() { // from class: udo
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final udz udzVar = udz.this;
                final MessageCoreData messageCoreData = u;
                if (messageCoreData.v() == null || messageCoreData.aA() == null) {
                    bcyk a2 = ((bdeo) udzVar.d.b()).a(udzVar.o);
                    if (a2 == null) {
                        ensz enszVar = (ensz) udz.a.j();
                        enszVar.Y(udz.b, udzVar.o.toString());
                        enszVar.Y(udz.c, ((SelfIdentityIdImpl) messageCoreData.v()).a);
                        ((ensz) enszVar.h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "saveDraftDataInternal", 514, "DraftDataService.java")).q("Aborting WriteDraftMessageAction. Message was deleted before saving draft");
                        return elfo.e(null);
                    }
                    SelfIdentityId f = a2.f();
                    if (messageCoreData.v() == null) {
                        messageCoreData.aO(f);
                    }
                    if (messageCoreData.aA() == null) {
                        messageCoreData.aP(f);
                    }
                }
                ensk n = udz.a.n();
                n.Y(udz.b, udzVar.o.toString());
                ((ensz) n.h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "saveDraftDataInternal", 530, "DraftDataService.java")).q("Saving draft message to database");
                return elfo.f(new Runnable() { // from class: udn
                    @Override // java.lang.Runnable
                    public final void run() {
                        udz udzVar2 = udz.this;
                        ((bdmq) udzVar2.k.b()).aa(udzVar2.o, messageCoreData, 2, true);
                        udzVar2.i.d(udzVar2.o);
                        udzVar2.h.a(elfo.e(null), "chat_media_viewer_content_key");
                    }
                }, udzVar.g);
            }
        }, this.g), this.s);
    }
}
