package defpackage;

import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.ui.gaia.verification.GaiaPairingVerificationActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbvq {
    public final ayfg a;
    public final ffbr b;
    public final ffbr c;

    public dbvq(ayfg ayfgVar, ffbr ffbrVar, ffbr ffbrVar2) {
        ayfgVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.a = ayfgVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    public final void a(Context context, int i) {
        Intent a = akuv.c(context, GaiaPairingVerificationActivity.class, "android.intent.action.VIEW").a();
        a.getClass();
        a.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        a.putExtra("prompt_launch_source", i);
        eldl.p(context, a);
        ((akzt) this.b.b()).e("Bugle.Gaia.Verification.Prompt.Launched", 2);
    }
}
