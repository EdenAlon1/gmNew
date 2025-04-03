package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvax {
    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 200) {
            return BasePaymentResult.ERROR_REQUEST_TIMEOUT;
        }
        if (i == 400) {
            return 401;
        }
        if (i != 404) {
            return i != 500 ? 0 : 501;
        }
        return 405;
    }
}
