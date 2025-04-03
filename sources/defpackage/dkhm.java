package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dkhm {
    GONE(410, "Gone"),
    DISCONNECT(480, "Bearer temporarily unavailable"),
    LEAVE(BasePaymentResult.ERROR_REQUEST_FAILED, "Call completed"),
    LEAVE_INVOLUNTARILY(503, "Service Unavailable");

    public final int e;
    public final String f;

    dkhm(int i, String str) {
        this.e = i;
        this.f = str;
    }
}
