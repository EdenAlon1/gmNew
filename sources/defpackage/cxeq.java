package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.SimMessagesActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxeq extends cxer {
    public final SimMessagesActivity a;
    public final ffbr b;
    public final ffbr c;
    public abo d;

    public cxeq(SimMessagesActivity simMessagesActivity, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = simMessagesActivity;
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    public static void a(cwpv cwpvVar) {
        cwpvVar.X();
        im k = cwpvVar.k();
        if (k != null) {
            k.setDisplayOptions(12);
            cwpw.c(cwpvVar, k, R.string.sim_storage_pref_title);
            k.setHomeActionContentDescription(cwpvVar.getResources().getString(R.string.navigate_up_button_content_description));
        }
    }
}
