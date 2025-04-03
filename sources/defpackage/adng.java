package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adng {
    public static final cskc a = cskc.g("Lighter", "LighterExpressSignInDelegate");

    public final void a(Activity activity, int i, int i2) {
        ehft ehftVar = new ehft(activity);
        ehftVar.x(i);
        ehftVar.m(i2);
        ehftVar.t(R.string.lighter_esi_failure_dialog_common_acknowledge_button, null);
        ehftVar.create().show();
    }
}
