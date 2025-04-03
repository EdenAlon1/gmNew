package defpackage;

import android.text.TextUtils;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eifn {
    public abstract eifm a();

    public abstract RcsDestinationId b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract String f();

    public final String toString() {
        return String.format("FileMessage {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", f()), String.format("sender=%s", dktx.PHONE_NUMBER.c(b())), String.format("receiver=%s", dktx.PHONE_NUMBER.c(d())), String.format("contents=%s", a()), String.format("sentTime=%s", e()), String.format("dispositionNotifications=%s", c()))));
    }
}
