package com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.azsu;
import defpackage.azsv;
import defpackage.bdgq;
import defpackage.bdgr;
import defpackage.bdgw;
import defpackage.bdhb;
import defpackage.bdhf;
import defpackage.bdhg;
import defpackage.bdhj;
import defpackage.buoo;
import defpackage.buop;
import defpackage.buoq;
import defpackage.buor;
import defpackage.buos;
import defpackage.buot;
import defpackage.buou;
import defpackage.buoy;
import defpackage.buoz;
import defpackage.buum;
import defpackage.buun;
import defpackage.buuo;
import defpackage.buxf;
import defpackage.buxm;
import defpackage.buxo;
import defpackage.buxz;
import defpackage.byyw;
import defpackage.byzg;
import defpackage.byzi;
import defpackage.byzl;
import defpackage.cfmg;
import defpackage.cfmh;
import defpackage.cjco;
import defpackage.csgg;
import defpackage.dtro;
import defpackage.dtrq;
import defpackage.dtsq;
import defpackage.dtsu;
import defpackage.dtub;
import defpackage.dtuj;
import defpackage.dtup;
import defpackage.dtve;
import defpackage.dtzf;
import defpackage.ekhw;
import defpackage.engr;
import defpackage.engw;
import defpackage.enhd;
import defpackage.enhk;
import defpackage.eyfc;
import defpackage.eyfy;
import defpackage.fayv;
import defpackage.fjay;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class MessagesTable extends dtup {
    public static final String[] a = {"messages._id", "messages.conversation_id", "messages.sender_id", "messages.sender_send_destination", "messages.msisdn_receiving_rcs_message", "messages.receiving_network_country", "messages.sent_timestamp", "messages.queue_insert_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.message_report_status", "messages.seen", "messages.read", "messages.sms_message_uri", "messages.sms_priority", "messages.sms_message_size", "messages.mms_subject", "messages.mms_transaction_id", "messages.mms_content_location", "messages.mms_expiry", "messages.rcs_expiry", "messages.mms_retrieve_text", "messages.raw_status", "messages.self_id", "messages.my_identity_foreign_key", "messages.retry_start_timestamp", "messages.cloud_sync_id", "messages.rcs_message_id_with_text_type", "messages.etouffee_status", "messages.verification_status", "messages.rcs_ui_status", "messages.is_hidden", "messages.rcs_remote_instance", "messages.rcs_file_transfer_session_id", "messages.sms_error_code", "messages.sms_error_desc_map_name", "messages.correlation_id", "messages.cms_id", "messages.cms_last_mod_seq", "messages.web_id", "messages.usage_stats_logging_id", "messages.send_counter", "messages.original_rcs_message_id", "messages.custom_delivery_receipt_mime_type", "messages.custom_delivery_receipt_content", "messages.report_attempt_acounter", "messages.custom_headers", "messages.cms_correlation_id", "messages.group_private_participant", "messages.original_message_id", "messages.awaiting_reverse_sync", "messages.old_sms_message_uri", "messages.draft_id", "messages.result_code", "messages.cms_life_cycle", "messages.mute_priority", "messages.fallback_reason", "messages.auto_retry_counter", "messages.can_revoke_before_delivered_with_rcs", "messages.trace_id", "messages.outgoing_delivery_report_status", "messages.outgoing_read_report_status", "messages.xms_transport", "messages.message_original_protocol", "messages.satellite_datagram_id", "messages.encryption_protocol", "messages.message_persistence_id"};
    public static final enhk b;
    public static final buum c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("messages.sender_send_destination", 54040);
        enhdVar.k("messages.msisdn_receiving_rcs_message", 59340);
        enhdVar.k("messages.receiving_network_country", 54040);
        enhdVar.k("messages.queue_insert_timestamp", 17030);
        enhdVar.k("messages.message_report_status", 13020);
        enhdVar.k("messages.rcs_expiry", 59890);
        enhdVar.k("messages.mms_retrieve_text", 9030);
        enhdVar.k("messages.my_identity_foreign_key", 60160);
        enhdVar.k("messages.cloud_sync_id", 8500);
        enhdVar.k("messages.rcs_message_id_with_text_type", 41040);
        enhdVar.k("messages.etouffee_status", 29060);
        enhdVar.k("messages.verification_status", 29090);
        enhdVar.k("messages.rcs_ui_status", 39000);
        enhdVar.k("messages.is_hidden", 30010);
        enhdVar.k("messages.rcs_remote_instance", 10002);
        enhdVar.k("messages.rcs_file_transfer_session_id", 10004);
        enhdVar.k("messages.sms_error_code", 9000);
        enhdVar.k("messages.sms_error_desc_map_name", 9000);
        enhdVar.k("messages.correlation_id", 9010);
        enhdVar.k("messages.cms_id", 31010);
        enhdVar.k("messages.cms_last_mod_seq", 37040);
        enhdVar.k("messages.web_id", 19020);
        enhdVar.k("messages.usage_stats_logging_id", 29100);
        enhdVar.k("messages.send_counter", 35030);
        enhdVar.k("messages.original_rcs_message_id", 35030);
        enhdVar.k("messages.custom_delivery_receipt_mime_type", 37020);
        enhdVar.k("messages.custom_delivery_receipt_content", 37020);
        enhdVar.k("messages.report_attempt_acounter", 37030);
        enhdVar.k("messages.custom_headers", 45020);
        enhdVar.k("messages.cms_correlation_id", 46010);
        enhdVar.k("messages.group_private_participant", 48030);
        enhdVar.k("messages.original_message_id", 48030);
        enhdVar.k("messages.awaiting_reverse_sync", 49060);
        enhdVar.k("messages.old_sms_message_uri", 49060);
        enhdVar.k("messages.draft_id", 56000);
        enhdVar.k("messages.result_code", 58040);
        enhdVar.k("messages.cms_life_cycle", 58210);
        enhdVar.k("messages.mute_priority", 60750);
        enhdVar.k("messages.fallback_reason", 58710);
        enhdVar.k("messages.auto_retry_counter", 58230);
        enhdVar.k("messages.can_revoke_before_delivered_with_rcs", 58280);
        enhdVar.k("messages.trace_id", 58680);
        enhdVar.k("messages.outgoing_delivery_report_status", 58720);
        enhdVar.k("messages.outgoing_read_report_status", 58720);
        enhdVar.k("messages.xms_transport", 59310);
        enhdVar.k("messages.message_original_protocol", 59430);
        enhdVar.k("messages.satellite_datagram_id", 59490);
        enhdVar.k("messages.encryption_protocol", 60190);
        enhdVar.k("messages.message_persistence_id", 60370);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("_id", "index_unsent_rcs_report");
        enhdVar2.k("sender_id", "index_messages_sender_id");
        enhdVar2.k("sent_timestamp", "index_messages_sent_timestamp");
        enhdVar2.k("read", "index_messages_read_0");
        enhdVar2.k("sms_message_uri", "index_messages_sms_message_uri");
        enhdVar2.k("rcs_expiry", "index_messages_rcs_expiry");
        enhdVar2.k("self_id", "index_messages_self_id");
        enhdVar2.k("my_identity", "index_messages_my_identity");
        enhdVar2.k("my_identity_foreign_key", "index_messages_my_identity_foreign_key");
        enhdVar2.k("cloud_sync_id", "index_messages_cloud_sync_id");
        enhdVar2.k(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, "index_messages_verification_status");
        enhdVar2.k("cms_id", "index_messages_cms_id");
        enhdVar2.k("web_id", "index_messages_web_id");
        enhdVar2.k("original_rcs_message_id", "index_messages_original_rcs_message_id");
        enhdVar2.k("cms_correlation_id", "index_messages_cms_correlation_id");
        enhdVar2.k("group_private_participant", "index_messages_group_private_participant");
        enhdVar2.k("original_message_id", "index_messages_original_message_id");
        enhdVar2.k("awaiting_reverse_sync", "index_messages_awaiting_reverse_sync");
        enhdVar2.k("draft_id", "index_messages_draft_id");
        enhdVar2.k("satellite_datagram_id", "index_messages_satellite_datagram_id");
        enhdVar2.k("message_persistence_id", "index_messages_message_persistence_id");
        enhdVar2.c();
        c = new buum();
        d = new int[]{8500, 9000, 9010, 9030, 10000, 10002, 10004, 13020, 17030, 19020, 22080, 24090, 25010, 29060, 29090, 29100, 30010, 31010, 32050, 35030, 36000, 37020, 37030, 37040, 39000, 41040, 45020, 46010, 48030, 49060, 54040, 54070, 56000, 58040, 58060, 58210, 58230, 58280, 58360, 58680, 58710, 58720, 58740, 59160, 59310, 59340, 59430, 59490, 59510, 59530, 59810, 59890, 60160, 60190, 60370, 60550, 60650, 60750};
    }

    public static BindData a(String str) {
        buxo d2 = d();
        d2.z("messages.queryOnCmsId");
        d2.q();
        buxz buxzVar = new buxz();
        buxzVar.f(str);
        d2.g(buxzVar);
        return (BindData) dtub.c(d2.b());
    }

    public static BindData b(MessageIdType messageIdType) {
        buxo d2 = d();
        d2.z("messages.queryOnId");
        d2.q();
        buxz buxzVar = new buxz();
        buxzVar.q(messageIdType);
        d2.g(buxzVar);
        return (BindData) dtub.c(d2.b());
    }

    public static buoy c() {
        buoz buozVar = new buoz();
        buozVar.aF();
        return buozVar;
    }

    public static final buxo d() {
        String[] strArr;
        Integer g = g();
        if (g.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("messages._id");
            engrVar.h("messages.conversation_id");
            engrVar.h("messages.sender_id");
            if (g.intValue() >= 54040) {
                engrVar.h("messages.sender_send_destination");
            }
            if (g.intValue() >= 59340) {
                engrVar.h("messages.msisdn_receiving_rcs_message");
            }
            if (g.intValue() >= 54040) {
                engrVar.h("messages.receiving_network_country");
            }
            engrVar.h("messages.sent_timestamp");
            if (g.intValue() >= 17030) {
                engrVar.h("messages.queue_insert_timestamp");
            }
            engrVar.h("messages.received_timestamp");
            engrVar.h("messages.message_protocol");
            engrVar.h("messages.message_status");
            if (g.intValue() >= 13020) {
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
            if (g.intValue() >= 59890) {
                engrVar.h("messages.rcs_expiry");
            }
            if (g.intValue() >= 9030) {
                engrVar.h("messages.mms_retrieve_text");
            }
            engrVar.h("messages.raw_status");
            engrVar.h("messages.self_id");
            if (g.intValue() >= 60160) {
                engrVar.h("messages.my_identity_foreign_key");
            }
            engrVar.h("messages.retry_start_timestamp");
            if (g.intValue() >= 8500) {
                engrVar.h("messages.cloud_sync_id");
            }
            if (g.intValue() >= 41040) {
                engrVar.h("messages.rcs_message_id_with_text_type");
            }
            if (g.intValue() >= 29060) {
                engrVar.h("messages.etouffee_status");
            }
            if (g.intValue() >= 29090) {
                engrVar.h("messages.verification_status");
            }
            if (g.intValue() >= 39000) {
                engrVar.h("messages.rcs_ui_status");
            }
            if (g.intValue() >= 30010) {
                engrVar.h("messages.is_hidden");
            }
            if (g.intValue() >= 10002) {
                engrVar.h("messages.rcs_remote_instance");
            }
            if (g.intValue() >= 10004) {
                engrVar.h("messages.rcs_file_transfer_session_id");
            }
            if (g.intValue() >= 9000) {
                engrVar.h("messages.sms_error_code");
            }
            if (g.intValue() >= 9000) {
                engrVar.h("messages.sms_error_desc_map_name");
            }
            if (g.intValue() >= 9010) {
                engrVar.h("messages.correlation_id");
            }
            if (g.intValue() >= 31010) {
                engrVar.h("messages.cms_id");
            }
            if (g.intValue() >= 37040) {
                engrVar.h("messages.cms_last_mod_seq");
            }
            if (g.intValue() >= 19020) {
                engrVar.h("messages.web_id");
            }
            if (g.intValue() >= 29100) {
                engrVar.h("messages.usage_stats_logging_id");
            }
            if (g.intValue() >= 35030) {
                engrVar.h("messages.send_counter");
            }
            if (g.intValue() >= 35030) {
                engrVar.h("messages.original_rcs_message_id");
            }
            if (g.intValue() >= 37020) {
                engrVar.h("messages.custom_delivery_receipt_mime_type");
            }
            if (g.intValue() >= 37020) {
                engrVar.h("messages.custom_delivery_receipt_content");
            }
            if (g.intValue() >= 37030) {
                engrVar.h("messages.report_attempt_acounter");
            }
            if (g.intValue() >= 45020) {
                engrVar.h("messages.custom_headers");
            }
            if (g.intValue() >= 46010) {
                engrVar.h("messages.cms_correlation_id");
            }
            if (g.intValue() >= 48030) {
                engrVar.h("messages.group_private_participant");
            }
            if (g.intValue() >= 48030) {
                engrVar.h("messages.original_message_id");
            }
            if (g.intValue() >= 49060) {
                engrVar.h("messages.awaiting_reverse_sync");
            }
            if (g.intValue() >= 49060) {
                engrVar.h("messages.old_sms_message_uri");
            }
            if (g.intValue() >= 56000) {
                engrVar.h("messages.draft_id");
            }
            if (g.intValue() >= 58040) {
                engrVar.h("messages.result_code");
            }
            if (g.intValue() >= 58210) {
                engrVar.h("messages.cms_life_cycle");
            }
            if (g.intValue() >= 60750) {
                engrVar.h("messages.mute_priority");
            }
            if (g.intValue() >= 58710) {
                engrVar.h("messages.fallback_reason");
            }
            if (g.intValue() >= 58230) {
                engrVar.h("messages.auto_retry_counter");
            }
            if (g.intValue() >= 58280) {
                engrVar.h("messages.can_revoke_before_delivered_with_rcs");
            }
            if (g.intValue() >= 58680) {
                engrVar.h("messages.trace_id");
            }
            if (g.intValue() >= 58720) {
                engrVar.h("messages.outgoing_delivery_report_status");
            }
            if (g.intValue() >= 58720) {
                engrVar.h("messages.outgoing_read_report_status");
            }
            if (g.intValue() >= 59310) {
                engrVar.h("messages.xms_transport");
            }
            if (g.intValue() >= 59430) {
                engrVar.h("messages.message_original_protocol");
            }
            if (g.intValue() >= 59490) {
                engrVar.h("messages.satellite_datagram_id");
            }
            if (g.intValue() >= 60190) {
                engrVar.h("messages.encryption_protocol");
            }
            if (g.intValue() >= 60370) {
                engrVar.h("messages.message_persistence_id");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new buxo(strArr);
    }

    public static final buxo e(String str) {
        buxo d2 = d();
        d2.z(str);
        return d2;
    }

    public static dtve f() {
        return dtub.e("$primary");
    }

    public static Integer g() {
        return Integer.valueOf(k().a());
    }

    public static Object h(MessageIdType messageIdType, Function function, Supplier supplier) {
        Object obj;
        Object apply;
        BindData b2 = b(messageIdType);
        if (b2 != null) {
            apply = function.apply(b2);
            return apply;
        }
        obj = supplier.get();
        return obj;
    }

    public static Object i(MessageIdType messageIdType, Function function) {
        Object apply;
        BindData b2 = b(messageIdType);
        if (b2 == null) {
            return null;
        }
        apply = function.apply(b2);
        return apply;
    }

    public static Object j(MessageIdType messageIdType, Function function, Supplier supplier) {
        Object obj;
        Object apply;
        BindData b2 = b(messageIdType);
        if (b2 != null) {
            apply = function.apply(b2);
            return apply;
        }
        obj = supplier.get();
        return obj;
    }

    public static dtzf k() {
        return f().P();
    }

    /* compiled from: PG */
    public static abstract class BindData extends dtro<buuo, buxm, buxo, BindData, buun> implements Parcelable, dtrq {
        public static final Parcelable.Creator<BindData> CREATOR = new buoo();
        public String B;
        public String H;
        public String K;
        public String L;
        public String M;
        public long N;
        public String S;
        public byte[] T;
        public fayv V;
        public String W;
        public String X;
        public Uri aa;
        public fjay ai;
        public byzg aj;
        public byzg ak;
        public byzl al;
        public int am;
        public bdgr an;
        public cfmh ao;
        public Optional ap;
        public String c;
        public String d;
        public String e;
        public String f;
        public Uri o;
        public String r;
        public String s;
        public String t;
        public String w;
        public String y;
        public MessageIdType a = bdhb.a;
        public ConversationIdType b = bdgq.a;
        public long g = 0;
        public Instant h = bdgw.b(0);
        public long i = 0;
        public int j = 0;
        public int k = 0;
        public int l = 0;
        public boolean m = false;
        public boolean n = false;
        public int p = 0;
        public long q = 0;
        public long u = 0;
        public long v = 0;
        public int x = 0;
        public azsu z = null;
        public long A = 0;
        public bdhg C = bdhg.a;
        public int D = 0;
        public byzi E = byzi.VERIFICATION_NA;
        public int F = 0;
        public boolean G = false;
        public long I = -1;
        public int J = -1;
        public String O = "";
        public long P = 0;
        public long Q = 1;
        public bdhg R = bdhg.a;
        public long U = 0;
        public MessageIdType Y = bdhb.a;
        public boolean Z = false;
        public Optional ab = bdhj.a;
        public int ac = -2;
        public csgg ad = csgg.UNKNOWN;
        public cjco ae = cjco.c;
        public byyw af = byyw.UNKNOWN;
        public int ag = 0;
        public boolean ah = false;

        protected BindData() {
            byzg byzgVar = byzg.UNKNOWN;
            this.aj = byzgVar;
            this.ak = byzgVar;
            this.al = byzl.UNKNOWN;
            this.am = -1;
            this.an = bdgr.a;
            this.ao = new cfmh(0L);
            this.ap = bdhf.a();
        }

        public final long A() {
            az(41, "usage_stats_logging_id");
            return this.P;
        }

        public final Uri B() {
            az(14, "sms_message_uri");
            return this.o;
        }

        public final ConversationIdType C() {
            az(1, "conversation_id");
            return this.b;
        }

        public final MessageIdType D() {
            az(0, "_id");
            return this.a;
        }

        public final MessageIdType E() {
            final dtve f = MessagesTable.f();
            return new MessageIdType(dtub.b(MessagesTable.f(), "messages", this, new Function() { // from class: buon
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dtve.this.S("messages", (ContentValues) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: buoj
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    MessagesTable.BindData.this.ab((Long) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }));
        }

        public final bdhg F() {
            az(43, "original_rcs_message_id");
            return this.R;
        }

        public final bdhg G() {
            az(28, "rcs_message_id_with_text_type");
            return this.C;
        }

        public final buoy H() {
            buoz buozVar = new buoz();
            buozVar.d(this, false, this.cJ);
            return buozVar;
        }

        public final buoy I() {
            buoz buozVar = new buoz();
            buozVar.d(this, true, this.cJ);
            return buozVar;
        }

        public final byyw J() {
            az(57, "fallback_reason");
            return this.af;
        }

        public final byzi K() {
            az(30, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS);
            return this.E;
        }

        public final byzl L() {
            az(63, "xms_transport");
            return this.al;
        }

        public final csgg M() {
            az(55, "cms_life_cycle");
            return this.ad;
        }

        public final fayv N() {
            az(47, "custom_headers");
            return this.V;
        }

        public final Optional O() {
            az(67, "message_persistence_id");
            return this.ap;
        }

        public final String P() {
            az(27, "cloud_sync_id");
            return this.B;
        }

        public final String Q() {
            az(48, "cms_correlation_id");
            return this.W;
        }

        public final String R() {
            az(38, "cms_id");
            return this.M;
        }

        public final String S() {
            az(37, "correlation_id");
            return this.L;
        }

        public final String T() {
            az(19, "mms_content_location");
            return this.t;
        }

        public final String U() {
            az(22, "mms_retrieve_text");
            return this.w;
        }

        public final String V() {
            az(17, "mms_subject");
            return this.r;
        }

        public final String W() {
            az(24, "self_id");
            return this.y;
        }

        public final String X() {
            az(2, "sender_id");
            return this.c;
        }

        public final String Y() {
            az(36, "sms_error_desc_map_name");
            return this.K;
        }

        public final String Z() {
            az(40, "web_id");
            return this.O;
        }

        @Override // defpackage.dtro
        public final String a() {
            Locale locale = Locale.US;
            String valueOf = String.valueOf(this.a);
            String valueOf2 = String.valueOf(this.b);
            String valueOf3 = String.valueOf(this.c);
            String valueOf4 = String.valueOf(this.d);
            String valueOf5 = String.valueOf(this.e);
            String valueOf6 = String.valueOf(this.f);
            String valueOf7 = String.valueOf(this.g);
            String valueOf8 = String.valueOf(this.h);
            String valueOf9 = String.valueOf(this.i);
            String valueOf10 = String.valueOf(this.j);
            String valueOf11 = String.valueOf(this.k);
            String valueOf12 = String.valueOf(this.l);
            String valueOf13 = String.valueOf(this.m);
            String valueOf14 = String.valueOf(this.n);
            String valueOf15 = String.valueOf(this.o);
            String valueOf16 = String.valueOf(this.p);
            String valueOf17 = String.valueOf(this.q);
            String valueOf18 = String.valueOf(this.r);
            String valueOf19 = String.valueOf(this.s);
            String valueOf20 = String.valueOf(this.t);
            String valueOf21 = String.valueOf(this.u);
            String valueOf22 = String.valueOf(this.v);
            String valueOf23 = String.valueOf(this.w);
            String valueOf24 = String.valueOf(this.x);
            String valueOf25 = String.valueOf(this.y);
            String valueOf26 = String.valueOf(this.z);
            String valueOf27 = String.valueOf(this.A);
            String valueOf28 = String.valueOf(this.B);
            String valueOf29 = String.valueOf(this.C);
            String valueOf30 = String.valueOf(this.D);
            String valueOf31 = String.valueOf(this.E);
            String valueOf32 = String.valueOf(this.F);
            String valueOf33 = String.valueOf(this.G);
            String valueOf34 = String.valueOf(this.H);
            String valueOf35 = String.valueOf(this.I);
            String valueOf36 = String.valueOf(this.J);
            String valueOf37 = String.valueOf(this.K);
            String valueOf38 = String.valueOf(this.L);
            String valueOf39 = String.valueOf(this.M);
            String valueOf40 = String.valueOf(this.N);
            String valueOf41 = String.valueOf(this.O);
            String valueOf42 = String.valueOf(this.P);
            String valueOf43 = String.valueOf(this.Q);
            String valueOf44 = String.valueOf(this.R);
            String valueOf45 = String.valueOf(this.S);
            byte[] bArr = this.T;
            return String.format(locale, "MessagesTable [_id: %s,\n  conversation_id: %s,\n  sender_id: %s,\n  sender_send_destination: %s,\n  msisdn_receiving_rcs_message: %s,\n  receiving_network_country: %s,\n  sent_timestamp: %s,\n  queue_insert_timestamp: %s,\n  received_timestamp: %s,\n  message_protocol: %s,\n  message_status: %s,\n  message_report_status: %s,\n  seen: %s,\n  read: %s,\n  sms_message_uri: %s,\n  sms_priority: %s,\n  sms_message_size: %s,\n  mms_subject: %s,\n  mms_transaction_id: %s,\n  mms_content_location: %s,\n  mms_expiry: %s,\n  rcs_expiry: %s,\n  mms_retrieve_text: %s,\n  raw_status: %s,\n  self_id: %s,\n  my_identity_foreign_key: %s,\n  retry_start_timestamp: %s,\n  cloud_sync_id: %s,\n  rcs_message_id_with_text_type: %s,\n  etouffee_status: %s,\n  verification_status: %s,\n  rcs_ui_status: %s,\n  is_hidden: %s,\n  rcs_remote_instance: %s,\n  rcs_file_transfer_session_id: %s,\n  sms_error_code: %s,\n  sms_error_desc_map_name: %s,\n  correlation_id: %s,\n  cms_id: %s,\n  cms_last_mod_seq: %s,\n  web_id: %s,\n  usage_stats_logging_id: %s,\n  send_counter: %s,\n  original_rcs_message_id: %s,\n  custom_delivery_receipt_mime_type: %s,\n  custom_delivery_receipt_content: %s,\n  report_attempt_acounter: %s,\n  custom_headers: %s,\n  cms_correlation_id: %s,\n  group_private_participant: %s,\n  original_message_id: %s,\n  awaiting_reverse_sync: %s,\n  old_sms_message_uri: %s,\n  draft_id: %s,\n  result_code: %s,\n  cms_life_cycle: %s,\n  mute_priority: %s,\n  fallback_reason: %s,\n  auto_retry_counter: %s,\n  can_revoke_before_delivered_with_rcs: %s,\n  trace_id: %s,\n  outgoing_delivery_report_status: %s,\n  outgoing_read_report_status: %s,\n  xms_transport: %s,\n  message_original_protocol: %s,\n  satellite_datagram_id: %s,\n  encryption_protocol: %s,\n  message_persistence_id: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.U), String.valueOf(this.V), String.valueOf(this.W), String.valueOf(this.X), String.valueOf(this.Y), String.valueOf(this.Z), String.valueOf(this.aa), String.valueOf(this.ab), String.valueOf(this.ac), String.valueOf(this.ad), String.valueOf(this.ae), String.valueOf(this.af), String.valueOf(this.ag), String.valueOf(this.ah), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao), String.valueOf(this.ap));
        }

        public final fjay aa() {
            az(60, "trace_id");
            return this.ai;
        }

        public final /* synthetic */ void ab(final Long l) {
            if (l.longValue() >= 0) {
                this.a = (MessageIdType) new dtuj() { // from class: buom
                    @Override // defpackage.dtuj
                    public final Object a() {
                        return new MessageIdType(l.longValue());
                    }
                }.a();
                super.fY(0);
            }
        }

        public final /* synthetic */ void ac(final Long l) {
            if (l.longValue() >= 0) {
                this.a = (MessageIdType) new dtuj() { // from class: buoi
                    @Override // defpackage.dtuj
                    public final Object a() {
                        return new MessageIdType(l.longValue());
                    }
                }.a();
                super.fY(0);
            }
        }

        public final boolean ad() {
            az(32, "is_hidden");
            return this.G;
        }

        public final boolean ae() {
            az(12, "seen");
            return this.m;
        }

        public final boolean af() {
            az(13, "read");
            return this.n;
        }

        @Override // defpackage.dtro
        public final void b(ContentValues contentValues) {
            int intValue = MessagesTable.g().intValue();
            MessageIdType messageIdType = this.a;
            if (messageIdType == null || messageIdType.equals(bdhb.a)) {
                contentValues.putNull("_id");
            } else {
                contentValues.put("_id", Long.valueOf(bdhb.a(this.a)));
            }
            ConversationIdType conversationIdType = this.b;
            if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
                contentValues.putNull("conversation_id");
            } else {
                contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.b)));
            }
            dtub.u(contentValues, "sender_id", this.c);
            if (intValue >= 54040) {
                dtub.u(contentValues, "sender_send_destination", this.d);
            }
            if (intValue >= 59340) {
                dtub.u(contentValues, "msisdn_receiving_rcs_message", this.e);
            }
            if (intValue >= 54040) {
                dtub.u(contentValues, "receiving_network_country", this.f);
            }
            contentValues.put("sent_timestamp", Long.valueOf(this.g));
            if (intValue >= 17030) {
                Instant instant = this.h;
                if (instant == null) {
                    contentValues.putNull("queue_insert_timestamp");
                } else {
                    contentValues.put("queue_insert_timestamp", Long.valueOf(bdgw.a(instant)));
                }
            }
            contentValues.put("received_timestamp", Long.valueOf(this.i));
            contentValues.put("message_protocol", Integer.valueOf(this.j));
            contentValues.put("message_status", Integer.valueOf(this.k));
            if (intValue >= 13020) {
                contentValues.put("message_report_status", Integer.valueOf(this.l));
            }
            contentValues.put("seen", Boolean.valueOf(this.m));
            contentValues.put("read", Boolean.valueOf(this.n));
            Uri uri = this.o;
            if (uri == null) {
                contentValues.putNull("sms_message_uri");
            } else {
                contentValues.put("sms_message_uri", uri.toString());
            }
            contentValues.put("sms_priority", Integer.valueOf(this.p));
            contentValues.put("sms_message_size", Long.valueOf(this.q));
            dtub.u(contentValues, "mms_subject", this.r);
            dtub.u(contentValues, "mms_transaction_id", this.s);
            dtub.u(contentValues, "mms_content_location", this.t);
            contentValues.put("mms_expiry", Long.valueOf(this.u));
            if (intValue >= 59890) {
                contentValues.put("rcs_expiry", Long.valueOf(this.v));
            }
            if (intValue >= 9030) {
                dtub.u(contentValues, "mms_retrieve_text", this.w);
            }
            contentValues.put("raw_status", Integer.valueOf(this.x));
            dtub.u(contentValues, "self_id", this.y);
            if (intValue >= 60160) {
                azsu azsuVar = this.z;
                if (azsuVar == null || azsuVar.equals(null)) {
                    contentValues.putNull("my_identity_foreign_key");
                } else {
                    contentValues.put("my_identity_foreign_key", azsv.b(this.z));
                }
            }
            contentValues.put("retry_start_timestamp", Long.valueOf(this.A));
            if (intValue >= 8500) {
                dtub.u(contentValues, "cloud_sync_id", this.B);
            }
            if (intValue >= 41040) {
                bdhg bdhgVar = this.C;
                if (bdhgVar == null) {
                    contentValues.putNull("rcs_message_id_with_text_type");
                } else {
                    contentValues.put("rcs_message_id_with_text_type", bdhg.d(bdhgVar));
                }
            }
            if (intValue >= 29060) {
                contentValues.put("etouffee_status", Integer.valueOf(this.D));
            }
            if (intValue >= 29090) {
                byzi byziVar = this.E;
                if (byziVar == null) {
                    contentValues.putNull(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS);
                } else {
                    contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, Integer.valueOf(byziVar.ordinal()));
                }
            }
            if (intValue >= 39000) {
                contentValues.put("rcs_ui_status", Integer.valueOf(this.F));
            }
            if (intValue >= 30010) {
                contentValues.put("is_hidden", Boolean.valueOf(this.G));
            }
            if (intValue >= 10002) {
                dtub.u(contentValues, "rcs_remote_instance", this.H);
            }
            if (intValue >= 10004) {
                contentValues.put("rcs_file_transfer_session_id", Long.valueOf(this.I));
            }
            if (intValue >= 9000) {
                contentValues.put("sms_error_code", Integer.valueOf(this.J));
            }
            if (intValue >= 9000) {
                dtub.u(contentValues, "sms_error_desc_map_name", this.K);
            }
            if (intValue >= 9010) {
                dtub.u(contentValues, "correlation_id", this.L);
            }
            if (intValue >= 31010) {
                dtub.u(contentValues, "cms_id", this.M);
            }
            if (intValue >= 37040) {
                contentValues.put("cms_last_mod_seq", Long.valueOf(this.N));
            }
            if (intValue >= 19020) {
                dtub.u(contentValues, "web_id", this.O);
            }
            if (intValue >= 29100) {
                contentValues.put("usage_stats_logging_id", Long.valueOf(this.P));
            }
            if (intValue >= 35030) {
                contentValues.put("send_counter", Long.valueOf(this.Q));
            }
            if (intValue >= 35030) {
                bdhg bdhgVar2 = this.R;
                if (bdhgVar2 == null) {
                    contentValues.putNull("original_rcs_message_id");
                } else {
                    contentValues.put("original_rcs_message_id", bdhg.d(bdhgVar2));
                }
            }
            if (intValue >= 37020) {
                dtub.u(contentValues, "custom_delivery_receipt_mime_type", this.S);
            }
            if (intValue >= 37020) {
                contentValues.put("custom_delivery_receipt_content", this.T);
            }
            if (intValue >= 37030) {
                contentValues.put("report_attempt_acounter", Long.valueOf(this.U));
            }
            if (intValue >= 45020) {
                fayv fayvVar = this.V;
                if (fayvVar == null) {
                    contentValues.putNull("custom_headers");
                } else {
                    contentValues.put("custom_headers", fayvVar.toByteArray());
                }
            }
            if (intValue >= 46010) {
                dtub.u(contentValues, "cms_correlation_id", this.W);
            }
            if (intValue >= 48030) {
                dtub.u(contentValues, "group_private_participant", this.X);
            }
            if (intValue >= 48030) {
                MessageIdType messageIdType2 = this.Y;
                if (messageIdType2 == null || messageIdType2.equals(bdhb.a)) {
                    contentValues.putNull("original_message_id");
                } else {
                    contentValues.put("original_message_id", Long.valueOf(bdhb.a(this.Y)));
                }
            }
            if (intValue >= 49060) {
                contentValues.put("awaiting_reverse_sync", Boolean.valueOf(this.Z));
            }
            if (intValue >= 49060) {
                Uri uri2 = this.aa;
                if (uri2 == null) {
                    contentValues.putNull("old_sms_message_uri");
                } else {
                    contentValues.put("old_sms_message_uri", uri2.toString());
                }
            }
            if (intValue >= 56000) {
                Optional optional = this.ab;
                if (optional == null || optional.equals(bdhj.a)) {
                    contentValues.putNull("draft_id");
                } else {
                    contentValues.put("draft_id", bdhj.b(this.ab));
                }
            }
            if (intValue >= 58040) {
                contentValues.put("result_code", Integer.valueOf(this.ac));
            }
            if (intValue >= 58210) {
                csgg csggVar = this.ad;
                if (csggVar == null) {
                    contentValues.putNull("cms_life_cycle");
                } else {
                    contentValues.put("cms_life_cycle", Integer.valueOf(csggVar.ordinal()));
                }
            }
            if (intValue >= 60750) {
                cjco cjcoVar = this.ae;
                if (cjcoVar == null) {
                    contentValues.putNull("mute_priority");
                } else {
                    contentValues.put("mute_priority", Integer.valueOf(cjcoVar.ordinal()));
                }
            }
            if (intValue >= 58710) {
                byyw byywVar = this.af;
                if (byywVar == null) {
                    contentValues.putNull("fallback_reason");
                } else {
                    contentValues.put("fallback_reason", Integer.valueOf(byywVar.ordinal()));
                }
            }
            if (intValue >= 58230) {
                contentValues.put("auto_retry_counter", Integer.valueOf(this.ag));
            }
            if (intValue >= 58280) {
                contentValues.put("can_revoke_before_delivered_with_rcs", Boolean.valueOf(this.ah));
            }
            if (intValue >= 58680) {
                fjay fjayVar = this.ai;
                if (fjayVar == null) {
                    contentValues.putNull("trace_id");
                } else {
                    contentValues.put("trace_id", fjayVar.toByteArray());
                }
            }
            if (intValue >= 58720) {
                byzg byzgVar = this.aj;
                if (byzgVar == null) {
                    contentValues.putNull("outgoing_delivery_report_status");
                } else {
                    contentValues.put("outgoing_delivery_report_status", Integer.valueOf(byzgVar.ordinal()));
                }
            }
            if (intValue >= 58720) {
                byzg byzgVar2 = this.ak;
                if (byzgVar2 == null) {
                    contentValues.putNull("outgoing_read_report_status");
                } else {
                    contentValues.put("outgoing_read_report_status", Integer.valueOf(byzgVar2.ordinal()));
                }
            }
            if (intValue >= 59310) {
                byzl byzlVar = this.al;
                if (byzlVar == null) {
                    contentValues.putNull("xms_transport");
                } else {
                    contentValues.put("xms_transport", Integer.valueOf(byzlVar.ordinal()));
                }
            }
            if (intValue >= 59430) {
                contentValues.put("message_original_protocol", Integer.valueOf(this.am));
            }
            if (intValue >= 59490) {
                bdgr bdgrVar = this.an;
                if (bdgrVar == null || bdgrVar.equals(bdgr.a)) {
                    contentValues.putNull("satellite_datagram_id");
                } else {
                    contentValues.put("satellite_datagram_id", bdgr.d(this.an));
                }
            }
            if (intValue >= 60190) {
                cfmh cfmhVar = this.ao;
                if (cfmhVar == null) {
                    contentValues.putNull("encryption_protocol");
                } else {
                    contentValues.put("encryption_protocol", Long.valueOf(cfmg.a(cfmhVar)));
                }
            }
            if (intValue >= 60370) {
                Optional optional2 = this.ap;
                if (optional2 == null || optional2.equals(bdhj.a)) {
                    contentValues.putNull("message_persistence_id");
                } else {
                    contentValues.put("message_persistence_id", bdhj.b(this.ap));
                }
            }
        }

        @Override // defpackage.dtro
        protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
            buxf buxfVar = (buxf) ((buuo) dtsuVar);
            aB();
            this.cL = buxfVar.cU();
            if (buxfVar.di(0)) {
                this.a = buxfVar.q();
                super.fY(0);
            }
            if (buxfVar.di(1)) {
                this.b = buxfVar.p();
                super.fY(1);
            }
            if (buxfVar.di(2)) {
                this.c = buxfVar.ar();
                super.fY(2);
            }
            if (buxfVar.di(3)) {
                this.d = buxfVar.as();
                super.fY(3);
            }
            if (buxfVar.di(4)) {
                this.e = buxfVar.I();
                super.fY(4);
            }
            if (buxfVar.di(5)) {
                this.f = buxfVar.ap();
                super.fY(5);
            }
            if (buxfVar.di(6)) {
                this.g = buxfVar.m();
                super.fY(6);
            }
            if (buxfVar.di(7)) {
                this.h = buxfVar.ai();
                super.fY(7);
            }
            if (buxfVar.di(8)) {
                this.i = buxfVar.l();
                super.fY(8);
            }
            if (buxfVar.di(9)) {
                this.j = buxfVar.c();
                super.fY(9);
            }
            if (buxfVar.di(10)) {
                this.k = buxfVar.i();
                super.fY(10);
            }
            if (buxfVar.di(11)) {
                this.l = buxfVar.M();
                super.fY(11);
            }
            if (buxfVar.di(12)) {
                this.m = buxfVar.ax();
                super.fY(12);
            }
            if (buxfVar.di(13)) {
                this.n = buxfVar.ay();
                super.fY(13);
            }
            if (buxfVar.di(14)) {
                this.o = buxfVar.o();
                super.fY(14);
            }
            if (buxfVar.di(15)) {
                this.p = buxfVar.h();
                super.fY(15);
            }
            if (buxfVar.di(16)) {
                this.q = buxfVar.V();
                super.fY(16);
            }
            if (buxfVar.di(17)) {
                this.r = buxfVar.G();
                super.fY(17);
            }
            if (buxfVar.di(18)) {
                this.s = buxfVar.H();
                super.fY(18);
            }
            if (buxfVar.di(19)) {
                this.t = buxfVar.E();
                super.fY(19);
            }
            if (buxfVar.di(20)) {
                this.u = buxfVar.j();
                super.fY(20);
            }
            if (buxfVar.di(21)) {
                this.v = buxfVar.R();
                super.fY(21);
            }
            if (buxfVar.di(22)) {
                this.w = buxfVar.F();
                super.fY(22);
            }
            if (buxfVar.di(23)) {
                this.x = buxfVar.e();
                super.fY(23);
            }
            if (buxfVar.di(24)) {
                this.y = buxfVar.aq();
                super.fY(24);
            }
            if (buxfVar.di(25)) {
                this.z = buxfVar.X();
                super.fY(25);
            }
            if (buxfVar.di(26)) {
                this.A = buxfVar.T();
                super.fY(26);
            }
            if (buxfVar.di(27)) {
                this.B = buxfVar.C();
                super.fY(27);
            }
            if (buxfVar.di(28)) {
                this.C = buxfVar.r();
                super.fY(28);
            }
            if (buxfVar.di(29)) {
                this.D = buxfVar.O();
                super.fY(29);
            }
            if (buxfVar.di(30)) {
                this.E = buxfVar.ae();
                super.fY(30);
            }
            if (buxfVar.di(31)) {
                this.F = buxfVar.P();
                super.fY(31);
            }
            if (buxfVar.di(32)) {
                this.G = buxfVar.K();
                super.fY(32);
            }
            if (buxfVar.di(33)) {
                this.H = buxfVar.ao();
                super.fY(33);
            }
            if (buxfVar.di(34)) {
                this.I = buxfVar.k();
                super.fY(34);
            }
            if (buxfVar.di(35)) {
                this.J = buxfVar.g();
                super.fY(35);
            }
            if (buxfVar.di(36)) {
                this.K = buxfVar.at();
                super.fY(36);
            }
            if (buxfVar.di(37)) {
                this.L = buxfVar.al();
                super.fY(37);
            }
            if (buxfVar.di(38)) {
                this.M = buxfVar.D();
                super.fY(38);
            }
            if (buxfVar.di(39)) {
                this.N = buxfVar.Q();
                super.fY(39);
            }
            if (buxfVar.di(40)) {
                this.O = buxfVar.J();
                super.fY(40);
            }
            if (buxfVar.di(41)) {
                this.P = buxfVar.W();
                super.fY(41);
            }
            if (buxfVar.di(42)) {
                this.Q = buxfVar.U();
                super.fY(42);
            }
            if (buxfVar.di(43)) {
                this.R = buxfVar.aa();
                super.fY(43);
            }
            if (buxfVar.di(44)) {
                this.S = buxfVar.am();
                super.fY(44);
            }
            if (buxfVar.di(45)) {
                this.T = buxfVar.az();
                super.fY(45);
            }
            if (buxfVar.di(46)) {
                this.U = buxfVar.S();
                super.fY(46);
            }
            if (buxfVar.di(47)) {
                this.V = buxfVar.ah();
                super.fY(47);
            }
            if (buxfVar.di(48)) {
                this.W = buxfVar.ak();
                super.fY(48);
            }
            if (buxfVar.di(49)) {
                this.X = buxfVar.an();
                super.fY(49);
            }
            if (buxfVar.di(50)) {
                this.Y = buxfVar.Z();
                super.fY(50);
            }
            if (buxfVar.di(51)) {
                this.Z = buxfVar.av();
                super.fY(51);
            }
            if (buxfVar.di(52)) {
                this.aa = buxfVar.n();
                super.fY(52);
            }
            if (buxfVar.di(53)) {
                this.ab = buxfVar.aj();
                super.fY(53);
            }
            if (buxfVar.di(54)) {
                this.ac = buxfVar.f();
                super.fY(54);
            }
            if (buxfVar.di(55)) {
                this.ad = buxfVar.t();
                super.fY(55);
            }
            if (buxfVar.di(56)) {
                this.ae = buxfVar.ag();
                super.fY(56);
            }
            if (buxfVar.di(57)) {
                this.af = buxfVar.ab();
                super.fY(57);
            }
            if (buxfVar.di(58)) {
                this.ag = buxfVar.L();
                super.fY(58);
            }
            if (buxfVar.di(59)) {
                this.ah = buxfVar.aw();
                super.fY(59);
            }
            if (buxfVar.di(60)) {
                this.ai = buxfVar.au();
                super.fY(60);
            }
            if (buxfVar.di(61)) {
                this.aj = buxfVar.ac();
                super.fY(61);
            }
            if (buxfVar.di(62)) {
                this.ak = buxfVar.ad();
                super.fY(62);
            }
            if (buxfVar.di(63)) {
                this.al = buxfVar.s();
                super.fY(63);
            }
            if (buxfVar.di(64)) {
                this.am = buxfVar.N();
                super.fY(64);
            }
            if (buxfVar.di(65)) {
                this.an = buxfVar.Y();
                super.fY(65);
            }
            if (buxfVar.di(66)) {
                this.ao = buxfVar.af();
                super.fY(66);
            }
            if (buxfVar.di(67)) {
                this.ap = buxfVar.B();
                super.fY(67);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BindData)) {
                return false;
            }
            BindData bindData = (BindData) obj;
            return super.aD(bindData.cL) && Objects.equals(this.a, bindData.a) && Objects.equals(this.b, bindData.b) && Objects.equals(this.c, bindData.c) && Objects.equals(this.d, bindData.d) && Objects.equals(this.e, bindData.e) && Objects.equals(this.f, bindData.f) && this.g == bindData.g && Objects.equals(this.h, bindData.h) && this.i == bindData.i && this.j == bindData.j && this.k == bindData.k && this.l == bindData.l && this.m == bindData.m && this.n == bindData.n && Objects.equals(this.o, bindData.o) && this.p == bindData.p && this.q == bindData.q && Objects.equals(this.r, bindData.r) && Objects.equals(this.s, bindData.s) && Objects.equals(this.t, bindData.t) && this.u == bindData.u && this.v == bindData.v && Objects.equals(this.w, bindData.w) && this.x == bindData.x && Objects.equals(this.y, bindData.y) && Objects.equals(this.z, bindData.z) && this.A == bindData.A && Objects.equals(this.B, bindData.B) && Objects.equals(this.C, bindData.C) && this.D == bindData.D && this.E == bindData.E && this.F == bindData.F && this.G == bindData.G && Objects.equals(this.H, bindData.H) && this.I == bindData.I && this.J == bindData.J && Objects.equals(this.K, bindData.K) && Objects.equals(this.L, bindData.L) && Objects.equals(this.M, bindData.M) && this.N == bindData.N && Objects.equals(this.O, bindData.O) && this.P == bindData.P && this.Q == bindData.Q && Objects.equals(this.R, bindData.R) && Objects.equals(this.S, bindData.S) && Arrays.equals(this.T, bindData.T) && this.U == bindData.U && Objects.equals(this.V, bindData.V) && Objects.equals(this.W, bindData.W) && Objects.equals(this.X, bindData.X) && Objects.equals(this.Y, bindData.Y) && this.Z == bindData.Z && Objects.equals(this.aa, bindData.aa) && Objects.equals(this.ab, bindData.ab) && this.ac == bindData.ac && this.ad == bindData.ad && this.ae == bindData.ae && this.af == bindData.af && this.ag == bindData.ag && this.ah == bindData.ah && Objects.equals(this.ai, bindData.ai) && this.aj == bindData.aj && this.ak == bindData.ak && this.al == bindData.al && this.am == bindData.am && Objects.equals(this.an, bindData.an) && Objects.equals(this.ao, bindData.ao) && Objects.equals(this.ap, bindData.ap);
        }

        @Override // defpackage.dtrq
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "messages", dtub.m(new String[]{"conversation_id", "sender_id", "sender_send_destination", "msisdn_receiving_rcs_message", "receiving_network_country", "sent_timestamp", "queue_insert_timestamp", "received_timestamp", "message_protocol", "message_status", "message_report_status", "seen", "read", "sms_message_uri", "sms_priority", "sms_message_size", "mms_subject", "mms_transaction_id", "mms_content_location", "mms_expiry", "rcs_expiry", "mms_retrieve_text", "raw_status", "self_id", "my_identity_foreign_key", "retry_start_timestamp", "cloud_sync_id", "rcs_message_id_with_text_type", "etouffee_status", BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, "rcs_ui_status", "is_hidden", "rcs_remote_instance", "rcs_file_transfer_session_id", "sms_error_code", "sms_error_desc_map_name", "correlation_id", "cms_id", "cms_last_mod_seq", "web_id", "usage_stats_logging_id", "send_counter", "original_rcs_message_id", "custom_delivery_receipt_mime_type", "custom_delivery_receipt_content", "report_attempt_acounter", "custom_headers", "cms_correlation_id", "group_private_participant", "original_message_id", "awaiting_reverse_sync", "old_sms_message_uri", "draft_id", "result_code", "cms_life_cycle", "mute_priority", "fallback_reason", "auto_retry_counter", "can_revoke_before_delivered_with_rcs", "trace_id", "outgoing_delivery_report_status", "outgoing_read_report_status", "xms_transport", "message_original_protocol", "satellite_datagram_id", "encryption_protocol", "message_persistence_id"}));
        }

        @Override // defpackage.dtro
        protected final void fG(Parcel parcel) {
            fayv fayvVar;
            fjay fjayVar;
            this.a = new MessageIdType(parcel.readLong());
            this.b = new ConversationIdType(parcel.readLong());
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
            this.g = parcel.readLong();
            this.h = bdgw.b(parcel.readLong());
            this.i = parcel.readLong();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
            this.l = parcel.readInt();
            this.m = parcel.readInt() == 1;
            this.n = parcel.readInt() == 1;
            String readString = parcel.readString();
            this.o = readString == null ? null : Uri.parse(readString);
            this.p = parcel.readInt();
            this.q = parcel.readLong();
            this.r = parcel.readString();
            this.s = parcel.readString();
            this.t = parcel.readString();
            this.u = parcel.readLong();
            this.v = parcel.readLong();
            this.w = parcel.readString();
            this.x = parcel.readInt();
            this.y = parcel.readString();
            this.z = azsv.a(parcel.readString());
            this.A = parcel.readLong();
            this.B = parcel.readString();
            this.C = bdhg.a(parcel.readString());
            this.D = parcel.readInt();
            byzi[] values = byzi.values();
            int readInt = parcel.readInt();
            if (readInt >= 0) {
                if (readInt >= values.length) {
                    throw new IllegalArgumentException();
                }
                this.E = values[readInt];
            }
            this.F = parcel.readInt();
            this.G = parcel.readInt() == 1;
            this.H = parcel.readString();
            this.I = parcel.readLong();
            this.J = parcel.readInt();
            this.K = parcel.readString();
            this.L = parcel.readString();
            this.M = parcel.readString();
            this.N = parcel.readLong();
            this.O = parcel.readString();
            this.P = parcel.readLong();
            this.Q = parcel.readLong();
            this.R = bdhg.a(parcel.readString());
            this.S = parcel.readString();
            this.T = parcel.createByteArray();
            this.U = parcel.readLong();
            byte[] createByteArray = parcel.createByteArray();
            if (createByteArray == null) {
                fayvVar = null;
            } else {
                try {
                    fayvVar = (fayv) eyfy.parseFrom(fayv.a, createByteArray, eyfc.a());
                } catch (Throwable unused) {
                    this.V = null;
                }
            }
            this.V = fayvVar;
            this.W = parcel.readString();
            this.X = parcel.readString();
            this.Y = new MessageIdType(parcel.readLong());
            this.Z = parcel.readInt() == 1;
            String readString2 = parcel.readString();
            this.aa = readString2 == null ? null : Uri.parse(readString2);
            this.ab = bdhj.a(parcel.readString());
            this.ac = parcel.readInt();
            csgg[] values2 = csgg.values();
            int readInt2 = parcel.readInt();
            if (readInt2 >= 0) {
                if (readInt2 >= values2.length) {
                    throw new IllegalArgumentException();
                }
                this.ad = values2[readInt2];
            }
            cjco[] values3 = cjco.values();
            int readInt3 = parcel.readInt();
            if (readInt3 >= 0) {
                if (readInt3 >= values3.length) {
                    throw new IllegalArgumentException();
                }
                this.ae = values3[readInt3];
            }
            byyw[] values4 = byyw.values();
            int readInt4 = parcel.readInt();
            if (readInt4 >= 0) {
                if (readInt4 >= values4.length) {
                    throw new IllegalArgumentException();
                }
                this.af = values4[readInt4];
            }
            this.ag = parcel.readInt();
            this.ah = parcel.readInt() == 1;
            byte[] createByteArray2 = parcel.createByteArray();
            if (createByteArray2 == null) {
                fjayVar = null;
            } else {
                try {
                    fjayVar = (fjay) eyfy.parseFrom(fjay.a, createByteArray2, eyfc.a());
                } catch (Throwable unused2) {
                    this.ai = null;
                }
            }
            this.ai = fjayVar;
            byzg[] values5 = byzg.values();
            int readInt5 = parcel.readInt();
            if (readInt5 >= 0) {
                if (readInt5 >= values5.length) {
                    throw new IllegalArgumentException();
                }
                this.aj = values5[readInt5];
            }
            byzg[] values6 = byzg.values();
            int readInt6 = parcel.readInt();
            if (readInt6 >= 0) {
                if (readInt6 >= values6.length) {
                    throw new IllegalArgumentException();
                }
                this.ak = values6[readInt6];
            }
            byzl[] values7 = byzl.values();
            int readInt7 = parcel.readInt();
            if (readInt7 >= 0) {
                if (readInt7 >= values7.length) {
                    throw new IllegalArgumentException();
                }
                this.al = values7[readInt7];
            }
            this.am = parcel.readInt();
            this.an = new bdgr(parcel.readString());
            this.ao = new cfmh(parcel.readLong());
            this.ap = bdhj.a(parcel.readString());
        }

        @Override // defpackage.dtro
        protected final void fH(Parcel parcel) {
            parcel.writeLong(bdhb.a(this.a));
            parcel.writeLong(bdgq.a(this.b));
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeLong(this.g);
            parcel.writeLong(bdgw.a(this.h));
            parcel.writeLong(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            parcel.writeInt(this.m ? 1 : 0);
            parcel.writeInt(this.n ? 1 : 0);
            Uri uri = this.o;
            parcel.writeString(uri == null ? null : uri.toString());
            parcel.writeInt(this.p);
            parcel.writeLong(this.q);
            parcel.writeString(this.r);
            parcel.writeString(this.s);
            parcel.writeString(this.t);
            parcel.writeLong(this.u);
            parcel.writeLong(this.v);
            parcel.writeString(this.w);
            parcel.writeInt(this.x);
            parcel.writeString(this.y);
            parcel.writeString(azsv.b(this.z));
            parcel.writeLong(this.A);
            parcel.writeString(this.B);
            parcel.writeString(bdhg.d(this.C));
            parcel.writeInt(this.D);
            byzi byziVar = this.E;
            parcel.writeInt(byziVar == null ? -1 : byziVar.ordinal());
            parcel.writeInt(this.F);
            parcel.writeInt(this.G ? 1 : 0);
            parcel.writeString(this.H);
            parcel.writeLong(this.I);
            parcel.writeInt(this.J);
            parcel.writeString(this.K);
            parcel.writeString(this.L);
            parcel.writeString(this.M);
            parcel.writeLong(this.N);
            parcel.writeString(this.O);
            parcel.writeLong(this.P);
            parcel.writeLong(this.Q);
            parcel.writeString(bdhg.d(this.R));
            parcel.writeString(this.S);
            parcel.writeByteArray(this.T);
            parcel.writeLong(this.U);
            fayv fayvVar = this.V;
            parcel.writeByteArray(fayvVar == null ? null : fayvVar.toByteArray());
            parcel.writeString(this.W);
            parcel.writeString(this.X);
            parcel.writeLong(bdhb.a(this.Y));
            parcel.writeInt(this.Z ? 1 : 0);
            Uri uri2 = this.aa;
            parcel.writeString(uri2 == null ? null : uri2.toString());
            parcel.writeString(bdhj.b(this.ab));
            parcel.writeInt(this.ac);
            csgg csggVar = this.ad;
            parcel.writeInt(csggVar == null ? -1 : csggVar.ordinal());
            cjco cjcoVar = this.ae;
            parcel.writeInt(cjcoVar == null ? -1 : cjcoVar.ordinal());
            byyw byywVar = this.af;
            parcel.writeInt(byywVar == null ? -1 : byywVar.ordinal());
            parcel.writeInt(this.ag);
            parcel.writeInt(this.ah ? 1 : 0);
            fjay fjayVar = this.ai;
            parcel.writeByteArray(fjayVar != null ? fjayVar.toByteArray() : null);
            byzg byzgVar = this.aj;
            parcel.writeInt(byzgVar == null ? -1 : byzgVar.ordinal());
            byzg byzgVar2 = this.ak;
            parcel.writeInt(byzgVar2 == null ? -1 : byzgVar2.ordinal());
            byzl byzlVar = this.al;
            parcel.writeInt(byzlVar != null ? byzlVar.ordinal() : -1);
            parcel.writeInt(this.am);
            parcel.writeString(bdgr.d(this.an));
            cfmh cfmhVar = this.ao;
            cfmh cfmhVar2 = cfmh.a;
            parcel.writeLong(cfmg.a(cfmhVar));
            parcel.writeString(bdhj.b(this.ap));
        }

        @Override // defpackage.dtro
        public final void fY(int i) {
            super.fY(0);
        }

        @Override // defpackage.dtrq
        public final String g() {
            return "_id";
        }

        @Override // defpackage.dtrq
        public final String h() {
            return "messages";
        }

        public final int hashCode() {
            dtsq dtsqVar = this.cL;
            dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
            MessageIdType messageIdType = this.a;
            ConversationIdType conversationIdType = this.b;
            String str = this.c;
            String str2 = this.d;
            String str3 = this.e;
            String str4 = this.f;
            Long valueOf = Long.valueOf(this.g);
            Instant instant = this.h;
            Long valueOf2 = Long.valueOf(this.i);
            Integer valueOf3 = Integer.valueOf(this.j);
            Integer valueOf4 = Integer.valueOf(this.k);
            Integer valueOf5 = Integer.valueOf(this.l);
            Boolean valueOf6 = Boolean.valueOf(this.m);
            Boolean valueOf7 = Boolean.valueOf(this.n);
            dtsq dtsqVar3 = dtsqVar2;
            Uri uri = this.o;
            Integer valueOf8 = Integer.valueOf(this.p);
            Long valueOf9 = Long.valueOf(this.q);
            String str5 = this.r;
            String str6 = this.s;
            String str7 = this.t;
            Long valueOf10 = Long.valueOf(this.u);
            Long valueOf11 = Long.valueOf(this.v);
            String str8 = this.w;
            Integer valueOf12 = Integer.valueOf(this.x);
            String str9 = this.y;
            azsu azsuVar = this.z;
            Long valueOf13 = Long.valueOf(this.A);
            String str10 = this.B;
            bdhg bdhgVar = this.C;
            Integer valueOf14 = Integer.valueOf(this.D);
            byzi byziVar = this.E;
            Integer valueOf15 = Integer.valueOf(byziVar == null ? 0 : byziVar.ordinal());
            Integer valueOf16 = Integer.valueOf(this.F);
            Boolean valueOf17 = Boolean.valueOf(this.G);
            String str11 = this.H;
            Long valueOf18 = Long.valueOf(this.I);
            Integer valueOf19 = Integer.valueOf(this.J);
            String str12 = this.K;
            String str13 = this.L;
            String str14 = this.M;
            Long valueOf20 = Long.valueOf(this.N);
            String str15 = this.O;
            Long valueOf21 = Long.valueOf(this.P);
            Long valueOf22 = Long.valueOf(this.Q);
            bdhg bdhgVar2 = this.R;
            String str16 = this.S;
            Integer valueOf23 = Integer.valueOf(Arrays.hashCode(this.T));
            Long valueOf24 = Long.valueOf(this.U);
            fayv fayvVar = this.V;
            String str17 = this.W;
            String str18 = this.X;
            MessageIdType messageIdType2 = this.Y;
            Boolean valueOf25 = Boolean.valueOf(this.Z);
            Uri uri2 = this.aa;
            Optional optional = this.ab;
            Integer valueOf26 = Integer.valueOf(this.ac);
            csgg csggVar = this.ad;
            Integer valueOf27 = Integer.valueOf(csggVar == null ? 0 : csggVar.ordinal());
            cjco cjcoVar = this.ae;
            Integer valueOf28 = Integer.valueOf(cjcoVar == null ? 0 : cjcoVar.ordinal());
            byyw byywVar = this.af;
            Integer valueOf29 = Integer.valueOf(byywVar == null ? 0 : byywVar.ordinal());
            Integer valueOf30 = Integer.valueOf(this.ag);
            Boolean valueOf31 = Boolean.valueOf(this.ah);
            fjay fjayVar = this.ai;
            byzg byzgVar = this.aj;
            Integer valueOf32 = Integer.valueOf(byzgVar == null ? 0 : byzgVar.ordinal());
            byzg byzgVar2 = this.ak;
            Integer valueOf33 = Integer.valueOf(byzgVar2 == null ? 0 : byzgVar2.ordinal());
            byzl byzlVar = this.al;
            return Objects.hash(dtsqVar3, messageIdType, conversationIdType, str, str2, str3, str4, valueOf, instant, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, uri, valueOf8, valueOf9, str5, str6, str7, valueOf10, valueOf11, str8, valueOf12, str9, azsuVar, valueOf13, str10, bdhgVar, valueOf14, valueOf15, valueOf16, valueOf17, str11, valueOf18, valueOf19, str12, str13, str14, valueOf20, str15, valueOf21, valueOf22, bdhgVar2, str16, valueOf23, valueOf24, fayvVar, str17, str18, messageIdType2, valueOf25, uri2, optional, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, fjayVar, valueOf32, valueOf33, Integer.valueOf(byzlVar == null ? 0 : byzlVar.ordinal()), Integer.valueOf(this.am), this.an, this.ao, this.ap, null);
        }

        @Override // defpackage.dtrq
        public final void i(StringBuilder sb, List list) {
            Object obj = new buop(this).get();
            String str = this.c;
            String str2 = this.d;
            String str3 = this.e;
            String str4 = this.f;
            Long valueOf = Long.valueOf(this.g);
            Long valueOf2 = Long.valueOf(bdgw.a(this.h));
            Long valueOf3 = Long.valueOf(this.i);
            Integer valueOf4 = Integer.valueOf(this.j);
            Integer valueOf5 = Integer.valueOf(this.k);
            Integer valueOf6 = Integer.valueOf(this.l);
            Integer valueOf7 = Integer.valueOf(this.m ? 1 : 0);
            Integer valueOf8 = Integer.valueOf(this.n ? 1 : 0);
            Uri uri = this.o;
            String uri2 = uri == null ? null : uri.toString();
            Integer valueOf9 = Integer.valueOf(this.p);
            Long valueOf10 = Long.valueOf(this.q);
            String str5 = this.r;
            String str6 = this.s;
            String str7 = this.t;
            Long valueOf11 = Long.valueOf(this.u);
            Long valueOf12 = Long.valueOf(this.v);
            String str8 = this.w;
            Integer valueOf13 = Integer.valueOf(this.x);
            String str9 = this.y;
            Object obj2 = new buoq(this).get();
            Long valueOf14 = Long.valueOf(this.A);
            String str10 = this.B;
            String d = bdhg.d(this.C);
            Integer valueOf15 = Integer.valueOf(this.D);
            byzi byziVar = this.E;
            Object valueOf16 = byziVar == null ? 0 : String.valueOf(byziVar.ordinal());
            Integer valueOf17 = Integer.valueOf(this.F);
            Integer valueOf18 = Integer.valueOf(this.G ? 1 : 0);
            String str11 = this.H;
            Long valueOf19 = Long.valueOf(this.I);
            Integer valueOf20 = Integer.valueOf(this.J);
            String str12 = this.K;
            String str13 = this.L;
            String str14 = this.M;
            Long valueOf21 = Long.valueOf(this.N);
            String str15 = this.O;
            Long valueOf22 = Long.valueOf(this.P);
            Long valueOf23 = Long.valueOf(this.Q);
            String d2 = bdhg.d(this.R);
            String str16 = this.S;
            byte[] bArr = this.T;
            Long valueOf24 = Long.valueOf(this.U);
            fayv fayvVar = this.V;
            byte[] byteArray = fayvVar == null ? null : fayvVar.toByteArray();
            String str17 = this.W;
            String str18 = this.X;
            Object obj3 = new buor(this).get();
            Integer valueOf25 = Integer.valueOf(this.Z ? 1 : 0);
            Uri uri3 = this.aa;
            String uri4 = uri3 == null ? null : uri3.toString();
            Object obj4 = new buos(this).get();
            Integer valueOf26 = Integer.valueOf(this.ac);
            csgg csggVar = this.ad;
            Object valueOf27 = csggVar == null ? 0 : String.valueOf(csggVar.ordinal());
            cjco cjcoVar = this.ae;
            Object valueOf28 = cjcoVar == null ? 0 : String.valueOf(cjcoVar.ordinal());
            byyw byywVar = this.af;
            Object valueOf29 = byywVar == null ? 0 : String.valueOf(byywVar.ordinal());
            Integer valueOf30 = Integer.valueOf(this.ag);
            Integer valueOf31 = Integer.valueOf(this.ah ? 1 : 0);
            fjay fjayVar = this.ai;
            byte[] byteArray2 = fjayVar != null ? fjayVar.toByteArray() : null;
            byzg byzgVar = this.aj;
            Object valueOf32 = byzgVar == null ? 0 : String.valueOf(byzgVar.ordinal());
            byzg byzgVar2 = this.ak;
            Object valueOf33 = byzgVar2 == null ? 0 : String.valueOf(byzgVar2.ordinal());
            byzl byzlVar = this.al;
            Object valueOf34 = byzlVar == null ? 0 : String.valueOf(byzlVar.ordinal());
            Integer valueOf35 = Integer.valueOf(this.am);
            Object obj5 = new buot(this).get();
            cfmh cfmhVar = this.ao;
            cfmh cfmhVar2 = cfmh.a;
            Object[] objArr = {obj, str, str2, str3, str4, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, uri2, valueOf9, valueOf10, str5, str6, str7, valueOf11, valueOf12, str8, valueOf13, str9, obj2, valueOf14, str10, d, valueOf15, valueOf16, valueOf17, valueOf18, str11, valueOf19, valueOf20, str12, str13, str14, valueOf21, str15, valueOf22, valueOf23, d2, str16, bArr, valueOf24, byteArray, str17, str18, obj3, valueOf25, uri4, obj4, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, byteArray2, valueOf32, valueOf33, valueOf34, valueOf35, obj5, Long.valueOf(cfmg.a(cfmhVar)), new buou(this).get()};
            sb.append('(');
            for (int i = 0; i < 67; i++) {
                Object obj6 = objArr[i];
                if (obj6 instanceof Number) {
                    sb.append(String.valueOf(obj6));
                } else {
                    if (obj6 instanceof String) {
                        String str19 = (String) obj6;
                        if (str19.length() < 12) {
                            sb.append(DatabaseUtils.sqlEscapeString(str19));
                        }
                    }
                    list.add(obj6);
                    sb.append('?');
                    sb.append(',');
                }
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
            sb.append(')');
        }

        @Override // defpackage.dtrq
        @Deprecated
        public final /* bridge */ /* synthetic */ Object j() {
            throw null;
        }

        public final int k() {
            az(11, "message_report_status");
            return this.l;
        }

        public final int l() {
            az(9, "message_protocol");
            return this.j;
        }

        public final int m() {
            az(23, "raw_status");
            return this.x;
        }

        public final int n() {
            az(29, "etouffee_status");
            return this.D;
        }

        public final int o() {
            az(54, "result_code");
            return this.ac;
        }

        public final int q() {
            az(35, "sms_error_code");
            return this.J;
        }

        public final int r() {
            az(15, "sms_priority");
            return this.p;
        }

        public final int s() {
            az(10, "message_status");
            return this.k;
        }

        public final long t() {
            az(39, "cms_last_mod_seq");
            return this.N;
        }

        public final String toString() {
            return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessagesTable -- REDACTED") : a();
        }

        public final long u() {
            az(20, "mms_expiry");
            return this.u;
        }

        public final long v() {
            az(34, "rcs_file_transfer_session_id");
            return this.I;
        }

        public final long w() {
            az(8, "received_timestamp");
            return this.i;
        }

        public final long x() {
            az(26, "retry_start_timestamp");
            return this.A;
        }

        public final long y() {
            az(6, "sent_timestamp");
            return this.g;
        }

        public final long z() {
            az(16, "sms_message_size");
            return this.q;
        }

        protected BindData(Parcel parcel) {
            byzg byzgVar = byzg.UNKNOWN;
            this.aj = byzgVar;
            this.ak = byzgVar;
            this.al = byzl.UNKNOWN;
            this.am = -1;
            this.an = bdgr.a;
            this.ao = new cfmh(0L);
            this.ap = bdhf.a();
            aA(parcel);
        }
    }
}
