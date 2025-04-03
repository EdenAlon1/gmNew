package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doyf {
    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 200) {
            return 0;
        }
        return BasePaymentResult.ERROR_REQUEST_TIMEOUT;
    }
}
