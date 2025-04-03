package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.android.vcard.VCardConfig;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aike implements aigt {
    private final Activity a;
    private final entd b = entd.c("BugleConversation");

    public aike(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        return b();
    }

    public final Object b() {
        Iterator it = ffdx.g("android.settings.WIRELESS_SETTINGS", "android.settings.WIFI_SETTINGS", "android.settings.SETTINGS").iterator();
        while (it.hasNext()) {
            Intent intent = new Intent((String) it.next());
            intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            try {
                this.a.startActivity(intent);
                return ffcu.a;
            } catch (ActivityNotFoundException unused) {
            }
        }
        ((ensz) this.b.j()).q("Failed to find settings activity to start for connectivity.");
        return ffcu.a;
    }
}
