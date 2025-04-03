package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bseh extends dtro<bskr, bsnz, bsob, bseh, bskq> implements dtrq<ConversationIdType> {
    public String A;
    public String F;
    public String I;
    public String J;
    public String K;
    public String T;
    public String U;
    public String Z;
    public String aa;
    public String ab;
    public byte[] ac;
    public ConversationIdType ai;
    public ConversationIdType aj;
    public ayhd ak;
    public csgg al;
    public String am;
    public Optional an;
    public Optional ao;
    public boolean ap;
    public boolean aq;
    public ckkz ar;
    public ckte as;
    public int at;
    public cfmh au;
    public cfmf av;
    public String aw;
    public Uri ax;
    public int ay;
    public String c;
    public String e;
    public String g;
    public String h;
    public Uri i;
    public String j;
    public String l;
    public String m;
    public Uri n;
    public String o;
    public String t;
    public String w;
    public String x;
    public String y;
    public String z;
    public ConversationIdType a = bdgq.a;
    public cpxu b = new cpxu();
    public byyy d = byyy.NAME_IS_AUTOMATIC;
    public MessageIdType f = bdhb.a;
    public boolean k = false;
    public int p = 0;
    public byyt q = byyt.UNARCHIVED;
    public long r = 0;
    public long s = 0;
    public long u = -1;
    public long v = -1;
    public azsu B = null;
    public azcr C = null;
    public int D = 0;
    public boolean E = true;
    public boolean G = true;
    public boolean H = false;
    public int L = 0;
    public long M = -1;
    public int N = 0;
    public int O = 0;
    public int P = 0;
    public boolean Q = false;
    public boolean R = false;
    public long S = 0;
    public boolean V = false;
    public int W = 0;
    public long X = 0;
    public long Y = 0;
    public long ad = 0;
    public long ae = -1;
    public boolean af = true;
    public cknh ag = new cknh(0);
    public boolean ah = false;

    protected bseh() {
        ConversationIdType conversationIdType = bdgq.a;
        this.ai = conversationIdType;
        this.aj = conversationIdType;
        this.ak = ayhd.b(0);
        this.al = csgg.UNKNOWN;
        this.an = bdhe.b(-1L);
        this.ao = bdhe.b(-1L);
        this.ap = false;
        this.aq = false;
        this.as = ckte.a;
        this.at = 0;
        this.au = new cfmh(0L);
        this.av = null;
    }

    public final ayhd A() {
        az(62, "error_state");
        return this.ak;
    }

    public final azcr B() {
        az(28, "destination_token");
        return this.C;
    }

    public final ConversationIdType C() {
        az(0, "_id");
        return this.a;
    }

    public final ConversationIdType D() {
        final dtve f = bsom.f();
        return new ConversationIdType(dtub.b(bsom.f(), "conversations", this, new Function() { // from class: bsdx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.S("conversations", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bsdz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                bseh.this.aj((Long) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }));
    }

    public final MessageIdType E() {
        az(5, "latest_message_id");
        return this.f;
    }

    public final bsel F() {
        bsem bsemVar = new bsem();
        BitSet bitSet = this.cJ;
        bsemVar.az = bitSet == null ? null : (BitSet) bitSet.clone();
        BitSet bitSet2 = bsemVar.az;
        if (bitSet2 == null || bitSet2.get(0)) {
            bsemVar.a = C();
        }
        BitSet bitSet3 = bsemVar.az;
        if (bitSet3 == null || bitSet3.get(1)) {
            bsemVar.b = M();
        }
        BitSet bitSet4 = bsemVar.az;
        if (bitSet4 == null || bitSet4.get(2)) {
            bsemVar.c = X();
        }
        BitSet bitSet5 = bsemVar.az;
        if (bitSet5 == null || bitSet5.get(3)) {
            bsemVar.d = H();
        }
        BitSet bitSet6 = bsemVar.az;
        if (bitSet6 == null || bitSet6.get(4)) {
            az(4, "subtitle");
            bsemVar.e = this.e;
        }
        BitSet bitSet7 = bsemVar.az;
        if (bitSet7 == null || bitSet7.get(5)) {
            bsemVar.f = E();
        }
        BitSet bitSet8 = bsemVar.az;
        if (bitSet8 == null || bitSet8.get(6)) {
            bsemVar.g = ag();
        }
        BitSet bitSet9 = bsemVar.az;
        if (bitSet9 == null || bitSet9.get(7)) {
            bsemVar.h = ah();
        }
        BitSet bitSet10 = bsemVar.az;
        if (bitSet10 == null || bitSet10.get(8)) {
            az(8, "preview_uri");
            bsemVar.i = this.i;
        }
        BitSet bitSet11 = bsemVar.az;
        if (bitSet11 == null || bitSet11.get(9)) {
            bsemVar.j = ab();
        }
        BitSet bitSet12 = bsemVar.az;
        if (bitSet12 == null || bitSet12.get(10)) {
            bsemVar.k = as();
        }
        BitSet bitSet13 = bsemVar.az;
        if (bitSet13 == null || bitSet13.get(11)) {
            bsemVar.l = U();
        }
        BitSet bitSet14 = bsemVar.az;
        if (bitSet14 == null || bitSet14.get(12)) {
            bsemVar.m = V();
        }
        BitSet bitSet15 = bsemVar.az;
        if (bitSet15 == null || bitSet15.get(13)) {
            bsemVar.n = y();
        }
        BitSet bitSet16 = bsemVar.az;
        if (bitSet16 == null || bitSet16.get(14)) {
            bsemVar.o = T();
        }
        BitSet bitSet17 = bsemVar.az;
        if (bitSet17 == null || bitSet17.get(15)) {
            bsemVar.p = l();
        }
        BitSet bitSet18 = bsemVar.az;
        if (bitSet18 == null || bitSet18.get(16)) {
            bsemVar.q = G();
        }
        BitSet bitSet19 = bsemVar.az;
        if (bitSet19 == null || bitSet19.get(17)) {
            bsemVar.r = x();
        }
        BitSet bitSet20 = bsemVar.az;
        if (bitSet20 == null || bitSet20.get(18)) {
            az(18, "last_read_timestamp");
            bsemVar.s = this.s;
        }
        BitSet bitSet21 = bsemVar.az;
        if (bitSet21 == null || bitSet21.get(19)) {
            bsemVar.t = W();
        }
        BitSet bitSet22 = bsemVar.az;
        if (bitSet22 == null || bitSet22.get(20)) {
            az(20, "participant_contact_id");
            bsemVar.u = this.u;
        }
        BitSet bitSet23 = bsemVar.az;
        if (bitSet23 == null || bitSet23.get(21)) {
            az(21, "normalized_participant_contact_id");
            bsemVar.v = this.v;
        }
        BitSet bitSet24 = bsemVar.az;
        if (bitSet24 == null || bitSet24.get(22)) {
            az(22, "participant_lookup_key");
            bsemVar.w = this.w;
        }
        BitSet bitSet25 = bsemVar.az;
        if (bitSet25 == null || bitSet25.get(23)) {
            az(23, "normalized_participant_lookup_key");
            bsemVar.x = this.x;
        }
        BitSet bitSet26 = bsemVar.az;
        if (bitSet26 == null || bitSet26.get(24)) {
            bsemVar.y = aa();
        }
        BitSet bitSet27 = bsemVar.az;
        if (bitSet27 == null || bitSet27.get(25)) {
            az(25, "participant_comparable_destination");
            bsemVar.z = this.z;
        }
        BitSet bitSet28 = bsemVar.az;
        if (bitSet28 == null || bitSet28.get(26)) {
            bsemVar.A = S();
        }
        BitSet bitSet29 = bsemVar.az;
        if (bitSet29 == null || bitSet29.get(27)) {
            az(27, "current_my_identity_foreign_key");
            bsemVar.B = this.B;
        }
        BitSet bitSet30 = bsemVar.az;
        if (bitSet30 == null || bitSet30.get(28)) {
            bsemVar.C = B();
        }
        BitSet bitSet31 = bsemVar.az;
        if (bitSet31 == null || bitSet31.get(29)) {
            bsemVar.D = q();
        }
        BitSet bitSet32 = bsemVar.az;
        if (bitSet32 == null || bitSet32.get(30)) {
            bsemVar.E = ap();
        }
        BitSet bitSet33 = bsemVar.az;
        if (bitSet33 == null || bitSet33.get(31)) {
            bsemVar.F = Y();
        }
        BitSet bitSet34 = bsemVar.az;
        if (bitSet34 == null || bitSet34.get(32)) {
            bsemVar.G = aq();
        }
        BitSet bitSet35 = bsemVar.az;
        if (bitSet35 == null || bitSet35.get(33)) {
            bsemVar.H = an();
        }
        BitSet bitSet36 = bsemVar.az;
        if (bitSet36 == null || bitSet36.get(34)) {
            bsemVar.I = af();
        }
        BitSet bitSet37 = bsemVar.az;
        if (bitSet37 == null || bitSet37.get(35)) {
            bsemVar.J = Z();
        }
        BitSet bitSet38 = bsemVar.az;
        if (bitSet38 == null || bitSet38.get(36)) {
            az(36, "normalized_participant_id_list");
            bsemVar.K = this.K;
        }
        BitSet bitSet39 = bsemVar.az;
        if (bitSet39 == null || bitSet39.get(37)) {
            bsemVar.L = s();
        }
        BitSet bitSet40 = bsemVar.az;
        if (bitSet40 == null || bitSet40.get(38)) {
            bsemVar.M = v();
        }
        BitSet bitSet41 = bsemVar.az;
        if (bitSet41 == null || bitSet41.get(39)) {
            bsemVar.N = m();
        }
        BitSet bitSet42 = bsemVar.az;
        if (bitSet42 == null || bitSet42.get(40)) {
            bsemVar.O = k();
        }
        BitSet bitSet43 = bsemVar.az;
        if (bitSet43 == null || bitSet43.get(41)) {
            bsemVar.P = r();
        }
        BitSet bitSet44 = bsemVar.az;
        if (bitSet44 == null || bitSet44.get(42)) {
            az(42, "IS_ENTERPRISE");
            bsemVar.Q = this.Q;
        }
        BitSet bitSet45 = bsemVar.az;
        if (bitSet45 == null || bitSet45.get(43)) {
            bsemVar.R = am();
        }
        BitSet bitSet46 = bsemVar.az;
        if (bitSet46 == null || bitSet46.get(44)) {
            az(44, "last_interactive_event_timestamp");
            bsemVar.S = this.S;
        }
        BitSet bitSet47 = bsemVar.az;
        if (bitSet47 == null || bitSet47.get(45)) {
            az(45, "participant_display_destination");
            bsemVar.T = this.T;
        }
        BitSet bitSet48 = bsemVar.az;
        if (bitSet48 == null || bitSet48.get(46)) {
            az(46, "normalized_participant_display_destination");
            bsemVar.U = this.U;
        }
        BitSet bitSet49 = bsemVar.az;
        if (bitSet49 == null || bitSet49.get(47)) {
            bsemVar.V = at();
        }
        BitSet bitSet50 = bsemVar.az;
        if (bitSet50 == null || bitSet50.get(48)) {
            bsemVar.W = o();
        }
        BitSet bitSet51 = bsemVar.az;
        if (bitSet51 == null || bitSet51.get(49)) {
            az(49, "last_logged_scooby_metadata_timestamp");
            bsemVar.X = this.X;
        }
        BitSet bitSet52 = bsemVar.az;
        if (bitSet52 == null || bitSet52.get(50)) {
            bsemVar.Y = u();
        }
        BitSet bitSet53 = bsemVar.az;
        if (bitSet53 == null || bitSet53.get(51)) {
            bsemVar.Z = R();
        }
        BitSet bitSet54 = bsemVar.az;
        if (bitSet54 == null || bitSet54.get(52)) {
            bsemVar.aa = ad();
        }
        BitSet bitSet55 = bsemVar.az;
        if (bitSet55 == null || bitSet55.get(53)) {
            bsemVar.ab = ac();
        }
        BitSet bitSet56 = bsemVar.az;
        if (bitSet56 == null || bitSet56.get(54)) {
            bsemVar.ac = au();
        }
        BitSet bitSet57 = bsemVar.az;
        if (bitSet57 == null || bitSet57.get(55)) {
            bsemVar.ad = t();
        }
        BitSet bitSet58 = bsemVar.az;
        if (bitSet58 == null || bitSet58.get(56)) {
            bsemVar.ae = w();
        }
        BitSet bitSet59 = bsemVar.az;
        if (bitSet59 == null || bitSet59.get(57)) {
            bsemVar.af = ar();
        }
        BitSet bitSet60 = bsemVar.az;
        if (bitSet60 == null || bitSet60.get(58)) {
            bsemVar.ag = K();
        }
        BitSet bitSet61 = bsemVar.az;
        if (bitSet61 == null || bitSet61.get(59)) {
            bsemVar.ah = ak();
        }
        BitSet bitSet62 = bsemVar.az;
        if (bitSet62 == null || bitSet62.get(60)) {
            az(60, "duplicate_of");
            bsemVar.ai = this.ai;
        }
        BitSet bitSet63 = bsemVar.az;
        if (bitSet63 == null || bitSet63.get(61)) {
            az(61, "new_duplicate_of");
            bsemVar.aj = this.aj;
        }
        BitSet bitSet64 = bsemVar.az;
        if (bitSet64 == null || bitSet64.get(62)) {
            bsemVar.ak = A();
        }
        BitSet bitSet65 = bsemVar.az;
        if (bitSet65 == null || bitSet65.get(63)) {
            bsemVar.al = N();
        }
        BitSet bitSet66 = bsemVar.az;
        if (bitSet66 == null || bitSet66.get(64)) {
            bsemVar.am = ae();
        }
        BitSet bitSet67 = bsemVar.az;
        if (bitSet67 == null || bitSet67.get(65)) {
            bsemVar.an = P();
        }
        BitSet bitSet68 = bsemVar.az;
        if (bitSet68 == null || bitSet68.get(66)) {
            bsemVar.ao = O();
        }
        BitSet bitSet69 = bsemVar.az;
        if (bitSet69 == null || bitSet69.get(67)) {
            bsemVar.ap = al();
        }
        BitSet bitSet70 = bsemVar.az;
        if (bitSet70 == null || bitSet70.get(68)) {
            bsemVar.aq = ao();
        }
        BitSet bitSet71 = bsemVar.az;
        if (bitSet71 == null || bitSet71.get(69)) {
            bsemVar.ar = J();
        }
        BitSet bitSet72 = bsemVar.az;
        if (bitSet72 == null || bitSet72.get(70)) {
            bsemVar.as = L();
        }
        BitSet bitSet73 = bsemVar.az;
        if (bitSet73 == null || bitSet73.get(71)) {
            bsemVar.at = n();
        }
        BitSet bitSet74 = bsemVar.az;
        if (bitSet74 == null || bitSet74.get(72)) {
            bsemVar.au = I();
        }
        BitSet bitSet75 = bsemVar.az;
        if (bitSet75 == null || bitSet75.get(73)) {
            az(73, "encryption_id");
            bsemVar.av = this.av;
        }
        BitSet bitSet76 = bsemVar.az;
        if (bitSet76 == null || bitSet76.get(74)) {
            bsemVar.aw = Q();
        }
        BitSet bitSet77 = bsemVar.az;
        if (bitSet77 == null || bitSet77.get(75)) {
            bsemVar.ax = z();
        }
        BitSet bitSet78 = bsemVar.az;
        if (bitSet78 != null && !bitSet78.get(76)) {
            return bsemVar;
        }
        az(76, "unread_count");
        bsemVar.ay = this.ay;
        return bsemVar;
    }

    public final byyt G() {
        az(16, "archive_status");
        return this.q;
    }

    public final byyy H() {
        az(3, "name_is_automatic");
        return this.d;
    }

    public final cfmh I() {
        az(72, "encryption_protocol");
        return this.au;
    }

    public final ckkz J() {
        az(69, "custom_theme");
        return this.ar;
    }

    public final cknh K() {
        az(58, "rcs_group_capabilities");
        return this.ag;
    }

    public final ckte L() {
        az(70, "mms_group_upgrade_status");
        return this.as;
    }

    public final cpxu M() {
        az(1, "sms_thread_id");
        return this.b;
    }

    public final csgg N() {
        az(63, "cms_life_cycle");
        return this.al;
    }

    public final Optional O() {
        az(66, "rcs_group_last_sync_timestamp");
        return this.ao;
    }

    public final Optional P() {
        az(65, "recipient_offline_timestamp_ms");
        return this.an;
    }

    public final String Q() {
        az(74, "cms_correlation_id");
        return this.aw;
    }

    public final String R() {
        az(51, "cms_id");
        return this.Z;
    }

    public final String S() {
        az(26, "current_self_id");
        return this.A;
    }

    public final String T() {
        az(14, "draft_preview_content_type");
        return this.o;
    }

    public final String U() {
        az(11, "draft_snippet_text");
        return this.l;
    }

    public final String V() {
        az(12, "draft_subject_text");
        return this.m;
    }

    public final String W() {
        az(19, "icon");
        return this.t;
    }

    public final String X() {
        az(2, "name");
        return this.c;
    }

    public final String Y() {
        az(31, "notification_sound_uri");
        return this.F;
    }

    public final String Z() {
        az(35, "participant_id_list");
        return this.J;
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
        String valueOf46 = String.valueOf(this.T);
        String valueOf47 = String.valueOf(this.U);
        String valueOf48 = String.valueOf(this.V);
        String valueOf49 = String.valueOf(this.W);
        String valueOf50 = String.valueOf(this.X);
        String valueOf51 = String.valueOf(this.Y);
        String valueOf52 = String.valueOf(this.Z);
        String valueOf53 = String.valueOf(this.aa);
        String valueOf54 = String.valueOf(this.ab);
        byte[] bArr = this.ac;
        return String.format(locale, "ConversationsTable [_id: %s,\n  sms_thread_id: %s,\n  name: %s,\n  name_is_automatic: %s,\n  subtitle: %s,\n  latest_message_id: %s,\n  snippet_text: %s,\n  subject_text: %s,\n  preview_uri: %s,\n  preview_content_type: %s,\n  show_draft: %s,\n  draft_snippet_text: %s,\n  draft_subject_text: %s,\n  draft_preview_uri: %s,\n  draft_preview_content_type: %s,\n  etouffee_default: %s,\n  archive_status: %s,\n  sort_timestamp: %s,\n  last_read_timestamp: %s,\n  icon: %s,\n  participant_contact_id: %s,\n  normalized_participant_contact_id: %s,\n  participant_lookup_key: %s,\n  normalized_participant_lookup_key: %s,\n  participant_normalized_destination: %s,\n  participant_comparable_destination: %s,\n  current_self_id: %s,\n  current_my_identity_foreign_key: %s,\n  destination_token: %s,\n  participant_count: %s,\n  notification_enabled: %s,\n  notification_sound_uri: %s,\n  notification_vibration: %s,\n  include_email_addr: %s,\n  sms_service_center: %s,\n  participant_id_list: %s,\n  normalized_participant_id_list: %s,\n  source_type: %s,\n  rcs_session_id: %s,\n  join_state: %s,\n  conv_type: %s,\n  send_mode: %s,\n  IS_ENTERPRISE: %s,\n  has_ea2p_bot_recipient: %s,\n  last_interactive_event_timestamp: %s,\n  participant_display_destination: %s,\n  normalized_participant_display_destination: %s,\n  spam_warning_dismiss_status: %s,\n  open_count: %s,\n  last_logged_scooby_metadata_timestamp: %s,\n  delete_timestamp: %s,\n  cms_id: %s,\n  rcs_group_id: %s,\n  rcs_conference_uri: %s,\n  tachygram_group_routing_info_token: %s,\n  cms_most_recent_read_message_timestamp_ms: %s,\n  rcs_subject_change_timestamp_ms: %s,\n  rcs_session_allows_revocation: %s,\n  rcs_group_capabilities: %s,\n  awaiting_reverse_sync: %s,\n  duplicate_of: %s,\n  new_duplicate_of: %s,\n  error_state: %s,\n  cms_life_cycle: %s,\n  rcs_group_self_msisdn: %s,\n  recipient_offline_timestamp_ms: %s,\n  rcs_group_last_sync_timestamp: %s,\n  has_been_e2ee: %s,\n  marked_as_unread: %s,\n  custom_theme: %s,\n  mms_group_upgrade_status: %s,\n  mms_group_upgrade_retries: %s,\n  encryption_protocol: %s,\n  encryption_id: %s,\n  cms_correlation_id: %s,\n  rcs_group_icon_url: %s,\n  unread_count: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, valueOf46, valueOf47, valueOf48, valueOf49, valueOf50, valueOf51, valueOf52, valueOf53, valueOf54, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.ad), String.valueOf(this.ae), String.valueOf(this.af), String.valueOf(this.ag), String.valueOf(this.ah), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao), String.valueOf(this.ap), String.valueOf(this.aq), String.valueOf(this.ar), String.valueOf(this.as), String.valueOf(this.at), String.valueOf(this.au), String.valueOf(this.av), String.valueOf(this.aw), String.valueOf(this.ax), String.valueOf(this.ay));
    }

    public final String aa() {
        az(24, "participant_normalized_destination");
        return this.y;
    }

    public final String ab() {
        az(9, "preview_content_type");
        return this.j;
    }

    public final String ac() {
        az(53, "rcs_conference_uri");
        return this.ab;
    }

    public final String ad() {
        az(52, "rcs_group_id");
        return this.aa;
    }

    public final String ae() {
        az(64, "rcs_group_self_msisdn");
        return this.am;
    }

    public final String af() {
        az(34, "sms_service_center");
        return this.I;
    }

    public final String ag() {
        az(6, "snippet_text");
        return this.g;
    }

    public final String ah() {
        az(7, "subject_text");
        return this.h;
    }

    public final /* synthetic */ void ai(final Long l) {
        if (l.longValue() >= 0) {
            this.a = (ConversationIdType) new dtuj() { // from class: bseb
                @Override // defpackage.dtuj
                public final Object a() {
                    return new ConversationIdType(l.longValue());
                }
            }.a();
            super.fY(0);
        }
    }

    public final /* synthetic */ void aj(final Long l) {
        if (l.longValue() >= 0) {
            this.a = (ConversationIdType) new dtuj() { // from class: bsea
                @Override // defpackage.dtuj
                public final Object a() {
                    return new ConversationIdType(l.longValue());
                }
            }.a();
            super.fY(0);
        }
    }

    public final boolean ak() {
        az(59, "awaiting_reverse_sync");
        return this.ah;
    }

    public final boolean al() {
        az(67, "has_been_e2ee");
        return this.ap;
    }

    public final boolean am() {
        az(43, "has_ea2p_bot_recipient");
        return this.R;
    }

    public final boolean an() {
        az(33, "include_email_addr");
        return this.H;
    }

    public final boolean ao() {
        az(68, "marked_as_unread");
        return this.aq;
    }

    public final boolean ap() {
        az(30, "notification_enabled");
        return this.E;
    }

    public final boolean aq() {
        az(32, "notification_vibration");
        return this.G;
    }

    public final boolean ar() {
        az(57, "rcs_session_allows_revocation");
        return this.af;
    }

    public final boolean as() {
        az(10, "show_draft");
        return this.k;
    }

    public final boolean at() {
        az(47, "spam_warning_dismiss_status");
        return this.V;
    }

    public final byte[] au() {
        az(54, "tachygram_group_routing_info_token");
        return this.ac;
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bsom.g().intValue();
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            contentValues.putNull("_id");
        } else {
            contentValues.put("_id", Long.valueOf(bdgq.a(this.a)));
        }
        cpxu cpxuVar = this.b;
        if (cpxuVar == null) {
            contentValues.putNull("sms_thread_id");
        } else {
            contentValues.put("sms_thread_id", Long.valueOf(cpxv.a(cpxuVar)));
        }
        dtub.u(contentValues, "name", this.c);
        if (intValue >= 10012) {
            byyy byyyVar = this.d;
            if (byyyVar == null) {
                contentValues.putNull("name_is_automatic");
            } else {
                contentValues.put("name_is_automatic", Integer.valueOf(byyyVar.ordinal()));
            }
        }
        if (intValue >= 59760) {
            dtub.u(contentValues, "subtitle", this.e);
        }
        MessageIdType messageIdType = this.f;
        if (messageIdType == null) {
            contentValues.putNull("latest_message_id");
        } else {
            contentValues.put("latest_message_id", Long.valueOf(bdhb.a(messageIdType)));
        }
        dtub.u(contentValues, "snippet_text", this.g);
        dtub.u(contentValues, "subject_text", this.h);
        Uri uri = this.i;
        if (uri == null) {
            contentValues.putNull("preview_uri");
        } else {
            contentValues.put("preview_uri", uri.toString());
        }
        dtub.u(contentValues, "preview_content_type", this.j);
        contentValues.put("show_draft", Boolean.valueOf(this.k));
        dtub.u(contentValues, "draft_snippet_text", this.l);
        dtub.u(contentValues, "draft_subject_text", this.m);
        Uri uri2 = this.n;
        if (uri2 == null) {
            contentValues.putNull("draft_preview_uri");
        } else {
            contentValues.put("draft_preview_uri", uri2.toString());
        }
        dtub.u(contentValues, "draft_preview_content_type", this.o);
        if (intValue >= 29060) {
            contentValues.put("etouffee_default", Integer.valueOf(this.p));
        }
        byyt byytVar = this.q;
        if (byytVar == null) {
            contentValues.putNull("archive_status");
        } else {
            contentValues.put("archive_status", Integer.valueOf(byytVar.h));
        }
        contentValues.put("sort_timestamp", Long.valueOf(this.r));
        contentValues.put("last_read_timestamp", Long.valueOf(this.s));
        dtub.u(contentValues, "icon", this.t);
        contentValues.put("participant_contact_id", Long.valueOf(this.u));
        if (intValue >= 58090) {
            contentValues.put("normalized_participant_contact_id", Long.valueOf(this.v));
        }
        dtub.u(contentValues, "participant_lookup_key", this.w);
        if (intValue >= 58090) {
            dtub.u(contentValues, "normalized_participant_lookup_key", this.x);
        }
        dtub.u(contentValues, "participant_normalized_destination", this.y);
        if (intValue >= 58090) {
            dtub.u(contentValues, "participant_comparable_destination", this.z);
        }
        dtub.u(contentValues, "current_self_id", this.A);
        if (intValue >= 60160) {
            azsu azsuVar = this.B;
            if (azsuVar == null || azsuVar.equals(null)) {
                contentValues.putNull("current_my_identity_foreign_key");
            } else {
                contentValues.put("current_my_identity_foreign_key", azsv.b(this.B));
            }
        }
        if (intValue >= 60360) {
            azcr azcrVar = this.C;
            if (azcrVar == null || azcrVar.equals(null)) {
                contentValues.putNull("destination_token");
            } else {
                contentValues.put("destination_token", azcs.b(this.C));
            }
        }
        contentValues.put("participant_count", Integer.valueOf(this.D));
        contentValues.put("notification_enabled", Boolean.valueOf(this.E));
        dtub.u(contentValues, "notification_sound_uri", this.F);
        contentValues.put("notification_vibration", Boolean.valueOf(this.G));
        contentValues.put("include_email_addr", Boolean.valueOf(this.H));
        dtub.u(contentValues, "sms_service_center", this.I);
        if (intValue >= 8500) {
            dtub.u(contentValues, "participant_id_list", this.J);
        }
        if (intValue >= 58090) {
            dtub.u(contentValues, "normalized_participant_id_list", this.K);
        }
        if (intValue >= 8500) {
            contentValues.put("source_type", Integer.valueOf(this.L));
        }
        if (intValue >= 10000) {
            contentValues.put("rcs_session_id", Long.valueOf(this.M));
        }
        if (intValue >= 10006) {
            contentValues.put("join_state", Integer.valueOf(this.N));
        }
        if (intValue >= 10007) {
            contentValues.put("conv_type", Integer.valueOf(this.O));
        }
        if (intValue >= 10016) {
            contentValues.put("send_mode", Integer.valueOf(this.P));
        }
        if (intValue >= 10018) {
            contentValues.put("IS_ENTERPRISE", Boolean.valueOf(this.Q));
        }
        if (intValue >= 12001) {
            contentValues.put("has_ea2p_bot_recipient", Boolean.valueOf(this.R));
        }
        if (intValue >= 15000) {
            contentValues.put("last_interactive_event_timestamp", Long.valueOf(this.S));
        }
        if (intValue >= 15010) {
            dtub.u(contentValues, "participant_display_destination", this.T);
        }
        if (intValue >= 58090) {
            dtub.u(contentValues, "normalized_participant_display_destination", this.U);
        }
        if (intValue >= 23000) {
            contentValues.put("spam_warning_dismiss_status", Boolean.valueOf(this.V));
        }
        if (intValue >= 26020) {
            contentValues.put("open_count", Integer.valueOf(this.W));
        }
        if (intValue >= 28010) {
            contentValues.put("last_logged_scooby_metadata_timestamp", Long.valueOf(this.X));
        }
        if (intValue >= 29020) {
            contentValues.put("delete_timestamp", Long.valueOf(this.Y));
        }
        if (intValue >= 32000) {
            dtub.u(contentValues, "cms_id", this.Z);
        }
        if (intValue >= 40050) {
            dtub.u(contentValues, "rcs_group_id", this.aa);
        }
        if (intValue >= 40050) {
            dtub.u(contentValues, "rcs_conference_uri", this.ab);
        }
        if (intValue >= 58120) {
            contentValues.put("tachygram_group_routing_info_token", this.ac);
        }
        if (intValue >= 53030) {
            contentValues.put("cms_most_recent_read_message_timestamp_ms", Long.valueOf(this.ad));
        }
        if (intValue >= 46050) {
            contentValues.put("rcs_subject_change_timestamp_ms", Long.valueOf(this.ae));
        }
        if (intValue >= 48040) {
            contentValues.put("rcs_session_allows_revocation", Boolean.valueOf(this.af));
        }
        if (intValue >= 49020) {
            cknh cknhVar = this.ag;
            if (cknhVar == null) {
                contentValues.putNull("rcs_group_capabilities");
            } else {
                contentValues.put("rcs_group_capabilities", Long.valueOf(cknhVar.a));
            }
        }
        if (intValue >= 49060) {
            contentValues.put("awaiting_reverse_sync", Boolean.valueOf(this.ah));
        }
        if (intValue >= 58090) {
            ConversationIdType conversationIdType2 = this.ai;
            if (conversationIdType2 == null || conversationIdType2.equals(bdgq.a)) {
                contentValues.putNull("duplicate_of");
            } else {
                contentValues.put("duplicate_of", Long.valueOf(bdgq.a(this.ai)));
            }
        }
        if (intValue >= 59130) {
            ConversationIdType conversationIdType3 = this.aj;
            if (conversationIdType3 == null || conversationIdType3.equals(bdgq.a)) {
                contentValues.putNull("new_duplicate_of");
            } else {
                contentValues.put("new_duplicate_of", Long.valueOf(bdgq.a(this.aj)));
            }
        }
        if (intValue >= 58140) {
            ayhd ayhdVar = this.ak;
            if (ayhdVar == null) {
                contentValues.putNull("error_state");
            } else {
                contentValues.put("error_state", Integer.valueOf(ayhdVar.a()));
            }
        }
        if (intValue >= 58210) {
            csgg csggVar = this.al;
            if (csggVar == null) {
                contentValues.putNull("cms_life_cycle");
            } else {
                contentValues.put("cms_life_cycle", Integer.valueOf(csggVar.ordinal()));
            }
        }
        if (intValue >= 58540) {
            dtub.u(contentValues, "rcs_group_self_msisdn", this.am);
        }
        if (intValue >= 58750) {
            Optional optional = this.an;
            if (optional == null) {
                contentValues.putNull("recipient_offline_timestamp_ms");
            } else {
                contentValues.put("recipient_offline_timestamp_ms", Long.valueOf(bdhe.a(optional)));
            }
        }
        if (intValue >= 58910) {
            Optional optional2 = this.ao;
            if (optional2 == null) {
                contentValues.putNull("rcs_group_last_sync_timestamp");
            } else {
                contentValues.put("rcs_group_last_sync_timestamp", Long.valueOf(bdhe.a(optional2)));
            }
        }
        if (intValue >= 59210) {
            contentValues.put("has_been_e2ee", Boolean.valueOf(this.ap));
        }
        if (intValue >= 59220) {
            contentValues.put("marked_as_unread", Boolean.valueOf(this.aq));
        }
        if (intValue >= 59820) {
            ckkz ckkzVar = this.ar;
            if (ckkzVar == null) {
                contentValues.putNull("custom_theme");
            } else {
                contentValues.put("custom_theme", ckkzVar.toByteArray());
            }
        }
        if (intValue >= 60050) {
            ckte ckteVar = this.as;
            if (ckteVar == null) {
                contentValues.putNull("mms_group_upgrade_status");
            } else {
                contentValues.put("mms_group_upgrade_status", Integer.valueOf(ckteVar.ordinal()));
            }
        }
        if (intValue >= 60050) {
            contentValues.put("mms_group_upgrade_retries", Integer.valueOf(this.at));
        }
        if (intValue >= 60180) {
            cfmh cfmhVar = this.au;
            if (cfmhVar == null) {
                contentValues.putNull("encryption_protocol");
            } else {
                contentValues.put("encryption_protocol", Long.valueOf(cfmg.a(cfmhVar)));
            }
        }
        if (intValue >= 60210) {
            cfmf cfmfVar = this.av;
            if (cfmfVar == null) {
                contentValues.putNull("encryption_id");
            } else {
                contentValues.put("encryption_id", cfmf.b(cfmfVar));
            }
        }
        if (intValue >= 60250) {
            dtub.u(contentValues, "cms_correlation_id", this.aw);
        }
        if (intValue >= 60590) {
            Uri uri3 = this.ax;
            if (uri3 == null) {
                contentValues.putNull("rcs_group_icon_url");
            } else {
                contentValues.put("rcs_group_icon_url", uri3.toString());
            }
        }
        if (intValue >= 60740) {
            contentValues.put("unread_count", Integer.valueOf(this.ay));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bsnr bsnrVar = (bsnr) ((bskr) dtsuVar);
        aB();
        this.cL = bsnrVar.cU();
        if (bsnrVar.di(0)) {
            this.a = bsnrVar.h();
            super.fY(0);
        }
        if (bsnrVar.di(1)) {
            this.b = bsnrVar.k();
            super.fY(1);
        }
        if (bsnrVar.di(2)) {
            this.c = bsnrVar.q();
            super.fY(2);
        }
        if (bsnrVar.di(3)) {
            this.d = bsnrVar.V();
            super.fY(3);
        }
        if (bsnrVar.di(4)) {
            this.e = bsnrVar.aw();
            super.fY(4);
        }
        if (bsnrVar.di(5)) {
            this.f = bsnrVar.i();
            super.fY(5);
        }
        if (bsnrVar.di(6)) {
            this.g = bsnrVar.au();
            super.fY(6);
        }
        if (bsnrVar.di(7)) {
            this.h = bsnrVar.av();
            super.fY(7);
        }
        if (bsnrVar.di(8)) {
            this.i = bsnrVar.O();
            super.fY(8);
        }
        if (bsnrVar.di(9)) {
            this.j = bsnrVar.aq();
            super.fY(9);
        }
        if (bsnrVar.di(10)) {
            this.k = bsnrVar.aD();
            super.fY(10);
        }
        if (bsnrVar.di(11)) {
            this.l = bsnrVar.ah();
            super.fY(11);
        }
        if (bsnrVar.di(12)) {
            this.m = bsnrVar.ai();
            super.fY(12);
        }
        if (bsnrVar.di(13)) {
            this.n = bsnrVar.g();
            super.fY(13);
        }
        if (bsnrVar.di(14)) {
            this.o = bsnrVar.ag();
            super.fY(14);
        }
        if (bsnrVar.di(15)) {
            this.p = bsnrVar.y();
            super.fY(15);
        }
        if (bsnrVar.di(16)) {
            this.q = bsnrVar.j();
            super.fY(16);
        }
        if (bsnrVar.di(17)) {
            this.r = bsnrVar.N();
            super.fY(17);
        }
        if (bsnrVar.di(18)) {
            this.s = bsnrVar.J();
            super.fY(18);
        }
        if (bsnrVar.di(19)) {
            this.t = bsnrVar.aj();
            super.fY(19);
        }
        if (bsnrVar.di(20)) {
            this.u = bsnrVar.L();
            super.fY(20);
        }
        if (bsnrVar.di(21)) {
            this.v = bsnrVar.K();
            super.fY(21);
        }
        if (bsnrVar.di(22)) {
            this.w = bsnrVar.s();
            super.fY(22);
        }
        if (bsnrVar.di(23)) {
            this.x = bsnrVar.am();
            super.fY(23);
        }
        if (bsnrVar.di(24)) {
            this.y = bsnrVar.t();
            super.fY(24);
        }
        if (bsnrVar.di(25)) {
            this.z = bsnrVar.an();
            super.fY(25);
        }
        if (bsnrVar.di(26)) {
            this.A = bsnrVar.af();
            super.fY(26);
        }
        if (bsnrVar.di(27)) {
            this.B = bsnrVar.S();
            super.fY(27);
        }
        if (bsnrVar.di(28)) {
            this.C = bsnrVar.R();
            super.fY(28);
        }
        if (bsnrVar.di(29)) {
            this.D = bsnrVar.B();
            super.fY(29);
        }
        if (bsnrVar.di(30)) {
            this.E = bsnrVar.w();
            super.fY(30);
        }
        if (bsnrVar.di(31)) {
            this.F = bsnrVar.r();
            super.fY(31);
        }
        if (bsnrVar.di(32)) {
            this.G = bsnrVar.x();
            super.fY(32);
        }
        if (bsnrVar.di(33)) {
            this.H = bsnrVar.az();
            super.fY(33);
        }
        if (bsnrVar.di(34)) {
            this.I = bsnrVar.at();
            super.fY(34);
        }
        if (bsnrVar.di(35)) {
            this.J = bsnrVar.ap();
            super.fY(35);
        }
        if (bsnrVar.di(36)) {
            this.K = bsnrVar.al();
            super.fY(36);
        }
        if (bsnrVar.di(37)) {
            this.L = bsnrVar.D();
            super.fY(37);
        }
        if (bsnrVar.di(38)) {
            this.M = bsnrVar.f();
            super.fY(38);
        }
        if (bsnrVar.di(39)) {
            this.N = bsnrVar.e();
            super.fY(39);
        }
        if (bsnrVar.di(40)) {
            this.O = bsnrVar.c();
            super.fY(40);
        }
        if (bsnrVar.di(41)) {
            this.P = bsnrVar.C();
            super.fY(41);
        }
        if (bsnrVar.di(42)) {
            this.Q = bsnrVar.aA();
            super.fY(42);
        }
        if (bsnrVar.di(43)) {
            this.R = bsnrVar.ay();
            super.fY(43);
        }
        if (bsnrVar.di(44)) {
            this.S = bsnrVar.H();
            super.fY(44);
        }
        if (bsnrVar.di(45)) {
            this.T = bsnrVar.ao();
            super.fY(45);
        }
        if (bsnrVar.di(46)) {
            this.U = bsnrVar.ak();
            super.fY(46);
        }
        if (bsnrVar.di(47)) {
            this.V = bsnrVar.aE();
            super.fY(47);
        }
        if (bsnrVar.di(48)) {
            this.W = bsnrVar.A();
            super.fY(48);
        }
        if (bsnrVar.di(49)) {
            this.X = bsnrVar.I();
            super.fY(49);
        }
        if (bsnrVar.di(50)) {
            this.Y = bsnrVar.G();
            super.fY(50);
        }
        if (bsnrVar.di(51)) {
            this.Z = bsnrVar.ae();
            super.fY(51);
        }
        if (bsnrVar.di(52)) {
            this.aa = bsnrVar.u();
            super.fY(52);
        }
        if (bsnrVar.di(53)) {
            this.ab = bsnrVar.ar();
            super.fY(53);
        }
        if (bsnrVar.di(54)) {
            this.ac = bsnrVar.aF();
            super.fY(54);
        }
        if (bsnrVar.di(55)) {
            this.ad = bsnrVar.F();
            super.fY(55);
        }
        if (bsnrVar.di(56)) {
            this.ae = bsnrVar.M();
            super.fY(56);
        }
        if (bsnrVar.di(57)) {
            this.af = bsnrVar.aC();
            super.fY(57);
        }
        if (bsnrVar.di(58)) {
            this.ag = bsnrVar.Z();
            super.fY(58);
        }
        if (bsnrVar.di(59)) {
            this.ah = bsnrVar.v();
            super.fY(59);
        }
        if (bsnrVar.di(60)) {
            this.ai = bsnrVar.T();
            super.fY(60);
        }
        if (bsnrVar.di(61)) {
            this.aj = bsnrVar.U();
            super.fY(61);
        }
        if (bsnrVar.di(62)) {
            this.ak = bsnrVar.Q();
            super.fY(62);
        }
        if (bsnrVar.di(63)) {
            this.al = bsnrVar.l();
            super.fY(63);
        }
        if (bsnrVar.di(64)) {
            this.am = bsnrVar.as();
            super.fY(64);
        }
        if (bsnrVar.di(65)) {
            this.an = bsnrVar.ac();
            super.fY(65);
        }
        if (bsnrVar.di(66)) {
            this.ao = bsnrVar.ab();
            super.fY(66);
        }
        if (bsnrVar.di(67)) {
            this.ap = bsnrVar.ax();
            super.fY(67);
        }
        if (bsnrVar.di(68)) {
            this.aq = bsnrVar.aB();
            super.fY(68);
        }
        if (bsnrVar.di(69)) {
            this.ar = bsnrVar.Y();
            super.fY(69);
        }
        if (bsnrVar.di(70)) {
            this.as = bsnrVar.aa();
            super.fY(70);
        }
        if (bsnrVar.di(71)) {
            this.at = bsnrVar.z();
            super.fY(71);
        }
        if (bsnrVar.di(72)) {
            this.au = bsnrVar.X();
            super.fY(72);
        }
        if (bsnrVar.di(73)) {
            this.av = bsnrVar.W();
            super.fY(73);
        }
        if (bsnrVar.di(74)) {
            this.aw = bsnrVar.ad();
            super.fY(74);
        }
        if (bsnrVar.di(75)) {
            this.ax = bsnrVar.P();
            super.fY(75);
        }
        if (bsnrVar.di(76)) {
            this.ay = bsnrVar.E();
            super.fY(76);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bseh)) {
            return false;
        }
        bseh bsehVar = (bseh) obj;
        return super.aD(bsehVar.cL) && Objects.equals(this.a, bsehVar.a) && Objects.equals(this.b, bsehVar.b) && Objects.equals(this.c, bsehVar.c) && this.d == bsehVar.d && Objects.equals(this.e, bsehVar.e) && Objects.equals(this.f, bsehVar.f) && Objects.equals(this.g, bsehVar.g) && Objects.equals(this.h, bsehVar.h) && Objects.equals(this.i, bsehVar.i) && Objects.equals(this.j, bsehVar.j) && this.k == bsehVar.k && Objects.equals(this.l, bsehVar.l) && Objects.equals(this.m, bsehVar.m) && Objects.equals(this.n, bsehVar.n) && Objects.equals(this.o, bsehVar.o) && this.p == bsehVar.p && this.q == bsehVar.q && this.r == bsehVar.r && this.s == bsehVar.s && Objects.equals(this.t, bsehVar.t) && this.u == bsehVar.u && this.v == bsehVar.v && Objects.equals(this.w, bsehVar.w) && Objects.equals(this.x, bsehVar.x) && Objects.equals(this.y, bsehVar.y) && Objects.equals(this.z, bsehVar.z) && Objects.equals(this.A, bsehVar.A) && Objects.equals(this.B, bsehVar.B) && Objects.equals(this.C, bsehVar.C) && this.D == bsehVar.D && this.E == bsehVar.E && Objects.equals(this.F, bsehVar.F) && this.G == bsehVar.G && this.H == bsehVar.H && Objects.equals(this.I, bsehVar.I) && Objects.equals(this.J, bsehVar.J) && Objects.equals(this.K, bsehVar.K) && this.L == bsehVar.L && this.M == bsehVar.M && this.N == bsehVar.N && this.O == bsehVar.O && this.P == bsehVar.P && this.Q == bsehVar.Q && this.R == bsehVar.R && this.S == bsehVar.S && Objects.equals(this.T, bsehVar.T) && Objects.equals(this.U, bsehVar.U) && this.V == bsehVar.V && this.W == bsehVar.W && this.X == bsehVar.X && this.Y == bsehVar.Y && Objects.equals(this.Z, bsehVar.Z) && Objects.equals(this.aa, bsehVar.aa) && Objects.equals(this.ab, bsehVar.ab) && Arrays.equals(this.ac, bsehVar.ac) && this.ad == bsehVar.ad && this.ae == bsehVar.ae && this.af == bsehVar.af && Objects.equals(this.ag, bsehVar.ag) && this.ah == bsehVar.ah && Objects.equals(this.ai, bsehVar.ai) && Objects.equals(this.aj, bsehVar.aj) && this.ak == bsehVar.ak && this.al == bsehVar.al && Objects.equals(this.am, bsehVar.am) && Objects.equals(this.an, bsehVar.an) && Objects.equals(this.ao, bsehVar.ao) && this.ap == bsehVar.ap && this.aq == bsehVar.aq && Objects.equals(this.ar, bsehVar.ar) && this.as == bsehVar.as && this.at == bsehVar.at && Objects.equals(this.au, bsehVar.au) && Objects.equals(this.av, bsehVar.av) && Objects.equals(this.aw, bsehVar.aw) && Objects.equals(this.ax, bsehVar.ax) && this.ay == bsehVar.ay;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversations", dtub.m(new String[]{"sms_thread_id", "name", "name_is_automatic", "subtitle", "latest_message_id", "snippet_text", "subject_text", "preview_uri", "preview_content_type", "show_draft", "draft_snippet_text", "draft_subject_text", "draft_preview_uri", "draft_preview_content_type", "etouffee_default", "archive_status", "sort_timestamp", "last_read_timestamp", "icon", "participant_contact_id", "normalized_participant_contact_id", "participant_lookup_key", "normalized_participant_lookup_key", "participant_normalized_destination", "participant_comparable_destination", "current_self_id", "current_my_identity_foreign_key", "destination_token", "participant_count", "notification_enabled", "notification_sound_uri", "notification_vibration", "include_email_addr", "sms_service_center", "participant_id_list", "normalized_participant_id_list", "source_type", "rcs_session_id", "join_state", "conv_type", "send_mode", "IS_ENTERPRISE", "has_ea2p_bot_recipient", "last_interactive_event_timestamp", "participant_display_destination", "normalized_participant_display_destination", "spam_warning_dismiss_status", "open_count", "last_logged_scooby_metadata_timestamp", "delete_timestamp", "cms_id", "rcs_group_id", "rcs_conference_uri", "tachygram_group_routing_info_token", "cms_most_recent_read_message_timestamp_ms", "rcs_subject_change_timestamp_ms", "rcs_session_allows_revocation", "rcs_group_capabilities", "awaiting_reverse_sync", "duplicate_of", "new_duplicate_of", "error_state", "cms_life_cycle", "rcs_group_self_msisdn", "recipient_offline_timestamp_ms", "rcs_group_last_sync_timestamp", "has_been_e2ee", "marked_as_unread", "custom_theme", "mms_group_upgrade_status", "mms_group_upgrade_retries", "encryption_protocol", "encryption_id", "cms_correlation_id", "rcs_group_icon_url", "unread_count"}));
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
        return "conversations";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        ConversationIdType conversationIdType = this.a;
        cpxu cpxuVar = this.b;
        String str = this.c;
        byyy byyyVar = this.d;
        Integer valueOf = Integer.valueOf(byyyVar == null ? 0 : byyyVar.ordinal());
        String str2 = this.e;
        MessageIdType messageIdType = this.f;
        String str3 = this.g;
        String str4 = this.h;
        Uri uri = this.i;
        String str5 = this.j;
        Boolean valueOf2 = Boolean.valueOf(this.k);
        String str6 = this.l;
        String str7 = this.m;
        Uri uri2 = this.n;
        dtsq dtsqVar3 = dtsqVar2;
        String str8 = this.o;
        Integer valueOf3 = Integer.valueOf(this.p);
        byyt byytVar = this.q;
        Long valueOf4 = Long.valueOf(this.r);
        Long valueOf5 = Long.valueOf(this.s);
        String str9 = this.t;
        Long valueOf6 = Long.valueOf(this.u);
        Long valueOf7 = Long.valueOf(this.v);
        String str10 = this.w;
        String str11 = this.x;
        String str12 = this.y;
        String str13 = this.z;
        String str14 = this.A;
        azsu azsuVar = this.B;
        azcr azcrVar = this.C;
        Integer valueOf8 = Integer.valueOf(this.D);
        Boolean valueOf9 = Boolean.valueOf(this.E);
        String str15 = this.F;
        Boolean valueOf10 = Boolean.valueOf(this.G);
        Boolean valueOf11 = Boolean.valueOf(this.H);
        String str16 = this.I;
        String str17 = this.J;
        String str18 = this.K;
        Integer valueOf12 = Integer.valueOf(this.L);
        Long valueOf13 = Long.valueOf(this.M);
        Integer valueOf14 = Integer.valueOf(this.N);
        Integer valueOf15 = Integer.valueOf(this.O);
        Integer valueOf16 = Integer.valueOf(this.P);
        Boolean valueOf17 = Boolean.valueOf(this.Q);
        Boolean valueOf18 = Boolean.valueOf(this.R);
        Long valueOf19 = Long.valueOf(this.S);
        String str19 = this.T;
        String str20 = this.U;
        Boolean valueOf20 = Boolean.valueOf(this.V);
        Integer valueOf21 = Integer.valueOf(this.W);
        Long valueOf22 = Long.valueOf(this.X);
        Long valueOf23 = Long.valueOf(this.Y);
        String str21 = this.Z;
        String str22 = this.aa;
        String str23 = this.ab;
        Integer valueOf24 = Integer.valueOf(Arrays.hashCode(this.ac));
        Long valueOf25 = Long.valueOf(this.ad);
        Long valueOf26 = Long.valueOf(this.ae);
        Boolean valueOf27 = Boolean.valueOf(this.af);
        cknh cknhVar = this.ag;
        Boolean valueOf28 = Boolean.valueOf(this.ah);
        ConversationIdType conversationIdType2 = this.ai;
        ConversationIdType conversationIdType3 = this.aj;
        ayhd ayhdVar = this.ak;
        csgg csggVar = this.al;
        Integer valueOf29 = Integer.valueOf(csggVar == null ? 0 : csggVar.ordinal());
        String str24 = this.am;
        Optional optional = this.an;
        Optional optional2 = this.ao;
        Boolean valueOf30 = Boolean.valueOf(this.ap);
        Boolean valueOf31 = Boolean.valueOf(this.aq);
        ckkz ckkzVar = this.ar;
        ckte ckteVar = this.as;
        return Objects.hash(dtsqVar3, conversationIdType, cpxuVar, str, valueOf, str2, messageIdType, str3, str4, uri, str5, valueOf2, str6, str7, uri2, str8, valueOf3, byytVar, valueOf4, valueOf5, str9, valueOf6, valueOf7, str10, str11, str12, str13, str14, azsuVar, azcrVar, valueOf8, valueOf9, str15, valueOf10, valueOf11, str16, str17, str18, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, str19, str20, valueOf20, valueOf21, valueOf22, valueOf23, str21, str22, str23, valueOf24, valueOf25, valueOf26, valueOf27, cknhVar, valueOf28, conversationIdType2, conversationIdType3, ayhdVar, valueOf29, str24, optional, optional2, valueOf30, valueOf31, ckkzVar, Integer.valueOf(ckteVar == null ? 0 : ckteVar.ordinal()), Integer.valueOf(this.at), this.au, this.av, this.aw, this.ax, Integer.valueOf(this.ay), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Long valueOf = Long.valueOf(cpxv.a(this.b));
        String str = this.c;
        byyy byyyVar = this.d;
        Object valueOf2 = byyyVar == null ? 0 : String.valueOf(byyyVar.ordinal());
        String str2 = this.e;
        Long valueOf3 = Long.valueOf(bdhb.a(this.f));
        String str3 = this.g;
        String str4 = this.h;
        Uri uri = this.i;
        String uri2 = uri == null ? null : uri.toString();
        String str5 = this.j;
        Integer valueOf4 = Integer.valueOf(this.k ? 1 : 0);
        String str6 = this.l;
        String str7 = this.m;
        Uri uri3 = this.n;
        String uri4 = uri3 == null ? null : uri3.toString();
        String str8 = this.o;
        Integer valueOf5 = Integer.valueOf(this.p);
        byyt byytVar = this.q;
        Object valueOf6 = byytVar == null ? 0 : String.valueOf(byytVar.h);
        Long valueOf7 = Long.valueOf(this.r);
        Long valueOf8 = Long.valueOf(this.s);
        String str9 = this.t;
        Long valueOf9 = Long.valueOf(this.u);
        Long valueOf10 = Long.valueOf(this.v);
        String str10 = this.w;
        String str11 = this.x;
        String str12 = this.y;
        String str13 = this.z;
        String str14 = this.A;
        Object obj = new bsed(this).get();
        Object obj2 = new bsee(this).get();
        Integer valueOf11 = Integer.valueOf(this.D);
        Integer valueOf12 = Integer.valueOf(this.E ? 1 : 0);
        String str15 = this.F;
        Integer valueOf13 = Integer.valueOf(this.G ? 1 : 0);
        Integer valueOf14 = Integer.valueOf(this.H ? 1 : 0);
        String str16 = this.I;
        String str17 = this.J;
        String str18 = this.K;
        Integer valueOf15 = Integer.valueOf(this.L);
        Long valueOf16 = Long.valueOf(this.M);
        Integer valueOf17 = Integer.valueOf(this.N);
        Integer valueOf18 = Integer.valueOf(this.O);
        Integer valueOf19 = Integer.valueOf(this.P);
        Integer valueOf20 = Integer.valueOf(this.Q ? 1 : 0);
        Integer valueOf21 = Integer.valueOf(this.R ? 1 : 0);
        Long valueOf22 = Long.valueOf(this.S);
        String str19 = this.T;
        String str20 = this.U;
        Integer valueOf23 = Integer.valueOf(this.V ? 1 : 0);
        Integer valueOf24 = Integer.valueOf(this.W);
        Long valueOf25 = Long.valueOf(this.X);
        Long valueOf26 = Long.valueOf(this.Y);
        String str21 = this.Z;
        String str22 = this.aa;
        String str23 = this.ab;
        byte[] bArr = this.ac;
        Long valueOf27 = Long.valueOf(this.ad);
        Long valueOf28 = Long.valueOf(this.ae);
        Integer valueOf29 = Integer.valueOf(this.af ? 1 : 0);
        Long valueOf30 = Long.valueOf(this.ag.a);
        Integer valueOf31 = Integer.valueOf(this.ah ? 1 : 0);
        Object obj3 = new bsef(this).get();
        Object obj4 = new bseg(this).get();
        ayhd ayhdVar = this.ak;
        Object valueOf32 = ayhdVar == null ? 0 : String.valueOf(ayhdVar.a());
        csgg csggVar = this.al;
        Object valueOf33 = csggVar == null ? 0 : String.valueOf(csggVar.ordinal());
        String str24 = this.am;
        Long valueOf34 = Long.valueOf(bdhe.a(this.an));
        Long valueOf35 = Long.valueOf(bdhe.a(this.ao));
        Integer valueOf36 = Integer.valueOf(this.ap ? 1 : 0);
        Integer valueOf37 = Integer.valueOf(this.aq ? 1 : 0);
        ckkz ckkzVar = this.ar;
        byte[] byteArray = ckkzVar == null ? null : ckkzVar.toByteArray();
        ckte ckteVar = this.as;
        Object valueOf38 = ckteVar != null ? String.valueOf(ckteVar.ordinal()) : 0;
        Integer valueOf39 = Integer.valueOf(this.at);
        cfmh cfmhVar = this.au;
        cfmh cfmhVar2 = cfmh.a;
        Long valueOf40 = Long.valueOf(cfmg.a(cfmhVar));
        String b = cfmf.b(this.av);
        String str25 = this.aw;
        Uri uri5 = this.ax;
        Object[] objArr = {valueOf, str, valueOf2, str2, valueOf3, str3, str4, uri2, str5, valueOf4, str6, str7, uri4, str8, valueOf5, valueOf6, valueOf7, valueOf8, str9, valueOf9, valueOf10, str10, str11, str12, str13, str14, obj, obj2, valueOf11, valueOf12, str15, valueOf13, valueOf14, str16, str17, str18, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, str19, str20, valueOf23, valueOf24, valueOf25, valueOf26, str21, str22, str23, bArr, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, obj3, obj4, valueOf32, valueOf33, str24, valueOf34, valueOf35, valueOf36, valueOf37, byteArray, valueOf38, valueOf39, valueOf40, b, str25, uri5 == null ? null : uri5.toString(), Integer.valueOf(this.ay)};
        sb.append('(');
        for (int i = 0; i < 76; i++) {
            Object obj5 = objArr[i];
            if (obj5 instanceof Number) {
                sb.append(String.valueOf(obj5));
            } else {
                if (obj5 instanceof String) {
                    String str26 = (String) obj5;
                    if (str26.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str26));
                    }
                }
                list.add(obj5);
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
        az(40, "conv_type");
        return this.O;
    }

    public final int l() {
        az(15, "etouffee_default");
        return this.p;
    }

    public final int m() {
        az(39, "join_state");
        return this.N;
    }

    public final int n() {
        az(71, "mms_group_upgrade_retries");
        return this.at;
    }

    public final int o() {
        az(48, "open_count");
        return this.W;
    }

    public final int q() {
        az(29, "participant_count");
        return this.D;
    }

    public final int r() {
        az(41, "send_mode");
        return this.P;
    }

    public final int s() {
        az(37, "source_type");
        return this.L;
    }

    public final long t() {
        az(55, "cms_most_recent_read_message_timestamp_ms");
        return this.ad;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationsTable -- REDACTED") : a();
    }

    public final long u() {
        az(50, "delete_timestamp");
        return this.Y;
    }

    public final long v() {
        az(38, "rcs_session_id");
        return this.M;
    }

    public final long w() {
        az(56, "rcs_subject_change_timestamp_ms");
        return this.ae;
    }

    public final long x() {
        az(17, "sort_timestamp");
        return this.r;
    }

    public final Uri y() {
        az(13, "draft_preview_uri");
        return this.n;
    }

    public final Uri z() {
        az(75, "rcs_group_icon_url");
        return this.ax;
    }
}
