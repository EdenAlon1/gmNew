package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avhd {
    public final int a;
    public final Optional b;
    public long c;
    private String d;

    public avhd(int i) {
        this.b = Optional.empty();
        emxf.a(i != 200);
        this.a = i;
    }

    public final String a() {
        int i = this.a;
        if (i != 200) {
            throw new IllegalStateException(a.h(i, "Cannot get response string for non-200_OK statuses. Status: "));
        }
        if (TextUtils.isEmpty(this.d)) {
            throw new IllegalStateException("Response string is empty!");
        }
        return this.d;
    }

    public avhd(Optional optional, long j) {
        Optional.empty();
        this.a = 304;
        this.b = optional;
        this.c = j;
    }

    public avhd(String str, Optional optional, long j) {
        Optional.empty();
        this.a = BasePaymentResult.ERROR_REQUEST_FAILED;
        this.d = str;
        this.b = optional;
        this.c = j;
    }
}
