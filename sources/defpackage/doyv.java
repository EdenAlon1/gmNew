package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doyv {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "SOURCE_NOT_SET";
        }
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                return "UNKNOWN_SOURCE";
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                return "EXTERNAL_SOURCE";
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                return "REMOTE_SOURCE";
            default:
                return "null";
        }
    }

    public static int b(int i) {
        if (i == 0) {
            return 1;
        }
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                return BasePaymentResult.ERROR_REQUEST_TIMEOUT;
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                return BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                return BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
            default:
                return 0;
        }
    }
}
