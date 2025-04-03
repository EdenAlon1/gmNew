package defpackage;

import android.telephony.TelephonyManager;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctww extends cnq {
    final /* synthetic */ ctwx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctww(ctwx ctwxVar) {
        super(Alert.DURATION_SHOW_INDEFINITELY);
        this.c = ctwxVar;
    }

    @Override // defpackage.cnq
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        TelephonyManager createForSubscriptionId;
        Integer num = (Integer) obj;
        createForSubscriptionId = this.c.b().createForSubscriptionId(num.intValue());
        if (createForSubscriptionId != null) {
            csjb c = ctwx.a.c();
            c.I("Returning per-subscription TelephonyManager (>= N)");
            c.m(num.intValue());
            c.r();
            return createForSubscriptionId;
        }
        csjb c2 = ctwx.a.c();
        c2.I("Returning default TelephonyManager (>= N)");
        c2.m(num.intValue());
        c2.r();
        return this.c.b();
    }
}
