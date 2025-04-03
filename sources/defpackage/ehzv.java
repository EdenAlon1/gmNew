package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class ehzv {
    public abstract ehzx a();

    public abstract eyee b();

    public final String toString() {
        return String.format("ChatMessage {%s}", TextUtils.join(",", Arrays.asList(String.format("content=%s", dktx.MESSAGE_CONTENT.c(b())), String.format("contentType=%s", a()))));
    }
}
