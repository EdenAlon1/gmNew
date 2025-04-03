package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctyz {
    public final ctyx a;
    public final Resources b;
    public final ctzg c;
    public final errl d;
    private final cqoh e;

    public ctyz(ctyx ctyxVar, Context context, cqoh cqohVar, ctzg ctzgVar, errl errlVar) {
        this.a = ctyxVar;
        this.b = context.getResources();
        this.e = cqohVar;
        this.c = ctzgVar;
        this.d = errlVar;
    }

    public final long a() {
        return this.a.e(this.b.getString(R.string.link_preview_tombstone_first_shown_millis_pref_key), -1L);
    }

    public final String b() {
        String f = this.a.f("provisioning_session_id", "");
        if (!TextUtils.isEmpty(f)) {
            return f;
        }
        String uuid = UUID.randomUUID().toString();
        this.a.l("provisioning_session_id", uuid);
        return uuid;
    }

    public final void c() {
        this.a.g(this.b.getString(R.string.link_preview_enabled_pref_key), true);
        if (a() == -1) {
            e(this.e.f().toEpochMilli());
        }
        r();
    }

    public final void d(boolean z) {
        this.a.h("app_contains_verified_sms_data", z);
    }

    public final void e(long j) {
        this.a.k(this.b.getString(R.string.link_preview_tombstone_first_shown_millis_pref_key), j);
    }

    public final boolean f() {
        return this.b.getBoolean(R.bool.link_preview_enabled_pref_default);
    }

    public final boolean g() {
        Resources resources = this.b;
        return this.a.q(resources.getString(R.string.rich_cards_settings_enable_all_pref_key), resources.getBoolean(R.bool.rich_cards_settings_enable_all_pref_default));
    }

    public final boolean h() {
        Resources resources = this.b;
        return this.a.q(resources.getString(R.string.assistant_enabled_pref_key), resources.getBoolean(R.bool.assistant_enabled_pref_default));
    }

    public final boolean i() {
        return j(f());
    }

    public final boolean j(boolean z) {
        return this.a.q(this.b.getString(R.string.link_preview_enabled_pref_key), z);
    }

    public final boolean k() {
        if (!ctjd.c()) {
            return false;
        }
        ctyx ctyxVar = this.a;
        Resources resources = this.b;
        return ctyxVar.q(resources.getString(R.string.mc_enabled_pref_key), resources.getBoolean(R.bool.mc_enabled_pref_default));
    }

    public final boolean l() {
        Resources resources = this.b;
        return this.a.q(resources.getString(R.string.link_preview_wifi_only_pref_key), resources.getBoolean(R.bool.link_preview_wifi_only_pref_default));
    }

    public final boolean m() {
        Resources resources = this.b;
        return this.a.q(resources.getString(R.string.share_typing_status_rcs_pref_key), resources.getBoolean(R.bool.share_typing_status_rcs_pref_default));
    }

    public final boolean n() {
        Resources resources = this.b;
        return this.a.q(resources.getString(R.string.smart_actions_enabled_pref_key), resources.getBoolean(R.bool.smart_actions_enabled_pref_default));
    }

    public final boolean o() {
        Resources resources = this.b;
        return this.a.q(resources.getString(R.string.p2p_conversation_suggestions_enabled_pref_key), resources.getBoolean(R.bool.p2p_conversation_suggestions_enabled_pref_default));
    }

    @Deprecated
    public final boolean p() {
        return this.c.a("spam_protection_feature_consent").a();
    }

    public final boolean q() {
        if (!((Boolean) ctjd.q.e()).booleanValue()) {
            return o();
        }
        ctyx ctyxVar = this.a;
        Resources resources = this.b;
        return ctyxVar.q(resources.getString(R.string.suggested_stickers_enabled_pref_key), resources.getBoolean(R.bool.suggested_stickers_enabled_pref_default));
    }

    public final void r() {
        this.a.h(this.b.getString(R.string.link_preview_tombstone_seen_pref_key), true);
    }

    public final int s() {
        int a = eovg.a(this.a.d("rcs_onboarding_progress", 0));
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final int t() {
        int a = eovi.a(this.a.d("rcs_provisioning_status_pev2", 0));
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
