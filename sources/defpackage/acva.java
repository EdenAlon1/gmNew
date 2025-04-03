package defpackage;

import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.dittosatellite.impl.DittoWebActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acva implements acus {
    private static final cskc a = cskc.g("Bugle", "SendFeedbackLogsHandler");
    private final Context b;

    public acva(Context context) {
        this.b = context;
    }

    @Override // defpackage.acus
    public final elfl a(esnk esnkVar, esnl esnlVar) {
        a.p("Received SendFeedbackLogs request from Ditto");
        esmf esmfVar = (esnkVar.b == 108 ? (esmj) esnkVar.c : esmj.a).b;
        if (esmfVar == null) {
            esmfVar = esmf.a;
        }
        Intent a2 = akuv.c(this.b, DittoWebActivity.class, "android.intent.action.VIEW").a();
        a2.putExtra("SatelliteDittoLog", esmfVar.b);
        a2.putExtra("SatelliteDittoServerVersion", esmfVar.c);
        a2.putExtra("SatellitePairedBugleVersion", esmfVar.d);
        a2.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        eldl.p(this.b, a2);
        eyex eyexVar = eyex.a;
        esnlVar.copyOnWrite();
        esnn esnnVar = (esnn) esnlVar.instance;
        esnn esnnVar2 = esnn.a;
        eyexVar.getClass();
        esnnVar.c = eyexVar;
        esnnVar.b = 108;
        return elfo.e(esnlVar.build());
    }
}
