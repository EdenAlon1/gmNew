package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fany {
    public static int a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = BasePaymentResult.ERROR_REQUEST_FAILED;
                        if (i != 200) {
                            switch (i) {
                                case VCardConstants.DEFAULT_PREF /* 100 */:
                                    return 100;
                                case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                                    return EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                                case 102:
                                    return 102;
                                case 103:
                                    return 103;
                                case 104:
                                    return 104;
                                default:
                                    return 0;
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }
}
