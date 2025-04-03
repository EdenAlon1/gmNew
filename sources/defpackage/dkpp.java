package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class dkpp {
    private static final enru r = enru.c("com/google/android/ims/receiver/sim/SimPreferences");
    public final devc a;
    public final deva b;
    public final deva c;
    public final deva d;
    public final deva e;
    public final deva f;
    public final deva g;
    public final deva h;
    public final deva i;
    public final deva j;
    public final deva k;
    public final deva l;
    public final deva m;
    public final deva n;
    public final deva o;
    public final deva p;
    public final deva q;

    @Deprecated
    public dkpp() {
        devc devcVar = new devc("sim_state_tracker");
        this.a = devcVar;
        this.b = new deuw(devcVar, "sim_id", "");
        this.c = new deuw(devcVar, "sim_serial_number", "");
        this.d = new deuw(devcVar, "imsi", "");
        this.e = new deuw(devcVar, "raw_msisdn", "");
        this.f = new deuw(devcVar, "formatted_msisdn", "");
        this.g = new deuw(devcVar, "sim_operator", "");
        this.h = new deuw(devcVar, "sim_operator_name", "");
        this.i = new deuw(devcVar, "network_operator_name", "");
        this.j = new deux(devcVar, "is_fi_device", false);
        this.k = new deuy(devcVar, "sub_id", -1);
        this.l = new deuy(devcVar, "slot_index", -1);
        this.m = new deuw(devcVar, "group_id_level1", "");
        this.n = new deuw(devcVar, "default_sim_subscription_info", "");
        this.o = new deuw(devcVar, "default_sms_sim_subscription_info", "");
        this.p = new deuw(devcVar, "default_data_sim_subscription_info", "");
        this.q = new deuz(devcVar, enpd.a);
    }

    public static final cosz u(String str) {
        if (emxe.c(str)) {
            return null;
        }
        try {
            return (cosz) eyfy.parseFrom(cosz.a, Base64.decode(str, 0), eyfc.a());
        } catch (eygu unused) {
            return null;
        } catch (IllegalArgumentException e) {
            ((enrr) ((enrr) ((enrr) r.j()).g(e)).h("com/google/android/ims/receiver/sim/SimPreferences", "deserializeSimSubscriptionInfo", (char) 586, "SimPreferences.java")).q("Failed to deserialize SimSubscriptionInfo.");
            return null;
        }
    }

    public static final String v(cosz coszVar) {
        return coszVar == null ? "" : Base64.encodeToString(coszVar.toByteArray(), 0);
    }

    @Deprecated
    public final int a() {
        cosz d = d();
        return d == null ? ((Integer) this.l.d()).intValue() : d.e;
    }

    @Deprecated
    public final int b() {
        cosz d = d();
        return d == null ? ((Integer) this.k.d()).intValue() : d.d;
    }

    public final cosz c() {
        return u((String) this.p.d());
    }

    public final cosz d() {
        return u((String) this.n.d());
    }

    public final cosz e() {
        return u((String) this.o.d());
    }

    public final cosz f(String str) {
        return u(o("sim_subscription_info_sim_id_".concat(String.valueOf(str))));
    }

    public final djro g() {
        return new djro((String) this.b.d());
    }

    @Deprecated
    public final String h() {
        cosz d = d();
        return d == null ? (String) this.f.d() : d.q;
    }

    @Deprecated
    public final String i() {
        cosz d = d();
        return d == null ? (String) this.m.d() : d.t;
    }

    @Deprecated
    public final String j() {
        cosz d = d();
        return d == null ? (String) this.d.d() : d.f;
    }

    @Deprecated
    public final String k() {
        cosz d = d();
        return d == null ? (String) this.e.d() : d.g;
    }

    @Deprecated
    public final String l() {
        ekzz f = eleg.f("SimPreferences::getSimId");
        try {
            cosz d = d();
            String str = d == null ? (String) this.b.d() : d.c;
            f.close();
            return str;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public final String m() {
        cosz d = d();
        return d == null ? (String) this.g.d() : d.s;
    }

    @Deprecated
    public final String n() {
        cosz d = d();
        return d == null ? (String) this.h.d() : d.r;
    }

    @Deprecated
    public final String o(String str) {
        return (String) new deuw(this.a, str, "").d();
    }

    @Deprecated
    public final void p(String str) {
        devc devcVar = this.a;
        deve[] deveVarArr = {new deuw(devcVar, str, "")};
        SharedPreferences.Editor edit = devcVar.a().edit();
        edit.remove(deveVarArr[0].a());
        devc.b(edit);
    }

    public final void q(Set set) {
        this.q.e(set);
    }

    public final void r(cosz coszVar) {
        String v = v(coszVar);
        s("sim_subscription_info_sim_id_".concat(String.valueOf(coszVar.c)), v);
        s("sim_subscription_info_sub_id_" + coszVar.d, v);
    }

    @Deprecated
    public final void s(String str, String str2) {
        new deuw(this.a, str, "").e(str2);
    }

    @Deprecated
    public final boolean t() {
        cosz d = d();
        return d == null ? ((Boolean) this.j.d()).booleanValue() : d.o;
    }

    public dkpp(ffbr ffbrVar) {
        devc devcVar = new devc("sim_state_tracker");
        this.a = devcVar;
        this.b = new deuw(devcVar, "sim_id", "");
        this.c = new deuw(devcVar, "sim_serial_number", "");
        this.d = new deuw(devcVar, "imsi", "");
        this.e = new deuw(devcVar, "raw_msisdn", "");
        this.f = new deuw(devcVar, "formatted_msisdn", "");
        this.g = new deuw(devcVar, "sim_operator", "");
        this.h = new deuw(devcVar, "sim_operator_name", "");
        this.i = new deuw(devcVar, "network_operator_name", "");
        this.j = new deux(devcVar, "is_fi_device", false);
        this.k = new deuy(devcVar, "sub_id", -1);
        this.l = new deuy(devcVar, "slot_index", -1);
        this.m = new deuw(devcVar, "group_id_level1", "");
        this.n = new deuw(devcVar, "default_sim_subscription_info", "");
        this.o = new deuw(devcVar, "default_sms_sim_subscription_info", "");
        this.p = new deuw(devcVar, "default_data_sim_subscription_info", "");
        this.q = new deuz(devcVar, enpd.a);
        ffbrVar.b();
    }
}
