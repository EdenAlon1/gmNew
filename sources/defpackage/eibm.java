package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class eibm {
    public abstract eibk a();

    public abstract eica b();

    public abstract engw c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract String f();

    public final String toString() {
        return String.format("Message {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", f()), String.format("sender=%s", dktx.PHONE_NUMBER.c(b())), String.format("contents=%s", dktx.MESSAGE_CONTENT.c(a())), String.format("sentTime=%s", e()), String.format("receiver=%s", dktx.PHONE_NUMBER.c(d())), String.format("extensionHeaders=%s", c()))));
    }
}
