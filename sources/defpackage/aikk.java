package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.google.android.apps.messaging.navigation.targets.DirectSendResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aikk {
    public static final DirectSendResult a(Intent intent) {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        if (Build.VERSION.SDK_INT > 33) {
            parcelableExtra2 = intent.getParcelableExtra("direct_send_result", DirectSendResult.class);
            parcelableExtra = (Parcelable) parcelableExtra2;
        } else {
            parcelableExtra = intent.getParcelableExtra("direct_send_result");
        }
        return (DirectSendResult) parcelableExtra;
    }
}
