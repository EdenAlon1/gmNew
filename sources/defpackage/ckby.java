package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckby {
    private final Context a;
    private final ffbr b;
    private final ckcg c;

    public ckby(Context context, ffbr ffbrVar, ckcg ckcgVar) {
        context.getClass();
        this.a = context;
        this.b = ffbrVar;
        this.c = ckcgVar;
    }

    @ffbs
    public final int a(ckcf ckcfVar) {
        ckcfVar.getClass();
        ((enrr) ckcg.a.e().h("com/google/android/apps/messaging/shared/rcs/RcsSubIdFromPreferencesLogger", "logRcsSubIdFromPreferencesCaller", 15, "RcsSubIdFromPreferencesLogger.kt")).t("Called getRcsSubId() from %s", ckcfVar);
        this.c.b.e("Bugle.Rcs.Shared.RcsPreferences.GetRcsSubIdCaller.Counts", ckcfVar.y);
        return ((ctyx) this.b.b()).d("rcs_sub_id", -2);
    }

    public final String b() {
        String string = this.a.getResources().getString(R.string.unknown_business_name);
        string.getClass();
        return string;
    }

    public final boolean c() {
        ffbr ffbrVar = this.b;
        Resources resources = this.a.getResources();
        return ((ctyx) ffbrVar.b()).q(resources.getString(R.string.rcs_mobile_auto_download_in_roaming_pref_key), resources.getBoolean(R.bool.enable_rcs_mobile_auto_download_in_roaming_default));
    }

    public final boolean d() {
        ffbr ffbrVar = this.b;
        Resources resources = this.a.getResources();
        return ((ctyx) ffbrVar.b()).q(resources.getString(R.string.enable_rcs_pref_key), resources.getBoolean(R.bool.enable_rcs_pref_default));
    }
}
