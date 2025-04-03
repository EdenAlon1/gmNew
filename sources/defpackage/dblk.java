package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.Arrays;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dblk extends ffhv implements ffjm {
    final /* synthetic */ dblm a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dblk(ffgu ffguVar, dblm dblmVar) {
        super(2, ffguVar);
        this.a = dblmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dblk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.a.y("ANALYZE");
        String[] strArr = bxyw.a;
        new bxyr().d();
        bxxz[] bxxzVarArr = (bxxz[]) ffdx.ad(ffdx.ad(ffdx.ad(ffdx.ad(ffdx.ad(ffdx.ad(ffdx.ad(ffdx.ad(ffdx.ad(ffdx.ad(ffdx.ad(ffdx.ad(ffdx.ad(dblm.b("participants", new ffji() { // from class: dbkv
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                dblj dbljVar = (dblj) obj2;
                dbljVar.getClass();
                dbljVar.a("index_participants_my_identity_token_foreign_key", "2520, 2520");
                dbljVar.a("index_participants_my_identity_token", "2520 630");
                dbljVar.a("index_participants_sub_id", "2520 630");
                dbljVar.a("index_participants_blocked_is_one", "1 1");
                dbljVar.a("index_participants_recipient_id", "2520 2520");
                dbljVar.a("index_participants_comparable_destination", "2520 2520");
                dbljVar.a("index_participants_cms_id", "2520 1");
                dbljVar.a("sqlite_autoindex_participants_1", "2520 1 1");
                return ffcu.a;
            }
        }), dblm.b("messages", new ffji() { // from class: dble
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                dblj dbljVar = (dblj) obj2;
                dbljVar.getClass();
                dbljVar.a("index_messages_my_identity_foreign_key", "182440 182440");
                dbljVar.a("index_messages_rcs_expiry", "182440 182440");
                dbljVar.a("index_messages_my_identity", "182440 182440");
                dbljVar.a("index_messages_original_rcs_message_id", "21 1");
                dbljVar.a("index_messages_satellite_datagram_id", "182440 182440");
                dbljVar.a("index_messages_self_id", "182440 91220");
                dbljVar.a("index_messages_original_message_id", "182440 182440");
                dbljVar.a("index_messages_is_hidden", "182440 91220");
                dbljVar.a("index_messages_cloud_sync_id", "182440 182440");
                dbljVar.a("index_messages_received_timestamp", "182440 1");
                dbljVar.a("index_messages_sent_timestamp", "182440 1");
                dbljVar.a("index_messages_sender_id", "182440 192");
                dbljVar.a("index_messages_sms_message_uri", "182440 2");
                dbljVar.a("index_messages_cms_correlation_id", "182440 1");
                dbljVar.a("rcs_message_id_and_seen_index", "182440 8293 8293");
                dbljVar.a("index_messages_cms_id", "182440 1");
                dbljVar.a("index_messages_web_id", "182440 182440");
                dbljVar.a("index_messages_read_0", "4 4");
                dbljVar.a("index_messages_ui_sort", "182440 73 1");
                dbljVar.a("index_messages_rcs_message_id", "182440 182440 182440");
                dbljVar.a("index_messages_sort", "182440 73 53 1");
                dbljVar.a("index_messages_status_seen", "182440 12163 12163");
                return ffcu.a;
            }
        })), dblm.b("parts", new ffji() { // from class: dblf
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                dblj dbljVar = (dblj) obj2;
                dbljVar.getClass();
                dbljVar.a("index_parts_local_cache_path", "40 1");
                dbljVar.a("index_parts_file_size_bytes", "440 220");
                dbljVar.a("index_parts_conversation_id", "200369 80");
                dbljVar.a("index_parts_content_type", "200369 50093");
                dbljVar.a("index_parts_message_id", "200369 1");
                return ffcu.a;
            }
        })), dblm.b("conversations", new ffji() { // from class: dblg
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                dblj dbljVar = (dblj) obj2;
                dbljVar.getClass();
                dbljVar.a("index_conversations_destination_token", "2512 2512");
                dbljVar.a("index_conversations_cms_correlation_id", "2512 2512");
                dbljVar.a("index_conversations_current_my_identity_foreign_key", "2512 2512");
                dbljVar.a("index_conversations_participant_normalized_destination", "2512 1");
                dbljVar.a("index_conversations_rcs_group_id", "2 1");
                dbljVar.a("index_conversations_normalized_participant_id_list", "2512 2512");
                dbljVar.a("index_conversations_participant_comparable_destination", "2512 2512");
                dbljVar.a("index_conversations_cms_id", "2512 1");
                dbljVar.a("index_conversations_delete_timestamp", "2512 2512");
                dbljVar.a("index_conversations_rcs_session_id", "2512 2512");
                dbljVar.a("index_conversations_sort_timestamp", "2512 2");
                dbljVar.a("index_conversations_archive_status", "2512 838");
                dbljVar.a("index_conversations_sms_thread_id", "2512 628");
                return ffcu.a;
            }
        })), dblm.b("conversation_participants", new ffji() { // from class: dblh
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                dblj dbljVar = (dblj) obj2;
                dbljVar.getClass();
                dbljVar.a("index_conversation_participants_participant_id", "2520 1");
                dbljVar.a("index_conversation_participants_conversation_id", "2520 1");
                dbljVar.a("sqlite_autoindex_conversation_participants_1", "2520 1 1 1");
                return ffcu.a;
            }
        })), dblm.b("conversation_to_participants", new ffji() { // from class: dbli
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                dblj dbljVar = (dblj) obj2;
                dbljVar.getClass();
                dbljVar.a("index_conversation_to_participants_participant_id", "2522 1");
                dbljVar.a("index_conversation_to_participants_conversation_id", "2522 1");
                dbljVar.a("sqlite_autoindex_conversation_to_participants_1", "2522 1 1");
                return ffcu.a;
            }
        })), dblm.b("contacts", new ffji() { // from class: dbkw
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                dblj dbljVar = (dblj) obj2;
                dbljVar.getClass();
                dbljVar.a("index_contacts_phonebook_label", "98 5");
                dbljVar.a("contacts_sort", "98 5 2");
                dbljVar.a("index_contacts_phone_number", "98 1");
                dbljVar.a("index_contacts_lookup_key", "98 2");
                dbljVar.a("index_contacts_contact_id", "98 2");
                dbljVar.a("index_contacts_cp2_id", "98 1");
                return ffcu.a;
            }
        })), dblm.b("read_reports", new ffji() { // from class: dbkx
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                dblj dbljVar = (dblj) obj2;
                dbljVar.getClass();
                dbljVar.a("index_read_reports_message_id", "6 1");
                dbljVar.a("sqlite_autoindex_read_reports_1", "6 1 1");
                return ffcu.a;
            }
        })), dblm.b("subscriptions", new ffji() { // from class: dbky
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                dblj dbljVar = (dblj) obj2;
                dbljVar.getClass();
                dbljVar.a("index_subscriptions_my_identity_token_with_foreign_key", "3 3");
                dbljVar.a("index_subscriptions_my_identity_token", "3 1");
                dbljVar.a("sqlite_autoindex_subscriptions_1", "3 1 1");
                return ffcu.a;
            }
        })), dblm.b("recent_expressive_stickers", new ffji() { // from class: dbkz
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                dblj dbljVar = (dblj) obj2;
                dbljVar.getClass();
                dbljVar.a("index_recent_expressive_stickers_last_used_timestamp", "11 1");
                dbljVar.a("sqlite_autoindex_recent_expressive_stickers_1", "11 1");
                return ffcu.a;
            }
        })), dblm.b("desktop", new ffji() { // from class: dbla
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                dblj dbljVar = (dblj) obj2;
                dbljVar.getClass();
                dbljVar.b("2");
                return ffcu.a;
            }
        })), dblm.b("events", new ffji() { // from class: dblb
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                dblj dbljVar = (dblj) obj2;
                dbljVar.getClass();
                dbljVar.b("384");
                return ffcu.a;
            }
        })), dblm.b("message_status", new ffji() { // from class: dblc
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                dblj dbljVar = (dblj) obj2;
                dbljVar.getClass();
                dbljVar.b("300");
                return ffcu.a;
            }
        })), dblm.b("self_participants", new ffji() { // from class: dbld
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                dblj dbljVar = (dblj) obj2;
                dbljVar.getClass();
                dbljVar.b("3");
                return ffcu.a;
            }
        })).toArray(new bxxz[0]);
        dtub.A(bxyw.a(), 4, false, new BiConsumer() { // from class: bxxy
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj2, Object obj3) {
                String[] strArr2 = bxyw.a;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, (bxxz[]) Arrays.copyOf(bxxzVarArr, bxxzVarArr.length));
        this.a.a.y("DROP TABLE IF EXISTS foo_for_testing");
        this.a.a.y("CREATE TABLE foo_for_testing (foo, bar)");
        this.a.a.y("ANALYZE foo_for_testing");
        this.a.a.y("DROP TABLE IF EXISTS foo_for_testing");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dblk dblkVar = new dblk(ffguVar, this.a);
        dblkVar.b = obj;
        return dblkVar;
    }
}
