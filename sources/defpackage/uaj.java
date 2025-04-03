package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uaj {
    public final ffbr a;
    private final csjk b;
    private final ea c;
    private final entd d;

    public uaj(csjk csjkVar, ffbr ffbrVar, ea eaVar) {
        csjkVar.getClass();
        ffbrVar.getClass();
        this.b = csjkVar;
        this.a = ffbrVar;
        this.c = eaVar;
        this.d = entd.c("BugleConversation");
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Intent intent = new Intent((String) it.next());
            intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            try {
                this.c.aD(intent);
                return;
            } catch (ActivityNotFoundException unused) {
            }
        }
        ((ensz) this.d.j()).q("Failed to find settings activity to start for connectivity.");
    }

    public final void b(int i) {
        ellj.f(new cvms(this.c.B().getString(i), this.c.B().getString(R.string.data_required_snackbar_action), new Runnable() { // from class: uai
            @Override // java.lang.Runnable
            public final void run() {
                uaj.this.a(ffdx.g("android.settings.WIRELESS_SETTINGS", "android.settings.WIFI_SETTINGS", "android.settings.SETTINGS"));
            }
        }), this.c);
    }

    public final boolean c(boolean z) {
        return z && ((csmz) this.b.a()).f() == csod.UNAVAILABLE;
    }
}
