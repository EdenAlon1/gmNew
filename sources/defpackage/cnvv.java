package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class cnvv extends dtro {
    private String A;
    private String B;
    private String C;
    private String F;
    private String H;
    private String K;
    private String Q;
    private String T;
    private String U;
    private String V;
    private long W;
    public MessagesTable.BindData a;
    private MessageIdType aA;
    private String[] aB;
    private Uri[] aC;
    private String[] aD;
    private Uri[] aE;
    private Uri[] aF;
    private int[] aG;
    private int[] aH;
    private long aI;
    private Uri aJ;
    private long[] aK;
    private byzc aL;
    private byyu[] aM;
    private ConversationIdType aN;
    private byyp aO;
    private byyp aP;
    private long aQ;
    private double aR;
    private double aS;
    private Uri[] aT;
    private String aU;
    private Uri[] aV;
    private int[] aW;
    private int[] aX;
    private String[] aY;
    private String aZ;
    private String ab;
    private byte[] ac;
    private fayv ae;
    private String af;
    private String ag;
    private Uri aj;
    private fjay ar;
    private byzg as;
    private byzg at;
    private byzl au;
    private int av;
    private bdgr aw;
    private cfmh ax;
    private Optional ay;
    private String[] az;
    public PartsTable.BindData[] b;
    private String bA;
    private String ba;
    private byte[] bb;
    private byte[] bc;
    private boolean[] bd;
    private long[] be;
    private String[] bf;
    private String[] bg;
    private long[] bh;
    private String[] bi;
    private String bj;
    private boolean[] bk;
    private long[] bl;
    private byte[][] bm;
    private byte[][] bn;
    private boolean[] bo;
    private boolean bp;
    private long bq;
    private String br;
    private byza bs;
    private dteh bt;
    private byzo bu;
    private awap bv;
    private byzh bw;
    private byyz bx;
    private boolean by;
    private long[] bz;
    public ScheduledSendTable.BindData c;
    private String d;
    private String l;
    private String m;
    private String n;
    private String o;
    private Uri x;
    private MessageIdType e = bdhb.a;
    private ConversationIdType f = bdgq.a;
    private Instant g = bdgw.b(0);
    private coiu h = coiu.SCHEDULED;
    private Instant i = bdgw.b(0);
    private MessageIdType j = bdhb.a;
    private ConversationIdType k = bdgq.a;
    private long p = 0;
    private Instant q = bdgw.b(0);
    private long r = 0;
    private int s = 0;
    private int t = 0;
    private int u = 0;
    private boolean v = false;
    private boolean w = false;
    private int y = 0;
    private long z = 0;
    private long D = 0;
    private long E = 0;
    private int G = 0;
    private azsu I = null;
    private long J = 0;
    private bdhg L = bdhg.a;
    private int M = 0;
    private byzi N = byzi.VERIFICATION_NA;
    private int O = 0;
    private boolean P = false;
    private long R = -1;
    private int S = -1;
    private String X = "";
    private long Y = 0;
    private long Z = 1;
    private bdhg aa = bdhg.a;
    private long ad = 0;
    private MessageIdType ah = bdhb.a;
    private boolean ai = false;
    private Optional ak = bdhj.a;
    private int al = -2;
    private csgg am = csgg.UNKNOWN;
    private cjco an = cjco.c;
    private byyw ao = byyw.UNKNOWN;
    private int ap = 0;
    private boolean aq = false;

    protected cnvv() {
        byzg byzgVar = byzg.UNKNOWN;
        this.as = byzgVar;
        this.at = byzgVar;
        this.au = byzl.UNKNOWN;
        this.av = -1;
        this.aw = bdgr.a;
        this.ax = new cfmh(0L);
        this.ay = bdhf.a();
        this.aA = bdhb.a;
        this.aL = byzc.SUCCEEDED;
        this.aN = bdgq.a;
        this.aO = new byyp(-1);
        this.aP = new byyp(-1);
        this.aQ = -1L;
        this.aR = eobe.a;
        this.aS = eobe.a;
        this.bp = false;
        this.bs = byza.STANDARD;
        this.bu = byzo.UNKNOWN;
        this.bv = null;
        this.bw = byzh.NONE;
        this.bx = byyz.DEFAULT_NO_VERDICT;
        this.by = false;
    }

    private final void g() {
        int intValue = cogq.c().intValue();
        cohi a = ScheduledSendTable.a();
        az(0, "_id");
        a.e(this.d);
        az(1, "message_id");
        a.f(this.e);
        az(2, "conversation_id");
        a.c(this.f);
        az(3, "scheduled_time");
        a.g(this.g);
        az(4, "status");
        a.h(this.h);
        if (intValue >= 58020) {
            az(5, "creation_time");
            a.d(this.i);
        }
        this.c = a.a();
        buoy c = MessagesTable.c();
        az(6, "_id");
        c.v(this.j);
        az(7, "conversation_id");
        c.m(this.k);
        az(8, "sender_id");
        c.ag(this.l);
        if (intValue >= 54040) {
            az(9, "sender_send_destination");
            c.ah(this.m);
        }
        if (intValue >= 59340) {
            az(10, "msisdn_receiving_rcs_message");
            c.E(this.n);
        }
        if (intValue >= 54040) {
            az(11, "receiving_network_country");
            c.Z(this.o);
        }
        az(12, "sent_timestamp");
        c.ai(this.p);
        if (intValue >= 17030) {
            az(13, "queue_insert_timestamp");
            c.P(this.q);
        }
        az(14, "received_timestamp");
        c.Y(this.r);
        az(15, "message_protocol");
        c.O(this.s);
        az(16, "message_status");
        c.ao(this.t);
        if (intValue >= 13020) {
            az(17, "message_report_status");
            c.y(this.u);
        }
        az(18, "seen");
        c.H(this.v);
        az(19, "read");
        c.X(this.w);
        az(20, "sms_message_uri");
        c.am(this.x);
        az(21, "sms_priority");
        c.an(this.y);
        az(22, "sms_message_size");
        c.al(this.z);
        az(23, "mms_subject");
        c.C(this.A);
        az(24, "mms_transaction_id");
        c.D(this.B);
        az(25, "mms_content_location");
        c.z(this.C);
        az(26, "mms_expiry");
        c.A(this.D);
        if (intValue >= 59890) {
            az(27, "rcs_expiry");
            c.S(this.E);
        }
        if (intValue >= 9030) {
            az(28, "mms_retrieve_text");
            c.B(this.F);
        }
        az(29, "raw_status");
        c.Q(this.G);
        az(30, "self_id");
        c.ae(this.H);
        if (intValue >= 60160) {
            az(31, "my_identity_foreign_key");
            c.G(this.I);
        }
        az(32, "retry_start_timestamp");
        c.ac(this.J);
        if (intValue >= 8500) {
            az(33, "cloud_sync_id");
            c.h(this.K);
        }
        if (intValue >= 41040) {
            az(34, "rcs_message_id_with_text_type");
            c.U(this.L);
        }
        if (intValue >= 29060) {
            az(35, "etouffee_status");
            c.R(this.M);
        }
        if (intValue >= 29090) {
            az(36, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS);
            c.ar(this.N);
        }
        if (intValue >= 39000) {
            az(37, "rcs_ui_status");
            c.W(this.O);
        }
        if (intValue >= 30010) {
            az(38, "is_hidden");
            c.w(this.P);
        }
        if (intValue >= 10002) {
            az(39, "rcs_remote_instance");
            c.V(this.Q);
        }
        if (intValue >= 10004) {
            az(40, "rcs_file_transfer_session_id");
            c.T(this.R);
        }
        if (intValue >= 9000) {
            az(41, "sms_error_code");
            c.aj(this.S);
        }
        if (intValue >= 9000) {
            az(42, "sms_error_desc_map_name");
            c.ak(this.T);
        }
        if (intValue >= 9010) {
            az(43, "correlation_id");
            c.n(this.U);
        }
        if (intValue >= 31010) {
            az(44, "cms_id");
            c.j(this.V);
        }
        if (intValue >= 37040) {
            az(45, "cms_last_mod_seq");
            c.k(this.W);
        }
        if (intValue >= 19020) {
            az(46, "web_id");
            c.as(this.X);
        }
        if (intValue >= 29100) {
            az(47, "usage_stats_logging_id");
            c.aq(this.Y);
        }
        if (intValue >= 35030) {
            az(48, "send_counter");
            c.af(this.Z);
        }
        if (intValue >= 35030) {
            az(49, "original_rcs_message_id");
            c.L(this.aa);
        }
        if (intValue >= 37020) {
            az(50, "custom_delivery_receipt_mime_type");
            c.p(this.ab);
        }
        if (intValue >= 37020) {
            az(51, "custom_delivery_receipt_content");
            c.o(this.ac);
        }
        if (intValue >= 37030) {
            az(52, "report_attempt_acounter");
            c.aa(this.ad);
        }
        if (intValue >= 45020) {
            az(53, "custom_headers");
            c.q(this.ae);
        }
        if (intValue >= 46010) {
            az(54, "cms_correlation_id");
            c.i(this.af);
        }
        if (intValue >= 48030) {
            az(55, "group_private_participant");
            c.u(this.ag);
        }
        if (intValue >= 48030) {
            az(56, "original_message_id");
            c.J(this.ah);
        }
        if (intValue >= 49060) {
            az(57, "awaiting_reverse_sync");
            c.f(this.ai);
        }
        if (intValue >= 49060) {
            az(58, "old_sms_message_uri");
            c.I(this.aj);
        }
        if (intValue >= 56000) {
            az(59, "draft_id");
            c.r(this.ak);
        }
        if (intValue >= 58040) {
            az(60, "result_code");
            c.ab(this.al);
        }
        if (intValue >= 58210) {
            az(61, "cms_life_cycle");
            c.l(this.am);
        }
        if (intValue >= 60750) {
            az(62, "mute_priority");
            c.F(this.an);
        }
        if (intValue >= 58710) {
            az(63, "fallback_reason");
            c.t(this.ao);
        }
        if (intValue >= 58230) {
            az(64, "auto_retry_counter");
            c.e(this.ap);
        }
        if (intValue >= 58280) {
            az(65, "can_revoke_before_delivered_with_rcs");
            c.g(this.aq);
        }
        if (intValue >= 58680) {
            az(66, "trace_id");
            c.ap(this.ar);
        }
        if (intValue >= 58720) {
            az(67, "outgoing_delivery_report_status");
            c.M(this.as);
        }
        if (intValue >= 58720) {
            az(68, "outgoing_read_report_status");
            c.N(this.at);
        }
        if (intValue >= 59310) {
            az(69, "xms_transport");
            c.at(this.au);
        }
        if (intValue >= 59430) {
            az(70, "message_original_protocol");
            c.K(this.av);
        }
        if (intValue >= 59490) {
            az(71, "satellite_datagram_id");
            c.ad(this.aw);
        }
        if (intValue >= 60190) {
            az(72, "encryption_protocol");
            c.s(this.ax);
        }
        if (intValue >= 60370) {
            az(73, "message_persistence_id");
            c.x(this.ay);
        }
        this.a = c.a();
        ArrayList arrayList = new ArrayList();
        int length = h() == null ? 0 : h().length;
        new HashSet();
        for (int i = 0; i < length; i++) {
            bvwp b = PartsTable.b();
            b.B(h()[i]);
            az(75, "message_id");
            b.J(this.aA);
            az(76, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
            b.Y(this.aB[i]);
            az(77, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            b.aa(this.aC[i]);
            az(78, "content_type");
            b.t(this.aD[i]);
            if (intValue >= 10021) {
                az(79, "original_uri");
                b.L(this.aE[i]);
            }
            if (intValue >= 29060) {
                az(80, "storage_uri");
                b.W(this.aF[i]);
            }
            az(81, "width");
            b.ad(this.aG[i]);
            az(82, "height");
            b.A(this.aH[i]);
            if (intValue >= 3010) {
                az(83, "timestamp");
                b.Z(this.aI);
            }
            if (intValue >= 4020) {
                az(84, "output_uri");
                b.Q(this.aJ);
            }
            if (intValue >= 4020) {
                az(85, "target_size");
                b.X(this.aK[i]);
            }
            if (intValue >= 4020) {
                az(86, "processing_status");
                b.R(this.aL);
            }
            if (intValue >= 44010) {
                az(87, "cms_attachment_processing_status");
                b.k(this.aM[i]);
            }
            az(88, "conversation_id");
            b.u(this.aN);
            if (intValue >= 5020) {
                az(89, "sticker_set_id");
                b.V(this.aO);
            }
            if (intValue >= 5020) {
                az(90, "sticker_id");
                b.U(this.aP);
            }
            if (intValue >= 7000) {
                az(91, "media_modified_timestamp");
                b.H(this.aQ);
            }
            if (intValue >= 10005) {
                az(92, "longitude");
                b.F(this.aR);
            }
            if (intValue >= 10005) {
                az(93, "latitude");
                b.D(this.aS);
            }
            if (intValue >= 10017) {
                az(94, "preview_content_uri");
                b.O(this.aT[i]);
            }
            if (intValue >= 10017) {
                az(95, "preview_content_type");
                b.N(this.aU);
            }
            if (intValue >= 13000) {
                az(96, "fallback_uri");
                b.x(this.aV[i]);
            }
            if (intValue >= 14010) {
                az(97, "source");
                b.T(this.aW[i]);
            }
            if (intValue >= 17010) {
                az(98, "bundle_index");
                b.j(this.aX[i]);
            }
            if (intValue >= 17020) {
                az(99, "blob_id");
                b.g(this.aY[i]);
            }
            if (intValue >= 59570) {
                az(100, "blob_gaia_email");
                b.f(this.aZ);
            }
            if (intValue >= 40040) {
                az(EnergyProfile.EVCONNECTOR_TYPE_OTHER, "cms_full_size_blob_id");
                b.n(this.ba);
            }
            if (intValue >= 42010) {
                az(102, "cms_media_encryption_key");
                b.o(this.bb);
            }
            if (intValue >= 42070) {
                az(103, "cms_compressed_media_encryption_key");
                b.m(this.bc);
            }
            if (intValue >= 18000) {
                az(104, "blob_upload_permanent_failure");
                b.h(this.bd[i]);
            }
            if (intValue >= 19030) {
                az(105, "blob_upload_timestamp");
                b.i(this.be[i]);
            }
            if (intValue >= 22060) {
                az(106, "expressive_sticker_name");
                b.w(this.bf[i]);
            }
            if (intValue >= 26000) {
                az(107, "file_name");
                b.y(this.bg[i]);
            }
            if (intValue >= 26040) {
                az(108, "duration");
                b.v(this.bh[i]);
            }
            if (intValue >= 27000) {
                az(109, "compressed_blob_id");
                b.p(this.bi[i]);
            }
            if (intValue >= 40040) {
                az(110, "cms_compressed_blob_id");
                b.l(this.bj);
            }
            if (intValue >= 27000) {
                az(111, "compressed_blob_upload_permanent_failure");
                b.q(this.bk[i]);
            }
            if (intValue >= 27000) {
                az(112, "compressed_blob_upload_timestamp");
                b.r(this.bl[i]);
            }
            if (intValue >= 30040) {
                az(113, "media_encryption_key");
                b.G(this.bm[i]);
            }
            if (intValue >= 30040) {
                az(114, "compressed_media_encryption_key");
                b.s(this.bn[i]);
            }
            if (intValue >= 52030) {
                az(115, "missing_entry_in_telephony");
                b.K(this.bo[i]);
            }
            if (intValue >= 53040) {
                az(116, "awaiting_reverse_sync");
                b.e(this.bp);
            }
            if (intValue >= 52050) {
                az(117, "file_size_bytes");
                b.z(this.bq);
            }
            if (intValue >= 52050) {
                az(118, "local_cache_path");
                b.E(this.br);
            }
            if (intValue >= 58150) {
                az(119, "media_send_type");
                b.I(this.bs);
            }
            if (intValue >= 59470) {
                az(120, "voice_metadata");
                b.ac(this.bt);
            }
            if (intValue >= 58770) {
                az(121, "validation_status");
                b.ab(this.bu);
            }
            if (intValue >= 60080) {
                az(122, "processing_id");
                b.P(this.bv);
            }
            if (intValue >= 60230) {
                az(123, "rich_card_media_download_failure_reason");
                b.S(this.bw);
            }
            if (intValue >= 60240) {
                az(124, "image_display_state");
                b.C(this.bx);
            }
            if (intValue >= 60680) {
                az(125, "preserve_size");
                b.M(this.by);
            }
            arrayList.add(b.a());
        }
        this.b = (PartsTable.BindData[]) arrayList.toArray(new PartsTable.BindData[0]);
    }

    private final String[] h() {
        az(74, "_id");
        return this.az;
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.i);
        String valueOf7 = String.valueOf(this.j);
        String valueOf8 = String.valueOf(this.k);
        String valueOf9 = String.valueOf(this.l);
        String valueOf10 = String.valueOf(this.m);
        String valueOf11 = String.valueOf(this.n);
        String valueOf12 = String.valueOf(this.o);
        String valueOf13 = String.valueOf(this.p);
        String valueOf14 = String.valueOf(this.q);
        String valueOf15 = String.valueOf(this.r);
        String valueOf16 = String.valueOf(this.s);
        String valueOf17 = String.valueOf(this.t);
        String valueOf18 = String.valueOf(this.u);
        String valueOf19 = String.valueOf(this.v);
        String valueOf20 = String.valueOf(this.w);
        String valueOf21 = String.valueOf(this.x);
        String valueOf22 = String.valueOf(this.y);
        String valueOf23 = String.valueOf(this.z);
        String valueOf24 = String.valueOf(this.A);
        String valueOf25 = String.valueOf(this.B);
        String valueOf26 = String.valueOf(this.C);
        String valueOf27 = String.valueOf(this.D);
        String valueOf28 = String.valueOf(this.E);
        String valueOf29 = String.valueOf(this.F);
        String valueOf30 = String.valueOf(this.G);
        String valueOf31 = String.valueOf(this.H);
        String valueOf32 = String.valueOf(this.I);
        String valueOf33 = String.valueOf(this.J);
        String valueOf34 = String.valueOf(this.K);
        String valueOf35 = String.valueOf(this.L);
        String valueOf36 = String.valueOf(this.M);
        String valueOf37 = String.valueOf(this.N);
        String valueOf38 = String.valueOf(this.O);
        String valueOf39 = String.valueOf(this.P);
        String valueOf40 = String.valueOf(this.Q);
        String valueOf41 = String.valueOf(this.R);
        String valueOf42 = String.valueOf(this.S);
        String valueOf43 = String.valueOf(this.T);
        String valueOf44 = String.valueOf(this.U);
        String valueOf45 = String.valueOf(this.V);
        String valueOf46 = String.valueOf(this.W);
        String valueOf47 = String.valueOf(this.X);
        String valueOf48 = String.valueOf(this.Y);
        String valueOf49 = String.valueOf(this.Z);
        String valueOf50 = String.valueOf(this.aa);
        String valueOf51 = String.valueOf(this.ab);
        byte[] bArr = this.ac;
        String concat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
        String valueOf52 = String.valueOf(this.ad);
        String valueOf53 = String.valueOf(this.ae);
        String valueOf54 = String.valueOf(this.af);
        String valueOf55 = String.valueOf(this.ag);
        String valueOf56 = String.valueOf(this.ah);
        String valueOf57 = String.valueOf(this.ai);
        String valueOf58 = String.valueOf(this.aj);
        String valueOf59 = String.valueOf(this.ak);
        String valueOf60 = String.valueOf(this.al);
        String valueOf61 = String.valueOf(this.am);
        String valueOf62 = String.valueOf(this.an);
        String valueOf63 = String.valueOf(this.ao);
        String valueOf64 = String.valueOf(this.ap);
        String valueOf65 = String.valueOf(this.aq);
        String valueOf66 = String.valueOf(this.ar);
        String valueOf67 = String.valueOf(this.as);
        String valueOf68 = String.valueOf(this.at);
        String valueOf69 = String.valueOf(this.au);
        String valueOf70 = String.valueOf(this.av);
        String valueOf71 = String.valueOf(this.aw);
        String valueOf72 = String.valueOf(this.ax);
        String valueOf73 = String.valueOf(this.ay);
        String aL = aL(this.az);
        String valueOf74 = String.valueOf(this.aA);
        String aL2 = aL(this.aB);
        String aK = aK(this.aC);
        String aL3 = aL(this.aD);
        String aK2 = aK(this.aE);
        String aK3 = aK(this.aF);
        String aI = aI(this.aG);
        String aI2 = aI(this.aH);
        String valueOf75 = String.valueOf(this.aI);
        String valueOf76 = String.valueOf(this.aJ);
        String aJ = aJ(this.aK);
        String valueOf77 = String.valueOf(this.aL);
        String aK4 = aK(this.aM);
        String valueOf78 = String.valueOf(this.aN);
        String valueOf79 = String.valueOf(this.aO);
        String valueOf80 = String.valueOf(this.aP);
        String valueOf81 = String.valueOf(this.aQ);
        String valueOf82 = String.valueOf(this.aR);
        String valueOf83 = String.valueOf(this.aS);
        String aK5 = aK(this.aT);
        String valueOf84 = String.valueOf(this.aU);
        String aK6 = aK(this.aV);
        String aI3 = aI(this.aW);
        String aI4 = aI(this.aX);
        String aL4 = aL(this.aY);
        String valueOf85 = String.valueOf(this.ba);
        byte[] bArr2 = this.bb;
        String concat2 = "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL"));
        byte[] bArr3 = this.bc;
        return String.format(locale, "ScheduledMessagesQuery [scheduled_send.scheduled_send__id: %s,\n  scheduled_send.scheduled_send_message_id: %s,\n  scheduled_send.scheduled_send_conversation_id: %s,\n  scheduled_send.scheduled_send_scheduled_time: %s,\n  scheduled_send.scheduled_send_status: %s,\n  scheduled_send.scheduled_send_creation_time: %s,\n  messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_sender_id: %s,\n  messages.messages_sender_send_destination: %s,\n  messages.messages_msisdn_receiving_rcs_message: %s,\n  messages.messages_receiving_network_country: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_queue_insert_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_message_report_status: %s,\n  messages.messages_seen: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_message_uri: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_sms_message_size: %s,\n  messages.messages_mms_subject: %s,\n  messages.messages_mms_transaction_id: %s,\n  messages.messages_mms_content_location: %s,\n  messages.messages_mms_expiry: %s,\n  messages.messages_rcs_expiry: %s,\n  messages.messages_mms_retrieve_text: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_self_id: %s,\n  messages.messages_my_identity_foreign_key: %s,\n  messages.messages_retry_start_timestamp: %s,\n  messages.messages_cloud_sync_id: %s,\n  messages.messages_rcs_message_id_with_text_type: %s,\n  messages.messages_etouffee_status: %s,\n  messages.messages_verification_status: %s,\n  messages.messages_rcs_ui_status: %s,\n  messages.messages_is_hidden: %s,\n  messages.messages_rcs_remote_instance: %s,\n  messages.messages_rcs_file_transfer_session_id: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  messages.messages_correlation_id: %s,\n  messages.messages_cms_id: %s,\n  messages.messages_cms_last_mod_seq: %s,\n  messages.messages_web_id: %s,\n  messages.messages_usage_stats_logging_id: %s,\n  messages.messages_send_counter: %s,\n  messages.messages_original_rcs_message_id: %s,\n  messages.messages_custom_delivery_receipt_mime_type: %s,\n  messages.messages_custom_delivery_receipt_content: %s,\n  messages.messages_report_attempt_acounter: %s,\n  messages.messages_custom_headers: %s,\n  messages.messages_cms_correlation_id: %s,\n  messages.messages_group_private_participant: %s,\n  messages.messages_original_message_id: %s,\n  messages.messages_awaiting_reverse_sync: %s,\n  messages.messages_old_sms_message_uri: %s,\n  messages.messages_draft_id: %s,\n  messages.messages_result_code: %s,\n  messages.messages_cms_life_cycle: %s,\n  messages.messages_mute_priority: %s,\n  messages.messages_fallback_reason: %s,\n  messages.messages_auto_retry_counter: %s,\n  messages.messages_can_revoke_before_delivered_with_rcs: %s,\n  messages.messages_trace_id: %s,\n  messages.messages_outgoing_delivery_report_status: %s,\n  messages.messages_outgoing_read_report_status: %s,\n  messages.messages_xms_transport: %s,\n  messages.messages_message_original_protocol: %s,\n  messages.messages_satellite_datagram_id: %s,\n  messages.messages_encryption_protocol: %s,\n  messages.messages_message_persistence_id: %s,\n  parts.parts__id: %s,\n  parts.parts_message_id: %s,\n  parts.parts_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_original_uri: %s,\n  parts.parts_storage_uri: %s,\n  parts.parts_width: %s,\n  parts.parts_height: %s,\n  parts.parts_timestamp: %s,\n  parts.parts_output_uri: %s,\n  parts.parts_target_size: %s,\n  parts.parts_processing_status: %s,\n  parts.parts_cms_attachment_processing_status: %s,\n  parts.parts_conversation_id: %s,\n  parts.parts_sticker_set_id: %s,\n  parts.parts_sticker_id: %s,\n  parts.parts_media_modified_timestamp: %s,\n  parts.parts_longitude: %s,\n  parts.parts_latitude: %s,\n  parts.parts_preview_content_uri: %s,\n  parts.parts_preview_content_type: %s,\n  parts.parts_fallback_uri: %s,\n  parts.parts_source: %s,\n  parts.parts_bundle_index: %s,\n  parts.parts_blob_id: %s,\n  parts.parts_blob_gaia_email: %s,\n  parts.parts_cms_full_size_blob_id: %s,\n  parts.parts_cms_media_encryption_key: %s,\n  parts.parts_cms_compressed_media_encryption_key: %s,\n  parts.parts_blob_upload_permanent_failure: %s,\n  parts.parts_blob_upload_timestamp: %s,\n  parts.parts_expressive_sticker_name: %s,\n  parts.parts_file_name: %s,\n  parts.parts_duration: %s,\n  parts.parts_compressed_blob_id: %s,\n  parts.parts_cms_compressed_blob_id: %s,\n  parts.parts_compressed_blob_upload_permanent_failure: %s,\n  parts.parts_compressed_blob_upload_timestamp: %s,\n  parts.parts_media_encryption_key: %s,\n  parts.parts_compressed_media_encryption_key: %s,\n  parts.parts_missing_entry_in_telephony: %s,\n  parts.parts_awaiting_reverse_sync: %s,\n  parts.parts_file_size_bytes: %s,\n  parts.parts_local_cache_path: %s,\n  parts.parts_media_send_type: %s,\n  parts.parts_voice_metadata: %s,\n  parts.parts_validation_status: %s,\n  parts.parts_processing_id: %s,\n  parts.parts_rich_card_media_download_failure_reason: %s,\n  parts.parts_image_display_state: %s,\n  parts.parts_preserve_size: %s,\n  parts.parts_rowid: %s,\n  message_captions.message_captions_caption: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, valueOf46, valueOf47, valueOf48, valueOf49, valueOf50, valueOf51, concat, valueOf52, valueOf53, valueOf54, valueOf55, valueOf56, valueOf57, valueOf58, valueOf59, valueOf60, valueOf61, valueOf62, valueOf63, valueOf64, valueOf65, valueOf66, valueOf67, valueOf68, valueOf69, valueOf70, valueOf71, valueOf72, valueOf73, aL, valueOf74, aL2, aK, aL3, aK2, aK3, aI, aI2, valueOf75, valueOf76, aJ, valueOf77, aK4, valueOf78, valueOf79, valueOf80, valueOf81, valueOf82, valueOf83, aK5, valueOf84, aK6, aI3, aI4, aL4, "REDACTED", valueOf85, concat2, "BLOB".concat(String.valueOf(bArr3 != null ? String.valueOf(bArr3.length) : "NULL")), aM(this.bd), aJ(this.be), aL(this.bf), aL(this.bg), aJ(this.bh), aL(this.bi), String.valueOf(this.bj), aM(this.bk), aJ(this.bl), aK(this.bm), aK(this.bn), aM(this.bo), String.valueOf(this.bp), String.valueOf(this.bq), String.valueOf(this.br), String.valueOf(this.bs), String.valueOf(this.bt), String.valueOf(this.bu), String.valueOf(this.bv), String.valueOf(this.bw), String.valueOf(this.bx), String.valueOf(this.by), aJ(this.bz), String.valueOf(this.bA));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        cogq.c().intValue();
    }

    @Override // defpackage.dtro
    protected final /* synthetic */ void c(dtsu dtsuVar) {
        dteh dtehVar;
        fjay fjayVar;
        cogj cogjVar = (cogj) ((cogi) dtsuVar);
        aB();
        this.cL = cogjVar.cU();
        if (cogjVar.di(0)) {
            this.d = cogjVar.getString(cogjVar.cM(0, cogq.a));
            fY(0);
        }
        if (cogjVar.di(1)) {
            this.e = new MessageIdType(cogjVar.getLong(cogjVar.cM(1, cogq.a)));
            fY(1);
        }
        if (cogjVar.di(2)) {
            this.f = cogjVar.h();
            fY(2);
        }
        if (cogjVar.di(3)) {
            this.g = bdgw.b(cogjVar.getLong(cogjVar.cM(3, cogq.a)));
            fY(3);
        }
        if (cogjVar.di(4)) {
            coiu[] values = coiu.values();
            int i = cogjVar.getInt(cogjVar.cM(4, cogq.a));
            if (i >= values.length) {
                throw new IllegalArgumentException();
            }
            this.h = values[i];
            fY(4);
        }
        if (cogjVar.di(5)) {
            this.i = cogjVar.l();
            fY(5);
        }
        if (cogjVar.di(6)) {
            this.j = new MessageIdType(cogjVar.getLong(cogjVar.cM(6, cogq.a)));
            fY(6);
        }
        if (cogjVar.di(7)) {
            this.k = cogjVar.f();
            fY(7);
        }
        if (cogjVar.di(8)) {
            this.l = cogjVar.getString(cogjVar.cM(8, cogq.a));
            fY(8);
        }
        if (cogjVar.di(9)) {
            this.m = cogjVar.getString(cogjVar.cM(9, cogq.a));
            fY(9);
        }
        if (cogjVar.di(10)) {
            this.n = cogjVar.getString(cogjVar.cM(10, cogq.a));
            fY(10);
        }
        if (cogjVar.di(11)) {
            this.o = cogjVar.getString(cogjVar.cM(11, cogq.a));
            fY(11);
        }
        if (cogjVar.di(12)) {
            this.p = cogjVar.getLong(cogjVar.cM(12, cogq.a));
            fY(12);
        }
        if (cogjVar.di(13)) {
            this.q = bdgw.b(cogjVar.getLong(cogjVar.cM(13, cogq.a)));
            fY(13);
        }
        if (cogjVar.di(14)) {
            this.r = cogjVar.getLong(cogjVar.cM(14, cogq.a));
            fY(14);
        }
        if (cogjVar.di(15)) {
            this.s = cogjVar.getInt(cogjVar.cM(15, cogq.a));
            fY(15);
        }
        if (cogjVar.di(16)) {
            this.t = cogjVar.getInt(cogjVar.cM(16, cogq.a));
            fY(16);
        }
        if (cogjVar.di(17)) {
            this.u = cogjVar.getInt(cogjVar.cM(17, cogq.a));
            fY(17);
        }
        if (cogjVar.di(18)) {
            this.v = cogjVar.getInt(cogjVar.cM(18, cogq.a)) == 1;
            fY(18);
        }
        if (cogjVar.di(19)) {
            this.w = cogjVar.getInt(cogjVar.cM(19, cogq.a)) == 1;
            fY(19);
        }
        if (cogjVar.di(20)) {
            String string = cogjVar.getString(cogjVar.cM(20, cogq.a));
            this.x = string == null ? null : Uri.parse(string);
            fY(20);
        }
        if (cogjVar.di(21)) {
            this.y = cogjVar.getInt(cogjVar.cM(21, cogq.a));
            fY(21);
        }
        if (cogjVar.di(22)) {
            this.z = cogjVar.getLong(cogjVar.cM(22, cogq.a));
            fY(22);
        }
        if (cogjVar.di(23)) {
            this.A = cuxs.a(cogjVar.getString(cogjVar.cM(23, cogq.a)));
            fY(23);
        }
        if (cogjVar.di(24)) {
            this.B = cogjVar.getString(cogjVar.cM(24, cogq.a));
            fY(24);
        }
        if (cogjVar.di(25)) {
            this.C = cogjVar.getString(cogjVar.cM(25, cogq.a));
            fY(25);
        }
        if (cogjVar.di(26)) {
            this.D = cogjVar.getLong(cogjVar.cM(26, cogq.a));
            fY(26);
        }
        if (cogjVar.di(27)) {
            this.E = cogjVar.getLong(cogjVar.cM(27, cogq.a));
            fY(27);
        }
        if (cogjVar.di(28)) {
            this.F = cogjVar.getString(cogjVar.cM(28, cogq.a));
            fY(28);
        }
        if (cogjVar.di(29)) {
            this.G = cogjVar.getInt(cogjVar.cM(29, cogq.a));
            fY(29);
        }
        if (cogjVar.di(30)) {
            this.H = cogjVar.getString(cogjVar.cM(30, cogq.a));
            fY(30);
        }
        if (cogjVar.di(31)) {
            this.I = azsv.a(cogjVar.getString(cogjVar.cM(31, cogq.a)));
            fY(31);
        }
        if (cogjVar.di(32)) {
            this.J = cogjVar.getLong(cogjVar.cM(32, cogq.a));
            fY(32);
        }
        if (cogjVar.di(33)) {
            this.K = cogjVar.p();
            fY(33);
        }
        if (cogjVar.di(34)) {
            this.L = bdhg.a(cogjVar.getString(cogjVar.cM(34, cogq.a)));
            fY(34);
        }
        if (cogjVar.di(35)) {
            this.M = cogjVar.getInt(cogjVar.cM(35, cogq.a));
            fY(35);
        }
        if (cogjVar.di(36)) {
            byzi[] values2 = byzi.values();
            int i2 = cogjVar.getInt(cogjVar.cM(36, cogq.a));
            if (i2 >= values2.length) {
                throw new IllegalArgumentException();
            }
            this.N = values2[i2];
            fY(36);
        }
        if (cogjVar.di(37)) {
            this.O = cogjVar.getInt(cogjVar.cM(37, cogq.a));
            fY(37);
        }
        if (cogjVar.di(38)) {
            this.P = cogjVar.getInt(cogjVar.cM(38, cogq.a)) == 1;
            fY(38);
        }
        if (cogjVar.di(39)) {
            this.Q = cogjVar.getString(cogjVar.cM(39, cogq.a));
            fY(39);
        }
        if (cogjVar.di(40)) {
            this.R = cogjVar.getLong(cogjVar.cM(40, cogq.a));
            fY(40);
        }
        if (cogjVar.di(41)) {
            this.S = cogjVar.getInt(cogjVar.cM(41, cogq.a));
            fY(41);
        }
        if (cogjVar.di(42)) {
            this.T = cogjVar.getString(cogjVar.cM(42, cogq.a));
            fY(42);
        }
        if (cogjVar.di(43)) {
            this.U = cogjVar.u();
            fY(43);
        }
        if (cogjVar.di(44)) {
            this.V = cogjVar.t();
            fY(44);
        }
        if (cogjVar.di(45)) {
            this.W = cogjVar.e();
            fY(45);
        }
        if (cogjVar.di(46)) {
            this.X = cogjVar.getString(cogjVar.cM(46, cogq.a));
            fY(46);
        }
        if (cogjVar.di(47)) {
            this.Y = cogjVar.getLong(cogjVar.cM(47, cogq.a));
            fY(47);
        }
        if (cogjVar.di(48)) {
            this.Z = cogjVar.getLong(cogjVar.cM(48, cogq.a));
            fY(48);
        }
        if (cogjVar.di(49)) {
            this.aa = bdhg.a(cogjVar.getString(cogjVar.cM(49, cogq.a)));
            fY(49);
        }
        if (cogjVar.di(50)) {
            this.ab = cogjVar.v();
            fY(50);
        }
        if (cogjVar.di(51)) {
            this.ac = cogjVar.B();
            fY(51);
        }
        if (cogjVar.di(52)) {
            this.ad = cogjVar.getLong(cogjVar.cM(52, cogq.a));
            fY(52);
        }
        if (cogjVar.di(53)) {
            this.ae = cogjVar.k();
            fY(53);
        }
        if (cogjVar.di(54)) {
            this.af = cogjVar.r();
            fY(54);
        }
        if (cogjVar.di(55)) {
            this.ag = cogjVar.getString(cogjVar.cM(55, cogq.a));
            fY(55);
        }
        if (cogjVar.di(56)) {
            this.ah = new MessageIdType(cogjVar.getLong(cogjVar.cM(56, cogq.a)));
            fY(56);
        }
        if (cogjVar.di(57)) {
            this.ai = cogjVar.w();
            fY(57);
        }
        if (cogjVar.di(58)) {
            String string2 = cogjVar.getString(cogjVar.cM(58, cogq.a));
            this.aj = string2 == null ? null : Uri.parse(string2);
            fY(58);
        }
        if (cogjVar.di(59)) {
            this.ak = cogjVar.m();
            fY(59);
        }
        if (cogjVar.di(60)) {
            this.al = cogjVar.getInt(cogjVar.cM(60, cogq.a));
            fY(60);
        }
        if (cogjVar.di(61)) {
            this.am = cogjVar.j();
            fY(61);
        }
        if (cogjVar.di(62)) {
            cjco[] values3 = cjco.values();
            int i3 = cogjVar.getInt(cogjVar.cM(62, cogq.a));
            if (i3 >= values3.length) {
                throw new IllegalArgumentException();
            }
            this.an = values3[i3];
            fY(62);
        }
        if (cogjVar.di(63)) {
            this.ao = cogjVar.i();
            fY(63);
        }
        if (cogjVar.di(64)) {
            this.ap = cogjVar.c();
            fY(64);
        }
        if (cogjVar.di(65)) {
            this.aq = cogjVar.y();
            fY(65);
        }
        if (cogjVar.di(66)) {
            byte[] blob = cogjVar.getBlob(cogjVar.cM(66, cogq.a));
            if (blob == null) {
                fjayVar = null;
            } else {
                try {
                    fjayVar = (fjay) eyfy.parseFrom(fjay.a, blob, eyfc.a());
                } catch (Throwable unused) {
                    fjayVar = fjay.a;
                }
            }
            this.ar = fjayVar;
            fY(66);
        }
        if (cogjVar.di(67)) {
            byzg[] values4 = byzg.values();
            int i4 = cogjVar.getInt(cogjVar.cM(67, cogq.a));
            if (i4 >= values4.length) {
                throw new IllegalArgumentException();
            }
            this.as = values4[i4];
            fY(67);
        }
        if (cogjVar.di(68)) {
            byzg[] values5 = byzg.values();
            int i5 = cogjVar.getInt(cogjVar.cM(68, cogq.a));
            if (i5 >= values5.length) {
                throw new IllegalArgumentException();
            }
            this.at = values5[i5];
            fY(68);
        }
        if (cogjVar.di(69)) {
            byzl[] values6 = byzl.values();
            int i6 = cogjVar.getInt(cogjVar.cM(69, cogq.a));
            if (i6 >= values6.length) {
                throw new IllegalArgumentException();
            }
            this.au = values6[i6];
            fY(69);
        }
        if (cogjVar.di(70)) {
            this.av = cogjVar.getInt(cogjVar.cM(70, cogq.a));
            fY(70);
        }
        if (cogjVar.di(71)) {
            this.aw = new bdgr(cogjVar.getString(cogjVar.cM(71, cogq.a)));
            fY(71);
        }
        if (cogjVar.di(72)) {
            this.ax = new cfmh(cogjVar.getLong(cogjVar.cM(72, cogq.a)));
            fY(72);
        }
        if (cogjVar.di(73)) {
            this.ay = bdhj.a(cogjVar.getString(cogjVar.cM(73, cogq.a)));
            fY(73);
        }
        if (cogjVar.di(74)) {
            this.az = (String[]) dtub.C(null, cogj.dt(cogjVar.getString(cogjVar.cM(74, cogq.a))), new String[0]);
            fY(74);
        }
        if (cogjVar.di(75)) {
            this.aA = new MessageIdType(cogjVar.getLong(cogjVar.cM(75, cogq.a)));
            fY(75);
        }
        if (cogjVar.di(76)) {
            String[] dt = cogj.dt(cogjVar.getString(cogjVar.cM(76, cogq.a)));
            for (int i7 = 0; i7 < dt.length; i7++) {
                dt[i7] = cuxs.a(dt[i7]);
            }
            this.aB = (String[]) dtub.C(null, dt, new String[0]);
            fY(76);
        }
        if (cogjVar.di(77)) {
            String[] dt2 = cogj.dt(cogjVar.getString(cogjVar.cM(77, cogq.a)));
            int length = dt2.length;
            Uri[] uriArr = new Uri[length];
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                String str = dt2[i8];
                int i10 = i9 + 1;
                uriArr[i9] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                i8++;
                i9 = i10;
            }
            this.aC = (Uri[]) dtub.C(null, uriArr, new Uri[0]);
            fY(77);
        }
        if (cogjVar.di(78)) {
            this.aD = cogjVar.K();
            fY(78);
        }
        if (cogjVar.di(79)) {
            String[] dt3 = cogj.dt(cogjVar.getString(cogjVar.cM(79, cogq.a)));
            int length2 = dt3.length;
            Uri[] uriArr2 = new Uri[length2];
            int i11 = 0;
            int i12 = 0;
            while (i11 < length2) {
                String str2 = dt3[i11];
                int i13 = i12 + 1;
                uriArr2[i12] = (str2 == null || str2.length() == 0) ? null : Uri.parse(str2);
                i11++;
                i12 = i13;
            }
            this.aE = (Uri[]) dtub.C(null, uriArr2, new Uri[0]);
            fY(79);
        }
        if (cogjVar.di(80)) {
            String[] dt4 = cogj.dt(cogjVar.getString(cogjVar.cM(80, cogq.a)));
            int length3 = dt4.length;
            Uri[] uriArr3 = new Uri[length3];
            int i14 = 0;
            int i15 = 0;
            while (i14 < length3) {
                String str3 = dt4[i14];
                int i16 = i15 + 1;
                uriArr3[i15] = (str3 == null || str3.length() == 0) ? null : Uri.parse(str3);
                i14++;
                i15 = i16;
            }
            this.aF = (Uri[]) dtub.C(null, uriArr3, new Uri[0]);
            fY(80);
        }
        if (cogjVar.di(81)) {
            this.aG = dtub.z(null, cogj.dr(cogjVar.getString(cogjVar.cM(81, cogq.a))));
            fY(81);
        }
        if (cogjVar.di(82)) {
            this.aH = dtub.z(null, cogj.dr(cogjVar.getString(cogjVar.cM(82, cogq.a))));
            fY(82);
        }
        if (cogjVar.di(83)) {
            this.aI = cogjVar.getLong(cogjVar.cM(83, cogq.a));
            fY(83);
        }
        if (cogjVar.di(84)) {
            String string3 = cogjVar.getString(cogjVar.cM(84, cogq.a));
            this.aJ = string3 == null ? null : Uri.parse(string3);
            fY(84);
        }
        if (cogjVar.di(85)) {
            this.aK = dtub.B(null, cogj.ds(cogjVar.getString(cogjVar.cM(85, cogq.a))));
            fY(85);
        }
        if (cogjVar.di(86)) {
            byzc[] values7 = byzc.values();
            int i17 = cogjVar.getInt(cogjVar.cM(86, cogq.a));
            if (i17 >= values7.length) {
                throw new IllegalArgumentException();
            }
            this.aL = values7[i17];
            fY(86);
        }
        if (cogjVar.di(87)) {
            this.aM = cogjVar.H();
            fY(87);
        }
        if (cogjVar.di(88)) {
            this.aN = cogjVar.g();
            fY(88);
        }
        if (cogjVar.di(89)) {
            this.aO = byyo.a(cogjVar.getString(cogjVar.cM(89, cogq.a)));
            fY(89);
        }
        if (cogjVar.di(90)) {
            this.aP = byyo.a(cogjVar.getString(cogjVar.cM(90, cogq.a)));
            fY(90);
        }
        if (cogjVar.di(91)) {
            this.aQ = cogjVar.getLong(cogjVar.cM(91, cogq.a));
            fY(91);
        }
        if (cogjVar.di(92)) {
            this.aR = cogjVar.getDouble(cogjVar.cM(92, cogq.a));
            fY(92);
        }
        if (cogjVar.di(93)) {
            this.aS = cogjVar.getDouble(cogjVar.cM(93, cogq.a));
            fY(93);
        }
        if (cogjVar.di(94)) {
            String[] dt5 = cogj.dt(cogjVar.getString(cogjVar.cM(94, cogq.a)));
            int length4 = dt5.length;
            Uri[] uriArr4 = new Uri[length4];
            int i18 = 0;
            int i19 = 0;
            while (i18 < length4) {
                String str4 = dt5[i18];
                int i20 = i19 + 1;
                uriArr4[i19] = (str4 == null || str4.length() == 0) ? null : Uri.parse(str4);
                i18++;
                i19 = i20;
            }
            this.aT = (Uri[]) dtub.C(null, uriArr4, new Uri[0]);
            fY(94);
        }
        if (cogjVar.di(95)) {
            this.aU = cogjVar.getString(cogjVar.cM(95, cogq.a));
            fY(95);
        }
        if (cogjVar.di(96)) {
            this.aV = cogjVar.G();
            fY(96);
        }
        if (cogjVar.di(97)) {
            this.aW = dtub.z(null, cogj.dr(cogjVar.getString(cogjVar.cM(97, cogq.a))));
            fY(97);
        }
        if (cogjVar.di(98)) {
            this.aX = cogjVar.C();
            fY(98);
        }
        if (cogjVar.di(99)) {
            this.aY = cogjVar.I();
            fY(99);
        }
        if (cogjVar.di(100)) {
            this.aZ = cogjVar.n();
            fY(100);
        }
        if (cogjVar.di(EnergyProfile.EVCONNECTOR_TYPE_OTHER)) {
            this.ba = cogjVar.s();
            fY(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
        }
        if (cogjVar.di(102)) {
            this.bb = cogjVar.A();
            fY(102);
        }
        if (cogjVar.di(103)) {
            this.bc = cogjVar.z();
            fY(103);
        }
        if (cogjVar.di(104)) {
            this.bd = cogjVar.N();
            fY(104);
        }
        if (cogjVar.di(105)) {
            this.be = cogjVar.D();
            fY(105);
        }
        if (cogjVar.di(106)) {
            this.bf = cogjVar.L();
            fY(106);
        }
        if (cogjVar.di(107)) {
            this.bg = cogjVar.M();
            fY(107);
        }
        if (cogjVar.di(108)) {
            this.bh = cogjVar.F();
            fY(108);
        }
        if (cogjVar.di(109)) {
            this.bi = cogjVar.J();
            fY(109);
        }
        if (cogjVar.di(110)) {
            this.bj = cogjVar.q();
            fY(110);
        }
        if (cogjVar.di(111)) {
            this.bk = cogjVar.O();
            fY(111);
        }
        if (cogjVar.di(112)) {
            this.bl = cogjVar.E();
            fY(112);
        }
        if (cogjVar.di(113)) {
            this.bm = dtub.E(null, cogj.dC(cogjVar.getString(cogjVar.cM(113, cogq.a))));
            fY(113);
        }
        if (cogjVar.di(114)) {
            this.bn = cogjVar.P();
            fY(114);
        }
        if (cogjVar.di(115)) {
            this.bo = dtub.D(null, cogj.du(cogjVar.getString(cogjVar.cM(115, cogq.a))));
            fY(115);
        }
        if (cogjVar.di(116)) {
            this.bp = cogjVar.x();
            fY(116);
        }
        if (cogjVar.di(117)) {
            this.bq = cogjVar.getLong(cogjVar.cM(117, cogq.a));
            fY(117);
        }
        if (cogjVar.di(118)) {
            this.br = cogjVar.getString(cogjVar.cM(118, cogq.a));
            fY(118);
        }
        if (cogjVar.di(119)) {
            byza[] values8 = byza.values();
            int i21 = cogjVar.getInt(cogjVar.cM(119, cogq.a));
            if (i21 >= values8.length) {
                throw new IllegalArgumentException();
            }
            this.bs = values8[i21];
            fY(119);
        }
        if (cogjVar.di(120)) {
            byte[] blob2 = cogjVar.getBlob(cogjVar.cM(120, cogq.a));
            if (blob2 == null) {
                dtehVar = null;
            } else {
                try {
                    dtehVar = (dteh) eyfy.parseFrom(dteh.a, blob2, eyfc.a());
                } catch (Throwable unused2) {
                    dtehVar = dteh.a;
                }
            }
            this.bt = dtehVar;
            fY(120);
        }
        if (cogjVar.di(121)) {
            byzo[] values9 = byzo.values();
            int i22 = cogjVar.getInt(cogjVar.cM(121, cogq.a));
            if (i22 >= values9.length) {
                throw new IllegalArgumentException();
            }
            this.bu = values9[i22];
            fY(121);
        }
        if (cogjVar.di(122)) {
            this.bv = awao.a(cogjVar.getString(cogjVar.cM(122, cogq.a)));
            fY(122);
        }
        if (cogjVar.di(123)) {
            byzh[] values10 = byzh.values();
            int i23 = cogjVar.getInt(cogjVar.cM(123, cogq.a));
            if (i23 >= values10.length) {
                throw new IllegalArgumentException();
            }
            this.bw = values10[i23];
            fY(123);
        }
        if (cogjVar.di(124)) {
            byyz[] values11 = byyz.values();
            int i24 = cogjVar.getInt(cogjVar.cM(124, cogq.a));
            if (i24 >= values11.length) {
                throw new IllegalArgumentException();
            }
            this.bx = values11[i24];
            fY(124);
        }
        if (cogjVar.di(125)) {
            this.by = cogjVar.getInt(cogjVar.cM(125, cogq.a)) == 1;
            fY(125);
        }
        if (cogjVar.di(126)) {
            this.bz = dtub.B(null, cogj.ds(cogjVar.getString(cogjVar.cM(126, cogq.a))));
            fY(126);
        }
        if (cogjVar.di(127)) {
            this.bA = cogjVar.o();
            fY(127);
        }
        g();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cnvv)) {
            return false;
        }
        cnvv cnvvVar = (cnvv) obj;
        return super.aD(cnvvVar.cL) && Objects.equals(this.d, cnvvVar.d) && Objects.equals(this.e, cnvvVar.e) && Objects.equals(this.f, cnvvVar.f) && Objects.equals(this.g, cnvvVar.g) && this.h == cnvvVar.h && Objects.equals(this.i, cnvvVar.i) && Objects.equals(this.j, cnvvVar.j) && Objects.equals(this.k, cnvvVar.k) && Objects.equals(this.l, cnvvVar.l) && Objects.equals(this.m, cnvvVar.m) && Objects.equals(this.n, cnvvVar.n) && Objects.equals(this.o, cnvvVar.o) && this.p == cnvvVar.p && Objects.equals(this.q, cnvvVar.q) && this.r == cnvvVar.r && this.s == cnvvVar.s && this.t == cnvvVar.t && this.u == cnvvVar.u && this.v == cnvvVar.v && this.w == cnvvVar.w && Objects.equals(this.x, cnvvVar.x) && this.y == cnvvVar.y && this.z == cnvvVar.z && Objects.equals(this.A, cnvvVar.A) && Objects.equals(this.B, cnvvVar.B) && Objects.equals(this.C, cnvvVar.C) && this.D == cnvvVar.D && this.E == cnvvVar.E && Objects.equals(this.F, cnvvVar.F) && this.G == cnvvVar.G && Objects.equals(this.H, cnvvVar.H) && Objects.equals(this.I, cnvvVar.I) && this.J == cnvvVar.J && Objects.equals(this.K, cnvvVar.K) && Objects.equals(this.L, cnvvVar.L) && this.M == cnvvVar.M && this.N == cnvvVar.N && this.O == cnvvVar.O && this.P == cnvvVar.P && Objects.equals(this.Q, cnvvVar.Q) && this.R == cnvvVar.R && this.S == cnvvVar.S && Objects.equals(this.T, cnvvVar.T) && Objects.equals(this.U, cnvvVar.U) && Objects.equals(this.V, cnvvVar.V) && this.W == cnvvVar.W && Objects.equals(this.X, cnvvVar.X) && this.Y == cnvvVar.Y && this.Z == cnvvVar.Z && Objects.equals(this.aa, cnvvVar.aa) && Objects.equals(this.ab, cnvvVar.ab) && Arrays.equals(this.ac, cnvvVar.ac) && this.ad == cnvvVar.ad && Objects.equals(this.ae, cnvvVar.ae) && Objects.equals(this.af, cnvvVar.af) && Objects.equals(this.ag, cnvvVar.ag) && Objects.equals(this.ah, cnvvVar.ah) && this.ai == cnvvVar.ai && Objects.equals(this.aj, cnvvVar.aj) && Objects.equals(this.ak, cnvvVar.ak) && this.al == cnvvVar.al && this.am == cnvvVar.am && this.an == cnvvVar.an && this.ao == cnvvVar.ao && this.ap == cnvvVar.ap && this.aq == cnvvVar.aq && Objects.equals(this.ar, cnvvVar.ar) && this.as == cnvvVar.as && this.at == cnvvVar.at && this.au == cnvvVar.au && this.av == cnvvVar.av && Objects.equals(this.aw, cnvvVar.aw) && Objects.equals(this.ax, cnvvVar.ax) && Objects.equals(this.ay, cnvvVar.ay) && Arrays.equals(this.az, cnvvVar.az) && Objects.equals(this.aA, cnvvVar.aA) && Arrays.equals(this.aB, cnvvVar.aB) && Arrays.equals(this.aC, cnvvVar.aC) && Arrays.equals(this.aD, cnvvVar.aD) && Arrays.equals(this.aE, cnvvVar.aE) && Arrays.equals(this.aF, cnvvVar.aF) && Arrays.equals(this.aG, cnvvVar.aG) && Arrays.equals(this.aH, cnvvVar.aH) && this.aI == cnvvVar.aI && Objects.equals(this.aJ, cnvvVar.aJ) && Arrays.equals(this.aK, cnvvVar.aK) && this.aL == cnvvVar.aL && Arrays.equals(this.aM, cnvvVar.aM) && Objects.equals(this.aN, cnvvVar.aN) && Objects.equals(this.aO, cnvvVar.aO) && Objects.equals(this.aP, cnvvVar.aP) && this.aQ == cnvvVar.aQ && this.aR == cnvvVar.aR && this.aS == cnvvVar.aS && Arrays.equals(this.aT, cnvvVar.aT) && Objects.equals(this.aU, cnvvVar.aU) && Arrays.equals(this.aV, cnvvVar.aV) && Arrays.equals(this.aW, cnvvVar.aW) && Arrays.equals(this.aX, cnvvVar.aX) && Arrays.equals(this.aY, cnvvVar.aY) && Objects.equals(this.aZ, cnvvVar.aZ) && Objects.equals(this.ba, cnvvVar.ba) && Arrays.equals(this.bb, cnvvVar.bb) && Arrays.equals(this.bc, cnvvVar.bc) && Arrays.equals(this.bd, cnvvVar.bd) && Arrays.equals(this.be, cnvvVar.be) && Arrays.equals(this.bf, cnvvVar.bf) && Arrays.equals(this.bg, cnvvVar.bg) && Arrays.equals(this.bh, cnvvVar.bh) && Arrays.equals(this.bi, cnvvVar.bi) && Objects.equals(this.bj, cnvvVar.bj) && Arrays.equals(this.bk, cnvvVar.bk) && Arrays.equals(this.bl, cnvvVar.bl) && Arrays.deepEquals(this.bm, cnvvVar.bm) && Arrays.deepEquals(this.bn, cnvvVar.bn) && Arrays.equals(this.bo, cnvvVar.bo) && this.bp == cnvvVar.bp && this.bq == cnvvVar.bq && Objects.equals(this.br, cnvvVar.br) && this.bs == cnvvVar.bs && Objects.equals(this.bt, cnvvVar.bt) && this.bu == cnvvVar.bu && Objects.equals(this.bv, cnvvVar.bv) && this.bw == cnvvVar.bw && this.bx == cnvvVar.bx && this.by == cnvvVar.by && Arrays.equals(this.bz, cnvvVar.bz) && Objects.equals(this.bA, cnvvVar.bA);
    }

    public final String f() {
        az(127, "caption");
        return this.bA;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        String str = this.d;
        MessageIdType messageIdType = this.e;
        ConversationIdType conversationIdType = this.f;
        Instant instant = this.g;
        coiu coiuVar = this.h;
        Integer valueOf = Integer.valueOf(coiuVar == null ? 0 : coiuVar.ordinal());
        Instant instant2 = this.i;
        MessageIdType messageIdType2 = this.j;
        ConversationIdType conversationIdType2 = this.k;
        String str2 = this.l;
        String str3 = this.m;
        String str4 = this.n;
        String str5 = this.o;
        Long valueOf2 = Long.valueOf(this.p);
        Instant instant3 = this.q;
        Long valueOf3 = Long.valueOf(this.r);
        Integer valueOf4 = Integer.valueOf(this.s);
        dtsq dtsqVar3 = dtsqVar2;
        Integer valueOf5 = Integer.valueOf(this.t);
        Integer valueOf6 = Integer.valueOf(this.u);
        Boolean valueOf7 = Boolean.valueOf(this.v);
        Boolean valueOf8 = Boolean.valueOf(this.w);
        Uri uri = this.x;
        Integer valueOf9 = Integer.valueOf(this.y);
        Long valueOf10 = Long.valueOf(this.z);
        String str6 = this.A;
        String str7 = this.B;
        String str8 = this.C;
        Long valueOf11 = Long.valueOf(this.D);
        Long valueOf12 = Long.valueOf(this.E);
        String str9 = this.F;
        Integer valueOf13 = Integer.valueOf(this.G);
        String str10 = this.H;
        azsu azsuVar = this.I;
        Long valueOf14 = Long.valueOf(this.J);
        String str11 = this.K;
        bdhg bdhgVar = this.L;
        Integer valueOf15 = Integer.valueOf(this.M);
        byzi byziVar = this.N;
        Integer valueOf16 = Integer.valueOf(byziVar == null ? 0 : byziVar.ordinal());
        Integer valueOf17 = Integer.valueOf(this.O);
        Boolean valueOf18 = Boolean.valueOf(this.P);
        String str12 = this.Q;
        Long valueOf19 = Long.valueOf(this.R);
        Integer valueOf20 = Integer.valueOf(this.S);
        String str13 = this.T;
        String str14 = this.U;
        String str15 = this.V;
        Long valueOf21 = Long.valueOf(this.W);
        String str16 = this.X;
        Long valueOf22 = Long.valueOf(this.Y);
        Long valueOf23 = Long.valueOf(this.Z);
        bdhg bdhgVar2 = this.aa;
        String str17 = this.ab;
        Integer valueOf24 = Integer.valueOf(Arrays.hashCode(this.ac));
        Long valueOf25 = Long.valueOf(this.ad);
        fayv fayvVar = this.ae;
        String str18 = this.af;
        String str19 = this.ag;
        MessageIdType messageIdType3 = this.ah;
        Boolean valueOf26 = Boolean.valueOf(this.ai);
        Uri uri2 = this.aj;
        Optional optional = this.ak;
        Integer valueOf27 = Integer.valueOf(this.al);
        csgg csggVar = this.am;
        Integer valueOf28 = Integer.valueOf(csggVar == null ? 0 : csggVar.ordinal());
        cjco cjcoVar = this.an;
        Integer valueOf29 = Integer.valueOf(cjcoVar == null ? 0 : cjcoVar.ordinal());
        byyw byywVar = this.ao;
        Integer valueOf30 = Integer.valueOf(byywVar == null ? 0 : byywVar.ordinal());
        Integer valueOf31 = Integer.valueOf(this.ap);
        Boolean valueOf32 = Boolean.valueOf(this.aq);
        fjay fjayVar = this.ar;
        byzg byzgVar = this.as;
        Integer valueOf33 = Integer.valueOf(byzgVar == null ? 0 : byzgVar.ordinal());
        byzg byzgVar2 = this.at;
        Integer valueOf34 = Integer.valueOf(byzgVar2 == null ? 0 : byzgVar2.ordinal());
        byzl byzlVar = this.au;
        Integer valueOf35 = Integer.valueOf(byzlVar == null ? 0 : byzlVar.ordinal());
        Integer valueOf36 = Integer.valueOf(this.av);
        bdgr bdgrVar = this.aw;
        cfmh cfmhVar = this.ax;
        Optional optional2 = this.ay;
        Integer valueOf37 = Integer.valueOf(Arrays.hashCode(this.az));
        MessageIdType messageIdType4 = this.aA;
        Integer valueOf38 = Integer.valueOf(Arrays.hashCode(this.aB));
        Integer valueOf39 = Integer.valueOf(Arrays.hashCode(this.aC));
        Integer valueOf40 = Integer.valueOf(Arrays.hashCode(this.aD));
        Integer valueOf41 = Integer.valueOf(Arrays.hashCode(this.aE));
        Integer valueOf42 = Integer.valueOf(Arrays.hashCode(this.aF));
        Integer valueOf43 = Integer.valueOf(Arrays.hashCode(this.aG));
        Integer valueOf44 = Integer.valueOf(Arrays.hashCode(this.aH));
        Long valueOf45 = Long.valueOf(this.aI);
        Uri uri3 = this.aJ;
        Integer valueOf46 = Integer.valueOf(Arrays.hashCode(this.aK));
        byzc byzcVar = this.aL;
        Integer valueOf47 = Integer.valueOf(byzcVar == null ? 0 : byzcVar.ordinal());
        Integer valueOf48 = Integer.valueOf(Arrays.hashCode(this.aM));
        ConversationIdType conversationIdType3 = this.aN;
        byyp byypVar = this.aO;
        byyp byypVar2 = this.aP;
        Long valueOf49 = Long.valueOf(this.aQ);
        Double valueOf50 = Double.valueOf(this.aR);
        Double valueOf51 = Double.valueOf(this.aS);
        Integer valueOf52 = Integer.valueOf(Arrays.hashCode(this.aT));
        String str20 = this.aU;
        Integer valueOf53 = Integer.valueOf(Arrays.hashCode(this.aV));
        Integer valueOf54 = Integer.valueOf(Arrays.hashCode(this.aW));
        Integer valueOf55 = Integer.valueOf(Arrays.hashCode(this.aX));
        Integer valueOf56 = Integer.valueOf(Arrays.hashCode(this.aY));
        String str21 = this.aZ;
        String str22 = this.ba;
        Integer valueOf57 = Integer.valueOf(Arrays.hashCode(this.bb));
        Integer valueOf58 = Integer.valueOf(Arrays.hashCode(this.bc));
        Integer valueOf59 = Integer.valueOf(Arrays.hashCode(this.bd));
        Integer valueOf60 = Integer.valueOf(Arrays.hashCode(this.be));
        Integer valueOf61 = Integer.valueOf(Arrays.hashCode(this.bf));
        Integer valueOf62 = Integer.valueOf(Arrays.hashCode(this.bg));
        Integer valueOf63 = Integer.valueOf(Arrays.hashCode(this.bh));
        Integer valueOf64 = Integer.valueOf(Arrays.hashCode(this.bi));
        String str23 = this.bj;
        Integer valueOf65 = Integer.valueOf(Arrays.hashCode(this.bk));
        Integer valueOf66 = Integer.valueOf(Arrays.hashCode(this.bl));
        Integer valueOf67 = Integer.valueOf(Arrays.hashCode(this.bm));
        Integer valueOf68 = Integer.valueOf(Arrays.hashCode(this.bn));
        Integer valueOf69 = Integer.valueOf(Arrays.hashCode(this.bo));
        Boolean valueOf70 = Boolean.valueOf(this.bp);
        Long valueOf71 = Long.valueOf(this.bq);
        String str24 = this.br;
        byza byzaVar = this.bs;
        Integer valueOf72 = Integer.valueOf(byzaVar == null ? 0 : byzaVar.ordinal());
        dteh dtehVar = this.bt;
        byzo byzoVar = this.bu;
        Integer valueOf73 = Integer.valueOf(byzoVar == null ? 0 : byzoVar.ordinal());
        awap awapVar = this.bv;
        byzh byzhVar = this.bw;
        Integer valueOf74 = Integer.valueOf(byzhVar == null ? 0 : byzhVar.ordinal());
        byyz byyzVar = this.bx;
        return Objects.hash(dtsqVar3, str, messageIdType, conversationIdType, instant, valueOf, instant2, messageIdType2, conversationIdType2, str2, str3, str4, str5, valueOf2, instant3, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, uri, valueOf9, valueOf10, str6, str7, str8, valueOf11, valueOf12, str9, valueOf13, str10, azsuVar, valueOf14, str11, bdhgVar, valueOf15, valueOf16, valueOf17, valueOf18, str12, valueOf19, valueOf20, str13, str14, str15, valueOf21, str16, valueOf22, valueOf23, bdhgVar2, str17, valueOf24, valueOf25, fayvVar, str18, str19, messageIdType3, valueOf26, uri2, optional, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, fjayVar, valueOf33, valueOf34, valueOf35, valueOf36, bdgrVar, cfmhVar, optional2, valueOf37, messageIdType4, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, uri3, valueOf46, valueOf47, valueOf48, conversationIdType3, byypVar, byypVar2, valueOf49, valueOf50, valueOf51, valueOf52, str20, valueOf53, valueOf54, valueOf55, valueOf56, str21, str22, valueOf57, valueOf58, valueOf59, valueOf60, valueOf61, valueOf62, valueOf63, valueOf64, str23, valueOf65, valueOf66, valueOf67, valueOf68, valueOf69, valueOf70, valueOf71, str24, valueOf72, dtehVar, valueOf73, awapVar, valueOf74, Integer.valueOf(byyzVar == null ? 0 : byyzVar.ordinal()), Boolean.valueOf(this.by), Integer.valueOf(Arrays.hashCode(this.bz)), this.bA, null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ScheduledMessagesQuery -- REDACTED") : a();
    }
}
