package defpackage;

import android.content.Context;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvex {
    private static final cskc a = cskc.g("Bugle", "VideoCalling");
    private final Context b;
    private final ffbr c;

    public cvex(Context context, ffbr ffbrVar) {
        this.b = context;
        this.c = ffbrVar;
    }

    final PhoneAccount a() {
        TelecomManager telecomManager = (TelecomManager) this.b.getSystemService(TelecomManager.class);
        if (telecomManager != null && ((ctud) this.c.b()).l()) {
            if (ctid.e && koa.c(this.b, "android.permission.READ_PHONE_NUMBERS") != 0) {
                a.r("getDefaultPhoneAccount returned null due to the API being 31+ and lacking the READ_PHONE_NUMBERS permission.");
                return null;
            }
            PhoneAccountHandle defaultOutgoingPhoneAccount = telecomManager.getDefaultOutgoingPhoneAccount("tel");
            if (defaultOutgoingPhoneAccount != null) {
                return telecomManager.getPhoneAccount(defaultOutgoingPhoneAccount);
            }
        }
        return null;
    }
}
