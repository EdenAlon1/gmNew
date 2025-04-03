package defpackage;

import android.os.Bundle;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dits {
    public static void a(String str, long j, Bundle bundle) {
        bundle.putString(RcsIntents.EXTRA_PHONE_NUMBER, str);
        bundle.putLong(RcsIntents.EXTRA_CONTACT_ID, j);
        bundle.putBoolean(RcsIntents.EXTRA_IS_BLOCKED_USER, false);
    }
}
