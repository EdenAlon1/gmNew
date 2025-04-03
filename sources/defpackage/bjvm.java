package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bjvm extends dtro {
    public String A;
    public String B;
    public long C;
    public String D;
    public boolean E;
    public long F;
    public byte[] G;
    public byte[] H;
    public long I;
    public byzh J;
    public boolean K;
    private String N;
    private String O;
    private String P;
    private String Q;
    private Uri Z;
    public String a;
    private String aD;
    private byte[] aE;
    private fayv aG;
    private String aH;
    private String aI;
    private Uri aL;
    private fjay aT;
    private byzg aU;
    private byzg aV;
    private byzl aW;
    private int aX;
    private bdgr aY;
    private cfmh aZ;
    private String ac;
    private String ad;
    private String ae;
    private String ah;
    private String aj;
    private String am;
    private String as;
    private String av;
    private String aw;
    private String ax;
    private long ay;
    public MessageIdType b;
    private Optional ba;
    private Uri bb;
    private byyu bc;
    private int bd;
    private String be;
    private byte[] bf;
    private byte[] bg;
    private String bh;
    private boolean bi;
    private boolean bj;
    private String bk;
    private byza bl;
    private dteh bm;
    private byzo bn;
    private awap bo;
    private byyz bp;
    public String c;
    public Uri d;
    public String e;
    public Uri f;
    public int g;
    public int h;
    public long i;
    public Uri j;
    public long k;
    public byzc l;
    public ConversationIdType m;
    public byyp n;
    public byyp o;
    public long p;
    public double q;
    public double r;
    public Uri s;
    public String t;
    public Uri u;
    public int v;
    public String w;
    public String x;
    public boolean y;
    public long z;
    private MessageIdType L = bdhb.a;
    private ConversationIdType M = bdgq.a;
    private long R = 0;
    private Instant S = bdgw.b(0);
    private long T = 0;
    private int U = 0;
    private int V = 0;
    private int W = 0;
    private boolean X = false;
    private boolean Y = false;
    private int aa = 0;
    private long ab = 0;
    private long af = 0;
    private long ag = 0;
    private int ai = 0;
    private azsu ak = null;
    private long al = 0;
    private bdhg an = bdhg.a;
    private int ao = 0;
    private byzi ap = byzi.VERIFICATION_NA;
    private int aq = 0;
    private boolean ar = false;
    private long at = -1;
    private int au = -1;
    private String az = "";
    private long aA = 0;
    private long aB = 1;
    private bdhg aC = bdhg.a;
    private long aF = 0;
    private MessageIdType aJ = bdhb.a;
    private boolean aK = false;
    private Optional aM = bdhj.a;
    private int aN = -2;
    private csgg aO = csgg.UNKNOWN;
    private cjco aP = cjco.c;
    private byyw aQ = byyw.UNKNOWN;
    private int aR = 0;
    private boolean aS = false;

    protected bjvm() {
        byzg byzgVar = byzg.UNKNOWN;
        this.aU = byzgVar;
        this.aV = byzgVar;
        this.aW = byzl.UNKNOWN;
        this.aX = -1;
        this.aY = bdgr.a;
        this.aZ = new cfmh(0L);
        this.ba = bdhf.a();
        this.b = bdhb.a;
        this.g = -1;
        this.h = -1;
        this.k = 0L;
        this.l = byzc.SUCCEEDED;
        this.bc = byyu.NOT_FROM_CMS;
        this.m = bdgq.a;
        this.n = new byyp(-1);
        this.o = new byyp(-1);
        this.p = -1L;
        this.q = eobe.a;
        this.r = eobe.a;
        this.v = 13;
        this.bd = 0;
        this.y = false;
        this.z = 0L;
        this.E = false;
        this.F = 0L;
        this.bj = false;
        this.bl = byza.STANDARD;
        this.bn = byzo.UNKNOWN;
        this.bo = null;
        this.J = byzh.NONE;
        this.bp = byyz.DEFAULT_NO_VERDICT;
        this.K = false;
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.L);
        String valueOf2 = String.valueOf(this.M);
        String valueOf3 = String.valueOf(this.N);
        String valueOf4 = String.valueOf(this.O);
        String valueOf5 = String.valueOf(this.P);
        String valueOf6 = String.valueOf(this.Q);
        String valueOf7 = String.valueOf(this.R);
        String valueOf8 = String.valueOf(this.S);
        String valueOf9 = String.valueOf(this.T);
        String valueOf10 = String.valueOf(this.U);
        String valueOf11 = String.valueOf(this.V);
        String valueOf12 = String.valueOf(this.W);
        String valueOf13 = String.valueOf(this.X);
        String valueOf14 = String.valueOf(this.Y);
        String valueOf15 = String.valueOf(this.Z);
        String valueOf16 = String.valueOf(this.aa);
        String valueOf17 = String.valueOf(this.ab);
        String valueOf18 = String.valueOf(this.ac);
        String valueOf19 = String.valueOf(this.ad);
        String valueOf20 = String.valueOf(this.ae);
        String valueOf21 = String.valueOf(this.af);
        String valueOf22 = String.valueOf(this.ag);
        String valueOf23 = String.valueOf(this.ah);
        String valueOf24 = String.valueOf(this.ai);
        String valueOf25 = String.valueOf(this.aj);
        String valueOf26 = String.valueOf(this.ak);
        String valueOf27 = String.valueOf(this.al);
        String valueOf28 = String.valueOf(this.am);
        String valueOf29 = String.valueOf(this.an);
        String valueOf30 = String.valueOf(this.ao);
        String valueOf31 = String.valueOf(this.ap);
        String valueOf32 = String.valueOf(this.aq);
        String valueOf33 = String.valueOf(this.ar);
        String valueOf34 = String.valueOf(this.as);
        String valueOf35 = String.valueOf(this.at);
        String valueOf36 = String.valueOf(this.au);
        String valueOf37 = String.valueOf(this.av);
        String valueOf38 = String.valueOf(this.aw);
        String valueOf39 = String.valueOf(this.ax);
        String valueOf40 = String.valueOf(this.ay);
        String valueOf41 = String.valueOf(this.az);
        String valueOf42 = String.valueOf(this.aA);
        String valueOf43 = String.valueOf(this.aB);
        String valueOf44 = String.valueOf(this.aC);
        String valueOf45 = String.valueOf(this.aD);
        byte[] bArr = this.aE;
        String concat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
        String valueOf46 = String.valueOf(this.aF);
        String valueOf47 = String.valueOf(this.aG);
        String valueOf48 = String.valueOf(this.aH);
        String valueOf49 = String.valueOf(this.aI);
        String valueOf50 = String.valueOf(this.aJ);
        String valueOf51 = String.valueOf(this.aK);
        String valueOf52 = String.valueOf(this.aL);
        String valueOf53 = String.valueOf(this.aM);
        String valueOf54 = String.valueOf(this.aN);
        String valueOf55 = String.valueOf(this.aO);
        String valueOf56 = String.valueOf(this.aP);
        String valueOf57 = String.valueOf(this.aQ);
        String valueOf58 = String.valueOf(this.aR);
        String valueOf59 = String.valueOf(this.aS);
        String valueOf60 = String.valueOf(this.aT);
        String valueOf61 = String.valueOf(this.aU);
        String valueOf62 = String.valueOf(this.aV);
        String valueOf63 = String.valueOf(this.aW);
        String valueOf64 = String.valueOf(this.aX);
        String valueOf65 = String.valueOf(this.aY);
        String valueOf66 = String.valueOf(this.aZ);
        String valueOf67 = String.valueOf(this.ba);
        String valueOf68 = String.valueOf(this.a);
        String valueOf69 = String.valueOf(this.b);
        String valueOf70 = String.valueOf(this.c);
        String valueOf71 = String.valueOf(this.d);
        String valueOf72 = String.valueOf(this.e);
        String valueOf73 = String.valueOf(this.f);
        String valueOf74 = String.valueOf(this.bb);
        String valueOf75 = String.valueOf(this.g);
        String valueOf76 = String.valueOf(this.h);
        String valueOf77 = String.valueOf(this.i);
        String valueOf78 = String.valueOf(this.j);
        String valueOf79 = String.valueOf(this.k);
        String valueOf80 = String.valueOf(this.l);
        String valueOf81 = String.valueOf(this.bc);
        String valueOf82 = String.valueOf(this.m);
        String valueOf83 = String.valueOf(this.n);
        String valueOf84 = String.valueOf(this.o);
        String valueOf85 = String.valueOf(this.p);
        String valueOf86 = String.valueOf(this.q);
        String valueOf87 = String.valueOf(this.r);
        String valueOf88 = String.valueOf(this.s);
        String valueOf89 = String.valueOf(this.t);
        String valueOf90 = String.valueOf(this.u);
        String valueOf91 = String.valueOf(this.v);
        String valueOf92 = String.valueOf(this.bd);
        String valueOf93 = String.valueOf(this.w);
        String valueOf94 = String.valueOf(this.be);
        byte[] bArr2 = this.bf;
        String concat2 = "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL"));
        byte[] bArr3 = this.bg;
        String concat3 = "BLOB".concat(String.valueOf(bArr3 != null ? String.valueOf(bArr3.length) : "NULL"));
        String valueOf95 = String.valueOf(this.y);
        String valueOf96 = String.valueOf(this.z);
        String valueOf97 = String.valueOf(this.A);
        String valueOf98 = String.valueOf(this.B);
        String valueOf99 = String.valueOf(this.C);
        String valueOf100 = String.valueOf(this.D);
        String valueOf101 = String.valueOf(this.bh);
        String valueOf102 = String.valueOf(this.E);
        String valueOf103 = String.valueOf(this.F);
        byte[] bArr4 = this.G;
        String concat4 = "BLOB".concat(String.valueOf(bArr4 != null ? String.valueOf(bArr4.length) : "NULL"));
        byte[] bArr5 = this.H;
        return String.format(locale, "DraftsView [messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_sender_id: %s,\n  messages.messages_sender_send_destination: %s,\n  messages.messages_msisdn_receiving_rcs_message: %s,\n  messages.messages_receiving_network_country: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_queue_insert_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_message_report_status: %s,\n  messages.messages_seen: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_message_uri: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_sms_message_size: %s,\n  messages.messages_mms_subject: %s,\n  messages.messages_mms_transaction_id: %s,\n  messages.messages_mms_content_location: %s,\n  messages.messages_mms_expiry: %s,\n  messages.messages_rcs_expiry: %s,\n  messages.messages_mms_retrieve_text: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_self_id: %s,\n  messages.messages_my_identity_foreign_key: %s,\n  messages.messages_retry_start_timestamp: %s,\n  messages.messages_cloud_sync_id: %s,\n  messages.messages_rcs_message_id_with_text_type: %s,\n  messages.messages_etouffee_status: %s,\n  messages.messages_verification_status: %s,\n  messages.messages_rcs_ui_status: %s,\n  messages.messages_is_hidden: %s,\n  messages.messages_rcs_remote_instance: %s,\n  messages.messages_rcs_file_transfer_session_id: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  messages.messages_correlation_id: %s,\n  messages.messages_cms_id: %s,\n  messages.messages_cms_last_mod_seq: %s,\n  messages.messages_web_id: %s,\n  messages.messages_usage_stats_logging_id: %s,\n  messages.messages_send_counter: %s,\n  messages.messages_original_rcs_message_id: %s,\n  messages.messages_custom_delivery_receipt_mime_type: %s,\n  messages.messages_custom_delivery_receipt_content: %s,\n  messages.messages_report_attempt_acounter: %s,\n  messages.messages_custom_headers: %s,\n  messages.messages_cms_correlation_id: %s,\n  messages.messages_group_private_participant: %s,\n  messages.messages_original_message_id: %s,\n  messages.messages_awaiting_reverse_sync: %s,\n  messages.messages_old_sms_message_uri: %s,\n  messages.messages_draft_id: %s,\n  messages.messages_result_code: %s,\n  messages.messages_cms_life_cycle: %s,\n  messages.messages_mute_priority: %s,\n  messages.messages_fallback_reason: %s,\n  messages.messages_auto_retry_counter: %s,\n  messages.messages_can_revoke_before_delivered_with_rcs: %s,\n  messages.messages_trace_id: %s,\n  messages.messages_outgoing_delivery_report_status: %s,\n  messages.messages_outgoing_read_report_status: %s,\n  messages.messages_xms_transport: %s,\n  messages.messages_message_original_protocol: %s,\n  messages.messages_satellite_datagram_id: %s,\n  messages.messages_encryption_protocol: %s,\n  messages.messages_message_persistence_id: %s,\n  parts.parts__id: %s,\n  parts.parts_message_id: %s,\n  parts.parts_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_original_uri: %s,\n  parts.parts_storage_uri: %s,\n  parts.parts_width: %s,\n  parts.parts_height: %s,\n  parts.parts_timestamp: %s,\n  parts.parts_output_uri: %s,\n  parts.parts_target_size: %s,\n  parts.parts_processing_status: %s,\n  parts.parts_cms_attachment_processing_status: %s,\n  parts.parts_conversation_id: %s,\n  parts.parts_sticker_set_id: %s,\n  parts.parts_sticker_id: %s,\n  parts.parts_media_modified_timestamp: %s,\n  parts.parts_longitude: %s,\n  parts.parts_latitude: %s,\n  parts.parts_preview_content_uri: %s,\n  parts.parts_preview_content_type: %s,\n  parts.parts_fallback_uri: %s,\n  parts.parts_source: %s,\n  parts.parts_bundle_index: %s,\n  parts.parts_blob_id: %s,\n  parts.parts_blob_gaia_email: %s,\n  parts.parts_cms_full_size_blob_id: %s,\n  parts.parts_cms_media_encryption_key: %s,\n  parts.parts_cms_compressed_media_encryption_key: %s,\n  parts.parts_blob_upload_permanent_failure: %s,\n  parts.parts_blob_upload_timestamp: %s,\n  parts.parts_expressive_sticker_name: %s,\n  parts.parts_file_name: %s,\n  parts.parts_duration: %s,\n  parts.parts_compressed_blob_id: %s,\n  parts.parts_cms_compressed_blob_id: %s,\n  parts.parts_compressed_blob_upload_permanent_failure: %s,\n  parts.parts_compressed_blob_upload_timestamp: %s,\n  parts.parts_media_encryption_key: %s,\n  parts.parts_compressed_media_encryption_key: %s,\n  parts.parts_missing_entry_in_telephony: %s,\n  parts.parts_awaiting_reverse_sync: %s,\n  parts.parts_file_size_bytes: %s,\n  parts.parts_local_cache_path: %s,\n  parts.parts_media_send_type: %s,\n  parts.parts_voice_metadata: %s,\n  parts.parts_validation_status: %s,\n  parts.parts_processing_id: %s,\n  parts.parts_rich_card_media_download_failure_reason: %s,\n  parts.parts_image_display_state: %s,\n  parts.parts_preserve_size: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, concat, valueOf46, valueOf47, valueOf48, valueOf49, valueOf50, valueOf51, valueOf52, valueOf53, valueOf54, valueOf55, valueOf56, valueOf57, valueOf58, valueOf59, valueOf60, valueOf61, valueOf62, valueOf63, valueOf64, valueOf65, valueOf66, valueOf67, valueOf68, valueOf69, valueOf70, valueOf71, valueOf72, valueOf73, valueOf74, valueOf75, valueOf76, valueOf77, valueOf78, valueOf79, valueOf80, valueOf81, valueOf82, valueOf83, valueOf84, valueOf85, valueOf86, valueOf87, valueOf88, valueOf89, valueOf90, valueOf91, valueOf92, valueOf93, "REDACTED", valueOf94, concat2, concat3, valueOf95, valueOf96, valueOf97, valueOf98, valueOf99, valueOf100, valueOf101, valueOf102, valueOf103, concat4, "BLOB".concat(String.valueOf(bArr5 != null ? String.valueOf(bArr5.length) : "NULL")), String.valueOf(this.bi), String.valueOf(this.bj), String.valueOf(this.I), String.valueOf(this.bk), String.valueOf(this.bl), String.valueOf(this.bm), String.valueOf(this.bn), String.valueOf(this.bo), String.valueOf(this.J), String.valueOf(this.bp), String.valueOf(this.K));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        bkfh.c().intValue();
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        fjay fjayVar;
        fayv fayvVar;
        bkfc bkfcVar = (bkfc) dtsuVar;
        aB();
        this.cL = bkfcVar.cU();
        if (bkfcVar.di(0)) {
            this.L = new MessageIdType(bkfcVar.getLong(bkfcVar.cM(0, bkfh.a)));
            fY(0);
        }
        if (bkfcVar.di(1)) {
            this.M = new ConversationIdType(bkfcVar.getLong(bkfcVar.cM(1, bkfh.a)));
            fY(1);
        }
        if (bkfcVar.di(2)) {
            this.N = bkfcVar.getString(bkfcVar.cM(2, bkfh.a));
            fY(2);
        }
        if (bkfcVar.di(3)) {
            this.O = bkfcVar.getString(bkfcVar.cM(3, bkfh.a));
            fY(3);
        }
        if (bkfcVar.di(4)) {
            this.P = bkfcVar.getString(bkfcVar.cM(4, bkfh.a));
            fY(4);
        }
        if (bkfcVar.di(5)) {
            this.Q = bkfcVar.getString(bkfcVar.cM(5, bkfh.a));
            fY(5);
        }
        if (bkfcVar.di(6)) {
            this.R = bkfcVar.getLong(bkfcVar.cM(6, bkfh.a));
            fY(6);
        }
        if (bkfcVar.di(7)) {
            this.S = bdgw.b(bkfcVar.getLong(bkfcVar.cM(7, bkfh.a)));
            fY(7);
        }
        if (bkfcVar.di(8)) {
            this.T = bkfcVar.getLong(bkfcVar.cM(8, bkfh.a));
            fY(8);
        }
        if (bkfcVar.di(9)) {
            this.U = bkfcVar.getInt(bkfcVar.cM(9, bkfh.a));
            fY(9);
        }
        if (bkfcVar.di(10)) {
            this.V = bkfcVar.getInt(bkfcVar.cM(10, bkfh.a));
            fY(10);
        }
        if (bkfcVar.di(11)) {
            this.W = bkfcVar.getInt(bkfcVar.cM(11, bkfh.a));
            fY(11);
        }
        if (bkfcVar.di(12)) {
            this.X = bkfcVar.getInt(bkfcVar.cM(12, bkfh.a)) == 1;
            fY(12);
        }
        if (bkfcVar.di(13)) {
            this.Y = bkfcVar.getInt(bkfcVar.cM(13, bkfh.a)) == 1;
            fY(13);
        }
        dteh dtehVar = null;
        if (bkfcVar.di(14)) {
            String string = bkfcVar.getString(bkfcVar.cM(14, bkfh.a));
            this.Z = string == null ? null : Uri.parse(string);
            fY(14);
        }
        if (bkfcVar.di(15)) {
            this.aa = bkfcVar.getInt(bkfcVar.cM(15, bkfh.a));
            fY(15);
        }
        if (bkfcVar.di(16)) {
            this.ab = bkfcVar.getLong(bkfcVar.cM(16, bkfh.a));
            fY(16);
        }
        if (bkfcVar.di(17)) {
            this.ac = cuxs.a(bkfcVar.getString(bkfcVar.cM(17, bkfh.a)));
            fY(17);
        }
        if (bkfcVar.di(18)) {
            this.ad = bkfcVar.getString(bkfcVar.cM(18, bkfh.a));
            fY(18);
        }
        if (bkfcVar.di(19)) {
            this.ae = bkfcVar.getString(bkfcVar.cM(19, bkfh.a));
            fY(19);
        }
        if (bkfcVar.di(20)) {
            this.af = bkfcVar.getLong(bkfcVar.cM(20, bkfh.a));
            fY(20);
        }
        if (bkfcVar.di(21)) {
            this.ag = bkfcVar.getLong(bkfcVar.cM(21, bkfh.a));
            fY(21);
        }
        if (bkfcVar.di(22)) {
            this.ah = bkfcVar.getString(bkfcVar.cM(22, bkfh.a));
            fY(22);
        }
        if (bkfcVar.di(23)) {
            this.ai = bkfcVar.getInt(bkfcVar.cM(23, bkfh.a));
            fY(23);
        }
        if (bkfcVar.di(24)) {
            this.aj = bkfcVar.getString(bkfcVar.cM(24, bkfh.a));
            fY(24);
        }
        if (bkfcVar.di(25)) {
            this.ak = azsv.a(bkfcVar.getString(bkfcVar.cM(25, bkfh.a)));
            fY(25);
        }
        if (bkfcVar.di(26)) {
            this.al = bkfcVar.getLong(bkfcVar.cM(26, bkfh.a));
            fY(26);
        }
        if (bkfcVar.di(27)) {
            this.am = bkfcVar.getString(bkfcVar.cM(27, bkfh.a));
            fY(27);
        }
        if (bkfcVar.di(28)) {
            this.an = bdhg.a(bkfcVar.getString(bkfcVar.cM(28, bkfh.a)));
            fY(28);
        }
        if (bkfcVar.di(29)) {
            this.ao = bkfcVar.getInt(bkfcVar.cM(29, bkfh.a));
            fY(29);
        }
        if (bkfcVar.di(30)) {
            byzi[] values = byzi.values();
            int i = bkfcVar.getInt(bkfcVar.cM(30, bkfh.a));
            if (i >= values.length) {
                throw new IllegalArgumentException();
            }
            this.ap = values[i];
            fY(30);
        }
        if (bkfcVar.di(31)) {
            this.aq = bkfcVar.getInt(bkfcVar.cM(31, bkfh.a));
            fY(31);
        }
        if (bkfcVar.di(32)) {
            this.ar = bkfcVar.getInt(bkfcVar.cM(32, bkfh.a)) == 1;
            fY(32);
        }
        if (bkfcVar.di(33)) {
            this.as = bkfcVar.getString(bkfcVar.cM(33, bkfh.a));
            fY(33);
        }
        if (bkfcVar.di(34)) {
            this.at = bkfcVar.getLong(bkfcVar.cM(34, bkfh.a));
            fY(34);
        }
        if (bkfcVar.di(35)) {
            this.au = bkfcVar.getInt(bkfcVar.cM(35, bkfh.a));
            fY(35);
        }
        if (bkfcVar.di(36)) {
            this.av = bkfcVar.getString(bkfcVar.cM(36, bkfh.a));
            fY(36);
        }
        if (bkfcVar.di(37)) {
            this.aw = bkfcVar.getString(bkfcVar.cM(37, bkfh.a));
            fY(37);
        }
        if (bkfcVar.di(38)) {
            this.ax = bkfcVar.getString(bkfcVar.cM(38, bkfh.a));
            fY(38);
        }
        if (bkfcVar.di(39)) {
            this.ay = bkfcVar.getLong(bkfcVar.cM(39, bkfh.a));
            fY(39);
        }
        if (bkfcVar.di(40)) {
            this.az = bkfcVar.getString(bkfcVar.cM(40, bkfh.a));
            fY(40);
        }
        if (bkfcVar.di(41)) {
            this.aA = bkfcVar.getLong(bkfcVar.cM(41, bkfh.a));
            fY(41);
        }
        if (bkfcVar.di(42)) {
            this.aB = bkfcVar.getLong(bkfcVar.cM(42, bkfh.a));
            fY(42);
        }
        if (bkfcVar.di(43)) {
            this.aC = bdhg.a(bkfcVar.getString(bkfcVar.cM(43, bkfh.a)));
            fY(43);
        }
        if (bkfcVar.di(44)) {
            this.aD = bkfcVar.getString(bkfcVar.cM(44, bkfh.a));
            fY(44);
        }
        if (bkfcVar.di(45)) {
            this.aE = bkfcVar.getBlob(bkfcVar.cM(45, bkfh.a));
            fY(45);
        }
        if (bkfcVar.di(46)) {
            this.aF = bkfcVar.getLong(bkfcVar.cM(46, bkfh.a));
            fY(46);
        }
        if (bkfcVar.di(47)) {
            byte[] blob = bkfcVar.getBlob(bkfcVar.cM(47, bkfh.a));
            if (blob == null) {
                fayvVar = null;
            } else {
                try {
                    fayvVar = (fayv) eyfy.parseFrom(fayv.a, blob, eyfc.a());
                } catch (Throwable unused) {
                    fayvVar = fayv.a;
                }
            }
            this.aG = fayvVar;
            fY(47);
        }
        if (bkfcVar.di(48)) {
            this.aH = bkfcVar.getString(bkfcVar.cM(48, bkfh.a));
            fY(48);
        }
        if (bkfcVar.di(49)) {
            this.aI = bkfcVar.getString(bkfcVar.cM(49, bkfh.a));
            fY(49);
        }
        if (bkfcVar.di(50)) {
            this.aJ = new MessageIdType(bkfcVar.getLong(bkfcVar.cM(50, bkfh.a)));
            fY(50);
        }
        if (bkfcVar.di(51)) {
            this.aK = bkfcVar.getInt(bkfcVar.cM(51, bkfh.a)) == 1;
            fY(51);
        }
        if (bkfcVar.di(52)) {
            String string2 = bkfcVar.getString(bkfcVar.cM(52, bkfh.a));
            this.aL = string2 == null ? null : Uri.parse(string2);
            fY(52);
        }
        if (bkfcVar.di(53)) {
            this.aM = bdhj.a(bkfcVar.getString(bkfcVar.cM(53, bkfh.a)));
            fY(53);
        }
        if (bkfcVar.di(54)) {
            this.aN = bkfcVar.getInt(bkfcVar.cM(54, bkfh.a));
            fY(54);
        }
        if (bkfcVar.di(55)) {
            csgg[] values2 = csgg.values();
            int i2 = bkfcVar.getInt(bkfcVar.cM(55, bkfh.a));
            if (i2 >= values2.length) {
                throw new IllegalArgumentException();
            }
            this.aO = values2[i2];
            fY(55);
        }
        if (bkfcVar.di(56)) {
            cjco[] values3 = cjco.values();
            int i3 = bkfcVar.getInt(bkfcVar.cM(56, bkfh.a));
            if (i3 >= values3.length) {
                throw new IllegalArgumentException();
            }
            this.aP = values3[i3];
            fY(56);
        }
        if (bkfcVar.di(57)) {
            byyw[] values4 = byyw.values();
            int i4 = bkfcVar.getInt(bkfcVar.cM(57, bkfh.a));
            if (i4 >= values4.length) {
                throw new IllegalArgumentException();
            }
            this.aQ = values4[i4];
            fY(57);
        }
        if (bkfcVar.di(58)) {
            this.aR = bkfcVar.getInt(bkfcVar.cM(58, bkfh.a));
            fY(58);
        }
        if (bkfcVar.di(59)) {
            this.aS = bkfcVar.getInt(bkfcVar.cM(59, bkfh.a)) == 1;
            fY(59);
        }
        if (bkfcVar.di(60)) {
            byte[] blob2 = bkfcVar.getBlob(bkfcVar.cM(60, bkfh.a));
            if (blob2 == null) {
                fjayVar = null;
            } else {
                try {
                    fjayVar = (fjay) eyfy.parseFrom(fjay.a, blob2, eyfc.a());
                } catch (Throwable unused2) {
                    fjayVar = fjay.a;
                }
            }
            this.aT = fjayVar;
            fY(60);
        }
        if (bkfcVar.di(61)) {
            byzg[] values5 = byzg.values();
            int i5 = bkfcVar.getInt(bkfcVar.cM(61, bkfh.a));
            if (i5 >= values5.length) {
                throw new IllegalArgumentException();
            }
            this.aU = values5[i5];
            fY(61);
        }
        if (bkfcVar.di(62)) {
            byzg[] values6 = byzg.values();
            int i6 = bkfcVar.getInt(bkfcVar.cM(62, bkfh.a));
            if (i6 >= values6.length) {
                throw new IllegalArgumentException();
            }
            this.aV = values6[i6];
            fY(62);
        }
        if (bkfcVar.di(63)) {
            byzl[] values7 = byzl.values();
            int i7 = bkfcVar.getInt(bkfcVar.cM(63, bkfh.a));
            if (i7 >= values7.length) {
                throw new IllegalArgumentException();
            }
            this.aW = values7[i7];
            fY(63);
        }
        if (bkfcVar.di(64)) {
            this.aX = bkfcVar.getInt(bkfcVar.cM(64, bkfh.a));
            fY(64);
        }
        if (bkfcVar.di(65)) {
            this.aY = new bdgr(bkfcVar.getString(bkfcVar.cM(65, bkfh.a)));
            fY(65);
        }
        if (bkfcVar.di(66)) {
            this.aZ = new cfmh(bkfcVar.getLong(bkfcVar.cM(66, bkfh.a)));
            fY(66);
        }
        if (bkfcVar.di(67)) {
            this.ba = bdhj.a(bkfcVar.getString(bkfcVar.cM(67, bkfh.a)));
            fY(67);
        }
        if (bkfcVar.di(68)) {
            this.a = bkfcVar.getString(bkfcVar.cM(68, bkfh.a));
            fY(68);
        }
        if (bkfcVar.di(69)) {
            this.b = new MessageIdType(bkfcVar.getLong(bkfcVar.cM(69, bkfh.a)));
            fY(69);
        }
        if (bkfcVar.di(70)) {
            this.c = cuxs.a(bkfcVar.getString(bkfcVar.cM(70, bkfh.a)));
            fY(70);
        }
        if (bkfcVar.di(71)) {
            String string3 = bkfcVar.getString(bkfcVar.cM(71, bkfh.a));
            this.d = string3 == null ? null : Uri.parse(string3);
            fY(71);
        }
        if (bkfcVar.di(72)) {
            this.e = bkfcVar.getString(bkfcVar.cM(72, bkfh.a));
            fY(72);
        }
        if (bkfcVar.di(73)) {
            String string4 = bkfcVar.getString(bkfcVar.cM(73, bkfh.a));
            this.f = string4 == null ? null : Uri.parse(string4);
            fY(73);
        }
        if (bkfcVar.di(74)) {
            String string5 = bkfcVar.getString(bkfcVar.cM(74, bkfh.a));
            this.bb = string5 == null ? null : Uri.parse(string5);
            fY(74);
        }
        if (bkfcVar.di(75)) {
            this.g = bkfcVar.getInt(bkfcVar.cM(75, bkfh.a));
            fY(75);
        }
        if (bkfcVar.di(76)) {
            this.h = bkfcVar.getInt(bkfcVar.cM(76, bkfh.a));
            fY(76);
        }
        if (bkfcVar.di(77)) {
            this.i = bkfcVar.getLong(bkfcVar.cM(77, bkfh.a));
            fY(77);
        }
        if (bkfcVar.di(78)) {
            String string6 = bkfcVar.getString(bkfcVar.cM(78, bkfh.a));
            this.j = string6 == null ? null : Uri.parse(string6);
            fY(78);
        }
        if (bkfcVar.di(79)) {
            this.k = bkfcVar.getLong(bkfcVar.cM(79, bkfh.a));
            fY(79);
        }
        if (bkfcVar.di(80)) {
            byzc[] values8 = byzc.values();
            int i8 = bkfcVar.getInt(bkfcVar.cM(80, bkfh.a));
            if (i8 >= values8.length) {
                throw new IllegalArgumentException();
            }
            this.l = values8[i8];
            fY(80);
        }
        if (bkfcVar.di(81)) {
            byyu[] values9 = byyu.values();
            int i9 = bkfcVar.getInt(bkfcVar.cM(81, bkfh.a));
            if (i9 >= values9.length) {
                throw new IllegalArgumentException();
            }
            this.bc = values9[i9];
            fY(81);
        }
        if (bkfcVar.di(82)) {
            this.m = new ConversationIdType(bkfcVar.getLong(bkfcVar.cM(82, bkfh.a)));
            fY(82);
        }
        if (bkfcVar.di(83)) {
            this.n = byyo.a(bkfcVar.getString(bkfcVar.cM(83, bkfh.a)));
            fY(83);
        }
        if (bkfcVar.di(84)) {
            this.o = byyo.a(bkfcVar.getString(bkfcVar.cM(84, bkfh.a)));
            fY(84);
        }
        if (bkfcVar.di(85)) {
            this.p = bkfcVar.getLong(bkfcVar.cM(85, bkfh.a));
            fY(85);
        }
        if (bkfcVar.di(86)) {
            this.q = bkfcVar.getDouble(bkfcVar.cM(86, bkfh.a));
            fY(86);
        }
        if (bkfcVar.di(87)) {
            this.r = bkfcVar.getDouble(bkfcVar.cM(87, bkfh.a));
            fY(87);
        }
        if (bkfcVar.di(88)) {
            String string7 = bkfcVar.getString(bkfcVar.cM(88, bkfh.a));
            this.s = string7 == null ? null : Uri.parse(string7);
            fY(88);
        }
        if (bkfcVar.di(89)) {
            this.t = bkfcVar.getString(bkfcVar.cM(89, bkfh.a));
            fY(89);
        }
        if (bkfcVar.di(90)) {
            String string8 = bkfcVar.getString(bkfcVar.cM(90, bkfh.a));
            this.u = string8 == null ? null : Uri.parse(string8);
            fY(90);
        }
        if (bkfcVar.di(91)) {
            this.v = bkfcVar.getInt(bkfcVar.cM(91, bkfh.a));
            fY(91);
        }
        if (bkfcVar.di(92)) {
            this.bd = bkfcVar.getInt(bkfcVar.cM(92, bkfh.a));
            fY(92);
        }
        if (bkfcVar.di(93)) {
            this.w = bkfcVar.getString(bkfcVar.cM(93, bkfh.a));
            fY(93);
        }
        if (bkfcVar.di(94)) {
            this.x = bkfcVar.getString(bkfcVar.cM(94, bkfh.a));
            fY(94);
        }
        if (bkfcVar.di(95)) {
            this.be = bkfcVar.getString(bkfcVar.cM(95, bkfh.a));
            fY(95);
        }
        if (bkfcVar.di(96)) {
            this.bf = bkfcVar.getBlob(bkfcVar.cM(96, bkfh.a));
            fY(96);
        }
        if (bkfcVar.di(97)) {
            this.bg = bkfcVar.getBlob(bkfcVar.cM(97, bkfh.a));
            fY(97);
        }
        if (bkfcVar.di(98)) {
            this.y = bkfcVar.getInt(bkfcVar.cM(98, bkfh.a)) == 1;
            fY(98);
        }
        if (bkfcVar.di(99)) {
            this.z = bkfcVar.getLong(bkfcVar.cM(99, bkfh.a));
            fY(99);
        }
        if (bkfcVar.di(100)) {
            this.A = bkfcVar.getString(bkfcVar.cM(100, bkfh.a));
            fY(100);
        }
        if (bkfcVar.di(EnergyProfile.EVCONNECTOR_TYPE_OTHER)) {
            this.B = bkfcVar.getString(bkfcVar.cM(EnergyProfile.EVCONNECTOR_TYPE_OTHER, bkfh.a));
            fY(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
        }
        if (bkfcVar.di(102)) {
            this.C = bkfcVar.getLong(bkfcVar.cM(102, bkfh.a));
            fY(102);
        }
        if (bkfcVar.di(103)) {
            this.D = bkfcVar.getString(bkfcVar.cM(103, bkfh.a));
            fY(103);
        }
        if (bkfcVar.di(104)) {
            this.bh = bkfcVar.getString(bkfcVar.cM(104, bkfh.a));
            fY(104);
        }
        if (bkfcVar.di(105)) {
            this.E = bkfcVar.getInt(bkfcVar.cM(105, bkfh.a)) == 1;
            fY(105);
        }
        if (bkfcVar.di(106)) {
            this.F = bkfcVar.getLong(bkfcVar.cM(106, bkfh.a));
            fY(106);
        }
        if (bkfcVar.di(107)) {
            this.G = bkfcVar.getBlob(bkfcVar.cM(107, bkfh.a));
            fY(107);
        }
        if (bkfcVar.di(108)) {
            this.H = bkfcVar.getBlob(bkfcVar.cM(108, bkfh.a));
            fY(108);
        }
        if (bkfcVar.di(109)) {
            this.bi = bkfcVar.getInt(bkfcVar.cM(109, bkfh.a)) == 1;
            fY(109);
        }
        if (bkfcVar.di(110)) {
            this.bj = bkfcVar.getInt(bkfcVar.cM(110, bkfh.a)) == 1;
            fY(110);
        }
        if (bkfcVar.di(111)) {
            this.I = bkfcVar.getLong(bkfcVar.cM(111, bkfh.a));
            fY(111);
        }
        if (bkfcVar.di(112)) {
            this.bk = bkfcVar.getString(bkfcVar.cM(112, bkfh.a));
            fY(112);
        }
        if (bkfcVar.di(113)) {
            byza[] values10 = byza.values();
            int i10 = bkfcVar.getInt(bkfcVar.cM(113, bkfh.a));
            if (i10 >= values10.length) {
                throw new IllegalArgumentException();
            }
            this.bl = values10[i10];
            fY(113);
        }
        if (bkfcVar.di(114)) {
            byte[] blob3 = bkfcVar.getBlob(bkfcVar.cM(114, bkfh.a));
            if (blob3 != null) {
                try {
                    dtehVar = (dteh) eyfy.parseFrom(dteh.a, blob3, eyfc.a());
                } catch (Throwable unused3) {
                    dtehVar = dteh.a;
                }
            }
            this.bm = dtehVar;
            fY(114);
        }
        if (bkfcVar.di(115)) {
            byzo[] values11 = byzo.values();
            int i11 = bkfcVar.getInt(bkfcVar.cM(115, bkfh.a));
            if (i11 >= values11.length) {
                throw new IllegalArgumentException();
            }
            this.bn = values11[i11];
            fY(115);
        }
        if (bkfcVar.di(116)) {
            this.bo = awao.a(bkfcVar.getString(bkfcVar.cM(116, bkfh.a)));
            fY(116);
        }
        if (bkfcVar.di(117)) {
            byzh[] values12 = byzh.values();
            int i12 = bkfcVar.getInt(bkfcVar.cM(117, bkfh.a));
            if (i12 >= values12.length) {
                throw new IllegalArgumentException();
            }
            this.J = values12[i12];
            fY(117);
        }
        if (bkfcVar.di(118)) {
            byyz[] values13 = byyz.values();
            int i13 = bkfcVar.getInt(bkfcVar.cM(118, bkfh.a));
            if (i13 >= values13.length) {
                throw new IllegalArgumentException();
            }
            this.bp = values13[i13];
            fY(118);
        }
        if (bkfcVar.di(119)) {
            this.K = bkfcVar.getInt(bkfcVar.cM(119, bkfh.a)) == 1;
            fY(119);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bjvm)) {
            return false;
        }
        bjvm bjvmVar = (bjvm) obj;
        return super.aD(bjvmVar.cL) && Objects.equals(this.L, bjvmVar.L) && Objects.equals(this.M, bjvmVar.M) && Objects.equals(this.N, bjvmVar.N) && Objects.equals(this.O, bjvmVar.O) && Objects.equals(this.P, bjvmVar.P) && Objects.equals(this.Q, bjvmVar.Q) && this.R == bjvmVar.R && Objects.equals(this.S, bjvmVar.S) && this.T == bjvmVar.T && this.U == bjvmVar.U && this.V == bjvmVar.V && this.W == bjvmVar.W && this.X == bjvmVar.X && this.Y == bjvmVar.Y && Objects.equals(this.Z, bjvmVar.Z) && this.aa == bjvmVar.aa && this.ab == bjvmVar.ab && Objects.equals(this.ac, bjvmVar.ac) && Objects.equals(this.ad, bjvmVar.ad) && Objects.equals(this.ae, bjvmVar.ae) && this.af == bjvmVar.af && this.ag == bjvmVar.ag && Objects.equals(this.ah, bjvmVar.ah) && this.ai == bjvmVar.ai && Objects.equals(this.aj, bjvmVar.aj) && Objects.equals(this.ak, bjvmVar.ak) && this.al == bjvmVar.al && Objects.equals(this.am, bjvmVar.am) && Objects.equals(this.an, bjvmVar.an) && this.ao == bjvmVar.ao && this.ap == bjvmVar.ap && this.aq == bjvmVar.aq && this.ar == bjvmVar.ar && Objects.equals(this.as, bjvmVar.as) && this.at == bjvmVar.at && this.au == bjvmVar.au && Objects.equals(this.av, bjvmVar.av) && Objects.equals(this.aw, bjvmVar.aw) && Objects.equals(this.ax, bjvmVar.ax) && this.ay == bjvmVar.ay && Objects.equals(this.az, bjvmVar.az) && this.aA == bjvmVar.aA && this.aB == bjvmVar.aB && Objects.equals(this.aC, bjvmVar.aC) && Objects.equals(this.aD, bjvmVar.aD) && Arrays.equals(this.aE, bjvmVar.aE) && this.aF == bjvmVar.aF && Objects.equals(this.aG, bjvmVar.aG) && Objects.equals(this.aH, bjvmVar.aH) && Objects.equals(this.aI, bjvmVar.aI) && Objects.equals(this.aJ, bjvmVar.aJ) && this.aK == bjvmVar.aK && Objects.equals(this.aL, bjvmVar.aL) && Objects.equals(this.aM, bjvmVar.aM) && this.aN == bjvmVar.aN && this.aO == bjvmVar.aO && this.aP == bjvmVar.aP && this.aQ == bjvmVar.aQ && this.aR == bjvmVar.aR && this.aS == bjvmVar.aS && Objects.equals(this.aT, bjvmVar.aT) && this.aU == bjvmVar.aU && this.aV == bjvmVar.aV && this.aW == bjvmVar.aW && this.aX == bjvmVar.aX && Objects.equals(this.aY, bjvmVar.aY) && Objects.equals(this.aZ, bjvmVar.aZ) && Objects.equals(this.ba, bjvmVar.ba) && Objects.equals(this.a, bjvmVar.a) && Objects.equals(this.b, bjvmVar.b) && Objects.equals(this.c, bjvmVar.c) && Objects.equals(this.d, bjvmVar.d) && Objects.equals(this.e, bjvmVar.e) && Objects.equals(this.f, bjvmVar.f) && Objects.equals(this.bb, bjvmVar.bb) && this.g == bjvmVar.g && this.h == bjvmVar.h && this.i == bjvmVar.i && Objects.equals(this.j, bjvmVar.j) && this.k == bjvmVar.k && this.l == bjvmVar.l && this.bc == bjvmVar.bc && Objects.equals(this.m, bjvmVar.m) && Objects.equals(this.n, bjvmVar.n) && Objects.equals(this.o, bjvmVar.o) && this.p == bjvmVar.p && this.q == bjvmVar.q && this.r == bjvmVar.r && Objects.equals(this.s, bjvmVar.s) && Objects.equals(this.t, bjvmVar.t) && Objects.equals(this.u, bjvmVar.u) && this.v == bjvmVar.v && this.bd == bjvmVar.bd && Objects.equals(this.w, bjvmVar.w) && Objects.equals(this.x, bjvmVar.x) && Objects.equals(this.be, bjvmVar.be) && Arrays.equals(this.bf, bjvmVar.bf) && Arrays.equals(this.bg, bjvmVar.bg) && this.y == bjvmVar.y && this.z == bjvmVar.z && Objects.equals(this.A, bjvmVar.A) && Objects.equals(this.B, bjvmVar.B) && this.C == bjvmVar.C && Objects.equals(this.D, bjvmVar.D) && Objects.equals(this.bh, bjvmVar.bh) && this.E == bjvmVar.E && this.F == bjvmVar.F && Arrays.equals(this.G, bjvmVar.G) && Arrays.equals(this.H, bjvmVar.H) && this.bi == bjvmVar.bi && this.bj == bjvmVar.bj && this.I == bjvmVar.I && Objects.equals(this.bk, bjvmVar.bk) && this.bl == bjvmVar.bl && Objects.equals(this.bm, bjvmVar.bm) && this.bn == bjvmVar.bn && Objects.equals(this.bo, bjvmVar.bo) && this.J == bjvmVar.J && this.bp == bjvmVar.bp && this.K == bjvmVar.K;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        MessageIdType messageIdType = this.L;
        ConversationIdType conversationIdType = this.M;
        String str = this.N;
        String str2 = this.O;
        String str3 = this.P;
        String str4 = this.Q;
        Long valueOf = Long.valueOf(this.R);
        Instant instant = this.S;
        Long valueOf2 = Long.valueOf(this.T);
        Integer valueOf3 = Integer.valueOf(this.U);
        Integer valueOf4 = Integer.valueOf(this.V);
        Integer valueOf5 = Integer.valueOf(this.W);
        Boolean valueOf6 = Boolean.valueOf(this.X);
        Boolean valueOf7 = Boolean.valueOf(this.Y);
        dtsq dtsqVar3 = dtsqVar2;
        Uri uri = this.Z;
        Integer valueOf8 = Integer.valueOf(this.aa);
        Long valueOf9 = Long.valueOf(this.ab);
        String str5 = this.ac;
        String str6 = this.ad;
        String str7 = this.ae;
        Long valueOf10 = Long.valueOf(this.af);
        Long valueOf11 = Long.valueOf(this.ag);
        String str8 = this.ah;
        Integer valueOf12 = Integer.valueOf(this.ai);
        String str9 = this.aj;
        azsu azsuVar = this.ak;
        Long valueOf13 = Long.valueOf(this.al);
        String str10 = this.am;
        bdhg bdhgVar = this.an;
        Integer valueOf14 = Integer.valueOf(this.ao);
        byzi byziVar = this.ap;
        Integer valueOf15 = Integer.valueOf(byziVar == null ? 0 : byziVar.ordinal());
        Integer valueOf16 = Integer.valueOf(this.aq);
        Boolean valueOf17 = Boolean.valueOf(this.ar);
        String str11 = this.as;
        Long valueOf18 = Long.valueOf(this.at);
        Integer valueOf19 = Integer.valueOf(this.au);
        String str12 = this.av;
        String str13 = this.aw;
        String str14 = this.ax;
        Long valueOf20 = Long.valueOf(this.ay);
        String str15 = this.az;
        Long valueOf21 = Long.valueOf(this.aA);
        Long valueOf22 = Long.valueOf(this.aB);
        bdhg bdhgVar2 = this.aC;
        String str16 = this.aD;
        Integer valueOf23 = Integer.valueOf(Arrays.hashCode(this.aE));
        Long valueOf24 = Long.valueOf(this.aF);
        fayv fayvVar = this.aG;
        String str17 = this.aH;
        String str18 = this.aI;
        MessageIdType messageIdType2 = this.aJ;
        Boolean valueOf25 = Boolean.valueOf(this.aK);
        Uri uri2 = this.aL;
        Optional optional = this.aM;
        Integer valueOf26 = Integer.valueOf(this.aN);
        csgg csggVar = this.aO;
        Integer valueOf27 = Integer.valueOf(csggVar == null ? 0 : csggVar.ordinal());
        cjco cjcoVar = this.aP;
        Integer valueOf28 = Integer.valueOf(cjcoVar == null ? 0 : cjcoVar.ordinal());
        byyw byywVar = this.aQ;
        Integer valueOf29 = Integer.valueOf(byywVar == null ? 0 : byywVar.ordinal());
        Integer valueOf30 = Integer.valueOf(this.aR);
        Boolean valueOf31 = Boolean.valueOf(this.aS);
        fjay fjayVar = this.aT;
        byzg byzgVar = this.aU;
        Integer valueOf32 = Integer.valueOf(byzgVar == null ? 0 : byzgVar.ordinal());
        byzg byzgVar2 = this.aV;
        Integer valueOf33 = Integer.valueOf(byzgVar2 == null ? 0 : byzgVar2.ordinal());
        byzl byzlVar = this.aW;
        Integer valueOf34 = Integer.valueOf(byzlVar == null ? 0 : byzlVar.ordinal());
        Integer valueOf35 = Integer.valueOf(this.aX);
        bdgr bdgrVar = this.aY;
        cfmh cfmhVar = this.aZ;
        Optional optional2 = this.ba;
        String str19 = this.a;
        MessageIdType messageIdType3 = this.b;
        String str20 = this.c;
        Uri uri3 = this.d;
        String str21 = this.e;
        Uri uri4 = this.f;
        Uri uri5 = this.bb;
        Integer valueOf36 = Integer.valueOf(this.g);
        Integer valueOf37 = Integer.valueOf(this.h);
        Long valueOf38 = Long.valueOf(this.i);
        Uri uri6 = this.j;
        Long valueOf39 = Long.valueOf(this.k);
        byzc byzcVar = this.l;
        Integer valueOf40 = Integer.valueOf(byzcVar == null ? 0 : byzcVar.ordinal());
        byyu byyuVar = this.bc;
        Integer valueOf41 = Integer.valueOf(byyuVar == null ? 0 : byyuVar.ordinal());
        ConversationIdType conversationIdType2 = this.m;
        byyp byypVar = this.n;
        byyp byypVar2 = this.o;
        Long valueOf42 = Long.valueOf(this.p);
        Double valueOf43 = Double.valueOf(this.q);
        Double valueOf44 = Double.valueOf(this.r);
        Uri uri7 = this.s;
        String str22 = this.t;
        Uri uri8 = this.u;
        Integer valueOf45 = Integer.valueOf(this.v);
        Integer valueOf46 = Integer.valueOf(this.bd);
        String str23 = this.w;
        String str24 = this.x;
        String str25 = this.be;
        Integer valueOf47 = Integer.valueOf(Arrays.hashCode(this.bf));
        Integer valueOf48 = Integer.valueOf(Arrays.hashCode(this.bg));
        Boolean valueOf49 = Boolean.valueOf(this.y);
        Long valueOf50 = Long.valueOf(this.z);
        String str26 = this.A;
        String str27 = this.B;
        Long valueOf51 = Long.valueOf(this.C);
        String str28 = this.D;
        String str29 = this.bh;
        Boolean valueOf52 = Boolean.valueOf(this.E);
        Long valueOf53 = Long.valueOf(this.F);
        Integer valueOf54 = Integer.valueOf(Arrays.hashCode(this.G));
        Integer valueOf55 = Integer.valueOf(Arrays.hashCode(this.H));
        Boolean valueOf56 = Boolean.valueOf(this.bi);
        Boolean valueOf57 = Boolean.valueOf(this.bj);
        Long valueOf58 = Long.valueOf(this.I);
        String str30 = this.bk;
        byza byzaVar = this.bl;
        Integer valueOf59 = Integer.valueOf(byzaVar == null ? 0 : byzaVar.ordinal());
        dteh dtehVar = this.bm;
        byzo byzoVar = this.bn;
        Integer valueOf60 = Integer.valueOf(byzoVar == null ? 0 : byzoVar.ordinal());
        awap awapVar = this.bo;
        byzh byzhVar = this.J;
        Integer valueOf61 = Integer.valueOf(byzhVar == null ? 0 : byzhVar.ordinal());
        byyz byyzVar = this.bp;
        return Objects.hash(dtsqVar3, messageIdType, conversationIdType, str, str2, str3, str4, valueOf, instant, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, uri, valueOf8, valueOf9, str5, str6, str7, valueOf10, valueOf11, str8, valueOf12, str9, azsuVar, valueOf13, str10, bdhgVar, valueOf14, valueOf15, valueOf16, valueOf17, str11, valueOf18, valueOf19, str12, str13, str14, valueOf20, str15, valueOf21, valueOf22, bdhgVar2, str16, valueOf23, valueOf24, fayvVar, str17, str18, messageIdType2, valueOf25, uri2, optional, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, fjayVar, valueOf32, valueOf33, valueOf34, valueOf35, bdgrVar, cfmhVar, optional2, str19, messageIdType3, str20, uri3, str21, uri4, uri5, valueOf36, valueOf37, valueOf38, uri6, valueOf39, valueOf40, valueOf41, conversationIdType2, byypVar, byypVar2, valueOf42, valueOf43, valueOf44, uri7, str22, uri8, valueOf45, valueOf46, str23, str24, str25, valueOf47, valueOf48, valueOf49, valueOf50, str26, str27, valueOf51, str28, str29, valueOf52, valueOf53, valueOf54, valueOf55, valueOf56, valueOf57, valueOf58, str30, valueOf59, dtehVar, valueOf60, awapVar, valueOf61, Integer.valueOf(byyzVar == null ? 0 : byyzVar.ordinal()), Boolean.valueOf(this.K), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "DraftsView -- REDACTED") : a();
    }
}
