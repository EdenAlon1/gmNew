package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.ims.provisioning.config.Configuration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dksa extends dksc {
    public dksa(Context context, dijv dijvVar) {
        super(context, context.getContentResolver(), cbhj.a, dijvVar);
    }

    public static final String d(String str, ezck ezckVar) {
        return g("phone_number_record_by_sim_and_msisdn_source_", str + "_" + ezckVar.d);
    }

    public final djtp a(String str) {
        String h = h("provisioning_engine_rcs_configuration_".concat(String.valueOf(str)), "", "bugle");
        try {
            try {
                return (djtp) new evkn().i(emxe.b(h), Configuration.class);
            } catch (Throwable th) {
                dkty.i(th, "Error while parsing RCS Configuration from JSON", new Object[0]);
                return null;
            }
        } catch (Exception e) {
            dkty.i(e, "Error while creating Gson object", new Object[0]);
            return null;
        }
    }

    public final String b(String str) {
        return h("rcs_user_id_".concat(String.valueOf(str)), str, "bugle");
    }

    public final UUID c() {
        try {
            return UUID.fromString(h("rcs_provisioning_rcs_default_on_server_update_time_key", "", "bugle"));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final void e(String str) {
        Bundle l = dksc.l("is_fi_device_".concat(str), "bugle");
        l.putBoolean("preference_value", true);
        super.f("PUT", "BOOLEAN", l);
    }
}
