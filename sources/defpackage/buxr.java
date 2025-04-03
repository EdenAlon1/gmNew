package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.time.Instant;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buxr extends duak {
    public buxr() {
        super("messages");
    }

    public final void A(Instant instant) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 17030) {
            dtub.w("queue_insert_timestamp", intValue2);
        }
        if (intValue >= 17030) {
            if (instant == null) {
                this.a.putNull("queue_insert_timestamp");
            } else {
                this.a.put("queue_insert_timestamp", Long.valueOf(bdgw.a(instant)));
            }
        }
    }

    public final void B(int i) {
        this.a.put("raw_status", Integer.valueOf(i));
    }

    public final void C(int i) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 29060) {
            dtub.w("etouffee_status", intValue2);
        }
        if (intValue >= 29060) {
            this.a.put("etouffee_status", Integer.valueOf(i));
        }
    }

    public final void D(long j) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 10004) {
            dtub.w("rcs_file_transfer_session_id", intValue2);
        }
        if (intValue >= 10004) {
            this.a.put("rcs_file_transfer_session_id", Long.valueOf(j));
        }
    }

    public final void E(bdhg bdhgVar) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 41040) {
            dtub.w("rcs_message_id_with_text_type", intValue2);
        }
        if (intValue >= 41040) {
            if (bdhgVar == null) {
                this.a.putNull("rcs_message_id_with_text_type");
            } else {
                this.a.put("rcs_message_id_with_text_type", bdhg.d(bdhgVar));
            }
        }
    }

    public final void F(boolean z) {
        this.a.put("read", Boolean.valueOf(z));
    }

    public final void G(long j) {
        this.a.put("received_timestamp", Long.valueOf(j));
    }

    public final void H(int i) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 58040) {
            dtub.w("result_code", intValue2);
        }
        if (intValue >= 58040) {
            this.a.put("result_code", Integer.valueOf(i));
        }
    }

    public final void I(long j) {
        this.a.put("retry_start_timestamp", Long.valueOf(j));
    }

    public final void J(bdgr bdgrVar) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 59490) {
            dtub.w("satellite_datagram_id", intValue2);
        }
        if (intValue >= 59490) {
            if (bdgrVar.equals(bdgr.a)) {
                this.a.putNull("satellite_datagram_id");
            } else {
                this.a.put("satellite_datagram_id", bdgr.d(bdgrVar));
            }
        }
    }

    public final void K(String str) {
        dtub.u(this.a, "self_id", str);
    }

    public final void L(long j) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 35030) {
            dtub.w("send_counter", intValue2);
        }
        if (intValue >= 35030) {
            this.a.put("send_counter", Long.valueOf(j));
        }
    }

    public final void M(String str) {
        dtub.u(this.a, "sender_id", str);
    }

    public final void N(String str) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 54040) {
            dtub.w("sender_send_destination", intValue2);
        }
        if (intValue >= 54040) {
            dtub.u(this.a, "sender_send_destination", str);
        }
    }

    public final void O(long j) {
        this.a.put("sent_timestamp", Long.valueOf(j));
    }

    public final void P(int i) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 9000) {
            dtub.w("sms_error_code", intValue2);
        }
        if (intValue >= 9000) {
            this.a.put("sms_error_code", Integer.valueOf(i));
        }
    }

    public final void Q(String str) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 9000) {
            dtub.w("sms_error_desc_map_name", intValue2);
        }
        if (intValue >= 9000) {
            dtub.u(this.a, "sms_error_desc_map_name", str);
        }
    }

    public final void R(long j) {
        this.a.put("sms_message_size", Long.valueOf(j));
    }

    public final void S(Uri uri) {
        if (uri == null) {
            this.a.putNull("sms_message_uri");
        } else {
            this.a.put("sms_message_uri", uri.toString());
        }
    }

    public final void T() {
        this.a.putNull("sms_message_uri");
    }

    public final void U(int i) {
        this.a.put("message_status", Integer.valueOf(i));
    }

    public final void V(byzi byziVar) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 29090) {
            dtub.w(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, intValue2);
        }
        if (intValue >= 29090) {
            if (byziVar == null) {
                this.a.putNull(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS);
            } else {
                this.a.put(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, Integer.valueOf(byziVar.ordinal()));
            }
        }
    }

    public final void W(byzl byzlVar) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 59310) {
            dtub.w("xms_transport", intValue2);
        }
        if (intValue >= 59310) {
            if (byzlVar == null) {
                this.a.putNull("xms_transport");
            } else {
                this.a.put("xms_transport", Integer.valueOf(byzlVar.ordinal()));
            }
        }
    }

    public final void X(buxz buxzVar) {
        af(new buxs(buxzVar));
    }

    public final void Y(Function function) {
        Object apply;
        String[] strArr = MessagesTable.a;
        apply = function.apply(new buxz());
        af(new buxs((buxz) apply));
    }

    public final int a() {
        return this.a.getAsInteger("message_status").intValue();
    }

    public final long c() {
        return this.a.getAsLong("received_timestamp").longValue();
    }

    @Override // defpackage.duak
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final buxq b() {
        ah();
        return new buxq(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final boolean e(MessageIdType messageIdType) {
        String[] strArr = MessagesTable.a;
        buxz buxzVar = new buxz();
        buxzVar.q(messageIdType);
        return aj(new buxs(buxzVar), "messages-buildAndUpdateForId");
    }

    public final void f(int i) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 58230) {
            dtub.w("auto_retry_counter", intValue2);
        }
        if (intValue >= 58230) {
            this.a.put("auto_retry_counter", Integer.valueOf(i));
        }
    }

    public final void g(boolean z) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 49060) {
            dtub.w("awaiting_reverse_sync", intValue2);
        }
        if (intValue >= 49060) {
            this.a.put("awaiting_reverse_sync", Boolean.valueOf(z));
        }
    }

    public final void h(boolean z) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 58280) {
            dtub.w("can_revoke_before_delivered_with_rcs", intValue2);
        }
        if (intValue >= 58280) {
            this.a.put("can_revoke_before_delivered_with_rcs", Boolean.valueOf(z));
        }
    }

    public final void i(String str) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 8500) {
            dtub.w("cloud_sync_id", intValue2);
        }
        if (intValue >= 8500) {
            dtub.u(this.a, "cloud_sync_id", str);
        }
    }

    public final void j(String str) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 46010) {
            dtub.w("cms_correlation_id", intValue2);
        }
        if (intValue >= 46010) {
            dtub.u(this.a, "cms_correlation_id", str);
        }
    }

    public final void k(String str) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 31010) {
            dtub.w("cms_id", intValue2);
        }
        if (intValue >= 31010) {
            dtub.u(this.a, "cms_id", str);
        }
    }

    public final void l(long j) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 37040) {
            dtub.w("cms_last_mod_seq", intValue2);
        }
        if (intValue >= 37040) {
            this.a.put("cms_last_mod_seq", Long.valueOf(j));
        }
    }

    public final void m(csgg csggVar) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 58210) {
            dtub.w("cms_life_cycle", intValue2);
        }
        if (intValue >= 58210) {
            if (csggVar == null) {
                this.a.putNull("cms_life_cycle");
            } else {
                this.a.put("cms_life_cycle", Integer.valueOf(csggVar.ordinal()));
            }
        }
    }

    public final void n(ConversationIdType conversationIdType) {
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            this.a.putNull("conversation_id");
        } else {
            this.a.put("conversation_id", Long.valueOf(bdgq.a(conversationIdType)));
        }
    }

    public final void o(String str) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 9010) {
            dtub.w("correlation_id", intValue2);
        }
        if (intValue >= 9010) {
            dtub.u(this.a, "correlation_id", str);
        }
    }

    public final void p(fayv fayvVar) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 45020) {
            dtub.w("custom_headers", intValue2);
        }
        if (intValue >= 45020) {
            if (fayvVar == null) {
                this.a.putNull("custom_headers");
            } else {
                this.a.put("custom_headers", fayvVar.toByteArray());
            }
        }
    }

    public final void q(boolean z) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 30010) {
            dtub.w("is_hidden", intValue2);
        }
        if (intValue >= 30010) {
            this.a.put("is_hidden", Boolean.valueOf(z));
        }
    }

    public final void r(dtzj dtzjVar) {
        ag("message_persistence_id", dtzjVar);
    }

    public final void s(int i) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 13020) {
            dtub.w("message_report_status", intValue2);
        }
        if (intValue >= 13020) {
            this.a.put("message_report_status", Integer.valueOf(i));
        }
    }

    public final void t(long j) {
        this.a.put("mms_expiry", Long.valueOf(j));
    }

    public final void u(String str) {
        dtub.u(this.a, "mms_transaction_id", str);
    }

    public final void v(boolean z) {
        this.a.put("seen", Boolean.valueOf(z));
    }

    public final void w() {
        this.a.putNull("old_sms_message_uri");
    }

    public final void x(byzg byzgVar) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 58720) {
            dtub.w("outgoing_delivery_report_status", intValue2);
        }
        if (intValue >= 58720) {
            if (byzgVar == null) {
                this.a.putNull("outgoing_delivery_report_status");
            } else {
                this.a.put("outgoing_delivery_report_status", Integer.valueOf(byzgVar.ordinal()));
            }
        }
    }

    public final void y(byzg byzgVar) {
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 58720) {
            dtub.w("outgoing_read_report_status", intValue2);
        }
        if (intValue >= 58720) {
            if (byzgVar == null) {
                this.a.putNull("outgoing_read_report_status");
            } else {
                this.a.put("outgoing_read_report_status", Integer.valueOf(byzgVar.ordinal()));
            }
        }
    }

    public final void z(int i) {
        this.a.put("message_protocol", Integer.valueOf(i));
    }
}
