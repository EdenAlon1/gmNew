package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class edzg implements edzh {
    public static eepm e(Uri uri) {
        return eepm.a(true != uri.toString().startsWith(Telephony.Mms.CONTENT_URI.toString()) ? "com.google.android.apps.messaging" : "com.android.providers.telephony");
    }

    public abstract long a();

    public abstract Context b();

    public abstract Uri c();

    @Override // defpackage.edzh
    public final InputStream d() {
        return eepn.b(b(), c(), e(c()));
    }

    @Override // defpackage.edzh
    public final long j() {
        return a();
    }
}
