package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_MessagingResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eibw {
    public abstract MessagingResult a();

    public abstract void b(int i);

    public abstract void c(int i);

    public abstract void d(Duration duration);

    public final MessagingResult e() {
        MessagingResult a = a();
        AutoValue_MessagingResult autoValue_MessagingResult = (AutoValue_MessagingResult) a;
        int i = autoValue_MessagingResult.a;
        if (i != 0 && i != 1) {
            return a;
        }
        emxf.m(autoValue_MessagingResult.b == 0, "ErrorCause should be UNKNOWN");
        emxf.m(autoValue_MessagingResult.c.isZero(), "retryAfter should be 0");
        return a;
    }
}
