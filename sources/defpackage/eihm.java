package defpackage;

import com.google.android.rcs.client.messaging.data.TraceId;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eihm {
    public abstract TraceId a();

    public abstract String b();

    public abstract void c(String str);

    public final TraceId d() {
        if (emxe.c(b())) {
            c(UUID.randomUUID().toString());
        }
        return a();
    }
}
