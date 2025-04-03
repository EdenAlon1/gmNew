package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class eica {
    public static eica c(String str) {
        if (str.startsWith("sip:")) {
            ehzf ehzfVar = new ehzf();
            ehzfVar.b(str);
            ehzfVar.c(2);
            return ehzfVar.a();
        }
        if (!str.startsWith("tel:")) {
            throw new IllegalArgumentException("URI format not supported");
        }
        ehzf ehzfVar2 = new ehzf();
        ehzfVar2.b(str.substring(4));
        ehzfVar2.c(1);
        return ehzfVar2.a();
    }

    public abstract String a();

    public abstract int b();

    public final String toString() {
        return String.format("RcsDestinationId {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", dktx.PHONE_NUMBER.c(a())), String.format("type=%s", b() != 1 ? "SIP_URI" : "PHONE"))));
    }
}
