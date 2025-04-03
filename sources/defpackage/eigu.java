package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.android.rcs.client.messaging.data.TraceId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eigu {
    public abstract MessageNotification a();

    public abstract void b(Conversation conversation);

    public abstract void c(Instant instant);

    public abstract void d(Message message);

    public abstract void e(TraceId traceId);
}
