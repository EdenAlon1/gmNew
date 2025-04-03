package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.ims.provisioning.config.Configuration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkdy implements dkdw {
    private final Context a;
    private final evkn b;

    public dkdy(Context context, evkn evknVar) {
        this.a = context;
        this.b = evknVar;
    }

    private final SharedPreferences O() {
        return this.a.getSharedPreferences("provisioning_engine_state_cache_common.pref", 0);
    }

    @Override // defpackage.dkdw
    public final void A(String str, String str2) {
        N(str).edit().putString("provisioning_engine_provisioning_session_id_key", str2).commit();
    }

    @Override // defpackage.dkdw
    public final void B(String str, String str2) {
        N(str).edit().putString("provisioning_engine_state_key", str2).commit();
    }

    @Override // defpackage.dkdw
    public final void C(String str, Instant instant) {
        N(str).edit().putLong("retry_time", instant.getEpochSecond()).commit();
    }

    @Override // defpackage.dkdw
    public final void D(String str, esgg esggVar) {
        N(str).edit().putInt("provisioning_engine_upi_eligibility_key", esggVar.a()).commit();
    }

    @Override // defpackage.dkdw
    public final void E(String str, boolean z) {
        N(str).edit().putBoolean("work_manager_retry", z).commit();
    }

    @Override // defpackage.dkdw
    public final boolean F() {
        return O().getBoolean("provisioning_engine_bugle_enabled_rcs_from_preference_key", false);
    }

    @Override // defpackage.dkdw
    @Deprecated
    public final boolean G() {
        return O().getBoolean("provisioning_engine_carrier_consent_key", false);
    }

    @Override // defpackage.dkdw
    @Deprecated
    public final boolean H() {
        return O().getBoolean("provisioning_engine_google_tos_consent_key", false);
    }

    @Override // defpackage.dkdw
    public final boolean I(String str) {
        return N(str).getBoolean("provisioning_engine_finished_provisioning_attempt_key", false);
    }

    @Override // defpackage.dkdw
    public final boolean J(String str) {
        return N(str).getBoolean("provisioning_engine_has_provisioned_once_key_v2", false);
    }

    @Override // defpackage.dkdw
    public final boolean K(String str) {
        return N(str).getBoolean("work_manager_retry", false);
    }

    @Override // defpackage.dkdw
    @Deprecated
    public final void L() {
        O().edit().putBoolean("provisioning_engine_carrier_consent_key", true).commit();
    }

    @Override // defpackage.dkdw
    public final void M(String str) {
        N(str).edit().putBoolean("provisioning_engine_has_provisioned_once_key_v2", true).commit();
    }

    public final SharedPreferences N(String str) {
        return this.a.getSharedPreferences(String.format("provisioning_engine_state_cache_%s.pref", str), 0);
    }

    @Override // defpackage.dkdw
    public final int a(String str) {
        return N(str).getInt("provisioning_engine_replay_count_key", 0);
    }

    @Override // defpackage.dkdw
    public final int b(String str) {
        return N(str).getInt("provisioning_engine_retry_count_key", 0);
    }

    @Override // defpackage.dkdw
    public final long c(String str) {
        return N(str).getLong("provisioning_engine_next_retry_time_key", 0L);
    }

    @Override // defpackage.dkdw
    public final long d(String str) {
        return N(str).getLong("provisioning_engine_otp_sms_timeout_key", -1L);
    }

    @Override // defpackage.dkdw
    @Deprecated
    public final djtp e(String str) {
        return (djtp) g(str).orElseGet(new Supplier() { // from class: dkdx
            @Override // java.util.function.Supplier
            public final Object get() {
                return new Configuration();
            }
        });
    }

    @Override // defpackage.dkdw
    public final esgg f(String str) {
        int i = N(str).getInt("provisioning_engine_upi_eligibility_key", esgg.UPI_ELIGIBILITY_UNSPECIFIED.a());
        esgg esggVar = i != 0 ? i != 1 ? i != 2 ? null : esgg.INELIGIBLE : esgg.ELIGIBLE : esgg.UPI_ELIGIBILITY_UNSPECIFIED;
        return esggVar != null ? esggVar : esgg.UPI_ELIGIBILITY_UNSPECIFIED;
    }

    @Override // defpackage.dkdw
    @Deprecated
    public final Optional g(String str) {
        djtp djtpVar = null;
        String string = N(str).getString("provisioning_engine_rcs_configuration", null);
        if (string != null && !string.equals("null")) {
            try {
                djtpVar = (djtp) this.b.i(string, Configuration.class);
            } catch (evlb e) {
                dkty.i(e, "Failed to parse json.", new Object[0]);
            }
        }
        return Optional.ofNullable(djtpVar);
    }

    @Override // defpackage.dkdw
    public final Optional h(String str) {
        long j = N(str).getLong("retry_time", -1L);
        return j == -1 ? Optional.empty() : Optional.of(Instant.ofEpochSecond(j));
    }

    @Override // defpackage.dkdw
    public final String i(String str) {
        return N(str).getString("provisioning_engine_provisioning_session_id_key", null);
    }

    @Override // defpackage.dkdw
    public final String j(String str) {
        return N(str).getString("provisioning_engine_msisdn_key", null);
    }

    @Override // defpackage.dkdw
    public final String k(String str) {
        if (!I(str)) {
            return N(str).getString("provisioning_engine_provisioning_session_id_key", null);
        }
        dkty.c("Already finished a provisioning attempt so no session ID available.", new Object[0]);
        return null;
    }

    @Override // defpackage.dkdw
    public final String l(String str) {
        return N(str).getString("provisioning_engine_state_key", null);
    }

    @Override // defpackage.dkdw
    public final List m(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = N(str).getStringSet("provisioning_engine_cookies_key", enpd.a).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((djte) this.b.i(it.next(), djte.class));
            } catch (evlb e) {
                dkty.i(e, "Failed to unmarshal SerializableHttpCookie. Excluding from cookie set.", new Object[0]);
            }
        }
        return arrayList;
    }

    @Override // defpackage.dkdw
    public final void n(String str) {
        N(str).edit().putInt("provisioning_engine_replay_count_key", 0).commit();
    }

    @Override // defpackage.dkdw
    public final void o(String str) {
        N(str).edit().putLong("retry_time", -1L).commit();
    }

    @Override // defpackage.dkdw
    public final void p(String str) {
        N(str).edit().putInt("provisioning_engine_retry_count_key", 0).commit();
    }

    @Override // defpackage.dkdw
    public final void q(String str) {
        N(str).edit().putInt("provisioning_engine_replay_count_key", a(str) + 1).commit();
    }

    @Override // defpackage.dkdw
    public final void r(String str) {
        N(str).edit().putInt("provisioning_engine_retry_count_key", b(str) + 1).commit();
    }

    @Override // defpackage.dkdw
    public final void s(String str, List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(this.b.k((djte) it.next()));
        }
        N(str).edit().putStringSet("provisioning_engine_cookies_key", hashSet).commit();
    }

    @Override // defpackage.dkdw
    @Deprecated
    public final void t(boolean z) {
        O().edit().putBoolean("provisioning_engine_google_tos_consent_key", z).commit();
    }

    @Override // defpackage.dkdw
    public final void u(String str, boolean z) {
        N(str).edit().putBoolean("provisioning_engine_finished_provisioning_attempt_key", z).commit();
    }

    @Override // defpackage.dkdw
    public final void v(String str, String str2) {
        N(str).edit().putString("provisioning_engine_msisdn_key", str2).commit();
    }

    @Override // defpackage.dkdw
    public final void w(String str, long j) {
        N(str).edit().putLong("provisioning_engine_next_retry_time_key", j).commit();
    }

    @Override // defpackage.dkdw
    public final void x(String str, String str2) {
        N(str).edit().putString("provisioning_engine_otp_key", str2).commit();
    }

    @Override // defpackage.dkdw
    public final void y(String str, long j) {
        N(str).edit().putLong("provisioning_engine_otp_sms_timeout_key", j).commit();
    }

    @Override // defpackage.dkdw
    @Deprecated
    public final void z(String str, djtp djtpVar) {
        N(str).edit().putString("provisioning_engine_rcs_configuration", this.b.k(djtpVar)).commit();
    }
}
