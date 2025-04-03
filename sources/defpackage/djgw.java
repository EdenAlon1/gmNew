package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class djgw {
    public static djgv f() {
        djgl djglVar = new djgl();
        djglVar.a = BasePaymentResult.ERROR_REQUEST_FAILED;
        djglVar.c = (byte) 1;
        djglVar.b = "OK";
        return djglVar;
    }

    @Deprecated
    public abstract int a();

    @Deprecated
    public abstract Optional b();

    public abstract Optional c();

    public abstract Optional d();

    @Deprecated
    public abstract String e();
}
