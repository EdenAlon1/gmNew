package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class eict {
    public abstract Optional a();

    public abstract Optional b();

    public final String toString() {
        return String.format("SubjectExtension {%s}", TextUtils.join(",", Arrays.asList(String.format("participant=%s", dktx.PHONE_NUMBER.c(a())), String.format("timestamp=%s", b()))));
    }
}
