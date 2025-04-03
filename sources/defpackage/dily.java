package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dily {
    RECV_ONLY("recvonly"),
    SEND_ONLY("sendonly"),
    SEND_RECEIVE("sendrecv"),
    INACTIVE("inactive"),
    NONE("none");

    public final String f;

    dily(String str) {
        this.f = str;
    }

    public static dily a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase(Locale.US);
            for (dily dilyVar : values()) {
                if (dilyVar.f.equals(lowerCase)) {
                    return dilyVar;
                }
            }
        }
        return NONE;
    }
}
