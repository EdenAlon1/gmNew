package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsoe extends duak {
    public bsoe() {
        super("conversations");
    }

    public final void A(int i) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 10006) {
            dtub.w("join_state", intValue2);
        }
        if (intValue >= 10006) {
            this.a.put("join_state", Integer.valueOf(i));
        }
    }

    public final void B(ckte ckteVar) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 60050) {
            dtub.w("mms_group_upgrade_status", intValue2);
        }
        if (intValue >= 60050) {
            if (ckteVar == null) {
                this.a.putNull("mms_group_upgrade_status");
            } else {
                this.a.put("mms_group_upgrade_status", Integer.valueOf(ckteVar.ordinal()));
            }
        }
    }

    public final void C(String str) {
        dtub.u(this.a, "name", cuxf.a(str));
    }

    public final void D(byyy byyyVar) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 10012) {
            dtub.w("name_is_automatic", intValue2);
        }
        if (intValue >= 10012) {
            if (byyyVar == null) {
                this.a.putNull("name_is_automatic");
            } else {
                this.a.put("name_is_automatic", Integer.valueOf(byyyVar.ordinal()));
            }
        }
    }

    public final void E(int i) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 26020) {
            dtub.w("open_count", intValue2);
        }
        if (intValue >= 26020) {
            this.a.put("open_count", Integer.valueOf(i));
        }
    }

    public final void F(long j) {
        this.a.put("participant_contact_id", Long.valueOf(j));
    }

    public final void G(int i) {
        this.a.put("participant_count", Integer.valueOf(i));
    }

    public final void H(String str) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 15010) {
            dtub.w("participant_display_destination", intValue2);
        }
        if (intValue >= 15010) {
            dtub.u(this.a, "participant_display_destination", cuxs.a(str));
        }
    }

    public final void I(String str) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 8500) {
            dtub.w("participant_id_list", intValue2);
        }
        if (intValue >= 8500) {
            dtub.u(this.a, "participant_id_list", str);
        }
    }

    public final void J(String str) {
        dtub.u(this.a, "participant_lookup_key", str);
    }

    public final void K(String str) {
        dtub.u(this.a, "participant_normalized_destination", str);
    }

    public final void L(String str) {
        dtub.u(this.a, "preview_content_type", str);
    }

    public final void M(Uri uri) {
        if (uri == null) {
            this.a.putNull("preview_uri");
        } else {
            this.a.put("preview_uri", uri.toString());
        }
    }

    public final void N(String str) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 40050) {
            dtub.w("rcs_conference_uri", intValue2);
        }
        if (intValue >= 40050) {
            dtub.u(this.a, "rcs_conference_uri", cuxc.a(str));
        }
    }

    public final void O(cknh cknhVar) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 49020) {
            dtub.w("rcs_group_capabilities", intValue2);
        }
        if (intValue >= 49020) {
            if (cknhVar == null) {
                this.a.putNull("rcs_group_capabilities");
            } else {
                this.a.put("rcs_group_capabilities", Long.valueOf(cknhVar.a));
            }
        }
    }

    public final void P(Uri uri) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 60590) {
            dtub.w("rcs_group_icon_url", intValue2);
        }
        if (intValue >= 60590) {
            if (uri == null) {
                this.a.putNull("rcs_group_icon_url");
            } else {
                this.a.put("rcs_group_icon_url", uri.toString());
            }
        }
    }

    public final void Q(String str) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 40050) {
            dtub.w("rcs_group_id", intValue2);
        }
        if (intValue >= 40050) {
            dtub.u(this.a, "rcs_group_id", str);
        }
    }

    public final void R(Optional optional) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 58910) {
            dtub.w("rcs_group_last_sync_timestamp", intValue2);
        }
        if (intValue >= 58910) {
            this.a.put("rcs_group_last_sync_timestamp", Long.valueOf(bdhe.a(optional)));
        }
    }

    public final void S(String str) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 58540) {
            dtub.w("rcs_group_self_msisdn", intValue2);
        }
        if (intValue >= 58540) {
            dtub.u(this.a, "rcs_group_self_msisdn", str);
        }
    }

    public final void T(long j) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 10000) {
            dtub.w("rcs_session_id", intValue2);
        }
        if (intValue >= 10000) {
            this.a.put("rcs_session_id", Long.valueOf(j));
        }
    }

    public final void U(Optional optional) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 58750) {
            dtub.w("recipient_offline_timestamp_ms", intValue2);
        }
        if (intValue >= 58750) {
            this.a.put("recipient_offline_timestamp_ms", Long.valueOf(bdhe.a(optional)));
        }
    }

    public final void V(int i) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 10016) {
            dtub.w("send_mode", intValue2);
        }
        if (intValue >= 10016) {
            this.a.put("send_mode", Integer.valueOf(i));
        }
    }

    public final void W(boolean z) {
        this.a.put("show_draft", Boolean.valueOf(z));
    }

    public final void X(cpxu cpxuVar) {
        if (cpxuVar == null) {
            this.a.putNull("sms_thread_id");
        } else {
            this.a.put("sms_thread_id", Long.valueOf(cpxv.a(cpxuVar)));
        }
    }

    public final void Y(String str) {
        dtub.u(this.a, "snippet_text", cuxs.a(str));
    }

    public final void Z(long j) {
        this.a.put("sort_timestamp", Long.valueOf(j));
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsod b() {
        ah();
        return new bsod(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void aa(boolean z) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 23000) {
            dtub.w("spam_warning_dismiss_status", intValue2);
        }
        if (intValue >= 23000) {
            this.a.put("spam_warning_dismiss_status", Boolean.valueOf(z));
        }
    }

    public final void ab(String str) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 59760) {
            dtub.w("subtitle", intValue2);
        }
        if (intValue >= 59760) {
            dtub.u(this.a, "subtitle", str);
        }
    }

    public final void ac(bsol bsolVar) {
        af(new bsof(bsolVar));
    }

    public final void ad(Function function) {
        Object apply;
        String[] strArr = bsom.a;
        apply = function.apply(new bsol());
        af(new bsof((bsol) apply));
    }

    public final byyy c() {
        ContentValues contentValues = this.a;
        byyy[] values = byyy.values();
        int intValue = contentValues.getAsInteger("name_is_automatic").intValue();
        if (intValue < values.length) {
            return values[intValue];
        }
        throw new IllegalArgumentException();
    }

    public final String d() {
        return this.a.getAsString("name");
    }

    public final String e() {
        return this.a.getAsString("participant_lookup_key");
    }

    public final boolean f(ConversationIdType conversationIdType) {
        String[] strArr = bsom.a;
        bsol bsolVar = new bsol();
        bsolVar.q(conversationIdType);
        return aj(new bsof(bsolVar), "conversations-buildAndUpdateForId");
    }

    public final void g(String str) {
        String[] strArr = bsom.a;
        bsol bsolVar = new bsol();
        bsolVar.k(str);
        ae(new bsof(bsolVar), "conversations-buildAndUpdateForCurrentSelfId");
    }

    public final void h(byyt byytVar) {
        if (byytVar == null) {
            this.a.putNull("archive_status");
        } else {
            this.a.put("archive_status", Integer.valueOf(byytVar.h));
        }
    }

    public final void i(boolean z) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 49060) {
            dtub.w("awaiting_reverse_sync", intValue2);
        }
        if (intValue >= 49060) {
            this.a.put("awaiting_reverse_sync", Boolean.valueOf(z));
        }
    }

    public final void j(String str) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 60250) {
            dtub.w("cms_correlation_id", intValue2);
        }
        if (intValue >= 60250) {
            dtub.u(this.a, "cms_correlation_id", str);
        }
    }

    public final void k(String str) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 32000) {
            dtub.w("cms_id", intValue2);
        }
        if (intValue >= 32000) {
            dtub.u(this.a, "cms_id", str);
        }
    }

    public final void l(csgg csggVar) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
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

    public final void m() {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 10007) {
            dtub.w("conv_type", intValue2);
        }
        if (intValue >= 10007) {
            this.a.put("conv_type", (Integer) 2);
        }
    }

    public final void n(String str) {
        dtub.u(this.a, "current_self_id", str);
    }

    public final void o(long j) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 29020) {
            dtub.w("delete_timestamp", intValue2);
        }
        if (intValue >= 29020) {
            this.a.put("delete_timestamp", Long.valueOf(j));
        }
    }

    public final void p(azcr azcrVar) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 60360) {
            dtub.w("destination_token", intValue2);
        }
        if (intValue >= 60360) {
            if (azcrVar == null || azcrVar.equals(null)) {
                this.a.putNull("destination_token");
            } else {
                this.a.put("destination_token", azcs.b(azcrVar));
            }
        }
    }

    public final void q(int i) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 29060) {
            dtub.w("etouffee_default", intValue2);
        }
        if (intValue >= 29060) {
            this.a.put("etouffee_default", Integer.valueOf(i));
        }
    }

    public final void r(String str) {
        dtub.u(this.a, "draft_preview_content_type", str);
    }

    public final void s(Uri uri) {
        if (uri == null) {
            this.a.putNull("draft_preview_uri");
        } else {
            this.a.put("draft_preview_uri", uri.toString());
        }
    }

    public final void t() {
        this.a.putNull("draft_preview_uri");
    }

    public final void u(String str) {
        dtub.u(this.a, "draft_snippet_text", cuxs.a(str));
    }

    public final void v(String str) {
        dtub.u(this.a, "draft_subject_text", cuxs.a(str));
    }

    public final void w(cfmh cfmhVar) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 60180) {
            dtub.w("encryption_protocol", intValue2);
        }
        if (intValue >= 60180) {
            if (cfmhVar == null) {
                this.a.putNull("encryption_protocol");
            } else {
                this.a.put("encryption_protocol", Long.valueOf(cfmg.a(cfmhVar)));
            }
        }
    }

    public final void x(ayhd ayhdVar) {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 58140) {
            dtub.w("error_state", intValue2);
        }
        if (intValue >= 58140) {
            if (ayhdVar == null) {
                this.a.putNull("error_state");
            } else {
                this.a.put("error_state", Integer.valueOf(ayhdVar.a()));
            }
        }
    }

    public final void y() {
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 59210) {
            dtub.w("has_been_e2ee", intValue2);
        }
        if (intValue >= 59210) {
            this.a.put("has_been_e2ee", (Boolean) true);
        }
    }

    public final void z(String str) {
        dtub.u(this.a, "icon", str);
    }
}
