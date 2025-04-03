package defpackage;

import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eigi {
    public abstract Message a();

    public abstract engr b();

    public abstract void c(engw engwVar);

    public abstract void d(enip enipVar);

    public abstract void e(engw engwVar);

    public abstract void f(String str);

    public abstract void g(boolean z);

    public abstract void h(RcsDestinationId rcsDestinationId);

    public abstract void i(RcsDestinationId rcsDestinationId);

    public abstract void j(Instant instant);

    public final void k(Message.MessageContent messageContent) {
        b().h(messageContent);
    }
}
