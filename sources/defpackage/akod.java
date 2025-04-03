package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.messaging.samsung.settings.CmcUserConsentSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akod implements ekob {
    public final Context a;
    private final ffbr b;
    private final entd c = entd.c("Bugle");

    public akod(Context context, ffbr ffbrVar) {
        this.a = context;
        this.b = ffbrVar;
    }

    @Override // defpackage.ekob
    public final eknz b(ekoa ekoaVar) {
        Intent intent = ekoaVar.a;
        if (intent == null) {
            ((ensz) ((ensz) this.c.j()).h("com/google/android/apps/messaging/samsung/settings/AndromedaSettingsGatewayHandler", "getRedirector", 45, "AndromedaSettingsGatewayHandler.java")).q("Null intent, unable to redirect to CMC user consent settings");
            return null;
        }
        ffbr ffbrVar = this.b;
        String stringExtra = intent.getStringExtra("EXTRA_ANDROMEDA_SETTINGS_CLASS_NAME");
        if (!((adaq) ffbrVar.b()).b()) {
            ((ensz) ((ensz) this.c.j()).h("com/google/android/apps/messaging/samsung/settings/AndromedaSettingsGatewayHandler", "getRedirector", 52, "AndromedaSettingsGatewayHandler.java")).q("Feature disabled, unable to redirect to CMC user consent settings");
            return null;
        }
        if (TextUtils.equals(stringExtra, CmcUserConsentSettingsActivity.class.getSimpleName())) {
            return new akoc(this);
        }
        ((ensz) ((ensz) this.c.j()).h("com/google/android/apps/messaging/samsung/settings/AndromedaSettingsGatewayHandler", "getRedirector", 56, "AndromedaSettingsGatewayHandler.java")).q("Invalid class name, unable to redirect to CMC user consent settings");
        return null;
    }
}
