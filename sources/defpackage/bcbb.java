package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcbb implements dtqq {
    public static final bcbb a = new bcbb();
    public static final Map b = ffew.h(new ffcf(c("_id"), d("_id")), new ffcf(c("message_persistence_id"), d("message_persistence_id")), new ffcf(c("my_identity"), d("my_identity_foreign_key")), new ffcf(c("message_status"), d("message_status")), new ffcf(c("seen"), d("seen")), new ffcf(c("read"), d("read")), new ffcf(c("conversation_id"), d("conversation_id")), new ffcf(c("sender_participant_id"), d("sender_id")), new ffcf(c("sender_send_destination"), d("sender_send_destination")), new ffcf(c("msisdn_receiving_rcs_message"), d("msisdn_receiving_rcs_message")), new ffcf(c("self_participant_id"), d("self_id")), new ffcf(c("mms_subject"), d("mms_subject")), new ffcf(c("received_timestamp"), d("received_timestamp")), new ffcf(c("sent_timestamp"), d("sent_timestamp")), new ffcf(c("protocol"), d("message_protocol")), new ffcf(c("message_priority"), d("sms_priority")), new ffcf(c("rcs_encryption_status"), d("etouffee_status")), new ffcf(c("cloud_sync_id"), d("cloud_sync_id")), new ffcf(c("correlation_id"), d("correlation_id")), new ffcf(c("sms_error_code"), d("sms_error_code")), new ffcf(c("sms_error_desc_map_name"), d("sms_error_desc_map_name")), new ffcf(c("mms_transaction_id"), d("mms_transaction_id")), new ffcf(c("mms_content_location"), d("mms_content_location")), new ffcf(c("is_hidden"), d("is_hidden")), new ffcf(c("rcs_message_id"), d("rcs_message_id_with_text_type")), new ffcf(c("custom_headers"), d("custom_headers")), new ffcf(c("cms_id"), d("cms_id")), new ffcf(c("cms_life_cycle"), d("cms_life_cycle")), new ffcf(c("cms_correlation_id"), d("cms_correlation_id")), new ffcf(c("cms_last_mod_seq"), d("cms_last_mod_seq")));

    private bcbb() {
    }

    private static final bbzh c(String str) {
        dtry[] a2 = bcat.a();
        for (int i = 0; i < 30; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (bbzh) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final buun d(String str) {
        dtry[] a2 = buxk.a();
        for (int i = 0; i < 68; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (buun) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dtqq
    public final void a() {
        String[] strArr = bcba.a;
        bcap bcapVar = new bcap();
        bcapVar.f("clearBackupTable");
        bcapVar.e();
        bcapVar.b().b();
    }

    @Override // defpackage.dtqq
    public final void b() {
        String[] strArr = bcba.a;
        dtvx dtvxVar = new dtvx("messages_backup", "backup");
        dtvxVar.d = 5;
        Map map = b;
        bbzh[] bbzhVarArr = (bbzh[]) map.keySet().toArray(new bbzh[0]);
        dtvxVar.b((dtry[]) Arrays.copyOf(bbzhVarArr, bbzhVarArr.length));
        buxo d = MessagesTable.d();
        d.r();
        buun[] buunVarArr = (buun[]) map.values().toArray(new buun[0]);
        d.c((buun[]) Arrays.copyOf(buunVarArr, buunVarArr.length));
        dtvxVar.c = d.b();
        dtvxVar.a().a();
    }
}
