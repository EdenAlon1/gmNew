package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class faoi {
    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 100) {
            return EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        }
        if (i != 200) {
            return 0;
        }
        return BasePaymentResult.ERROR_REQUEST_TIMEOUT;
    }
}
