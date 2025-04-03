package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.ui.ditto.DittoActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwpn extends cwpq {
    public cwpn(cqoh cqohVar, crqw crqwVar, ddzb ddzbVar, sfy sfyVar, Optional optional, cpdm cpdmVar, ctwb ctwbVar, clzh clzhVar, ffbr ffbrVar) {
        super(cqohVar, crqwVar, ddzbVar, sfyVar, optional, cpdmVar, ctwbVar, clzhVar, ffbrVar);
    }

    @Override // defpackage.cwpq, defpackage.akvg
    public final void I(Context context) {
        eldl.p(context, new Intent(context, (Class<?>) DittoActivity.class));
    }

    @Override // defpackage.cwpq, defpackage.akvg
    public final void J(Context context, eisx eisxVar) {
        Intent intent;
        if (adhu.b()) {
            intent = akuv.c(context, DittoActivity.class, "android.intent.action.VIEW").a();
            eiuy.c(intent, eisxVar);
        } else {
            intent = new Intent(context, (Class<?>) DittoActivity.class);
        }
        eldl.p(context, intent);
    }
}
